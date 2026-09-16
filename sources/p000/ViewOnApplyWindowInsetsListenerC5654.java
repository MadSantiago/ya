package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦّٟۤؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC5654 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۥۗ */
    public C2639 f18615;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC2758 f18616;

    public ViewOnApplyWindowInsetsListenerC5654(View view, AbstractC2758 abstractC2758) {
        C2639 c2639Mo1617;
        this.f18616 = abstractC2758;
        WeakHashMap weakHashMap = AbstractC3608.f12013;
        C2639 c2639M8350 = AbstractC4969.m8350(view);
        if (c2639M8350 != null) {
            int i = Build.VERSION.SDK_INT;
            c2639Mo1617 = (i >= 36 ? new C1462(c2639M8350) : i >= 35 ? new C5386(c2639M8350) : i >= 34 ? new C1756(c2639M8350) : i >= 31 ? new C4277(c2639M8350) : i >= 30 ? new C2973(c2639M8350) : i >= 29 ? new C4090(c2639M8350) : new C3399(c2639M8350)).mo1617();
        } else {
            c2639Mo1617 = null;
        }
        this.f18615 = c2639Mo1617;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f18615 = C2639.m4953(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        C2639 c2639M4953 = C2639.m4953(windowInsets, view);
        C3470 c3470 = c2639M4953.f8768;
        C2639 c2639M8350 = this.f18615;
        if (c2639M8350 == null) {
            WeakHashMap weakHashMap = AbstractC3608.f12013;
            c2639M8350 = AbstractC4969.m8350(view);
            this.f18615 = c2639M8350;
        }
        if (c2639M8350 == null) {
            this.f18615 = c2639M4953;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            AbstractC2758 abstractC2758M4324 = C2275.m4324(view);
            if (abstractC2758M4324 == null || !Objects.equals((C2639) abstractC2758M4324.f9135, c2639M4953)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                C2639 c2639 = this.f18615;
                int i = 1;
                while (i <= 512) {
                    C5364 c5364Mo2752 = c3470.mo2752(i);
                    C5364 c5364Mo2753 = c2639.f8768.mo2752(i);
                    int i2 = c5364Mo2752.f17695;
                    int i3 = c5364Mo2752.f17696;
                    int i4 = c5364Mo2752.f17693;
                    int i5 = c5364Mo2752.f17694;
                    int i6 = c5364Mo2753.f17695;
                    int i7 = c5364Mo2753.f17696;
                    int[] iArr3 = iArr;
                    int i8 = c5364Mo2753.f17693;
                    int i9 = c5364Mo2753.f17694;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f18615 = c2639M4953;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    C2639 c26310 = this.f18615;
                    if ((i10 & 8) != 0) {
                        interpolator = C2275.f7554;
                    } else if ((i11 & 8) != 0) {
                        interpolator = C2275.f7555;
                    } else if ((i10 & 519) != 0) {
                        interpolator = C2275.f7557;
                    } else {
                        interpolator = (i11 & 519) != 0 ? C2275.f7556 : null;
                    }
                    C0460 c0460 = new C0460(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    c0460.f1659.mo8770(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0460.f1659.mo8771());
                    C5364 c5364Mo2754 = c3470.mo2752(i12);
                    C5364 c5364Mo2755 = c26310.f8768.mo2752(i12);
                    int iMin = Math.min(c5364Mo2754.f17695, c5364Mo2755.f17695);
                    int i13 = c5364Mo2754.f17694;
                    int i14 = c5364Mo2755.f17694;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = c5364Mo2754.f17693;
                    int i16 = c5364Mo2755.f17693;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = c5364Mo2754.f17696;
                    int i18 = c5364Mo2755.f17696;
                    C2346 c2346 = new C2346(16, C5364.m9014(iMin, iMin2, iMin3, Math.min(i17, i18)), C5364.m9014(Math.max(c5364Mo2754.f17695, c5364Mo2755.f17695), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    C2275.m4326(view, c0460, c2639M4953, false);
                    duration.addUpdateListener(new C0640(c0460, c2639M4953, c26310, i12, view));
                    duration.addListener(new C1906(c0460, view));
                    RunnableC1948 runnableC1948 = new RunnableC1948(view, c0460, c2346, duration, 1, false);
                    if (view != null) {
                        ViewTreeObserverOnPreDrawListenerC4750 viewTreeObserverOnPreDrawListenerC4750 = new ViewTreeObserverOnPreDrawListenerC4750(view, runnableC1948);
                        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4750);
                        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC4750);
                    } else {
                        C0178.m387("view == null");
                    }
                    this.f18615 = c2639M4953;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
