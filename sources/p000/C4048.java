package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦّؗؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4048 implements InterfaceC5067, InterfaceC0604 {

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f13494 = new HashMap();

    /* JADX INFO: renamed from: ۥۗ */
    public ArrayDeque f13493 = new ArrayDeque();

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void m7253() {
        ExecutorC3678 executorC3678 = ExecutorC3678.f12284;
        C4452 c4452 = C4452.f14675;
        synchronized (this) {
            try {
                if (!this.f13494.containsKey(AbstractC5537.class)) {
                    this.f13494.put(AbstractC5537.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f13494.get(AbstractC5537.class)).put(c4452, executorC3678);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
