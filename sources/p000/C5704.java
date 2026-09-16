package p000;

/* JADX INFO: renamed from: ۦۥٕؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5704 extends AbstractC2975 implements InterfaceC5372 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC0241 f18786;

    /* JADX INFO: renamed from: ۥٓ */
    public C5683 f18787 = new C5683(AbstractC1538.m3278().mo5118());

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC4448 f18788;

    public C5704(InterfaceC4448 interfaceC4448, InterfaceC0241 interfaceC0241) {
        this.f18788 = interfaceC4448;
        this.f18786 = interfaceC0241;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        InterfaceC4745 interfaceC4745Mo4945 = AbstractC1538.m3278().mo4945();
        if (interfaceC4745Mo4945 != null) {
            interfaceC4745Mo4945.mo211(this);
        }
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        return m9523((C5683) AbstractC1538.m3287(this.f18787, abstractC3191M3278), abstractC3191M3278, true, this.f18788).f18683;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C5683 c5683 = (C5683) AbstractC1538.m3272(this.f18787);
        sb.append(c5683.m9498(this, AbstractC1538.m3278()) ? String.valueOf(c5683.f18683) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        this.f18787 = (C5683) abstractC4937;
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f18787;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final C5683 m9522() {
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        return m9523((C5683) AbstractC1538.m3287(this.f18787, abstractC3191M3278), abstractC3191M3278, false, this.f18788);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    /* JADX INFO: renamed from: ۦٛ */
    public final C5683 m9523(C5683 c5683, AbstractC3191 abstractC3191, boolean z, InterfaceC4448 interfaceC4448) {
        InterfaceC0241 interfaceC0241;
        int i;
        C5683 c5684 = c5683;
        if (c5684.m9498(this, abstractC3191)) {
            if (z) {
                C0863 c0863M5601 = AbstractC3004.m5601();
                Object[] objArr = c0863M5601.f3182;
                int i2 = c0863M5601.f3180;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((C1913) objArr[i3]).m3749();
                }
                try {
                    C1254 c1254 = c5684.f18682;
                    C5460 c5460 = AbstractC3004.f10103;
                    C0888 c0888 = (C0888) c5460.get();
                    if (c0888 == null) {
                        c0888 = new C0888();
                        c5460.m9128(c0888);
                    }
                    int i4 = c0888.f3230;
                    Object[] objArr2 = c1254.f4318;
                    int[] iArr = c1254.f4315;
                    long[] jArr = c1254.f4319;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        InterfaceC0622 interfaceC0622 = (InterfaceC0622) objArr2[i9];
                                        i = i6;
                                        c0888.f3230 = i4 + iArr[i9];
                                        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191.mo4945();
                                        if (interfaceC4745Mo4945 != null) {
                                            interfaceC4745Mo4945.mo211(interfaceC0622);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    c0888.f3230 = i4;
                } finally {
                    Object[] objArr3 = c0863M5601.f3182;
                    int i10 = c0863M5601.f3180;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C1913) objArr3[i11]).m3750();
                    }
                }
            }
            return c5684;
        }
        C1254 c1255 = new C1254();
        C5460 c5461 = AbstractC3004.f10103;
        C0888 c0889 = (C0888) c5461.get();
        if (c0889 == null) {
            c0889 = new C0888();
            c5461.m9128(c0889);
        }
        int i12 = c0889.f3230;
        C0863 c0863M5602 = AbstractC3004.m5601();
        Object[] objArr4 = c0863M5602.f3182;
        int i13 = c0863M5602.f3180;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C1913) objArr4[i14]).m3749();
        }
        try {
            c0889.f3230 = i12 + 1;
            Object objM7462 = AbstractC4225.m7462(new C3298(this, c0889, c1255, i12), interfaceC4448);
            c0889.f3230 = i12;
            Object[] objArr5 = c0863M5602.f3182;
            int i15 = c0863M5602.f3180;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C1913) objArr5[i16]).m3750();
            }
            Object obj = AbstractC1538.f5203;
            synchronized (obj) {
                try {
                    AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
                    Object obj2 = c5684.f18683;
                    if (obj2 == C5683.f18680 || (interfaceC0241 = this.f18786) == null || !interfaceC0241.mo502(objM7462, obj2)) {
                        C5683 c5685 = this.f18787;
                        synchronized (obj) {
                            AbstractC4937 abstractC4937M3286 = AbstractC1538.m3286(c5685, this);
                            abstractC4937M3286.mo2262(c5685);
                            abstractC4937M3286.f16356 = abstractC3191M3278.mo5118();
                            c5684 = (C5683) abstractC4937M3286;
                            c5684.f18682 = c1255;
                            c5684.f18685 = c5684.m9499(this, abstractC3191M3278);
                            c5684.f18683 = objM7462;
                        }
                        return c5684;
                    }
                    c5684.f18682 = c1255;
                    c5684.f18685 = c5684.m9499(this, abstractC3191M3278);
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0888 c08810 = (C0888) AbstractC3004.f10103.get();
            if (c08810 == null || c08810.f3230 != 0) {
                return c5684;
            }
            AbstractC1538.m3278().mo4468();
            synchronized (obj) {
                AbstractC3191 abstractC3191M3279 = AbstractC1538.m3278();
                c5684.f18681 = abstractC3191M3279.mo5118();
                c5684.f18684 = abstractC3191M3279.mo5881();
                return c5684;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = c0863M5602.f3182;
            int i17 = c0863M5602.f3180;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C1913) objArr6[i18]).m3750();
            }
            throw th2;
        }
    }
}
