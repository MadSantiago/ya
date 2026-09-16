package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۦٓؓۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4118 extends AbstractC3831 {

    /* JADX INFO: renamed from: ۦۨ */
    public final Map f13725;

    public C4118(Map map) {
        this.f13725 = map;
    }

    @Override // p000.AbstractC3831
    /* JADX INFO: renamed from: ۥٕ */
    public final void mo4832(C1489 c1489, C2067 c2067) {
        AbstractC0881 abstractC0881Mo4833;
        AbstractC0881 abstractC0881Mo4834;
        ArrayList arrayList = c2067.f6813;
        if (arrayList.size() > 0) {
            for (C3304 c3304 : Collections.unmodifiableList(arrayList)) {
                if (c3304.m7287() && (abstractC0881Mo4834 = mo4833((String) c3304.f13680)) != null) {
                    abstractC0881Mo4834.mo1876(c1489, this, c3304);
                }
            }
            arrayList.clear();
        } else {
            for (C3304 c3305 : Collections.EMPTY_LIST) {
                if (c3305.m7287() && (abstractC0881Mo4833 = mo4833((String) c3305.f13680)) != null) {
                    abstractC0881Mo4833.mo1876(c1489, this, c3305);
                }
            }
        }
        C3369 c3369 = new C3369(8, this, c1489, false);
        C0446 c0446 = c2067.f6811;
        while (true) {
            C0446 c0447 = c0446.f1633;
            if (c0447 == null) {
                break;
            } else {
                c0446 = c0447;
            }
        }
        ArrayList arrayList2 = c0446.f1634;
        List listUnmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        if (listUnmodifiableList.size() > 0) {
            c3369.m6139(listUnmodifiableList);
        } else {
            c3369.m6139(Collections.EMPTY_LIST);
        }
        Map map = Collections.EMPTY_MAP;
        c2067.f6811 = new C0446("", 0, map, null);
        c2067.f6813.clear();
        c2067.f6811 = new C0446("", 0, map, null);
    }

    @Override // p000.AbstractC3831
    /* JADX INFO: renamed from: ۦؗ */
    public final AbstractC0881 mo4833(String str) {
        return (AbstractC0881) this.f13725.get(str);
    }
}
