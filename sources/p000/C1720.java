package p000;

/* JADX INFO: renamed from: ۥٚؔؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1720 implements InterfaceC0215 {

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5725;

    public C1720(int i) {
        this.f5725 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1720) && ((C1720) obj).f5725 == this.f5725;
    }

    public final int hashCode() {
        return this.f5725;
    }

    @Override // p000.InterfaceC3347
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2707 mo827(C1280 c1280) {
        return new C1984(this.f5725);
    }
}
