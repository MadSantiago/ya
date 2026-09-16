package p000;

/* JADX INFO: renamed from: ۦّٕؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4207 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f13969;

    /* JADX INFO: renamed from: ۥۗ */
    public static String m7430(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m7431(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4207) {
            return this.f13969 == ((C4207) obj).f13969;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13969);
    }

    public final String toString() {
        return m7430(this.f13969);
    }
}
