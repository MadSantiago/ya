package p000;

/* JADX INFO: renamed from: ۦۙؕٗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5115 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5648 f16961;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1966 f16962;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16963;

    public /* synthetic */ C5115(C1966 c1966, C5648 c5648, int i, int i2) {
        this.f16963 = i2;
        this.f16962 = c1966;
        this.f16961 = c5648;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f16963;
        C2358 c2358 = C2358.f7817;
        C5648 c5648 = this.f16961;
        C1966 c1966 = this.f16962;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                C5063.m8610(c1966, c5648, c5362, AbstractC3831.m6835(65));
                break;
            case 1:
                C5063.m8615(c1966, c5648, c5362, AbstractC3831.m6835(65));
                break;
            default:
                C5063.m8630(c1966, c5648, c5362, AbstractC3831.m6835(65));
                break;
        }
        return c2358;
    }
}
