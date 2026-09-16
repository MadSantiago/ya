package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦۛۢؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5258 extends AbstractC2844 {

    /* JADX INFO: renamed from: ۥۗ */
    public final Map f17340;

    public C5258(AbstractC4489 abstractC4489, AbstractC4489 abstractC44810) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m8893(linkedHashMap, abstractC4489);
        m8893(linkedHashMap, abstractC44810);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((C2632) entry.getKey()).f8741) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f17340 = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m8893(LinkedHashMap linkedHashMap, AbstractC4489 abstractC4489) {
        for (int i = 0; i < abstractC4489.mo1150(); i++) {
            C2632 c2632Mo1149 = abstractC4489.mo1149(i);
            Object obj = linkedHashMap.get(c2632Mo1149);
            boolean z = c2632Mo1149.f8741;
            Class cls = c2632Mo1149.f8743;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c2632Mo1149, arrayList);
                }
                arrayList.add(cls.cast(abstractC4489.mo1145(i)));
            } else {
                linkedHashMap.put(c2632Mo1149, cls.cast(abstractC4489.mo1145(i)));
            }
        }
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥؗ */
    public final Set mo3074() {
        return this.f17340.keySet();
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo3075() {
        return this.f17340.size();
    }

    @Override // p000.AbstractC2844
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3076(C2441 c2441, C5408 c5408) {
        for (Map.Entry entry : this.f17340.entrySet()) {
            C2632 c2632 = (C2632) entry.getKey();
            Object value = entry.getValue();
            if (c2632.f8741) {
                c2441.m4556(c2632, ((List) value).iterator(), c5408);
            } else {
                c2441.m4557(c2632, value, c5408);
            }
        }
    }
}
