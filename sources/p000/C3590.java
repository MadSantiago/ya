package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؚِؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3590 implements InterfaceC0110, InterfaceC3744, InterfaceC1463, InterfaceC2342 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC2429 f11942;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3580 f11943;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Executor f11944;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11945;

    public /* synthetic */ C3590(Executor executor, InterfaceC2429 interfaceC2429, C3580 c3580, int i) {
        this.f11945 = i;
        this.f11944 = executor;
        this.f11942 = interfaceC2429;
        this.f11943 = c3580;
    }

    @Override // p000.InterfaceC2342
    /* JADX INFO: renamed from: ۥؗ */
    public void mo2242() {
        this.f11943.m6394();
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public void mo2243(Exception exc) {
        this.f11943.m6393(exc);
    }

    @Override // p000.InterfaceC0110
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo207(C3580 c3580) {
        switch (this.f11945) {
            case 0:
                this.f11944.execute(new RunnableC4985(19, this, c3580, false));
                break;
            default:
                this.f11944.execute(new RunnableC4985(20, this, c3580, false));
                break;
        }
    }

    @Override // p000.InterfaceC3744
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2246(Object obj) {
        this.f11943.m6395(obj);
    }
}
