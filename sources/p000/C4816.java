package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦٍٞؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4816 extends AbstractC0041 implements InterfaceC3196 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4816 f15876 = new C4816(C1397.f4791);

    @Override // p000.InterfaceC3196
    public final boolean isCancelled() {
        return false;
    }

    @Override // p000.InterfaceC3196
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC3101 mo856(AbstractC0386 abstractC0386) {
        return C3364.f11240;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥٕ */
    public final InterfaceC4883 mo859(InterfaceC4745 interfaceC4745) {
        return C3364.f11240;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥ٘ */
    public final Object mo861(AbstractC0772 abstractC0772) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥٙ */
    public final CancellationException mo862() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo866() {
        return true;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۦؒ */
    public final InterfaceC4883 mo878(boolean z, boolean z2, C0037 c0037) {
        return C3364.f11240;
    }

    @Override // p000.InterfaceC3196
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo871(CancellationException cancellationException) {
    }
}
