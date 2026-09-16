package p000;

/* JADX INFO: renamed from: ۦۙۢۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5143 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f17033;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f17034;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f17035;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f17036;

    public C5143(long j, long j2, long j3, long j4) {
        this.f17035 = j;
        this.f17034 = j2;
        this.f17033 = j3;
        this.f17036 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5143)) {
            return false;
        }
        C5143 c5143 = (C5143) obj;
        long j = c5143.f17035;
        int i = C1327.f4593;
        return C4462.m7744(this.f17035, j) && C4462.m7744(this.f17034, c5143.f17034) && C4462.m7744(this.f17033, c5143.f17033) && C4462.m7744(this.f17036, c5143.f17036);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f17036) + AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f17035) * 31, 31, this.f17034), 31, this.f17033);
    }
}
