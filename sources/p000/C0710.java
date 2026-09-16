package p000;

/* JADX INFO: renamed from: ۥَؙؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0710 implements InterfaceC4707 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f2614;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2615;

    public /* synthetic */ C0710(int i, Object obj) {
        this.f2615 = i;
        this.f2614 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    @Override // p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo1575(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) throws Throwable {
        C0011 c0011;
        C3049 c3049;
        Throwable th;
        int i = this.f2615;
        InterfaceC0443 interfaceC0444 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj = this.f2614;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                Object objMo1575 = ((C1736) obj).mo1575(new C0462(2, interfaceC4161), interfaceC0443);
                return objMo1575 == enumC2282 ? objMo1575 : c2358;
            case 1:
                if (interfaceC0443 instanceof C0011) {
                    c0011 = (C0011) interfaceC0443;
                    int i2 = c0011.f2531;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0011.f2531 = i2 - Integer.MIN_VALUE;
                    } else {
                        c0011 = new C0011(this, interfaceC0443);
                    }
                } else {
                    c0011 = new C0011(this, interfaceC0443);
                }
                Object obj2 = c0011.f2528;
                int i3 = c0011.f2531;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3049 = c0011.f2529;
                    try {
                        AbstractC0186.m409(obj2);
                        c3049.mo1662();
                        return c2358;
                    } catch (Throwable th2) {
                        th = th2;
                        c3049.mo1662();
                        throw th;
                    }
                }
                AbstractC0186.m409(obj2);
                C3049 c30410 = new C3049(interfaceC4161, c0011.f2791);
                try {
                    c0011.f2529 = c30410;
                    c0011.f2531 = 1;
                    Object objMo219 = ((InterfaceC5731) obj).mo219(c30410, c0011);
                    if (objMo219 != enumC2282) {
                        objMo219 = c2358;
                    }
                    if (objMo219 == enumC2282) {
                        return enumC2282;
                    }
                    c3049 = c30410;
                    c3049.mo1662();
                    return c2358;
                } catch (Throwable th3) {
                    c3049 = c30410;
                    th = th3;
                    c3049.mo1662();
                    throw th;
                }
            default:
                InterfaceC4707[] interfaceC4707Arr = (InterfaceC4707[]) obj;
                C5696 c5696 = new C5696(interfaceC4707Arr, new C2767(3, interfaceC4707Arr), new C0629(3, interfaceC0444), interfaceC4161, null);
                C1728 c1728 = new C1728(interfaceC0443, interfaceC0443.mo334());
                Object objM1066 = AbstractC0487.m1066(c1728, true, c1728, c5696);
                if (objM1066 != enumC2282) {
                    objM1066 = c2358;
                }
                return objM1066 == enumC2282 ? objM1066 : c2358;
        }
    }
}
