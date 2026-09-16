package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: ۦۚؓۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5165 extends AbstractC5902 {

    /* JADX INFO: renamed from: ۥُ */
    public final WindowInsetsAnimation f17102;

    public C5165(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f17102 = windowInsetsAnimation;
    }

    @Override // p000.AbstractC5902
    /* JADX INFO: renamed from: ۥؗ */
    public final float mo8769() {
        return this.f17102.getInterpolatedFraction();
    }

    @Override // p000.AbstractC5902
    /* JADX INFO: renamed from: ۥُ */
    public final void mo8770(float f) {
        this.f17102.setFraction(f);
    }

    @Override // p000.AbstractC5902
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo8771() {
        return this.f17102.getDurationMillis();
    }

    @Override // p000.AbstractC5902
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo8772() {
        return this.f17102.getAlpha();
    }

    @Override // p000.AbstractC5902
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo8773() {
        return this.f17102.getTypeMask();
    }
}
