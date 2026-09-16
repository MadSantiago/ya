package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: ۦٌۡؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5495 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = AbstractC4204.f13963;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM1938 = AbstractC0949.m1938(layout, lineForOffset, paint) + AbstractC0949.m1964(layout, lineForOffset, paint);
            if (fM1938 == 0.0f) {
                return;
            }
            canvas.translate(fM1938, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
