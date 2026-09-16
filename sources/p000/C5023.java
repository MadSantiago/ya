package p000;

/* JADX INFO: renamed from: ۦۘؔۚۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5023 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f16622;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3970[] f16621 = {new C3970(0), new C3970(4294967296L), new C3970(8589934592L)};

    /* JADX INFO: renamed from: ۥؗ */
    public static final long f16620 = AbstractC4489.m7799(Float.NaN, 0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final float m8438(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final long m8439(long j) {
        return f16621[(int) ((j & 1095216660480L) >>> 32)].f13273;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m8440(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static String m8441(long j) {
        long jM8439 = m8439(j);
        if (C3970.m7128(jM8439, 0L)) {
            return "Unspecified";
        }
        if (C3970.m7128(jM8439, 4294967296L)) {
            return m8438(j) + ".sp";
        }
        if (!C3970.m7128(jM8439, 8589934592L)) {
            return "Invalid";
        }
        return m8438(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5023) {
            return this.f16622 == ((C5023) obj).f16622;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16622);
    }

    public final String toString() {
        return m8441(this.f16622);
    }
}
