package p000;

/* JADX INFO: renamed from: ۥؘ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0010 extends AbstractRunnableC0022 {
    @Override // p000.AbstractRunnableC0022
    /* JADX INFO: renamed from: ۥَ */
    public final void mo1458(Object obj) {
        m3766((InterfaceFutureC4378) obj);
    }

    @Override // p000.AbstractRunnableC0022
    /* JADX INFO: renamed from: ۥٓ */
    public final Object mo1459(Object obj, Object obj2) {
        InterfaceC5296 interfaceC5296 = (InterfaceC5296) obj;
        InterfaceFutureC4378 interfaceFutureC4378Apply = interfaceC5296.apply(obj2);
        AbstractC0949.m1952(interfaceFutureC4378Apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC5296);
        return interfaceFutureC4378Apply;
    }
}
