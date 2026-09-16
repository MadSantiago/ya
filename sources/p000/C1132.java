package p000;

/* JADX INFO: renamed from: ۥِِٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1132 extends AbstractC1434 {

    /* JADX INFO: renamed from: ۥّ */
    public static final C1132 f3967 = new C1132(16);

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥؖ */
    public final EnumC0458 mo2387() {
        return EnumC0458.f1652;
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2388(InterfaceC0335 interfaceC0335) {
        if (!(interfaceC0335 instanceof InterfaceC3240)) {
            C5028.m8447(interfaceC0335, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
            return;
        }
        InterfaceC3240 interfaceC3240 = (InterfaceC3240) interfaceC0335;
        interfaceC3240.mo2393();
        interfaceC3240.mo1782();
    }

    @Override // p000.AbstractC1434
    /* JADX INFO: renamed from: ۦُ */
    public final void mo2389(InterfaceC0335 interfaceC0335) {
    }
}
