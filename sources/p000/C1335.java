package p000;

/* JADX INFO: renamed from: ۥٔؓۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1335 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4112 f4616;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4617;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4618;

    public /* synthetic */ C1335(InterfaceC4112 interfaceC4112, int i, int i2) {
        this.f4618 = i2;
        this.f4616 = interfaceC4112;
        this.f4617 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f4618;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f4617;
        InterfaceC4112 interfaceC4112 = this.f4616;
        switch (i) {
            case 0:
                C5440 c5440 = (C5440) interfaceC4112;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    C4014 c4014M6296 = c5440.f17949.f15839.m6296(i2);
                    ((C2963) c4014M6296.f13380).f9938.mo1822(c5440.f17948, Integer.valueOf(i2 - c4014M6296.f13382), c5362, 0);
                }
                break;
            default:
                C3144 c3144 = (C3144) interfaceC4112;
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c5363.m8982();
                } else {
                    C4014 c4014M6297 = c3144.f10612.mo4990().m6296(i2);
                    ((C5658) c4014M6297.f13380).f18628.mo1822(C0753.f2736, Integer.valueOf(i2 - c4014M6297.f13382), c5363, 0);
                }
                break;
        }
        return c2358;
    }
}
