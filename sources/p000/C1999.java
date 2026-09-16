package p000;

import android.text.TextPaint;

/* JADX INFO: renamed from: ۥِٟؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1999 extends AbstractC2765 {

    /* JADX INFO: renamed from: ۥۤ */
    public final CharSequence f6586;

    /* JADX INFO: renamed from: ۦؒ */
    public final TextPaint f6587;

    public C1999(CharSequence charSequence, TextPaint textPaint) {
        this.f6586 = charSequence;
        this.f6587 = textPaint;
    }

    @Override // p000.AbstractC2765
    /* JADX INFO: renamed from: ۦٞ */
    public final int mo2900(int i) {
        CharSequence charSequence = this.f6586;
        return this.f6587.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // p000.AbstractC2765
    /* JADX INFO: renamed from: ۦٟ */
    public final int mo2901(int i) {
        CharSequence charSequence = this.f6586;
        return this.f6587.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
