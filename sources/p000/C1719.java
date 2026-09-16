package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ۥٚؓ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1719 extends C4722 {

    /* JADX INFO: renamed from: ۥٖ */
    public C5364 f5722;

    /* JADX INFO: renamed from: ۦٗ */
    public C5364 f5723;

    /* JADX INFO: renamed from: ۦۛ */
    public C5364 f5724;

    public C1719(C2639 c2639, WindowInsets windowInsets) {
        super(c2639, windowInsets);
        this.f5722 = null;
        this.f5723 = null;
        this.f5724 = null;
    }

    @Override // p000.C1297, p000.C3470
    /* JADX INFO: renamed from: ۥٓ */
    public C2639 mo2741(int i, int i2, int i3, int i4) {
        return C2639.m4953(this.f4410.inset(i, i2, i3, i4), null);
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦٌ */
    public C5364 mo3535() {
        C5364 c5364 = this.f5722;
        if (c5364 != null) {
            return c5364;
        }
        C5364 c5364M9017 = C5364.m9017(this.f4410.getSystemGestureInsets());
        this.f5722 = c5364M9017;
        return c5364M9017;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦۗ */
    public C5364 mo3536() {
        C5364 c5364 = this.f5723;
        if (c5364 != null) {
            return c5364;
        }
        C5364 c5364M9017 = C5364.m9017(this.f4410.getMandatorySystemGestureInsets());
        this.f5723 = c5364M9017;
        return c5364M9017;
    }

    @Override // p000.C3470
    /* JADX INFO: renamed from: ۦۨ */
    public C5364 mo3537() {
        C5364 c5364 = this.f5724;
        if (c5364 != null) {
            return c5364;
        }
        C5364 c5364M9017 = C5364.m9017(this.f4410.getTappableElementInsets());
        this.f5724 = c5364M9017;
        return c5364M9017;
    }

    public C1719(C2639 c2639, C1719 c1719) {
        super(c2639, c1719);
        this.f5722 = null;
        this.f5723 = null;
        this.f5724 = null;
    }

    @Override // p000.C3315, p000.C3470
    /* JADX INFO: renamed from: ۥؖ */
    public void mo3534(C5364 c5364) {
    }
}
