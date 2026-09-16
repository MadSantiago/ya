package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦٖۤٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5684 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f18686;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18687;

    public C5684(InterfaceC1953 interfaceC1953, View view) {
        this.f18687 = 3;
        this.f18686 = interfaceC1953;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.f18687;
        Object obj = this.f18686;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f82 = null;
                actionBarOverlayLayout.f83 = false;
                break;
            case 1:
            default:
                super.onAnimationCancel(animator);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.f334 = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((InterfaceC1953) obj).mo3066();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.f18687;
        Object obj = this.f18686;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.f82 = null;
                actionBarOverlayLayout.f83 = false;
                break;
            case 1:
                C3494 c3494 = (C3494) obj;
                ArrayList arrayList = new ArrayList(c3494.f11592);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2165) arrayList.get(i2)).m4219(c3494);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((InterfaceC1953) obj).mo526();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.f18687;
        Object obj = this.f18686;
        switch (i) {
            case 1:
                C3494 c3494 = (C3494) obj;
                ArrayList arrayList = new ArrayList(c3494.f11592);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2165) arrayList.get(i2)).m4218(c3494);
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                super.onAnimationStart(animator);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((InterfaceC1953) obj).mo3065();
                break;
        }
    }

    public /* synthetic */ C5684(int i, Object obj) {
        this.f18687 = i;
        this.f18686 = obj;
    }
}
