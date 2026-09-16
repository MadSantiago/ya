package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: ۦٝؕٞۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4750 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥْ */
    public final Runnable f15681;

    /* JADX INFO: renamed from: ۦ۟ */
    public ViewTreeObserver f15682;

    /* JADX INFO: renamed from: ۦۨ */
    public final View f15683;

    public ViewTreeObserverOnPreDrawListenerC4750(View view, Runnable runnable) {
        this.f15683 = view;
        this.f15682 = view.getViewTreeObserver();
        this.f15681 = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f15682.isAlive();
        View view = this.f15683;
        if (zIsAlive) {
            this.f15682.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f15681.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15682 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f15682.isAlive();
        View view2 = this.f15683;
        if (zIsAlive) {
            this.f15682.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
