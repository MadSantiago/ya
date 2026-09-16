package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥۢؓ٘٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2607 implements Drawable.Callback {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0838 f8698;

    /* JADX INFO: renamed from: ۦۨ */
    public final Drawable.Callback f8699;

    public C2607(C0838 c0838, Drawable.Callback callback) {
        this.f8698 = c0838;
        this.f8699 = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f8699.invalidateDrawable(this.f8698);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f8699.scheduleDrawable(this.f8698, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f8699.unscheduleDrawable(this.f8698, runnable);
    }
}
