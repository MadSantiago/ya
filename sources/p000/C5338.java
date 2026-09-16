package p000;

/* JADX INFO: renamed from: ۦً۟ؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5338 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17595;

    public /* synthetic */ C5338(int i) {
        this.f17595 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17595;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return Integer.valueOf(((C1857) obj2).f6196);
            case 1:
                return Integer.valueOf(((C2591) obj2).f8654);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C2309 c2309 = (C2309) obj2;
                return AbstractC2164.m4212(AbstractC0539.m1236(new C4043(c2309.f7647), AbstractC4489.f14850, (C5869) obj), Boolean.valueOf(c2309.f7646));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((C4043) obj2).f13484);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(((C3945) obj2).f13176.m360());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0993.m2151(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC0993.m2134(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                AbstractC4225.m7455(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case 8:
                return (EnumC0845) ((C1705) obj2).f5675.f14999.getValue();
            case 9:
                ((Integer) obj2).getClass();
                AbstractC4554.m7889(AbstractC3831.m6835(1), (C5362) obj);
                return c2358;
            case 10:
                return Integer.valueOf(((InterfaceC1827) obj).mo3600(((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(((InterfaceC1827) obj).mo3599(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((InterfaceC1827) obj).mo3596(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((InterfaceC1827) obj).mo3598(((Integer) obj2).intValue()));
            case 14:
                C4950 c4950 = (C4950) obj2;
                return AbstractC2164.m4188(Float.valueOf(c4950.f16381.m1711()), Boolean.valueOf(((EnumC1616) c4950.f16379.getValue()) == EnumC1616.f5425));
            case 15:
                InterfaceC4137 interfaceC4137 = (InterfaceC4137) obj2;
                if (!(interfaceC4137 instanceof C0464)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC4137 : Integer.valueOf(iIntValue + 1);
            case 16:
                C0464 c0464 = (C0464) obj;
                InterfaceC4137 interfaceC4138 = (InterfaceC4137) obj2;
                if (c0464 != null) {
                    return c0464;
                }
                if (interfaceC4138 instanceof C0464) {
                    return (C0464) interfaceC4138;
                }
                return null;
            case 17:
                C3313 c3313 = (C3313) obj;
                InterfaceC4137 interfaceC4139 = (InterfaceC4137) obj2;
                if (interfaceC4139 instanceof C0464) {
                    C0464 c0465 = (C0464) interfaceC4139;
                    InterfaceC3534 interfaceC3534 = c3313.f11098;
                    Object objM980 = c0465.m980();
                    Object[] objArr = c3313.f11097;
                    int i2 = c3313.f11099;
                    objArr[i2] = objM980;
                    C0464[] c0464Arr = c3313.f11096;
                    c3313.f11099 = i2 + 1;
                    c0464Arr[i2] = c0465;
                }
                return c3313;
            default:
                C5765 c5765 = (C5765) obj2;
                return AbstractC2164.m4188(Float.valueOf(c5765.f19007), Float.valueOf(c5765.f19005.m1711()), Float.valueOf(c5765.f19006.m1711()));
        }
    }

    public /* synthetic */ C5338(int i, int i2) {
        this.f17595 = i2;
    }
}
