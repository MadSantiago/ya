package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥٍْۚؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2275 extends AbstractC5902 {

    /* JADX INFO: renamed from: ۥُ */
    public static final PathInterpolator f7554 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: ۥّ */
    public static final InterpolatorC5824 f7555 = new InterpolatorC5824();

    /* JADX INFO: renamed from: ۦۙ */
    public static final DecelerateInterpolator f7557 = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: ۥۜ */
    public static final AccelerateInterpolator f7556 = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: ۥّ */
    public static void m4322(C0460 c0460, View view) {
        AbstractC2758 abstractC2758M4324 = m4324(view);
        if (abstractC2758M4324 != null) {
            abstractC2758M4324.mo283(c0460);
            if (abstractC2758M4324.f9136 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4322(c0460, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m4323(View view, C2639 c2639, List list) {
        AbstractC2758 abstractC2758M4324 = m4324(view);
        if (abstractC2758M4324 != null) {
            c2639 = abstractC2758M4324.mo281(c2639, list);
            if (abstractC2758M4324.f9136 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4323(viewGroup.getChildAt(i), c2639, list);
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public static AbstractC2758 m4324(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC5654) {
            return ((ViewOnApplyWindowInsetsListenerC5654) tag).f18616;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m4325(View view, C0460 c0460, C2346 c2346) {
        AbstractC2758 abstractC2758M4324 = m4324(view);
        if (abstractC2758M4324 != null) {
            abstractC2758M4324.mo282(c0460, c2346);
            if (abstractC2758M4324.f9136 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4325(viewGroup.getChildAt(i), c0460, c2346);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m4326(View view, C0460 c0460, C2639 c2639, boolean z) {
        AbstractC2758 abstractC2758M4324 = m4324(view);
        if (abstractC2758M4324 != null) {
            abstractC2758M4324.f9135 = c2639;
            if (!z) {
                abstractC2758M4324.mo280(c0460);
                z = abstractC2758M4324.f9136 == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m4326(viewGroup.getChildAt(i), c0460, c2639, z);
            }
        }
    }
}
