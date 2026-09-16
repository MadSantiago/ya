package p000;

/* JADX INFO: renamed from: ۥَْۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2242 extends AbstractC2045 {
    @Override // p000.AbstractC2045
    /* JADX INFO: renamed from: ۥؘ */
    public final void mo3988() {
        this.f6744.f4513.f2261.f4240.m5513();
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        C3369 c3369M1327 = this.f6744.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4447((AbstractC1311) c0605.f2256.f8201, c0605.m1351(), i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        m573(j);
        AbstractC1311 abstractC1311 = this.f6744;
        C0863 c0863M1329 = abstractC1311.f4513.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0605) objArr[i2]).f2261.f4240.f9815 = 3;
        }
        C0605 c0605 = abstractC1311.f4513;
        m3991(c0605.f2266.mo771(this, c0605.m1351(), j));
        return this;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        C3369 c3369M1327 = this.f6744.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4446((AbstractC1311) c0605.f2256.f8201, c0605.m1351(), i);
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥٚ */
    public final int mo4290(AbstractC4642 abstractC4642) {
        C2921 c2921 = this.f6744.f4513.f2261.f4240;
        C0143 c0143 = c2921.f9808;
        if (!c2921.f9806) {
            C1233 c1233 = c2921.f9804;
            if (c1233.f4244 == 2) {
                c0143.f567 = true;
                if (c0143.f568) {
                    c1233.f4239 = true;
                    c1233.f4250 = true;
                }
            } else {
                c0143.f574 = true;
            }
        }
        C2242 c2242 = c2921.mo333().f9865;
        if (c2242 != null) {
            c2242.f12092 = true;
        }
        c2921.mo327();
        C2242 c2243 = c2921.mo333().f9865;
        if (c2243 != null) {
            c2243.f12092 = false;
        }
        Integer num = (Integer) c0143.f573.get(abstractC4642);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f6747.m2655(iIntValue, abstractC4642);
        return iIntValue;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        C3369 c3369M1327 = this.f6744.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo3091((AbstractC1311) c0605.f2256.f8201, c0605.m1351(), i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        C3369 c3369M1327 = this.f6744.f4513.m1327();
        InterfaceC3228 interfaceC3228M6132 = c3369M1327.m6132();
        C0605 c0605 = (C0605) c3369M1327.f11255;
        return interfaceC3228M6132.mo4448((AbstractC1311) c0605.f2256.f8201, c0605.m1351(), i);
    }
}
