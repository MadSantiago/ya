package p000;

/* JADX INFO: renamed from: ۦِؔۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3970 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f13273;

    /* JADX INFO: renamed from: ۥۗ */
    public static String m7127(long j) {
        if (m7128(j, 0L)) {
            return "Unspecified";
        }
        if (m7128(j, 4294967296L)) {
            return "Sp";
        }
        return m7128(j, 8589934592L) ? "Em" : "Invalid";
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m7128(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3970) {
            return this.f13273 == ((C3970) obj).f13273;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13273);
    }

    public final String toString() {
        return m7127(this.f13273);
    }
}
