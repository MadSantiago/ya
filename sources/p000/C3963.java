package p000;

/* JADX INFO: renamed from: ۦِۣؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3963 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final C4036 f13247 = new C4036(14);

    /* JADX INFO: renamed from: ۦۗ */
    public static int f13248;

    /* JADX INFO: renamed from: ۥؗ */
    public final float f13249;

    /* JADX INFO: renamed from: ۥُ */
    public final float f13250;

    /* JADX INFO: renamed from: ۥّ */
    public final C2715 f13251;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f13252;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f13253;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13254;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f13255;

    /* JADX INFO: renamed from: ۦِ */
    public final int f13256;

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean f13257;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f13258;

    public C3963(String str, float f, float f2, float f3, float f4, C2715 c2715, long j, int i, boolean z) {
        int i2;
        synchronized (f13247) {
            i2 = f13248;
            f13248 = i2 + 1;
        }
        this.f13254 = str;
        this.f13252 = f;
        this.f13249 = f2;
        this.f13255 = f3;
        this.f13250 = f4;
        this.f13251 = c2715;
        this.f13258 = j;
        this.f13253 = i;
        this.f13257 = z;
        this.f13256 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3963)) {
            return false;
        }
        C3963 c3963 = (C3963) obj;
        if (!AbstractC3831.m6874(this.f13254, c3963.f13254) || !C4497.m7826(this.f13252, c3963.f13252) || !C4497.m7826(this.f13249, c3963.f13249) || this.f13255 != c3963.f13255 || this.f13250 != c3963.f13250 || !this.f13251.equals(c3963.f13251)) {
            return false;
        }
        long j = c3963.f13258;
        int i = C1327.f4593;
        return C4462.m7744(this.f13258, j) && this.f13253 == c3963.f13253 && this.f13257 == c3963.f13257;
    }

    public final int hashCode() {
        int iHashCode = (this.f13251.hashCode() + AbstractC3761.m6635(this.f13250, AbstractC3761.m6635(this.f13255, AbstractC3761.m6635(this.f13249, AbstractC3761.m6635(this.f13252, this.f13254.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = C1327.f4593;
        return Boolean.hashCode(this.f13257) + AbstractC2049.m3999(this.f13253, AbstractC3761.m6626(iHashCode, 31, this.f13258), 31);
    }
}
