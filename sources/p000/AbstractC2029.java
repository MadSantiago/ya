package p000;

/* JADX INFO: renamed from: ۥُٟؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2029 extends AbstractC0938 {

    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC4707 f6687;

    public AbstractC2029(InterfaceC4707 interfaceC4707, InterfaceC3534 interfaceC3534, int i, int i2) {
        super(interfaceC3534, i, i2);
        this.f6687 = interfaceC4707;
    }

    @Override // p000.AbstractC0938
    public final String toString() {
        return this.f6687 + " -> " + super.toString();
    }

    @Override // p000.AbstractC0938
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo1910(C3002 c3002, InterfaceC0443 interfaceC0443) {
        Object objMo1814 = mo1814(new C2475(c3002), interfaceC0443);
        return objMo1814 == EnumC2282.f7590 ? objMo1814 : C2358.f7817;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
    @Override // p000.AbstractC0938, p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo1575(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) throws Throwable {
        Object objMo1575;
        int i = this.f3334;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (i == -3) {
            InterfaceC3534 interfaceC3534Mo334 = interfaceC0443.mo334();
            Boolean bool = Boolean.FALSE;
            C4876 c4876 = new C4876(1);
            InterfaceC3534 interfaceC3534 = this.f3335;
            InterfaceC3534 interfaceC3534Mo860 = !((Boolean) interfaceC3534.mo875(c4876, bool)).booleanValue() ? interfaceC3534Mo334.mo860(interfaceC3534) : AbstractC2774.m5208(interfaceC3534Mo334, interfaceC3534, false);
            if (AbstractC3831.m6874(interfaceC3534Mo860, interfaceC3534Mo334)) {
                Object objMo1814 = mo1814(interfaceC4161, interfaceC0443);
                if (objMo1814 == enumC2282) {
                    return objMo1814;
                }
            } else {
                C0373 c0373 = C0373.f1369;
                if (AbstractC3831.m6874(interfaceC3534Mo860.mo865(c0373), interfaceC3534Mo334.mo865(c0373))) {
                    InterfaceC3534 interfaceC3534Mo335 = interfaceC0443.mo334();
                    if (!(interfaceC4161 instanceof C2475) && !(interfaceC4161 instanceof C2817)) {
                        interfaceC4161 = new C0670(interfaceC4161, interfaceC3534Mo335);
                    }
                    Object objM1967 = AbstractC0949.m1967(interfaceC3534Mo860, interfaceC4161, interfaceC3534Mo860.mo875(AbstractC2765.f9179, 0), new C0023(this, null, 11), interfaceC0443);
                    if (objM1967 == enumC2282) {
                        return objM1967;
                    }
                } else {
                    objMo1575 = super.mo1575(interfaceC4161, interfaceC0443);
                    if (objMo1575 == enumC2282) {
                        return objMo1575;
                    }
                }
            }
        } else {
            objMo1575 = super.mo1575(interfaceC4161, interfaceC0443);
            if (objMo1575 == enumC2282) {
                return objMo1575;
            }
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public abstract Object mo1814(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443);
}
