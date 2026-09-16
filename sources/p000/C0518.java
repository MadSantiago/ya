package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: ۥُؖؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0518 extends CharacterStyle {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f1844;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f1845;

    public C0518(boolean z, boolean z2) {
        this.f1845 = z;
        this.f1844 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f1845);
        textPaint.setStrikeThruText(this.f1844);
    }
}
