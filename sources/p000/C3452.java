package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: ۦؚؗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3452 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC3904 f11463;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11464;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3452(ViewTreeObserverOnGlobalFocusChangeListenerC3904 viewTreeObserverOnGlobalFocusChangeListenerC3904, int i) {
        super(1);
        this.f11464 = i;
        this.f11463 = viewTreeObserverOnGlobalFocusChangeListenerC3904;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11464;
        C2358 c2358 = C2358.f7817;
        ViewTreeObserverOnGlobalFocusChangeListenerC3904 viewTreeObserverOnGlobalFocusChangeListenerC3904 = this.f11463;
        switch (i) {
            case 0:
                C2294 c2294 = (C2294) obj;
                View viewM7159 = AbstractC4009.m7159(viewTreeObserverOnGlobalFocusChangeListenerC3904);
                if (!viewM7159.isFocused() && !viewM7159.hasFocus()) {
                    InterfaceC0475 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(viewTreeObserverOnGlobalFocusChangeListenerC3904)).getFocusOwner();
                    View viewM7803 = AbstractC4489.m7803(viewTreeObserverOnGlobalFocusChangeListenerC3904);
                    Integer numM5403 = AbstractC2840.m5403(c2294.f7622);
                    int[] iArr = new int[2];
                    viewM7803.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewM7159.getLocationOnScreen(iArr2);
                    C3468 c3468M7060 = AbstractC3925.m7060(((C2016) focusOwner).f6637);
                    Rect rect = null;
                    C2793 c2793M7032 = c3468M7060 != null ? AbstractC3925.m7032(c3468M7060) : null;
                    if (c2793M7032 != null) {
                        int i2 = (int) c2793M7032.f9343;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) c2793M7032.f9342;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) c2793M7032.f9341) + i3) - i4, (((int) c2793M7032.f9344) + i6) - i7);
                    }
                    if (!AbstractC2840.m5404(viewM7159, numM5403, rect)) {
                        c2294.f7621 = true;
                    }
                }
                break;
            default:
                AbstractC4009.m7159(viewTreeObserverOnGlobalFocusChangeListenerC3904);
                break;
        }
        return c2358;
    }
}
