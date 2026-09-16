package p000;

/* JADX INFO: renamed from: ۥۖؕٓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2070 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f6835;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f6836;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f6837;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ Object f6838;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f6839;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6840 = 1;

    public /* synthetic */ C2070(C0379 c0379, C1347 c1347, InterfaceC1291 interfaceC1291, int i, int i2) {
        this.f6837 = c0379;
        this.f6835 = c1347;
        this.f6838 = interfaceC1291;
        this.f6839 = i;
        this.f6836 = i2;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f6840;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f6838;
        Object obj4 = this.f6835;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2774.m5188((C0379) this.f6837, (C1347) obj4, (InterfaceC1291) obj3, (C5362) obj, AbstractC3831.m6835(this.f6839 | 1), this.f6836);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(this.f6836 | 1);
                Object obj5 = this.f6837;
                int i2 = this.f6839;
                AbstractC3801.m6751(obj5, i2, (C3833) obj4, (C0857) obj3, (C5362) obj, iM6835);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C2070(Object obj, int i, C3833 c3833, C0857 c0857, int i2) {
        this.f6837 = obj;
        this.f6839 = i;
        this.f6835 = c3833;
        this.f6838 = c0857;
        this.f6836 = i2;
    }
}
