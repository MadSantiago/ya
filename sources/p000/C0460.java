package p000;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥًؕؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0460 {

    /* JADX INFO: renamed from: ۥۣ */
    public AbstractC5902 f1659;

    public C0460(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1659 = new C5165(AbstractC3769.m6668(i, interpolator, j));
        } else {
            this.f1659 = new C2275(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m977(View view, AbstractC2758 abstractC2758) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC2758 != null ? new C5864(abstractC2758) : null);
            return;
        }
        PathInterpolator pathInterpolator = C2275.f7554;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC5654 = abstractC2758 != null ? new ViewOnApplyWindowInsetsListenerC5654(view, abstractC2758) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC5654);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC5654);
        }
    }
}
