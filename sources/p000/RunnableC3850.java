package p000;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۦَُؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3850 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0201 f12868;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile AtomicInteger f12869 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC5578 f12870;

    public RunnableC3850(C0201 c0201, InterfaceC5578 interfaceC5578) {
        this.f12868 = c0201;
        this.f12870 = interfaceC5578;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2561 c2561;
        String strConcat = "OkHttp ".concat(((C0774) this.f12868.f745.f9393).m1665());
        C0201 c0201 = this.f12868;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c0201.f737.m9679();
            boolean z = false;
            try {
                try {
                    try {
                        this.f12870.mo1168(c0201.m460());
                        c2561 = c0201.f746;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            C3216 c3216 = C3216.f10772;
                            C3216 c3217 = C3216.f10772;
                            StringBuilder sb = new StringBuilder("Callback failure for ");
                            sb.append((c0201.f732 ? "canceled " : "") + "call to " + ((C0774) c0201.f745.f9393).m1665());
                            String string = sb.toString();
                            c3217.getClass();
                            C3216.m5903(4, string, e);
                        } else {
                            this.f12870.mo1169(c0201, e);
                        }
                        c2561 = c0201.f746;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c0201.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            AbstractC5537.m9223(iOException, th);
                            this.f12870.mo1169(c0201, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                c2561.f8550.m3133(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                c0201.f746.f8550.m3133(this);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
