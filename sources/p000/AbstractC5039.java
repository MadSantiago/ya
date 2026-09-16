package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦْۘؖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5039 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m8554(View view, InterfaceC3662 interfaceC3662) {
        ViewOnApplyWindowInsetsListenerC5523 viewOnApplyWindowInsetsListenerC5523 = interfaceC3662 != null ? new ViewOnApplyWindowInsetsListenerC5523(view, interfaceC3662) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC5523);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC5523 != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC5523);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C2639 m8555(View view, C2639 c2639, Rect rect) {
        WindowInsets windowInsetsM4955 = c2639.m4955();
        if (windowInsetsM4955 != null) {
            return C2639.m4953(view.computeSystemWindowInsets(windowInsetsM4955, rect), view);
        }
        rect.setEmpty();
        return c2639;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m8556(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
}
