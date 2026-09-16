package p000;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ۦَؚٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4651 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f15342;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1571 f15343;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5728 f15344;

    /* JADX INFO: renamed from: ۥٓ */
    public static final int[] f15341 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۥَ */
    public static final int[] f15340 = new int[0];

    public C4651(C5728 c5728, C1571 c1571, boolean z) {
        this.f15344 = c5728;
        this.f15343 = c1571;
        this.f15342 = z;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        C1571 c1571 = this.f15343;
        if (z && AbstractC1605.m3357(charSequence, this, i6)) {
            float fDescent = paint.descent();
            float fAscent = paint.ascent();
            int iSave = canvas.save();
            try {
                int i8 = this.f15344.f18874;
                int i9 = (int) ((fDescent - fAscent) + 0.5f);
                int i10 = (int) ((i8 * 0.75f) + 0.5f);
                int i11 = (int) ((i9 * 0.75f) + 0.5f);
                c1571.setBounds(0, 0, i10, i11);
                c1571.setState(this.f15342 ? f15341 : f15340);
                canvas.translate(i2 > 0 ? i + ((i8 - i10) / 2) : (i - ((i8 - i10) / 2)) - i10, ((int) (i4 + fAscent + 0.5f)) + ((i9 - i11) / 2));
                c1571.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f15344.f18874;
    }
}
