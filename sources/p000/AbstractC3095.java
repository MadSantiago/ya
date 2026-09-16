package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؒؒۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3095 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final int f10378;

    /* JADX INFO: renamed from: ۥُ */
    public static final long f10379;

    /* JADX INFO: renamed from: ۥّ */
    public static final C1397 f10380;

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f10381;

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f10382;

    /* JADX INFO: renamed from: ۦؑ */
    public static final int f10383;

    static {
        String property;
        int i = AbstractC1768.f5896;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f10382 = property;
        f10381 = AbstractC2776.m5227("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC1768.f5896;
        if (i2 < 2) {
            i2 = 2;
        }
        f10378 = AbstractC2776.m5254(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f10383 = AbstractC2776.m5254(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f10379 = TimeUnit.SECONDS.toNanos(AbstractC2776.m5227("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f10380 = C1397.f4799;
    }
}
