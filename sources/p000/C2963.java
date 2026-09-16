package p000;

/* JADX INFO: renamed from: ۦؐؑۥٜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2963 implements InterfaceC4370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0857 f9938;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC4745 f9939;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f9940;

    public C2963(AbstractC3377 abstractC3377, InterfaceC4745 interfaceC4745, C0857 c0857) {
        this.f9940 = abstractC3377;
        this.f9939 = interfaceC4745;
        this.f9938 = c0857;
    }

    @Override // p000.InterfaceC4370
    public final InterfaceC4745 getKey() {
        return this.f9940;
    }

    @Override // p000.InterfaceC4370
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 mo5523() {
        return this.f9939;
    }
}
