package p000;

/* JADX INFO: renamed from: ۥۨؖ٘ٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2934 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2934 f9860 = new C2934(0, 0);

    /* JADX INFO: renamed from: ۥۗ */
    public final long f9861;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f9862;

    public C2934(long j, long j2) {
        this.f9862 = j;
        this.f9861 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2934) {
            C2934 c2934 = (C2934) obj;
            return C4207.m7431(this.f9862, c2934.f9862) && this.f9861 == c2934.f9861;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9861) + (Long.hashCode(this.f9862) * 31);
    }
}
