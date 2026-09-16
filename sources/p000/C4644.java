package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ۦٖٛؗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4644 extends AbstractC5381 implements InterfaceC2269, InterfaceC5671, InterfaceC0174, InterfaceC4933, InterfaceC0289 {

    /* JADX INFO: renamed from: ۥً */
    public final C2932 f15318 = new C2932(2, this);

    /* JADX INFO: renamed from: ۦٚ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f15319;

    public C4644(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f15319 = viewTreeObserverOnGlobalLayoutListenerC0850;
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j);
        return interfaceC2427.mo748(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, C0204.f751, this.f15318, new C0778(abstractC0275Mo3597, 0));
    }

    @Override // p000.InterfaceC0289
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo612() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۥۡ */
    public final boolean mo363(KeyEvent keyEvent) {
        C1057 c1057;
        int[] iArr = AbstractC2840.f9486;
        long jM3030 = AbstractC1434.m3030(keyEvent);
        if (AbstractC0708.m1574(jM3030, AbstractC0708.f2585)) {
            c1057 = new C1057(2);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2574)) {
            c1057 = new C1057(1);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2609)) {
            c1057 = new C1057(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2605)) {
            c1057 = new C1057(4);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2578)) {
            c1057 = new C1057(3);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2591) || AbstractC0708.m1574(jM3030, AbstractC0708.f2575)) {
            c1057 = new C1057(5);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2577) || AbstractC0708.m1574(jM3030, AbstractC0708.f2602)) {
            c1057 = new C1057(6);
        } else if (AbstractC0708.m1574(jM3030, AbstractC0708.f2587) || AbstractC0708.m1574(jM3030, AbstractC0708.f2580) || AbstractC0708.m1574(jM3030, AbstractC0708.f2581)) {
            c1057 = new C1057(7);
        } else {
            c1057 = (AbstractC0708.m1574(jM3030, AbstractC0708.f2588) || AbstractC0708.m1574(jM3030, AbstractC0708.f2601)) ? new C1057(8) : null;
        }
        if (c1057 != null) {
            int i = c1057.f3729;
            if (AbstractC1434.m3056(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f15319;
                C3468 c3468M3926 = ((C2016) viewTreeObserverOnGlobalLayoutListenerC0850.getFocusOwner()).m3926();
                if (c3468M3926 == null || !c3468M3926.f11507 || !viewTreeObserverOnGlobalLayoutListenerC0850.m1780(i)) {
                    Boolean boolM3925 = ((C2016) viewTreeObserverOnGlobalLayoutListenerC0850.getFocusOwner()).m3925(i, viewTreeObserverOnGlobalLayoutListenerC0850.getEmbeddedViewFocusRect(), new C2932(1, c1057));
                    if (!(boolM3925 != null ? boolM3925.booleanValue() : true)) {
                        if (i == 1 || i == 2) {
                            Integer numM5403 = AbstractC2840.m5403(i);
                            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) viewTreeObserverOnGlobalLayoutListenerC0850.getRootView(), viewTreeObserverOnGlobalLayoutListenerC0850.getView(), numM5403 != null ? numM5403.intValue() : 2);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0850)) {
                                return ((C2016) viewTreeObserverOnGlobalLayoutListenerC0850.getFocusOwner()).m3928(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0174
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo364(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.InterfaceC2269
    /* JADX INFO: renamed from: ۦٞ */
    public final Object mo4320(AbstractC1311 abstractC1311, C5304 c5304, AbstractC0772 abstractC0772) {
        long jMo2808 = abstractC1311.mo2808(0L);
        C2793 c2793 = (C2793) c5304.mo449();
        C2793 c2793M5323 = c2793 != null ? c2793.m5323(jMo2808) : null;
        if (c2793M5323 != null) {
            this.f15319.requestRectangleOnScreen(new Rect((int) c2793M5323.f9343, (int) c2793M5323.f9342, (int) c2793M5323.f9341, (int) c2793M5323.f9344), false);
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
    }
}
