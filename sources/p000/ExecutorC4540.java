package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦِٚؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC4540 extends AbstractC4391 implements Executor {

    /* JADX INFO: renamed from: ۥْ */
    public static final AbstractC2132 f15005;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final ExecutorC4540 f15006 = new ExecutorC4540();

    static {
        C2284 c2284 = C2284.f7592;
        int i = AbstractC1768.f5896;
        if (64 >= i) {
            i = 64;
        }
        f15005 = c2284.mo4119(AbstractC2776.m5254(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1466(C4794.f15814, runnable);
    }

    @Override // p000.AbstractC2132
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo1465(InterfaceC3534 interfaceC3534, Runnable runnable) throws C0768 {
        f15005.mo1465(interfaceC3534, runnable);
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo1466(InterfaceC3534 interfaceC3534, Runnable runnable) {
        f15005.mo1466(interfaceC3534, runnable);
    }

    @Override // p000.AbstractC2132
    /* JADX INFO: renamed from: ۦۧ */
    public final AbstractC2132 mo4119(int i) {
        return C2284.f7592.mo4119(1);
    }
}
