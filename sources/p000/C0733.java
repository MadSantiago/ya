package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥؙؕٗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0733 implements Drawable.Callback {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f2670;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2671;

    public /* synthetic */ C0733(int i, Object obj) {
        this.f2671 = i;
        this.f2670 = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i = this.f2671;
        Object obj = this.f2670;
        switch (i) {
            case 0:
                ((C3494) obj).invalidateSelf();
                break;
            default:
                ((RunnableC0731) obj).run();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f2671) {
            case 0:
                ((C3494) this.f2670).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f2671) {
            case 0:
                ((C3494) this.f2670).unscheduleSelf(runnable);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m1612(Drawable drawable, Runnable runnable) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m1613(Drawable drawable, Runnable runnable, long j) {
    }
}
