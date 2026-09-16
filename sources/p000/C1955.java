package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: ۥّٞؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1955 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Bitmap f6452;

    public C1955(Bitmap bitmap) {
        this.f6452 = bitmap;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m3836() {
        Bitmap.Config config = this.f6452.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
