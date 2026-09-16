package p000;

/* JADX INFO: renamed from: ۦ٘ؕٛؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4437 extends AbstractC5549 implements InterfaceC4853, InterfaceC0443 {

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ long f14625 = AbstractC3456.f11473.objectFieldOffset(C4437.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ۥَ */
    public final AbstractC0772 f14626;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC2132 f14627;

    /* JADX INFO: renamed from: ۥٖ */
    public Object f14628;

    /* JADX INFO: renamed from: ۦٗ */
    public final Object f14629;

    public C4437(AbstractC2132 abstractC2132, AbstractC0772 abstractC0772) {
        super(-1);
        this.f14627 = abstractC2132;
        this.f14626 = abstractC0772;
        this.f14628 = AbstractC5378.f17758;
        this.f14629 = abstractC0772.mo334().mo875(AbstractC2765.f9179, 0);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f14627 + ", " + AbstractC4489.m7818(this.f14626) + ']';
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        return this.f14626.mo334();
    }

    @Override // p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥّ */
    public final void mo335(Object obj) throws C0768 {
        Throwable thM405 = AbstractC0183.m405(obj);
        Object c5036 = thM405 == null ? obj : new C5036(thM405, false);
        AbstractC0772 abstractC0772 = this.f14626;
        InterfaceC3534 interfaceC3534Mo334 = abstractC0772.mo334();
        AbstractC2132 abstractC2132 = this.f14627;
        if (AbstractC5378.m9049(abstractC2132, interfaceC3534Mo334)) {
            this.f14628 = c5036;
            this.f18326 = 0;
            AbstractC5378.m9042(abstractC2132, abstractC0772.mo334(), this);
            return;
        }
        AbstractC5596 abstractC5596M7538 = AbstractC4253.m7538();
        if (abstractC5596M7538.f18445 >= 4294967296L) {
            this.f14628 = c5036;
            this.f18326 = 0;
            abstractC5596M7538.m9443(this);
            return;
        }
        abstractC5596M7538.m9441(true);
        try {
            InterfaceC3534 interfaceC3534Mo335 = abstractC0772.mo334();
            Object objM5152 = AbstractC2765.m5152(interfaceC3534Mo335, this.f14629);
            try {
                abstractC0772.mo335(obj);
                AbstractC2765.m5121(interfaceC3534Mo335, objM5152);
                while (abstractC5596M7538.m9446()) {
                }
            } catch (Throwable th) {
                AbstractC2765.m5121(interfaceC3534Mo335, objM5152);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m9277(th2);
            } finally {
                abstractC5596M7538.m9442(true);
            }
        }
    }

    @Override // p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4853 mo3583() {
        return this.f14626;
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo4906() {
        Object obj = this.f14628;
        this.f14628 = AbstractC5378.f17758;
        return obj;
    }

    @Override // p000.AbstractC5549
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0443 mo4897() {
        return this;
    }
}
