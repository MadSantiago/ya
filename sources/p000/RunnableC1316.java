package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: ۥّٔؑۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1316 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractViewOnTouchListenerC5472 f4536;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4537;

    public /* synthetic */ RunnableC1316(AbstractViewOnTouchListenerC5472 abstractViewOnTouchListenerC5472, int i) {
        this.f4537 = i;
        this.f4536 = abstractViewOnTouchListenerC5472;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4537;
        AbstractViewOnTouchListenerC5472 abstractViewOnTouchListenerC5472 = this.f4536;
        switch (i) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC5472.f18053.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                abstractViewOnTouchListenerC5472.m9167();
                View view = abstractViewOnTouchListenerC5472.f18053;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC5472.mo5072()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC5472.f18056 = true;
                    break;
                }
                break;
        }
    }
}
