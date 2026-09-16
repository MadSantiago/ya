package p000;

/* JADX INFO: renamed from: ۦ٘۟ٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4462 implements Comparable {

    /* JADX INFO: renamed from: ۦۨ */
    public final long f14714;

    public /* synthetic */ C4462(long j) {
        this.f14714 = j;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m7744(long j, long j2) {
        return j == j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3831.m6844(this.f14714 ^ Long.MIN_VALUE, ((C4462) obj).f14714 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4462) {
            return this.f14714 == ((C4462) obj).f14714;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14714);
    }

    public final String toString() {
        long j = this.f14714;
        if (j >= 0) {
            AbstractC2133.m4156(10);
            return Long.toString(j, 10);
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        AbstractC2133.m4156(10);
        String string = Long.toString(j2, 10);
        AbstractC2133.m4156(10);
        return string.concat(Long.toString(j3, 10));
    }
}
