package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: ۥٌٜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0923 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۥٓ */
    public final int f3305;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f3307;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Rect f3306 = AbstractC3185.f10706;

    /* JADX INFO: renamed from: ۥْ */
    public final Paint f3304 = AbstractC3185.f10704;

    public C0923(C5728 c5728, int i) {
        this.f3307 = c5728;
        this.f3305 = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f3305;
        if ((i8 == 1 || i8 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i7) {
            Paint paint2 = this.f3304;
            paint2.set(paint);
            C5728 c5728 = this.f3307;
            int iM5177 = c5728.f18878;
            if (iM5177 == 0) {
                iM5177 = AbstractC2774.m5177(paint2.getColor(), 75);
            }
            paint2.setColor(iM5177);
            paint2.setStyle(Paint.Style.FILL);
            int i9 = c5728.f18879;
            if (i9 >= 0) {
                paint2.setStrokeWidth(i9);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i10 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                Rect rect = this.f3306;
                rect.set(i, i10, width, i5);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m1899(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m1899(textPaint);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1899(TextPaint textPaint) {
        this.f3307.getClass();
        textPaint.setFakeBoldText(true);
        int i = this.f3305;
        float[] fArr = C5728.f18870;
        if (6 >= i) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i - 1]);
            return;
        }
        Locale locale = Locale.US;
        throw new IllegalStateException("Supplied heading level: " + i + " is invalid, where configured heading sizes are: `" + Arrays.toString(fArr) + "`");
    }
}
