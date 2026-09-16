package p000;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* JADX INFO: renamed from: ۦٚؕۥۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4566 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4566 f15074 = new C4566();

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7946(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i2 = rect.top;
        int i3 = rect.bottom;
        return i - (i2 + (i3 > i ? i3 - i : 0));
    }
}
