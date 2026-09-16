package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؖۦۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3395 extends Thread {

    /* JADX INFO: renamed from: ۥْ */
    public final CountDownLatch f11295 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f11296 = false;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f11297;

    /* JADX INFO: renamed from: ۦۨ */
    public final WeakReference f11298;

    public C3395(C5037 c5037, long j) {
        this.f11298 = new WeakReference(c5037);
        this.f11297 = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C5037 c5037;
        WeakReference weakReference = this.f11298;
        try {
            if (this.f11295.await(this.f11297, TimeUnit.MILLISECONDS) || (c5037 = (C5037) weakReference.get()) == null) {
                return;
            }
            c5037.m8550();
            this.f11296 = true;
        } catch (InterruptedException unused) {
            C5037 c5038 = (C5037) weakReference.get();
            if (c5038 != null) {
                c5038.m8550();
                this.f11296 = true;
            }
        }
    }
}
