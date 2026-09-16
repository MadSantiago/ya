package p000;

/* JADX INFO: renamed from: ۥٝؗؒۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1907 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4536 f6292;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6293;

    public /* synthetic */ C1907(C4536 c4536, int i) {
        this.f6293 = i;
        this.f6292 = c4536;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f6293;
        C4536 c4536 = this.f6292;
        switch (i) {
            case 0:
                Object value = c4536.f14998.getValue();
                if (value != null) {
                    return value;
                }
                float fM1711 = c4536.f14997.m1711();
                boolean zIsNaN = Float.isNaN(fM1711);
                C4852 c4852 = c4536.f14999;
                return !zIsNaN ? c4536.m7856(fM1711, 0.0f, c4852.getValue()) : c4852.getValue();
            case 1:
                Object value2 = c4536.f14998.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fM1712 = c4536.f14997.m1711();
                boolean zIsNaN2 = Float.isNaN(fM1712);
                C4852 c4853 = c4536.f14999;
                if (zIsNaN2) {
                    return c4853.getValue();
                }
                Object value3 = c4853.getValue();
                C3402 c3402M7862 = c4536.m7862();
                float fM6157 = c3402M7862.m6157(value3);
                if (fM6157 != fM1712 && !Float.isNaN(fM6157)) {
                    if (fM6157 < fM1712) {
                        Object objM6155 = c3402M7862.m6155(fM1712, true);
                        if (objM6155 != null) {
                            return objM6155;
                        }
                    } else {
                        Object objM6156 = c3402M7862.m6155(fM1712, false);
                        if (objM6156 != null) {
                            return objM6156;
                        }
                    }
                }
                return value3;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return c4536.m7862();
            default:
                return new C3869(c4536.m7862(), c4536.f14991.getValue());
        }
    }
}
