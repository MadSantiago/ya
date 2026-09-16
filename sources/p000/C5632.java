package p000;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۦۣۧٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5632 extends Thread {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18562 = 1;

    public /* synthetic */ C5632(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f18562) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = C5858.f19344;
                reentrantLock.lock();
                try {
                    C5858 c5858M415 = AbstractC0186.m415();
                    if (c5858M415 == C5858.f19345) {
                        C5858.f19345 = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c5858M415 != null) {
                            c5858M415.mo2853();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
                continue;
            }
        }
    }

    public /* synthetic */ C5632(String str) {
        super(str);
    }

    public /* synthetic */ C5632(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
