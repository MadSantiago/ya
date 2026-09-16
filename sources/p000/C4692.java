package p000;

/* JADX INFO: renamed from: ۦؘٜؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4692 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f15453;

    /* JADX INFO: renamed from: ۥُ */
    public final long f15454;

    /* JADX INFO: renamed from: ۥّ */
    public final long f15455;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f15456;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f15457;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f15458;

    public C4692(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f15457 = j;
        this.f15456 = j2;
        this.f15453 = j3;
        this.f15458 = j4;
        this.f15454 = j5;
        this.f15455 = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4692)) {
            return false;
        }
        C4692 c4692 = (C4692) obj;
        long j = c4692.f15457;
        int i = C1327.f4593;
        return C4462.m7744(this.f15457, j) && C4462.m7744(this.f15456, c4692.f15456) && C4462.m7744(this.f15453, c4692.f15453) && C4462.m7744(this.f15458, c4692.f15458) && C4462.m7744(this.f15454, c4692.f15454) && C4462.m7744(this.f15455, c4692.f15455);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f15455) + AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f15457) * 31, 31, this.f15456), 31, this.f15453), 31, this.f15458), 31, this.f15454);
    }
}
