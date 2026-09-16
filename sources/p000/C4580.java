package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦۣٚؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4580 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4444 f15111;

    /* JADX INFO: renamed from: ۥُ */
    public final float f15112;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3176 f15113;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f15114;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC1291 f15115;

    public C4580(boolean z, C3176 c3176, C4444 c4444, InterfaceC1291 interfaceC1291, float f) {
        this.f15114 = z;
        this.f15113 = c3176;
        this.f15111 = c4444;
        this.f15115 = interfaceC1291;
        this.f15112 = f;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m7949(List list, int i, InterfaceC5731 interfaceC5731) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj7), "TextField")) {
                int iIntValue = ((Number) interfaceC5731.mo219(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                InterfaceC1827 interfaceC1827 = (InterfaceC1827) obj2;
                int iIntValue2 = interfaceC1827 != null ? ((Number) interfaceC5731.mo219(interfaceC1827, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                InterfaceC1827 interfaceC1828 = (InterfaceC1827) obj3;
                int iIntValue3 = interfaceC1828 != null ? ((Number) interfaceC5731.mo219(interfaceC1828, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC1827 interfaceC1829 = (InterfaceC1827) obj4;
                int iIntValue4 = interfaceC1829 != null ? ((Number) interfaceC5731.mo219(interfaceC1829, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC1827 interfaceC18210 = (InterfaceC1827) obj5;
                int iIntValue5 = interfaceC18210 != null ? ((Number) interfaceC5731.mo219(interfaceC18210, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC1827 interfaceC18211 = (InterfaceC1827) obj6;
                int iIntValue6 = interfaceC18211 != null ? ((Number) interfaceC5731.mo219(interfaceC18211, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC1827 interfaceC18212 = (InterfaceC1827) obj;
                int i9 = iIntValue4 + iIntValue5;
                return AbstractC0671.m1502(AbstractC0671.m1494(0, 0, 0, 0, 15), Math.max(iIntValue + i9, Math.max((interfaceC18212 != null ? ((Number) interfaceC5731.mo219(interfaceC18212, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3);
            }
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final int m7950(C4580 c4580, int i, int i2, AbstractC0275 abstractC0275) {
        return c4580.f15114 ? Math.round(((i - abstractC0275.f984) / 2.0f) * 1.0f) : i2;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        return m7949(list, i, new C5338(11));
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        return m7952(interfaceC0151, list, i, new C5338(13));
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        return m7952(interfaceC0151, list, i, new C5338(12));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7951(InterfaceC2880 interfaceC2880, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        InterfaceC1291 interfaceC1291 = this.f15115;
        int iMo743 = interfaceC2880.mo743(interfaceC1291.mo1100() + interfaceC1291.mo1103());
        int[] iArr = {i7, i5, i6, AbstractC4593.m7975(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return AbstractC0671.m1493(j, Math.max(i3, Math.max(i4, iMo743 + (i2 > 0 ? Math.max(interfaceC2880.mo743(this.f15112 * 2.0f), AbstractC4593.m7975(AbstractC4546.f15023.mo1642(f), 0, i2)) : 0) + i)) + i8);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m7952(InterfaceC0151 interfaceC0151, List list, int i, InterfaceC5731 interfaceC5731) {
        Object obj;
        int i2;
        int iIntValue;
        int iM9262;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj), "Leading")) {
                break;
            }
            i5++;
        }
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) obj;
        if (interfaceC1827 != null) {
            i2 = i;
            iM9262 = AbstractC5537.m9262(i2, interfaceC1827.mo3599(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC5731.mo219(interfaceC1827, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iM9262 = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) obj2;
        if (interfaceC1828 != null) {
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1828.mo3599(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC5731.mo219(interfaceC1828, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (InterfaceC1827) obj3;
        int iIntValue3 = obj8 != null ? ((Number) interfaceC5731.mo219(obj8, Integer.valueOf(iM9262))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        InterfaceC1827 interfaceC1829 = (InterfaceC1827) obj4;
        if (interfaceC1829 != null) {
            int iIntValue4 = ((Number) interfaceC5731.mo219(interfaceC1829, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1829.mo3599(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        InterfaceC1827 interfaceC18210 = (InterfaceC1827) obj5;
        if (interfaceC18210 != null) {
            int iIntValue5 = ((Number) interfaceC5731.mo219(interfaceC18210, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC18210.mo3599(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC5731.mo219(obj9, Integer.valueOf(iM9262))).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (InterfaceC1827) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC5731.mo219(obj10, Integer.valueOf(iM9262))).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i12);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                Object obj11 = (InterfaceC1827) obj7;
                return m7951(interfaceC0151, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj11 != null ? ((Number) interfaceC5731.mo219(obj11, Integer.valueOf(i2))).intValue() : 0, AbstractC0671.m1494(0, 0, 0, 0, 15), this.f15111.mo1657());
            }
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return 0;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        return m7949(list, i, new C5338(10));
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(final InterfaceC2427 interfaceC2427, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        AbstractC0275 abstractC0275;
        int i2;
        AbstractC0275 abstractC0276;
        int i3;
        float f;
        int i4;
        int i5;
        float fMo1657 = this.f15111.mo1657();
        InterfaceC1291 interfaceC1291 = this.f15115;
        final int iMo743 = interfaceC2427.mo743(interfaceC1291.mo1103());
        int iMo744 = interfaceC2427.mo743(interfaceC1291.mo1100());
        long jM6550 = C3693.m6550(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj), "Leading")) {
                break;
            }
            i6++;
        }
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) obj;
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827 != null ? interfaceC1827.mo3597(jM6550) : null;
        int i7 = abstractC0275Mo3597 != null ? abstractC0275Mo3597.f985 : 0;
        int iMax = Math.max(0, abstractC0275Mo3597 != null ? abstractC0275Mo3597.f984 : 0);
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i8);
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) obj2;
        AbstractC0275 abstractC0275Mo3598 = interfaceC1828 != null ? interfaceC1828.mo3597(AbstractC0671.m1499(-i7, 0, 2, jM6550)) : null;
        int i9 = i7 + (abstractC0275Mo3598 != null ? abstractC0275Mo3598.f985 : 0);
        int iMax2 = Math.max(iMax, abstractC0275Mo3598 != null ? abstractC0275Mo3598.f984 : 0);
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        InterfaceC1827 interfaceC1829 = (InterfaceC1827) obj3;
        AbstractC0275 abstractC0275Mo3599 = interfaceC1829 != null ? interfaceC1829.mo3597(AbstractC0671.m1499(-i9, 0, 2, jM6550)) : null;
        int i11 = (abstractC0275Mo3599 != null ? abstractC0275Mo3599.f985 : 0) + i9;
        int iMax3 = Math.max(iMax2, abstractC0275Mo3599 != null ? abstractC0275Mo3599.f984 : 0);
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj4), "Suffix")) {
                break;
            }
            i12++;
        }
        InterfaceC1827 interfaceC18210 = (InterfaceC1827) obj4;
        AbstractC0275 abstractC0275Mo35910 = interfaceC18210 != null ? interfaceC18210.mo3597(AbstractC0671.m1499(-i11, 0, 2, jM6550)) : null;
        int i13 = i11 + (abstractC0275Mo35910 != null ? abstractC0275Mo35910.f985 : 0);
        int iMax4 = Math.max(iMax3, abstractC0275Mo35910 != null ? abstractC0275Mo35910.f984 : 0);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            int i15 = size5;
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj5), "Label")) {
                break;
            }
            i14++;
            size5 = i15;
        }
        InterfaceC1827 interfaceC18211 = (InterfaceC1827) obj5;
        final C5450 c5450 = new C5450();
        int i16 = -i13;
        c5450.f17965 = interfaceC18211 != null ? interfaceC18211.mo3597(AbstractC0671.m1500(i16, -iMo744, jM6550)) : null;
        int size6 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                i = iMo744;
                obj6 = null;
                break;
            }
            obj6 = list.get(i17);
            i = iMo744;
            if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj6), "Supporting")) {
                break;
            }
            i17++;
            iMo744 = i;
        }
        InterfaceC1827 interfaceC18212 = (InterfaceC1827) obj6;
        int iMo3596 = interfaceC18212 != null ? interfaceC18212.mo3596(C3693.m6557(j)) : 0;
        AbstractC0275 abstractC0277 = (AbstractC0275) c5450.f17965;
        int i18 = iMo743 + (abstractC0277 != null ? abstractC0277.f984 : 0);
        long jM1500 = AbstractC0671.m1500(i16, ((-i18) - i) - iMo3596, C3693.m6550(j, 0, 0, 0, 0, 11));
        int size7 = list.size();
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i18;
            InterfaceC1827 interfaceC18213 = (InterfaceC1827) list.get(i19);
            int i21 = size7;
            float f2 = fMo1657;
            if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC18213), "TextField")) {
                final AbstractC0275 abstractC0275Mo35911 = interfaceC18213.mo3597(jM1500);
                long jM6551 = C3693.m6550(jM1500, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i22);
                    int i23 = size8;
                    int i24 = i22;
                    if (AbstractC3831.m6874(AbstractC0949.m1956((InterfaceC1827) obj7), "Hint")) {
                        break;
                    }
                    i22 = i24 + 1;
                    size8 = i23;
                }
                InterfaceC1827 interfaceC18214 = (InterfaceC1827) obj7;
                AbstractC0275 abstractC0275Mo35912 = interfaceC18214 != null ? interfaceC18214.mo3597(jM6551) : null;
                int iMax5 = Math.max(iMax4, Math.max(abstractC0275Mo35911.f984, abstractC0275Mo35912 != null ? abstractC0275Mo35912.f984 : 0) + i20 + i);
                int i25 = abstractC0275Mo3597 != null ? abstractC0275Mo3597.f985 : 0;
                int i26 = abstractC0275Mo3598 != null ? abstractC0275Mo3598.f985 : 0;
                int i27 = abstractC0275Mo3599 != null ? abstractC0275Mo3599.f985 : 0;
                int i28 = abstractC0275Mo35910 != null ? abstractC0275Mo35910.f985 : 0;
                int i29 = i26;
                int i30 = abstractC0275Mo35911.f985;
                AbstractC0275 abstractC0278 = (AbstractC0275) c5450.f17965;
                int i31 = i27 + i28;
                final int iM1502 = AbstractC0671.m1502(j, Math.max(i30 + i31, Math.max((abstractC0275Mo35912 != null ? abstractC0275Mo35912.f985 : 0) + i31, abstractC0278 != null ? abstractC0278.f985 : 0)) + i25 + i29);
                AbstractC0275 abstractC0275Mo35913 = interfaceC18212 != null ? interfaceC18212.mo3597(C3693.m6550(AbstractC0671.m1499(0, -iMax5, 1, jM6550), 0, iM1502, 0, 0, 9)) : null;
                int i32 = abstractC0275Mo35913 != null ? abstractC0275Mo35913.f984 : 0;
                int i33 = abstractC0275Mo35911.f984;
                AbstractC0275 abstractC0279 = (AbstractC0275) c5450.f17965;
                int i34 = abstractC0279 != null ? abstractC0279.f984 : 0;
                int i35 = abstractC0275Mo3597 != null ? abstractC0275Mo3597.f984 : 0;
                int i36 = abstractC0275Mo3598 != null ? abstractC0275Mo3598.f984 : 0;
                int i37 = abstractC0275Mo3599 != null ? abstractC0275Mo3599.f984 : 0;
                final AbstractC0275 abstractC02710 = abstractC0275Mo3598;
                if (abstractC0275Mo35910 != null) {
                    AbstractC0275 abstractC02711 = abstractC0275Mo3599;
                    i2 = abstractC0275Mo35910.f984;
                    abstractC0275 = abstractC02711;
                } else {
                    abstractC0275 = abstractC0275Mo3599;
                    i2 = 0;
                }
                final AbstractC0275 abstractC02712 = abstractC0275;
                if (abstractC0275Mo35912 != null) {
                    i3 = abstractC0275Mo35912.f984;
                    abstractC0276 = abstractC0275Mo3597;
                } else {
                    abstractC0276 = abstractC0275Mo3597;
                    i3 = 0;
                }
                if (abstractC0275Mo35913 != null) {
                    f = f2;
                    i4 = abstractC0275Mo35913.f984;
                    i5 = 0;
                } else {
                    f = f2;
                    i4 = 0;
                    i5 = 0;
                }
                final int iM7951 = m7951(interfaceC2427, i33, i34, i35, i36, i37, i2, i3, i4, j, f);
                final int i38 = iM7951 - i32;
                int size9 = list.size();
                int i39 = i5;
                while (i39 < size9) {
                    InterfaceC1827 interfaceC18215 = (InterfaceC1827) list.get(i39);
                    if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC18215), "Container")) {
                        final AbstractC0275 abstractC0275Mo35914 = interfaceC18215.mo3597(AbstractC0671.m1496(iM1502 != 2147483647 ? iM1502 : i5, iM1502, i38 != Integer.MAX_VALUE ? i38 : i5, i38));
                        final float f3 = f;
                        final AbstractC0275 abstractC02713 = abstractC0275Mo35910;
                        final AbstractC0275 abstractC02714 = abstractC0276;
                        final AbstractC0275 abstractC02715 = abstractC0275Mo35912;
                        final AbstractC0275 abstractC02716 = abstractC0275Mo35913;
                        return interfaceC2427.mo755(iM1502, iM7951, C0204.f751, new InterfaceC4745() { // from class: ۥًؑؗۙ
                            /* JADX WARN: Code duplicated, block: B:20:0x0099  */
                            @Override // p000.InterfaceC4745
                            /* JADX INFO: renamed from: ۦؚ */
                            public final Object mo211(Object obj8) {
                                int iMo745;
                                int i40;
                                AbstractC1842 abstractC1842 = (AbstractC1842) obj8;
                                C5450 c5451 = c5450;
                                Object obj9 = c5451.f17965;
                                C4580 c4580 = this;
                                InterfaceC2427 interfaceC2428 = interfaceC2427;
                                int i41 = iM1502;
                                int i42 = iM7951;
                                AbstractC0275 abstractC02717 = abstractC0275Mo35911;
                                AbstractC0275 abstractC02718 = abstractC02715;
                                AbstractC0275 abstractC02719 = abstractC02714;
                                AbstractC0275 abstractC02720 = abstractC02710;
                                AbstractC0275 abstractC02721 = abstractC02712;
                                AbstractC0275 abstractC02722 = abstractC02713;
                                AbstractC0275 abstractC02723 = abstractC0275Mo35914;
                                AbstractC0275 abstractC02724 = abstractC02716;
                                if (obj9 != null) {
                                    boolean z = c4580.f15114;
                                    int i43 = iMo743;
                                    if (z) {
                                        iMo745 = Math.round(((i38 - ((AbstractC0275) obj9).f984) / 2.0f) * 1.0f);
                                    } else {
                                        iMo745 = interfaceC2428.mo743(c4580.f15112) + i43;
                                    }
                                    AbstractC0275 abstractC02725 = (AbstractC0275) c5451.f17965;
                                    int i44 = abstractC02725.f984 + i43;
                                    EnumC2459 layoutDirection = interfaceC2428.getLayoutDirection();
                                    C3176 c3176 = c4580.f15113;
                                    AbstractC1842.m3626(abstractC1842, abstractC02723, 0, 0);
                                    int i45 = i42 - (abstractC02724 != null ? abstractC02724.f984 : 0);
                                    if (abstractC02719 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02719, 0, Math.round(((i45 - abstractC02719.f984) / 2.0f) * 1.0f));
                                    }
                                    float f4 = f3;
                                    int iM7975 = AbstractC4593.m7975(f4, iMo745, i43);
                                    EnumC2459 enumC2459 = EnumC2459.f8215;
                                    if (layoutDirection == enumC2459) {
                                        if (abstractC02719 != null) {
                                            i40 = abstractC02719.f985;
                                        } else {
                                            i40 = 0;
                                        }
                                    } else if (abstractC02720 != null) {
                                        i40 = abstractC02720.f985;
                                    } else {
                                        i40 = 0;
                                    }
                                    int i46 = i40;
                                    int iRound = Math.round((1.0f + (layoutDirection == enumC2459 ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (abstractC02719 != null ? abstractC02719.f985 : 0)) - (abstractC02720 != null ? abstractC02720.f985 : 0)) - abstractC02725.f985) / 2.0f)) + i46;
                                    AbstractC0487.m1035(c3176);
                                    AbstractC1842.m3626(abstractC1842, abstractC02725, AbstractC4593.m7975(f4, iRound, Math.round((1.0f + (layoutDirection == enumC2459 ? -1.0f : (-1.0f) * (-1.0f))) * ((((i41 - (abstractC02719 != null ? abstractC02719.f985 : 0)) - (abstractC02720 != null ? abstractC02720.f985 : 0)) - abstractC02725.f985) / 2.0f)) + i46), iM7975);
                                    if (abstractC02721 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02721, abstractC02719 != null ? abstractC02719.f985 : 0, i44);
                                    }
                                    int i47 = (abstractC02719 != null ? abstractC02719.f985 : 0) + (abstractC02721 != null ? abstractC02721.f985 : 0);
                                    AbstractC1842.m3623(abstractC1842, abstractC02717, i47, i44);
                                    if (abstractC02718 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02718, i47, i44);
                                    }
                                    if (abstractC02722 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02722, (i41 - (abstractC02720 != null ? abstractC02720.f985 : 0)) - abstractC02722.f985, i44);
                                    }
                                    if (abstractC02720 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02720, i41 - abstractC02720.f985, Math.round(((i45 - abstractC02720.f984) / 2.0f) * 1.0f));
                                    }
                                    if (abstractC02724 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02724, 0, i45);
                                    }
                                } else {
                                    float fMo746 = interfaceC2428.mo746();
                                    AbstractC1842.m3624(abstractC1842, abstractC02723, 0L);
                                    int i48 = i42 - (abstractC02724 != null ? abstractC02724.f984 : 0);
                                    int iM5235 = AbstractC2776.m5235(c4580.f15115.mo1103() * fMo746);
                                    if (abstractC02719 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02719, 0, Math.round(((i48 - abstractC02719.f984) / 2.0f) * 1.0f));
                                    }
                                    if (abstractC02721 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02721, abstractC02719 != null ? abstractC02719.f985 : 0, C4580.m7950(c4580, i48, iM5235, abstractC02721));
                                    }
                                    int i49 = (abstractC02719 != null ? abstractC02719.f985 : 0) + (abstractC02721 != null ? abstractC02721.f985 : 0);
                                    AbstractC1842.m3623(abstractC1842, abstractC02717, i49, C4580.m7950(c4580, i48, iM5235, abstractC02717));
                                    if (abstractC02718 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02718, i49, C4580.m7950(c4580, i48, iM5235, abstractC02718));
                                    }
                                    if (abstractC02722 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02722, (i41 - (abstractC02720 != null ? abstractC02720.f985 : 0)) - abstractC02722.f985, C4580.m7950(c4580, i48, iM5235, abstractC02722));
                                    }
                                    if (abstractC02720 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02720, i41 - abstractC02720.f985, Math.round(((i48 - abstractC02720.f984) / 2.0f) * 1.0f));
                                    }
                                    if (abstractC02724 != null) {
                                        AbstractC1842.m3623(abstractC1842, abstractC02724, 0, i48);
                                    }
                                }
                                return C2358.f7817;
                            }
                        });
                    }
                    i39++;
                    i38 = i38;
                }
                AbstractC0844.m1756("Collection contains no element matching the predicate.");
                C1078.m2274();
                return null;
            }
            fMo1657 = f2;
            i19++;
            size7 = i21;
            i18 = i20;
            abstractC0275Mo3597 = abstractC0275Mo3597;
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return null;
    }
}
