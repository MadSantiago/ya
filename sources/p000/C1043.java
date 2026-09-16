package p000;

/* JADX INFO: renamed from: ۥُۣؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1043 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C1916 f3685;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2099 f3686;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3687;

    public /* synthetic */ C1043(C2099 c2099, C1916 c1916, int i) {
        this.f3687 = i;
        this.f3686 = c2099;
        this.f3685 = c1916;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3687;
        C2358 c2358 = C2358.f7817;
        C1916 c1916 = this.f3685;
        C2099 c2099 = this.f3686;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                C4536 c4536 = c2099.f6913;
                c4536.f14997.m1710(fFloatValue);
                c4536.f14996.m1710(fFloatValue2);
                c1916.f6312 = fFloatValue;
                break;
            default:
                C4536 c4537 = c2099.f6913;
                c4537.f14997.m1710(fFloatValue);
                c4537.f14996.m1710(fFloatValue2);
                c1916.f6312 = fFloatValue;
                break;
        }
        return c2358;
    }
}
