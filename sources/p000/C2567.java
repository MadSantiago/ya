package p000;

/* JADX INFO: renamed from: ۥۡؕٝؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2567 extends AbstractC5381 implements InterfaceC4825, InterfaceC1293 {

    /* JADX INFO: renamed from: ۥً */
    public EnumC1616 f8570;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f8571;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC3762 f8572;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f8573;

    /* JADX INFO: renamed from: ۦؖ */
    public final C4228 f8574 = new C4228(8);

    /* JADX INFO: renamed from: ۦؗ */
    public long f8575 = -1;

    /* JADX INFO: renamed from: ۦؙ */
    public final C0197 f8576;

    /* JADX INFO: renamed from: ۦُ */
    public boolean f8577;

    /* JADX INFO: renamed from: ۦٚ */
    public final C4545 f8578;

    public C2567(EnumC1616 enumC1616, C4545 c4545, boolean z, InterfaceC3762 interfaceC3762, C0197 c0197) {
        this.f8570 = enumC1616;
        this.f8578 = c4545;
        this.f8571 = z;
        this.f8572 = interfaceC3762;
        this.f8576 = c0197;
    }

    /* JADX INFO: renamed from: ۥؒ */
    public static boolean m4840(C2567 c2567, C2793 c2793, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = c2567.m4843();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jM4844 = c2567.m4844(c2793, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jM4844 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM4844 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: renamed from: ۥؐ */
    public final void m4841(long j) {
        InterfaceC3762 interfaceC3762 = this.f8572;
        if (interfaceC3762 == null) {
            interfaceC3762 = (InterfaceC3762) AbstractC2552.m4807(this, AbstractC0934.f3325);
        }
        InterfaceC3762 interfaceC3763 = interfaceC3762;
        if (this.f8577) {
            AbstractC4690.m8035("launchAnimation called when previous animation was running");
        }
        InterfaceC3762 interfaceC3764 = this.f8572;
        if (interfaceC3764 == null) {
            interfaceC3764 = (InterfaceC3762) AbstractC2552.m4807(this, AbstractC0934.f3325);
        }
        interfaceC3764.getClass();
        InterfaceC3762.f12523.getClass();
        AbstractC2765.m5135(m9076(), null, 4, new C0727(this, new C4174(C3507.f11618), interfaceC3763, j, null), 1);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final float m4842(InterfaceC3762 interfaceC3762, long j) {
        float f;
        C2793 c2793;
        int iCompare;
        long j2 = this.f8575;
        C0863 c0863 = (C0863) this.f8574.f14025;
        int i = c0863.f3180 - 1;
        Object[] objArr = c0863.f3182;
        if (i < objArr.length) {
            c2793 = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                C2793 c2794 = (C2793) ((C2769) objArr[i]).f9188.mo449();
                if (c2794 != null) {
                    long jM5316 = c2794.m5316();
                    long jM9235 = AbstractC5537.m9235(m4843());
                    f = 0.0f;
                    int iOrdinal = this.f8570.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM5316 & 4294967295L)), Float.intBitsToFloat((int) (jM9235 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            C1078.m2275();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM5316 >> 32)), Float.intBitsToFloat((int) (jM9235 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (c2793 != null) {
                            break;
                        }
                        c2793 = c2794;
                        break;
                    }
                    c2793 = c2794;
                }
                i--;
            }
        } else {
            f = 0.0f;
            c2793 = null;
        }
        if (c2793 == null) {
            C2793 c2795 = this.f8573 ? (C2793) this.f8576.mo449() : null;
            if (c2795 == null) {
                return f;
            }
            c2793 = c2795;
        }
        long jM9236 = AbstractC5537.m9235(j2);
        int iOrdinal2 = this.f8570.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = c2793.f9342;
            return interfaceC3762.mo3531(f2 - ((int) (j & 4294967295L)), c2793.f9344 - f2, Float.intBitsToFloat((int) (jM9236 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = c2793.f9343;
            return interfaceC3762.mo3531(f3 - ((int) (j >> 32)), c2793.f9341 - f3, Float.intBitsToFloat((int) (jM9236 >> 32)));
        }
        C1078.m2275();
        return f;
    }

    @Override // p000.InterfaceC1293
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2727(long j) {
        int iM6879;
        long j2;
        long jM4843 = m4843();
        this.f8575 = j;
        int iOrdinal = this.f8570.ordinal();
        if (iOrdinal == 0) {
            iM6879 = AbstractC3831.m6879((int) (j & 4294967295L), (int) (jM4843 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                C1078.m2275();
                return;
            }
            iM6879 = AbstractC3831.m6879((int) (j >> 32), (int) (jM4843 >> 32));
        }
        if (iM6879 >= 0) {
            return;
        }
        if (this.f8571) {
            j2 = 0;
        } else {
            j2 = this.f8570 == EnumC1616.f5425 ? ((long) (((int) (jM4843 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jM4843 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        C2793 c2793 = (C2793) this.f8576.mo449();
        if (c2793 == null || this.f8577 || this.f8573 || !m4840(this, c2793, jM4843, 0L, 2) || m4840(this, c2793, 0L, j3, 1)) {
            return;
        }
        this.f8573 = true;
        m4841(j3);
    }

    /* JADX INFO: renamed from: ۥٜ */
    public final long m4843() {
        long j = this.f8575;
        if (C4207.m7431(j, -1L)) {
            return 0L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۦؕ */
    public final long m4844(C2793 c2793, long j, long j2) {
        long jM9235 = AbstractC5537.m9235(j);
        int iOrdinal = this.f8570.ordinal();
        if (iOrdinal == 0) {
            InterfaceC3762 interfaceC3762 = this.f8572;
            if (interfaceC3762 == null) {
                interfaceC3762 = (InterfaceC3762) AbstractC2552.m4807(this, AbstractC0934.f3325);
            }
            float f = c2793.f9342;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(interfaceC3762.mo3531(f - ((int) (j2 & 4294967295L)), c2793.f9344 - f, Float.intBitsToFloat((int) (jM9235 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            C1078.m2275();
            return 0L;
        }
        InterfaceC3762 interfaceC3763 = this.f8572;
        if (interfaceC3763 == null) {
            interfaceC3763 = (InterfaceC3762) AbstractC2552.m4807(this, AbstractC0934.f3325);
        }
        float f2 = c2793.f9343;
        return (((long) Float.floatToRawIntBits(interfaceC3763.mo3531(f2 - ((int) (j2 >> 32)), c2793.f9341 - f2, Float.intBitsToFloat((int) (jM9235 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }
}
