package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦُّۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3934 implements InterfaceC5572 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ InterfaceC4448 f13135;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ InterfaceC4643 f13136;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C4036 f13137;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ InterfaceC1291 f13138;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C0846 f13139;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ InterfaceC3195 f13140;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ C1911 f13141;

    public C3934(C0846 c0846, InterfaceC1291 interfaceC1291, InterfaceC3602 interfaceC3602, InterfaceC3195 interfaceC3195, InterfaceC4643 interfaceC4643, InterfaceC5449 interfaceC5449, C4036 c4036, C1911 c1911) {
        this.f13139 = c0846;
        this.f13138 = interfaceC1291;
        this.f13135 = interfaceC3602;
        this.f13140 = interfaceC3195;
        this.f13136 = interfaceC4643;
        this.f13137 = c4036;
        this.f13141 = c1911;
    }

    /* JADX WARN: Code duplicated, block: B:326:0x0784  */
    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC5572
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5370 mo3754(C3504 c3504, long j) throws Throwable {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        C5851 c5851;
        int i7;
        float f2;
        List arrayList;
        int i8;
        int i9;
        List arrayList2;
        int i10;
        C5219 c5219;
        int i11;
        int i12;
        int i13;
        List list;
        Integer numValueOf;
        List list2;
        InterfaceC1422 interfaceC1422;
        C1282 c1282;
        int i14;
        C4523 c4523;
        int i15;
        int i16;
        int i17;
        Object obj;
        int i18;
        int iMax;
        int i19;
        int iM7840;
        int i20;
        boolean z;
        boolean zM7431 = C4207.m7431(0L, 0L);
        InterfaceC1422 interfaceC1423 = c3504.f11614;
        C0846 c0846 = this.f13139;
        InterfaceC4367 interfaceC4367 = c0846.f3019;
        C4752 c4752 = c0846.f3020;
        interfaceC4367.getValue();
        boolean z2 = c0846.f3026 || interfaceC1423.mo323();
        EnumC1616 enumC1616 = EnumC1616.f5425;
        AbstractC2552.m4798(j, enumC1616);
        EnumC2459 layoutDirection = interfaceC1423.getLayoutDirection();
        InterfaceC1291 interfaceC1291 = this.f13138;
        int iMo743 = interfaceC1423.mo743(interfaceC1291.mo1102(layoutDirection));
        int iMo744 = interfaceC1423.mo743(interfaceC1291.mo1101(interfaceC1423.getLayoutDirection()));
        int iMo745 = interfaceC1423.mo743(interfaceC1291.mo1103());
        int iMo746 = interfaceC1423.mo743(interfaceC1291.mo1100()) + iMo745;
        int i21 = iMo744 + iMo743;
        int i22 = iMo746 - iMo745;
        long jM1500 = AbstractC0671.m1500(-i21, -iMo746, j);
        C5440 c5440 = (C5440) this.f13135.mo449();
        C4068 c4068 = c5440.f17948;
        int iM6556 = C3693.m6556(jM1500);
        int iM6551 = C3693.m6551(jM1500);
        c4068.f13546.m359(iM6556);
        c4068.f13545.m359(iM6551);
        InterfaceC3195 interfaceC3195 = this.f13140;
        Integer numValueOf2 = null;
        if (interfaceC3195 == null) {
            AbstractC4690.m8037("null verticalArrangement when isVertical == true");
            C1078.m2274();
            return null;
        }
        int iMo747 = interfaceC1423.mo743(interfaceC3195.mo2868());
        int iMo5821 = c5440.mo5821();
        int iM6552 = C3693.m6551(j) - iMo746;
        C3437 c3437 = new C3437(jM1500, c5440, c3504, iMo5821, iMo747, this.f13141, iMo745, i22, (((long) iMo743) << 32) | (((long) iMo745) & 4294967295L), this.f13139);
        C5440 c5441 = c3437.f11410;
        C3510 c3510 = c5441.f17951;
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            int iM1761 = c0846.m1761();
            int iM7441 = AbstractC4225.m7441(iM1761, c5440, c4752.f15688);
            if (iM1761 != iM7441) {
                ((C0169) c4752.f15686).m359(iM7441);
                ((C3779) c4752.f15685).m6681(iM1761);
            }
            int iM360 = ((C0169) c4752.f15684).m360();
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            List listM6868 = AbstractC3831.m6868(c5440, c0846.f3023, c0846.f3040);
            float fFloatValue = (interfaceC1423.mo323() || !z2) ? c0846.f3027 : ((Number) ((C3411) c0846.f3025.f11254).f11359.getValue()).floatValue();
            C0474 c0474 = c0846.f3037;
            boolean zMo323 = interfaceC1423.mo323();
            InterfaceC4367 interfaceC4368 = c0846.f3038;
            if (iMo745 < 0) {
                AbstractC4690.m8038("invalid beforeContentPadding");
            }
            if (i22 < 0) {
                AbstractC4690.m8038("invalid afterContentPadding");
            }
            C0204 c0204 = C0204.f751;
            InterfaceC4643 interfaceC4643 = this.f13136;
            int i23 = iM360;
            C2340 c2340 = C2340.f7777;
            if (iMo5821 <= 0) {
                int iM6557 = C3693.m6557(jM1500);
                int iM6555 = C3693.m6555(jM1500);
                c0474.m1022(iM6557, iM6555, new ArrayList(), c3510, c3437, zMo323, z2, 0, 0);
                if (zMo323) {
                    z = false;
                } else {
                    c0474.m1024();
                    if (zM7431) {
                        z = false;
                    } else {
                        z = false;
                        iM6557 = AbstractC0671.m1502(jM1500, 0);
                        iM6555 = AbstractC0671.m1493(jM1500, 0);
                    }
                }
                interfaceC1422 = interfaceC1423;
                c1282 = new C1282(null, 0, false, 0.0f, interfaceC1423.mo755(AbstractC0671.m1502(j, iM6557 + i21), AbstractC0671.m1493(j, iM6555 + iMo746), c0204, new C4618(10)), 0.0f, false, interfaceC4643, c3504, c3437.f11413, c2340, -iMo745, iM6552 + i22, 0, enumC1616, i22, iMo747);
            } else {
                float f3 = fFloatValue;
                if (iM7441 >= iMo5821) {
                    iM7441 = iMo5821 - 1;
                    i23 = 0;
                }
                int iRound = Math.round(f3);
                int i24 = i23 - iRound;
                if (iM7441 == 0 && i24 < 0) {
                    iRound += i24;
                    i24 = 0;
                }
                int i25 = iM7441;
                C5219 c52110 = new C5219();
                int i26 = -iMo745;
                int i27 = i26 + (iMo747 < 0 ? iMo747 : 0);
                int i28 = i26;
                int i29 = i24 + i27;
                int iMax2 = 0;
                while (true) {
                    j2 = c3437.f11413;
                    if (i29 >= 0 || i25 <= 0) {
                        break;
                    }
                    int i30 = i25 - 1;
                    C5851 c5851M6221 = c3437.m6221(j2, i30);
                    c52110.add(0, c5851M6221);
                    iMax2 = Math.max(iMax2, c5851M6221.f19292);
                    i29 += c5851M6221.f19291;
                    i25 = i30;
                }
                if (i29 < i27) {
                    iRound -= i27 - i29;
                    i29 = i27;
                }
                int i31 = iRound;
                int i32 = i29 - i27;
                int i33 = iM6552 + i22;
                int i34 = i33 >= 0 ? i33 : 0;
                int i35 = iMax2;
                int i36 = i32;
                int i37 = i25;
                boolean z3 = false;
                int i38 = -i32;
                int i39 = 0;
                while (i39 < c52110.f17233) {
                    if (i38 >= i34) {
                        c52110.mo1860(i39);
                        z3 = true;
                    } else {
                        i37++;
                        i38 += ((C5851) c52110.get(i39)).f19291;
                        i39++;
                    }
                }
                int iMax3 = i35;
                int i40 = i37;
                boolean z4 = z3;
                while (i40 < iMo5821 && (i38 < i34 || i38 <= 0 || c52110.isEmpty())) {
                    int i41 = i34;
                    C5851 c5851M6222 = c3437.m6221(j2, i40);
                    int i42 = iMo5821;
                    int i43 = c5851M6222.f19291;
                    i38 += i43;
                    if (i38 <= i27) {
                        i20 = i27;
                        if (i40 != i42 - 1) {
                            i36 -= i43;
                            i25 = i40 + 1;
                            z4 = true;
                        }
                        i40++;
                        i34 = i41;
                        i27 = i20;
                        iMo5821 = i42;
                    } else {
                        i20 = i27;
                    }
                    int iMax4 = Math.max(iMax3, c5851M6222.f19292);
                    c52110.addLast(c5851M6222);
                    iMax3 = iMax4;
                    i40++;
                    i34 = i41;
                    i27 = i20;
                    iMo5821 = i42;
                }
                int i44 = iMo5821;
                if (i38 < iM6552) {
                    int i45 = iM6552 - i38;
                    i38 += i45;
                    i4 = i36 - i45;
                    while (i4 < iMo745 && i25 > 0) {
                        int i46 = i25 - 1;
                        int i47 = i45;
                        C5851 c5851M6223 = c3437.m6221(j2, i46);
                        c52110.add(0, c5851M6223);
                        iMax3 = Math.max(iMax3, c5851M6223.f19292);
                        i4 += c5851M6223.f19291;
                        i45 = i47;
                        i25 = i46;
                    }
                    int i48 = i45;
                    i = i31;
                    int i49 = i + i48;
                    if (i4 < 0) {
                        i38 += i4;
                        i3 = i25;
                        i2 = i49 + i4;
                        i4 = 0;
                    } else {
                        i3 = i25;
                        i2 = i49;
                    }
                } else {
                    i = i31;
                    i2 = i;
                    i3 = i25;
                    i4 = i36;
                }
                int i50 = iMax3;
                if (Integer.signum(Math.round(f3)) != Integer.signum(i2) || Math.abs(Math.round(f3)) < Math.abs(i2)) {
                    i5 = i2;
                    f = f3;
                } else {
                    i5 = i2;
                    f = i5;
                }
                float f4 = f3 - f;
                float f5 = 0.0f;
                if (zMo323 && i5 > i && f4 <= 0.0f) {
                    f5 = (i5 - i) + f4;
                }
                float f6 = f5;
                if (i4 < 0) {
                    AbstractC4690.m8038("negative currentFirstItemScrollOffset");
                }
                int i51 = -i4;
                C5851 c5852 = (C5851) c52110.first();
                if (iMo745 > 0 || iMo747 < 0) {
                    int iMo1859 = c52110.mo1859();
                    C5851 c5853 = c5852;
                    int i52 = i4;
                    int i53 = 0;
                    while (i53 < iMo1859) {
                        int i54 = iMo1859;
                        int i55 = ((C5851) c52110.get(i53)).f19291;
                        if (i52 == 0 || i55 > i52 || i53 == AbstractC2164.m4181(c52110)) {
                            break;
                        }
                        i52 -= i55;
                        i53++;
                        c5853 = (C5851) c52110.get(i53);
                        iMo1859 = i54;
                    }
                    i6 = i52;
                    c5851 = c5853;
                } else {
                    i6 = i4;
                    c5851 = c5852;
                }
                int iMax5 = Math.max(0, i3);
                int i56 = 1;
                int i57 = i3 - 1;
                if (iMax5 <= i57) {
                    List arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i7 = i56;
                        f2 = f;
                        arrayList = arrayList3;
                        arrayList.add(c3437.m6221(j2, i57));
                        if (i57 == iMax5) {
                            break;
                        }
                        i57--;
                        arrayList3 = arrayList;
                        i56 = i7;
                        f = f2;
                    }
                } else {
                    i7 = 1;
                    f2 = f;
                    arrayList = null;
                }
                int size = listM6868.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i58 = size - 1;
                        int iIntValue = ((Number) listM6868.get(size)).intValue();
                        if (iIntValue < iMax5) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c3437.m6221(j2, iIntValue));
                        }
                        if (i58 < 0) {
                            break;
                        }
                        size = i58;
                    }
                }
                if (arrayList == null) {
                    arrayList = c2340;
                }
                int iMax6 = i50;
                int i59 = 0;
                for (int size2 = arrayList.size(); i59 < size2; size2 = size2) {
                    iMax6 = Math.max(iMax6, ((C5851) arrayList.get(i59)).f19292);
                    i59++;
                }
                int iMin = Math.min(((C5851) AbstractC0973.m2040(c52110)).f19289, i44 - 1);
                int i60 = ((C5851) AbstractC0973.m2040(c52110)).f19289 + 1;
                if (i60 <= iMin) {
                    List arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        i8 = i40;
                        i9 = iMax6;
                        arrayList2 = arrayList4;
                        arrayList2.add(c3437.m6221(j2, i60));
                        if (i60 == iMin) {
                            break;
                        }
                        i60++;
                        arrayList4 = arrayList2;
                        iMax6 = i9;
                        i40 = i8;
                    }
                } else {
                    i8 = i40;
                    i9 = iMax6;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((C5851) AbstractC0973.m2040(arrayList2)).f19289 > iMin) {
                    iMin = ((C5851) AbstractC0973.m2040(arrayList2)).f19289;
                }
                int size3 = listM6868.size();
                int i61 = 0;
                while (i61 < size3) {
                    List list3 = listM6868;
                    int iIntValue2 = ((Number) listM6868.get(i61)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c3437.m6221(j2, iIntValue2));
                    }
                    i61++;
                    listM6868 = list3;
                }
                if (arrayList2 == null) {
                    arrayList2 = c2340;
                }
                int size4 = arrayList2.size();
                int iMax7 = i9;
                for (int i62 = 0; i62 < size4; i62++) {
                    iMax7 = Math.max(iMax7, ((C5851) arrayList2.get(i62)).f19292);
                }
                int i63 = (AbstractC3831.m6874(c5851, c52110.first()) && arrayList.isEmpty() && arrayList2.isEmpty()) ? i7 : 0;
                int iM1502 = AbstractC0671.m1502(jM1500, iMax7);
                int iM1493 = AbstractC0671.m1493(jM1500, i38);
                int i64 = i38 < Math.min(iM1493, iM6552) ? i7 : 0;
                if (i64 != 0 && i51 != 0) {
                    AbstractC4690.m8035("non-zero itemsScrollOffset");
                }
                C5851 c5854 = c5851;
                int i65 = i63;
                ArrayList arrayList5 = new ArrayList(arrayList2.size() + arrayList.size() + c52110.mo1859());
                if (i64 != 0) {
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        AbstractC4690.m8038("no extra items");
                    }
                    int iMo18510 = c52110.mo1859();
                    int[] iArr = new int[iMo18510];
                    for (int i66 = 0; i66 < iMo18510; i66++) {
                        iArr[i66] = ((C5851) c52110.get(i66)).f19295;
                    }
                    int[] iArr2 = new int[iMo18510];
                    if (interfaceC3195 == null) {
                        AbstractC4690.m8037("null verticalArrangement when isVertical == true");
                        C1078.m2274();
                        return null;
                    }
                    interfaceC3195.mo2265(c3504, iM1493, iArr, iArr2);
                    C3046 c3046 = new C3046(0, iMo18510 - 1, i7);
                    int i67 = c3046.f6005;
                    int i68 = c3046.f6004;
                    if ((i68 > 0 && i67 >= 0) || (i68 < 0 && i67 <= 0)) {
                        int i69 = 0;
                        while (true) {
                            int i70 = iArr2[i69];
                            int i71 = i68;
                            C5851 c5855 = (C5851) c52110.get(i69);
                            c5855.m9675(i70, iM1502, iM1493);
                            arrayList5.add(c5855);
                            if (i69 == i67) {
                                break;
                            }
                            i69 += i71;
                            i68 = i71;
                        }
                    }
                } else {
                    int size5 = arrayList.size();
                    int i72 = 0;
                    while (i72 < size5) {
                        i10 = i51;
                        int i73 = size5;
                        C5851 c5856 = (C5851) arrayList.get(i72);
                        i10 -= c5856.f19291;
                        c5856.m9675(i10, iM1502, iM1493);
                        arrayList5.add(c5856);
                        i72++;
                        size5 = i73;
                        arrayList = arrayList;
                    }
                    i10 = i51;
                    int iMo18511 = c52110.mo1859();
                    int i74 = i51;
                    for (int i75 = 0; i75 < iMo18511; i75++) {
                        C5851 c5857 = (C5851) c52110.get(i75);
                        c5857.m9675(i74, iM1502, iM1493);
                        arrayList5.add(c5857);
                        i74 += c5857.f19291;
                    }
                    int size6 = arrayList2.size();
                    for (int i76 = 0; i76 < size6; i76++) {
                        C5851 c5858 = (C5851) arrayList2.get(i76);
                        c5858.m9675(i74, iM1502, iM1493);
                        arrayList5.add(c5858);
                        i74 += c5858.f19291;
                    }
                }
                int i77 = i38;
                c0474.m1022(iM1502, iM1493, arrayList5, c3510, c3437, zMo323, z2, i6, i77);
                int iM1503 = iM1502;
                int i78 = iM1493;
                if (!zMo323) {
                    c0474.m1024();
                    if (!zM7431) {
                        iM1503 = AbstractC0671.m1502(jM1500, Math.max(iM1503, 0));
                        int iM1494 = AbstractC0671.m1493(jM1500, Math.max(i78, 0));
                        if (iM1494 != i78) {
                            int size7 = arrayList5.size();
                            for (int i79 = 0; i79 < size7; i79++) {
                                ((C5851) arrayList5.get(i79)).f19299 = iM1494;
                            }
                        }
                        i78 = iM1494;
                    }
                }
                C5851 c5859 = (C5851) c52110.m8843();
                int i80 = c5859 != null ? c5859.f19289 : 0;
                C5851 c58510 = (C5851) c52110.m8841();
                int i81 = c58510 != null ? c58510.f19289 : 0;
                c5441.f17949.getClass();
                C4523 c4524 = AbstractC0549.f1967;
                if (this.f13137 == null || arrayList5.isEmpty() || (i14 = c4524.f14948) == 0) {
                    c5219 = c52110;
                    i11 = i28;
                    i12 = 0;
                    i13 = 1;
                    list = c2340;
                } else {
                    if (i81 - i80 < 0 || i14 == 0) {
                        c4523 = c4524;
                    } else {
                        C3046 c3046M7917 = AbstractC4554.m7917(0, i14);
                        int i82 = c3046M7917.f6006;
                        int i83 = c3046M7917.f6005;
                        if (i82 <= i83) {
                            iM7840 = -1;
                            while (c4524.m7840(i82) <= i80) {
                                iM7840 = c4524.m7840(i82);
                                if (i82 == i83) {
                                    break;
                                }
                                i82++;
                            }
                            i19 = -1;
                        } else {
                            i19 = -1;
                            iM7840 = -1;
                        }
                        if (iM7840 == i19) {
                            c4523 = AbstractC0549.f1967;
                        } else {
                            c4523 = new C4523(1);
                            c4523.m7843(iM7840);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList(arrayList5.size());
                    int size8 = arrayList5.size();
                    int i84 = 0;
                    while (i84 < size8) {
                        C5219 c52111 = c52110;
                        Object obj2 = arrayList5.get(i84);
                        int i85 = size8;
                        int i86 = ((C5851) obj2).f19289;
                        int i87 = i84;
                        int[] iArr3 = c4524.f14949;
                        int i88 = c4524.f14948;
                        C4523 c4525 = c4524;
                        int i89 = 0;
                        while (i89 < i88) {
                            int i90 = i89;
                            if (iArr3[i90] == i86) {
                                arrayList7.add(obj2);
                                break;
                            }
                            i89 = i90 + 1;
                        }
                        i84 = i87 + 1;
                        size8 = i85;
                        c52110 = c52111;
                        c4524 = c4525;
                    }
                    c5219 = c52110;
                    int[] iArr4 = c4523.f14949;
                    int i91 = c4523.f14948;
                    int i92 = 0;
                    while (i92 < i91) {
                        int i93 = iArr4[i92];
                        Iterator it = arrayList5.iterator();
                        int i94 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i15 = i91;
                                i16 = -1;
                                break;
                            }
                            i15 = i91;
                            if (((C5851) it.next()).f19289 == i93) {
                                i16 = i94;
                                break;
                            }
                            i94++;
                            i91 = i15;
                        }
                        int[] iArr5 = iArr4;
                        C5851 c5851M6224 = i16 == -1 ? c3437.m6221(j2, i93) : (C5851) arrayList5.remove(i16);
                        int i95 = i92;
                        int i96 = c5851M6224.f19291;
                        int iM9677 = i16 == -1 ? Integer.MIN_VALUE : (int) (c5851M6224.m9677(0) & 4294967295L);
                        int size9 = arrayList7.size();
                        int i97 = 0;
                        while (true) {
                            if (i97 >= size9) {
                                i17 = i96;
                                obj = null;
                                break;
                            }
                            obj = arrayList7.get(i97);
                            i17 = i96;
                            if (((C5851) obj).f19289 != i93) {
                                break;
                            }
                            i97++;
                            i96 = i17;
                        }
                        C5851 c58511 = (C5851) obj;
                        int iM9678 = c58511 != null ? (int) (c58511.m9677(0) & 4294967295L) : Integer.MIN_VALUE;
                        if (iM9677 == Integer.MIN_VALUE) {
                            iMax = i28;
                            i18 = iMax;
                        } else {
                            i18 = i28;
                            iMax = Math.max(i18, iM9677);
                        }
                        if (iM9678 != Integer.MIN_VALUE) {
                            iMax = Math.min(iMax, iM9678 - i17);
                        }
                        c5851M6224.f19297 = true;
                        c5851M6224.m9675(iMax, iM1503, i78);
                        arrayList6.add(c5851M6224);
                        i92 = i95 + 1;
                        i28 = i18;
                        iArr4 = iArr5;
                        i91 = i15;
                        j2 = j2;
                    }
                    i11 = i28;
                    i12 = 0;
                    i13 = 1;
                    list = arrayList6;
                }
                if (i65 != 0) {
                    C5851 c58512 = (C5851) AbstractC0973.m2058(arrayList5);
                    if (c58512 != null) {
                        numValueOf = Integer.valueOf(c58512.f19289);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    C5851 c58513 = (C5851) c5219.m8843();
                    if (c58513 != null) {
                        numValueOf = Integer.valueOf(c58513.f19289);
                    } else {
                        numValueOf = null;
                    }
                }
                if (i65 != 0) {
                    C5851 c58514 = (C5851) AbstractC0973.m2043(arrayList5);
                    if (c58514 != null) {
                        numValueOf2 = Integer.valueOf(c58514.f19289);
                    }
                } else {
                    C5851 c58515 = (C5851) c5219.m8841();
                    if (c58515 != null) {
                        numValueOf2 = Integer.valueOf(c58515.f19289);
                    }
                }
                if (i8 >= i44 && i77 <= iM6552) {
                    i13 = i12;
                }
                InterfaceC5370 interfaceC5370Mo755 = interfaceC1423.mo755(AbstractC0671.m1502(j, iM1503 + i21), AbstractC0671.m1493(j, i78 + iMo746), c0204, new C3464(interfaceC4368, arrayList5, list, zMo323));
                int iIntValue3 = numValueOf != null ? numValueOf.intValue() : i12;
                int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : i12;
                if (arrayList5.isEmpty()) {
                    list2 = c2340;
                } else {
                    ArrayList arrayList8 = new ArrayList(list);
                    int size10 = arrayList5.size();
                    for (int i98 = i12; i98 < size10; i98++) {
                        C5851 c58516 = (C5851) arrayList5.get(i98);
                        int i99 = c58516.f19289;
                        if (iIntValue3 <= i99 && i99 <= iIntValue4) {
                            arrayList8.add(c58516);
                        }
                    }
                    AbstractC3872.m6902(arrayList8, AbstractC0993.f3541);
                    list2 = arrayList8;
                }
                interfaceC1422 = interfaceC1423;
                c1282 = new C1282(c5854, i6, i13, f2, interfaceC5370Mo755, f6, z4, interfaceC4643, c3504, c3437.f11413, list2, i11, i33, i44, enumC1616, i22, iMo747);
            }
            C1282 c1283 = c1282;
            c0846.m1758(c1283, interfaceC1422.mo323(), false);
            C1192 c1192 = c0846.f3028;
            return c1283;
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }
}
