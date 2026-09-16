package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ۦٕؗؕۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4259 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final Rect f14110;

    /* JADX INFO: renamed from: ۥٓ */
    public final Paint f14111;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5728 f14112;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14113;

    public C4259(C5728 c5728, int i) {
        this.f14113 = i;
        switch (i) {
            case 1:
                this.f14110 = AbstractC3185.f10706;
                this.f14111 = AbstractC3185.f10704;
                this.f14112 = c5728;
                break;
            default:
                this.f14110 = AbstractC3185.f10706;
                this.f14111 = AbstractC3185.f10704;
                this.f14112 = c5728;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f14113;
        C5728 c5728 = this.f14112;
        Paint paint2 = this.f14111;
        Rect rect = this.f14110;
        switch (i8) {
            case 0:
                int i9 = c5728.f18871;
                if (i9 == 0) {
                    i9 = (int) ((c5728.f18874 * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                c5728.getClass();
                int iM5177 = AbstractC2774.m5177(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM5177);
                int i10 = i2 * i9;
                int i11 = i + i10;
                int i12 = i10 + i11;
                rect.set(Math.min(i11, i12), i3, Math.max(i11, i12), i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i13 = ((i5 - i3) / 2) + i3;
                paint2.set(paint);
                c5728.getClass();
                paint2.setColor(AbstractC2774.m5177(paint2.getColor(), 25));
                paint2.setStyle(Paint.Style.FILL);
                int i14 = c5728.f18880;
                if (i14 >= 0) {
                    paint2.setStrokeWidth(i14);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, i13 - strokeWidth, width, i13 + strokeWidth);
                canvas.drawRect(rect, paint2);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.f14113) {
            case 0:
                return this.f14112.f18874;
            default:
                return 0;
        }
    }
}
