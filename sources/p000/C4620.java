package p000;

/* JADX INFO: renamed from: ۦِٟٛؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4620 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4620 f15249 = new C4620();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f15248 = C5802.m9613("threads");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f15245 = C5802.m9613("exception");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f15250 = C5802.m9613("appExitInfo");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f15246 = C5802.m9613("profilingManagerInfo");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f15247 = C5802.m9613("signal");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f15251 = C5802.m9613("binaries");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC4467 abstractC4467 = (AbstractC4467) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f15248, ((C3123) abstractC4467).f10461);
        C3123 c3123 = (C3123) abstractC4467;
        interfaceC5267.mo6180(f15245, c3123.f10460);
        interfaceC5267.mo6180(f15250, c3123.f10457);
        interfaceC5267.mo6180(f15246, c3123.f10462);
        interfaceC5267.mo6180(f15247, c3123.f10458);
        interfaceC5267.mo6180(f15251, c3123.f10459);
    }
}
