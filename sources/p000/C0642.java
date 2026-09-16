package p000;

/* JADX INFO: renamed from: ۥٖؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0642 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4891 f2405;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2406;

    public /* synthetic */ C0642(C4891 c4891, int i) {
        this.f2406 = i;
        this.f2405 = c4891;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f2406;
        int i2 = 0;
        C4891 c4891 = this.f2405;
        switch (i) {
            case 0:
                InterfaceC4112 interfaceC4112 = (InterfaceC4112) c4891.f16105.mo449();
                int iMo5821 = interfaceC4112.mo5821();
                while (i2 < iMo5821) {
                    if (interfaceC4112.mo5820(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC4112 interfaceC4113 = (InterfaceC4112) c4891.f16105.mo449();
                if (iIntValue < 0 || iIntValue >= interfaceC4113.mo5821()) {
                    StringBuilder sbM8680 = AbstractC5078.m8680(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbM8680.append(interfaceC4113.mo5821());
                    sbM8680.append(')');
                    AbstractC4690.m8038(sbM8680.toString());
                }
                AbstractC2765.m5135(c4891.m9076(), null, 0, new C0700(c4891, iIntValue, null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
