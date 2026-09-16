package p000;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: renamed from: ۦٓؑؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4100 {
    static {
        C1984.m3875("WakeLocks");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final PowerManager.WakeLock m7289(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        synchronized (C0447.f1636) {
        }
        return wakeLockNewWakeLock;
    }
}
