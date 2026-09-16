package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: ۥٜۤؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2664 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ BottomSheetBehavior f8826;

    public C2664(BottomSheetBehavior bottomSheetBehavior) {
        this.f8826 = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C3472 c3472 = this.f8826.f313;
        if (c3472 != null) {
            C4488 c4488 = c3472.f11547;
            if (c4488.f14838 != fFloatValue) {
                c4488.f14838 = fFloatValue;
                c3472.f11528 = true;
                c3472.f11543 = true;
                c3472.invalidateSelf();
            }
        }
    }
}
