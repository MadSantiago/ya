package p000;

/* JADX INFO: renamed from: ۥِّؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1163 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1163 f4037 = new C1163();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f4035 = C5802.m9613("requestTimeMs");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f4032 = C5802.m9613("requestUptimeMs");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f4038 = C5802.m9613("clientInfo");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f4033 = C5802.m9613("logSource");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f4034 = C5802.m9613("logSourceName");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f4039 = C5802.m9613("logEvent");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f4036 = C5802.m9613("qosTier");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC4622 abstractC4622 = (AbstractC4622) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6184(f4035, ((C3653) abstractC4622).f12224);
        C3653 c3653 = (C3653) abstractC4622;
        interfaceC5267.mo6184(f4032, c3653.f12223);
        interfaceC5267.mo6180(f4038, c3653.f12220);
        interfaceC5267.mo6180(f4033, c3653.f12225);
        interfaceC5267.mo6180(f4034, c3653.f12221);
        interfaceC5267.mo6180(f4039, c3653.f12222);
        interfaceC5267.mo6180(f4036, EnumC5117.f16966);
    }
}
