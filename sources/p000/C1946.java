package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٞؔۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1946 implements InterfaceC5601 {

    /* JADX INFO: renamed from: ۥؓ */
    public final C3262 f6415;

    /* JADX INFO: renamed from: ۥؖ */
    public final C4773 f6416;

    /* JADX INFO: renamed from: ۥً */
    public boolean f6417;

    /* JADX INFO: renamed from: ۥَ */
    public final C4657 f6418;

    /* JADX INFO: renamed from: ۥْ */
    public final AtomicReference f6419 = new AtomicReference(null);

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f6420 = new Object();

    /* JADX INFO: renamed from: ۥٕ */
    public C2166 f6421;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2575 f6422;

    /* JADX INFO: renamed from: ۥٙ */
    public final C4773 f6423;

    /* JADX INFO: renamed from: ۥۖ */
    public final C3639 f6424;

    /* JADX INFO: renamed from: ۥۙ */
    public C1946 f6425;

    /* JADX INFO: renamed from: ۥۦ */
    public final C0175 f6426;

    /* JADX INFO: renamed from: ۥۧ */
    public C3262 f6427;

    /* JADX INFO: renamed from: ۦؖ */
    public final C4228 f6428;

    /* JADX INFO: renamed from: ۦؗ */
    public final C5362 f6429;

    /* JADX INFO: renamed from: ۦؙ */
    public int f6430;

    /* JADX INFO: renamed from: ۦُ */
    public int f6431;

    /* JADX INFO: renamed from: ۦٕ */
    public final C3262 f6432;

    /* JADX INFO: renamed from: ۦٗ */
    public final C3262 f6433;

    /* JADX INFO: renamed from: ۦٚ */
    public InterfaceC0557 f6434;

    /* JADX INFO: renamed from: ۦۛ */
    public final C3639 f6435;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1326 f6436;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC2109 f6437;

    public C1946(AbstractC2109 abstractC2109, C1326 c1326) {
        this.f6437 = abstractC2109;
        this.f6436 = c1326;
        C4657 c4657 = new C4657(new C3639());
        this.f6418 = c4657;
        C2575 c2575 = new C2575();
        if (abstractC2109.mo1003()) {
            c2575.f8597 = new C4912();
        }
        if (abstractC2109.mo992()) {
            c2575.m4875();
        }
        this.f6422 = c2575;
        this.f6433 = AbstractC4225.m7437();
        this.f6435 = new C3639();
        this.f6424 = new C3639();
        this.f6432 = AbstractC4225.m7437();
        C4773 c4773 = new C4773();
        this.f6423 = c4773;
        C4773 c4774 = new C4773();
        this.f6416 = c4774;
        this.f6415 = AbstractC4225.m7437();
        this.f6427 = AbstractC4225.m7437();
        C4228 c4228 = new C4228(11, abstractC2109);
        this.f6428 = c4228;
        this.f6426 = new C0175(0);
        C5362 c5362 = new C5362(c1326, abstractC2109, AbstractC3809.m6812(c2575), c4657, c4773, c4774, c4228, this);
        abstractC2109.mo4094(c5362);
        this.f6429 = c5362;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m3809(InterfaceC5731 interfaceC5731) {
        boolean zM3829 = m3829();
        m3815();
        AbstractC2109 abstractC2109 = this.f6437;
        if (!zM3829) {
            abstractC2109.mo1000(this, interfaceC5731);
            return;
        }
        C5362 c5362 = this.f6429;
        c5362.f17644 = 0;
        c5362.f17655 = true;
        abstractC2109.mo1000(this, interfaceC5731);
        c5362.m8960();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: ۥؖ */
    public final void m3810(Object obj) {
        synchronized (this.f6420) {
            try {
                m3828(obj);
                Object objM6027 = this.f6432.m6027(obj);
                if (objM6027 != null) {
                    if (objM6027 instanceof C3639) {
                        C3639 c3639 = (C3639) objM6027;
                        Object[] objArr = c3639.f12174;
                        long[] jArr = c3639.f12175;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m3828((C5704) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
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
                    } else {
                        m3828((C5704) objM6027);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m3811(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM6490;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zM6502;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof C0675;
        C3262 c3262 = this.f6432;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            C3639 c3639 = ((C0675) set).f2475;
            Object[] objArr = c3639.f12174;
            long[] jArr9 = c3639.f12175;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof C5863) {
                                    ((C5863) obj2).m9682(obj);
                                } else {
                                    m3820(obj2, z);
                                    Object objM6027 = c3262.m6027(obj2);
                                    if (objM6027 != null) {
                                        if (objM6027 instanceof C3639) {
                                            C3639 c36310 = (C3639) objM6027;
                                            Object[] objArr2 = c36310.f12174;
                                            long[] jArr10 = c36310.f12175;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                m3820((C5704) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            m3820((C5704) objM6027, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C5863) {
                    ((C5863) obj3).m9682(null);
                } else {
                    m3820(obj3, z);
                    Object objM6028 = c3262.m6027(obj3);
                    if (objM6028 != null) {
                        if (objM6028 instanceof C3639) {
                            C3639 c36311 = (C3639) objM6028;
                            Object[] objArr3 = c36311.f12174;
                            long[] jArr12 = c36311.f12175;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                m3820((C5704) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
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
                        } else {
                            m3820((C5704) objM6028, z);
                        }
                    }
                }
            }
        }
        C3262 c3263 = this.f6433;
        C3639 c36312 = this.f6435;
        if (z) {
            C3639 c36313 = this.f6424;
            if (c36313.m6494()) {
                long[] jArr13 = c3263.f10948;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = c3263.f10947[i18];
                                    Object obj5 = c3263.f10944[i18];
                                    if (obj5 instanceof C3639) {
                                        C3639 c36314 = (C3639) obj5;
                                        Object[] objArr4 = c36314.f12174;
                                        long[] jArr14 = c36314.f12175;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            C5863 c5863 = (C5863) objArr5[i22];
                                                            if (c36313.m6490(c5863) || c36312.m6490(c5863)) {
                                                                c36314.m6498(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zM6502 = c36314.m6502();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        C5863 c5864 = (C5863) obj5;
                                        zM6502 = c36313.m6490(c5864) || c36312.m6490(c5864);
                                    }
                                    if (zM6502) {
                                        c3263.m6022(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                c36313.m6493();
                m3821();
                return;
            }
        }
        if (c36312.m6494()) {
            long[] jArr16 = c3263.f10948;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = c3263.f10947[i26];
                                Object obj7 = c3263.f10944[i26];
                                if (obj7 instanceof C3639) {
                                    C3639 c36315 = (C3639) obj7;
                                    Object[] objArr6 = c36315.f12174;
                                    long[] jArr17 = c36315.f12175;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (c36312.m6490((C5863) objArr7[i30])) {
                                                            c36315.m6498(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zM6490 = c36315.m6502();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    zM6490 = c36312.m6490((C5863) obj7);
                                }
                                if (zM6490) {
                                    c3263.m6022(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            m3821();
            c36312.m6493();
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m3812(C5863 c5863, Object obj) {
        C1946 c1946;
        int i = c5863.f19363;
        if ((i & 2) != 0) {
            c5863.f19363 = i | 4;
        }
        C4356 c4356 = c5863.f19360;
        if (c4356 == null || !c4356.m7647()) {
            return 1;
        }
        C2575 c2575 = this.f6422;
        c2575.getClass();
        C4356 c4357 = c5863.f19360;
        if (c4357 != null && c2575.m4876(C4773.m8144(c4357))) {
            if (c5863.f19365 == null) {
                return 1;
            }
            int iM3817 = m3817(c5863, c4356, obj);
            if (iM3817 != 1) {
                this.f6428.m7502();
            }
            return iM3817;
        }
        synchronized (this.f6420) {
            c1946 = this.f6425;
        }
        if (c1946 != null) {
            C5362 c5362 = c1946.f6429;
            if (c5362.f17660 && c5362.m9010(c5863, obj)) {
                return 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0136 A[EDGE_INSN: B:160:0x0136->B:78:0x0136 BREAK  A[LOOP:2: B:148:0x00e9->B:76:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: all -> 0x011c, LOOP:2: B:148:0x00e9->B:76:0x012c, LOOP_END, TryCatch #7 {all -> 0x011c, blocks: (B:60:0x00e9, B:62:0x00f8, B:64:0x0102, B:66:0x0108, B:68:0x0118, B:72:0x0121, B:78:0x0136, B:86:0x0155, B:89:0x0168, B:76:0x012c, B:81:0x0140, B:95:0x0186, B:97:0x0192), top: B:148:0x00e9 }] */
    /* JADX INFO: renamed from: ۥُ */
    public final void m3813(C4773 c4773) throws Throwable {
        C0175 c0175;
        long[] jArr;
        int i;
        long[] jArr2;
        C0175 c0176;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM6502;
        long j3;
        C4773 c4774 = this.f6416;
        C5362 c5362 = this.f6429;
        C2805 c2805M8955 = c5362.m8955();
        C0175 c0177 = this.f6426;
        c0177.m373(this.f6418, c2805M8955);
        try {
            if (c4773.f15736.m451()) {
                try {
                    if (c4774.f15736.m451() && this.f6421 == null) {
                        c0177.m367();
                    }
                    return;
                } finally {
                    c0177.m370();
                }
            }
            C2166 c2166 = this.f6421;
            InterfaceC4790 interfaceC4790 = c2166 != null ? c2166.f7152 : this.f6436;
            try {
                Trace.beginSection(interfaceC4790.equals(c2166 != null ? c2166.f7152 : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C2166 c2167 = this.f6421;
                    C0175 c0178 = c2167 != null ? c2167.f7155 : c0177;
                    C2575 c2575 = this.f6422;
                    C2805 c2805M8956 = c5362.m8955();
                    C0126 c0126M4872 = AbstractC3809.m6812(c2575).m4872();
                    int i3 = 0;
                    try {
                        c4773.m8158(interfaceC4790, c0126M4872, c0178, c2805M8956);
                        c0126M4872.m234(true);
                        interfaceC4790.mo2814();
                        Trace.endSection();
                        c0177.m372();
                        c0177.m368();
                        if (this.f6417) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f6417 = false;
                                C3262 c3262 = this.f6433;
                                long[] jArr3 = c3262.f10948;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = c3262.f10947[i8];
                                                    Object obj2 = c3262.f10944[i8];
                                                    if (obj2 instanceof C3639) {
                                                        C3639 c3639 = (C3639) obj2;
                                                        Object[] objArr = c3639.f12174;
                                                        long[] jArr4 = c3639.f12175;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c0176 = c0177;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((C5863) objArr[i13]).m9683()) {
                                                                                    c3639.m6498(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM6502 = c3639.m6502();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c0176 = c0177;
                                                        j = j4;
                                                        zM6502 = !((C5863) obj2).m9683();
                                                    }
                                                    if (zM6502) {
                                                        c3262.m6022(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    c0176 = c0177;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                c0177 = c0176;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c0175 = c0177;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c0175 = c0177;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        c0177 = c0175;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    c0175 = c0177;
                                }
                                m3821();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c0175 = c0177;
                        }
                        try {
                            if (c4774.f15736.m451() && this.f6421 == null) {
                                c0175.m367();
                            }
                            return;
                        } finally {
                            c0175.m370();
                        }
                    } catch (Throwable th3) {
                        try {
                            c0126M4872.m234(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c4774.f15736.m451() && this.f6421 == null) {
                c0177.m367();
            }
            throw th;
        } finally {
            c0177.m370();
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3814() {
        synchronized (this.f6420) {
            try {
                C4773 c4773 = this.f6416;
                c4773.getClass();
                if (!c4773.f15736.m451()) {
                    m3813(this.f6416);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f6418.f15354.m6502()) {
                        C0175 c0175 = this.f6426;
                        try {
                            c0175.m373(this.f6418, this.f6429.m8955());
                            c0175.m367();
                        } finally {
                            c0175.m370();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m3822();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m3815() {
        String str;
        int i = this.f6431;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            AbstractC0371.m794(str);
        }
        if (this.f6421 == null) {
            return;
        }
        AbstractC0371.m794("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m3816(ArrayList arrayList) {
        C4657 c4657 = this.f6418;
        C5362 c5362 = this.f6429;
        if (arrayList.size() > 0) {
            ((AbstractC0210) ((C3869) arrayList.get(0)).f12915).getClass();
            AbstractC5508.m9201("Check failed");
        }
        try {
            c5362.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c5362.m8985(arrayList);
                    c5362.m9002();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                c5362.m8981();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!c4657.f15354.m6502()) {
                    C0175 c0175 = this.f6426;
                    try {
                        c0175.m373(c4657, c5362.m8955());
                        c0175.m367();
                    } finally {
                        c0175.m370();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m3822();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX INFO: renamed from: ۥٖ */
    public final int m3817(C5863 c5863, C4356 c4356, Object obj) {
        int i;
        int i2;
        synchronized (this.f6420) {
            try {
                C1946 c1946 = this.f6425;
                int i3 = 3;
                C1946 c1947 = null;
                if (c1946 != null) {
                    C2575 c2575 = this.f6422;
                    int i4 = this.f6430;
                    if (c2575.f8600) {
                        AbstractC5508.m9201("Writer is active");
                    }
                    if (i4 < 0 || i4 >= c2575.f8602) {
                        AbstractC5508.m9201("Invalid group index");
                    }
                    C4356 c4356M8144 = C4773.m8144(c4356);
                    if (c2575.m4876(c4356M8144)) {
                        int i5 = c2575.f8603[(i4 * 5) + 3] + i4;
                        int i6 = c4356M8144.f14359;
                        if (i4 > i6 || i6 >= i5) {
                            c1946 = null;
                        }
                    } else {
                        c1946 = null;
                    }
                    c1947 = c1946;
                }
                int i7 = 2;
                if (c1947 == null) {
                    C5362 c5362 = this.f6429;
                    if (c5362.f17660 && c5362.m9010(c5863, obj)) {
                        return 4;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof C5704;
                        C3262 c3262 = this.f6427;
                        if (z) {
                            Object objM6027 = c3262.m6027(c5863);
                            if (objM6027 != null) {
                                if (!(objM6027 instanceof C3639)) {
                                    i = 2;
                                    i2 = 3;
                                    if (objM6027 != C0373.f1377) {
                                        AbstractC4225.m7449(this.f6427, c5863, obj);
                                        break;
                                    }
                                } else {
                                    C3639 c3639 = (C3639) objM6027;
                                    Object[] objArr = c3639.f12174;
                                    long[] jArr = c3639.f12175;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i8];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                i = i7;
                                                int i10 = 0;
                                                while (i10 < i9) {
                                                    if ((j & 255) < 128) {
                                                        i2 = i3;
                                                        if (objArr[(i8 << 3) + i10] == C0373.f1377) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                    j >>= 8;
                                                    i10++;
                                                    i3 = i2;
                                                }
                                                i2 = i3;
                                                if (i9 == 8) {
                                                }
                                            } else {
                                                i = i7;
                                                i2 = i3;
                                            }
                                            if (i8 != length) {
                                                i8++;
                                                i7 = i;
                                                i3 = i2;
                                            }
                                        }
                                    } else {
                                        i = 2;
                                        i2 = 3;
                                    }
                                    AbstractC4225.m7449(this.f6427, c5863, obj);
                                    break;
                                }
                            } else {
                                i = 2;
                                i2 = 3;
                                AbstractC4225.m7449(this.f6427, c5863, obj);
                                break;
                            }
                        } else {
                            c3262.m6023(c5863, C0373.f1377);
                        }
                    } else {
                        this.f6427.m6023(c5863, C0373.f1377);
                    }
                    i = 2;
                    i2 = 3;
                } else {
                    i = 2;
                    i2 = 3;
                }
                if (c1947 != null) {
                    return c1947.m3817(c5863, c4356, obj);
                }
                this.f6437.mo1006(this);
                return this.f6429.f17660 ? i2 : i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: ۥٙ */
    public final void m3818(Object obj) {
        C5863 c5863M8998;
        int i;
        boolean z;
        C5362 c5362 = this.f6429;
        if (c5362.f17642 <= 0 && (c5863M8998 = c5362.m8998()) != null) {
            int i2 = c5863M8998.f19363 | 1;
            c5863M8998.f19363 = i2;
            if ((i2 & 32) == 0) {
                C1254 c1254 = c5863M8998.f19362;
                if (c1254 == null) {
                    c1254 = new C1254();
                    c5863M8998.f19362 = c1254;
                }
                int i3 = c5863M8998.f19361;
                int iM2649 = c1254.m2649(obj);
                if (iM2649 < 0) {
                    iM2649 = ~iM2649;
                    i = -1;
                } else {
                    i = c1254.f4315[iM2649];
                }
                c1254.f4318[iM2649] = obj;
                c1254.f4315[iM2649] = i3;
                if (i == c5863M8998.f19361) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.f6428.m7502();
            if (z) {
                return;
            }
            if (obj instanceof AbstractC2975) {
                ((AbstractC2975) obj).m5525(1);
            }
            AbstractC4225.m7449(this.f6433, obj, c5863M8998);
            if (obj instanceof C5704) {
                C5704 c5704 = (C5704) obj;
                C5683 c5683M9522 = c5704.m9522();
                C3262 c3262 = this.f6432;
                AbstractC4225.m7492(c3262, obj);
                C1254 c1255 = c5683M9522.f18682;
                Object[] objArr = c1255.f4318;
                long[] jArr = c1255.f4319;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    InterfaceC0622 interfaceC0622 = (InterfaceC0622) objArr[(i4 << 3) + i7];
                                    if (interfaceC0622 instanceof AbstractC2975) {
                                        ((AbstractC2975) interfaceC0622).m5525(1);
                                    }
                                    AbstractC4225.m7449(c3262, interfaceC0622, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = c5683M9522.f18683;
                C3262 c3263 = c5863M8998.f19366;
                if (c3263 == null) {
                    c3263 = new C3262();
                    c5863M8998.f19366 = c3263;
                }
                c3263.m6023(c5704, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m3819() {
        synchronized (this.f6420) {
            C2166 c2166 = this.f6421;
            boolean z = false;
            if (c2166 != null && (c2166.f7149.get() != EnumC4901.f16158 || c2166.f7154 != AbstractC3831.m6841())) {
                AtomicReference atomicReference = c2166.f7149;
                EnumC4901 enumC4901 = EnumC4901.f16161;
                EnumC4901 enumC4902 = EnumC4901.f16160;
                while (!atomicReference.compareAndSet(enumC4901, enumC4902) && atomicReference.get() == enumC4901) {
                }
                c2166.f7152.f15487.m7843(9);
                return false;
            }
            m3832();
            try {
                C3262 c3262 = this.f6427;
                this.f6427 = AbstractC4225.m7437();
                try {
                    C5362 c5362 = this.f6429;
                    InterfaceC0557 interfaceC0557 = this.f6434;
                    C0188 c0188 = c5362.f17648.f15736;
                    if (!c0188.m451()) {
                        AbstractC5508.m9201("Expected applyChanges() to have been called");
                    }
                    if (c3262.f10945 > 0 || !c5362.f17647.isEmpty()) {
                        c5362.f17654 = interfaceC0557;
                        try {
                            c5362.m9007(c3262, null);
                            c5362.f17654 = null;
                            z = !c0188.m451();
                        } catch (Throwable th) {
                            c5362.f17654 = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m3835();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f6427 = c3262;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f6418.f15354.m6502()) {
                        C0175 c0175 = this.f6426;
                        try {
                            c0175.m373(this.f6418, this.f6429.m8955());
                            c0175.m367();
                        } finally {
                            c0175.m370();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m3822();
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3820(Object obj, boolean z) {
        Object objM6027 = this.f6433.m6027(obj);
        if (objM6027 == null) {
            return;
        }
        boolean z2 = objM6027 instanceof C3639;
        C3639 c3639 = this.f6435;
        C3639 c36310 = this.f6424;
        C3262 c3262 = this.f6415;
        if (!z2) {
            C5863 c5863 = (C5863) objM6027;
            if (AbstractC4225.m7459(c3262, obj, c5863) || c5863.m9682(obj) == 1) {
                return;
            }
            if (c5863.f19366 == null || z) {
                c3639.m6495(c5863);
                return;
            } else {
                c36310.m6495(c5863);
                return;
            }
        }
        C3639 c36311 = (C3639) objM6027;
        Object[] objArr = c36311.f12174;
        long[] jArr = c36311.f12175;
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
                        C5863 c5864 = (C5863) objArr[(i << 3) + i3];
                        if (!AbstractC4225.m7459(c3262, obj, c5864) && c5864.m9682(obj) != 1) {
                            if (c5864.f19366 == null || z) {
                                c3639.m6495(c5864);
                            } else {
                                c36310.m6495(c5864);
                            }
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

    /* JADX INFO: renamed from: ۥۜ */
    public final void m3821() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM6502;
        int i4;
        int i5;
        C3262 c3262 = this.f6432;
        long[] jArr3 = c3262.f10948;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = c3262.f10947[i10];
                            Object obj2 = c3262.f10944[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof C3639;
                            j5 = j8;
                            C3262 c3263 = this.f6433;
                            if (z) {
                                C3639 c3639 = (C3639) obj2;
                                Object[] objArr = c3639.f12174;
                                long[] jArr4 = c3639.f12175;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!c3263.m6015((C5704) objArr[i15])) {
                                                        c3639.m6498(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM6502 = c3639.m6502();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                zM6502 = !c3263.m6015((C5704) obj2);
                            }
                            if (zM6502) {
                                c3262.m6022(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        C3639 c36310 = this.f6424;
        if (!c36310.m6494()) {
            return;
        }
        Object[] objArr2 = c36310.f12174;
        long[] jArr5 = c36310.f12175;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((C5863) objArr2[i20]).f19366 == null) {
                            c36310.m6498(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3822() {
        this.f6419.set(null);
        this.f6423.f15736.m453();
        this.f6416.f15736.m453();
        C4657 c4657 = this.f6418;
        if (c4657.f15354.m6502()) {
            return;
        }
        C0175 c0175 = this.f6426;
        try {
            c0175.m373(c4657, this.f6429.m8955());
            c0175.m367();
        } finally {
            c0175.m370();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3823() {
        synchronized (this.f6420) {
            try {
                m3813(this.f6423);
                m3835();
            } catch (Throwable th) {
                try {
                    if (!this.f6418.f15354.m6502()) {
                        C0175 c0175 = this.f6426;
                        try {
                            c0175.m373(this.f6418, this.f6429.m8955());
                            c0175.m367();
                        } finally {
                            c0175.m370();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m3822();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m3824() {
        synchronized (this.f6420) {
            try {
                if (this.f6421 != null) {
                    AbstractC0371.m794("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f6422.f8602 == 0;
                if (!z || !this.f6418.f15354.m6502()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C0175 c0175 = this.f6426;
                        try {
                            c0175.m373(this.f6418, this.f6429.m8955());
                            if (!z) {
                                C2575 c2575 = this.f6422;
                                C0175 c0176 = this.f6426;
                                C0126 c0126M4872 = c2575.m4872();
                                try {
                                    c0126M4872.m256(c0126M4872.f488, new C4762(8, c0176, c0126M4872));
                                    c0126M4872.m234(true);
                                    this.f6436.mo2814();
                                    c0175.m372();
                                } catch (Throwable th) {
                                    c0126M4872.m234(false);
                                    throw th;
                                }
                            }
                            c0175.m367();
                            c0175.m370();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            c0175.m370();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.f6433.m6020();
                this.f6432.m6020();
                this.f6427.m6020();
                this.f6423.f15736.m453();
                this.f6416.f15736.m453();
                C5362 c5362 = this.f6429;
                c5362.f17652.clear();
                c5362.f17647.clear();
                c5362.f17648.f15736.m453();
                c5362.f17684 = null;
                this.f6431 = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m3825() {
        synchronized (this.f6420) {
            try {
                if (this.f6429.f17660) {
                    AbstractC0371.m794("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f6431 != 3) {
                    this.f6431 = 3;
                    C4773 c4773 = this.f6429.f17677;
                    if (c4773 != null) {
                        m3813(c4773);
                    }
                    int i = 1;
                    boolean z = this.f6422.f8602 == 0;
                    if (!z || !this.f6418.f15354.m6502()) {
                        C0175 c0175 = this.f6426;
                        try {
                            c0175.m373(this.f6418, this.f6429.m8955());
                            if (!z) {
                                C2575 c2575 = this.f6422;
                                C0175 c0176 = this.f6426;
                                C0126 c0126M4872 = c2575.m4872();
                                try {
                                    c0126M4872.m256(c0126M4872.f488, new C4164(i, c0176));
                                    c0126M4872.m254();
                                    c0126M4872.m234(true);
                                    this.f6436.m2821();
                                    this.f6436.mo2814();
                                    c0175.m372();
                                } catch (Throwable th) {
                                    c0126M4872.m234(false);
                                    throw th;
                                }
                            }
                            c0175.m367();
                            c0175.m370();
                        } catch (Throwable th2) {
                            c0175.m370();
                            throw th2;
                        }
                    }
                    C5362 c5362 = this.f6429;
                    c5362.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c5362.f17659.mo4092(c5362);
                        c5362.f17652.clear();
                        c5362.f17647.clear();
                        c5362.f17648.f15736.m453();
                        c5362.f17684 = null;
                        c5362.f17663.m2821();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f6437.mo1016(this);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m3826(InterfaceC5731 interfaceC5731) {
        try {
            synchronized (this.f6420) {
                m3832();
                C3262 c3262 = this.f6427;
                this.f6427 = AbstractC4225.m7437();
                try {
                    C5362 c5362 = this.f6429;
                    InterfaceC0557 interfaceC0557 = this.f6434;
                    if (!c5362.f17648.f15736.m451()) {
                        AbstractC5508.m9201("Expected applyChanges() to have been called");
                    }
                    c5362.f17654 = interfaceC0557;
                    try {
                        c5362.m9007(c3262, interfaceC5731);
                        c5362.f17654 = null;
                    } catch (Throwable th) {
                        c5362.f17654 = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f6427 = c3262;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f6418.f15354.m6502()) {
                    C0175 c0175 = this.f6426;
                    try {
                        c0175.m373(this.f6418, this.f6429.m8955());
                        c0175.m367();
                    } finally {
                        c0175.m370();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                m3822();
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦٕ */
    public final void m3827(C0675 c0675) {
        Object obj;
        while (true) {
            Object obj2 = this.f6419.get();
            if (obj2 == null || obj2.equals(AbstractC3933.f13123)) {
                obj = c0675;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c0675};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C0178.m383(this.f6419, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c0675;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f6419;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f6420) {
                            m3835();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m3828(Object obj) {
        Object objM6027 = this.f6433.m6027(obj);
        if (objM6027 == null) {
            return;
        }
        boolean z = objM6027 instanceof C3639;
        C3262 c3262 = this.f6415;
        if (!z) {
            C5863 c5863 = (C5863) objM6027;
            if (c5863.m9682(obj) == 4) {
                AbstractC4225.m7449(c3262, obj, c5863);
                return;
            }
            return;
        }
        C3639 c3639 = (C3639) objM6027;
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
                    if ((255 & j) < 128) {
                        C5863 c5864 = (C5863) objArr[(i << 3) + i3];
                        if (c5864.m9682(obj) == 4) {
                            AbstractC4225.m7449(c3262, obj, c5864);
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

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m3829() {
        boolean z;
        synchronized (this.f6420) {
            z = true;
            if (this.f6431 != 1) {
                z = false;
            }
            if (z) {
                this.f6431 = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C2166 m3830(boolean z, InterfaceC5731 interfaceC5731) {
        if (this.f6421 != null) {
            AbstractC0371.m794("A pausable composition is in progress");
        }
        C2166 c2166 = new C2166(this, this.f6437, this.f6429, this.f6418, interfaceC5731, z, this.f6436, this.f6420);
        this.f6421 = c2166;
        return c2166;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m3831() {
        synchronized (this.f6420) {
            try {
                this.f6429.f17684 = null;
                if (!this.f6418.f15354.m6502()) {
                    C0175 c0175 = this.f6426;
                    try {
                        c0175.m373(this.f6418, this.f6429.m8955());
                        c0175.m367();
                        c0175.m370();
                    } catch (Throwable th) {
                        c0175.m370();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f6418.f15354.m6502()) {
                        C0175 c0176 = this.f6426;
                        try {
                            c0176.m373(this.f6418, this.f6429.m8955());
                            c0176.m367();
                        } finally {
                            c0176.m370();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    m3822();
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m3832() {
        Object obj = AbstractC3933.f13123;
        AtomicReference atomicReference = this.f6419;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC5508.m9200("pending composition has not been applied");
                C1078.m2274();
                return;
            }
            if (andSet instanceof Set) {
                m3811((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC5508.m9200("corrupt pendingModifications drain: " + atomicReference);
                C1078.m2274();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m3811(set, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۦۛ */
    public final boolean m3833(Set set) {
        boolean z = set instanceof C0675;
        C3262 c3262 = this.f6432;
        C3262 c3263 = this.f6433;
        if (z) {
            C3639 c3639 = ((C0675) set).f2475;
            Object[] objArr = c3639.f12174;
            long[] jArr = c3639.f12175;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (c3263.m6015(obj) || c3262.m6015(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (c3263.m6015(obj2) || c3262.m6015(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m3834() {
        C1590 c1590 = C1590.f5346;
        AtomicReference atomicReference = this.f6419;
        Object andSet = atomicReference.getAndSet(c1590);
        if (AbstractC3831.m6874(andSet, AbstractC3933.f13123) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m3811((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC5508.m9200("corrupt pendingModifications drain: " + atomicReference);
            C1078.m2274();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m3811(set, false);
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m3835() {
        AtomicReference atomicReference = this.f6419;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC3831.m6874(andSet, AbstractC3933.f13123)) {
            return;
        }
        if (andSet instanceof Set) {
            m3811((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m3811(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f6421 == null) {
                AbstractC5508.m9201("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC5508.m9200("corrupt pendingModifications drain: " + atomicReference);
            C1078.m2274();
        }
    }
}
