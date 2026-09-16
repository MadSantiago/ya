package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ۦٕؕۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3315 extends C1297 {

    /* JADX INFO: renamed from: ۥَ */
    public C5364 f11105;

    public C3315(C2639 c2639, C3315 c3315) {
        super(c2639, c3315);
        this.f11105 = null;
        this.f11105 = c3315.f11105;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥؖ */
    public void mo3534(C5364 c5364) {
        this.f11105 = c5364;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥؗ */
    public C2639 mo6091() {
        return C2639.m4953(this.f4410.consumeSystemWindowInsets(), null);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥَ */
    public boolean mo6092() {
        return this.f4410.isConsumed();
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۥۗ */
    public C2639 mo6093() {
        return C2639.m4953(this.f4410.consumeStableInsets(), null);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦؚ */
    public final C5364 mo6094() {
        C5364 c5364 = this.f11105;
        if (c5364 != null) {
            return c5364;
        }
        WindowInsets windowInsets = this.f4410;
        C5364 c5364M9014 = C5364.m9014(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.f11105 = c5364M9014;
        return c5364M9014;
    }

    public C3315(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
        this.f11105 = null;
    }
}
