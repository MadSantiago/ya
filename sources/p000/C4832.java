package p000;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* JADX INFO: renamed from: ۦٟؑ۟ؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4832 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4832 f15921 = new C4832();

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8203(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsTypes(i);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8204(WindowManager.LayoutParams layoutParams, int i) {
        layoutParams.setFitInsetsSides(i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m8205(Window window) {
        WindowMetrics currentWindowMetrics = window.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }
}
