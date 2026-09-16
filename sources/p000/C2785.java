package p000;

/* JADX INFO: renamed from: ۥۦَؒٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2785 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC0275 f9279;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9280;

    public /* synthetic */ C2785(AbstractC0275 abstractC0275, int i) {
        this.f9280 = i;
        this.f9279 = abstractC0275;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f9280;
        C2358 c2358 = C2358.f7817;
        AbstractC0275 abstractC0275 = this.f9279;
        AbstractC1842 abstractC1842 = (AbstractC1842) obj;
        switch (i) {
            case 0:
                AbstractC1842.m3626(abstractC1842, abstractC0275, 0, 0);
                break;
            case 1:
                AbstractC1842.m3623(abstractC1842, abstractC0275, 0, 0);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1842.m3623(abstractC1842, abstractC0275, 0, 0);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                if (abstractC1842.mo3627() == EnumC2459.f8215 || abstractC1842.mo3628() == 0) {
                    abstractC1842.m3629(abstractC0275);
                    abstractC0275.mo571(C0873.m1861(0L, abstractC0275.f981), 0.0f, null);
                } else {
                    long jMo3628 = ((long) (abstractC1842.mo3628() - abstractC0275.f985)) << 32;
                    abstractC1842.m3629(abstractC0275);
                    abstractC0275.mo571(C0873.m1861(jMo3628, abstractC0275.f981), 0.0f, null);
                }
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC1842.m3626(abstractC1842, abstractC0275, 0, 0);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1842.m3623(abstractC1842, abstractC0275, 0, 0);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC1842.m3626(abstractC1842, abstractC0275, 0, 0);
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC1842.m3626(abstractC1842, abstractC0275, 0, 0);
                break;
            case 8:
                AbstractC1842.m3623(abstractC1842, abstractC0275, 0, 0);
                break;
            case 9:
                AbstractC1842.m3626(abstractC1842, abstractC0275, 0, 0);
                break;
            default:
                AbstractC1842.m3623(abstractC1842, abstractC0275, 0, 0);
                break;
        }
        return c2358;
    }
}
