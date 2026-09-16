package p000;

/* JADX INFO: renamed from: ۥٖۣۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1495 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f5067;

    /* JADX INFO: renamed from: ۥۗ */
    public static final float m3175(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final float m3176(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1495) {
            return this.f5067 == ((C1495) obj).f5067;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5067);
    }

    public final String toString() {
        long j = this.f5067;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C4497.m7825(m3175(j))) + " x " + ((Object) C4497.m7825(m3176(j)));
    }
}
