package p000;

/* JADX INFO: renamed from: ۥؔؒٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0380 implements InterfaceC0215 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3015 f1418;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f1419;

    public C0380(int i, InterfaceC3015 interfaceC3015) {
        this.f1419 = i;
        this.f1418 = interfaceC3015;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0380)) {
            return false;
        }
        C0380 c0380 = (C0380) obj;
        return c0380.f1419 == this.f1419 && AbstractC3831.m6874(c0380.f1418, this.f1418);
    }

    public final int hashCode() {
        return (this.f1418.hashCode() + (this.f1419 * 31)) * 31;
    }

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 mo827(C1280 c1280) {
        return new C0322(this.f1419, this.f1418);
    }
}
