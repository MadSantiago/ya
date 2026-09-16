package p000;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: ۥۢؒۜۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2602 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C0990 f8693;

    public ViewOnTouchListenerC2602(C0990 c0990) {
        this.f8693 = c0990;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0990 c0990 = this.f8693;
        RunnableC4307 runnableC4307 = c0990.f3503;
        Handler handler = c0990.f3507;
        C2245 c2245 = c0990.f3515;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && c2245 != null && c2245.isShowing() && x >= 0 && x < c2245.getWidth() && y >= 0 && y < c2245.getHeight()) {
            handler.postDelayed(runnableC4307, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC4307);
        return false;
    }
}
