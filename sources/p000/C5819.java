package p000;

/* JADX INFO: renamed from: ۦٕۧؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5819 implements InterfaceC3028 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC4745 f19157;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C1705 f19158;

    public C5819(C1705 c1705, InterfaceC4745 interfaceC4745) {
        this.f19158 = c1705;
        this.f19157 = interfaceC4745;
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥ٘ */
    public final long mo2943(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        C4536 c4536 = this.f19158.f5675;
        float fM7857 = c4536.m7857(Float.intBitsToFloat((int) (4294967295L & j2)));
        C0811 c0811 = c4536.f14997;
        float fM1711 = Float.isNaN(c0811.m1711()) ? 0.0f : c0811.m1711();
        c0811.m1710(fM7857);
        return m9633(fM7857 - fM1711);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m9633(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥۨ */
    public final Object mo2945(long j, InterfaceC0443 interfaceC0443) {
        float fM1995 = C0963.m1995(j);
        C1705 c1705 = this.f19158;
        float fM7858 = c1705.f5675.m7858();
        float fM6154 = c1705.f5675.m7862().m6154();
        if (fM1995 >= 0.0f || fM7858 <= fM6154) {
            j = 0;
        } else {
            this.f19157.mo211(new Float(fM1995));
        }
        return new C0963(j);
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦٌ */
    public final long mo2946(long j, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        C4536 c4536 = this.f19158.f5675;
        float fM7857 = c4536.m7857(fIntBitsToFloat);
        C0811 c0811 = c4536.f14997;
        float fM1711 = Float.isNaN(c0811.m1711()) ? 0.0f : c0811.m1711();
        c0811.m1710(fM7857);
        return m9633(fM7857 - fM1711);
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦۜ */
    public final Object mo2947(long j, long j2, InterfaceC0443 interfaceC0443) {
        this.f19157.mo211(new Float(C0963.m1995(j2)));
        return new C0963(j2);
    }
}
