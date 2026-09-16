package p000;

/* JADX INFO: renamed from: ۥؘؔؕٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0404 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f1482 = 1;

    /* JADX INFO: renamed from: ۥٖ */
    public float f1483;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f1484;

    /* JADX INFO: renamed from: ۦٗ */
    public int f1485;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ Object f1486;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404(C4752 c4752, float f, InterfaceC3347 interfaceC3347, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f1486 = c4752;
        this.f1483 = f;
        this.f1484 = interfaceC3347;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f1482;
        Object obj2 = this.f1484;
        switch (i) {
            case 0:
                return new C0404((C4752) this.f1486, this.f1483, (InterfaceC3347) obj2, interfaceC0443);
            default:
                C0404 c0404 = new C0404((C0777) obj2, interfaceC0443);
                c0404.f1486 = obj;
                return c0404;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        final float fM6836;
        InterfaceC4643 interfaceC4643;
        int i = this.f1482;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f1484;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f1485;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    this.f1485 = 1;
                    return C5825.m9634((C5825) ((C4752) this.f1486).f15684, new Float(this.f1483), (InterfaceC3347) obj2, this, 12) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f1485;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC4643 interfaceC4644 = (InterfaceC4643) this.f1486;
                    fM6836 = AbstractC3831.m6836(interfaceC4644.mo1586());
                    interfaceC4643 = interfaceC4644;
                } else {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fM6836 = this.f1483;
                    interfaceC4643 = (InterfaceC4643) this.f1486;
                    AbstractC0186.m409(obj);
                }
                while (AbstractC4009.m7150(interfaceC4643)) {
                    final C0777 c0777 = (C0777) obj2;
                    InterfaceC4745 interfaceC4745 = new InterfaceC4745() { // from class: ۥٟ۟ؓ۠
                        @Override // p000.InterfaceC4745
                        /* JADX INFO: renamed from: ۦؚ */
                        public final Object mo211(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            C0777 c0778 = c0777;
                            boolean zM1681 = c0778.m1681();
                            C0925 c0925 = c0778.f2818;
                            if (!zM1681) {
                                if (c0925.m1901() == Long.MIN_VALUE) {
                                    c0925.m1900(jLongValue);
                                    c0778.f2813.f17214.setValue(Boolean.TRUE);
                                }
                                long jM1901 = jLongValue - c0925.m1901();
                                float f = fM6836;
                                if (f != 0.0f) {
                                    jM1901 = AbstractC2776.m5222(jM1901 / ((double) f));
                                }
                                if (c0778.f2811 == null) {
                                    c0778.f2810.m1900(jM1901);
                                }
                                c0778.m1675(jM1901, f == 0.0f);
                            }
                            return C2358.f7817;
                        }
                    };
                    this.f1486 = interfaceC4643;
                    this.f1483 = fM6836;
                    this.f1485 = 1;
                    if (AbstractC2133.m4131(this.f2791).m4526(interfaceC4745, this) == enumC2282) {
                        return enumC2282;
                    }
                }
                return c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f1482;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C0404) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0404(C0777 c0777, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f1484 = c0777;
    }
}
