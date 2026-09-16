package p000;

/* JADX INFO: renamed from: ۦٍۜٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5310 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۥۖ */
    public int f17486 = 1;

    /* JADX INFO: renamed from: ۦۛ */
    public C3098 f17487;

    /* JADX INFO: renamed from: ۦۜ */
    public static void m8924(C5310 c5310, String str) {
        C3098 c3098 = c5310.f17487;
        if (c3098 == null) {
            c3098 = new C3098();
        }
        c5310.f17487 = c3098;
        c3098.f10388 = new C2203(5, str, false);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static void m8925(C5310 c5310, String str, int i) {
        C3098 c3098 = c5310.f17487;
        if (c3098 == null) {
            c3098 = new C3098();
        }
        c5310.f17487 = c3098;
        C2672 c2672 = new C2672();
        c2672.m4980(i, str, false);
        c3098.f10387 = c2672;
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۦٕ */
    public final int mo1447(C2024 c2024) {
        C3098 c3098 = this.f17487;
        if (c3098 == null) {
            C1078.m2272("UsingFieldMatcher matcher not set");
            return 0;
        }
        int iMo1447 = c3098.mo1447(c2024);
        int i = this.f17486;
        byte b = 1;
        if (i == 1) {
            b = 0;
        } else if (i != 2) {
            if (i != 3) {
                throw null;
            }
            b = 2;
        }
        c2024.m3948(2);
        c2024.m3952(0, iMo1447);
        c2024.m3949(b);
        int iM3950 = c2024.m3950();
        c2024.m3955(iM3950);
        return iM3950;
    }
}
