package p000;

/* JADX INFO: renamed from: ۦۚؑۚٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5150 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f17061;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC0705 f17062;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17063 = 1;

    public /* synthetic */ C5150(InterfaceC0705 interfaceC0705, int i) {
        this.f17062 = interfaceC0705;
        this.f17061 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17063;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f17061;
        InterfaceC0705 interfaceC0705 = this.f17062;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0131.m287(interfaceC0705, c5362, AbstractC3831.m6835(1), i2);
                break;
            default:
                AbstractC1089.m2299(interfaceC0705, c5362, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C5150(InterfaceC0705 interfaceC0705, int i, int i2) {
        this.f17062 = interfaceC0705;
        this.f17061 = i2;
    }
}
