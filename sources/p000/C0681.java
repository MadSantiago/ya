package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؘؖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4367 f2485;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2486;

    public /* synthetic */ C0681(InterfaceC4367 interfaceC4367, int i) {
        this.f2486 = i;
        this.f2485 = interfaceC4367;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f2486;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f2485;
        switch (i) {
            case 0:
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) interfaceC4367.getValue();
                if (interfaceC2015 != null) {
                    return interfaceC2015;
                }
                AbstractC4690.m8039("Required value was null.");
                C1078.m2274();
                return null;
            case 1:
                InterfaceC2015 interfaceC2016 = (InterfaceC2015) interfaceC4367.getValue();
                if (interfaceC2016 != null) {
                    return interfaceC2016;
                }
                AbstractC4690.m8039("Required value was null.");
                C1078.m2274();
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC4367 != null) {
                    return (List) interfaceC4367.getValue();
                }
                return null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                interfaceC4367.setValue(Boolean.TRUE);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Boolean bool = (Boolean) interfaceC4367.getValue();
                bool.booleanValue();
                return bool;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                interfaceC4367.setValue(Boolean.TRUE);
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            case 8:
                return (InterfaceC4112) ((InterfaceC4448) interfaceC4367.getValue()).mo449();
            case 9:
                return new C4801((InterfaceC4745) interfaceC4367.getValue());
            case 10:
                InterfaceC2015 interfaceC2017 = (InterfaceC2015) interfaceC4367.getValue();
                if (interfaceC2017 != null) {
                    return interfaceC2017;
                }
                AbstractC4690.m8039("Required value was null.");
                C1078.m2274();
                return null;
            case 11:
                interfaceC4367.setValue(Boolean.TRUE);
                return c2358;
            case 12:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            case 13:
                interfaceC4367.setValue(Boolean.TRUE);
                return c2358;
            case 14:
                interfaceC4367.setValue(Boolean.TRUE);
                return c2358;
            case 15:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            case 16:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            case 17:
                interfaceC4367.setValue(new C5745(0L, (String) null, 7));
                return c2358;
            case 18:
                interfaceC4367.setValue(Boolean.FALSE);
                return c2358;
            default:
                return (InterfaceC2015) interfaceC4367.getValue();
        }
    }
}
