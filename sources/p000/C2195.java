package p000;

/* JADX INFO: renamed from: ۥۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2195 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f7283;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f7284;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f7285;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f7286;

    public C2195(long j, long j2, long j3, long j4) {
        this.f7285 = j;
        this.f7284 = j2;
        this.f7283 = j3;
        this.f7286 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2195)) {
            return false;
        }
        C2195 c2195 = (C2195) obj;
        long j = c2195.f7285;
        int i = C1327.f4593;
        return C4462.m7744(this.f7285, j) && C4462.m7744(this.f7284, c2195.f7284) && C4462.m7744(this.f7283, c2195.f7283) && C4462.m7744(this.f7286, c2195.f7286);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f7286) + AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f7285) * 31, 31, this.f7284), 31, this.f7283);
    }
}
