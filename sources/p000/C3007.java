package p000;

/* JADX INFO: renamed from: ۦؘؘؐٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3007 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ long f10119;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC2864 f10120;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ long f10121;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ long f10122;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ long f10123;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0857 f10124;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f10125;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC5731 f10126;

    public C3007(InterfaceC5731 interfaceC5731, InterfaceC5731 interfaceC5732, InterfaceC2864 interfaceC2864, long j, long j2, long j3, long j4, C0857 c0857) {
        this.f10126 = interfaceC5731;
        this.f10125 = interfaceC5732;
        this.f10120 = interfaceC2864;
        this.f10121 = j;
        this.f10119 = j2;
        this.f10122 = j3;
        this.f10123 = j4;
        this.f10124 = c0857;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC4753.m8080(AbstractC3925.m7034(1367541877, new C5543(1, this.f10124), c5362), null, this.f10126, this.f10125, this.f10120, this.f10121, AbstractC0118.m216(26, c5362), this.f10119, this.f10122, this.f10123, c5362, 6);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
