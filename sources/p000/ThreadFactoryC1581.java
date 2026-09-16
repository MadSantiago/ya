package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ۥٕ٘ؕۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1581 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ boolean f5328;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ String f5329;

    public /* synthetic */ ThreadFactoryC1581(String str, boolean z) {
        this.f5329 = str;
        this.f5328 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5329);
        thread.setDaemon(this.f5328);
        return thread;
    }
}
