package p000;

import android.os.Looper;

/* JADX INFO: renamed from: ۦُٙۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4519 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f14933;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f14933 = id;
    }
}
