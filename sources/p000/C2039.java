package p000;

/* JADX INFO: renamed from: ۥۖؑٚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2039 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2039 f6727 = new C2039();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f6726 = C5802.m9613("timestamp");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f6723 = C5802.m9613("type");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f6728 = C5802.m9613("app");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f6724 = C5802.m9613("device");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f6725 = C5802.m9613("log");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f6729 = C5802.m9613("rollouts");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC4841 abstractC4841 = (AbstractC4841) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6184(f6726, ((C3302) abstractC4841).f11056);
        C3302 c3302 = (C3302) abstractC4841;
        interfaceC5267.mo6180(f6723, c3302.f11055);
        interfaceC5267.mo6180(f6728, c3302.f11052);
        interfaceC5267.mo6180(f6724, c3302.f11057);
        interfaceC5267.mo6180(f6725, c3302.f11053);
        interfaceC5267.mo6180(f6729, c3302.f11054);
    }
}
