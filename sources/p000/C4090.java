package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ۦَْؗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4090 extends AbstractC0734 {

    /* JADX INFO: renamed from: ۥُ */
    public final WindowInsets.Builder f13658;

    public C4090(C2639 c2639) {
        super(c2639);
        WindowInsets windowInsetsM4955 = c2639.m4955();
        this.f13658 = windowInsetsM4955 != null ? AbstractC3880.m6937(windowInsetsM4955) : AbstractC3880.m6931();
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥُ */
    public void mo1615(C5364 c5364) {
        this.f13658.setMandatorySystemGestureInsets(c5364.m9018());
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥّ */
    public void mo1616(C5364 c5364) {
        this.f13658.setStableInsets(c5364.m9018());
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥۗ */
    public C2639 mo1617() {
        m1619();
        C2639 c2639M4953 = C2639.m4953(this.f13658.build(), null);
        C5364[] c5364Arr = this.f2673;
        C3470 c3470 = c2639M4953.f8768;
        c3470.mo2744(c5364Arr);
        c3470.mo2755(null);
        c3470.mo2745(this.f2672);
        c3470.mo2737(this.f2675);
        return c2639M4953;
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۥۜ */
    public void mo1618(C5364 c5364) {
        this.f13658.setSystemWindowInsets(c5364.m9018());
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۦٛ */
    public void mo1621(C5364 c5364) {
        this.f13658.setTappableElementInsets(c5364.m9018());
    }

    @Override // p000.AbstractC0734
    /* JADX INFO: renamed from: ۦۙ */
    public void mo1622(C5364 c5364) {
        this.f13658.setSystemGestureInsets(c5364.m9018());
    }

    public C4090() {
        this.f13658 = AbstractC3880.m6931();
    }
}
