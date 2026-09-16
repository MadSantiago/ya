package p000;

/* JADX INFO: renamed from: ۦۗؗؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4980 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f16476;

    public final boolean equals(Object obj) {
        if (obj instanceof C4980) {
            return this.f16476 == ((C4980) obj).f16476;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16476);
    }

    public final String toString() {
        long j = this.f16476;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C4497.m7825(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) C4497.m7825(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
