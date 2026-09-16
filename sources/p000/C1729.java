package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ۥٚؕؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1729 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۥَ */
    public final int f5754;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f5758;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Paint f5757 = AbstractC3185.f10704;

    /* JADX INFO: renamed from: ۥْ */
    public final RectF f5755 = AbstractC3185.f10705;

    /* JADX INFO: renamed from: ۥٓ */
    public final Rect f5756 = AbstractC3185.f10706;

    public C1729(C5728 c5728, int i) {
        this.f5758 = c5728;
        this.f5754 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        RectF rectF = this.f5755;
        Rect rect = this.f5756;
        if (z && AbstractC1605.m3357(charSequence, this, i6)) {
            Paint paint2 = this.f5757;
            paint2.set(paint);
            C5728 c5728 = this.f5758;
            c5728.getClass();
            int i8 = c5728.f18874;
            paint2.setColor(paint2.getColor());
            int i9 = c5728.f18877;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = c5728.f18872;
                if (i10 != 0 && i10 <= iMin) {
                    iMin = i10;
                }
                int i11 = (i8 - iMin) / 2;
                if (i2 <= 0) {
                    i -= i8;
                }
                int i12 = i + i11;
                int i13 = i12 + iMin;
                int iDescent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i14 = iMin + iDescent;
                int i15 = this.f5754;
                if (i15 == 0 || i15 == 1) {
                    rectF.set(i12, iDescent, i13, i14);
                    paint2.setStyle(i15 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i12, iDescent, i13, i14);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f5758.f18874;
    }
}
