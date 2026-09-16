package p000;

/* JADX INFO: renamed from: ۥٔؓٝٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1331 implements InterfaceC4334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f4599;

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC1814 f4600;

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1814 f4601;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1280 f4602;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f4603;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1489 f4604;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC1814 f4605;

    /* JADX INFO: renamed from: ۦۙ */
    public final Object f4606;

    public C1331(C5468 c5468, C1280 c1280, Object obj, AbstractC1814 abstractC1814) {
        C1489 c1489 = new C1489(18, c5468.f18029);
        this.f4604 = c1489;
        this.f4602 = c1280;
        this.f4599 = obj;
        AbstractC1814 abstractC1815 = (AbstractC1814) c1280.f4359.mo211(obj);
        this.f4605 = abstractC1815;
        this.f4600 = AbstractC3933.m7072(abstractC1814);
        this.f4606 = c1280.f4358.mo211(c1489.m3173(abstractC1815, abstractC1814));
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) c1489.f5058;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1815.mo2171();
            c1489.f5058 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        long jMax = 0;
        for (int i = 0; i < iMo2173; i++) {
            C3121 c3121 = (C3121) c1489.f5059;
            abstractC1815.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((C4695) c3121.f10451).m8042(abstractC1814.mo2174(i)) / (((double) AbstractC0362.f1315) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f4603 = jMax;
        AbstractC1814 abstractC1814M7072 = AbstractC3933.m7072(this.f4604.m3134(jMax, this.f4605, abstractC1814));
        this.f4601 = abstractC1814M7072;
        int iMo2174 = abstractC1814M7072.mo2173();
        for (int i2 = 0; i2 < iMo2174; i2++) {
            AbstractC1814 abstractC1816 = this.f4601;
            float fMo2174 = abstractC1816.mo2174(i2);
            this.f4604.getClass();
            this.f4604.getClass();
            abstractC1816.mo2172(i2, AbstractC4554.m7922(fMo2174, -0.0f, 0.0f));
        }
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo2834() {
        return this.f4603;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo2835() {
        return this.f4606;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1814 mo2836(long j) {
        if (m7629(j)) {
            return this.f4601;
        }
        return this.f4604.m3134(j, this.f4605, this.f4600);
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo2837(long j) {
        AbstractC1814 abstractC1814;
        if (m7629(j)) {
            return this.f4606;
        }
        InterfaceC4745 interfaceC4745 = this.f4602.f4358;
        C1489 c1489 = this.f4604;
        AbstractC1814 abstractC1814Mo2171 = (AbstractC1814) c1489.f5057;
        AbstractC1814 abstractC1815 = this.f4605;
        if (abstractC1814Mo2171 == null) {
            abstractC1814Mo2171 = abstractC1815.mo2171();
            c1489.f5057 = abstractC1814Mo2171;
        }
        int iMo2173 = abstractC1814Mo2171.mo2173();
        int i = 0;
        while (true) {
            abstractC1814 = (AbstractC1814) c1489.f5057;
            if (i >= iMo2173) {
                break;
            }
            if (abstractC1814 == null) {
                abstractC1814 = null;
            }
            C3121 c3121 = (C3121) c1489.f5059;
            float fMo2174 = abstractC1815.mo2174(i);
            long j2 = j / 1000000;
            C2550 c2550M8043 = ((C4695) c3121.f10451).m8043(this.f4600.mo2174(i));
            long j3 = c2550M8043.f8508;
            abstractC1814.mo2172(i, (Math.signum(c2550M8043.f8510) * c2550M8043.f8509 * AbstractC3671.m6539(j3 > 0 ? j2 / j3 : 1.0f).f6540) + fMo2174);
            i++;
        }
        if (abstractC1814 == null) {
            abstractC1814 = null;
        }
        return interfaceC4745.mo211(abstractC1814);
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo2838() {
        return false;
    }

    @Override // p000.InterfaceC4334
    /* JADX INFO: renamed from: ۦؑ */
    public final C1280 mo2839() {
        return this.f4602;
    }
}
