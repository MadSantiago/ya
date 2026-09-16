package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: ۦٕۗؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4942 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥۣ */
    public final Drawable.ConstantState f16361;

    public C4942(Drawable.ConstantState constantState) {
        this.f16361 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f16361.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f16361.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3603 c3603 = new C3603();
        c3603.f5376 = (VectorDrawable) this.f16361.newDrawable();
        return c3603;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C3603 c3603 = new C3603();
        c3603.f5376 = (VectorDrawable) this.f16361.newDrawable(resources);
        return c3603;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C3603 c3603 = new C3603();
        c3603.f5376 = (VectorDrawable) this.f16361.newDrawable(resources, theme);
        return c3603;
    }
}
