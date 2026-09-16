package p000;

/* JADX INFO: renamed from: ۦؘؚۙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5132 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f17005;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ boolean f17006;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17007;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f17008;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17009 = 1;

    public /* synthetic */ C5132(AbstractActivityC1500 abstractActivityC1500, boolean z, boolean z2, C0857 c0857, int i) {
        this.f17007 = abstractActivityC1500;
        this.f17008 = z;
        this.f17006 = z2;
        this.f17005 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f17009;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f17005;
        Object obj4 = this.f17007;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM6835 = AbstractC3831.m6835(433);
                AbstractC3925.m7055(this.f17008, (InterfaceC0705) obj4, this.f17006, (C0763) obj3, (C5362) obj, iM6835);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6836 = AbstractC3831.m6835(3073);
                AbstractC2873.m5441((AbstractActivityC1500) obj4, this.f17008, this.f17006, (C0857) obj3, (C5362) obj, iM6836);
                break;
        }
        return c2358;
    }

    public /* synthetic */ C5132(boolean z, InterfaceC0705 interfaceC0705, boolean z2, C0763 c0763, int i) {
        this.f17008 = z;
        this.f17007 = interfaceC0705;
        this.f17006 = z2;
        this.f17005 = c0763;
    }
}
