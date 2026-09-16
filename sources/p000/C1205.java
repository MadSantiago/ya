package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥْؓ٘ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1205 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C1205 f4146 = new C1205(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: ۥؗ */
    public final C3223 f4147;

    /* JADX INFO: renamed from: ۥۗ */
    public int f4148;

    /* JADX INFO: renamed from: ۥۣ */
    public int f4149;

    /* JADX INFO: renamed from: ۦؑ */
    public Object[] f4150;

    public C1205(int i, int i2, Object[] objArr, C3223 c3223) {
        this.f4149 = i;
        this.f4148 = i2;
        this.f4147 = c3223;
        this.f4150 = objArr;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C1205 m2529(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C3223 c3223) {
        if (i3 > 30) {
            return new C1205(0, 0, new Object[]{obj, obj2, obj3, obj4}, c3223);
        }
        int iM3364 = AbstractC1605.m3364(i, i3);
        int iM3365 = AbstractC1605.m3364(i2, i3);
        if (iM3364 != iM3365) {
            return new C1205((1 << iM3364) | (1 << iM3365), 0, iM3364 < iM3365 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c3223);
        }
        return new C1205(0, 1 << iM3364, new Object[]{m2529(i, obj, obj2, i2, obj3, obj4, i3 + 5, c3223)}, c3223);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m2530(Object obj) {
        C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, this.f4150.length), 2);
        int i = c1803M7940.f6006;
        int i2 = c1803M7940.f6005;
        int i3 = c1803M7940.f6004;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC3831.m6874(obj, this.f4150[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final C1205 m2531(int i) {
        return (C1205) this.f4150[i];
    }

    /* JADX INFO: renamed from: ۥُ */
    public final boolean m2532(C1205 c1205) {
        if (this == c1205) {
            return true;
        }
        if (this.f4148 != c1205.f4148 || this.f4149 != c1205.f4149) {
            return false;
        }
        int length = this.f4150.length;
        for (int i = 0; i < length; i++) {
            if (this.f4150[i] != c1205.f4150[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m2533(int i) {
        return Integer.bitCount(this.f4149 & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final C1205 m2534(C1205 c1205, C1205 c1206, int i, int i2, C3223 c3223) {
        C3223 c3224 = this.f4147;
        if (c1206 != null) {
            return (c3224 == c3223 || c1205 != c1206) ? m2535(i, c1206, c3223) : this;
        }
        Object[] objArr = this.f4150;
        if (objArr.length == 1) {
            return null;
        }
        if (c3224 != c3223) {
            return new C1205(this.f4149, this.f4148 ^ i2, AbstractC1605.m3339(i, objArr), c3223);
        }
        this.f4150 = AbstractC1605.m3339(i, objArr);
        this.f4148 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final C1205 m2535(int i, C1205 c1205, C3223 c3223) {
        Object[] objArr = this.f4150;
        if (objArr.length == 1 && c1205.f4150.length == 2 && c1205.f4148 == 0) {
            c1205.f4149 = this.f4148;
            return c1205;
        }
        if (this.f4147 == c3223) {
            objArr[i] = c1205;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c1205;
        return new C1205(this.f4149, this.f4148, objArrCopyOf, c3223);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final int m2536(int i) {
        return (this.f4150.length - 1) - Integer.bitCount(this.f4148 & (i - 1));
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final C1205 m2537(int i, int i2, C1205 c1205) {
        Object[] objArr = c1205.f4150;
        if (objArr.length != 2 || c1205.f4148 != 0) {
            Object[] objArr2 = this.f4150;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = c1205;
            return new C1205(this.f4149, this.f4148, objArrCopyOf, null);
        }
        if (this.f4150.length == 1) {
            c1205.f4149 = this.f4148;
            return c1205;
        }
        int iM2533 = m2533(i2);
        Object[] objArr3 = this.f4150;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC0246.m510(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC0246.m510(iM2533 + 2, iM2533, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM2533] = obj;
        objArrCopyOf2[iM2533 + 1] = obj2;
        return new C1205(this.f4149 ^ i2, this.f4148 ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m2538() {
        if (this.f4148 == 0) {
            return this.f4150.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f4149);
        int length = this.f4150.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m2531(i).m2538();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m2539(int i) {
        return (this.f4149 & i) != 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object[] m2540(int i, int i2, int i3, Object obj, Object obj2, int i4, C3223 c3223) {
        Object obj3 = this.f4150[i];
        C1205 c1205M2529 = m2529(obj3 != null ? obj3.hashCode() : 0, obj3, m2544(i), i3, obj, obj2, i4 + 5, c3223);
        int iM2536 = m2536(i2);
        int i5 = iM2536 + 1;
        Object[] objArr = this.f4150;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0246.m519(0, i, 6, objArr, objArr2);
        AbstractC0246.m510(i, i + 2, i5, objArr, objArr2);
        objArr2[iM2536 - 1] = c1205M2529;
        AbstractC0246.m510(iM2536, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m2541(int i, int i2, Object obj) {
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        if (m2539(iM3364)) {
            return AbstractC3831.m6874(obj, this.f4150[m2533(iM3364)]);
        }
        if (!m2546(iM3364)) {
            return false;
        }
        C1205 c1205M2531 = m2531(m2536(iM3364));
        return i2 == 30 ? c1205M2531.m2530(obj) : c1205M2531.m2541(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final C1205 m2542(int i, Object obj, Object obj2, int i2, C3881 c3881) {
        C3881 c3882;
        C1205 c1205M2542;
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        boolean zM2539 = m2539(iM3364);
        C3223 c3223 = this.f4147;
        if (zM2539) {
            int iM2533 = m2533(iM3364);
            if (!AbstractC3831.m6874(obj, this.f4150[iM2533])) {
                c3881.m6947(c3881.f12966 + 1);
                C3223 c3224 = c3881.f12971;
                if (c3223 != c3224) {
                    return new C1205(this.f4149 ^ iM3364, this.f4148 | iM3364, m2540(iM2533, iM3364, i, obj, obj2, i2, c3224), c3224);
                }
                this.f4150 = m2540(iM2533, iM3364, i, obj, obj2, i2, c3224);
                this.f4149 ^= iM3364;
                this.f4148 |= iM3364;
                return this;
            }
            c3881.f12967 = m2544(iM2533);
            if (m2544(iM2533) == obj2) {
                return this;
            }
            if (c3223 == c3881.f12971) {
                this.f4150[iM2533 + 1] = obj2;
                return this;
            }
            c3881.f12968++;
            Object[] objArr = this.f4150;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM2533 + 1] = obj2;
            return new C1205(this.f4149, this.f4148, objArrCopyOf, c3881.f12971);
        }
        if (!m2546(iM3364)) {
            c3881.m6947(c3881.f12966 + 1);
            C3223 c3225 = c3881.f12971;
            int iM2534 = m2533(iM3364);
            Object[] objArr2 = this.f4150;
            if (c3223 != c3225) {
                return new C1205(this.f4149 | iM3364, this.f4148, AbstractC1605.m3370(objArr2, iM2534, obj, obj2), c3225);
            }
            this.f4150 = AbstractC1605.m3370(objArr2, iM2534, obj, obj2);
            this.f4149 |= iM3364;
            return this;
        }
        int iM2536 = m2536(iM3364);
        C1205 c1205M2531 = m2531(iM2536);
        if (i2 == 30) {
            C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205M2531.f4150.length), 2);
            int i3 = c1803M7940.f6006;
            int i4 = c1803M7940.f6005;
            int i5 = c1803M7940.f6004;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!AbstractC3831.m6874(obj, c1205M2531.f4150[i3])) {
                        if (i3 == i4) {
                            c3881.m6947(c3881.f12966 + 1);
                            c1205M2542 = new C1205(0, 0, AbstractC1605.m3370(c1205M2531.f4150, 0, obj, obj2), c3881.f12971);
                            break;
                        }
                        i3 += i5;
                    } else {
                        c3881.f12967 = c1205M2531.m2544(i3);
                        if (c1205M2531.f4147 != c3881.f12971) {
                            c3881.f12968++;
                            Object[] objArr3 = c1205M2531.f4150;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            c1205M2542 = new C1205(0, 0, objArrCopyOf2, c3881.f12971);
                            break;
                        }
                        c1205M2531.f4150[i3 + 1] = obj2;
                        c1205M2542 = c1205M2531;
                        break;
                    }
                }
            } else {
                c3881.m6947(c3881.f12966 + 1);
                c1205M2542 = new C1205(0, 0, AbstractC1605.m3370(c1205M2531.f4150, 0, obj, obj2), c3881.f12971);
                break;
            }
            c3882 = c3881;
        } else {
            c3882 = c3881;
            c1205M2542 = c1205M2531.m2542(i, obj, obj2, i2 + 5, c3882);
        }
        return c1205M2531 == c1205M2542 ? this : m2535(iM2536, c1205M2542, c3882.f12971);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C1205 m2543(C1205 c1205, int i, C1277 c1277, C3881 c3881) {
        C1205 c1206;
        Object[] objArr;
        C1205 c1205M2529;
        if (this == c1205) {
            c1277.f4355 += m2538();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C3223 c3223 = c3881.f12971;
            int i3 = c1205.f4148;
            Object[] objArr2 = this.f4150;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c1205.f4150.length);
            int length = this.f4150.length;
            C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205.f4150.length), 2);
            int i4 = c1803M7940.f6006;
            int i5 = c1803M7940.f6005;
            int i6 = c1803M7940.f6004;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m2530(c1205.f4150[i4])) {
                        c1277.f4355++;
                    } else {
                        Object[] objArr3 = c1205.f4150;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.f4150.length) {
                if (length == c1205.f4150.length) {
                    return c1205;
                }
                return length == objArrCopyOf.length ? new C1205(0, 0, objArrCopyOf, c3223) : new C1205(0, 0, Arrays.copyOf(objArrCopyOf, length), c3223);
            }
        } else {
            int i7 = this.f4148 | c1205.f4148;
            int i8 = this.f4149;
            int i9 = c1205.f4149;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC3831.m6874(this.f4150[m2533(iLowestOneBit)], c1205.f4150[c1205.m2533(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC0371.m794("Check failed.");
            }
            if (AbstractC3831.m6874(this.f4147, c3881.f12971) && this.f4149 == i12 && this.f4148 == i7) {
                c1206 = this;
            } else {
                c1206 = new C1205(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c1206.f4150;
                int length2 = (objArr4.length - 1) - i14;
                if (m2546(iLowestOneBit2)) {
                    c1205M2529 = m2531(m2536(iLowestOneBit2));
                    if (c1205.m2546(iLowestOneBit2)) {
                        c1205M2529 = c1205M2529.m2543(c1205.m2531(c1205.m2536(iLowestOneBit2)), i + 5, c1277, c3881);
                        objArr = objArr4;
                    } else if (c1205.m2539(iLowestOneBit2)) {
                        int iM2533 = c1205.m2533(iLowestOneBit2);
                        Object obj = c1205.f4150[iM2533];
                        Object objM2544 = c1205.m2544(iM2533);
                        int i15 = c3881.f12966;
                        objArr = objArr4;
                        c1205M2529 = c1205M2529.m2542(obj != null ? obj.hashCode() : i2, obj, objM2544, i + 5, c3881);
                        if (c3881.f12966 == i15) {
                            c1277.f4355++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c1205.m2546(iLowestOneBit2)) {
                        C1205 c1205M2531 = c1205.m2531(c1205.m2536(iLowestOneBit2));
                        if (m2539(iLowestOneBit2)) {
                            int iM2534 = m2533(iLowestOneBit2);
                            Object obj2 = this.f4150[iM2534];
                            int i16 = i + 5;
                            if (c1205M2531.m2541(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                c1277.f4355++;
                                c1205M2529 = c1205M2531;
                            } else {
                                c1205M2529 = c1205M2531.m2542(obj2 != null ? obj2.hashCode() : 0, obj2, m2544(iM2534), i16, c3881);
                            }
                        } else {
                            c1205M2529 = c1205M2531;
                        }
                    } else {
                        int iM2535 = m2533(iLowestOneBit2);
                        Object obj3 = this.f4150[iM2535];
                        Object objM2545 = m2544(iM2535);
                        int iM2536 = c1205.m2533(iLowestOneBit2);
                        Object obj4 = c1205.f4150[iM2536];
                        c1205M2529 = m2529(obj3 != null ? obj3.hashCode() : 0, obj3, objM2545, obj4 != null ? obj4.hashCode() : 0, obj4, c1205.m2544(iM2536), i + 5, c3881.f12971);
                    }
                }
                objArr[length2] = c1205M2529;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c1205.m2539(iLowestOneBit3)) {
                    int iM2537 = c1205.m2533(iLowestOneBit3);
                    Object[] objArr5 = c1206.f4150;
                    objArr5[i18] = c1205.f4150[iM2537];
                    objArr5[i18 + 1] = c1205.m2544(iM2537);
                    if (m2539(iLowestOneBit3)) {
                        c1277.f4355++;
                    }
                } else {
                    int iM2538 = m2533(iLowestOneBit3);
                    Object[] objArr6 = c1206.f4150;
                    objArr6[i18] = this.f4150[iM2538];
                    objArr6[i18 + 1] = m2544(iM2538);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m2532(c1206)) {
                return c1205.m2532(c1206) ? c1205 : c1206;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final Object m2544(int i) {
        return this.f4150[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f1178 = m2537(r7, r2, (p000.C1205) r14.f1178);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: ۦٗ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C0322 m2545(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1205.m2545(int, int, java.lang.Object, java.lang.Object):ۥٍؓؕٛ");
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m2546(int i) {
        return (this.f4148 & i) != 0;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final C1205 m2547(int i, C3881 c3881) {
        c3881.m6947(c3881.f12966 - 1);
        c3881.f12967 = m2544(i);
        Object[] objArr = this.f4150;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4147 != c3881.f12971) {
            return new C1205(0, 0, AbstractC1605.m3365(i, objArr), c3881.f12971);
        }
        this.f4150 = AbstractC1605.m3365(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final Object m2548(int i, int i2, Object obj) {
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        if (m2539(iM3364)) {
            int iM2533 = m2533(iM3364);
            if (AbstractC3831.m6874(obj, this.f4150[iM2533])) {
                return m2544(iM2533);
            }
            return null;
        }
        if (!m2546(iM3364)) {
            return null;
        }
        C1205 c1205M2531 = m2531(m2536(iM3364));
        if (i2 != 30) {
            return c1205M2531.m2548(i, i2 + 5, obj);
        }
        C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205M2531.f4150.length), 2);
        int i3 = c1803M7940.f6006;
        int i4 = c1803M7940.f6005;
        int i5 = c1803M7940.f6004;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC3831.m6874(obj, c1205M2531.f4150[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return c1205M2531.m2544(i3);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final C1205 m2549(int i, Object obj, int i2, C3881 c3881) {
        C1205 c1205M2549;
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        if (m2539(iM3364)) {
            int iM2533 = m2533(iM3364);
            if (AbstractC3831.m6874(obj, this.f4150[iM2533])) {
                return m2551(iM2533, iM3364, c3881);
            }
        } else if (m2546(iM3364)) {
            int iM2536 = m2536(iM3364);
            C1205 c1205M2531 = m2531(iM2536);
            if (i2 == 30) {
                C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205M2531.f4150.length), 2);
                int i3 = c1803M7940.f6006;
                int i4 = c1803M7940.f6005;
                int i5 = c1803M7940.f6004;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC3831.m6874(obj, c1205M2531.f4150[i3])) {
                            if (i3 == i4) {
                                c1205M2549 = c1205M2531;
                                break;
                            }
                            i3 += i5;
                        } else {
                            c1205M2549 = c1205M2531.m2547(i3, c3881);
                            break;
                        }
                    }
                } else {
                    c1205M2549 = c1205M2531;
                    break;
                }
            } else {
                c1205M2549 = c1205M2531.m2549(i, obj, i2 + 5, c3881);
            }
            return m2534(c1205M2531, c1205M2549, iM2536, iM3364, c3881.f12971);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final C1205 m2550(int i, int i2, Object obj) {
        C1205 c1205M2550;
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        if (m2539(iM3364)) {
            int iM2533 = m2533(iM3364);
            if (!AbstractC3831.m6874(obj, this.f4150[iM2533])) {
                return this;
            }
            Object[] objArr = this.f4150;
            if (objArr.length != 2) {
                return new C1205(this.f4149 ^ iM3364, this.f4148, AbstractC1605.m3365(iM2533, objArr), null);
            }
        } else {
            if (!m2546(iM3364)) {
                return this;
            }
            int iM2536 = m2536(iM3364);
            C1205 c1205M2531 = m2531(iM2536);
            if (i2 == 30) {
                C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205M2531.f4150.length), 2);
                int i3 = c1803M7940.f6006;
                int i4 = c1803M7940.f6005;
                int i5 = c1803M7940.f6004;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!AbstractC3831.m6874(obj, c1205M2531.f4150[i3])) {
                            if (i3 == i4) {
                                c1205M2550 = c1205M2531;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = c1205M2531.f4150;
                            if (objArr2.length != 2) {
                                c1205M2550 = new C1205(0, 0, AbstractC1605.m3365(i3, objArr2), null);
                                break;
                            }
                            c1205M2550 = null;
                            break;
                        }
                    }
                } else {
                    c1205M2550 = c1205M2531;
                    break;
                }
            } else {
                c1205M2550 = c1205M2531.m2550(i, i2 + 5, obj);
            }
            if (c1205M2550 != null) {
                return c1205M2531 != c1205M2550 ? m2537(iM2536, iM3364, c1205M2550) : this;
            }
            Object[] objArr3 = this.f4150;
            if (objArr3.length != 1) {
                return new C1205(this.f4149, this.f4148 ^ iM3364, AbstractC1605.m3339(iM2536, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1205 m2551(int i, int i2, C3881 c3881) {
        c3881.m6947(c3881.f12966 - 1);
        c3881.f12967 = m2544(i);
        Object[] objArr = this.f4150;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f4147 != c3881.f12971) {
            return new C1205(i2 ^ this.f4149, this.f4148, AbstractC1605.m3365(i, objArr), c3881.f12971);
        }
        this.f4150 = AbstractC1605.m3365(i, objArr);
        this.f4149 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final C1205 m2552(int i, Object obj, Object obj2, int i2, C3881 c3881) {
        C3881 c3882;
        C1205 c1205M2552;
        int iM3364 = 1 << AbstractC1605.m3364(i, i2);
        if (m2539(iM3364)) {
            int iM2533 = m2533(iM3364);
            return (AbstractC3831.m6874(obj, this.f4150[iM2533]) && AbstractC3831.m6874(obj2, m2544(iM2533))) ? m2551(iM2533, iM3364, c3881) : this;
        }
        if (!m2546(iM3364)) {
            return this;
        }
        int iM2536 = m2536(iM3364);
        C1205 c1205M2531 = m2531(iM2536);
        if (i2 == 30) {
            C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, c1205M2531.f4150.length), 2);
            int i3 = c1803M7940.f6006;
            int i4 = c1803M7940.f6005;
            int i5 = c1803M7940.f6004;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!AbstractC3831.m6874(obj, c1205M2531.f4150[i3]) || !AbstractC3831.m6874(obj2, c1205M2531.m2544(i3))) {
                        if (i3 == i4) {
                            c1205M2552 = c1205M2531;
                            break;
                        }
                        i3 += i5;
                    } else {
                        c1205M2552 = c1205M2531.m2547(i3, c3881);
                        break;
                    }
                }
            } else {
                c1205M2552 = c1205M2531;
                break;
            }
            c3882 = c3881;
        } else {
            c3882 = c3881;
            c1205M2552 = c1205M2531.m2552(i, obj, obj2, i2 + 5, c3882);
        }
        return m2534(c1205M2531, c1205M2552, iM2536, iM3364, c3882.f12971);
    }
}
