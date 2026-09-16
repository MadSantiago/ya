package p000;

import androidx.work.Worker;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: ۥٟٗؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1537 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f5202 = C1984.m3875("WorkerWrapper");

    /* JADX INFO: renamed from: ۥۣ */
    public static final Object m3268(C4995 c4995, Worker worker, AbstractC2426 abstractC2426) {
        Object obj;
        C5112 c5112 = c4995.f16533;
        try {
            boolean z = false;
            if (!c5112.isDone()) {
                C2600 c2600 = new C2600(1, AbstractC2776.m5232(abstractC2426));
                c2600.m4913();
                c5112.mo3760(new RunnableC4114(c4995, c2600, 0), EnumC5000.f16543);
                c2600.m4908(new C0519(8, worker, c4995));
                return c2600.m4909();
            }
            while (true) {
                try {
                    obj = c5112.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
