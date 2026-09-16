package p000;

/* JADX INFO: renamed from: ۦۜؓ٘ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5278 extends C5555 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ۥَ */
    public final ThreadLocal f17395;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5278(InterfaceC0443 interfaceC0443, InterfaceC3534 interfaceC3534) {
        C2002 c2002 = C2002.f6598;
        super(interfaceC0443, interfaceC3534.mo865(c2002) == null ? interfaceC3534.mo860(c2002) : interfaceC3534);
        this.f17395 = new ThreadLocal();
        if (interfaceC0443.mo334().mo865(C0373.f1369) instanceof AbstractC2132) {
            return;
        }
        Object objM5152 = AbstractC2765.m5152(interfaceC3534, null);
        AbstractC2765.m5121(interfaceC3534, objM5152);
        m8914(interfaceC3534, objM5152);
    }

    @Override // p000.C5555
    /* JADX INFO: renamed from: ۥؕ */
    public final void mo8912() {
        m8913();
    }

    /* JADX INFO: renamed from: ۥٍ */
    public final void m8913() {
        if (this.threadLocalIsSet) {
            C3869 c3869 = (C3869) this.f17395.get();
            if (c3869 != null) {
                AbstractC2765.m5121((InterfaceC3534) c3869.f12915, c3869.f12914);
            }
            this.f17395.remove();
        }
    }

    /* JADX INFO: renamed from: ۥٚ */
    public final void m8914(InterfaceC3534 interfaceC3534, Object obj) {
        this.threadLocalIsSet = true;
        this.f17395.set(new C3869(interfaceC3534, obj));
    }

    /* JADX INFO: renamed from: ۦؓ */
    public final boolean m8915() {
        boolean z = this.threadLocalIsSet && this.f17395.get() == null;
        this.f17395.remove();
        return !z;
    }

    @Override // p000.C5555, p000.AbstractC0386
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo888(Object obj) {
        m8913();
        Object objM430 = AbstractC0186.m430(obj);
        InterfaceC0443 interfaceC0443 = this.f18337;
        InterfaceC3534 interfaceC3534Mo334 = interfaceC0443.mo334();
        Object objM5152 = AbstractC2765.m5152(interfaceC3534Mo334, null);
        C5278 c5278M5193 = objM5152 != AbstractC2765.f9155 ? AbstractC2774.m5193(interfaceC0443, interfaceC3534Mo334, objM5152) : null;
        try {
            interfaceC0443.mo335(objM430);
        } finally {
            if (c5278M5193 == null || c5278M5193.m8915()) {
                AbstractC2765.m5121(interfaceC3534Mo334, objM5152);
            }
        }
    }
}
