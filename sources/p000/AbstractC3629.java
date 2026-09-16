package p000;

import android.view.View;

/* JADX INFO: renamed from: ۦؚؚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3629 {
    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m6458(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m6459(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m6460(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static boolean m6461(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static CharSequence m6462(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m6463(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }
}
