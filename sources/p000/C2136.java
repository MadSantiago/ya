package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥَۘؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2136 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4367 f7012;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7013;

    public /* synthetic */ C2136(InterfaceC4367 interfaceC4367, int i) {
        this.f7013 = i;
        this.f7012 = interfaceC4367;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f7013;
        C2358 c2358 = C2358.f7817;
        InterfaceC4367 interfaceC4367 = this.f7012;
        switch (i) {
            case 0:
                interfaceC4367.setValue((InterfaceC2015) obj);
                return c2358;
            case 1:
                interfaceC4367.setValue((InterfaceC2015) obj);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj;
                if (interfaceC4367 != null) {
                    interfaceC4367.setValue(list);
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C1987 c1987 = (C1987) obj;
                interfaceC4367.setValue(c1987.f6557 ? c1987.f6558 : c1987.f6559);
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Float f = (Float) obj;
                f.getClass();
                ((InterfaceC4745) interfaceC4367.getValue()).mo211(f);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                interfaceC4367.setValue((InterfaceC2015) obj);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((InterfaceC4745) interfaceC4367.getValue()).mo211(f2)).floatValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5745 c5745 = (C5745) obj;
                String strM9761 = AbstractC0684.m9761(5, c5745.f18944.f4307);
                int length = strM9761.length();
                for (int i2 = 0; i2 < length; i2++) {
                    if (!Character.isDigit(strM9761.charAt(i2))) {
                        strM9761 = strM9761.substring(0, i2);
                        new C4441(new long[]{4400565854577962283L, -7581522211807377568L, -1881822233135272331L}).toString();
                        int length2 = c5745.f18944.f4307.length();
                        interfaceC4367.setValue(new C5745(AbstractC2765.m5145(length2, length2), strM9761, 4));
                        return c2358;
                    }
                }
                int length3 = c5745.f18944.f4307.length();
                interfaceC4367.setValue(new C5745(AbstractC2765.m5145(length3, length3), strM9761, 4));
                return c2358;
            case 8:
                ((InterfaceC4745) interfaceC4367.getValue()).mo211((C1553) obj);
                return c2358;
            default:
                interfaceC4367.setValue((InterfaceC2015) obj);
                return c2358;
        }
    }
}
