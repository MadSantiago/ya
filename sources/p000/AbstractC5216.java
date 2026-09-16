package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: ۦؙۛؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5216 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ThreadLocal f17228 = new ThreadLocal();

    /* JADX INFO: renamed from: ۥۗ */
    public static final int[] f17227 = {-16842910};

    /* JADX INFO: renamed from: ۥؗ */
    public static final int[] f17224 = {R.attr.state_focused};

    /* JADX INFO: renamed from: ۦؑ */
    public static final int[] f17229 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۥُ */
    public static final int[] f17225 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۥّ */
    public static final int[] f17226 = new int[0];

    /* JADX INFO: renamed from: ۦۙ */
    public static final int[] f17230 = new int[1];

    /* JADX INFO: renamed from: ۥؗ */
    public static int m8832(Context context, int i) {
        int[] iArr = f17230;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static int m8833(Context context, int i) {
        ColorStateList colorStateListM8835 = m8835(context, i);
        if (colorStateListM8835 != null && colorStateListM8835.isStateful()) {
            return colorStateListM8835.getColorForState(f17227, colorStateListM8835.getDefaultColor());
        }
        ThreadLocal threadLocal = f17228;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM8832 = m8832(context, i);
        return AbstractC1373.m2912(iM8832, Math.round(Color.alpha(iM8832) * f));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m8834(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC5618.f18524);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static ColorStateList m8835(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f17230;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC4225.m7481(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
