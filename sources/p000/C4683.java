package p000;

/* JADX INFO: renamed from: ۦٜؔؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4683 extends AbstractC5676 {

    /* JADX INFO: renamed from: ۥَ */
    public C3639 f15424;

    /* JADX INFO: renamed from: ۥْ */
    public Object f15425;

    /* JADX INFO: renamed from: ۥٓ */
    public C3639 f15426;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC4783 f15427;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4884 f15428;

    /* JADX INFO: renamed from: ۦۛ */
    public final C5322 f15429;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f15430;

    public C4683() {
        super(1);
        int i = 9;
        this.f15428 = new C4884(9, this);
        C4164 c4164 = new C4164(21, this);
        AbstractC1538.m3277(AbstractC1538.f5208);
        synchronized (AbstractC1538.f5203) {
            AbstractC1538.f5207 = AbstractC0973.m2046(AbstractC1538.f5207, c4164);
        }
        this.f15429 = new C5322(i, c4164);
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦٌ */
    public final InterfaceC4745 mo7668(InterfaceC4783 interfaceC4783) {
        InterfaceC4783 interfaceC4784 = this.f15427;
        if (interfaceC4784 != null && !interfaceC4784.equals(interfaceC4783)) {
            AbstractC0371.m794("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f15427 = interfaceC4783;
        return this.f15428;
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦِ */
    public final void mo7669() {
        synchronized (this.f18660) {
            try {
                this.f15430 = this.f15425;
                if (this.f15424 == null) {
                    this.f15426 = null;
                } else {
                    C3639 c3639 = this.f15426;
                    if (c3639 == null) {
                        C3639 c36310 = AbstractC5705.f18789;
                        c3639 = new C3639();
                        this.f15426 = c3639;
                    }
                    this.f15426 = this.f15424;
                    this.f15424 = c3639;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo7670(InterfaceC4783 interfaceC4783) {
        this.f15425 = null;
        this.f15424 = null;
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo7671() {
        this.f15429.m8926();
        this.f15425 = null;
        this.f15424 = null;
        synchronized (this.f18660) {
            this.f15427 = null;
            this.f15430 = null;
            this.f15426 = null;
        }
    }

    @Override // p000.AbstractC5676
    /* JADX INFO: renamed from: ۦۚ */
    public final void mo7672(InterfaceC4541 interfaceC4541) {
        this.f15427 = null;
        this.f15425 = null;
        this.f15424 = null;
        mo7669();
    }
}
