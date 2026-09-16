package p000;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ۦؙٕؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4218 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final double f13995;

    /* JADX INFO: renamed from: ۥۗ */
    public static final double f13996;

    /* JADX INFO: renamed from: ۥۣ */
    public static final float f13997 = ViewConfiguration.getScrollFriction();

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f13996 = dLog;
        f13995 = dLog - 1.0d;
    }
}
