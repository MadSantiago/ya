package p000;

/* JADX INFO: renamed from: ۦؙؐؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2996 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f10072;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2996 f10073 = new C2996();

    static {
        C2204 c2204 = C2204.f7302;
        if (AbstractC0684.m1534("kotlinx.serialization.json.JsonLiteral")) {
            C1078.m2272("Blank serial names are prohibited");
            return;
        }
        Object it = ((C4552) AbstractC0798.f2865.values()).iterator();
        while (((AbstractC4958) it).hasNext()) {
            InterfaceC4734 interfaceC4734 = (InterfaceC4734) ((C0893) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(interfaceC4734.mo193().mo186())) {
                C1078.m2272(AbstractC1098.m2323("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + AbstractC5041.m8557(interfaceC4734.getClass()).m5775() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                return;
            }
        }
        f10072 = new C2423("kotlinx.serialization.json.JsonLiteral", c2204);
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f10072;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        C3501 c3501M7968 = AbstractC4593.m7968(interfaceC2125);
        AbstractC0695 abstractC0695M6290 = c3501M7968.m6290();
        if (abstractC0695M6290 instanceof C0173) {
            return (C0173) abstractC0695M6290;
        }
        String str = "Unexpected JSON element, expected JsonLiteral, had " + AbstractC5041.m8557(abstractC0695M6290.getClass());
        C3510 c3510 = c3501M7968.m6289().f3430;
        throw new C2770(AbstractC3801.m6762(-1, str, null, null, AbstractC3801.m6795(-1, abstractC0695M6290.toString()).toString()));
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        Double dValueOf;
        C0173 c0173 = (C0173) obj;
        String str = c0173.f648;
        AbstractC4593.m7969(c3782);
        if (c0173.f649) {
            c3782.m6686(str);
            return;
        }
        Long lM8361 = AbstractC4981.m8361(str);
        if (lM8361 != null) {
            c3782.m6697(lM8361.longValue());
            return;
        }
        C4462 c4462M1965 = AbstractC0949.m1965(str);
        if (c4462M1965 != null) {
            c3782.m6690(C1785.f5952).m6697(c4462M1965.f14714);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = AbstractC0422.m926(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            c3782.m6684(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            c3782.m6689(bool.booleanValue());
        } else {
            c3782.m6686(str);
        }
    }
}
