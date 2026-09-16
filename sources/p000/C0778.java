package p000;

/* JADX INFO: renamed from: ۥُؚؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0778 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ AbstractC0275 f2819;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f2820;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0778(AbstractC0275 abstractC0275, int i) {
        super(1);
        this.f2820 = i;
        this.f2819 = abstractC0275;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f2820;
        C2358 c2358 = C2358.f7817;
        AbstractC0275 abstractC0275 = this.f2819;
        switch (i) {
            case 0:
                AbstractC1842.m3626((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            case 1:
                AbstractC1842.m3623((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC1842.m3626((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC1842.m3626((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC1842.m3626((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC1842.m3623((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
            default:
                AbstractC1842.m3625((AbstractC1842) obj, abstractC0275, 0, 0);
                break;
        }
        return c2358;
    }
}
