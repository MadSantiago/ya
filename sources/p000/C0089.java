package p000;

/* JADX INFO: renamed from: ۦۚ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0089 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f17043;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17044;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17045;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f17046;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17047;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17048;

    public /* synthetic */ C0089(C0857 c0857, InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, C2415 c2415, int i, int i2) {
        this.f17048 = 4;
        this.f17044 = c0857;
        this.f17045 = interfaceC0705;
        this.f17043 = interfaceC5731;
        this.f17046 = c2415;
        this.f17047 = i2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17048;
        int i2 = this.f17047;
        Object obj3 = this.f17046;
        Object obj4 = this.f17043;
        C2358 c2358 = C2358.f7817;
        Object obj5 = this.f17045;
        Object obj6 = this.f17044;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0993.m2140((String) obj6, (String) obj5, (String) obj4, (String) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4753.m8081((InterfaceC4448) obj6, (InterfaceC0705) obj5, (C4231) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                AbstractC0487.m1064((InterfaceC4396) obj6, (C0857) obj5, (C4153) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(i2) | 1;
                ((C0857) obj6).m1815((C0843) obj5, this.f17043, this.f17046, (C5362) obj, iM6835);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                AbstractC0993.m2159((C0857) obj6, (InterfaceC0705) obj5, (InterfaceC5731) obj4, (C2415) obj3, (C5362) obj, AbstractC3831.m6835(3079), this.f17047);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5420.m9092((C2917) obj6, (C1831) obj5, (C4413) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C0089(InterfaceC4396 interfaceC4396, C0857 c0857, C4153 c4153, C0857 c0858, int i) {
        this.f17048 = 2;
        this.f17044 = interfaceC4396;
        this.f17045 = c0857;
        this.f17043 = c4153;
        this.f17046 = c0858;
        this.f17047 = i;
    }

    public /* synthetic */ C0089(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f17048 = i2;
        this.f17044 = obj;
        this.f17045 = obj2;
        this.f17043 = obj3;
        this.f17046 = obj4;
        this.f17047 = i;
    }
}
