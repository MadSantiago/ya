package p000;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥِٕۗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2116 extends AbstractC5633 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final boolean f6951;

    /* JADX INFO: renamed from: ۥُ */
    public static final boolean f6952;

    /* JADX INFO: renamed from: ۥّ */
    public static final AtomicReference f6953;

    /* JADX INFO: renamed from: ۥۜ */
    public static final ConcurrentLinkedQueue f6954;

    /* JADX INFO: renamed from: ۦؑ */
    public static final boolean f6955;

    /* JADX INFO: renamed from: ۦۙ */
    public static final AtomicLong f6956;

    /* JADX INFO: renamed from: ۥۗ */
    public volatile AbstractC5633 f6957;

    static {
        String str = Build.FINGERPRINT;
        f6951 = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f6955 = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f6952 = "eng".equals(str3) || "userdebug".equals(str3);
        f6953 = new AtomicReference();
        f6956 = new AtomicLong();
        f6954 = new ConcurrentLinkedQueue();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m4095() {
        while (true) {
            C1395 c1395 = (C1395) f6954.poll();
            if (c1395 == null) {
                return;
            }
            f6956.getAndDecrement();
            C2116 c2116 = c1395.f4774;
            C2380 c2380 = c1395.f4773;
            C0506 c0506 = c2380.f7887;
            if ((c0506 != null && Boolean.TRUE.equals(c0506.mo1148(AbstractC1676.f5590))) || c2116.mo4098(c2380.f7892)) {
                c2116.mo4097(c2380);
            }
        }
    }

    @Override // p000.AbstractC5633
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo4096(RuntimeException runtimeException, C2380 c2380) {
        if (this.f6957 != null) {
            this.f6957.mo4096(runtimeException, c2380);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // p000.AbstractC5633
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo4097(C2380 c2380) {
        if (this.f6957 != null) {
            this.f6957.mo4097(c2380);
            return;
        }
        if (f6956.incrementAndGet() > 20) {
            f6954.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f6954.offer(new C1395(this, c2380));
        if (this.f6957 != null) {
            m4095();
        }
    }

    @Override // p000.AbstractC5633
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo4098(Level level) {
        return this.f6957 == null || this.f6957.mo4098(level);
    }
}
