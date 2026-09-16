package p000;

/* JADX INFO: renamed from: ۦًؖؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3346 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ int f11195 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f11196 = AbstractC2765.m5145(0, 0);

    /* JADX INFO: renamed from: ۥۣ */
    public final long f11197;

    public /* synthetic */ C3346(long j) {
        this.f11197 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean m6107(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final int m6108(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final int m6109(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m6110(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static String m6111(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC3761.m6638(sb, (int) (j & 4294967295L), ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static boolean m6112(long j, Object obj) {
        return (obj instanceof C3346) && j == ((C3346) obj).f11197;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final int m6113(long j) {
        return m6108(j) - m6109(j);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final boolean m6114(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return m6112(this.f11197, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f11197);
    }

    public final String toString() {
        return m6111(this.f11197);
    }
}
