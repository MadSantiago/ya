package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: ۦؕؖۜٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC3293 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C1829 f11029;

    public GestureDetectorOnGestureListenerC3293(C1829 c1829) {
        this.f11029 = c1829;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1829 c1829 = this.f11029;
        C1264 c1264 = (C1264) c1829.f6061;
        if (!c1829.f6063) {
            int i = c1829.f6062;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((C2016) c1264.f4332.getFocusOwner()).m3933(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((C2016) c1264.f4332.getFocusOwner()).m3933(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
