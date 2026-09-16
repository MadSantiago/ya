package p000;

/* JADX INFO: renamed from: ۦٕۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5683 extends AbstractC4937 {

    /* JADX INFO: renamed from: ۥۜ */
    public static final Object f18680 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public long f18681;

    /* JADX INFO: renamed from: ۥُ */
    public C1254 f18682;

    /* JADX INFO: renamed from: ۥّ */
    public Object f18683;

    /* JADX INFO: renamed from: ۦؑ */
    public int f18684;

    /* JADX INFO: renamed from: ۦۙ */
    public int f18685;

    public C5683(long j) {
        super(j);
        this.f18682 = AbstractC0664.f2448;
        this.f18683 = f18680;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m9498(C5704 c5704, AbstractC3191 abstractC3191) {
        boolean z;
        boolean z2;
        Object obj = AbstractC1538.f5203;
        synchronized (obj) {
            z = true;
            z2 = (this.f18681 == abstractC3191.mo5118() && this.f18684 == abstractC3191.mo5881()) ? false : true;
        }
        if (this.f18683 == f18680 || (z2 && this.f18685 != m9499(c5704, abstractC3191))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.f18681 = abstractC3191.mo5118();
            this.f18684 = abstractC3191.mo5881();
        }
        return z;
    }

    @Override // p000.AbstractC4937
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo2261(long j) {
        return new C5683(j);
    }

    @Override // p000.AbstractC4937
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2262(AbstractC4937 abstractC4937) {
        C5683 c5683 = (C5683) abstractC4937;
        this.f18682 = c5683.f18682;
        this.f18683 = c5683.f18683;
        this.f18685 = c5683.f18685;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [ۦٕۤۡ] */
    /* JADX WARN: Type inference failed for: r13v5, types: [ۦِۖۖ] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, ۦِۖۖ] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX INFO: renamed from: ۦؑ */
    public final int m9499(C5704 c5704, AbstractC3191 abstractC3191) {
        C1254 c1254;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j;
        long j2;
        int i4;
        ?? r26;
        ?? M3287;
        synchronized (AbstractC1538.f5203) {
            c1254 = this.f18682;
        }
        int i5 = 7;
        if (c1254.f4316 == 0) {
            return 7;
        }
        C0863 c0863M5601 = AbstractC3004.m5601();
        Object[] objArr4 = c0863M5601.f3182;
        int i6 = c0863M5601.f3180;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((C1913) objArr4[i7]).m3749();
        }
        try {
            Object[] objArr5 = c1254.f4318;
            int[] iArr = c1254.f4315;
            long[] jArr3 = c1254.f4319;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j2 = j4;
                                InterfaceC0622 interfaceC0622 = (InterfaceC0622) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j = j3;
                                } else {
                                    if (interfaceC0622 instanceof C5704) {
                                        C5704 c5705 = (C5704) interfaceC0622;
                                        M3287 = c5705.m9523((C5683) AbstractC1538.m3287(c5705.f18787, abstractC3191), abstractC3191, z, c5705.f18788);
                                        C1254 c1255 = M3287.f18682;
                                        Object[] objArr6 = c1255.f4318;
                                        long[] jArr4 = c1255.f4319;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i3) & j5 & j2) == j2) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((InterfaceC0622) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j5 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j = j3;
                                        M3287 = AbstractC1538.m3287(interfaceC0622.mo356(), abstractC3191);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(M3287)) * 31) + Long.hashCode(M3287.f16356);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iIdentityHashCode;
                    }
                }
                objArr = c0863M5601.f3182;
                i = c0863M5601.f3180;
                for (i2 = 0; i2 < i; i2++) {
                    ((C1913) objArr[i2]).m3750();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i5;
            objArr = c0863M5601.f3182;
            i = c0863M5601.f3180;
            while (i2 < i) {
                ((C1913) objArr[i2]).m3750();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = c0863M5601.f3182;
            int i15 = c0863M5601.f3180;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C1913) objArr7[i16]).m3750();
            }
            throw th;
        }
    }
}
