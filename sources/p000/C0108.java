package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: ۥؐؑۨٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0108 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥؗ */
    public ColorStateList f425;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f426;

    /* JADX INFO: renamed from: ۥّ */
    public Bitmap f427;

    /* JADX INFO: renamed from: ۥۗ */
    public C5738 f428;

    /* JADX INFO: renamed from: ۥۜ */
    public PorterDuff.Mode f429;

    /* JADX INFO: renamed from: ۥۣ */
    public int f430;

    /* JADX INFO: renamed from: ۦؑ */
    public PorterDuff.Mode f431;

    /* JADX INFO: renamed from: ۦؚ */
    public Paint f432;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f433;

    /* JADX INFO: renamed from: ۦٛ */
    public int f434;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f435;

    /* JADX INFO: renamed from: ۦۙ */
    public ColorStateList f436;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f430;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C3603(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C3603(this);
    }
}
