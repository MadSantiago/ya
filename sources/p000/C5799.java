package p000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۦۧؑؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5799 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f19109;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19110;

    public /* synthetic */ C5799(int i, Object obj) {
        this.f19110 = i;
        this.f19109 = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f19110;
        Object obj = this.f19109;
        switch (i) {
            case 0:
                C5728 c5728 = (C5728) obj;
                int i2 = c5728.f18873;
                if (i2 != 0) {
                    textPaint.setColor(i2);
                }
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                int iM5177 = c5728.f18881;
                if (iM5177 == 0) {
                    iM5177 = AbstractC2774.m5177(textPaint.getColor(), 25);
                }
                textPaint.bgColor = iM5177;
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.f19110;
        Object obj = this.f19109;
        switch (i) {
            case 0:
                int i2 = ((C5728) obj).f18873;
                if (i2 != 0) {
                    textPaint.setColor(i2);
                }
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
