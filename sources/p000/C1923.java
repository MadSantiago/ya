package p000;

/* JADX INFO: renamed from: ۥًٞؑؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1923 implements InterfaceC4643, InterfaceC3424 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C2002 f6343 = new C2002(0);

    /* JADX INFO: renamed from: ۥْ */
    public volatile InterfaceC3534 f6344;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1923 f6345 = this;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3534 f6346;

    public C1923(InterfaceC3534 interfaceC3534) {
        this.f6346 = interfaceC3534;
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3770() {
        m3771();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3771() {
        synchronized (this.f6345) {
            try {
                InterfaceC3534 interfaceC3534 = this.f6344;
                if (interfaceC3534 == null) {
                    this.f6344 = f6343;
                } else {
                    AbstractC5568.m9380(interfaceC3534, new C4013(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3772() {
        m3771();
    }

    @Override // p000.InterfaceC4643
    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3534 mo1586() {
        InterfaceC3534 interfaceC3534Mo860;
        InterfaceC3534 interfaceC3534 = this.f6344;
        if (interfaceC3534 != null && interfaceC3534 != f6343) {
            return interfaceC3534;
        }
        C2805 c2805 = (C2805) this.f6346.mo865(C2805.f9360);
        InterfaceC3534 c2277 = c2805 != null ? new C2277(c2805, this) : C4794.f15814;
        synchronized (this.f6345) {
            try {
                interfaceC3534Mo860 = this.f6344;
                if (interfaceC3534Mo860 == null) {
                    InterfaceC3534 interfaceC3535 = this.f6346;
                    interfaceC3534Mo860 = interfaceC3535.mo860(new C3841((InterfaceC3196) interfaceC3535.mo865(C1397.f4791))).mo860(C4794.f15814).mo860(c2277);
                } else if (interfaceC3534Mo860 == f6343) {
                    InterfaceC3534 interfaceC3536 = this.f6346;
                    C3841 c3841 = new C3841((InterfaceC3196) interfaceC3536.mo865(C1397.f4791));
                    c3841.m858(new C4013(0));
                    interfaceC3534Mo860 = interfaceC3536.mo860(c3841).mo860(C4794.f15814).mo860(c2277);
                }
                this.f6344 = interfaceC3534Mo860;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3534Mo860;
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3769() {
    }
}
