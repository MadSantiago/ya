package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦً۟ؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5326 extends C2768 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC5381 f17576;

    /* JADX INFO: renamed from: ۥُ */
    public final C0638 f17577;

    /* JADX INFO: renamed from: ۥّ */
    public AbstractC1311 f17578;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f17579;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0322 f17580;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f17581;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f17582;

    /* JADX INFO: renamed from: ۦۙ */
    public C5639 f17583;

    public C5326(AbstractC5381 abstractC5381) {
        this.f17576 = abstractC5381;
        C0322 c0322 = new C0322((char) 0, 8);
        c0322.f1178 = new long[2];
        this.f17580 = c0322;
        this.f17577 = new C0638(2);
        this.f17582 = true;
        this.f17581 = true;
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f17576 + ", children=" + this.f9186 + ", pointerIds=" + this.f17580 + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ۥؗ */
    public final void m8929() {
        C0863 c0863 = this.f9186;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C5326) objArr[i2]).m8929();
        }
        ?? M9233 = this.f17576;
        ?? c0864 = 0;
        while (M9233 != 0) {
            if (M9233 instanceof InterfaceC2766) {
                ((InterfaceC2766) M9233).mo783();
            } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                AbstractC5381 abstractC5381 = ((AbstractC3019) M9233).f10167;
                int i3 = 0;
                c0864 = c0864;
                M9233 = M9233;
                while (abstractC5381 != null) {
                    if ((abstractC5381.f17781 & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            c0864 = c0864;
                            M9233 = abstractC5381;
                        } else {
                            if (c0864 == 0) {
                                c0864 = new C0863(new AbstractC5381[16]);
                            }
                            if (M9233 != 0) {
                                c0864.m1843(M9233);
                                M9233 = 0;
                            }
                            c0864.m1843(abstractC5381);
                        }
                    }
                    abstractC5381 = abstractC5381.f17783;
                    c0864 = c0864;
                    M9233 = M9233;
                }
                if (i3 == 1) {
                }
            }
            M9233 = AbstractC5537.m9233(c0864);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [ۥًؗۤ] */
    /* JADX INFO: renamed from: ۥُ */
    public final boolean m8930(C5470 c5470, boolean z) {
        C0605 c0605;
        if (this.f17577.m1456() == 0) {
            return false;
        }
        ?? M9233 = this.f17576;
        if (M9233.f17786) {
            AbstractC1311 abstractC1311 = M9233.f17789;
            if ((abstractC1311 == null || (c0605 = abstractC1311.f4513) == null) ? false : c0605.m1342()) {
                C5639 c5639 = this.f17583;
                long j = this.f17578.f982;
                ?? M9234 = M9233;
                ?? c0863 = 0;
                while (M9234 != 0) {
                    if (M9234 instanceof InterfaceC2766) {
                        ((InterfaceC2766) M9234).mo785(c5639, EnumC3834.f12725, j);
                    } else if ((M9234.f17781 & 16) != 0 && (M9234 instanceof AbstractC3019)) {
                        AbstractC5381 abstractC5381 = ((AbstractC3019) M9234).f10167;
                        int i = 0;
                        while (abstractC5381 != null) {
                            if ((abstractC5381.f17781 & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    M9234 = M9234;
                                    c0863 = c0863;
                                    c0863 = c0863;
                                    M9234 = abstractC5381;
                                } else {
                                    if (c0863 == 0) {
                                        c0863 = new C0863(new AbstractC5381[16]);
                                    }
                                    if (M9234 != 0) {
                                        c0863.m1843(M9234);
                                        M9234 = 0;
                                    }
                                    c0863.m1843(abstractC5381);
                                }
                            } else {
                                M9234 = M9234;
                                c0863 = c0863;
                            }
                            abstractC5381 = abstractC5381.f17783;
                            M9234 = M9234;
                            c0863 = c0863;
                        }
                        if (i == 1) {
                            M9234 = M9234;
                            c0863 = c0863;
                        } else {
                            M9234 = M9234;
                            c0863 = c0863;
                        }
                    }
                    M9234 = AbstractC5537.m9233(c0863);
                }
                if (M9233.f17786) {
                    C0863 c0864 = this.f9186;
                    Object[] objArr = c0864.f3182;
                    int i2 = c0864.f3180;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((C5326) objArr[i3]).m8930(c5470, z);
                    }
                }
                if (M9233.f17786) {
                    ?? c0865 = 0;
                    while (M9233 != 0) {
                        if (M9233 instanceof InterfaceC2766) {
                            ((InterfaceC2766) M9233).mo785(c5639, EnumC3834.f12724, j);
                        } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                            AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                            int i4 = 0;
                            while (abstractC5382 != null) {
                                if ((abstractC5382.f17781 & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        M9233 = M9233;
                                        c0865 = c0865;
                                        c0865 = c0865;
                                        M9233 = abstractC5382;
                                    } else {
                                        if (c0865 == 0) {
                                            c0865 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (M9233 != 0) {
                                            c0865.m1843(M9233);
                                            M9233 = 0;
                                        }
                                        c0865.m1843(abstractC5382);
                                    }
                                } else {
                                    M9233 = M9233;
                                    c0865 = c0865;
                                }
                                abstractC5382 = abstractC5382.f17783;
                                M9233 = M9233;
                                c0865 = c0865;
                            }
                            if (i4 == 1) {
                                M9233 = M9233;
                                c0865 = c0865;
                            } else {
                                M9233 = M9233;
                                c0865 = c0865;
                            }
                        }
                        M9233 = AbstractC5537.m9233(c0865);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8931(long j, C2730 c2730) {
        C0322 c0322 = this.f17580;
        if (c0322.m689(j) && c2730.m5086(this) < 0) {
            c0322.m699(j);
            this.f17577.m1452(j);
        }
        C0863 c0863 = this.f9186;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C5326) objArr[i2]).m8931(j, c2730);
        }
    }

    @Override // p000.C2768
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5170(C5470 c5470) {
        super.mo5170(c5470);
        C5639 c5639 = this.f17583;
        if (c5639 == null) {
            return;
        }
        this.f17579 = this.f17582;
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3536 c3536 = (C3536) list.get(i);
            boolean z = c3536.f11733;
            long j = c3536.f11732;
            boolean zM9160 = c5470.m9160(j);
            boolean z2 = this.f17582;
            if ((!z && !zM9160) || (!z && !z2)) {
                this.f17580.m699(j);
            }
        }
        this.f17582 = false;
        this.f17581 = c5639.f18581 == 5;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x031f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // p000.C2768
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo5171(C0638 c0638, InterfaceC2015 interfaceC2015, C5470 c5470, boolean z) {
        C0322 c0322;
        C0638 c0639;
        Object obj;
        boolean z2;
        boolean z3;
        C5639 c5639;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        boolean zMo5171 = super.mo5171(c0638, interfaceC2015, c5470, z);
        ?? M9233 = this.f17576;
        boolean z6 = true;
        if (M9233.f17786) {
            ?? c0863 = 0;
            while (M9233 != 0) {
                if (M9233 instanceof InterfaceC2766) {
                    this.f17578 = AbstractC5537.m9245((InterfaceC2766) M9233, 16);
                } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                    AbstractC5381 abstractC5381 = ((AbstractC3019) M9233).f10167;
                    int i3 = 0;
                    while (abstractC5381 != null) {
                        if ((abstractC5381.f17781 & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                M9233 = M9233;
                                c0863 = c0863;
                                c0863 = c0863;
                                M9233 = abstractC5381;
                            } else {
                                if (c0863 == 0) {
                                    c0863 = new C0863(new AbstractC5381[16]);
                                }
                                if (M9233 != 0) {
                                    c0863.m1843(M9233);
                                    M9233 = 0;
                                }
                                c0863.m1843(abstractC5381);
                            }
                        } else {
                            M9233 = M9233;
                            c0863 = c0863;
                        }
                        abstractC5381 = abstractC5381.f17783;
                        M9233 = M9233;
                        c0863 = c0863;
                    }
                    if (i3 == 1) {
                        M9233 = M9233;
                        c0863 = c0863;
                    } else {
                        M9233 = M9233;
                        c0863 = c0863;
                    }
                }
                M9233 = AbstractC5537.m9233(c0863);
            }
            if (this.f17578 != null) {
                int iM1456 = c0638.m1456();
                int i4 = 0;
                while (true) {
                    c0322 = this.f17580;
                    c0639 = this.f17577;
                    if (i4 >= iM1456) {
                        break;
                    }
                    long jM1455 = c0638.m1455(i4);
                    C3536 c3536 = (C3536) c0638.m1453(i4);
                    if (c0322.m689(jM1455)) {
                        boolean z7 = z6;
                        long j = c3536.f11739;
                        ArrayList arrayList = c3536.f11735;
                        long j2 = c3536.f11726;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            C2340 c2340 = C2340.f7777;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? c2340 : arrayList).size());
                            List list = arrayList == null ? c2340 : arrayList;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list2 = list;
                                C0545 c0545 = (C0545) list.get(i5);
                                C0638 c06310 = c0639;
                                long j3 = jM1455;
                                long j4 = c0545.f1962;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    arrayList2.add(new C0545(c0545.f1963, this.f17578.mo2781(interfaceC2015, j4), c0545.f1960, c0545.f1964, c0545.f1961));
                                }
                                i5++;
                                size = size;
                                list = list2;
                                c0639 = c06310;
                                jM1455 = j3;
                                c3536 = c3536;
                            }
                            C0638 c06311 = c0639;
                            long j5 = jM1455;
                            C3536 c3537 = new C3536(c3536.f11732, c3536.f11730, this.f17578.mo2781(interfaceC2015, j2), c3536.f11733, c3536.f11727, c3536.f11728, this.f17578.mo2781(interfaceC2015, j), c3536.f11731, c3536.f11737, arrayList2, c3536.f11736, c3536.f11738, c3536.f11734, c3536.f11740);
                            C3536 c3538 = c3536.f11729;
                            if (c3538 == null) {
                                c3538 = c3536;
                            }
                            c3537.f11729 = c3538;
                            C3536 c3539 = c3536.f11729;
                            if (c3539 != null) {
                                c3536 = c3539;
                            }
                            c3537.f11729 = c3536;
                            c06311.m1451(j5, c3537);
                        } else {
                            z5 = z7;
                        }
                    } else {
                        z5 = z6;
                    }
                    i4++;
                    iM1456 = iM1456;
                    z6 = z5;
                    zMo5171 = zMo5171;
                }
                boolean z8 = zMo5171;
                boolean z9 = z6;
                if (c0639.m1456() == 0) {
                    c0322.f1179 = 0;
                    this.f9186.m1851();
                    return z9;
                }
                int i6 = c0322.f1179;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    long j6 = ((long[]) c0322.f1178)[i6];
                    if (c0638.f2389) {
                        int i7 = c0638.f2387;
                        long[] jArr = c0638.f2388;
                        Object[] objArr = c0638.f2386;
                        int i8 = 0;
                        for (int i9 = 0; i9 < i7; i9++) {
                            Object obj2 = objArr[i9];
                            if (obj2 != C3133.f10544) {
                                if (i9 != i8) {
                                    jArr[i8] = jArr[i9];
                                    objArr[i8] = obj2;
                                    objArr[i9] = null;
                                }
                                i8++;
                            }
                        }
                        c0638.f2389 = false;
                        c0638.f2387 = i8;
                    }
                    if (AbstractC2164.m4215(c0638.f2388, c0638.f2387, j6) < 0 && i6 < (i2 = c0322.f1179)) {
                        int i10 = i2 - 1;
                        int i11 = i6;
                        while (i11 < i10) {
                            long[] jArr2 = (long[]) c0322.f1178;
                            int i12 = i11 + 1;
                            jArr2[i11] = jArr2[i12];
                            i11 = i12;
                        }
                        c0322.f1179--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(c0639.m1456());
                int iM1457 = c0639.m1456();
                for (int i13 = 0; i13 < iM1457; i13++) {
                    arrayList3.add(c0639.m1453(i13));
                }
                C5639 c56310 = new C5639(arrayList3, c5470);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i14);
                    if (c5470.m9160(((C3536) obj).f11732)) {
                        break;
                    }
                    i14++;
                }
                C3536 c35310 = (C3536) obj;
                if (c35310 != null) {
                    boolean z10 = c35310.f11733;
                    if (z) {
                        z2 = false;
                        z4 = this.f17582;
                        if (!z4 && (z10 || c35310.f11731)) {
                            long j7 = this.f17578.f982;
                            long j8 = c35310.f11726;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                            int i15 = (int) (j7 >> 32);
                            z4 = !((fIntBitsToFloat2 > ((float) ((int) (j7 & 4294967295L))) ? z9 : false) | (fIntBitsToFloat2 < 0.0f ? z9 : false) | (fIntBitsToFloat > ((float) i15) ? z9 : false) | (fIntBitsToFloat < 0.0f ? z9 : false));
                            this.f17582 = z4;
                        }
                    } else {
                        z2 = false;
                        this.f17582 = false;
                        z4 = false;
                    }
                    boolean z11 = this.f17579;
                    if (z4 == z11 || !((i = c56310.f18581) == 3 || i == 4 || i == 5)) {
                        int i16 = c56310.f18581;
                        if (i16 == 4 && z11 && !this.f17581) {
                            c56310.f18581 = 3;
                        } else if (i16 == 5 && z4 && z10) {
                            c56310.f18581 = 3;
                        }
                    } else {
                        c56310.f18581 = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && c56310.f18581 == 3 && (c5639 = this.f17583) != null) {
                    ?? r1 = c5639.f18583;
                    int size3 = r1.size();
                    ?? r4 = c56310.f18583;
                    if (size3 != r4.size()) {
                        z3 = z9;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!C1553.m3306(((C3536) r1.get(r5)).f11726, ((C3536) r4.get(r5)).f11726)) {
                            z3 = z9;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z3 = z9;
                    break;
                }
                this.f17583 = c56310;
                return z3;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m8932(C5470 c5470) {
        C0605 c0605;
        C0638 c0638 = this.f17577;
        boolean z = false;
        z = false;
        z = false;
        if (c0638.m1456() != 0) {
            AbstractC5381 abstractC5381 = this.f17576;
            if (abstractC5381.f17786) {
                AbstractC1311 abstractC1311 = abstractC5381.f17789;
                if ((abstractC1311 == null || (c0605 = abstractC1311.f4513) == null) ? false : c0605.m1342()) {
                    C5639 c5639 = this.f17583;
                    long j = this.f17578.f982;
                    ?? M9233 = abstractC5381;
                    ?? c0863 = 0;
                    while (M9233 != 0) {
                        if (M9233 instanceof InterfaceC2766) {
                            ((InterfaceC2766) M9233).mo785(c5639, EnumC3834.f12722, j);
                        } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                            AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                            int i = 0;
                            while (abstractC5382 != null) {
                                if ((abstractC5382.f17781 & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        M9233 = M9233;
                                        c0863 = c0863;
                                        c0863 = c0863;
                                        M9233 = abstractC5382;
                                    } else {
                                        if (c0863 == 0) {
                                            c0863 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (M9233 != 0) {
                                            c0863.m1843(M9233);
                                            M9233 = 0;
                                        }
                                        c0863.m1843(abstractC5382);
                                    }
                                } else {
                                    M9233 = M9233;
                                    c0863 = c0863;
                                }
                                abstractC5382 = abstractC5382.f17783;
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                            if (i == 1) {
                                M9233 = M9233;
                                c0863 = c0863;
                            } else {
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                        }
                        M9233 = AbstractC5537.m9233(c0863);
                    }
                    if (abstractC5381.f17786) {
                        C0863 c0864 = this.f9186;
                        Object[] objArr = c0864.f3182;
                        int i2 = c0864.f3180;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((C5326) objArr[i3]).m8932(c5470);
                        }
                    }
                    z = true;
                }
            }
        }
        mo5170(c5470);
        c0638.m1454();
        this.f17578 = null;
        return z;
    }
}
