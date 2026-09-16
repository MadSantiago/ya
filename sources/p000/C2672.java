package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥۤؓۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2672 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥؓ */
    public List f8851;

    /* JADX INFO: renamed from: ۥؖ */
    public C0672 f8852;

    /* JADX INFO: renamed from: ۥٙ */
    public C4243 f8853;

    /* JADX INFO: renamed from: ۥۖ */
    public C0094 f8854;

    /* JADX INFO: renamed from: ۦٕ */
    public C3666 f8855;

    /* JADX INFO: renamed from: ۦۛ */
    public C2203 f8856;

    /* JADX INFO: renamed from: ۥ٘ */
    public static void m4973(C2672 c2672, String str) {
        C3666 c3666 = c2672.f8855;
        if (c3666 == null) {
            c3666 = new C3666();
        }
        c2672.f8855 = c3666;
        C2672 c2673 = new C2672();
        c2673.m4980(1, str, false);
        List arrayList = c3666.f12259;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c3666.f12259 = arrayList;
        arrayList.add(c2673);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m4974(C2672 c2672, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        c2672.m4980(i, str, false);
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static void m4975(C2672 c2672, String str, int i) {
        int i2 = (i & 2) != 0 ? 1 : 2;
        c2672.getClass();
        C2203 c2203 = new C2203(i2, str, false);
        List arrayList = c2672.f8851;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c2672.f8851 = arrayList;
        arrayList.add(c2203);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static void m4976(C2672 c2672, String str) {
        C4243 c4243 = c2672.f8853;
        if (c4243 == null) {
            c4243 = new C4243();
        }
        c2672.f8853 = c4243;
        C3098 c3098 = new C3098();
        C2672 c2673 = new C2672();
        c2673.m4980(3, str, false);
        c3098.f10387 = c2673;
        c4243.m7503(c3098);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final void m4977(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2203(1, str, false));
        }
        this.f8851 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final void m4978(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2203(5, str, false));
        }
        this.f8851 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final void m4979(InterfaceC4745 interfaceC4745) {
        C0637 c0637 = new C0637();
        interfaceC4745.mo211(c0637);
        m4981(c0637);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final void m4980(int i, String str, boolean z) {
        this.f8856 = new C2203(i, str, z);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m4981(C0637 c0637) {
        C0672 c0672 = this.f8852;
        if (c0672 == null) {
            c0672 = new C0672();
        }
        this.f8852 = c0672;
        c0672.m1503(c0637);
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        int iM3958;
        C2203 c2203 = this.f8856;
        int iMo1447 = c2203 != null ? c2203.mo1447(c2024) : 0;
        C0094 c0094 = this.f8854;
        int iMo1448 = c0094 != null ? c0094.mo1447(c2024) : 0;
        C3666 c3666 = this.f8855;
        int iMo1449 = c3666 != null ? c3666.mo1447(c2024) : 0;
        C4243 c4243 = this.f8853;
        int iMo14410 = c4243 != null ? c4243.mo1447(c2024) : 0;
        C0672 c0672 = this.f8852;
        int iMo14411 = c0672 != null ? c0672.mo1447(c2024) : 0;
        List list = this.f8851;
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
        c2024.m3948(12);
        c2024.m3952(11, 0);
        c2024.m3952(10, 0);
        c2024.m3952(9, 0);
        c2024.m3952(8, iM3958);
        c2024.m3952(7, iMo14411);
        c2024.m3952(6, iMo14410);
        c2024.m3952(5, 0);
        c2024.m3952(4, iMo1449);
        c2024.m3952(3, 0);
        c2024.m3952(2, iMo1448);
        c2024.m3952(1, iMo1447);
        c2024.m3952(0, 0);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m4982(String str) {
        List arrayList = this.f8851;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f8851 = arrayList;
        arrayList.add(new C2203(5, str, false));
    }
}
