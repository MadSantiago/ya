package p000;

/* JADX INFO: renamed from: ۦًٖؕۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3670 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f12265;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f12266;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ float f12267;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12268;

    public /* synthetic */ C3670(float f, C1955 c1955, C1516 c1516) {
        this.f12268 = 0;
        this.f12267 = f;
        this.f12265 = c1955;
        this.f12266 = c1516;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f12268;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f12266;
        float f = this.f12267;
        Object obj3 = this.f12265;
        switch (i) {
            case 0:
                C1955 c1955 = (C1955) obj3;
                C1516 c1516 = (C1516) obj2;
                C2497 c2497 = (C2497) obj;
                c2497.m4644();
                C2808 c2808 = c2497.f8304.f6603;
                long jM5355 = c2808.m5355();
                c2808.m5353().mo2092();
                try {
                    C5086 c5086 = (C5086) c2808.f9378;
                    c5086.m8699(f, 0.0f);
                    InterfaceC3212 interfaceC3212M5353 = ((C2808) c5086.f16877).m5353();
                    interfaceC3212M5353.mo2085(Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                    interfaceC3212M5353.mo2089();
                    interfaceC3212M5353.mo2085(-Float.intBitsToFloat(0), -Float.intBitsToFloat(0));
                    InterfaceC2442.m4558(c2497, c1955, c1516);
                    return c2358;
                } finally {
                    c2808.m5353().mo2095();
                    c2808.m5351(jM5355);
                }
            case 1:
                AbstractC1842.m3626((AbstractC1842) obj, (AbstractC0275) obj3, ((InterfaceC2427) obj2).mo743(f), 0);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0275 abstractC0275 = (AbstractC0275) obj3;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                C5825 c5825 = ((C2424) obj2).f8084;
                AbstractC1842.m3623(abstractC1842, abstractC0275, c5825 != null ? (int) ((Number) c5825.m9638()).floatValue() : (int) f, 0);
                return c2358;
            default:
                C4174 c4174 = (C4174) obj3;
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj2;
                long jLongValue = ((Long) obj).longValue();
                long j = c4174.f13905;
                if (j == Long.MIN_VALUE) {
                    c4174.f13905 = jLongValue;
                    j = jLongValue;
                }
                float f2 = c4174.f13904;
                C3893 c3893 = new C3893(f2);
                C3893 c3894 = C4174.f13902;
                long jMo3123 = f == 0.0f ? c4174.f13906.mo3123(new C3893(f2), c3894, c4174.f13903) : AbstractC2776.m5222((jLongValue - j) / f);
                float f3 = ((C3893) c4174.f13906.mo700(jMo3123, c3893, c3894, c4174.f13903)).f13013;
                c4174.f13903 = (C3893) c4174.f13906.mo687(jMo3123, c3893, c3894, c4174.f13903);
                c4174.f13905 = jLongValue;
                float f4 = c4174.f13904 - f3;
                c4174.f13904 = f3;
                interfaceC4745.mo211(Float.valueOf(f4));
                return c2358;
        }
    }

    public /* synthetic */ C3670(AbstractC0275 abstractC0275, Object obj, float f, int i) {
        this.f12268 = i;
        this.f12265 = abstractC0275;
        this.f12266 = obj;
        this.f12267 = f;
    }

    public /* synthetic */ C3670(C4174 c4174, float f, InterfaceC4745 interfaceC4745) {
        this.f12268 = 3;
        this.f12265 = c4174;
        this.f12267 = f;
        this.f12266 = interfaceC4745;
    }
}
