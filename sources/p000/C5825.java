package p000;

/* JADX INFO: renamed from: ۦَۧؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5825 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3411 f19169;

    /* JADX INFO: renamed from: ۥُ */
    public final C4852 f19170;

    /* JADX INFO: renamed from: ۥّ */
    public final C2656 f19171;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f19172;

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC1814 f19173;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1280 f19174;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4852 f19175;

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC1814 f19176;

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC1814 f19177;

    /* JADX INFO: renamed from: ۦۗ */
    public final AbstractC1814 f19178;

    /* JADX INFO: renamed from: ۦۙ */
    public final C0969 f19179;

    public C5825(Object obj, C1280 c1280, Object obj2) {
        this.f19174 = c1280;
        this.f19172 = obj2;
        C3411 c3411 = new C3411(c1280, obj, null, 60);
        this.f19169 = c3411;
        this.f19175 = AbstractC2774.m5183(Boolean.FALSE);
        this.f19170 = AbstractC2774.m5183(obj);
        this.f19171 = new C2656();
        this.f19179 = new C0969(obj2);
        AbstractC1814 abstractC1814 = c3411.f11356;
        boolean z = abstractC1814 instanceof C3893;
        AbstractC1814 abstractC1815 = z ? AbstractC4554.f15039 : abstractC1814 instanceof C0994 ? AbstractC4554.f15040 : abstractC1814 instanceof C3855 ? AbstractC4554.f15050 : AbstractC4554.f15042;
        this.f19173 = abstractC1815;
        AbstractC1814 abstractC1816 = z ? AbstractC4554.f15043 : abstractC1814 instanceof C0994 ? AbstractC4554.f15041 : abstractC1814 instanceof C3855 ? AbstractC4554.f15038 : AbstractC4554.f15044;
        this.f19177 = abstractC1816;
        this.f19176 = abstractC1815;
        this.f19178 = abstractC1816;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Object m9634(C5825 c5825, Object obj, InterfaceC3347 interfaceC3347, InterfaceC0443 interfaceC0443, int i) {
        if ((i & 2) != 0) {
            interfaceC3347 = c5825.f19179;
        }
        InterfaceC3347 interfaceC3348 = interfaceC3347;
        Object objMo211 = c5825.f19174.f4358.mo211(c5825.f19169.f11356);
        Object objM9638 = c5825.m9638();
        C1280 c1280 = c5825.f19174;
        return C2656.m4963(c5825.f19171, new C3803(c5825, objMo211, new C4214(interfaceC3348, c1280, objM9638, obj, (AbstractC1814) c1280.f4359.mo211(objMo211)), c5825.f19169.f11357, null), interfaceC0443);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9635() {
        C3411 c3411 = this.f19169;
        c3411.f11356.mo2175();
        c3411.f11357 = Long.MIN_VALUE;
        this.f19175.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final Object m9636(InterfaceC0443 interfaceC0443, Object obj) {
        Object objM4963 = C2656.m4963(this.f19171, new C5131(this, obj, null), interfaceC0443);
        return objM4963 == EnumC2282.f7590 ? objM4963 : C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m9637(Object obj) {
        AbstractC1814 abstractC1814 = this.f19173;
        AbstractC1814 abstractC1815 = this.f19176;
        boolean zM6874 = AbstractC3831.m6874(abstractC1815, abstractC1814);
        AbstractC1814 abstractC1816 = this.f19178;
        if (!zM6874 || !AbstractC3831.m6874(abstractC1816, this.f19177)) {
            C1280 c1280 = this.f19174;
            AbstractC1814 abstractC1817 = (AbstractC1814) c1280.f4359.mo211(obj);
            int iMo2173 = abstractC1817.mo2173();
            boolean z = false;
            for (int i = 0; i < iMo2173; i++) {
                if (abstractC1817.mo2174(i) < abstractC1815.mo2174(i) || abstractC1817.mo2174(i) > abstractC1816.mo2174(i)) {
                    abstractC1817.mo2172(i, AbstractC4554.m7922(abstractC1817.mo2174(i), abstractC1815.mo2174(i), abstractC1816.mo2174(i)));
                    z = true;
                }
            }
            if (z) {
                return c1280.f4358.mo211(abstractC1817);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Object m9638() {
        return this.f19169.f11359.getValue();
    }

    public /* synthetic */ C5825(Object obj, C1280 c1280, Object obj2, int i) {
        this(obj, c1280, (i & 4) != 0 ? null : obj2);
    }
}
