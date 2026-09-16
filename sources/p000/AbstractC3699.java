package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: ۦٌِؑۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3699 {
    /* JADX INFO: renamed from: ۥۗ */
    public static void m6562(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static View.AccessibilityDelegate m6563(View view) {
        return view.getAccessibilityDelegate();
    }
}
