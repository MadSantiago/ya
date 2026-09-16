package p000;

/* JADX INFO: renamed from: ۦؙؗۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3567 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3567 f11814 = new C3567();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f11813 = C5802.m9613("batteryLevel");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f11810 = C5802.m9613("batteryVelocity");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f11815 = C5802.m9613("proximityOn");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f11811 = C5802.m9613("orientation");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f11812 = C5802.m9613("ramUsed");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f11816 = C5802.m9613("diskUsed");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC1243 abstractC1243 = (AbstractC1243) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f11813, ((C4376) abstractC1243).f14424);
        C4376 c4376 = (C4376) abstractC1243;
        interfaceC5267.mo6176(f11810, c4376.f14423);
        interfaceC5267.mo6181(f11815, c4376.f14420);
        interfaceC5267.mo6176(f11811, c4376.f14425);
        interfaceC5267.mo6184(f11812, c4376.f14421);
        interfaceC5267.mo6184(f11816, c4376.f14422);
    }
}
