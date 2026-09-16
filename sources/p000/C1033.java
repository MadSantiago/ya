package p000;

/* JADX INFO: renamed from: ۥُٖؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1033 {

    /* JADX INFO: renamed from: ۥُ */
    public C4073 f3641;

    /* JADX INFO: renamed from: ۥۗ */
    public EnumC1658 f3643;

    /* JADX INFO: renamed from: ۥۜ */
    public C2147 f3644;

    /* JADX INFO: renamed from: ۥۣ */
    public C2813 f3645;

    /* JADX INFO: renamed from: ۦؑ */
    public String f3646;

    /* JADX INFO: renamed from: ۦؚ */
    public long f3647;

    /* JADX INFO: renamed from: ۦٌ */
    public C4752 f3648;

    /* JADX INFO: renamed from: ۦِ */
    public C2147 f3649;

    /* JADX INFO: renamed from: ۦٛ */
    public C2147 f3650;

    /* JADX INFO: renamed from: ۦۗ */
    public long f3651;

    /* JADX INFO: renamed from: ۦۙ */
    public AbstractC2978 f3652;

    /* JADX INFO: renamed from: ۥؗ */
    public int f3640 = -1;

    /* JADX INFO: renamed from: ۥّ */
    public C5086 f3642 = new C5086(24);

    /* JADX INFO: renamed from: ۥۗ */
    public static void m2238(String str, C2147 c2147) {
        if (c2147 != null) {
            if (c2147.f7039 != null) {
                C1078.m2273(str.concat(".body != null"));
                return;
            }
            if (c2147.f7040 != null) {
                C1078.m2273(str.concat(".networkResponse != null"));
            } else if (c2147.f7036 != null) {
                C1078.m2273(str.concat(".cacheResponse != null"));
            } else {
                if (c2147.f7038 == null) {
                    return;
                }
                C1078.m2273(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C2147 m2239() {
        int i = this.f3640;
        if (i < 0) {
            C0178.m386(this.f3640, "code < 0: ");
            return null;
        }
        C2813 c2813 = this.f3645;
        if (c2813 == null) {
            C1078.m2276("request == null");
            return null;
        }
        EnumC1658 enumC1658 = this.f3643;
        if (enumC1658 == null) {
            C1078.m2276("protocol == null");
            return null;
        }
        String str = this.f3646;
        if (str != null) {
            return new C2147(c2813, enumC1658, str, i, this.f3641, this.f3642.m8701(), this.f3652, this.f3644, this.f3650, this.f3649, this.f3651, this.f3647, this.f3648);
        }
        C1078.m2276("message == null");
        return null;
    }
}
