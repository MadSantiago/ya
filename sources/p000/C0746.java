package p000;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥؙؗؒؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0746 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: ۥَ */
    public float f2707 = 1.0f;

    /* JADX INFO: renamed from: ۥْ */
    public float f2708;

    /* JADX INFO: renamed from: ۥٓ */
    public float f2709;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f2710;

    /* JADX INFO: renamed from: ۦۨ */
    public final Drawable f2711;

    public C0746(Drawable drawable, int i) {
        this.f2711 = drawable;
        this.f2710 = i;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f2708, this.f2709);
            float f = this.f2707;
            canvas.scale(f, f);
            this.f2711.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2711.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f2711.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2711.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2711.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f2711.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f2711;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2711;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f2708 = 0.0f;
            this.f2709 = 0.0f;
            this.f2707 = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM5783 = C3133.m5783(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f2710);
        int iM5229 = AbstractC2776.m5229((((double) iWidth) - (((double) intrinsicWidth) * dM5783)) / 2.0d);
        int iM52210 = AbstractC2776.m5229((((double) iHeight) - (((double) intrinsicHeight) * dM5783)) / 2.0d);
        drawable.setBounds(iM5229, iM52210, intrinsicWidth + iM5229, intrinsicHeight + iM52210);
        this.f2708 = rect.left;
        this.f2709 = rect.top;
        this.f2707 = (float) dM5783;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f2711.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return this.f2711.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2711.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2711.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f2711.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        this.f2711.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f2711.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f2711.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f2711;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f2711;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
