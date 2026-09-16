package p000;

/* JADX INFO: renamed from: ۥٌۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0929 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2247 f3313;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1966 f3314;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3315;

    public /* synthetic */ C0929(C1966 c1966, C2247 c2247, int i, int i2) {
        this.f3315 = i2;
        this.f3314 = c1966;
        this.f3313 = c2247;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3315;
        C2358 c2358 = C2358.f7817;
        C2247 c2247 = this.f3313;
        C1966 c1966 = this.f3314;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                C5063.m8646(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
            case 1:
                C5063.m8634(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5063.m8648(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5063.m8648(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5063.m8639(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
            default:
                C5063.m8640(c1966, c2247, c5362, AbstractC3831.m6835(65));
                break;
        }
        return c2358;
    }
}
