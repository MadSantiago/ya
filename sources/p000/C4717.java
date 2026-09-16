package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦٍْٜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4717 implements InterfaceC5065 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC5065 f15549;

    /* JADX INFO: renamed from: ۦۨ */
    public final Executor f15550;

    public C4717(Executor executor, InterfaceC5065 interfaceC5065) {
        this.f15550 = executor;
        this.f15549 = interfaceC5065;
    }

    @Override // p000.InterfaceC5065
    public final void cancel() {
        this.f15549.cancel();
    }

    @Override // p000.InterfaceC5065
    public final InterfaceC5065 clone() {
        return new C4717(this.f15550, this.f15549.clone());
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۥَ */
    public final boolean mo1598() {
        return this.f15549.mo1598();
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1599(InterfaceC3901 interfaceC3901) {
        this.f15549.mo1599(new C5002(21, this, interfaceC3901));
    }

    @Override // p000.InterfaceC5065
    /* JADX INFO: renamed from: ۦ۟ */
    public final C2813 mo1602() {
        return this.f15549.mo1602();
    }
}
