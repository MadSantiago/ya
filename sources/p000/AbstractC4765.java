package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: ۦِٝؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4765 {
    /* JADX INFO: renamed from: ۥؗ */
    public static void m8112(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m8113(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static int m8114(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m8115(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
