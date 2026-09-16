package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: ۥٌٖؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1479 extends CharacterStyle {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f5030;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f5031;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f5032;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f5033;

    public C1479(float f, float f2, float f3, int i) {
        this.f5032 = i;
        this.f5031 = f;
        this.f5030 = f2;
        this.f5033 = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f5033, this.f5031, this.f5030, this.f5032);
    }
}
