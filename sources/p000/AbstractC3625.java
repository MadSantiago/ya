package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۦؚؗٛؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3625 extends AbstractC0275 implements InterfaceC4262, InterfaceC2427 {

    /* JADX INFO: renamed from: ۥؓ */
    public C2186 f12089;

    /* JADX INFO: renamed from: ۥؖ */
    public final C4624 f12090 = new C4624(0, this);

    /* JADX INFO: renamed from: ۥٖ */
    public C4910 f12091;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f12092;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f12093;

    /* JADX INFO: renamed from: ۥۧ */
    public C3262 f12094;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f12095;

    /* JADX INFO: renamed from: ۦٗ */
    public InterfaceC4745 f12096;

    /* JADX INFO: renamed from: ۦۛ */
    public C5006 f12097;

    /* JADX INFO: renamed from: ۥ */
    public static void m6452(AbstractC1311 abstractC1311) {
        C0143 c0143;
        AbstractC1311 abstractC1312 = abstractC1311.f4530;
        C0605 c0605 = abstractC1311.f4513;
        if (!AbstractC3831.m6874(abstractC1312 != null ? abstractC1312.f4513 : null, c0605)) {
            c0605.f2261.f4252.f7768.m315();
            return;
        }
        InterfaceC0155 interfaceC0155Mo332 = c0605.f2261.f4252.mo332();
        if (interfaceC0155Mo332 == null || (c0143 = ((C2339) interfaceC0155Mo332).f7768) == null) {
            return;
        }
        c0143.m315();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public boolean mo323() {
        return false;
    }

    /* JADX INFO: renamed from: ۥٗ */
    public abstract AbstractC3625 mo2785();

    /* JADX INFO: renamed from: ۥٚ */
    public abstract int mo4290(AbstractC4642 abstractC4642);

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۚ */
    public final void m6453(InterfaceC5370 interfaceC5370) {
        long j;
        long j2;
        C3262 c3262 = this.f12094;
        if (this.f12092) {
            return;
        }
        InterfaceC4745 interfaceC4745Mo2711 = interfaceC5370.mo2711();
        if (interfaceC4745Mo2711 != null) {
            boolean z = this.f12096 != interfaceC4745Mo2711;
            if (z || !m6456().f16206) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                InterfaceC2015 interfaceC2015Mo2798 = mo2798();
                long jM8635 = C5063.m8635(interfaceC2015Mo2798.mo2779(0L));
                long jMo2799 = interfaceC2015Mo2798.mo2799();
                j2 = jM8635;
                j = jMo2799;
                z = (C0873.m1863(jM8635, m6456().f16205) && C4207.m7431(jMo2799, m6456().f16203)) ? false : true;
            }
            if (z) {
                C5006 c5006 = this.f12097;
                if (c5006 != null) {
                    c5006.f16573 = interfaceC5370;
                } else {
                    c5006 = new C5006(interfaceC5370, this);
                    this.f12097 = c5006;
                }
                m6455(c5006, j2, j);
                this.f12096 = interfaceC5370.mo2711();
                return;
            }
            return;
        }
        if (c3262 != null) {
            Object[] objArr = c3262.f10944;
            long[] jArr = c3262.f10948;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                m6457((C3639) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            c3262.m6020();
        }
    }

    /* JADX INFO: renamed from: ۥۛ */
    public abstract InterfaceC5370 mo2789();

    /* JADX INFO: renamed from: ۥ۠ */
    public abstract C0605 mo2790();

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۥۡ */
    public final int mo567(AbstractC4642 abstractC4642) {
        int iMo4290;
        if (!mo2792() || (iMo4290 = mo4290(abstractC4642)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC4642 instanceof C4092;
        long j = this.f981;
        return iMo4290 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // p000.InterfaceC2427
    /* JADX INFO: renamed from: ۥۤ */
    public final InterfaceC5370 mo748(int i, int i2, Map map, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC3480.m6278("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C4974(i, i2, map, interfaceC4745, interfaceC4746, this);
    }

    /* JADX INFO: renamed from: ۦؐ */
    public abstract boolean mo2792();

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦؓ */
    public final void m6454(C0605 c0605, C0341 c0341) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        C3262 c3262 = this.f12094;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (c3262 != null) {
            Object[] objArr = c3262.f10944;
            long[] jArr3 = c3262.f10948;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                C3639 c3639 = (C3639) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = c3639.f12174;
                                long[] jArr4 = c3639.f12175;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    C0605 c0606 = (C0605) ((C5756) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (c0606 != null) {
                                                        boolean zM1348 = c0606.m1348();
                                                        i4 = i8;
                                                        if (zM1348) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    c3639.m6498(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        C3262 c3263 = this.f12094;
        if (c3263 != null) {
            long[] jArr5 = c3263.f10948;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((C3639) c3263.f10944[i18]).m6502()) {
                                    c3263.m6022(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        C3262 c3264 = this.f12094;
        if (c3264 == null) {
            c3264 = new C3262();
            this.f12094 = c3264;
        }
        Object objM6027 = c3264.m6027(c0341);
        if (objM6027 == null) {
            objM6027 = new C3639();
            c3264.m6023(c0341, objM6027);
        }
        ((C3639) objM6027).m6501(new C5756(c0605));
    }

    /* JADX INFO: renamed from: ۦؘ */
    public abstract AbstractC3625 mo2795();

    /* JADX INFO: renamed from: ۦً */
    public abstract void mo2796();

    @Override // p000.InterfaceC4262
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo4387(boolean z) {
        AbstractC3625 abstractC3625Mo2795 = mo2795();
        C0605 c0605Mo2790 = abstractC3625Mo2795 != null ? abstractC3625Mo2795.mo2790() : null;
        if (AbstractC3831.m6874(c0605Mo2790, mo2790())) {
            this.f12093 = z;
            return;
        }
        if ((c0605Mo2790 != null ? c0605Mo2790.f2261.f4244 : 0) != 3) {
            if ((c0605Mo2790 != null ? c0605Mo2790.f2261.f4244 : 0) != 4) {
                return;
            }
        }
        this.f12093 = z;
    }

    /* JADX INFO: renamed from: ۦٍ */
    public abstract long mo2797();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦَ */
    public final void m6455(C5006 c5006, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C0605 c0605;
        boolean z2;
        int i;
        char c2;
        long j6;
        C3639 c3639;
        C1775 snapshotObserver;
        C3262 c3262 = this.f12094;
        C2186 c2186 = this.f12089;
        if (c2186 == null) {
            c2186 = new C2186();
            this.f12089 = c2186;
        }
        C2186 c2187 = c2186;
        InterfaceC2043 interfaceC2043 = mo2790().f2259;
        if (interfaceC2043 != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).getSnapshotObserver()) != null) {
            snapshotObserver.f5926.m9077(c5006, C3948.f13187, new C2594(this, j, j2, c5006));
        }
        boolean zMo323 = mo323();
        C3639 c36310 = (C3639) c2187.f7247;
        C3639 c36311 = (C3639) c2187.f7248;
        int i2 = c2187.f7250;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c2187.f7251)[i3];
            if (b == 3) {
                c36311.m6501(((C0341[]) c2187.f7249)[i3]);
            } else if (b != 0 && c3262 != null && (c3639 = (C3639) c3262.m6026(((C0341[]) c2187.f7249)[i3])) != null) {
                c36310.m6499(c3639);
            }
        }
        int i4 = c2187.f7250;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c2187.f7251;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                C0341[] c0341Arr = (C0341[]) c2187.f7249;
                c0341Arr[i6 - i5] = c0341Arr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c2187.f7250;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((C0341[]) c2187.f7249)[i8] = null;
        }
        c2187.f7250 -= i5;
        AbstractC3625 abstractC3625Mo2795 = mo2795();
        Object[] objArr = c36311.f12174;
        long[] jArr = c36311.f12175;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            C0341 c0341 = (C0341) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC3625 abstractC3625 = abstractC3625Mo2795 == null ? this : abstractC3625Mo2795;
                            i = i9;
                            AbstractC3625 abstractC3626 = abstractC3625;
                            while (true) {
                                C2186 c2188 = abstractC3626.f12089;
                                if (c2188 != null) {
                                    z2 = zMo323;
                                    if (AbstractC0246.m506((C0341[]) c2188.f7249, c0341)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zMo323;
                                AbstractC3625 abstractC3625Mo2796 = abstractC3626.mo2795();
                                if (abstractC3625Mo2796 == null) {
                                    break;
                                }
                                abstractC3626 = abstractC3625Mo2796;
                                zMo323 = z2;
                            }
                            C3262 c3263 = abstractC3626.f12094;
                            C3639 c36312 = c3263 != null ? (C3639) c3263.m6026(c0341) : null;
                            if (c36312 != null) {
                                abstractC3625.m6457(c36312);
                            }
                        } else {
                            z2 = zMo323;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo323 = z2;
                    }
                    z = zMo323;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo323;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo323 = z;
                i9 = 8;
            }
        } else {
            z = zMo323;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        c36311.m6493();
        Object[] objArr2 = c36310.f12174;
        long[] jArr2 = c36310.f12175;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c0605 = (C0605) ((C5756) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c0605.m1346(false);
                            } else {
                                c0605.m1336(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c36310.m6493();
    }

    /* JADX INFO: renamed from: ۦْ */
    public final C4910 m6456() {
        C4910 c4910 = this.f12091;
        if (c4910 != null) {
            return c4910;
        }
        C4910 c4911 = new C4910(this);
        this.f12091 = c4911;
        return c4911;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦٓ */
    public final void m6457(C3639 c3639) {
        C0605 c0605;
        Object[] objArr = c3639.f12174;
        long[] jArr = c3639.f12175;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (c0605 = (C0605) ((C5756) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo323()) {
                            c0605.m1346(false);
                        } else {
                            c0605.m1336(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٔ */
    public abstract InterfaceC2015 mo2798();
}
