package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ۥۦۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2840 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final int[] f9486 = new int[2];

    /* JADX INFO: renamed from: ۥۗ */
    public static final Rect f9485 = new Rect();

    /* JADX INFO: renamed from: ۥؗ */
    public static final Integer m5403(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m5404(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC0850) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC0850) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2793 m5405(View view, View view2) {
        int[] iArr = f9486;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        Rect rect = f9485;
        view.getFocusedRect(rect);
        float f2 = (i - i3) + rect.left;
        return new C2793(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1057 m5406(int i) {
        if (i == 1) {
            return new C1057(2);
        }
        if (i == 2) {
            return new C1057(1);
        }
        if (i == 17) {
            return new C1057(3);
        }
        if (i == 33) {
            return new C1057(5);
        }
        if (i == 66) {
            return new C1057(4);
        }
        if (i != 130) {
            return null;
        }
        return new C1057(6);
    }
}
