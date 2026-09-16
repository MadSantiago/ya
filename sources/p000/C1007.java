package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥَؕؓۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1007 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1007 f3595 = new C1007(new byte[0]);

    /* JADX INFO: renamed from: ۥْ */
    public transient String f3596;

    /* JADX INFO: renamed from: ۦ۟ */
    public transient int f3597;

    /* JADX INFO: renamed from: ۦۨ */
    public final byte[] f3598;

    public C1007(byte[] bArr) {
        this.f3598 = bArr;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m2201(C1007 c1007, C1007 c1008) {
        c1007.getClass();
        return c1007.mo2208(0, c1008.mo2204());
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static C1007 m2202(C1007 c1007, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return c1007.mo2212(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1007) {
            C1007 c1007 = (C1007) obj;
            int iMo2205 = c1007.mo2205();
            byte[] bArr = this.f3598;
            if (iMo2205 == bArr.length && c1007.mo2210(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f3597;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f3598);
        this.f3597 = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f A[EDGE_INSN: B:23:0x003f->B:178:0x01ad BREAK  A[LOOP:0: B:7:0x000e->B:239:0x000e]] */
    public String toString() {
        byte b;
        int i;
        C1007 c1007 = this;
        byte[] bArr = c1007.f3598;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM2214 = c1007.m2214();
            String strM8362 = AbstractC4981.m8362(AbstractC4981.m8362(AbstractC4981.m8362(strM2214.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM2214.length()) {
                return AbstractC5078.m8669(']', "[text=", strM8362);
            }
            return "[size=" + bArr.length + " text=" + strM8362 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c1007.mo2203() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            C1078.m2273(AbstractC3761.m6638(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            AbstractC2774.m5198(64, bArr.length);
            c1007 = new C1007(Arrays.copyOfRange(bArr, 0, 64));
        }
        sb.append(c1007.mo2203());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public String mo2203() {
        byte[] bArr = this.f3598;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC2133.f6997;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۥّ */
    public byte[] mo2204() {
        return this.f3598;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public int mo2205() {
        return this.f3598.length;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public int mo2206(byte[] bArr) {
        int iMo2205 = mo2205();
        byte[] bArr2 = this.f3598;
        for (int iMin = Math.min(iMo2205, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (C5063.m8651(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥۣ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1007 c1007) {
        int iMo2205 = mo2205();
        int iMo2206 = c1007.mo2205();
        int iMin = Math.min(iMo2205, iMo2206);
        for (int i = 0; i < iMin; i++) {
            int iMo2213 = mo2213(i) & 255;
            int iMo2214 = c1007.mo2213(i) & 255;
            if (iMo2213 != iMo2214) {
                return iMo2213 < iMo2214 ? -1 : 1;
            }
        }
        if (iMo2205 == iMo2206) {
            return 0;
        }
        return iMo2205 < iMo2206 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public int mo2208(int i, byte[] bArr) {
        byte[] bArr2 = this.f3598;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!C5063.m8651(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public C1007 mo2209() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f3598;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C1007(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public boolean mo2210(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f3598;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C5063.m8651(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public boolean mo2211(int i, C1007 c1007, int i2) {
        return c1007.mo2210(0, this.f3598, i, i2);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public C1007 mo2212(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo2205();
        }
        if (i < 0) {
            C1078.m2272("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f3598;
        if (i2 > bArr.length) {
            C1078.m2273(AbstractC3761.m6638(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i < 0) {
            C1078.m2272("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        AbstractC2774.m5198(i2, bArr.length);
        return new C1007(Arrays.copyOfRange(bArr, i, i2));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public byte mo2213(int i) {
        return this.f3598[i];
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final String m2214() {
        String str = this.f3596;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo2204(), AbstractC4637.f15306);
        this.f3596 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void mo2215(C1270 c1270, int i) {
        c1270.m2661(i, this.f3598);
    }
}
