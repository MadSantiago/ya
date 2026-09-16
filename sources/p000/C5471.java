package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: ۦُۡؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5471 {

    /* JADX INFO: renamed from: ۥؗ */
    public C1254 f18038;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f18041;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f18043;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f18047;

    /* JADX INFO: renamed from: ۦۗ */
    public int f18049;

    /* JADX INFO: renamed from: ۦؑ */
    public int f18044 = -1;

    /* JADX INFO: renamed from: ۥُ */
    public final C3262 f18039 = AbstractC4225.m7437();

    /* JADX INFO: renamed from: ۥّ */
    public final C3262 f18040 = new C3262();

    /* JADX INFO: renamed from: ۦۙ */
    public final C3639 f18050 = new C3639();

    /* JADX INFO: renamed from: ۥۜ */
    public final C0863 f18042 = new C0863(new C5704[16]);

    /* JADX INFO: renamed from: ۦٛ */
    public final C1913 f18048 = new C1913(1, this);

    /* JADX INFO: renamed from: ۦؚ */
    public final C3262 f18045 = AbstractC4225.m7437();

    /* JADX INFO: renamed from: ۦٌ */
    public final HashMap f18046 = new HashMap();

    public C5471(InterfaceC4745 interfaceC4745) {
        this.f18043 = interfaceC4745;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9163(Object obj, Object obj2) {
        C3262 c3262 = this.f18039;
        AbstractC4225.m7459(c3262, obj2, obj);
        if (!(obj2 instanceof C5704) || c3262.m6015(obj2)) {
            return;
        }
        AbstractC4225.m7492(this.f18045, obj2);
        this.f18046.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m9164(Object obj, int i, Object obj2, C1254 c1254) {
        int i2;
        if (this.f18049 > 0) {
            return;
        }
        int iM2649 = c1254.m2649(obj);
        if (iM2649 < 0) {
            iM2649 = ~iM2649;
            i2 = -1;
        } else {
            i2 = c1254.f4315[iM2649];
        }
        c1254.f4318[iM2649] = obj;
        c1254.f4315[iM2649] = i;
        if ((obj instanceof C5704) && i2 != i) {
            C5683 c5683M9522 = ((C5704) obj).m9522();
            this.f18046.put(obj, c5683M9522.f18683);
            C1254 c1255 = c5683M9522.f18682;
            C3262 c3262 = this.f18045;
            AbstractC4225.m7492(c3262, obj);
            Object[] objArr = c1255.f4318;
            long[] jArr = c1255.f4319;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                InterfaceC0622 interfaceC0622 = (InterfaceC0622) objArr[(i3 << 3) + i5];
                                if (interfaceC0622 instanceof AbstractC2975) {
                                    ((AbstractC2975) interfaceC0622).m5525(2);
                                }
                                AbstractC4225.m7449(c3262, interfaceC0622, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof AbstractC2975) {
                ((AbstractC2975) obj).m5525(2);
            }
            AbstractC4225.m7449(this.f18039, obj, obj2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m9165(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5471.m9165(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009c A[LOOP:2: B:16:0x0061->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[EDGE_INSN: B:48:0x00ab->B:30:0x00ab BREAK  A[LOOP:2: B:16:0x0061->B:28:0x009c], SYNTHETIC] */
    /* JADX INFO: renamed from: ۦؑ */
    public final void m9166() {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        C3262 c3262 = this.f18040;
        long[] jArr3 = c3262.f10948;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = c3262.f10947[i6];
                        j2 = j4;
                        C1254 c1254 = (C1254) c3262.f10944[i6];
                        boolean zMo1315 = ((InterfaceC3979) obj).mo1315();
                        if (zMo1315) {
                            jArr2 = jArr3;
                            j = j3;
                            z = zMo1315;
                        } else {
                            Object[] objArr = c1254.f4318;
                            int[] iArr = c1254.f4315;
                            long[] jArr4 = c1254.f4319;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    z = zMo1315;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        zMo1315 = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m9163(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        zMo1315 = z;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                                z = zMo1315;
                            }
                        }
                        if (!z) {
                            c3262.m6022(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
