package p000;

/* JADX INFO: renamed from: ۦٜؖؓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4696 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f15485;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4523 f15487 = new C4523();

    /* JADX INFO: renamed from: ۥۗ */
    public final C2730 f15486 = new C2730();

    public C4696(Object obj) {
        this.f15485 = obj;
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2813() {
        this.f15487.m7843(8);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥّ */
    public final void mo2815(int i, int i2, int i3) {
        C4523 c4523 = this.f15487;
        c4523.m7843(3);
        c4523.m7843(i);
        c4523.m7843(i2);
        c4523.m7843(i3);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2816(Object obj) {
        this.f15487.m7843(1);
        this.f15486.m5079(obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo2817(int i, int i2) {
        C4523 c4523 = this.f15487;
        c4523.m7843(2);
        c4523.m7843(i);
        c4523.m7843(i2);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2818(int i, Object obj) {
        C4523 c4523 = this.f15487;
        c4523.m7843(5);
        c4523.m7843(i);
        this.f15486.m5079(obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2819(int i, Object obj) {
        C4523 c4523 = this.f15487;
        c4523.m7843(6);
        c4523.m7843(i);
        this.f15486.m5079(obj);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦِ */
    public final void mo2820() {
        this.f15487.m7843(0);
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo7664(InterfaceC5731 interfaceC5731, Object obj) {
        this.f15487.m7843(7);
        C2730 c2730 = this.f15486;
        c2730.m5079(interfaceC5731);
        c2730.m5079(obj);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8044(C1326 c1326, C0175 c0175) {
        Exception exc;
        C4523 c4523 = this.f15487;
        int i = c4523.f14948;
        C2730 c2730 = new C2730();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C2730 c2731 = this.f15486;
            if (i2 >= i) {
                if (i3 != c2731.f9040) {
                    AbstractC5508.m9201("Applier operation size mismatch");
                }
                c2731.m5080();
                c4523.f14948 = 0;
                c1326.mo2814();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (c4523.m7840(i2)) {
                        case 0:
                            c1326.mo2820();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            c1326.mo2816(c2731.m5076(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            int i6 = i2 + 2;
                            i2 += 3;
                            c1326.mo2817(c4523.m7840(i4), c4523.m7840(i6));
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    c1326.mo2815(c4523.m7840(i4), c4523.m7840(i7), c4523.m7840(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            c1326.m2821();
                            i2 = i4;
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            c1326.mo2818(c4523.m7840(i4), c2731.m5076(i3));
                            i3 = i9;
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                c4523.m7840(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object objM5076 = c2731.m5076(i3);
                            AbstractC3801.m6782(2, objM5076);
                            i3 += 2;
                            c1326.mo7664((InterfaceC5731) objM5076, c2731.m5076(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = c1326.f4582;
                            if (obj instanceof InterfaceC1263) {
                                InterfaceC1263 interfaceC1263 = (InterfaceC1263) obj;
                                if (((C0863) c0175.f651).m1848(interfaceC1263)) {
                                    interfaceC1263.mo1335();
                                }
                            }
                            c2730.m5079(obj);
                            c1326.mo2813();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    c1326.mo2814();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new C0111(c2731, c2730, c4523, i2 - 1, exc);
        }
    }

    @Override // p000.InterfaceC4790
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo2822() {
        return this.f15485;
    }
}
