package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۥؙٖؖٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1474 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f5015;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5016;

    public /* synthetic */ C1474(int i, float f) {
        this.f5016 = i;
        this.f5015 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f5016;
        float f = this.f5015;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f5016;
        float f = this.f5015;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
