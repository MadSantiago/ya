package p000;

/* JADX INFO: renamed from: ۥًُؕ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1058 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C5450 f3730;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C5662 f3731;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ InterfaceC3087 f3732;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ C4482 f3733;

    public C1058(InterfaceC3087 interfaceC3087, C5662 c5662, C5450 c5450, C4482 c4482) {
        this.f3732 = interfaceC3087;
        this.f3731 = c5662;
        this.f3730 = c5450;
        this.f3733 = c4482;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00a8, B:37:0x00b0), top: B:52:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m2264(C5770 c5770, AbstractC0772 abstractC0772) throws Throwable {
        C3050 c3050;
        InterfaceC3087 interfaceC3087;
        C5662 c5662;
        C5450 c5450;
        C4482 c4482;
        InterfaceC5731 interfaceC5731;
        InterfaceC3087 interfaceC3088;
        InterfaceC3087 interfaceC3089;
        C5450 c5451;
        Object obj;
        if (abstractC0772 instanceof C3050) {
            c3050 = (C3050) abstractC0772;
            int i = c3050.f10260;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3050.f10260 = i - Integer.MIN_VALUE;
            } else {
                c3050 = new C3050(this, abstractC0772);
            }
        } else {
            c3050 = new C3050(this, abstractC0772);
        }
        Object obj2 = c3050.f10261;
        int i2 = c3050.f10260;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (i2 == 0) {
                AbstractC0186.m409(obj2);
                c3050.f10258 = c5770;
                interfaceC3087 = this.f3732;
                c3050.f10257 = interfaceC3087;
                c5662 = this.f3731;
                c3050.f10259 = c5662;
                c5450 = this.f3730;
                c3050.f10263 = c5450;
                c4482 = this.f3733;
                c3050.f10264 = c4482;
                c3050.f10260 = 1;
                if (interfaceC3087.mo2949(c3050) != enumC2282) {
                }
                interfaceC5731 = c5770;
                return enumC2282;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = c3050.f10259;
                    c5451 = (C5450) c3050.f10257;
                    interfaceC3088 = (InterfaceC3087) c3050.f10258;
                    try {
                        AbstractC0186.m409(obj2);
                        c5451.f17965 = obj;
                        Object obj3 = c5451.f17965;
                        interfaceC3088.mo2950(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC3088.mo2950(null);
                        throw th;
                    }
                }
                c4482 = (C4482) c3050.f10259;
                c5451 = (C5450) c3050.f10257;
                interfaceC3089 = (InterfaceC3087) c3050.f10258;
                try {
                    AbstractC0186.m409(obj2);
                    if (!AbstractC3831.m6874(obj2, c5451.f17965)) {
                        c3050.f10258 = interfaceC3089;
                        c3050.f10257 = c5451;
                        c3050.f10259 = obj2;
                        c3050.f10260 = 3;
                        if (c4482.m7762(obj2, false, c3050) != enumC2282) {
                            obj = obj2;
                            interfaceC3088 = interfaceC3089;
                            c5451.f17965 = obj;
                        }
                        interfaceC5731 = c5770;
                        return enumC2282;
                    }
                    interfaceC3088 = interfaceC3089;
                    Object obj4 = c5451.f17965;
                    interfaceC3088.mo2950(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC3088 = interfaceC3089;
                    interfaceC3088.mo2950(null);
                    throw th;
                }
            }
            c4482 = c3050.f10264;
            C5450 c5452 = c3050.f10263;
            c5662 = (C5662) c3050.f10259;
            InterfaceC3087 interfaceC30810 = (InterfaceC3087) c3050.f10257;
            InterfaceC5731 interfaceC5732 = (InterfaceC5731) c3050.f10258;
            AbstractC0186.m409(obj2);
            c5450 = c5452;
            interfaceC5731 = interfaceC5732;
            interfaceC3087 = interfaceC30810;
            interfaceC5731 = c5770;
            if (c5662.f18631) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = c5450.f17965;
            c3050.f10258 = interfaceC3087;
            c3050.f10257 = c5450;
            c3050.f10259 = c4482;
            c3050.f10263 = null;
            c3050.f10264 = null;
            c3050.f10260 = 2;
            Object objMo219 = interfaceC5731.mo219(obj5, c3050);
            if (objMo219 != enumC2282) {
                interfaceC3089 = interfaceC3087;
                obj2 = objMo219;
                c5451 = c5450;
                if (!AbstractC3831.m6874(obj2, c5451.f17965)) {
                    c3050.f10258 = interfaceC3089;
                    c3050.f10257 = c5451;
                    c3050.f10259 = obj2;
                    c3050.f10260 = 3;
                    if (c4482.m7762(obj2, false, c3050) != enumC2282) {
                        obj = obj2;
                        interfaceC3088 = interfaceC3089;
                        c5451.f17965 = obj;
                    }
                } else {
                    interfaceC3088 = interfaceC3089;
                }
                Object obj6 = c5451.f17965;
                interfaceC3088.mo2950(null);
                return obj6;
            }
            interfaceC5731 = c5770;
            return enumC2282;
        } catch (Throwable th3) {
            th = th3;
            interfaceC3088 = interfaceC3087;
            interfaceC3088.mo2950(null);
            throw th;
        }
    }
}
