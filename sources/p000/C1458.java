package p000;

/* JADX INFO: renamed from: ۥٖٖٕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1458 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC4434 f4970;

    /* JADX INFO: renamed from: ۥُ */
    public Object f4971;

    /* JADX INFO: renamed from: ۥّ */
    public final C4852 f4972 = AbstractC2774.m5183(Boolean.TRUE);

    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC2880 f4973;

    /* JADX INFO: renamed from: ۥۣ */
    public EnumC2459 f4974;

    /* JADX INFO: renamed from: ۦؑ */
    public C3564 f4975;

    /* JADX INFO: renamed from: ۦۙ */
    public long f4976;

    public C1458(EnumC2459 enumC2459, InterfaceC2880 interfaceC2880, InterfaceC4434 interfaceC4434, C3564 c3564, Object obj) {
        this.f4974 = enumC2459;
        this.f4973 = interfaceC2880;
        this.f4970 = interfaceC4434;
        this.f4975 = c3564;
        this.f4971 = obj;
        this.f4976 = AbstractC1287.m2716(this.f4975, this.f4973, this.f4970, AbstractC1287.f4393, 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m3080(C1458 c1458, EnumC2459 enumC2459, InterfaceC2880 interfaceC2880, C3564 c3564, int i) {
        if ((i & 1) != 0) {
            enumC2459 = c1458.f4974;
        }
        if ((i & 2) != 0) {
            interfaceC2880 = c1458.f4973;
        }
        InterfaceC4434 interfaceC4434 = c1458.f4970;
        if ((i & 8) != 0) {
            c3564 = c1458.f4975;
        }
        Object obj = c1458.f4971;
        EnumC2459 enumC24510 = c1458.f4974;
        C4852 c4852 = c1458.f4972;
        if (enumC2459 == enumC24510 && AbstractC3831.m6874(interfaceC2880, c1458.f4973) && AbstractC3831.m6874(interfaceC4434, c1458.f4970) && AbstractC3831.m6874(c3564, c1458.f4975)) {
            if (AbstractC3831.m6874(obj, c1458.f4971)) {
                return;
            }
            c1458.f4971 = obj;
            c4852.setValue(Boolean.TRUE);
            return;
        }
        c1458.f4974 = enumC2459;
        c1458.f4973 = interfaceC2880;
        c1458.f4970 = interfaceC4434;
        c1458.f4975 = c3564;
        c4852.setValue(Boolean.TRUE);
    }
}
