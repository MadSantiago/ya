package p000;

/* JADX INFO: renamed from: ۦؘِؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3945 implements InterfaceC3096 {

    /* JADX INFO: renamed from: ۦِ */
    public static final C2346 f13170 = new C2346(7, new C5338(4), new C4215(8));

    /* JADX INFO: renamed from: ۥّ */
    public float f13173;

    /* JADX INFO: renamed from: ۥۜ */
    public final C5704 f13175;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0169 f13176;

    /* JADX INFO: renamed from: ۦٛ */
    public final C5704 f13178;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0169 f13174 = new C0169(0);

    /* JADX INFO: renamed from: ۥؗ */
    public final C0169 f13171 = new C0169(0);

    /* JADX INFO: renamed from: ۦؑ */
    public final C2243 f13177 = new C2243();

    /* JADX INFO: renamed from: ۥُ */
    public final C0169 f13172 = new C0169(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: ۦۙ */
    public final C1392 f13179 = new C1392(new C4884(2, this));

    public C3945(int i) {
        this.f13176 = new C0169(i);
        final int i2 = 0;
        this.f13175 = AbstractC3004.m5600(new InterfaceC4448(this) { // from class: ۦ۠ؗؔۙ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3945 f17893;

            {
                this.f17893 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                C3945 c3945 = this.f17893;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(c3945.f13176.m360() < c3945.f13172.m360());
                    default:
                        return Boolean.valueOf(c3945.f13176.m360() > 0);
                }
            }
        });
        final int i3 = 1;
        this.f13178 = AbstractC3004.m5600(new InterfaceC4448(this) { // from class: ۦ۠ؗؔۙ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C3945 f17893;

            {
                this.f17893 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i4 = i3;
                C3945 c3945 = this.f17893;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(c3945.f13176.m360() < c3945.f13172.m360());
                    default:
                        return Boolean.valueOf(c3945.f13176.m360() > 0);
                }
            }
        });
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1391() {
        return ((Boolean) this.f13175.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1392(EnumC4386 enumC4386, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        Object objMo1392 = this.f13179.mo1392(enumC4386, interfaceC5731, abstractC0772);
        return objMo1392 == EnumC2282.f7590 ? objMo1392 : C2358.f7817;
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo1397() {
        return this.f13179.mo1397();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1399() {
        return ((Boolean) this.f13178.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC3096
    /* JADX INFO: renamed from: ۦؑ */
    public final float mo1400(float f) {
        return this.f13179.mo1400(f);
    }
}
