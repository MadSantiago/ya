package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥ٘ؔٓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 extends Drawable {

    /* JADX INFO: renamed from: ۥُ */
    public final Paint f5292;

    /* JADX INFO: renamed from: ۥّ */
    public final Path f5293;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f5294;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5295;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f5297;

    /* JADX INFO: renamed from: ۥؗ */
    public final Paint f5291 = new Paint(1);

    /* JADX INFO: renamed from: ۦؑ */
    public final RectF f5296 = new RectF();

    static {
        new C4452(0.3888889f, 0.6944444f);
        new C4452(0.8472222f, 0.2638889f);
    }

    public C1571(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.f5292 = paint;
        this.f5293 = new Path();
        this.f5295 = i;
        this.f5294 = i2;
        paint.setColor(i3);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint.Style style;
        int i;
        if (this.f5297) {
            style = Paint.Style.FILL_AND_STROKE;
            i = this.f5295;
        } else {
            style = Paint.Style.STROKE;
            i = this.f5294;
        }
        Paint paint = this.f5291;
        paint.setStyle(style);
        paint.setColor(i);
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        RectF rectF = this.f5296;
        float fWidth2 = (fWidth - rectF.width()) / 2.0f;
        float fHeight = (bounds.height() - rectF.height()) / 2.0f;
        float fWidth3 = rectF.width() / 8.0f;
        int iSave = canvas.save();
        try {
            canvas.translate(fWidth2, fHeight);
            canvas.drawRoundRect(rectF, fWidth3, fWidth3, paint);
            if (this.f5297) {
                canvas.drawPath(this.f5293, this.f5292);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fMin = Math.min(rect.width(), rect.height());
        float f = fMin / 8.0f;
        float f2 = fMin - f;
        this.f5296.set(0.0f, 0.0f, f2, f2);
        this.f5291.setStrokeWidth(f);
        this.f5292.setStrokeWidth(f);
        Path path = this.f5293;
        path.reset();
        path.moveTo(0.15277778f * f2, 0.45833334f * f2);
        path.lineTo(0.3888889f * f2, 0.6944444f * f2);
        path.lineTo(0.8472222f * f2, f2 * 0.2638889f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int length = iArr != null ? iArr.length : 0;
        if (length <= 0) {
            z = false;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (16842912 == iArr[i]) {
                z = true;
                break;
            }
            i++;
        }
        boolean z2 = z != this.f5297;
        if (z2) {
            invalidateSelf();
            this.f5297 = z;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5291.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5291.setColorFilter(colorFilter);
    }
}
