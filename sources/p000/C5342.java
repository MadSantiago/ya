package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۦؚٕ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5342 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable.ConstantState f17598;

    public C5342(Drawable.ConstantState constantState) {
        this.f17598 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f17598.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f17598.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3494 c3494 = new C3494(null);
        Drawable drawableNewDrawable = this.f17598.newDrawable();
        c3494.f5376 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3494.f11595);
        return c3494;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C3494 c3494 = new C3494(null);
        Drawable drawableNewDrawable = this.f17598.newDrawable(resources);
        c3494.f5376 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3494.f11595);
        return c3494;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C3494 c3494 = new C3494(null);
        Drawable drawableNewDrawable = this.f17598.newDrawable(resources, theme);
        c3494.f5376 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c3494.f11595);
        return c3494;
    }
}
