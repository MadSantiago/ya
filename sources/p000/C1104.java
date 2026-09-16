package p000;

import android.content.Context;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥِؔۢٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1104 {

    /* JADX INFO: renamed from: ۥّ */
    public static final int f3879 = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f3880;

    /* JADX INFO: renamed from: ۥُ */
    public final float f3881;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f3882;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f3883;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f3884;

    public C1104(Context context) {
        boolean zM5219 = AbstractC2776.m5219(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        int iM4205 = AbstractC2164.m4205(context, R.attr.elevationOverlayColor);
        int iM4206 = AbstractC2164.m4205(context, R.attr.elevationOverlayAccentColor);
        int iM4207 = AbstractC2164.m4205(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3883 = zM5219;
        this.f3882 = iM4205;
        this.f3880 = iM4206;
        this.f3884 = iM4207;
        this.f3881 = f;
    }
}
