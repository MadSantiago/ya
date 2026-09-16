package p000;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: ۦًٗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4389 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f14465;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f14466;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14467;

    public C4389(InterfaceC0335 interfaceC0335) {
        this.f14467 = 3;
        this.f14466 = interfaceC0335;
        C0892 c0892 = C0892.f3234;
        Class<?> cls = interfaceC0335.getClass();
        C2966 c2966 = (C2966) c0892.f3236.get(cls);
        this.f14465 = c2966 == null ? c0892.m1884(cls, null) : c2966;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        int i = this.f14467;
        Object obj = this.f14466;
        Object obj2 = this.f14465;
        switch (i) {
            case 0:
                InterfaceC3240 interfaceC3240 = (InterfaceC3240) obj;
                switch (AbstractC5690.f18719[enumC1924.ordinal()]) {
                    case 1:
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        interfaceC3240.mo2393();
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        interfaceC3240.mo1782();
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        interfaceC3240.mo1784();
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        interfaceC3240.mo5957();
                        break;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        C1078.m2272("ON_ANY must not been send by anybody");
                        break;
                    default:
                        C1078.m2275();
                        break;
                }
                InterfaceC1648 interfaceC1648 = (InterfaceC1648) obj2;
                if (interfaceC1648 != null) {
                    interfaceC1648.mo1683(interfaceC4507, enumC1924);
                }
                break;
            case 1:
                if (enumC1924 == EnumC1924.ON_START) {
                    ((AbstractC1434) obj).mo2389(this);
                    ((C2346) obj2).m4404();
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C1585 c1585 = (C1585) obj;
                int i2 = AbstractC2357.f7815[enumC1924.ordinal()];
                if (i2 == 1) {
                    c1585.m3324(true);
                    break;
                } else if (i2 == 2) {
                    c1585.m3324(false);
                    break;
                } else if (i2 == 3) {
                    c1585.m3325();
                    ((AbstractC1434) obj2).mo2389(this);
                    break;
                }
                break;
            default:
                InterfaceC0335 interfaceC0335 = (InterfaceC0335) obj;
                HashMap map = ((C2966) obj2).f9950;
                C2966.m5524((List) map.get(enumC1924), interfaceC4507, enumC1924, interfaceC0335);
                C2966.m5524((List) map.get(EnumC1924.ON_ANY), interfaceC4507, enumC1924, interfaceC0335);
                break;
        }
    }

    public /* synthetic */ C4389(int i, Object obj, Object obj2) {
        this.f14467 = i;
        this.f14466 = obj;
        this.f14465 = obj2;
    }

    public C4389(C1585 c1585, C4023 c4023, AbstractC1434 abstractC1434) {
        this.f14467 = 2;
        this.f14466 = c1585;
        this.f14465 = abstractC1434;
    }
}
