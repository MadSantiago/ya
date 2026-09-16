package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦِٙؔۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4488 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC3388 f14833;

    /* JADX INFO: renamed from: ۦِ */
    public float f14837;

    /* JADX INFO: renamed from: ۥؗ */
    public ColorStateList f14828 = null;

    /* JADX INFO: renamed from: ۦؑ */
    public ColorStateList f14834 = null;

    /* JADX INFO: renamed from: ۥُ */
    public ColorStateList f14829 = null;

    /* JADX INFO: renamed from: ۥّ */
    public PorterDuff.Mode f14830 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۦۙ */
    public Rect f14840 = null;

    /* JADX INFO: renamed from: ۥۜ */
    public float f14832 = 1.0f;

    /* JADX INFO: renamed from: ۦٛ */
    public float f14838 = 1.0f;

    /* JADX INFO: renamed from: ۦۗ */
    public int f14839 = 255;

    /* JADX INFO: renamed from: ۦؚ */
    public float f14835 = 0.0f;

    /* JADX INFO: renamed from: ۦٌ */
    public float f14836 = 0.0f;

    /* JADX INFO: renamed from: ۦۚ */
    public int f14841 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public int f14843 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public Paint.Style f14842 = Paint.Style.FILL_AND_STROKE;

    /* JADX INFO: renamed from: ۥۗ */
    public C1104 f14831 = null;

    public C4488(InterfaceC3388 interfaceC3388) {
        this.f14833 = interfaceC3388;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3472 c3472 = new C3472(this);
        c3472.f11528 = true;
        c3472.f11543 = true;
        return c3472;
    }
}
