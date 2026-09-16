package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٜؗؕۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1844 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6120;

    /* JADX INFO: renamed from: ۥۗ */
    public final TextDirectionHeuristic f6121;

    /* JADX INFO: renamed from: ۥۣ */
    public final TextPaint f6122;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f6123;

    public C1844(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f6122 = textPaint;
        this.f6121 = textDirectionHeuristic;
        this.f6120 = i;
        this.f6123 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1844)) {
            return false;
        }
        C1844 c1844 = (C1844) obj;
        int i = c1844.f6120;
        TextPaint textPaint = c1844.f6122;
        if (this.f6120 != i || this.f6123 != c1844.f6123) {
            return false;
        }
        TextPaint textPaint2 = this.f6122;
        if (textPaint2.getTextSize() != textPaint.getTextSize() || textPaint2.getTextScaleX() != textPaint.getTextScaleX() || textPaint2.getTextSkewX() != textPaint.getTextSkewX() || textPaint2.getLetterSpacing() != textPaint.getLetterSpacing() || !TextUtils.equals(textPaint2.getFontFeatureSettings(), textPaint.getFontFeatureSettings()) || textPaint2.getFlags() != textPaint.getFlags() || !textPaint2.getTextLocales().equals(textPaint.getTextLocales())) {
            return false;
        }
        if (textPaint2.getTypeface() == null) {
            if (textPaint.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint2.getTypeface().equals(textPaint.getTypeface())) {
            return false;
        }
        return this.f6121 == c1844.f6121;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f6122;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f6121, Integer.valueOf(this.f6120), Integer.valueOf(this.f6123));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f6122;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f6121);
        sb.append(", breakStrategy=" + this.f6120);
        sb.append(", hyphenationFrequency=" + this.f6123);
        sb.append("}");
        return sb.toString();
    }

    public C1844(PrecomputedText.Params params) {
        this.f6122 = params.getTextPaint();
        this.f6121 = params.getTextDirection();
        this.f6120 = params.getBreakStrategy();
        this.f6123 = params.getHyphenationFrequency();
    }
}
