package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥۗؓؖؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2104 implements InterfaceC4866 {
    /* JADX INFO: renamed from: ۥّ */
    public static int m4080(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i, InterfaceC5731 interfaceC5731) {
        int iIntValue;
        int iIntValue2;
        int i2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iM9262 = AbstractC5537.m9262(i, interfaceC0151.mo743(32.0f));
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) AbstractC0973.m2058(list4);
        if (interfaceC1827 != null) {
            iIntValue = ((Number) interfaceC5731.mo219(interfaceC1827, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1827.mo3599(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) AbstractC0973.m2058(list5);
        if (interfaceC1828 != null) {
            iIntValue2 = ((Number) interfaceC5731.mo219(interfaceC1828, Integer.valueOf(iM9262))).intValue();
            iM9262 = AbstractC5537.m9262(iM9262, interfaceC1828.mo3599(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (InterfaceC1827) AbstractC0973.m2058(list2);
        int iIntValue3 = obj != null ? ((Number) interfaceC5731.mo219(obj, Integer.valueOf(iM9262))).intValue() : 0;
        Object obj2 = (InterfaceC1827) AbstractC0973.m2058(list);
        int iIntValue4 = obj2 != null ? ((Number) interfaceC5731.mo219(obj2, Integer.valueOf(iM9262))).intValue() : 0;
        Object obj3 = (InterfaceC1827) AbstractC0973.m2058(list3);
        int iIntValue5 = obj3 != null ? ((Number) interfaceC5731.mo219(obj3, Integer.valueOf(iM9262))).intValue() : 0;
        boolean z = iIntValue5 > interfaceC0151.mo749(AbstractC4489.m7788(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        if ((z2 && z3) || z) {
            i2 = 3;
        } else {
            i2 = (z2 || z3) ? 2 : 1;
        }
        return AbstractC0993.m2138(interfaceC0151, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, interfaceC0151.mo743((i2 == 3 ? 12.0f : 8.0f) * 2.0f), AbstractC0671.m1494(0, 0, 0, 0, 15));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static int m4081(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i, InterfaceC5731 interfaceC5731) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) AbstractC0973.m2058(list4);
        int iIntValue = interfaceC1827 != null ? ((Number) interfaceC5731.mo219(interfaceC1827, Integer.valueOf(i))).intValue() : 0;
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) AbstractC0973.m2058(list5);
        int iIntValue2 = interfaceC1828 != null ? ((Number) interfaceC5731.mo219(interfaceC1828, Integer.valueOf(i))).intValue() : 0;
        InterfaceC1827 interfaceC1829 = (InterfaceC1827) AbstractC0973.m2058(list);
        int iIntValue3 = interfaceC1829 != null ? ((Number) interfaceC5731.mo219(interfaceC1829, Integer.valueOf(i))).intValue() : 0;
        InterfaceC1827 interfaceC18210 = (InterfaceC1827) AbstractC0973.m2058(list2);
        int iIntValue4 = interfaceC18210 != null ? ((Number) interfaceC5731.mo219(interfaceC18210, Integer.valueOf(i))).intValue() : 0;
        InterfaceC1827 interfaceC18211 = (InterfaceC1827) AbstractC0973.m2058(list3);
        int iIntValue5 = interfaceC18211 != null ? ((Number) interfaceC5731.mo219(interfaceC18211, Integer.valueOf(i))).intValue() : 0;
        int iMo743 = interfaceC0151.mo743(32.0f);
        long jM1494 = AbstractC0671.m1494(0, 0, 0, 0, 15);
        if (C3693.m6548(jM1494)) {
            return C3693.m6556(jM1494);
        }
        return iMo743 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo4082(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        return m4081(interfaceC0151, arrayList, i, C1524.f5166);
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4083(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        return m4080(interfaceC0151, arrayList, i, C5172.f17119);
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4084(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        return m4081(interfaceC0151, arrayList, i, C1161.f4028);
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5370 mo4085(InterfaceC2427 interfaceC2427, ArrayList arrayList, long j) {
        int i;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        long jM6550 = C3693.m6550(j, 0, 0, 0, 0, 10);
        int iMo743 = interfaceC2427.mo743(32.0f);
        InterfaceC1827 interfaceC1827 = (InterfaceC1827) AbstractC0973.m2058(list4);
        int iMo3600 = interfaceC1827 != null ? interfaceC1827.mo3600(C3693.m6551(j)) : 0;
        InterfaceC1827 interfaceC1828 = (InterfaceC1827) AbstractC0973.m2058(list5);
        int iM9262 = AbstractC5537.m9262(C3693.m6556(jM6550), iMo3600 + (interfaceC1828 != null ? interfaceC1828.mo3600(C3693.m6551(j)) : 0) + iMo743);
        InterfaceC1827 interfaceC1829 = (InterfaceC1827) AbstractC0973.m2058(list3);
        long jM1500 = AbstractC0671.m1500(-iMo743, -interfaceC2427.mo743(((((AbstractC0973.m2058(list2) != null) && (AbstractC0973.m2058(list3) != null)) || ((interfaceC1829 != null ? interfaceC1829.mo3596(iM9262) : 0) > interfaceC2427.mo749(AbstractC4489.m7788(30)))) ? 12.0f : 8.0f) * 2.0f), jM6550);
        InterfaceC1827 interfaceC18210 = (InterfaceC1827) AbstractC0973.m2058(list4);
        AbstractC0275 abstractC0275Mo3597 = interfaceC18210 != null ? interfaceC18210.mo3597(jM1500) : null;
        int i2 = abstractC0275Mo3597 != null ? abstractC0275Mo3597.f985 : 0;
        InterfaceC1827 interfaceC18211 = (InterfaceC1827) AbstractC0973.m2058(list5);
        AbstractC0275 abstractC0275Mo3598 = interfaceC18211 != null ? interfaceC18211.mo3597(AbstractC0671.m1499(-i2, 0, 2, jM1500)) : null;
        int i3 = i2 + (abstractC0275Mo3598 != null ? abstractC0275Mo3598.f985 : 0);
        InterfaceC1827 interfaceC18212 = (InterfaceC1827) AbstractC0973.m2058(list);
        AbstractC0275 abstractC0275Mo3599 = interfaceC18212 != null ? interfaceC18212.mo3597(AbstractC0671.m1499(-i3, 0, 2, jM1500)) : null;
        int i4 = abstractC0275Mo3599 != null ? abstractC0275Mo3599.f984 : 0;
        InterfaceC1827 interfaceC18213 = (InterfaceC1827) AbstractC0973.m2058(list3);
        AbstractC0275 abstractC0275Mo35910 = interfaceC18213 != null ? interfaceC18213.mo3597(AbstractC0671.m1500(-i3, -i4, jM1500)) : null;
        int i5 = i4 + (abstractC0275Mo35910 != null ? abstractC0275Mo35910.f984 : 0);
        boolean z = (abstractC0275Mo35910 == null || abstractC0275Mo35910.mo567(AbstractC2811.f9384) == abstractC0275Mo35910.mo567(AbstractC2811.f9383)) ? false : true;
        InterfaceC1827 interfaceC18214 = (InterfaceC1827) AbstractC0973.m2058(list2);
        AbstractC0275 abstractC0275Mo35911 = interfaceC18214 != null ? interfaceC18214.mo3597(AbstractC0671.m1500(-i3, -i5, jM1500)) : null;
        boolean z2 = abstractC0275Mo35911 != null;
        boolean z3 = abstractC0275Mo35910 != null;
        if ((z2 && z3) || z) {
            i = 3;
        } else {
            i = (z2 || z3) ? 2 : 1;
        }
        float f = i == 3 ? 12.0f : 8.0f;
        float f2 = f * 2.0f;
        final int iM6556 = C3693.m6548(j) ? C3693.m6556(j) : iMo743 + (abstractC0275Mo3597 != null ? abstractC0275Mo3597.f985 : 0) + Math.max(abstractC0275Mo3599 != null ? abstractC0275Mo3599.f985 : 0, Math.max(abstractC0275Mo35911 != null ? abstractC0275Mo35911.f985 : 0, abstractC0275Mo35910 != null ? abstractC0275Mo35910.f985 : 0)) + (abstractC0275Mo3598 != null ? abstractC0275Mo3598.f985 : 0);
        final AbstractC0275 abstractC0275 = abstractC0275Mo35911;
        float f3 = f;
        final int iM2138 = AbstractC0993.m2138(interfaceC2427, abstractC0275Mo3597 != null ? abstractC0275Mo3597.f984 : 0, abstractC0275Mo3598 != null ? abstractC0275Mo3598.f984 : 0, abstractC0275Mo3599 != null ? abstractC0275Mo3599.f984 : 0, abstractC0275Mo35911 != null ? abstractC0275Mo35911.f984 : 0, abstractC0275Mo35910 != null ? abstractC0275Mo35910.f984 : 0, i, interfaceC2427.mo743(f2), j);
        final boolean z4 = i == 3;
        final int iMo744 = interfaceC2427.mo743(16.0f);
        final int iMo745 = interfaceC2427.mo743(16.0f);
        final int iMo746 = interfaceC2427.mo743(f3);
        final AbstractC0275 abstractC0276 = abstractC0275Mo3598;
        final AbstractC0275 abstractC0277 = abstractC0275Mo3599;
        final AbstractC0275 abstractC0278 = abstractC0275Mo35910;
        final AbstractC0275 abstractC0279 = abstractC0275Mo3597;
        return interfaceC2427.mo755(iM6556, iM2138, C0204.f751, new InterfaceC4745() { // from class: ۦّّؔ٘
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                int iRound;
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                AbstractC0275 abstractC02710 = abstractC0279;
                int i6 = iMo744;
                boolean z5 = z4;
                int iRound2 = iMo746;
                int i7 = iM2138;
                if (abstractC02710 != null) {
                    AbstractC1842.m3623(abstractC1842, abstractC02710, i6, z5 ? iRound2 : Math.round(((i7 - abstractC02710.f984) / 2.0f) * 1.0f));
                }
                int i8 = i6 + (abstractC02710 != null ? abstractC02710.f985 : 0);
                AbstractC0275 abstractC02711 = abstractC0277;
                AbstractC0275 abstractC02712 = abstractC0275;
                AbstractC0275 abstractC02713 = abstractC0278;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i7 - (((abstractC02711 != null ? abstractC02711.f984 : 0) + (abstractC02712 != null ? abstractC02712.f984 : 0)) + (abstractC02713 != null ? abstractC02713.f984 : 0))) / 2.0f) * 1.0f);
                }
                if (abstractC02712 != null) {
                    AbstractC1842.m3623(abstractC1842, abstractC02712, i8, iRound);
                }
                int i9 = iRound + (abstractC02712 != null ? abstractC02712.f984 : 0);
                if (abstractC02711 != null) {
                    AbstractC1842.m3623(abstractC1842, abstractC02711, i8, i9);
                }
                int i10 = i9 + (abstractC02711 != null ? abstractC02711.f984 : 0);
                if (abstractC02713 != null) {
                    AbstractC1842.m3623(abstractC1842, abstractC02713, i8, i10);
                }
                AbstractC0275 abstractC02714 = abstractC0276;
                if (abstractC02714 != null) {
                    int i11 = (iM6556 - iMo745) - abstractC02714.f985;
                    if (!z5) {
                        iRound2 = Math.round(((i7 - abstractC02714.f984) / 2.0f) * 1.0f);
                    }
                    AbstractC1842.m3623(abstractC1842, abstractC02714, i11, iRound2);
                }
                return C2358.f7817;
            }
        });
    }

    @Override // p000.InterfaceC4866
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo4086(InterfaceC0151 interfaceC0151, ArrayList arrayList, int i) {
        return m4080(interfaceC0151, arrayList, i, C2643.f8786);
    }
}
