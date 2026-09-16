package p000;

/* JADX INFO: renamed from: ۦٜؒۢٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4675 implements InterfaceC1588 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4675 f15404 = new C4675();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5802 f15402 = C5802.m9613("eventTimeMs");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5802 f15399 = C5802.m9613("eventCode");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5802 f15405 = C5802.m9613("complianceData");

    /* JADX INFO: renamed from: ۥُ */
    public static final C5802 f15400 = C5802.m9613("eventUptimeMs");

    /* JADX INFO: renamed from: ۥّ */
    public static final C5802 f15401 = C5802.m9613("sourceExtension");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C5802 f15408 = C5802.m9613("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C5802 f15403 = C5802.m9613("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5802 f15407 = C5802.m9613("networkConnectionInfo");

    /* JADX INFO: renamed from: ۦِ */
    public static final C5802 f15406 = C5802.m9613("experimentIds");

    @Override // p000.InterfaceC1476
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo206(Object obj, Object obj2) {
        AbstractC4273 abstractC4273 = (AbstractC4273) obj;
        InterfaceC5267 interfaceC5267 = (InterfaceC5267) obj2;
        interfaceC5267.mo6184(f15402, ((C4583) abstractC4273).f15123);
        C4583 c4583 = (C4583) abstractC4273;
        interfaceC5267.mo6180(f15399, c4583.f15121);
        interfaceC5267.mo6180(f15405, c4583.f15118);
        interfaceC5267.mo6184(f15400, c4583.f15124);
        interfaceC5267.mo6180(f15401, c4583.f15119);
        interfaceC5267.mo6180(f15408, c4583.f15120);
        interfaceC5267.mo6184(f15403, c4583.f15126);
        interfaceC5267.mo6180(f15407, c4583.f15122);
        interfaceC5267.mo6180(f15406, c4583.f15125);
    }
}
