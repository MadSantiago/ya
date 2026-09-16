package p000;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: ۦُۣؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5604 {
    /* JADX INFO: renamed from: ۥؗ */
    public static CharSequence m9450(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m9451(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m9452(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m9453(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m9454(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Icon m9455(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static Insets m9456(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m9457(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m9458(View view) {
        view.setImportantForContentCapture(1);
    }
}
