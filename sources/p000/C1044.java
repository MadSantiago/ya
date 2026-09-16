package p000;

/* JADX INFO: renamed from: ۥٌُْؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1044 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f3688;

    /* JADX INFO: renamed from: ۥُ */
    public final C5825 f3689;

    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC2714 f3690;

    /* JADX INFO: renamed from: ۥۗ */
    public float f3691;

    /* JADX INFO: renamed from: ۥۣ */
    public float f3692;

    /* JADX INFO: renamed from: ۦؑ */
    public float f3693;

    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC2714 f3694;

    public C1044(float f, float f2, float f3, float f4) {
        this.f3692 = f;
        this.f3691 = f2;
        this.f3688 = f3;
        this.f3693 = f4;
        this.f3689 = new C5825(new C4497(f), AbstractC3831.f12711, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m2257(AbstractC0772 abstractC0772) {
        C3070 c3070;
        float f;
        if (abstractC0772 instanceof C3070) {
            c3070 = (C3070) abstractC0772;
            int i = c3070.f10318;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3070.f10318 = i - Integer.MIN_VALUE;
            } else {
                c3070 = new C3070(this, abstractC0772);
            }
        } else {
            c3070 = new C3070(this, abstractC0772);
        }
        Object obj = c3070.f10317;
        int i2 = c3070.f10318;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                InterfaceC2714 interfaceC2714 = this.f3694;
                if (interfaceC2714 instanceof C3656) {
                    f = this.f3691;
                } else if (interfaceC2714 instanceof C0266) {
                    f = this.f3688;
                } else {
                    f = interfaceC2714 instanceof C3213 ? this.f3693 : this.f3692;
                }
                C5825 c5825 = this.f3689;
                if (!C4497.m7826(((C4497) c5825.f19170.getValue()).f14871, f)) {
                    C4497 c4497 = new C4497(f);
                    c3070.f10318 = 1;
                    Object objM9636 = c5825.m9636(c3070, c4497);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM9636 == enumC2282) {
                        return enumC2282;
                    }
                }
                return C2358.f7817;
            }
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
            this.f3690 = this.f3694;
            return C2358.f7817;
        } catch (Throwable th) {
            this.f3690 = this.f3694;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ۥۜؑؒؑ] */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m2258(InterfaceC2714 interfaceC2714, AbstractC0772 abstractC0772) {
        C1301 c1301;
        float f;
        C5825 c5825 = this.f3689;
        if (abstractC0772 instanceof C1301) {
            c1301 = (C1301) abstractC0772;
            int i = c1301.f4468;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1301.f4468 = i - Integer.MIN_VALUE;
            } else {
                c1301 = new C1301(this, abstractC0772);
            }
        } else {
            c1301 = new C1301(this, abstractC0772);
        }
        Object obj = c1301.f4465;
        int i2 = c1301.f4468;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj);
                if (interfaceC2714 instanceof C3656) {
                    f = this.f3691;
                } else if (interfaceC2714 instanceof C0266) {
                    f = this.f3688;
                } else {
                    f = interfaceC2714 instanceof C3213 ? this.f3693 : this.f3692;
                }
                this.f3694 = interfaceC2714;
                if (!C4497.m7826(((C4497) c5825.f19170.getValue()).f14871, f)) {
                    InterfaceC2714 interfaceC2715 = this.f3690;
                    c1301.f4466 = interfaceC2714;
                    c1301.f4468 = 1;
                    Object objM9601 = AbstractC5785.m9601(c5825, f, interfaceC2715, interfaceC2714, c1301);
                    EnumC2282 enumC2282 = EnumC2282.f7590;
                    if (objM9601 == enumC2282) {
                        return enumC2282;
                    }
                }
            } else {
                if (i2 != 1) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC2714 = c1301.f4466;
                AbstractC0186.m409(obj);
            }
            this.f3690 = interfaceC2714;
            this = C2358.f7817;
            return this;
        } catch (Throwable th) {
            this.f3690 = interfaceC2714;
            throw th;
        }
    }
}
