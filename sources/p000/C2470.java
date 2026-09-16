package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥ۟ؗٙؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2470 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public C0094 f8244;

    /* JADX INFO: renamed from: ۦۛ */
    public List f8245;

    /* JADX INFO: renamed from: ۥ٘ */
    public static void m4631(C2470 c2470, String str) {
        c2470.getClass();
        C4158 c4158 = new C4158();
        C2672 c2672 = new C2672();
        c2672.m4980(3, str, false);
        c4158.f13851 = c2672;
        c2470.m4632(c4158);
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        int iM3958;
        List<C4158> list = this.f8245;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(list, 10));
            for (C4158 c4158 : list) {
                if (c4158 == null) {
                    c4158 = new C4158();
                }
                arrayList.add(Integer.valueOf(c4158.mo1447(c2024)));
            }
            iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList));
        } else {
            iM3958 = 0;
        }
        C0094 c0094 = this.f8244;
        int iMo1447 = c0094 != null ? c0094.mo1447(c2024) : 0;
        c2024.m3948(2);
        c2024.m3952(1, iMo1447);
        c2024.m3952(0, iM3958);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m4632(C4158 c4158) {
        List arrayList = this.f8245;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f8245 = arrayList;
        arrayList.add(c4158);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m4633(Class cls) {
        C4158 c4158 = new C4158();
        c4158.m7353(cls);
        m4632(c4158);
    }
}
