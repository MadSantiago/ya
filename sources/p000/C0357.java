package p000;

/* JADX INFO: renamed from: ۥؙؓٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0357 implements InterfaceC3320 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5097 f1295;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f1296;

    public C0357(C5097 c5097, long j) {
        this.f1295 = c5097;
        this.f1296 = j;
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦؐ */
    public final C1197 mo776() {
        return AbstractC0186.m441(this.f1295);
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo777(InterfaceC2015 interfaceC2015) {
        InterfaceC2015 interfaceC2016 = (InterfaceC2015) this.f1295.f16893.getValue();
        if (interfaceC2016 != null) {
            return interfaceC2015.mo2783(interfaceC2016, this.f1296);
        }
        AbstractC4690.m8039("Tried to open context menu before the anchor was placed.");
        C1078.m2274();
        return 0L;
    }

    @Override // p000.InterfaceC3320
    /* JADX INFO: renamed from: ۦۨ */
    public final C2793 mo778(InterfaceC2015 interfaceC2015) {
        return AbstractC5568.m9368(mo777(interfaceC2015), 0L);
    }
}
