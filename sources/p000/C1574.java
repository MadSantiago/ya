package p000;

/* JADX INFO: renamed from: ۥ٘ؔۗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1574 extends C2600 {

    /* JADX INFO: renamed from: ۥۖ */
    public final C3529 f5311;

    public C1574(InterfaceC0443 interfaceC0443, C3529 c3529) {
        super(1, interfaceC0443);
        this.f5311 = c3529;
    }

    @Override // p000.C2600
    /* JADX INFO: renamed from: ۥٖ */
    public final Throwable mo3322(AbstractC0386 abstractC0386) {
        Throwable thM4916;
        Object objM890 = this.f5311.m890();
        if (!(objM890 instanceof C2610) || (thM4916 = ((C2610) objM890).m4916()) == null) {
            return objM890 instanceof C5036 ? ((C5036) objM890).f16702 : abstractC0386.mo862();
        }
        return thM4916;
    }

    @Override // p000.C2600
    /* JADX INFO: renamed from: ۥۧ */
    public final String mo3323() {
        return "AwaitContinuation";
    }
}
