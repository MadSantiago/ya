package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦًۢٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5570 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C5570 f18392 = new C5570(0, 0, 0, null);

    /* JADX INFO: renamed from: ۥْ */
    public final long f18393;

    /* JADX INFO: renamed from: ۥٓ */
    public final long[] f18394;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f18395;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f18396;

    public C5570(long j, long j2, long j3, long[] jArr) {
        this.f18396 = j;
        this.f18395 = j2;
        this.f18393 = j3;
        this.f18394 = jArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0949.m1924(new C4920(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m9397(long j) {
        long[] jArr;
        long j2 = j - this.f18393;
        if (AbstractC3831.m6844(j2, 0L) >= 0 && AbstractC3831.m6844(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f18395) != 0;
        }
        if (AbstractC3831.m6844(j2, 64L) < 0 || AbstractC3831.m6844(j2, 128L) >= 0) {
            return AbstractC3831.m6844(j2, 0L) <= 0 && (jArr = this.f18394) != null && AbstractC4593.m7978(j, jArr) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.f18396) != 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C5570 m9398(C5570 c5570) {
        C5570 c5570M9401;
        long[] jArr;
        C5570 c5570M9402 = this;
        C5570 c5571 = f18392;
        if (c5570 == c5571) {
            return c5570M9402;
        }
        if (c5570M9402 == c5571) {
            return c5570;
        }
        long j = c5570.f18393;
        long j2 = c5570.f18393;
        long[] jArr2 = c5570.f18394;
        long j3 = c5570.f18395;
        long j4 = c5570.f18396;
        long j5 = c5570M9402.f18393;
        long j6 = c5570M9402.f18395;
        long j7 = c5570M9402.f18396;
        if (j == j5 && jArr2 == (jArr = c5570M9402.f18394)) {
            return new C5570(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = c5570M9402.f18394;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c5570M9402 = c5570M9402.m9401(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c5570M9402 = c5570M9402.m9401(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c5570M9402 = c5570M9402.m9401(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return c5570M9402;
        }
        if (jArr3 != null) {
            c5570M9401 = c5570;
            for (long j9 : jArr3) {
                c5570M9401 = c5570M9401.m9401(j9);
            }
        } else {
            c5570M9401 = c5570;
        }
        long j10 = c5570M9402.f18393;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c5570M9401 = c5570M9401.m9401(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c5570M9401 = c5570M9401.m9401(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return c5570M9401;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C5570 m9399(C5570 c5570) {
        long[] jArr;
        C5570 c5570M9400 = this;
        C5570 c5571 = f18392;
        if (c5570 == c5571) {
            return c5570M9400;
        }
        if (c5570M9400 == c5571) {
            return c5571;
        }
        long j = c5570.f18393;
        long j2 = c5570.f18393;
        long[] jArr2 = c5570.f18394;
        long j3 = c5570.f18395;
        long j4 = c5570.f18396;
        long j5 = c5570M9400.f18393;
        if (j == j5 && jArr2 == (jArr = c5570M9400.f18394)) {
            return new C5570(c5570M9400.f18396 & (~j4), c5570M9400.f18395 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c5570M9400 = c5570M9400.m9400(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c5570M9400 = c5570M9400.m9400(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c5570M9400 = c5570M9400.m9400(((long) i2) + j2 + 64);
                }
            }
        }
        return c5570M9400;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C5570 m9400(long j) {
        long[] jArr;
        int iM7978;
        long[] jArr2;
        long j2 = j - this.f18393;
        if (AbstractC3831.m6844(j2, 0L) >= 0 && AbstractC3831.m6844(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f18395;
            if ((j4 & j3) != 0) {
                return new C5570(this.f18396, j4 & (~j3), this.f18393, this.f18394);
            }
        } else if (AbstractC3831.m6844(j2, 64L) >= 0 && AbstractC3831.m6844(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f18396;
            if ((j6 & j5) != 0) {
                return new C5570(j6 & (~j5), this.f18395, this.f18393, this.f18394);
            }
        } else if (AbstractC3831.m6844(j2, 0L) < 0 && (jArr = this.f18394) != null && (iM7978 = AbstractC4593.m7978(j, jArr)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM7978 > 0) {
                    AbstractC0246.m511(jArr, jArr3, 0, 0, iM7978);
                }
                if (iM7978 < i) {
                    AbstractC0246.m511(jArr, jArr3, iM7978, iM7978 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C5570(this.f18396, this.f18395, this.f18393, jArr2);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00fa  */
    /* JADX INFO: renamed from: ۦۙ */
    public final C5570 m9401(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.f18393;
        long j5 = j - j4;
        long j6 = 0;
        int iM6844 = AbstractC3831.m6844(j5, 0L);
        long j7 = this.f18395;
        if (iM6844 < 0 || AbstractC3831.m6844(j5, 64L) >= 0) {
            int iM6845 = AbstractC3831.m6844(j5, 64L);
            long j8 = this.f18396;
            int i2 = 64;
            if (iM6845 < 0 || AbstractC3831.m6844(j5, 128L) >= 0) {
                int iM6846 = AbstractC3831.m6844(j5, 128L);
                long[] jArr3 = this.f18394;
                if (iM6846 < 0) {
                    if (jArr3 == null) {
                        return new C5570(this.f18396, this.f18395, this.f18393, new long[]{j});
                    }
                    int iM7978 = AbstractC4593.m7978(j, jArr3);
                    if (iM7978 < 0) {
                        int i3 = -(iM7978 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        AbstractC0246.m511(jArr3, jArr4, 0, 0, i3);
                        AbstractC0246.m511(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new C5570(this.f18396, this.f18395, this.f18393, jArr4);
                    }
                } else if (!m9397(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (AbstractC3831.m6844(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    C1039 c1039 = null;
                    while (true) {
                        if (AbstractC3831.m6844(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (c1039 == null) {
                                c1039 = new C1039(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j7 & (1 << i4)) != j6) {
                                    ((C2741) c1039.f3672).m5092(((long) i4) + j4);
                                }
                                i4++;
                                j6 = j6;
                            }
                        } else {
                            i = i2;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i2 = i;
                        j10 = j6;
                    }
                    if (c1039 == null) {
                        jArr = jArr3;
                    } else {
                        C2741 c2741 = (C2741) c1039.f3672;
                        int i5 = c2741.f9072;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = c2741.f9073;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new C5570(j10, j3, j2, jArr).m9401(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new C5570(j8 | j12, this.f18395, this.f18393, this.f18394);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new C5570(this.f18396, j7 | j13, this.f18393, this.f18394);
            }
        }
        return this;
    }
}
