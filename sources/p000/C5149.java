package p000;

/* JADX INFO: renamed from: ۦۚؑۚؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5149 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5837 f17059;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17060;

    public /* synthetic */ C5149(C5837 c5837, int i) {
        this.f17060 = i;
        this.f17059 = c5837;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f17060;
        C2358 c2358 = C2358.f7817;
        C5837 c5837 = this.f17059;
        switch (i) {
            case 0:
                InterfaceC2015 interfaceC2015 = (InterfaceC2015) obj;
                C2449 c2449M9648 = c5837.m9648();
                if (c2449M9648 != null) {
                    c2449M9648.f8156 = interfaceC2015;
                }
                return c2358;
            case 1:
                C4852 c4852 = c5837.f19227;
                C5745 c5745 = (C5745) obj;
                String str = c5745.f18944.f4307;
                C1249 c1249 = c5837.f19237;
                if (!AbstractC3831.m6874(str, c1249 != null ? c1249.f4307 : null)) {
                    c5837.f19241.setValue(EnumC1546.f5232);
                    if (((Boolean) c4852.getValue()).booleanValue()) {
                        c4852.setValue(Boolean.FALSE);
                    } else {
                        c5837.f19222.setValue(Boolean.FALSE);
                    }
                }
                long j = C3346.f11196;
                c5837.m9645(j);
                c5837.m9644(j);
                c5837.f19239.mo211(c5745);
                C5863 c5863 = c5837.f19230;
                C1946 c1946 = c5863.f19364;
                if (c1946 != null) {
                    c1946.m3812(c5863, null);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5837.f19226.m9678(((C0221) obj).f824);
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(c5837.f19226.m9678(((C0221) obj).f824));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c5837.f19225.setValue(bool);
                return c2358;
        }
    }
}
