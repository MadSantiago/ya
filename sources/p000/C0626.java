package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ۥؗؖۦٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0626 extends EdgeEffect {

    /* JADX INFO: renamed from: ۥۗ */
    public float f2322;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f2323;

    public C0626(Context context) {
        super(context);
        this.f2323 = AbstractC4009.m7168(context).f1824 * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f2322 = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f2322 = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f2322 = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f2322 = 0.0f;
        super.onPull(f);
    }
}
