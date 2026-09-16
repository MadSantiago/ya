package p000;

/* JADX INFO: renamed from: ۦْؔۢٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4076 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5277 f13592;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13593;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13594 = 1;

    public /* synthetic */ C4076(int i, C5277 c5277) {
        this.f13593 = i;
        this.f13592 = c5277;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13594;
        C2358 c2358 = C2358.f7817;
        C5277 c5277 = this.f13592;
        int i2 = this.f13593;
        C5362 c5362 = (C5362) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC5568.m9355(i2, c5277, c5362, AbstractC3831.m6835(1));
                break;
            default:
                int iIntValue = num.intValue();
                new C4441(new long[]{-3567705598879213314L, 1704138218032126509L, 6975277308116430126L, 312871244215800592L, 3344215688875113182L, 6496578230780323796L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    AbstractC5568.m9355(i2, c5277, c5362, 0);
                }
                break;
        }
        return c2358;
    }

    public /* synthetic */ C4076(int i, C5277 c5277, int i2) {
        this.f13593 = i;
        this.f13592 = c5277;
    }
}
