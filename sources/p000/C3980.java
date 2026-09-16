package p000;

/* JADX INFO: renamed from: ۦِٖؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3980 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5269 f13296;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13297;

    public /* synthetic */ C3980(C5269 c5269) {
        this.f13297 = 1;
        this.f13296 = c5269;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13297;
        C2358 c2358 = C2358.f7817;
        C5269 c5269 = this.f13296;
        C5362 c5362 = (C5362) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC4489.m7801(c5269, c5362, AbstractC3831.m6835(9));
                break;
            case 1:
                int iIntValue = num.intValue();
                new C4441(new long[]{569980676512033870L, -6023558836531778925L, -6928672876817283584L, -5619012731092804480L, 5911656975434997282L, 7387355024497456461L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    AbstractC4489.m7801(c5269, c5362, 8);
                }
                break;
            default:
                num.getClass();
                AbstractC4489.m7778(c5269, c5362, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C3980(C5269 c5269, int i, int i2) {
        this.f13297 = i2;
        this.f13296 = c5269;
    }
}
