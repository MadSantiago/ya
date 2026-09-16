package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۦؙۛؕۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5232 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f17263;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Rect f17262 = AbstractC3185.f10706;

    /* JADX INFO: renamed from: ۥْ */
    public final Paint f17261 = AbstractC3185.f10704;

    public C5232(C5728 c5728) {
        this.f17263 = c5728;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f17261;
        paint2.setStyle(style);
        int iM5177 = this.f17263.f18881;
        if (iM5177 == 0) {
            iM5177 = AbstractC2774.m5177(paint.getColor(), 25);
        }
        paint2.setColor(iM5177);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        Rect rect = this.f17262;
        rect.set(i, i3, width, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f17263.f18875;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f17263.f18873;
        if (i != 0) {
            textPaint.setColor(i);
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f17263.f18873;
        if (i != 0) {
            textPaint.setColor(i);
        }
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
