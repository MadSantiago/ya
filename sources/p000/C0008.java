package p000;

/* JADX INFO: renamed from: ۥؖ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0008 extends AbstractRunnableC0049 {
    @Override // p000.AbstractRunnableC0049
    /* JADX INFO: renamed from: ۥْ */
    public final Object mo614(Object obj, Throwable th) {
        InterfaceC5296 interfaceC5296 = (InterfaceC5296) obj;
        InterfaceFutureC4378 interfaceFutureC4378Apply = interfaceC5296.apply(th);
        AbstractC0949.m1952(interfaceFutureC4378Apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5296);
        return interfaceFutureC4378Apply;
    }

    @Override // p000.AbstractRunnableC0049
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo615(Object obj) {
        m3766((InterfaceFutureC4378) obj);
    }
}
