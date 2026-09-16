package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۥًؓؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0331 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f1237 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public final LinkedHashMap f1236 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥؗ */
    public final LinkedHashMap f1233 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f1238 = new ArrayList();

    /* JADX INFO: renamed from: ۥُ */
    public final transient LinkedHashMap f1234 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥّ */
    public final LinkedHashMap f1235 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۦۙ */
    public final Bundle f1239 = new Bundle();

    public C0331(AbstractActivityC1500 abstractActivityC1500) {
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C5002 m761(String str, AbstractC5568 abstractC5568, InterfaceC3550 interfaceC3550) {
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.f1236;
        Object objM4267 = null;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            C0062 c0062 = new C0062(7);
            Iterator it = new C4299(new C3306(c0062, new C4884(5, c0062), 1)).iterator();
            do {
                if (!it.hasNext()) {
                    C0178.m384("Sequence contains no element matching the predicate.");
                    return null;
                }
                number = (Number) it.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.f1237;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.f1234.put(str, new C0928(interfaceC3550, abstractC5568));
        LinkedHashMap linkedHashMap3 = this.f1235;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            interfaceC3550.mo6352(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f1239;
        if (i >= 34) {
            objM4267 = AbstractC2207.m4267(str, bundle);
        } else {
            Parcelable parcelable = bundle.getParcelable(str);
            if (C2233.class.isInstance(parcelable)) {
                objM4267 = parcelable;
            }
        }
        C2233 c2233 = (C2233) objM4267;
        if (c2233 != null) {
            bundle.remove(str);
            interfaceC3550.mo6352(abstractC5568.mo3805(c2233.f7399, c2233.f7400));
        }
        return new C5002(this, str, abstractC5568);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m762(int i, int i2, Intent intent) {
        String str = (String) this.f1237.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0928 c0928 = (C0928) this.f1234.get(str);
        if ((c0928 != null ? c0928.f3312 : null) != null) {
            ArrayList arrayList = this.f1238;
            if (arrayList.contains(str)) {
                c0928.f3312.mo6352(c0928.f3311.mo3805(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1235.remove(str);
        this.f1239.putParcelable(str, new C2233(intent, i2));
        return true;
    }
}
