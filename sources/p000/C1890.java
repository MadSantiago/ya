package p000;

/* JADX INFO: renamed from: ۥؚٝؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f6269;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f6270;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f6271;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f6272;

    public C1890(float f, float f2, float f3, float f4) {
        this.f6271 = f;
        this.f6270 = f2;
        this.f6269 = f3;
        this.f6272 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1890)) {
            return false;
        }
        C1890 c1890 = (C1890) obj;
        if (C4497.m7826(this.f6271, c1890.f6271) && C4497.m7826(this.f6270, c1890.f6270) && C4497.m7826(this.f6269, c1890.f6269)) {
            return C4497.m7826(this.f6272, c1890.f6272);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6272) + AbstractC3761.m6635(this.f6269, AbstractC3761.m6635(this.f6270, Float.hashCode(this.f6271) * 31, 31), 31);
    }
}
