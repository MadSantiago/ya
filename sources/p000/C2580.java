package p000;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۥؚۡؗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2580 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥؗ */
    public ArrayList f8621;

    /* JADX INFO: renamed from: ۥۗ */
    public AnimatorSet f8622;

    /* JADX INFO: renamed from: ۥۣ */
    public C3603 f8623;

    /* JADX INFO: renamed from: ۦؑ */
    public C4461 f8624;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
