package p000;

/* JADX INFO: renamed from: ۥَؕؔٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0464 implements InterfaceC4137 {

    /* JADX INFO: renamed from: ۥْ */
    public final C1656 f1681;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ThreadLocal f1682;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5880 f1683;

    public C0464(C5880 c5880, ThreadLocal threadLocal) {
        this.f1683 = c5880;
        this.f1682 = threadLocal;
        this.f1681 = new C1656(threadLocal);
    }

    @Override // p000.InterfaceC4137
    public final InterfaceC2218 getKey() {
        return this.f1681;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f1683 + ", threadLocal = " + this.f1682 + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m979(Object obj) {
        this.f1682.set(obj);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥٖ */
    public final InterfaceC3534 mo860(InterfaceC3534 interfaceC3534) {
        return AbstractC4593.m7963(this, interfaceC3534);
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC4137 mo865(InterfaceC2218 interfaceC2218) {
        if (this.f1681.equals(interfaceC2218)) {
            return this;
        }
        return null;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۥۧ */
    public final Object mo875(InterfaceC5731 interfaceC5731, Object obj) {
        return interfaceC5731.mo219(obj, this);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m980() {
        ThreadLocal threadLocal = this.f1682;
        Object obj = threadLocal.get();
        threadLocal.set(this.f1683);
        return obj;
    }

    @Override // p000.InterfaceC3534
    /* JADX INFO: renamed from: ۦؙ */
    public final InterfaceC3534 mo881(InterfaceC2218 interfaceC2218) {
        return this.f1681.equals(interfaceC2218) ? C4794.f15814 : this;
    }
}
