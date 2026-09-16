package p000;

/* JADX INFO: renamed from: ۦؑؗؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3051 implements InterfaceC5372 {

    /* JADX INFO: renamed from: ۥؓ */
    public final /* synthetic */ C0777 f10265;

    /* JADX INFO: renamed from: ۥؖ */
    public final C0969 f10266;

    /* JADX INFO: renamed from: ۥَ */
    public final C4852 f10267;

    /* JADX INFO: renamed from: ۥْ */
    public final C4852 f10268;

    /* JADX INFO: renamed from: ۥٓ */
    public final C4852 f10269;

    /* JADX INFO: renamed from: ۥٖ */
    public final C0811 f10270;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f10271;

    /* JADX INFO: renamed from: ۥۖ */
    public AbstractC1814 f10272;

    /* JADX INFO: renamed from: ۦٕ */
    public final C0925 f10273;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f10274;

    /* JADX INFO: renamed from: ۦۛ */
    public final C4852 f10275;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4852 f10276;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1280 f10277;

    public C3051(C0777 c0777, Object obj, AbstractC1814 abstractC1814, C1280 c1280) {
        this.f10265 = c0777;
        this.f10277 = c1280;
        C4852 c4852M5183 = AbstractC2774.m5183(obj);
        this.f10276 = c4852M5183;
        Object objMo211 = null;
        this.f10268 = AbstractC2774.m5183(AbstractC4489.m7811(0.0f, 0.0f, null, 7));
        this.f10269 = AbstractC2774.m5183(new C4214(m5658(), c1280, obj, c4852M5183.getValue(), abstractC1814));
        this.f10267 = AbstractC2774.m5183(Boolean.TRUE);
        this.f10270 = new C0811(-1.0f);
        this.f10275 = AbstractC2774.m5183(obj);
        this.f10272 = abstractC1814;
        this.f10273 = new C0925(m5656().mo2834());
        Float f = (Float) AbstractC4168.f13869.get(c1280);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC1814 abstractC1815 = (AbstractC1814) c1280.f4359.mo211(obj);
            int iMo2173 = abstractC1815.mo2173();
            for (int i = 0; i < iMo2173; i++) {
                abstractC1815.mo2172(i, fFloatValue);
            }
            objMo211 = this.f10277.f4358.mo211(abstractC1815);
        }
        this.f10266 = AbstractC4489.m7811(0.0f, 0.0f, objMo211, 3);
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return this.f10275.getValue();
    }

    public final String toString() {
        return "current value: " + this.f10275.getValue() + ", target: " + this.f10276.getValue() + ", spec: " + m5658();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m5655() {
        if (this.f10270.m1711() == -1.0f) {
            this.f10271 = true;
            boolean zM6874 = AbstractC3831.m6874(m5656().f13983, m5656().f13989);
            C4852 c4852 = this.f10275;
            if (zM6874) {
                c4852.setValue(m5656().f13983);
            } else {
                c4852.setValue(m5656().mo2837(0L));
                this.f10272 = m5656().mo2836(0L);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C4214 m5656() {
        return (C4214) this.f10269.getValue();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5657(Object obj, Object obj2, InterfaceC0215 interfaceC0215) {
        this.f10276.setValue(obj2);
        this.f10268.setValue(interfaceC0215);
        if (AbstractC3831.m6874(m5656().f13989, obj) && AbstractC3831.m6874(m5656().f13983, obj2)) {
            return;
        }
        m5660(obj, false);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC0215 m5658() {
        return (InterfaceC0215) this.f10268.getValue();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m5659(Object obj, InterfaceC0215 interfaceC0215) {
        if (this.f10274 && AbstractC3831.m6874(obj, null)) {
            return;
        }
        C4852 c4852 = this.f10276;
        boolean zM6874 = AbstractC3831.m6874(c4852.getValue(), obj);
        C0811 c0811 = this.f10270;
        if (zM6874 && c0811.m1711() == -1.0f) {
            return;
        }
        c4852.setValue(obj);
        this.f10268.setValue(interfaceC0215);
        float fM1711 = c0811.m1711();
        C4852 c4853 = this.f10275;
        Object value = fM1711 == -3.0f ? obj : c4853.getValue();
        C4852 c4854 = this.f10267;
        m5660(value, !((Boolean) c4854.getValue()).booleanValue());
        c4854.setValue(Boolean.valueOf(c0811.m1711() == -3.0f));
        if (c0811.m1711() >= 0.0f) {
            c4853.setValue(m5656().mo2837((long) (c0811.m1711() * m5656().mo2834())));
        } else if (c0811.m1711() == -3.0f) {
            c4853.setValue(obj);
        }
        this.f10274 = false;
        c0811.m1710(-1.0f);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m5660(Object obj, boolean z) {
        C0777 c0777 = this.f10265;
        C4852 c4852 = c0777.f2812;
        C4852 c4853 = this.f10276;
        boolean zM6874 = AbstractC3831.m6874(null, c4853.getValue());
        C0925 c0925 = this.f10273;
        C4852 c4854 = this.f10269;
        if (zM6874) {
            c4854.setValue(new C4214(this.f10266, this.f10277, obj, obj, this.f10272.mo2171()));
            this.f10274 = true;
            c0925.m1900(m5656().mo2834());
            return;
        }
        InterfaceC0215 interfaceC0215M5658 = (!z || this.f10271 || (m5658() instanceof C0969)) ? m5658() : this.f10266;
        long jMax = 0;
        c4854.setValue(new C4214(c0777.m1672() <= 0 ? interfaceC0215M5658 : new C0803(interfaceC0215M5658, c0777.m1672()), this.f10277, obj, c4853.getValue(), this.f10272));
        c0925.m1900(m5656().mo2834());
        this.f10274 = false;
        c4852.setValue(Boolean.TRUE);
        if (c0777.m1681()) {
            C1347 c1347 = c0777.f2816;
            int size = c1347.size();
            for (int i = 0; i < size; i++) {
                C3051 c3051 = (C3051) c1347.get(i);
                jMax = Math.max(jMax, c3051.f10273.m1901());
                c3051.m5655();
            }
            c4852.setValue(Boolean.FALSE);
        }
    }
}
