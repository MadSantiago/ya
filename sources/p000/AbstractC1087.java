package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: ۥِؑۜٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1087 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final int[] f3796 = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: ۥۗ */
    public static final String f3795 = AbstractC1087.class.getSimpleName();

    /* JADX INFO: renamed from: ۥۣ */
    public static ColorStateList m2296(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3796, 0)) != 0) {
            Log.w(f3795, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
