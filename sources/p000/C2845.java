package p000;

/* JADX INFO: renamed from: ۥًٖۧؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2845 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2845 f9502 = new C2845();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f9501 = C5802.m9613("baseAddress");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f9499 = C5802.m9613("size");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f9503 = C5802.m9613("name");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f9500 = C5802.m9613("uuid");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC1525 abstractC1525 = (AbstractC1525) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6184(f9501, ((C5126) abstractC1525).f16990);
        C5126 c5126 = (C5126) abstractC1525;
        interfaceC5267.mo6184(f9499, c5126.f16989);
        interfaceC5267.mo6180(f9503, c5126.f16988);
        String str = c5126.f16991;
        interfaceC5267.mo6180(f9500, str != null ? str.getBytes(AbstractC3677.f12283) : null);
    }
}
