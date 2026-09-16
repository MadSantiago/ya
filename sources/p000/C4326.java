package p000;

/* JADX INFO: renamed from: ۦؘَٖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4326 implements InterfaceC1613 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C4085 f14297;

    public C4326(C4085 c4085) {
        this.f14297 = c4085;
    }

    @Override // p000.InterfaceC1613
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo324(boolean z) {
        HandlerC0645 handlerC0645 = this.f14297.f13634;
        handlerC0645.sendMessage(handlerC0645.obtainMessage(1, Boolean.valueOf(z)));
    }
}
