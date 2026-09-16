package p000;

/* JADX INFO: renamed from: ۦۦِؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5764 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5764 f18999 = new C5764();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f18997 = C5802.m9613("pid");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f18994 = C5802.m9613("processName");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f19000 = C5802.m9613("reasonCode");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f18995 = C5802.m9613("importance");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f18996 = C5802.m9613("pss");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f19003 = C5802.m9613("rss");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f18998 = C5802.m9613("timestamp");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5802 f19002 = C5802.m9613("traceFile");

    /* JADX INFO: renamed from: ۦِ */
    public static final C5802 f19001 = C5802.m9613("buildIdMappingForArch");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC5574 abstractC5574 = (AbstractC5574) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6176(f18997, ((C5455) abstractC5574).f17989);
        C5455 c5455 = (C5455) abstractC5574;
        interfaceC5267.mo6180(f18994, c5455.f17987);
        interfaceC5267.mo6176(f19000, c5455.f17984);
        interfaceC5267.mo6176(f18995, c5455.f17990);
        interfaceC5267.mo6184(f18996, c5455.f17985);
        interfaceC5267.mo6184(f19003, c5455.f17986);
        interfaceC5267.mo6184(f18998, c5455.f17992);
        interfaceC5267.mo6180(f19002, c5455.f17988);
        interfaceC5267.mo6180(f19001, c5455.f17991);
    }
}
