package p000;

/* JADX INFO: renamed from: ۦٕۨؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5877 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f19405;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1166 f19406;

    public C5877(C1166 c1166, boolean z) {
        this.f19406 = c1166;
        this.f19405 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5877) {
            C5877 c5877 = (C5877) obj;
            if (c5877.f19406.equals(this.f19406) && c5877.f19405 == this.f19405) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f19405).hashCode() ^ ((this.f19406.hashCode() ^ 1000003) * 1000003);
    }
}
