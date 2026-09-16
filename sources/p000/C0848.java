package p000;

/* JADX INFO: renamed from: ۥًؖؔؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0848 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C0848 f3041;

    /* JADX INFO: renamed from: ۥّ */
    public static final C0848 f3042;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0848 f3043;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C0848 f3044;

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ int f3045;

    static {
        int i = 1;
        f3043 = new C0848(i, 2, 0);
        int i2 = 1;
        f3041 = new C0848(i2, i2, 1);
        f3042 = new C0848(i, 2, 2);
        int i3 = 1;
        f3044 = new C0848(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0848(int i, int i2, int i3) {
        super(i, i2);
        this.f3045 = i3;
    }

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۗ */
    public C4356 mo1763(C4902 c4902) {
        switch (this.f3045) {
            case 0:
                return (C4356) c4902.m8252(1);
            case 1:
                return (C4356) c4902.m8252(0);
            default:
                return super.mo1763(c4902);
        }
    }

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        switch (this.f3045) {
            case 0:
                Object objMo449 = ((InterfaceC4448) c4902.m8252(0)).mo449();
                C4356 c4356 = (C4356) c4902.m8252(1);
                int iM8250 = c4902.m8250(0);
                c4356.getClass();
                c0126.m242(c0126.m231(c4356), objMo449);
                interfaceC4790.mo2819(iM8250, objMo449);
                interfaceC4790.mo2816(objMo449);
                break;
            case 1:
                C4356 c4357 = (C4356) c4902.m8252(0);
                int iM8251 = c4902.m8250(0);
                interfaceC4790.mo2820();
                c4357.getClass();
                interfaceC4790.mo2818(iM8251, c0126.m232(c0126.m231(c4357)));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Object objM8252 = c4902.m8252(0);
                C4356 c4358 = (C4356) c4902.m8252(1);
                int iM8252 = c4902.m8250(0);
                if (objM8252 instanceof C1670) {
                    C1670 c1670 = (C1670) objM8252;
                    ((C0863) c0175.f656).m1843(c1670);
                    ((C3639) c0175.f660).m6495(c1670);
                }
                Object objM253 = c0126.m253(c0126.m231(c4358), iM8252, objM8252);
                if (objM253 instanceof C1670) {
                    c0175.m369((C1670) objM253);
                } else if (objM253 instanceof C5863) {
                    ((C5863) objM253).m9681();
                }
                break;
            default:
                Object objM8253 = c4902.m8252(0);
                int iM8253 = c4902.m8250(0);
                if (objM8253 instanceof C1670) {
                    C1670 c1671 = (C1670) objM8253;
                    ((C0863) c0175.f656).m1843(c1671);
                    ((C3639) c0175.f660).m6495(c1671);
                }
                Object objM254 = c0126.m253(c0126.f488, iM8253, objM8253);
                if (objM254 instanceof C1670) {
                    c0175.m369((C1670) objM254);
                } else if (objM254 instanceof C5863) {
                    ((C5863) objM254).m9681();
                }
                break;
        }
    }
}
