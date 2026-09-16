package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: ۦْۣٙؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4478 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f14784;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C0838 f14785;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f14786;

    public C4478(C5728 c5728, C0838 c0838, boolean z) {
        this.f14786 = c5728;
        this.f14785 = c0838;
        this.f14784 = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iM7050 = AbstractC3925.m7050(canvas, charSequence);
        float textSize = paint.getTextSize();
        C0838 c0838 = this.f14785;
        c0838.f2992 = iM7050;
        c0838.f2996 = textSize;
        if (c0838.f2995) {
            c0838.m1748();
        }
        if (c0838.m1749()) {
            int i6 = i5 - c0838.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                c0838.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fAscent = (int) ((((i5 - i3) / 2) + i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.f14784) {
            paint.setUnderlineText(this.f14786.f18876);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i, i2, f, fAscent, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C0838 c0838 = this.f14785;
        if (!c0838.m1749()) {
            if (this.f14784) {
                paint.setUnderlineText(this.f14786.f18876);
                if (paint instanceof TextPaint) {
                    paint.setColor(((TextPaint) paint).linkColor);
                }
            }
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = c0838.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
