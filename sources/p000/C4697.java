package p000;

/* JADX INFO: renamed from: ۦَٜؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4697 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f15488;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f15489;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f15490;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f15491;

    public C4697(long j, long j2, long j3, long j4) {
        this.f15490 = j;
        this.f15489 = j2;
        this.f15488 = j3;
        this.f15491 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4697)) {
            return false;
        }
        C4697 c4697 = (C4697) obj;
        long j = c4697.f15490;
        int i = C1327.f4593;
        return C4462.m7744(this.f15490, j) && C4462.m7744(this.f15489, c4697.f15489) && C4462.m7744(this.f15488, c4697.f15488) && C4462.m7744(this.f15491, c4697.f15491);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f15491) + AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f15490) * 31, 31, this.f15489), 31, this.f15488);
    }
}
