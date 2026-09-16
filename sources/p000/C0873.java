package p000;

/* JADX INFO: renamed from: ۥٌؑؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0873 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f3199;

    public /* synthetic */ C0873(long j) {
        this.f3199 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final long m1861(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final long m1862(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m1863(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static String m1864(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return AbstractC3761.m6638(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0873) {
            return this.f3199 == ((C0873) obj).f3199;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3199);
    }

    public final String toString() {
        return m1864(this.f3199);
    }
}
