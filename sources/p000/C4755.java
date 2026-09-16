package p000;

/* JADX INFO: renamed from: ۦؚٝؖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4755 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4755 f15694 = new C4755(AbstractC4489.m7788(0), AbstractC4489.m7788(0));

    /* JADX INFO: renamed from: ۥۗ */
    public final long f15695;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f15696;

    public C4755(long j, long j2) {
        this.f15696 = j;
        this.f15695 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4755)) {
            return false;
        }
        C4755 c4755 = (C4755) obj;
        return C5023.m8440(this.f15696, c4755.f15696) && C5023.m8440(this.f15695, c4755.f15695);
    }

    public final int hashCode() {
        C3970[] c3970Arr = C5023.f16621;
        return Long.hashCode(this.f15695) + (Long.hashCode(this.f15696) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C5023.m8441(this.f15696)) + ", restLine=" + ((Object) C5023.m8441(this.f15695)) + ')';
    }
}
