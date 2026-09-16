package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: ۦًۨؖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5889 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f19425;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f19425 = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i3 = (fontMetricsInt2 != null ? fontMetricsInt2 : null).descent;
        if (fontMetricsInt2 == null) {
            fontMetricsInt2 = null;
        }
        if (i3 > fontMetricsInt2.ascent) {
            throw null;
        }
        AbstractC3767.m6644("Invalid fontMetrics: line height can not be negative.");
        throw null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m9721() {
        if (this.f19425) {
            return 0;
        }
        AbstractC3767.m6643("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
