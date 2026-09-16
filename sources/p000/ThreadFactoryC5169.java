package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ۦۚؔؗ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC5169 implements ThreadFactory {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ ThreadFactoryC5169 f17110 = new ThreadFactoryC5169(1);

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17111;

    public /* synthetic */ ThreadFactoryC5169(int i) {
        this.f17111 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f17111) {
            case 0:
                return new C5632(runnable, "fonts-androidx");
            default:
                Object obj = C0996.f3556;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
