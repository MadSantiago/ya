package p000;

/* JADX INFO: renamed from: ۥّۡؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2550 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f8508;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f8509;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f8510;

    public C2550(float f, float f2, long j) {
        this.f8510 = f;
        this.f8509 = f2;
        this.f8508 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2550)) {
            return false;
        }
        C2550 c2550 = (C2550) obj;
        return Float.compare(this.f8510, c2550.f8510) == 0 && Float.compare(this.f8509, c2550.f8509) == 0 && this.f8508 == c2550.f8508;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8508) + AbstractC3761.m6635(this.f8509, Float.hashCode(this.f8510) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f8510 + ", distance=" + this.f8509 + ", duration=" + this.f8508 + ')';
    }
}
