package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۤ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0046 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f8809;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f8810;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046(int i, Object obj) {
        super(2);
        this.f8810 = i;
        this.f8809 = obj;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f8810;
        C4217 c4217 = C4217.f13994;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f8809;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractC0054) obj3).mo1384(0, c5362);
                } else {
                    c5362.m8982();
                }
                return c2358;
            case 1:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM8999 = c5363.m8999();
                    if (objM8999 == C2850.f9517) {
                        objM8999 = C1931.f6382;
                        c5363.m8987(objM8999);
                    }
                    AbstractC0186.m422(AbstractC1697.m3510(c4217, false, (InterfaceC4745) objM8999), (InterfaceC5731) ((InterfaceC4367) obj3).getValue(), c5363, 0);
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Number) obj2).intValue();
                ((C2626) obj3).mo1384(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj;
                InterfaceC0705 interfaceC0705M2124 = (InterfaceC2252) obj2;
                C5362 c5364 = (C5362) obj3;
                if (interfaceC0705M2124 instanceof C2373) {
                    InterfaceC2609 interfaceC2609 = ((C2373) interfaceC0705M2124).f7856;
                    AbstractC3801.m6782(3, interfaceC2609);
                    interfaceC0705M2124 = AbstractC0993.m2124(c5364, (InterfaceC0705) interfaceC2609.mo1173(c4217, c5364, 0));
                }
                return interfaceC0705.mo1571(interfaceC0705M2124);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Number) obj2).intValue();
                ((C0617) obj3).mo1384(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5362 c5365 = (C5362) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c5365.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        InterfaceC5731 interfaceC5731 = (InterfaceC5731) list.get(i2);
                        int iHashCode = Long.hashCode(c5365.f17657);
                        InterfaceC4576.f15106.getClass();
                        C3218 c3218 = C0849.f3046;
                        c5365.m8983();
                        if (c5365.f17668) {
                            c5365.m9005(c3218);
                        } else {
                            c5365.m8972();
                        }
                        AbstractC0993.m2127(C0849.f3053, c5365, Integer.valueOf(iHashCode));
                        interfaceC5731.mo219(c5365, 0);
                        c5365.m9009(true);
                    }
                } else {
                    c5365.m8982();
                }
                return c2358;
            default:
                ((Number) obj2).intValue();
                ((C2453) obj3).mo1384(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046(AbstractC0054 abstractC0054, int i, int i2) {
        super(2);
        this.f8810 = i2;
        this.f8809 = abstractC0054;
    }
}
