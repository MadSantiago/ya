package p000;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ۦۨؗۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5902 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Interpolator f19456;

    /* JADX INFO: renamed from: ۥۗ */
    public float f19457;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f19458;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f19459;

    public AbstractC5902(int i, Interpolator interpolator, long j) {
        this.f19458 = i;
        this.f19456 = interpolator;
        this.f19459 = j;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public float mo8769() {
        float f = this.f19457;
        Interpolator interpolator = this.f19456;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    /* JADX INFO: renamed from: ۥُ */
    public void mo8770(float f) {
        this.f19457 = f;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public long mo8771() {
        return this.f19459;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public float mo8772() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public int mo8773() {
        return this.f19458;
    }
}
