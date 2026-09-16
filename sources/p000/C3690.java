package p000;

/* JADX INFO: renamed from: ۦًٕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3690 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0857 f12318;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f12319;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC0705 f12320;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12321;

    public /* synthetic */ C3690(InterfaceC0705 interfaceC0705, C0857 c0857, int i, int i2) {
        this.f12321 = i2;
        this.f12320 = interfaceC0705;
        this.f12318 = c0857;
        this.f12319 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f12321;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f12319;
        C0857 c0857 = this.f12318;
        InterfaceC0705 interfaceC0705 = this.f12320;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                C3133.m5793(interfaceC0705, c0857, c5362, AbstractC3831.m6835(i2 | 1));
                break;
            case 1:
                C3133.m5790(interfaceC0705, c0857, c5362, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1211.m2582(interfaceC0705, c0857, c5362, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC2164.m4194(interfaceC0705, c0857, c5362, AbstractC3831.m6835(i2 | 1));
                break;
            default:
                AbstractC2164.m4211(interfaceC0705, c0857, c5362, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }
}
