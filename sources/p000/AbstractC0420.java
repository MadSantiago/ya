package p000;

/* JADX INFO: renamed from: ۥؔؗٚٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0420 extends AbstractC2870 {
    public AbstractC0420(InterfaceC0443 interfaceC0443) {
        super(interfaceC0443);
        if (interfaceC0443 == null || interfaceC0443.mo334() == C4794.f15814) {
            return;
        }
        C1078.m2272("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return C4794.f15814;
    }
}
