package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: ۥؗۙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0640 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C2639 f2398;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ View f2399;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C2639 f2400;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0460 f2401;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f2402;

    public C0640(C0460 c0460, C2639 c2639, C2639 c26310, int i, View view) {
        this.f2401 = c0460;
        this.f2400 = c2639;
        this.f2398 = c26310;
        this.f2402 = i;
        this.f2399 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC0734 c4090;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0460 c0460 = this.f2401;
        AbstractC5902 abstractC5902 = c0460.f1659;
        abstractC5902.mo8770(animatedFraction);
        float fMo8769 = abstractC5902.mo8769();
        PathInterpolator pathInterpolator = C2275.f7554;
        int i = Build.VERSION.SDK_INT;
        C2639 c2639 = this.f2400;
        if (i >= 36) {
            c4090 = new C1462(c2639);
        } else if (i >= 35) {
            c4090 = new C5386(c2639);
        } else if (i >= 34) {
            c4090 = new C1756(c2639);
        } else if (i >= 31) {
            c4090 = new C4277(c2639);
        } else if (i >= 30) {
            c4090 = new C2973(c2639);
        } else {
            c4090 = i >= 29 ? new C4090(c2639) : new C3399(c2639);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f2402 & i2;
            C3470 c3470 = c2639.f8768;
            if (i3 == 0) {
                c4090.mo1620(i2, c3470.mo2752(i2));
            } else {
                C5364 c5364Mo2752 = c3470.mo2752(i2);
                C5364 c5364Mo2753 = this.f2398.f8768.mo2752(i2);
                float f = 1.0f - fMo8769;
                c4090.mo1620(i2, C2639.m4954(c5364Mo2752, (int) (((double) ((c5364Mo2752.f17695 - c5364Mo2753.f17695) * f)) + 0.5d), (int) (((double) ((c5364Mo2752.f17694 - c5364Mo2753.f17694) * f)) + 0.5d), (int) (((double) ((c5364Mo2752.f17693 - c5364Mo2753.f17693) * f)) + 0.5d), (int) (((double) ((c5364Mo2752.f17696 - c5364Mo2753.f17696) * f)) + 0.5d)));
            }
        }
        C2275.m4323(this.f2399, c4090.mo1617(), Collections.singletonList(c0460));
    }
}
