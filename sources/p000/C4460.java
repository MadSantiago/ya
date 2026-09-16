package p000;

/* JADX INFO: renamed from: ۦ٘ٞ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4460 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f14703;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0857 f14704;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f14705;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f14706;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f14707;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f14708;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f14709;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14710 = 1;

    public /* synthetic */ C4460(int i, InterfaceC5731 interfaceC5731, C0857 c0857, InterfaceC5731 interfaceC5732, InterfaceC5731 interfaceC5733, InterfaceC4686 interfaceC4686, InterfaceC5731 interfaceC5734, int i2) {
        this.f14709 = i;
        this.f14705 = interfaceC5731;
        this.f14704 = c0857;
        this.f14703 = interfaceC5732;
        this.f14706 = interfaceC5733;
        this.f14707 = interfaceC4686;
        this.f14708 = interfaceC5734;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14710;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f14708;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(this.f14709) | 1;
                this.f14704.m1820(this.f14705, (Boolean) obj3, this.f14703, this.f14706, this.f14707, (C5362) obj, iM6835);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6836 = AbstractC3831.m6835(1);
                AbstractC3831.m6852(this.f14709, (InterfaceC5731) this.f14705, this.f14704, (InterfaceC5731) this.f14703, (InterfaceC5731) this.f14706, (InterfaceC4686) this.f14707, (InterfaceC5731) obj3, (C5362) obj, iM6836);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C4460(C0857 c0857, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f14704 = c0857;
        this.f14705 = obj;
        this.f14708 = bool;
        this.f14703 = obj2;
        this.f14706 = obj3;
        this.f14707 = obj4;
        this.f14709 = i;
    }
}
