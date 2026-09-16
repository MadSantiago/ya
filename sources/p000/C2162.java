package p000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۥْۘؔۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2162 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ۦۨ */
    public final float f7134;

    public C2162(float f) {
        this.f7134 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f7134 / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f7134 / textScaleX);
    }
}
