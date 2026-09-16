package p000;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: ۥؘؘُ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2530 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3337 f8379;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2902 f8380;

    public C2530(C3337 c3337, ViewTreeObserverOnGlobalLayoutListenerC2902 viewTreeObserverOnGlobalLayoutListenerC2902) {
        this.f8379 = c3337;
        this.f8380 = viewTreeObserverOnGlobalLayoutListenerC2902;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f8379.f11165.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f8380);
        }
    }
}
