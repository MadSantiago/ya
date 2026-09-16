package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ۥٖٜٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1375 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f4704;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4705;

    public /* synthetic */ C1375(int i, Object obj) {
        this.f4705 = i;
        this.f4704 = obj;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        Window window;
        View viewPeekDecorView;
        int i = this.f4705;
        Object obj = this.f4704;
        switch (i) {
            case 0:
                AbstractActivityC1500 abstractActivityC1500 = (AbstractActivityC1500) obj;
                if (enumC1924 == EnumC1924.ON_STOP && (window = abstractActivityC1500.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC1500 abstractActivityC1501 = (AbstractActivityC1500) obj;
                if (enumC1924 == EnumC1924.ON_DESTROY) {
                    abstractActivityC1501.f5103.f10838 = null;
                    if (!abstractActivityC1501.isChangingConfigurations()) {
                        abstractActivityC1501.mo651().m5839();
                    }
                    ViewTreeObserverOnDrawListenerC4281 viewTreeObserverOnDrawListenerC4281 = abstractActivityC1501.f5093;
                    AbstractActivityC1500 abstractActivityC1502 = viewTreeObserverOnDrawListenerC4281.f14165;
                    abstractActivityC1502.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC4281);
                    abstractActivityC1502.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC4281);
                }
                break;
            default:
                C5140 c5140 = (C5140) obj;
                if (enumC1924 == EnumC1924.ON_START) {
                    c5140.f17026 = true;
                } else if (enumC1924 == EnumC1924.ON_STOP) {
                    c5140.f17026 = false;
                }
                break;
        }
    }
}
