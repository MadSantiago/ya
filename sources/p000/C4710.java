package p000;

/* JADX INFO: renamed from: ۦٜؗ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4710 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f15525;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f15526;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f15527;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f15528;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15529;

    public /* synthetic */ C4710(C3963 c3963, InterfaceC0705 interfaceC0705, long j, int i, int i2) {
        this.f15529 = 0;
        this.f15527 = c3963;
        this.f15525 = interfaceC0705;
        this.f15528 = j;
        this.f15526 = i2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f15529;
        int i2 = this.f15526;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f15525;
        Object obj4 = this.f15527;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(49);
                AbstractC5042.m8559((C3963) obj4, (InterfaceC0705) obj3, this.f15528, (C5362) obj, iM6835, this.f15526);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM6836 = AbstractC3831.m6835(i2 | 1);
                AbstractC2765.m5143(this.f15528, (C3564) obj4, (InterfaceC5731) obj3, (C5362) obj, iM6836);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6837 = AbstractC3831.m6835(i2 | 1);
                AbstractC0487.m1039(this.f15528, (C3564) obj4, (C0857) obj3, (C5362) obj, iM6837);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C4710(long j, C3564 c3564, InterfaceC5731 interfaceC5731, int i, int i2) {
        this.f15529 = i2;
        this.f15528 = j;
        this.f15527 = c3564;
        this.f15525 = interfaceC5731;
        this.f15526 = i;
    }
}
