package p000;

/* JADX INFO: renamed from: ۥْ۠ؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2492 extends C2818 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f8289;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2492(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f8289 = i3;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        boolean zM7315;
        boolean zM7316;
        int i = this.f8289;
        C2358 c2358 = C2358.f7817;
        C1506 c1506 = null;
        byte b = 0;
        Object obj3 = this.f11309;
        switch (i) {
            case 0:
                EnumC4125 enumC4125 = (EnumC4125) obj;
                EnumC4125 enumC4126 = (EnumC4125) obj2;
                C3448 c3448 = (C3448) obj3;
                if (c3448.f17786 && (zM7315 = enumC4126.m7315()) != enumC4125.m7315()) {
                    if (!zM7315) {
                        C1506 c1507 = c3448.f11456;
                        if (c1507 != null) {
                            c1507.m3182();
                        }
                        c3448.f11456 = null;
                    } else {
                        C5450 c5450 = new C5450();
                        AbstractC5568.m9359(c3448, new C5304(4, c5450, c3448));
                        C1506 c1508 = (C1506) c5450.f17965;
                        if (c1508 != null) {
                            c1508.m3183();
                            c1506 = c1508;
                        }
                        c3448.f11456 = c1506;
                    }
                }
                break;
            default:
                EnumC4125 enumC4127 = (EnumC4125) obj;
                EnumC4125 enumC4128 = (EnumC4125) obj2;
                C3165 c3165 = (C3165) obj3;
                if (c3165.f17786 && (zM7316 = enumC4128.m7315()) != enumC4127.m7315()) {
                    InterfaceC4745 interfaceC4745 = c3165.f10650;
                    if (interfaceC4745 != null) {
                        interfaceC4745.mo211(Boolean.valueOf(zM7316));
                    }
                    C4036 c4036 = AbstractC2092.f6886;
                    if (zM7316) {
                        AbstractC2765.m5135(c3165.m9076(), null, 0, new C2718((Object) c3165, (InterfaceC0443) (b == true ? 1 : 0), 2), 3);
                        C5450 c5451 = new C5450();
                        AbstractC5568.m9359(c3165, new C1225(12, c5451, c3165));
                        C1506 c1509 = (C1506) c5451.f17965;
                        if (c1509 != null) {
                            c1509.m3183();
                        } else {
                            c1509 = null;
                        }
                        c3165.f10652 = c1509;
                        InterfaceC2015 interfaceC2015 = c3165.f10651;
                        if (interfaceC2015 != null && interfaceC2015.mo2807() && c3165.f17786) {
                            AbstractC5378.m9068(c3165, c4036);
                        }
                    } else {
                        C1506 c15010 = c3165.f10652;
                        if (c15010 != null) {
                            c15010.m3182();
                        }
                        c3165.f10652 = null;
                        if (c3165.f17786) {
                            AbstractC5378.m9068(c3165, c4036);
                        }
                    }
                    AbstractC0186.m412(c3165);
                    C2243 c2243 = c3165.f10649;
                    if (c2243 != null) {
                        C3213 c3213 = c3165.f10654;
                        if (zM7316) {
                            if (c3213 != null) {
                                c3165.m5841(c2243, new C4315(c3213));
                                c3165.f10654 = null;
                            }
                            C3213 c3214 = new C3213();
                            c3165.m5841(c2243, c3214);
                            c3165.f10654 = c3214;
                        } else if (c3213 != null) {
                            c3165.m5841(c2243, new C4315(c3213));
                            c3165.f10654 = null;
                        }
                    }
                }
                break;
        }
        return c2358;
    }
}
