package p000;

/* JADX INFO: renamed from: ۦٟۗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4882 {

    /* JADX INFO: renamed from: ۥۣ */
    public C1955 f16060 = null;

    /* JADX INFO: renamed from: ۥۗ */
    public C0979 f16059 = null;

    /* JADX INFO: renamed from: ۥؗ */
    public C2004 f16058 = null;

    /* JADX INFO: renamed from: ۦؑ */
    public C0935 f16061 = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4882)) {
            return false;
        }
        C4882 c4882 = (C4882) obj;
        return AbstractC3831.m6874(this.f16060, c4882.f16060) && AbstractC3831.m6874(this.f16059, c4882.f16059) && AbstractC3831.m6874(this.f16058, c4882.f16058) && AbstractC3831.m6874(this.f16061, c4882.f16061);
    }

    public final int hashCode() {
        C1955 c1955 = this.f16060;
        int iHashCode = (c1955 == null ? 0 : c1955.hashCode()) * 31;
        C0979 c0979 = this.f16059;
        int iHashCode2 = (iHashCode + (c0979 == null ? 0 : c0979.hashCode())) * 31;
        C2004 c2004 = this.f16058;
        int iHashCode3 = (iHashCode2 + (c2004 == null ? 0 : c2004.hashCode())) * 31;
        C0935 c0935 = this.f16061;
        return iHashCode3 + (c0935 != null ? c0935.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f16060 + ", canvas=" + this.f16059 + ", canvasDrawScope=" + this.f16058 + ", borderPath=" + this.f16061 + ')';
    }
}
