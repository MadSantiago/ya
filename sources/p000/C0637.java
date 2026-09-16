package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥْؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0637 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥؓ */
    public C4665 f2376;

    /* JADX INFO: renamed from: ۥؖ */
    public C2470 f2377;

    /* JADX INFO: renamed from: ۥً */
    public List f2378;

    /* JADX INFO: renamed from: ۥٕ */
    public C0672 f2379;

    /* JADX INFO: renamed from: ۥٙ */
    public C2672 f2380;

    /* JADX INFO: renamed from: ۥۖ */
    public C0094 f2381;

    /* JADX INFO: renamed from: ۥۧ */
    public List f2382;

    /* JADX INFO: renamed from: ۦٕ */
    public C2672 f2383;

    /* JADX INFO: renamed from: ۦٚ */
    public C0672 f2384;

    /* JADX INFO: renamed from: ۦۛ */
    public C2203 f2385;

    /* JADX INFO: renamed from: ۥؚ */
    public static void m1440(C0637 c0637, String str, int i) {
        c0637.getClass();
        C2672 c2672 = new C2672();
        c2672.m4980(i, str, false);
        c0637.f2380 = c2672;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static void m1441(C0637 c0637, String str, int i) {
        int i2 = (i & 2) != 0 ? 1 : 2;
        List arrayList = c0637.f2382;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0637.f2382 = arrayList;
        arrayList.add(new C2203(i2, str, false));
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static void m1442(C0637 c0637, String str) {
        c0637.getClass();
        c0637.f2385 = new C2203(5, str, false);
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m1443(C5310 c5310) {
        List arrayList = this.f2378;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f2378 = arrayList;
        arrayList.add(c5310);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final void m1444(Class... clsArr) {
        C4158 c4158;
        C2470 c2470 = new C2470();
        c2470.f8245 = new ArrayList(C2340.f7777);
        for (Class cls : clsArr) {
            if (cls != null) {
                c4158 = new C4158();
                c4158.m7353(cls);
            } else {
                c4158 = null;
            }
            c2470.m4632(c4158);
        }
        this.f2377 = c2470;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1445(Class cls) {
        C2672 c2672 = new C2672();
        C2672.m4974(c2672, AbstractC1650.m3462(cls), 0, 6);
        this.f2380 = c2672;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m1446(int i) {
        C2470 c2470 = this.f2377;
        if (c2470 == null) {
            c2470 = new C2470();
            this.f2377 = c2470;
        }
        c2470.f8244 = new C0094(i);
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        int iM3958;
        int iM3959;
        C2203 c2203 = this.f2385;
        int iMo1447 = c2203 != null ? c2203.mo1447(c2024) : 0;
        C0094 c0094 = this.f2381;
        int iMo1448 = c0094 != null ? c0094.mo1447(c2024) : 0;
        C2672 c2672 = this.f2383;
        int iMo1449 = c2672 != null ? c2672.mo1447(c2024) : 0;
        C2672 c2673 = this.f2380;
        int iMo14410 = c2673 != null ? c2673.mo1447(c2024) : 0;
        C2470 c2470 = this.f2377;
        int iMo14411 = c2470 != null ? c2470.mo1447(c2024) : 0;
        C4665 c4665 = this.f2376;
        int iMo14412 = c4665 != null ? c4665.mo1447(c2024) : 0;
        List list = this.f2382;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2203) it.next()).mo1447(c2024)));
            }
            iM3958 = c2024.m3958(AbstractC0973.m2050(arrayList));
        } else {
            iM3958 = 0;
        }
        List list2 = this.f2378;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5573.m9402(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C5310) it2.next()).mo1447(c2024)));
            }
            iM3959 = c2024.m3958(AbstractC0973.m2050(arrayList2));
        } else {
            iM3959 = 0;
        }
        C0672 c0672 = this.f2384;
        int iMo14413 = c0672 != null ? c0672.mo1447(c2024) : 0;
        C0672 c0673 = this.f2379;
        int iMo14414 = c0673 != null ? c0673.mo1447(c2024) : 0;
        c2024.m3948(17);
        c2024.m3952(16, 0);
        c2024.m3952(15, 0);
        c2024.m3952(14, 0);
        c2024.m3952(13, 0);
        c2024.m3952(12, iMo14414);
        c2024.m3952(11, iMo14413);
        c2024.m3952(10, 0);
        c2024.m3952(9, 0);
        c2024.m3952(8, iM3959);
        c2024.m3952(7, iM3958);
        c2024.m3952(6, iMo14412);
        c2024.m3952(5, 0);
        c2024.m3952(4, iMo14411);
        c2024.m3952(3, iMo14410);
        c2024.m3952(2, iMo1449);
        c2024.m3952(1, iMo1448);
        c2024.m3952(0, iMo1447);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m1448(String str) {
        List arrayList = this.f2382;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f2382 = arrayList;
        arrayList.add(new C2203(5, str, false));
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m1449(InterfaceC4745 interfaceC4745) {
        C0637 c0637 = new C0637();
        interfaceC4745.mo211(c0637);
        C0672 c0672 = this.f2384;
        if (c0672 == null) {
            c0672 = new C0672();
        }
        this.f2384 = c0672;
        c0672.m1503(c0637);
    }
}
