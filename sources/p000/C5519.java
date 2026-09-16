package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ۦۢؒۙٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5519 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final Paint f18224 = AbstractC3185.f10704;

    /* JADX INFO: renamed from: ۥٓ */
    public int f18225;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f18226;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f18227;

    public C5519(C5728 c5728, String str) {
        this.f18227 = c5728;
        this.f18226 = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && AbstractC1605.m3357(charSequence, this, i6)) {
            Paint paint2 = this.f18224;
            paint2.set(paint);
            C5728 c5728 = this.f18227;
            c5728.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = c5728.f18877;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.f18226;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = c5728.f18874;
            if (iMeasureText > i10) {
                this.f18225 = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.f18225 = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.f18225, this.f18227.f18874);
    }
}
