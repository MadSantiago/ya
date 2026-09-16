package p000;

/* JADX INFO: renamed from: ۦٟۡؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5461 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1545 f18003;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f18004;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f18005;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3510 f18006;

    /* JADX INFO: renamed from: ۥۜ */
    public RunnableC1056 f18007;

    /* JADX INFO: renamed from: ۥۣ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f18008;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2730 f18009;

    /* JADX INFO: renamed from: ۦِ */
    public final C5285 f18010;

    /* JADX INFO: renamed from: ۦٛ */
    public long f18011;

    /* JADX INFO: renamed from: ۦۗ */
    public final C1000 f18012;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f18013;

    public C5461(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f18008 = viewTreeObserverOnGlobalLayoutListenerC0850;
        C3510 c3510 = new C3510((char) 0, 9);
        c3510.f11621 = new long[192];
        c3510.f11624 = new long[192];
        this.f18006 = c3510;
        this.f18003 = new C1545();
        this.f18009 = new C2730();
        this.f18011 = -1L;
        this.f18010 = new C5285(20, this);
        this.f18012 = new C1000();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static boolean m9133(AbstractC1311 abstractC1311) {
        InterfaceC4384 interfaceC4384 = abstractC1311.f4522;
        return (interfaceC4384 == null || AbstractC3801.m6784(((C0281) interfaceC4384).m587())) ? false : true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static long m9134(C0605 c0605) {
        C2457 c2457 = c0605.f2256;
        AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
        long jM1861 = 0;
        for (AbstractC1311 abstractC1312 = (C2935) c2457.f8206; abstractC1312 != null && abstractC1312 != abstractC1311; abstractC1312 = abstractC1312.f4514) {
            if (m9133(abstractC1312)) {
                return 9223372034707292159L;
            }
            jM1861 = C0873.m1861(jM1861, abstractC1312.f4531);
        }
        return jM1861;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m9135(C0605 c0605) {
        if (!c0605.f2243 || m9133((AbstractC1311) c0605.f2256.f8201)) {
            return;
        }
        c0605.f2243 = false;
        if (c0605.f2241) {
            c0605.f2244 = m9134(c0605);
            c0605.f2241 = false;
        }
        if (C0873.m1863(c0605.f2244, 9223372034707292159L)) {
            return;
        }
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            m9135((C0605) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m9136(C0605 c0605) {
        long j;
        boolean zM1342 = c0605.m1342();
        C2457 c2457 = c0605.f2256;
        if (zM1342 && c0605.f2246) {
            C0605 c0605M1356 = c0605.m1356();
            if (c0605M1356 == null || c0605M1356.f2243) {
                j = c0605M1356 == null ? 0L : 9223372034707292159L;
            } else {
                if (c0605M1356.f2241) {
                    c0605M1356.f2241 = false;
                    c0605M1356.f2244 = m9134(c0605M1356);
                }
                j = c0605M1356.f2244;
            }
            AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
            if (C0873.m1863(j, 9223372034707292159L) || m9133(abstractC1311)) {
                m9139(c0605);
            } else if (c0605.f2243) {
                m9139(c0605);
                m9135(c0605);
            } else {
                long jM1861 = C0873.m1861(j, abstractC1311.f4531);
                C2339 c2339 = c0605.f2261.f4252;
                int iMo569 = c2339.mo569();
                int iMo568 = c2339.mo568();
                int i = c0605.f2273;
                boolean z = c0605.f2269;
                C3510 c3510 = this.f18006;
                long j2 = 4294967295L;
                if (!z) {
                    c0605.f2269 = true;
                    boolean zM4585 = c2457.m4585(1024);
                    boolean zM4586 = c2457.m4585(16);
                    boolean zM9572 = this.f18003.f5226.m9572(i);
                    if (c0605M1356 != null) {
                        int i2 = c0605M1356.f2273;
                        int i3 = (int) (jM1861 >> 32);
                        int i4 = (int) (jM1861 & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) c3510.f11621;
                        for (int i6 = c3510.f11622 - 3; i6 >= 0; i6 -= 3) {
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                c3510.m6300(i5, i7, i8, i7 + iMo569, i8 + iMo568, i2, zM4585, zM4586, zM9572, i6);
                                break;
                            }
                        }
                    } else {
                        int i9 = (int) (jM1861 >> 32);
                        int i10 = (int) (jM1861 & 4294967295L);
                        c3510.m6300(i, i9, i10, i9 + iMo569, i10 + iMo568, (544 & 32) != 0 ? -1 : 0, zM4585, zM4586, zM9572, -1);
                    }
                } else if (c0605M1356 != null) {
                    int i11 = c0605M1356.f2273;
                    int i12 = (int) (jM1861 >> 32);
                    int i13 = (int) (jM1861 & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) c3510.f11621;
                    int i15 = c3510.f11622;
                    int i16 = 0;
                    loop0: while (i16 < jArr2.length - 2 && i16 < i15) {
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iMo569;
                            int i20 = i18 + iMo568;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = AbstractC1322.f4562;
                                        c3510.m6308(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i16 += 3;
                                i11 = i22;
                                i12 = i23;
                                i13 = i24;
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jM1861 >> 32);
                    int i29 = (int) (jM1861 & 4294967295L);
                    int i30 = iMo569 + i28;
                    int i31 = i29 + iMo568;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) c3510.f11621;
                    int i33 = c3510.f11622;
                    for (int i34 = 0; i34 < jArr4.length - 2 && i34 < i33; i34 += 3) {
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if (!(i37 != 0) && !(i38 != 0)) {
                                break;
                            }
                            int i39 = AbstractC1322.f4562;
                            c3510.m6308(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            break;
                        }
                    }
                }
            }
            c0605.f2246 = false;
            this.f18004 = true;
            m9140();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m9137(C0605 c0605) {
        long j;
        int i = c0605.f2273 & 33554431;
        C3510 c3510 = this.f18006;
        long[] jArr = (long[]) c3510.f11621;
        int i2 = c3510.f11622;
        int i3 = 0;
        while (true) {
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                j = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
            i3 += 3;
        }
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[LOOP:11: B:102:0x0249->B:103:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[LOOP:9: B:95:0x0225->B:107:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025d A[ADDED_TO_REGION, LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_START, PHI: r1
  0x025d: PHI (r1v8 ۥٍۛؔٗ) = (r1v7 ۥٍۛؔٗ), (r1v9 ۥٍۛؔٗ) binds: [B:109:0x025b, B:111:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f A[LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x026a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[EDGE_INSN: B:136:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0259 A[EDGE_INSN: B:137:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
  0x0189: PHI (r3v6 ۥٍۛؔٗ) = (r3v5 ۥٍۛؔٗ), (r3v7 ۥٍۛؔٗ) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m9138() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        long j4;
        Object[] objArr;
        long[] jArr;
        int length;
        C2321 c2321;
        int i3;
        long j5;
        int i4;
        long j6;
        int i5;
        C2321 c2322;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j7;
        long j8;
        float[] fArr;
        C2321 c2323;
        long[] jArr4;
        long j9;
        long j10;
        RunnableC1056 runnableC1056 = this.f18007;
        if (runnableC1056 != null) {
            this.f18008.removeCallbacks(runnableC1056);
            this.f18007 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f18004;
        boolean z3 = z2 || this.f18005;
        C3510 c3510 = this.f18006;
        boolean z4 = true;
        C1545 c1545 = this.f18003;
        if (z2) {
            this.f18004 = false;
            C2730 c2730 = this.f18009;
            Object[] objArr2 = c2730.f9041;
            int i9 = c2730.f9040;
            for (int i10 = 0; i10 < i9; i10++) {
                ((InterfaceC4448) objArr2[i10]).mo449();
            }
            long[] jArr5 = (long[]) c3510.f11621;
            int i11 = c3510.f11622;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j11 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j11 >> 60)) & 1) != 0) {
                    long j12 = jArr5[i12];
                    long j13 = jArr5[i12 + 1];
                    C2321 c2324 = (C2321) c1545.f5226.m9571(((int) j11) & 33554431);
                    while (c2324 != null) {
                        C2321 c2325 = c2324.f7680;
                        boolean z6 = z3;
                        long j14 = c2324.f7681;
                        boolean z7 = (jCurrentTimeMillis - j14 >= 0 || j14 == Long.MIN_VALUE) ? z5 : false;
                        c2324.f7675 = j12;
                        c2324.f7676 = j13;
                        if (z7) {
                            c2324.f7681 = jCurrentTimeMillis;
                            j9 = j12;
                            j10 = j13;
                            c2324.m4365(j9, j10, c1545.f5227, c1545.f5223, c1545.f5228);
                        } else {
                            j9 = j12;
                            j10 = j13;
                        }
                        c2324 = c2325;
                        j12 = j9;
                        j13 = j10;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) c3510.f11621;
            int i14 = c3510.f11622;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.f18005) {
            this.f18005 = false;
            long j15 = c1545.f5227;
            long j16 = c1545.f5223;
            float[] fArr2 = c1545.f5228;
            C4912 c4912 = c1545.f5226;
            j2 = 128;
            Object[] objArr3 = c4912.f18945;
            long[] jArr7 = c4912.f18948;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j17 = j15;
                    long j18 = jArr7[i17];
                    int i19 = i18;
                    c3510 = c3510;
                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j19 = j18;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j19 & 255) < 128) {
                                C2321 c2326 = (C2321) objArr3[(i17 << 3) + i21];
                                while (c2326 != null) {
                                    c1545.m3295(c2326, j17, j16, fArr2, jCurrentTimeMillis);
                                    c2326 = c2326.f7680;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j19 >>= i22;
                            i21++;
                            j17 = j17;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j15 = j17;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    c3510 = c3510;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j7 = c1545.f5227;
                j8 = c1545.f5223;
                fArr = c1545.f5228;
                c2323 = c1545.f5225;
                if (c2323 != null) {
                    while (c2323 != null) {
                        C0605 c0605M9270 = AbstractC5537.m9270(c2323.f7677);
                        long jM9137 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9270)).getRectManager().m9137(c0605M9270);
                        c2323.f7675 = jM9137;
                        C2339 c2339 = c0605M9270.f2261.f4252;
                        c2323.f7676 = (((long) (c2339.f985 + ((int) (jM9137 >> 32)))) << 32) | (((long) (c2339.f984 + ((int) (jM9137 & 4294967295L)))) & 4294967295L);
                        c1545.m3295(c2323, j7, j8, fArr, jCurrentTimeMillis);
                        c2323 = c2323.f7680;
                    }
                }
            }
            if (this.f18013) {
                i2 = 0;
                this.f18013 = false;
                C3510 c3511 = c3510;
                jArr2 = (long[]) c3511.f11621;
                int i23 = c3511.f11622;
                jArr3 = (long[]) c3511.f11624;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != AbstractC1322.f4563) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                c3511.f11622 = i7;
                c3511.f11621 = jArr3;
                c3511.f11624 = jArr2;
            } else {
                i2 = 0;
            }
            j4 = c1545.f5222;
            if (j4 <= jCurrentTimeMillis) {
                C4912 c4913 = c1545.f5226;
                objArr = c4913.f18945;
                jArr = c4913.f18948;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j5 = jArr[i3];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j6 = j5;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j6 & j3) < j2) {
                                    for (c2322 = (C2321) objArr[(i3 << 3) + i5]; c2322 != null; c2322 = c2322.f7680) {
                                    }
                                }
                                j6 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                c2321 = c1545.f5225;
                if (c2321 != null) {
                    while (c2321 != null) {
                        c2321 = c2321.f7680;
                    }
                }
                j4 = -1;
                c1545.f5222 = -1L;
            }
            if (j4 > j) {
                m9140();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j7 = c1545.f5227;
            j8 = c1545.f5223;
            fArr = c1545.f5228;
            c2323 = c1545.f5225;
            if (c2323 != null) {
                while (c2323 != null) {
                    C0605 c0605M9271 = AbstractC5537.m9270(c2323.f7677);
                    long jM9138 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(c0605M9271)).getRectManager().m9137(c0605M9271);
                    c2323.f7675 = jM9138;
                    C2339 c23310 = c0605M9271.f2261.f4252;
                    c2323.f7676 = (((long) (c23310.f985 + ((int) (jM9138 >> 32)))) << 32) | (((long) (c23310.f984 + ((int) (jM9138 & 4294967295L)))) & 4294967295L);
                    c1545.m3295(c2323, j7, j8, fArr, jCurrentTimeMillis);
                    c2323 = c2323.f7680;
                }
            }
        }
        if (this.f18013) {
            i2 = 0;
            this.f18013 = false;
            C3510 c3512 = c3510;
            jArr2 = (long[]) c3512.f11621;
            int i24 = c3512.f11622;
            jArr3 = (long[]) c3512.f11624;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != AbstractC1322.f4563) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            c3512.f11622 = i7;
            c3512.f11621 = jArr3;
            c3512.f11624 = jArr2;
        } else {
            i2 = 0;
        }
        j4 = c1545.f5222;
        if (j4 <= jCurrentTimeMillis) {
            C4912 c4914 = c1545.f5226;
            objArr = c4914.f18945;
            jArr = c4914.f18948;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j5 = jArr[i3];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j6 = j5;
                        while (i5 < i4) {
                            if ((j6 & j3) < j2) {
                                while (c2322 != null) {
                                }
                            }
                            j6 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            c2321 = c1545.f5225;
            if (c2321 != null) {
                while (c2321 != null) {
                    c2321 = c2321.f7680;
                }
            }
            j4 = -1;
            c1545.f5222 = -1L;
        }
        if (j4 > j) {
            m9140();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m9139(C0605 c0605) {
        boolean z;
        C0605 c0605M1356;
        int i;
        boolean z2 = true;
        c0605.f2243 = true;
        C2457 c2457 = c0605.f2256;
        C2339 c2339 = c0605.f2261.f4252;
        int iMo569 = c2339.mo569();
        float fMo568 = c2339.mo568();
        C1000 c1000 = this.f18012;
        c1000.f3578 = 0.0f;
        c1000.f3577 = 0.0f;
        c1000.f3576 = iMo569;
        c1000.f3579 = fMo568;
        for (AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201; abstractC1311 != null; abstractC1311 = abstractC1311.f4514) {
            C0605 c0606 = abstractC1311.f4513;
            if (abstractC1311 == ((AbstractC1311) c0606.f2256.f8201) && !c0606.f2243) {
                long jM9137 = m9137(c0606);
                if (!C0873.m1863(jM9137, 9223372034707292159L)) {
                    c1000.m2182((((long) Float.floatToRawIntBits((int) (jM9137 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM9137 & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            InterfaceC4384 interfaceC4384 = abstractC1311.f4522;
            if (interfaceC4384 != null) {
                float[] fArrM587 = ((C0281) interfaceC4384).m587();
                if (!AbstractC3801.m6784(fArrM587)) {
                    C0132.m289(fArrM587, c1000);
                }
            }
            long j = abstractC1311.f4531;
            c1000.m2182((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
        }
        int i2 = (int) c1000.f3578;
        int i3 = (int) c1000.f3577;
        int i4 = (int) c1000.f3576;
        int i5 = (int) c1000.f3579;
        int i6 = c0605.f2273;
        boolean z3 = c0605.f2269;
        c0605.f2269 = true;
        C3510 c3510 = this.f18006;
        if (z3) {
            int i7 = i6 & 33554431;
            long[] jArr = (long[]) c3510.f11621;
            int i8 = c3510.f11622;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    z = z2;
                    c0605M1356 = c0605.m1356();
                    if (c0605M1356 != null) {
                        i = c0605M1356.f2273;
                    } else {
                        i = -1;
                    }
                    c3510.m6300(i6, i2, i3, i4, i5, (544 & 32) != 0 ? -1 : i, c2457.m4585(1024), c2457.m4585(16), this.f18003.f5226.m9572(i6), -1);
                } else {
                    int i10 = i9 + 2;
                    long j2 = jArr[i10];
                    z = z2;
                    if ((((int) j2) & 33554431) == i7) {
                        jArr[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
                        jArr[i10] = (((j2 >> 63) & 1) << 60) | j2;
                    } else {
                        i9 += 3;
                        z2 = z;
                    }
                }
            }
        } else {
            z = z2;
            c0605M1356 = c0605.m1356();
            if (c0605M1356 != null) {
                i = c0605M1356.f2273;
            } else {
                i = -1;
            }
            c3510.m6300(i6, i2, i3, i4, i5, (544 & 32) != 0 ? -1 : i, c2457.m4585(1024), c2457.m4585(16), this.f18003.f5226.m9572(i6), -1);
        }
        c0605.f2246 = false;
        this.f18004 = z;
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i11 = c0863M1329.f3180;
        for (int i12 = 0; i12 < i11; i12++) {
            C0605 c0607 = (C0605) objArr[i12];
            if (c0607.m1342()) {
                m9139(c0607);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۦٛ */
    public final void m9140() {
        RunnableC1056 runnableC1056 = this.f18007;
        boolean z = runnableC1056 != null;
        long j = this.f18003.f5222;
        if (j >= 0 || !z) {
            if (this.f18011 == j && z) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f18008;
            if (runnableC1056 != null) {
                viewTreeObserverOnGlobalLayoutListenerC0850.removeCallbacks(runnableC1056);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.f18011 = jMax;
            RunnableC1056 runnableC1057 = new RunnableC1056(0, this.f18010);
            viewTreeObserverOnGlobalLayoutListenerC0850.postDelayed(runnableC1057, jMax - jCurrentTimeMillis);
            this.f18007 = runnableC1057;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m9141(C0605 c0605) {
        if (c0605.f2269) {
            int i = c0605.f2273 & 33554431;
            C3510 c3510 = this.f18006;
            long[] jArr = (long[]) c3510.f11621;
            int i2 = c3510.f11622;
            for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = AbstractC1322.f4563;
                    break;
                }
            }
            c0605.f2269 = false;
            c0605.f2246 = true;
            this.f18004 = true;
            this.f18013 = true;
        }
    }
}
