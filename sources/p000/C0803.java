package p000;

/* JADX INFO: renamed from: ۥؘؚؑۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0803 implements InterfaceC3347 {

    /* JADX INFO: renamed from: ۥۗ */
    public final long f2869;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3347 f2870;

    public C0803(InterfaceC0215 interfaceC0215, long j) {
        this.f2870 = interfaceC0215;
        this.f2869 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0803)) {
            return false;
        }
        C0803 c0803 = (C0803) obj;
        return c0803.f2869 == this.f2869 && AbstractC3831.m6874(c0803.f2870, this.f2870);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2869) + (this.f2870.hashCode() * 31);
    }

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 mo827(C1280 c1280) {
        return new C4484(this.f2870.mo827(c1280), this.f2869);
    }
}
