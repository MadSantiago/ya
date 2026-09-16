package p000;

/* JADX INFO: renamed from: ۥؗؗۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0630 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2257 f2330;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3843 f2331;

    static {
        C3843 c3843 = new C3843(0);
        f2331 = c3843;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        f2330 = new C2257(i, i2, i3, i4, 0, 0, C0373.f1380, new C0294(1), AbstractC4009.m7151(C4794.f15814), c3843, AbstractC0671.m1494(0, 0, 0, 0, 15));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final long m1388(C2257 c2257, int i) {
        int i2 = c2257.f7483;
        long j = (((((long) i) * ((long) (c2257.f7490 + i2))) + ((long) (-c2257.f7486))) + ((long) c2257.f7493)) - ((long) i2);
        int iM4300 = (int) (c2257.f7485 == EnumC1616.f5424 ? c2257.m4300() >> 32 : c2257.m4300() & 4294967295L);
        c2257.f7501.getClass();
        long jM7934 = j - ((long) (iM4300 - AbstractC4554.m7934(0, 0, iM4300)));
        if (jM7934 < 0) {
            return 0L;
        }
        return jM7934;
    }
}
