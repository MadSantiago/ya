package p000;

/* JADX INFO: renamed from: ۦٙؔۧ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4492 implements InterfaceC2015 {

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC2045 f14868;

    public C4492(AbstractC2045 abstractC2045) {
        this.f14868 = abstractC2045;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo2779(long j) {
        return this.f14868.f6744.mo2779(C1553.m3304(0L, m7822()));
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥً */
    public final long mo2781(InterfaceC2015 interfaceC2015, long j) {
        boolean z = interfaceC2015 instanceof C4492;
        AbstractC2045 abstractC2045 = this.f14868;
        if (!z) {
            AbstractC2045 abstractC2045M5153 = AbstractC2765.m5153(abstractC2045);
            C4492 c4492 = abstractC2045M5153.f6746;
            AbstractC1311 abstractC1311 = abstractC2045M5153.f6744;
            long jMo2781 = mo2781(c4492, j);
            long j2 = abstractC2045M5153.f6749;
            long jM3308 = C1553.m3308(jMo2781, (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!abstractC1311.mo2787().f17786) {
                AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC1311.m9794();
            AbstractC1311 abstractC1312 = abstractC1311.f4514;
            if (abstractC1312 != null) {
                abstractC1311 = abstractC1312;
            }
            return C1553.m3304(jM3308, abstractC1311.mo2781(interfaceC2015, 0L));
        }
        AbstractC2045 abstractC2046 = ((C4492) interfaceC2015).f14868;
        AbstractC1311 abstractC1313 = abstractC2046.f6744;
        abstractC1313.m9794();
        AbstractC2045 abstractC2045Mo2793 = abstractC2045.f6744.m2778(abstractC1313).mo2793();
        if (abstractC2045Mo2793 != null) {
            long jM1862 = C0873.m1862(C0873.m1861(abstractC2046.m3989(abstractC2045Mo2793, false), C5063.m8635(j)), abstractC2045.m3989(abstractC2045Mo2793, false));
            return (((long) Float.floatToRawIntBits((int) (jM1862 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM1862 & 4294967295L))) & 4294967295L);
        }
        AbstractC2045 abstractC2045M5154 = AbstractC2765.m5153(abstractC2046);
        long jM1861 = C0873.m1861(C0873.m1861(abstractC2046.m3989(abstractC2045M5154, false), abstractC2045M5154.f6749), C5063.m8635(j));
        AbstractC2045 abstractC2045M5155 = AbstractC2765.m5153(abstractC2045);
        long jM1863 = C0873.m1862(jM1861, C0873.m1861(abstractC2045.m3989(abstractC2045M5155, false), abstractC2045M5155.f6749));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM1863 >> 32));
        return abstractC2045M5155.f6744.f4514.mo2781(abstractC2045M5154.f6744.f4514, (((long) Float.floatToRawIntBits((int) (jM1863 & 4294967295L))) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥَ */
    public final long mo2782(long j) {
        return C1553.m3304(this.f14868.f6744.mo2782(j), m7822());
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥٓ */
    public final long mo2783(InterfaceC2015 interfaceC2015, long j) {
        return mo2781(interfaceC2015, j);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo2788(InterfaceC2015 interfaceC2015, float[] fArr) {
        this.f14868.f6744.mo2788(interfaceC2015, fArr);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m7822() {
        AbstractC2045 abstractC2045 = this.f14868;
        AbstractC2045 abstractC2045M5153 = AbstractC2765.m5153(abstractC2045);
        return C1553.m3308(mo2781(abstractC2045M5153.f6746, 0L), abstractC2045.f6744.mo2781(abstractC2045M5153.f6744, 0L));
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo2791(float[] fArr) {
        this.f14868.f6744.mo2791(fArr);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦؗ */
    public final C2793 mo2794(InterfaceC2015 interfaceC2015, boolean z) {
        return this.f14868.f6744.mo2794(interfaceC2015, z);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦٖ */
    public final long mo2799() {
        AbstractC2045 abstractC2045 = this.f14868;
        return (((long) abstractC2045.f985) << 32) | (((long) abstractC2045.f984) & 4294967295L);
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦٛ */
    public final long mo2802(long j) {
        return this.f14868.f6744.mo2802(C1553.m3304(j, m7822()));
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۗ */
    public final InterfaceC2015 mo2804() {
        AbstractC2045 abstractC2045Mo2793;
        if (!mo2807()) {
            AbstractC3480.m6278("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC1311 abstractC1311 = ((AbstractC1311) this.f14868.f6744.f4513.f2256.f8201).f4514;
        if (abstractC1311 == null || (abstractC2045Mo2793 = abstractC1311.mo2793()) == null) {
            return null;
        }
        return abstractC2045Mo2793.f6746;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo2806(long j) {
        return C1553.m3304(this.f14868.f6744.mo2806(j), m7822());
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۛ */
    public final boolean mo2807() {
        return this.f14868.f6744.mo2787().f17786;
    }

    @Override // p000.InterfaceC2015
    /* JADX INFO: renamed from: ۦۜ */
    public final long mo2808(long j) {
        return this.f14868.f6744.mo2808(C1553.m3304(j, m7822()));
    }
}
