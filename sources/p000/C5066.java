package p000;

/* JADX INFO: renamed from: ۦۘؗۦٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5066 implements InterfaceC3901 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C2992 f16816;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16817;

    public /* synthetic */ C5066(C2992 c2992, int i) {
        this.f16817 = i;
        this.f16816 = c2992;
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3081(Throwable th) {
        int i = this.f16817;
        C2992 c2992 = this.f16816;
        switch (i) {
            case 0:
                c2992.completeExceptionally(th);
                break;
            default:
                c2992.completeExceptionally(th);
                break;
        }
    }

    @Override // p000.InterfaceC3901
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo3082(InterfaceC5065 interfaceC5065, C4633 c4633) {
        int i = this.f16817;
        C2992 c2992 = this.f16816;
        switch (i) {
            case 0:
                if (!c4633.f15293.m4177()) {
                    c2992.completeExceptionally(new C1228(c4633));
                } else {
                    c2992.complete(c4633.f15292);
                }
                break;
            default:
                c2992.complete(c4633);
                break;
        }
    }
}
