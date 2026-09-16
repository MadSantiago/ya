package p000;

/* JADX INFO: renamed from: ۥۚؕؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2277 extends AbstractC0041 implements InterfaceC3500 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1923 f7566;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2805 f7567;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2277(C2805 c2805, C1923 c1923) {
        C1298 c1298 = C1298.f4446;
        this.f7567 = c2805;
        this.f7566 = c1923;
        super(c1298);
    }

    @Override // p000.InterfaceC3500
    /* JADX INFO: renamed from: ۦٕ */
    public final void mo1639(InterfaceC3534 interfaceC3534, Throwable th) throws Throwable {
        C2805 c2805 = this.f7567;
        C1923 c1923 = this.f7566;
        AbstractC0487.m1058(th, new C1225(8, c2805, c1923));
        InterfaceC3500 interfaceC3500 = (InterfaceC3500) c1923.f6346.mo865(C1298.f4446);
        if (interfaceC3500 == null) {
            throw th;
        }
        interfaceC3500.mo1639(interfaceC3534, th);
    }
}
