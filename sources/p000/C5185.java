package p000;

/* JADX INFO: renamed from: ۦَۚؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5185 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5185 f17147 = new C5185();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f17146 = C5802.m9613("performance");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f17145 = C5802.m9613("crashlytics");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f17148 = C5802.m9613("sessionSamplingRate");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C1760 c1760 = (C1760) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f17146, c1760.f5865);
        interfaceC5267.mo6180(f17145, c1760.f5864);
        interfaceC5267.mo6177(f17148, c1760.f5863);
    }
}
