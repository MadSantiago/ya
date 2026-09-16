package p000;

/* JADX INFO: renamed from: ۦٕؖؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4248 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14077 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public int f14078;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ float f14079;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f14080;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4248(C1705 c1705, float f, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14080 = c1705;
        this.f14079 = f;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f14077;
        Object obj2 = this.f14080;
        switch (i) {
            case 0:
                C4248 c4248 = new C4248((ScrollCaptureCallbackC2259) obj2, interfaceC0443);
                c4248.f14079 = ((Number) obj).floatValue();
                return c4248;
            default:
                return new C4248((C1705) obj2, this.f14079, interfaceC0443);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        Object objM7859;
        int i = this.f14077;
        Object obj2 = this.f14080;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                ScrollCaptureCallbackC2259 scrollCaptureCallbackC2259 = (ScrollCaptureCallbackC2259) obj2;
                int i2 = this.f14078;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    float f = this.f14079;
                    Object objM6027 = scrollCaptureCallbackC2259.f7510.f10476.f8490.m6027(AbstractC0208.f765);
                    InterfaceC5731 interfaceC5731 = (InterfaceC5731) (objM6027 != null ? objM6027 : null);
                    if (interfaceC5731 == null) {
                        throw AbstractC3761.m6633("Required value was null.");
                    }
                    C1553 c1553 = new C1553((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                    this.f14078 = 1;
                    obj = interfaceC5731.mo219(c1553, this);
                    if (obj == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i2 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((C1553) obj).f5241 & 4294967295L)));
            default:
                int i3 = this.f14078;
                C2358 c2358 = C2358.f7817;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    float f2 = this.f14079;
                    this.f14078 = 1;
                    C4536 c4536 = ((C1705) obj2).f5675;
                    Object value = c4536.f14999.getValue();
                    Object objM7856 = c4536.m7856(c4536.m7858(), f2, value);
                    boolean zBooleanValue = ((Boolean) c4536.f14993.mo211(objM7856)).booleanValue();
                    EnumC4386 enumC4386 = EnumC4386.f14455;
                    if (zBooleanValue) {
                        objM7859 = c4536.m7859(objM7856, enumC4386, new C5761(c4536, f2, null), this);
                        if (objM7859 != enumC2282) {
                            objM7859 = c2358;
                        }
                        if (objM7859 != enumC2282) {
                            objM7859 = c2358;
                        }
                    } else {
                        objM7859 = c4536.m7859(value, enumC4386, new C5761(c4536, f2, null), this);
                        if (objM7859 != enumC2282) {
                            objM7859 = c2358;
                        }
                        if (objM7859 != enumC2282) {
                            objM7859 = c2358;
                        }
                    }
                    if (objM7859 != enumC2282) {
                        objM7859 = c2358;
                    }
                    if (objM7859 == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14077;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C4248) mo217((InterfaceC0443) obj2, Float.valueOf(((Number) obj).floatValue()))).mo218(c2358);
            default:
                return ((C4248) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4248(ScrollCaptureCallbackC2259 scrollCaptureCallbackC2259, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f14080 = scrollCaptureCallbackC2259;
    }
}
