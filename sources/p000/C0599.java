package p000;

/* JADX INFO: renamed from: ۥّؗؔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0599 implements InterfaceC3016 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f2222;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f2223;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f2224;

    public C0599(float f, long j, boolean z) {
        this.f2224 = z;
        this.f2223 = f;
        this.f2222 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0599)) {
            return false;
        }
        C0599 c0599 = (C0599) obj;
        if (this.f2224 != c0599.f2224 || !C4497.m7826(this.f2223, c0599.f2223)) {
            return false;
        }
        long j = c0599.f2222;
        int i = C1327.f4593;
        return C4462.m7744(this.f2222, j);
    }

    @Override // p000.InterfaceC3016
    public final int hashCode() {
        int iM6635 = AbstractC3761.m6635(this.f2223, Boolean.hashCode(this.f2224) * 31, 961);
        int i = C1327.f4593;
        return Long.hashCode(this.f2222) + iM6635;
    }

    @Override // p000.InterfaceC3016
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3975 mo1307(C2243 c2243) {
        return new C0636(c2243, this.f2224, this.f2223, new C3877(this));
    }
}
