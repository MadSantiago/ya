package p000;

/* JADX INFO: renamed from: ۦُٚؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4537 extends AbstractC5376 {

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f15000;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC2387 f15001;

    public C4537(C4828 c4828, C2561 c2561, InterfaceC2003 interfaceC2003, InterfaceC2387 interfaceC2387, boolean z) {
        super(c4828, c2561, interfaceC2003);
        this.f15001 = interfaceC2387;
        this.f15000 = z;
    }

    @Override // p000.AbstractC5376
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo7864(C0724 c0724, Object[] objArr) {
        InterfaceC5065 interfaceC5065 = (InterfaceC5065) this.f15001.mo4464(c0724);
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) objArr[objArr.length - 1];
        try {
            return this.f15000 ? AbstractC0993.m2160(interfaceC5065, interfaceC0443) : AbstractC0993.m2154(interfaceC5065, interfaceC0443);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
            throw e;
        } catch (Throwable th) {
            AbstractC0993.m2165(th, interfaceC0443);
            return EnumC2282.f7590;
        }
    }
}
