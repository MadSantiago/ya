package p000;

/* JADX INFO: renamed from: ۥٓ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0021 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f4275;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f4276;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f4277;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4278;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4279;

    public /* synthetic */ C0021(InterfaceC0705 interfaceC0705, C2450 c2450, InterfaceC4745 interfaceC4745, int i, int i2) {
        this.f4279 = 5;
        this.f4276 = interfaceC0705;
        this.f4277 = c2450;
        this.f4275 = interfaceC4745;
        this.f4278 = i2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f4279;
        int i2 = this.f4278;
        Object obj3 = this.f4275;
        Object obj4 = this.f4277;
        C2358 c2358 = C2358.f7817;
        Object obj5 = this.f4276;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(3127);
                AbstractC0993.m2158((String) obj5, (String) obj4, this.f4278, (String) obj3, (C5362) obj, iM6835);
                break;
            case 1:
                ((Integer) obj2).getClass();
                C4773.m8124((InterfaceC3457) obj5, (InterfaceC5807) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                AbstractC0949.m1943((InterfaceC0705) obj5, (AbstractC2266) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                AbstractC0487.m1046((C4153) obj5, (InterfaceC4367) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                ((C0857) obj5).m1819(obj4, obj3, (C5362) obj, AbstractC3831.m6835(i2) | 1);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC3109.m5690((InterfaceC0705) obj5, (C2450) obj4, (InterfaceC4745) obj3, (C5362) obj, AbstractC3831.m6835(1), this.f4278);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC3109.m5691((C2450) obj5, (InterfaceC0705) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                AbstractC1211.m2579((C0843) obj5, (InterfaceC3320) obj4, (InterfaceC4448) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iM6836 = AbstractC3831.m6835(1);
                AbstractC2164.m4209((InterfaceC4112) obj5, this.f4277, this.f4278, this.f4275, (C5362) obj, iM6836);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((C2069) obj5).mo1661(obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((C5108) obj5).mo1661(obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C0165) obj5).m350((Object[]) obj4, (InterfaceC4745) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C0021(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f4279 = i2;
        this.f4276 = obj;
        this.f4277 = obj2;
        this.f4275 = obj3;
        this.f4278 = i;
    }

    public /* synthetic */ C0021(C4153 c4153, InterfaceC4367 interfaceC4367, C0857 c0857, int i) {
        this.f4279 = 3;
        this.f4276 = c4153;
        this.f4277 = interfaceC4367;
        this.f4275 = c0857;
        this.f4278 = i;
    }

    public /* synthetic */ C0021(Object obj, Object obj2, int i, Object obj3, int i2, int i3) {
        this.f4279 = i3;
        this.f4276 = obj;
        this.f4277 = obj2;
        this.f4278 = i;
        this.f4275 = obj3;
    }
}
