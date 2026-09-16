package p000;

/* JADX INFO: renamed from: ۥؓؒٚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0302 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5450 f1092;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f1093;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0302(C5450 c5450, int i) {
        super(1);
        this.f1093 = i;
        this.f1092 = c5450;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        boolean z;
        int i = this.f1093;
        C5450 c5450 = this.f1092;
        switch (i) {
            case 0:
                c5450.f17965 = (C3468) obj;
                return Boolean.TRUE;
            case 1:
                AbstractC1849 abstractC1849 = (AbstractC1849) obj;
                Object obj2 = c5450.f17965;
                if (obj2 == null && abstractC1849.f6135) {
                    c5450.f17965 = abstractC1849;
                } else if (obj2 != null) {
                    abstractC1849.getClass();
                }
                return Boolean.TRUE;
            default:
                Object obj3 = (InterfaceC0289) obj;
                if (((AbstractC5381) obj3).f17791.f17786) {
                    c5450.f17965 = obj3;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
