package p000;

/* JADX INFO: renamed from: ۥؘؓؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0338 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C0857 f1254;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ long f1255;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f1256;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC5731 f1257;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C0857 f1258;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f1259;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC0705 f1260;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1261 = 0;

    public /* synthetic */ C0338(int i, InterfaceC0705 interfaceC0705, long j, long j2, C0857 c0857, InterfaceC5731 interfaceC5731, C0857 c0858, int i2) {
        this.f1259 = i;
        this.f1260 = interfaceC0705;
        this.f1255 = j;
        this.f1256 = j2;
        this.f1254 = c0857;
        this.f1257 = interfaceC5731;
        this.f1258 = c0858;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f1261;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(1597441);
                AbstractC2164.m4185(this.f1259, this.f1260, this.f1255, this.f1256, this.f1254, this.f1257, this.f1258, (C5362) obj, iM6835);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6836 = AbstractC3831.m6835(this.f1259 | 1);
                AbstractC2164.m4204(this.f1260, this.f1255, this.f1256, this.f1254, this.f1257, this.f1258, (C5362) obj, iM6836);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C0338(InterfaceC0705 interfaceC0705, long j, long j2, C0857 c0857, InterfaceC5731 interfaceC5731, C0857 c0858, int i) {
        this.f1260 = interfaceC0705;
        this.f1255 = j;
        this.f1256 = j2;
        this.f1254 = c0857;
        this.f1257 = interfaceC5731;
        this.f1258 = c0858;
        this.f1259 = i;
    }
}
