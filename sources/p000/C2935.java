package p000;

/* JADX INFO: renamed from: ۥٜۨؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2935 extends AbstractC1311 {

    /* JADX INFO: renamed from: ۦٝ */
    public static final C0376 f9863;

    /* JADX INFO: renamed from: ۥۢ */
    public final C1850 f9864;

    /* JADX INFO: renamed from: ۦ */
    public C2242 f9865;

    static {
        C0376 c0376M2131 = AbstractC0993.m2131();
        int i = C1327.f4593;
        c0376M2131.m818(C1327.f4594);
        c0376M2131.m814(1.0f);
        c0376M2131.m819(1);
        f9863 = c0376M2131;
    }

    public C2935(C0605 c0605) {
        super(c0605);
        C1850 c1850 = new C1850();
        c1850.f17782 = 0;
        this.f9864 = c1850;
        c1850.f17789 = this;
        this.f9865 = c0605.f2271 != null ? new C2242(this) : null;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        C3369 c3369M1327 = this.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4447((AbstractC1311) c0605.f2256.f8201, c0605.m1352(), i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        m573(j);
        C0605 c0605 = this.f4513;
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0605) objArr[i2]).f2261.f4252.f7776 = 3;
        }
        m9780(c0605.f2266.mo771(this, c0605.m1352(), j));
        m9782();
        return this;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        C3369 c3369M1327 = this.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4446((AbstractC1311) c0605.f2256.f8201, c0605.m1352(), i);
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥٚ */
    public final int mo4290(AbstractC4642 abstractC4642) {
        C2242 c2242 = this.f9865;
        if (c2242 != null) {
            return c2242.mo4290(abstractC4642);
        }
        C2339 c2339 = this.f4513.f2261.f4252;
        C0143 c0143 = c2339.f7768;
        if (!c2339.f7747) {
            if (c2339.f7752.f4244 == 1) {
                c0143.f567 = true;
                if (c0143.f568) {
                    c2339.f7762 = true;
                    c2339.f7766 = true;
                }
            } else {
                c0143.f574 = true;
            }
        }
        C2935 c2935Mo333 = c2339.mo333();
        boolean z = c2935Mo333.f12092;
        c2935Mo333.f12092 = true;
        c2339.mo327();
        c2935Mo333.f12092 = z;
        Integer num = (Integer) c0143.f573.get(abstractC4642);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۥٜ */
    public final void mo2786() {
        if (this.f9865 == null) {
            this.f9865 = new C2242(this);
        }
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۥٟ */
    public final AbstractC5381 mo2787() {
        return this.f9864;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        C3369 c3369M1327 = this.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo3091((AbstractC1311) c0605.f2256.f8201, c0605.m1352(), i);
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۦؕ */
    public final AbstractC2045 mo2793() {
        return this.f9865;
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۦُؑۛۖ */
    public final void mo9787(InterfaceC3212 interfaceC3212, C4893 c4893) throws Throwable {
        C0605 c0605 = this.f4513;
        InterfaceC2043 interfaceC2043M8951 = AbstractC5359.m8951(c0605);
        C0863 c0863M1354 = c0605.m1354();
        Object[] objArr = c0863M1354.f3182;
        int i = c0863M1354.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0606.m1342()) {
                c0606.m1358(interfaceC3212, c4893);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043M8951).getShowLayoutBounds()) {
            long j = this.f982;
            interfaceC3212.mo2098(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f9863);
        }
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo571(long j, float f, InterfaceC4745 interfaceC4745) {
        m9791(j, f, interfaceC4745);
        if (this.f12095) {
            return;
        }
        this.f4513.f2261.f4252.m4381();
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        C3369 c3369M1327 = this.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4448((AbstractC1311) c0605.f2256.f8201, c0605.m1352(), i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۦؘّۨؕ */
    public final void mo9797(InterfaceC3128 interfaceC3128, long j, C0679 c0679, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        C0605 c0605;
        long jM1510;
        C0605 c0606 = this.f4513;
        boolean z3 = false;
        if (interfaceC3128.mo5029(c0606)) {
            if (!m9781(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m2809(j, m2800())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = c0679.f2482;
                    C0863 c0863M1354 = c0606.m1354();
                    objArr = c0863M1354.f3182;
                    i3 = c0863M1354.f3180 - 1;
                    while (i3 >= 0) {
                        c0605 = (C0605) objArr[i3];
                        if (c0605.m1342()) {
                            interfaceC3128.mo5031(c0605, j, c0679, i2, z2);
                            jM1510 = c0679.m1510();
                            if (AbstractC4225.m7471(jM1510) >= 0.0f && AbstractC4225.m7491(jM1510) && !AbstractC4225.m7488(jM1510) && !interfaceC3128.mo5030(c0679, c0605)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    c0679.f2482 = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = c0679.f2482;
                C0863 c0863M1355 = c0606.m1354();
                objArr = c0863M1355.f3182;
                i3 = c0863M1355.f3180 - 1;
                while (i3 >= 0) {
                    c0605 = (C0605) objArr[i3];
                    if (c0605.m1342()) {
                        interfaceC3128.mo5031(c0605, j, c0679, i2, z2);
                        jM1510 = c0679.m1510();
                        if (AbstractC4225.m7471(jM1510) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                c0679.f2482 = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = c0679.f2482;
            C0863 c0863M1356 = c0606.m1354();
            objArr = c0863M1356.f3182;
            i3 = c0863M1356.f3180 - 1;
            while (i3 >= 0) {
                c0605 = (C0605) objArr[i3];
                if (c0605.m1342()) {
                    interfaceC3128.mo5031(c0605, j, c0679, i2, z2);
                    jM1510 = c0679.m1510();
                    if (AbstractC4225.m7471(jM1510) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            c0679.f2482 = i6;
        }
    }
}
