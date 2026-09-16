package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: ۥٍۖؔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2056 extends Thread {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f6771 = false;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C3644 f6772;

    /* JADX INFO: renamed from: ۦ۟ */
    public final BlockingQueue f6773;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f6774;

    public C2056(C3644 c3644, String str, BlockingQueue blockingQueue) {
        this.f6772 = c3644;
        AbstractC0487.m1047(blockingQueue);
        this.f6774 = new Object();
        this.f6773 = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f6772.f12202.acquire();
                z = true;
            } catch (InterruptedException e) {
                C3610 c3610 = ((C5371) this.f6772.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9430(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f6773;
                C5720 c5720 = (C5720) blockingQueue.poll();
                if (c5720 != null) {
                    Process.setThreadPriority(true != c5720.f18827 ? 10 : threadPriority);
                    c5720.run();
                } else {
                    Object obj = this.f6774;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f6772.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                C3610 c3611 = ((C5371) this.f6772.f18660).f17717;
                                C5371.m9020(c3611);
                                c3611.f12022.m9430(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f6772.f12201) {
                        if (this.f6773.peek() == null) {
                            m4009();
                            m4009();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m4009();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4009() {
        C3644 c3644 = this.f6772;
        synchronized (c3644.f12201) {
            try {
                if (!this.f6771) {
                    c3644.f12202.release();
                    c3644.f12201.notifyAll();
                    if (this == c3644.f12198) {
                        c3644.f12198 = null;
                    } else if (this == c3644.f12199) {
                        c3644.f12199 = null;
                    } else {
                        C3610 c3610 = ((C5371) c3644.f18660).f17717;
                        C5371.m9020(c3610);
                        c3610.f12020.m9432("Current scheduler thread is neither worker nor network");
                    }
                    this.f6771 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
