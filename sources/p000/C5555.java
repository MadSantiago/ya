package p000;

/* JADX INFO: renamed from: ۦۢؖۨٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5555 extends AbstractC0031 implements InterfaceC4853 {

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 f18337;

    public C5555(InterfaceC0443 interfaceC0443, InterfaceC3534 interfaceC3534) {
        super(interfaceC3534, true);
        this.f18337 = interfaceC0443;
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo869() {
        return true;
    }

    @Override // p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4853 mo3583() {
        InterfaceC0443 interfaceC0443 = this.f18337;
        if (interfaceC0443 instanceof InterfaceC4853) {
            return (InterfaceC4853) interfaceC0443;
        }
        return null;
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦٌ */
    public void mo882(Object obj) throws C0768 {
        AbstractC5378.m9066(AbstractC2776.m5232(this.f18337), AbstractC0186.m430(obj));
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۦۚ */
    public void mo888(Object obj) {
        this.f18337.mo335(AbstractC0186.m430(obj));
    }

    /* JADX INFO: renamed from: ۥؕ */
    public void mo8912() {
    }
}
