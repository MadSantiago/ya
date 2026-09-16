package p000;

/* JADX INFO: renamed from: ۥْۢؑۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2596 extends AbstractC4054 {

    /* JADX INFO: renamed from: ۥْ */
    public static final C1007 f8677 = AbstractC2776.m5242("0021F904");

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1270 f8678;

    public C2596(InterfaceC4473 interfaceC4473) {
        super(interfaceC4473);
        this.f8678 = new C1270();
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) {
        long j2;
        long j3;
        m4893(j);
        C1270 c1271 = this.f8678;
        long j4 = 0;
        if (c1271.f4340 == 0) {
            return j == 0 ? 0L : -1L;
        }
        long j5 = 0;
        while (true) {
            long jM2682 = -1;
            while (true) {
                C1007 c1007 = f8677;
                j2 = j4;
                jM2682 = c1271.m2682(c1007.f3598[0], jM2682 + 1, Long.MAX_VALUE);
                if (jM2682 == -1 || (m4893(c1007.f3598.length) && c1271.mo2694(jM2682, c1007))) {
                    break;
                }
                j4 = j2;
            }
            if (jM2682 == -1) {
                break;
            }
            long jMo406 = c1271.mo406(c1270, jM2682 + 4);
            if (jMo406 < j2) {
                jMo406 = j2;
            }
            j5 += jMo406;
            if (m4893(5L) && c1271.m2670(4L) == 0 && (((c1271.m2670(2L) & 255) << 8) | (c1271.m2670(1L) & 255)) < 2) {
                c1270.m2680(c1271.m2670(j2));
                c1270.m2680(10);
                c1270.m2680(0);
                c1271.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long jMo407 = c1271.mo406(c1270, j - j5);
            j3 = 0;
            if (jMo407 < 0) {
                jMo407 = 0;
            }
            j5 += jMo407;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m4893(long j) {
        C1270 c1270 = this.f8678;
        long j2 = c1270.f4340;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        return this.f13513.mo406(c1270, j3) == j3;
    }
}
