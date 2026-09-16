package p000;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ۦؘؑؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3027 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f10189;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10190;

    public /* synthetic */ RunnableC3027(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, int i) {
        this.f10190 = i;
        this.f10189 = viewTreeObserverOnGlobalLayoutListenerC0850;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10190;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f10189;
        switch (i) {
            case 0:
                C5219 c5219 = viewTreeObserverOnGlobalLayoutListenerC0850.f3084;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c5219.isEmpty()) {
                    try {
                        ((InterfaceC4448) c5219.removeLast()).mo449();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC0850.f3057 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0850.f3108;
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.m1788(motionEvent);
                    return;
                } else {
                    C1078.m2276("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ViewTreeObserverOnGlobalLayoutListenerC0850.m1767(viewTreeObserverOnGlobalLayoutListenerC0850.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0850.m1767(viewTreeObserverOnGlobalLayoutListenerC0850.getRoot());
                return;
        }
    }
}
