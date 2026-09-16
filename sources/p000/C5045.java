package p000;

/* JADX INFO: renamed from: ۦٜۘؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5045 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3557 f16734;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16735;

    public /* synthetic */ C5045(C3557 c3557, int i, int i2) {
        this.f16735 = i2;
        this.f16734 = c3557;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f16735;
        C2358 c2358 = C2358.f7817;
        C3557 c3557 = this.f16734;
        C5362 c5362 = (C5362) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC4225.m7477(c3557, c5362, AbstractC3831.m6835(9));
                break;
            case 1:
                AbstractC4225.m7474(c3557, c5362, AbstractC3831.m6835(9));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC4225.m7447(c3557, c5362, AbstractC3831.m6835(9));
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC4225.m7489(c3557, c5362, AbstractC3831.m6835(9));
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC4225.m7485(c3557, c5362, AbstractC3831.m6835(9));
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC4225.m7486(c3557, c5362, AbstractC3831.m6835(9));
                break;
            default:
                AbstractC4225.m7475(c3557, c5362, AbstractC3831.m6835(9));
                break;
        }
        return c2358;
    }
}
