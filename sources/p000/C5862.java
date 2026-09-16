package p000;

/* JADX INFO: renamed from: ۦۨؒٝؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5862 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f19355;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f19356;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f19357;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f19358;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f19359;

    public C5862(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f19358 = z;
        this.f19357 = z2;
        this.f19355 = z3;
        this.f19359 = z4;
        this.f19356 = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5862)) {
            return false;
        }
        C5862 c5862 = (C5862) obj;
        return this.f19358 == c5862.f19358 && this.f19357 == c5862.f19357 && this.f19355 == c5862.f19355 && this.f19359 == c5862.f19359 && this.f19356 == c5862.f19356;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19356) + AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8672(Boolean.hashCode(this.f19358) * 31, 31, this.f19357), 31, this.f19355), 31, this.f19359);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f19358 + ", isValidated=" + this.f19357 + ", isMetered=" + this.f19355 + ", isNotRoaming=" + this.f19359 + ", isBlocked=" + this.f19356 + ')';
    }
}
