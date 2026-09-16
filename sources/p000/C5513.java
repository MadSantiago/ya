package p000;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: ۦۢؑۨؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5513 implements Drawable.Callback {

    /* JADX INFO: renamed from: ۥْ */
    public Rect f18194;

    /* JADX INFO: renamed from: ۦ۟ */
    public final RunnableC3365 f18195;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2139 f18196;

    public C5513(C2139 c2139, RunnableC3365 runnableC3365, Rect rect) {
        this.f18196 = c2139;
        this.f18195 = runnableC3365;
        this.f18194 = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        C2139 c2139 = this.f18196;
        if (looperMyLooper != mainLooper) {
            c2139.post(new RunnableC4985(5, this, drawable, false));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (this.f18194.equals(bounds)) {
            c2139.postInvalidate();
            return;
        }
        RunnableC3365 runnableC3365 = this.f18195;
        C2139 c21310 = (C2139) runnableC3365.f11241;
        c21310.removeCallbacks(runnableC3365);
        c21310.post(runnableC3365);
        this.f18194 = new Rect(bounds);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f18196.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f18196.removeCallbacks(runnable);
    }
}
