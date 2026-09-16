package p000;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ۦٕؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC3076 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥُ */
    public static final ThreadFactory f10323 = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: ۥؗ */
    public final int f10324;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f10325;

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicLong f10326 = new AtomicLong();

    /* JADX INFO: renamed from: ۦؑ */
    public final StrictMode.ThreadPolicy f10327;

    public ThreadFactoryC3076(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f10325 = str;
        this.f10324 = i;
        this.f10327 = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f10323.newThread(new RunnableC5689(9, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f10325 + " Thread #" + this.f10326.getAndIncrement());
        return threadNewThread;
    }
}
