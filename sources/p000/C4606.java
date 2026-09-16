package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؘٜٛؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4606 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3176 f15201;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC1291 f15202;

    /* JADX INFO: renamed from: ۥّ */
    public final float f15203;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f15204;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f15205;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4444 f15206;

    public C4606(InterfaceC4745 interfaceC4745, boolean z, C3176 c3176, C4444 c4444, InterfaceC1291 interfaceC1291, float f) {
        this.f15205 = interfaceC4745;
        this.f15204 = z;
        this.f15201 = c3176;
        this.f15206 = c4444;
        this.f15202 = interfaceC1291;
        this.f15203 = f;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final int m8005(int i, C4606 c4606, int i2, int i3, AbstractC0275 abstractC0275, AbstractC0275 abstractC0276) {
        if (c4606.f15204) {
            i3 = Math.round(((i2 - abstractC0276.f984) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (abstractC0275 != null ? abstractC0275.f984 : 0) / 2);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        return m8007(interfaceC0151, list, i, new C4599(22));
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m8006(InterfaceC0151 interfaceC0151, List list, int i, InterfaceC5731 interfaceC5731) {
        Object obj;
        int iM9262;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        C4606 c4606 = this;
        float fMo1657 = c4606.f15206.mo1657();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj), "Leading")) {
                break;
            }
            i2++;
        }
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) obj;
        if (interfaceC1827 != null) {
            iM9262 = AbstractC5537.m9262(i, interfaceC1827.mo3599(Integer.MAX_VALUE));
            iIntValue = ((Number) interfaceC5731.mo219(interfaceC1827, Integer.valueOf(i))).intValue();
        } else {
            iM9262 = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) obj2;
        if (interfaceC1828 != null) {
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1828.mo3599(Integer.MAX_VALUE));
            iIntValue2 = ((Number) interfaceC5731.mo219(interfaceC1828, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (InterfaceC1827) obj3;
        int iIntValue5 = obj8 != null ? ((Number) interfaceC5731.mo219(obj8, Integer.valueOf(AbstractC4593.m7975(fMo1657, iM9262, i)))).intValue() : 0;
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
        if (interfaceC1829 != null) {
            iIntValue3 = ((Number) interfaceC5731.mo219(interfaceC1829, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1829.mo3599(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
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
        if (interfaceC18210 != null) {
            iIntValue4 = ((Number) interfaceC5731.mo219(interfaceC18210, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC18210.mo3599(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj9), "TextField")) {
                int iIntValue6 = ((Number) interfaceC5731.mo219(obj9, Integer.valueOf(iM9262))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (InterfaceC1827) obj6;
                int iIntValue7 = obj10 != null ? ((Number) interfaceC5731.mo219(obj10, Integer.valueOf(iM9262))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (InterfaceC1827) obj7;
                return c4606.m8008(interfaceC0151, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) interfaceC5731.mo219(obj11, Integer.valueOf(i))).intValue() : 0, AbstractC0671.m1494(0, 0, 0, 0, 15), fMo1657);
            }
            i7++;
            iIntValue4 = iIntValue4;
            c4606 = this;
            iIntValue3 = iIntValue3;
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return 0;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final int m8007(InterfaceC0151 interfaceC0151, List list, int i, InterfaceC5731 interfaceC5731) {
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
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj4), "Leading")) {
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
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj5), "Prefix")) {
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
                    if (AbstractC3831.m6874(AbstractC5537.m9255((InterfaceC1827) obj6), "Suffix")) {
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
                return m8009(interfaceC0151, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC18212 != null ? ((Number) interfaceC5731.mo219(interfaceC18212, Integer.valueOf(i))).intValue() : 0, AbstractC0671.m1494(0, 0, 0, 0, 15), this.f15206.mo1657());
            }
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return 0;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        return m8006(interfaceC0151, list, i, new C4599(23));
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        return m8006(interfaceC0151, list, i, new C4599(21));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m8008(InterfaceC2880 interfaceC2880, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, AbstractC4593.m7975(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        InterfaceC1291 interfaceC1291 = this.f15202;
        float fMo741 = interfaceC2880.mo741(interfaceC1291.mo1103());
        return AbstractC0671.m1493(j, Math.max(i, Math.max(i2, AbstractC2776.m5235(AbstractC4593.m7993(fMo741, Math.max(fMo741, i6 / 2.0f), f) + i5 + interfaceC2880.mo741(interfaceC1291.mo1100())))) + i8);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m8009(InterfaceC2880 interfaceC2880, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, AbstractC4593.m7975(f, i6, 0))) + i + i2;
        InterfaceC1291 interfaceC1291 = this.f15202;
        EnumC2459 enumC2459 = EnumC2459.f8215;
        return AbstractC0671.m1502(j, Math.max(iMax, AbstractC2776.m5235((i6 + interfaceC2880.mo741(interfaceC1291.mo1101(enumC2459) + interfaceC1291.mo1102(enumC2459))) * f)));
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        return m8007(interfaceC0151, list, i, new C4599(24));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final p000.InterfaceC5370 mo771(p000.InterfaceC2427 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4606.mo771(ۥ۟ؒؑٝ, java.util.List, long):ۦُ۠ؑۘ");
    }
}
