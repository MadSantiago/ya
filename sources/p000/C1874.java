package p000;

/* JADX INFO: renamed from: ۥٝؓۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1874 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f6220;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC2609 f6221;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f6222;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6223;

    public /* synthetic */ C1874(long j, Object obj, InterfaceC2609 interfaceC2609, int i) {
        this.f6223 = i;
        this.f6222 = j;
        this.f6220 = obj;
        this.f6221 = interfaceC2609;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f6223;
        C2358 c2358 = C2358.f7817;
        InterfaceC2609 interfaceC2609 = this.f6221;
        Object obj3 = this.f6220;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    AbstractC2765.m5143(this.f6222, ((C4413) c5362.m8997(AbstractC4957.f16399)).f14544, AbstractC3925.m7034(417635459, new C0491(i3, (InterfaceC1291) obj3, interfaceC2609), c5362), c5362, 384);
                }
                break;
            default:
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    AbstractC2765.m5143(this.f6222, (C3564) obj3, AbstractC3925.m7034(-1767363041, new C5543(i2, (C0857) interfaceC2609), c5363), c5363, 384);
                }
                break;
        }
        return c2358;
    }
}
