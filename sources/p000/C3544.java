package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: renamed from: ۦؙؔٞۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3544 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: ۥْ */
    public final C4852 f11772 = AbstractC2774.m5183(new C3291(9205357640488583168L));

    /* JADX INFO: renamed from: ۥٓ */
    public final C5704 f11773 = AbstractC3004.m5600(new C0463(5, this));

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f11774;

    /* JADX INFO: renamed from: ۦۨ */
    public final C0714 f11775;

    public C3544(C0714 c0714, float f) {
        this.f11775 = c0714;
        this.f11774 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C5063.m8628(textPaint, this.f11774);
        textPaint.setShader((Shader) this.f11773.getValue());
    }
}
