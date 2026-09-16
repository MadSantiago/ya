package p000;

/* JADX INFO: renamed from: ۦًؚٖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4293 {

    /* JADX INFO: renamed from: ۥؗ */
    public C5213 f14193;

    /* JADX INFO: renamed from: ۥُ */
    public C3490 f14194;

    /* JADX INFO: renamed from: ۥّ */
    public AbstractC1631 f14195;

    /* JADX INFO: renamed from: ۥۗ */
    public C2062 f14196;

    /* JADX INFO: renamed from: ۥۜ */
    public long f14197 = 9205357640488583168L;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC4485 f14198;

    /* JADX INFO: renamed from: ۦؑ */
    public C4393 f14199;

    /* JADX INFO: renamed from: ۦؚ */
    public long f14200;

    /* JADX INFO: renamed from: ۦِ */
    public final C0322 f14201;

    /* JADX INFO: renamed from: ۦٛ */
    public C3250 f14202;

    /* JADX INFO: renamed from: ۦۗ */
    public final C0322 f14203;

    /* JADX INFO: renamed from: ۦۙ */
    public C1039 f14204;

    public C4293(AbstractC4485 abstractC4485) {
        this.f14198 = abstractC4485;
        C0322 c0322 = new C0322((char) 0, 4);
        c0322.f1178 = new C2730();
        this.f14201 = c0322;
        C0322 c0323 = new C0322((char) 0, 7);
        c0323.f1178 = new C2741();
        this.f14203 = c0323;
        this.f14200 = 0L;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m7580(C4293 c4293, C3410 c3410, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        AbstractC4485 abstractC4485 = c4293.f14198;
        C4393 c4393 = c4293.f14199;
        if (c4393 == null) {
            c4393 = new C4393();
            c4393.f14479 = null;
            c4393.f14481 = Long.MAX_VALUE;
            c4393.f14480 = false;
            c4293.f14199 = c4393;
        }
        c4393.f14479 = c3410;
        c4393.f14481 = j;
        C3250 c3250 = c4293.f14202;
        EnumC1616 enumC1616 = abstractC4485.f14811;
        if (c3250 == null) {
            c4293.f14202 = new C3250(enumC1616);
        } else {
            c3250.f10915 = enumC1616;
            c3250.f10916 = j2;
        }
        c4393.f14480 = false;
        c4293.f14195 = c4393;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m7581(C3410 c3410, C1040 c1040, long j) {
        AbstractC4485 abstractC4485 = this.f14198;
        long jMo2779 = AbstractC5537.m9247(abstractC4485).mo2779(0L);
        if (!C1553.m3306(this.f14197, 9205357640488583168L) && !C1553.m3306(jMo2779, this.f14197)) {
            this.f14200 = C1553.m3304(this.f14200, C1553.m3308(jMo2779, this.f14197));
        }
        this.f14197 = jMo2779;
        EnumC1616 enumC1616 = abstractC4485.f14811;
        C5499 c5499 = AbstractC2481.f8273;
        if (Math.abs(Float.intBitsToFloat((int) (enumC1616 == EnumC1616.f5425 ? j & 4294967295L : j >> 32))) > 2.0f) {
            AbstractC0487.m1089(m7585(), c3410, abstractC4485.f14811, c1040, this.f14201, this.f14200);
            C0322 c0322 = this.f14203;
            C2741 c2741 = (C2741) c0322.f1178;
            int i = c2741.f9072;
            if (i == 3) {
                int i2 = c0322.f1179;
                c0322.f1179 = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    AbstractC2552.m4812("Index must be between 0 and size");
                    throw null;
                }
                long[] jArr = c2741.f9073;
                long j2 = jArr[i2];
                jArr[i2] = j;
            } else {
                c2741.m5092(j);
            }
            if (c0322.f1179 == 3) {
                c0322.f1179 = 0;
            }
            long[] jArr2 = c2741.f9073;
            int i3 = c2741.f9072;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = c2741.f9072;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = c2741.f9073;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            abstractC4485.m7769(new C4640((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / c2741.f9072)) & 4294967295L), true));
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7582(C3410 c3410, C3410 c3411, C1040 c1040, long j) {
        if (this.f14204 == null) {
            this.f14204 = new C1039(19);
        }
        this.f14200 = 0L;
        C1039 c1039M7585 = m7585();
        AbstractC4485 abstractC4485 = this.f14198;
        AbstractC0487.m1089(c1039M7585, c3410, abstractC4485.f14811, c1040, this.f14201, this.f14200);
        long jM3308 = C1553.m3308(AbstractC0487.m1095(c3411, abstractC4485.f14811, c1040), j);
        if (((Boolean) abstractC4485.f14815.mo211(new C5407(1))).booleanValue()) {
            this.f14197 = AbstractC5537.m9247(abstractC4485).mo2779(0L);
            abstractC4485.m7769(new C1610(jM3308));
        }
        C0322 c0322 = this.f14203;
        c0322.f1179 = 0;
        ((C2741) c0322.f1178).f9072 = 0;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7583(C3410 c3410, long j, C3250 c3250) {
        C3490 c3490 = this.f14194;
        if (c3490 == null) {
            c3490 = new C3490();
            c3490.f11587 = null;
            c3490.f11588 = Long.MAX_VALUE;
            this.f14194 = c3490;
        }
        c3490.f11587 = c3410;
        c3490.f11588 = j;
        c3250.f10916 = 0L;
        this.f14195 = c3490;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7584() {
        C2062 c2062 = this.f14196;
        if (c2062 == null) {
            c2062 = new C2062();
            c2062.f6787 = 3;
            c2062.f6788 = false;
            this.f14196 = c2062;
        }
        c2062.f6787 = 3;
        c2062.f6788 = false;
        this.f14195 = c2062;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C1039 m7585() {
        C1039 c1039 = this.f14204;
        if (c1039 != null) {
            return c1039;
        }
        C1078.m2272("Velocity Tracker not initialized.");
        return null;
    }
}
