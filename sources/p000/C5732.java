package p000;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: ۦۦًؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5732 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f18895;

    /* JADX INFO: renamed from: ۥّ */
    public BoringLayout.Metrics f18897;

    /* JADX INFO: renamed from: ۥۗ */
    public final TextPaint f18898;

    /* JADX INFO: renamed from: ۥۜ */
    public CharSequence f18899;

    /* JADX INFO: renamed from: ۥۣ */
    public final CharSequence f18900;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f18902;

    /* JADX INFO: renamed from: ۦؑ */
    public float f18901 = Float.NaN;

    /* JADX INFO: renamed from: ۥُ */
    public float f18896 = Float.NaN;

    public C5732(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f18900 = charSequence;
        this.f18898 = textPaint;
        this.f18895 = i;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX INFO: renamed from: ۥؗ */
    public final float m9537() {
        if (!Float.isNaN(this.f18901)) {
            return this.f18901;
        }
        BoringLayout.Metrics metricsM9539 = m9539();
        float fCeil = metricsM9539 != null ? metricsM9539.width : -1;
        TextPaint textPaint = this.f18898;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(m9538(), 0, m9538().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f18900;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC1631.m3407(spanned, C2162.class) || AbstractC1631.m3407(spanned, C1110.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f18901 = fCeil;
        return fCeil;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final CharSequence m9538() {
        CharSequence charSequence = this.f18899;
        if (charSequence == null) {
            charSequence = this.f18900;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (AbstractC1631.m3407(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && characterStyleArr.length != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.f18899 = charSequence;
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final BoringLayout.Metrics m9539() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.f18902) {
            TextDirectionHeuristic textDirectionHeuristicM7426 = AbstractC4204.m7426(this.f18895);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f18900;
            TextPaint textPaint = this.f18898;
            if (i >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicM7426, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicM7426.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f18897 = metricsIsBoring;
            this.f18902 = true;
        }
        return this.f18897;
    }
}
