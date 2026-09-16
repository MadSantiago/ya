package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦؘٔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3517 implements InterfaceC0110, InterfaceC3744, InterfaceC1463, InterfaceC2342 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f11644;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f11645;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Executor f11646;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11647;

    public C3517(Executor executor, InterfaceC2342 interfaceC2342) {
        this.f11647 = 0;
        this.f11644 = new Object();
        this.f11646 = executor;
        this.f11645 = interfaceC2342;
    }

    @Override // p000.InterfaceC2342
    /* JADX INFO: renamed from: ۥؗ */
    public void mo2242() {
        ((C3580) this.f11645).m6394();
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public void mo2243(Exception exc) {
        ((C3580) this.f11645).m6393(exc);
    }

    @Override // p000.InterfaceC0110
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo207(C3580 c3580) {
        boolean z = false;
        switch (this.f11647) {
            case 0:
                if (c3580.f11913) {
                    synchronized (this.f11644) {
                        break;
                    }
                    this.f11646.execute(new RunnableC3365(18, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.f11644) {
                    break;
                }
                this.f11646.execute(new RunnableC4985(22, this, c3580, z));
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (c3580.m6390() || c3580.f11913) {
                    return;
                }
                synchronized (this.f11644) {
                    break;
                }
                this.f11646.execute(new RunnableC4985(25, this, c3580, z));
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (c3580.m6390()) {
                    synchronized (this.f11644) {
                        break;
                    }
                    this.f11646.execute(new RunnableC5413(2, this, c3580, z));
                    return;
                }
                return;
            default:
                this.f11646.execute(new RunnableC5413(8, this, c3580, z));
                return;
        }
    }

    @Override // p000.InterfaceC3744
    /* JADX INFO: renamed from: ۦؑ */
    public void mo2246(Object obj) {
        ((C3580) this.f11645).m6395(obj);
    }

    public C3517(Executor executor, InterfaceC2659 interfaceC2659) {
        this.f11647 = 1;
        this.f11644 = new Object();
        this.f11646 = executor;
        this.f11645 = interfaceC2659;
    }

    public C3517(Executor executor, InterfaceC1463 interfaceC1463) {
        this.f11647 = 2;
        this.f11644 = new Object();
        this.f11646 = executor;
        this.f11645 = interfaceC1463;
    }

    public C3517(Executor executor, InterfaceC3744 interfaceC3744) {
        this.f11647 = 3;
        this.f11644 = new Object();
        this.f11646 = executor;
        this.f11645 = interfaceC3744;
    }

    public C3517(Executor executor, InterfaceC3814 interfaceC3814, C3580 c3580) {
        this.f11647 = 4;
        this.f11646 = executor;
        this.f11644 = interfaceC3814;
        this.f11645 = c3580;
    }
}
