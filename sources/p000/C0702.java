package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: ۥٌؙْؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0702 extends AbstractC0031 {

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC5596 f2546;

    /* JADX INFO: renamed from: ۥٓ */
    public final Thread f2547;

    public C0702(InterfaceC3534 interfaceC3534, Thread thread, AbstractC5596 abstractC5596) {
        super(interfaceC3534, true);
        this.f2547 = thread;
        this.f2546 = abstractC5596;
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo882(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f2547;
        if (AbstractC3831.m6874(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
