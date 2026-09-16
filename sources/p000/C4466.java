package p000;

/* JADX INFO: renamed from: ۦٙؑٚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4466 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4466 f14730 = new C4466();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f14728 = C5802.m9613("arch");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f14725 = C5802.m9613("model");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f14731 = C5802.m9613("cores");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f14726 = C5802.m9613("ram");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f14727 = C5802.m9613("diskSpace");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f14734 = C5802.m9613("simulator");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f14729 = C5802.m9613("state");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5802 f14733 = C5802.m9613("manufacturer");

    /* JADX INFO: renamed from: ۦِ */
    public static final C5802 f14732 = C5802.m9613("modelClass");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC3054 abstractC3054 = (AbstractC3054) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6176(f14728, ((C2033) abstractC3054).f6699);
        C2033 c2033 = (C2033) abstractC3054;
        interfaceC5267.mo6180(f14725, c2033.f6697);
        interfaceC5267.mo6176(f14731, c2033.f6694);
        interfaceC5267.mo6184(f14726, c2033.f6700);
        interfaceC5267.mo6184(f14727, c2033.f6695);
        interfaceC5267.mo6181(f14734, c2033.f6696);
        interfaceC5267.mo6176(f14729, c2033.f6702);
        interfaceC5267.mo6180(f14733, c2033.f6698);
        interfaceC5267.mo6180(f14732, c2033.f6701);
    }
}
