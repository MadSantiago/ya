package p000;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: ۥٕۖؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2078 {
    /* JADX INFO: renamed from: ۥۗ */
    public static void m4022(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4023(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }
}
