package p000;

/* JADX INFO: renamed from: ۦؑؖۚۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3049 extends AbstractC0772 implements InterfaceC4161 {

    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC3534 f10252;

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC4161 f10253;

    /* JADX INFO: renamed from: ۥٖ */
    public final int f10254;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC3534 f10255;

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceC0443 f10256;

    public C3049(InterfaceC4161 interfaceC4161, InterfaceC3534 interfaceC3534) {
        super(C2949.f9890, C4794.f15814);
        this.f10253 = interfaceC4161;
        this.f10252 = interfaceC3534;
        this.f10254 = ((Number) interfaceC3534.mo875(new C4599(25), 0)).intValue();
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥَ */
    public final StackTraceElement mo5439() {
        return null;
    }

    @Override // p000.AbstractC0772, p000.InterfaceC0443
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC3534 mo334() {
        InterfaceC3534 interfaceC3534 = this.f10255;
        return interfaceC3534 == null ? C4794.f15814 : interfaceC3534;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Throwable thM405 = AbstractC0183.m405(obj);
        if (thM405 != null) {
            this.f10255 = new C2030(mo334(), thM405);
        }
        InterfaceC0443 interfaceC0443 = this.f10256;
        if (interfaceC0443 != null) {
            interfaceC0443.mo335(obj);
        }
        return EnumC2282.f7590;
    }

    @Override // p000.AbstractC2870, p000.InterfaceC4853
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4853 mo3583() {
        InterfaceC0443 interfaceC0443 = this.f10256;
        if (interfaceC0443 instanceof InterfaceC4853) {
            return (InterfaceC4853) interfaceC0443;
        }
        return null;
    }

    @Override // p000.InterfaceC4161
    /* JADX INFO: renamed from: ۦۚ */
    public final Object mo978(Object obj, InterfaceC0443 interfaceC0443) {
        try {
            Object objM5654 = m5654(interfaceC0443, obj);
            return objM5654 == EnumC2282.f7590 ? objM5654 : C2358.f7817;
        } catch (Throwable th) {
            this.f10255 = new C2030(interfaceC0443.mo334(), th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final Object m5654(InterfaceC0443 interfaceC0443, Object obj) {
        InterfaceC3534 interfaceC3534Mo334 = interfaceC0443.mo334();
        AbstractC5568.m9360(interfaceC3534Mo334);
        InterfaceC3534 interfaceC3534 = this.f10255;
        if (interfaceC3534 != interfaceC3534Mo334) {
            if (interfaceC3534 instanceof C2030) {
                throw new IllegalStateException(AbstractC1098.m2323("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2030) interfaceC3534).f6688 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) interfaceC3534Mo334.mo875(new C4164(16, this), 0)).intValue() != this.f10254) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10252 + ",\n\t\tbut emission happened in " + interfaceC3534Mo334 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f10255 = interfaceC3534Mo334;
        }
        this.f10256 = interfaceC0443;
        Object objMo1173 = AbstractC2111.f6935.mo1173(this.f10253, obj, this);
        if (!AbstractC3831.m6874(objMo1173, EnumC2282.f7590)) {
            this.f10256 = null;
        }
        return objMo1173;
    }
}
