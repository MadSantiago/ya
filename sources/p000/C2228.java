package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥۙؕۥ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2228 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0482 f7371;

    /* JADX INFO: renamed from: ۥُ */
    public final C4912 f7372;

    /* JADX INFO: renamed from: ۥّ */
    public float f7373;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4912 f7374;

    /* JADX INFO: renamed from: ۥۜ */
    public int f7375;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3121 f7376;

    /* JADX INFO: renamed from: ۦؑ */
    public final C5251 f7377;

    /* JADX INFO: renamed from: ۦؚ */
    public boolean f7378;

    /* JADX INFO: renamed from: ۦٌ */
    public int f7379;

    /* JADX INFO: renamed from: ۦِ */
    public int f7380;

    /* JADX INFO: renamed from: ۦٛ */
    public int f7381;

    /* JADX INFO: renamed from: ۦۗ */
    public int f7382;

    /* JADX INFO: renamed from: ۦۙ */
    public int f7383;

    /* JADX INFO: renamed from: ۦۚ */
    public final C2750 f7384;

    /* JADX INFO: renamed from: ۦۨ */
    public final C2808 f7385;

    public C2228(C3121 c3121, C2750 c2750, C0101 c0101) {
        this.f7376 = c3121;
        C4912 c4912 = AbstractC0137.f547;
        this.f7374 = new C4912();
        this.f7371 = new C0482();
        int i = AbstractC1724.f5746;
        this.f7377 = new C5251();
        this.f7372 = new C4912();
        this.f7383 = -1;
        this.f7375 = Integer.MAX_VALUE;
        this.f7381 = Integer.MIN_VALUE;
        this.f7384 = c2750;
        this.f7385 = new C2808(c0101);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4280(C2808 c2808, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f7373);
        if (!z) {
            if (!z2 || this.f7378) {
                this.f7380 = i3 - i5;
                this.f7375 = i;
            } else {
                int iM5235 = AbstractC2776.m5235(Math.abs(f)) + this.f7380;
                int i8 = i3 - i5;
                if (iM5235 > i8) {
                    iM5235 = i8;
                }
                this.f7380 = iM5235;
            }
            while (this.f7380 > 0 && (i6 = this.f7375) > 0) {
                int iM4284 = m4284(c2808, this.f7375 - 1, i6 + (-1) == i + (-1) && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (iM4284 == -1) {
                    return;
                }
                this.f7375--;
                this.f7380 -= iM4284;
            }
            return;
        }
        if (!z2 || this.f7378) {
            this.f7382 = i3 - i4;
            this.f7381 = i2;
        } else {
            int iM5236 = AbstractC2776.m5235(Math.abs(f)) + this.f7382;
            int i9 = i3 - i4;
            if (iM5236 > i9) {
                iM5236 = i9;
            }
            this.f7382 = iM5236;
        }
        while (this.f7382 > 0 && (i7 = this.f7381) != -1 && i7 < this.f7379 - 1) {
            int iM4285 = m4284(c2808, this.f7381 + 1, i7 + 1 == i2 + 1 && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (iM4285 == -1) {
                return;
            }
            this.f7381++;
            this.f7382 -= iM4285;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥُ */
    public final void m4281(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        C0482 c0482 = this.f7371;
        c0482.m1031();
        C4912 c4912 = this.f7374;
        int[] iArr2 = c4912.f18947;
        long[] jArr2 = c4912.f18948;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            c0482.m1032(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        C5251 c5251 = this.f7377;
        int[] iArr3 = c5251.f17325;
        long[] jArr3 = c5251.f17326;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                c0482.m1032(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        C4912 c4913 = this.f7372;
        int[] iArr4 = c4913.f18947;
        long[] jArr4 = c4913.f18948;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            c0482.m1032(i3);
                        }
                        j6 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        int[] iArr5 = c0482.f1750;
        long[] jArr5 = c0482.f1751;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) c4912.m8320(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((InterfaceC5841) list.get(i19)).cancel();
                            }
                        }
                        int iM8886 = c5251.m8886(i18);
                        if (iM8886 >= 0) {
                            c5251.f17323--;
                            long[] jArr6 = c5251.f17326;
                            int i20 = c5251.f17327;
                            int i21 = iM8886 >> 3;
                            int i22 = (iM8886 & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iM8886 - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        c4913.m8320(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m4282() {
        this.f7375 = Integer.MAX_VALUE;
        this.f7381 = Integer.MIN_VALUE;
        this.f7380 = 0;
        this.f7382 = 0;
        this.f7378 = false;
        this.f7377.m8890();
        this.f7372.m8314();
        C4912 c4912 = this.f7374;
        long[] jArr = c4912.f18948;
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
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = c4912.f18947[i4];
                        List list = (List) c4912.f18945[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((InterfaceC5841) list.get(i6)).cancel();
                        }
                        c4912.m8317(i4);
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

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
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
    /* JADX INFO: renamed from: ۥۗ */
    public final void m4283(C2808 c2808, int i, int i2) {
        int i3;
        int i4;
        C4912 c4912 = this.f7372;
        C3612 c3612 = (C3612) c4912.m9571(i);
        C4992 c4992 = C3612.f12031;
        if (c3612 != null) {
            c3612.f12032 = i2;
            c3612.f12033 = c4992;
        } else {
            c3612 = new C3612();
            c3612.f12033 = c4992;
            c3612.f12032 = i2;
        }
        c4912.m8319(i, c3612);
        if (i > this.f7381) {
            this.f7381 = i;
            this.f7382 -= i2;
        } else if (i < this.f7375) {
            this.f7375 = i;
            this.f7380 -= i2;
        }
        int i5 = 1;
        if (Math.signum(this.f7373) <= 0.0f) {
            if (this.f7382 > 0) {
                i3 = this.f7381 + 1;
                i4 = i3;
            } else {
                i4 = -1;
            }
        } else if (Math.signum(this.f7373) <= 0.0f || this.f7380 <= 0) {
            i4 = -1;
        } else {
            i3 = this.f7375 - 1;
            i4 = i3;
        }
        if (i4 > 0 && i4 != -1 && i4 < this.f7379) {
            C4919 c4919 = new C4919(this, c2808, i5);
            C2257 c2257 = (C2257) c2808.f9376;
            if (c2257 == null) {
                c2257 = null;
            }
            long j = c2257.f7497;
            C2750 c2750 = (C2750) c2808.f9377;
            this.f7374.m8319(i4, Collections.singletonList((c2750 != null ? c2750 : null).m5109(i4, j, true, new C0079(27, c4919, c2808))));
        }
        m4286();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m4284(C2808 c2808, int i, boolean z) {
        List list;
        List list2;
        C4912 c4912 = this.f7372;
        if (c4912.m9572(i)) {
            return ((C3612) c4912.m9571(i)).f12032;
        }
        C4912 c4913 = this.f7374;
        int i2 = 0;
        if (c4913.m9572(i)) {
            if (!z || (list2 = (List) c4913.m9571(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((InterfaceC5841) list2.get(i2)).mo928();
                i2++;
            }
            return -1;
        }
        C4919 c4919 = new C4919(this, c2808, i2);
        C2257 c2257 = (C2257) c2808.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        long j = c2257.f7497;
        C2750 c2750 = (C2750) c2808.f9377;
        c4913.m8319(i, Collections.singletonList((c2750 != null ? c2750 : null).m5109(i, j, true, new C0079(27, c4919, c2808))));
        if (!z || (list = (List) c4913.m9571(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((InterfaceC5841) list.get(i2)).mo928();
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4285(float f, C2257 c2257) {
        C2228 c2228;
        int i;
        int i2;
        C2808 c2808 = this.f7385;
        c2808.f9376 = c2257;
        c2808.f9377 = this.f7384;
        float f2 = -f;
        m4286();
        if (c2808.m5339()) {
            C2257 c2258 = (C2257) c2808.f9376;
            if (c2258 == null) {
                c2258 = null;
            }
            AbstractC0993.m2143(c2258);
            C2257 c2259 = (C2257) c2808.f9376;
            if (c2259 == null) {
                c2259 = null;
            }
            InterfaceC2880 interfaceC2880 = c2259.f7489;
            this.f7379 = c2808.m5358();
            int iM5359 = c2808.m5359();
            int iM5340 = c2808.m5340();
            int iM5358 = c2808.m5358();
            int iM5342 = c2808.m5342();
            int iM5336 = c2808.m5336();
            C4912 c4912 = this.f7372;
            if (f2 <= 0.0f) {
                this.f7380 = 0 - iM5342;
                this.f7375 = iM5359;
                while (this.f7380 > 0 && (i2 = this.f7375) > 0 && c4912.m9572(i2 - 1)) {
                    int i3 = ((C3612) c4912.m9571(this.f7375 - 1)).f12032;
                    this.f7375--;
                    this.f7380 -= i3;
                }
                m4281(0, this.f7375 - 1);
            } else {
                this.f7382 = 0 - iM5336;
                this.f7381 = iM5340;
                while (this.f7382 > 0 && (i = this.f7381) < iM5358 - 1 && c4912.m9572(i + 1)) {
                    int i4 = ((C3612) c4912.m9571(this.f7381 + 1)).f12032;
                    this.f7381++;
                    this.f7382 -= i4;
                }
                m4281(this.f7381 + 1, iM5358 - 1);
            }
        }
        if (c2808.m5339()) {
            C2257 c22510 = (C2257) c2808.f9376;
            if (c22510 == null) {
                c22510 = null;
            }
            AbstractC0993.m2143(c22510);
            C2257 c22511 = (C2257) c2808.f9376;
            c2228 = this;
            c2228.m4280(c2808, c2808.m5359(), c2808.m5340(), (c22511 != null ? c22511 : null).f7489 != null ? ((AbstractC0631) this.f7376.f10451).f2362 : 0, c2808.m5336(), c2808.m5342(), f2, f2 <= 0.0f);
        } else {
            c2228 = this;
        }
        c2228.f7373 = f2;
        c2228.m4286();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m4286() {
        AbstractC2765.m5128(this.f7380, "prefetchWindowStartExtraSpace");
        AbstractC2765.m5128(this.f7382, "prefetchWindowEndExtraSpace");
        AbstractC2765.m5128(this.f7375, "prefetchWindowStartIndex");
        AbstractC2765.m5128(this.f7381, "prefetchWindowEndIndex");
    }
}
