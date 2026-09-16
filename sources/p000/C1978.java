package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۥٞٙ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1978 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6538;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6538) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f6538) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }
}
