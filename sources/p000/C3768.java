package p000;

/* JADX INFO: renamed from: ۦٍؚؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3768 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3768 f12531 = new C3768();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f12529 = C5802.m9613("generator");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f12526 = C5802.m9613("identifier");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f12532 = C5802.m9613("appQualitySessionId");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f12527 = C5802.m9613("startedAt");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f12528 = C5802.m9613("endedAt");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f12538 = C5802.m9613("crashed");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f12530 = C5802.m9613("app");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5802 f12536 = C5802.m9613("user");

    /* JADX INFO: renamed from: ۦِ */
    public static final C5802 f12535 = C5802.m9613("os");

    /* JADX INFO: renamed from: ۦۗ */
    public static final C5802 f12537 = C5802.m9613("device");

    /* JADX INFO: renamed from: ۦؚ */
    public static final C5802 f12533 = C5802.m9613("events");

    /* JADX INFO: renamed from: ۦٌ */
    public static final C5802 f12534 = C5802.m9613("generatorType");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC1038 abstractC1038 = (AbstractC1038) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f12529, ((C4113) abstractC1038).f13710);
        C4113 c4113 = (C4113) abstractC1038;
        interfaceC5267.mo6180(f12526, c4113.f13708.getBytes(AbstractC3677.f12283));
        interfaceC5267.mo6180(f12532, c4113.f13705);
        interfaceC5267.mo6184(f12527, c4113.f13711);
        interfaceC5267.mo6180(f12528, c4113.f13706);
        interfaceC5267.mo6181(f12538, c4113.f13707);
        interfaceC5267.mo6180(f12530, c4113.f13716);
        interfaceC5267.mo6180(f12536, c4113.f13709);
        interfaceC5267.mo6180(f12535, c4113.f13714);
        interfaceC5267.mo6180(f12537, c4113.f13713);
        interfaceC5267.mo6180(f12533, c4113.f13715);
        interfaceC5267.mo6176(f12534, c4113.f13712);
    }
}
