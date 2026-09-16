package p000;

/* JADX INFO: renamed from: ۥۧؒٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2852 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2852 f9532 = new C2852();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f9530 = C5802.m9613("sessionId");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f9527 = C5802.m9613("firstSessionId");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f9533 = C5802.m9613("sessionIndex");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f9528 = C5802.m9613("eventTimestampUs");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f9529 = C5802.m9613("dataCollectionStatus");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f9534 = C5802.m9613("firebaseInstallationId");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f9531 = C5802.m9613("firebaseAuthenticationToken");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        C5314 c5314 = (C5314) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6180(f9530, c5314.f17494);
        interfaceC5267.mo6180(f9527, c5314.f17493);
        interfaceC5267.mo6176(f9533, c5314.f17490);
        interfaceC5267.mo6184(f9528, c5314.f17495);
        interfaceC5267.mo6180(f9529, c5314.f17491);
        interfaceC5267.mo6180(f9534, c5314.f17492);
        interfaceC5267.mo6180(f9531, c5314.f17496);
    }
}
