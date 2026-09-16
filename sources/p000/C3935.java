package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦُؙْ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3935 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f13142;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5813 f13143;

    public C3935(InterfaceC5813 interfaceC5813, float f) {
        this.f13143 = interfaceC5813;
        this.f13142 = f;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        int size = list.size();
        int iMo3599 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo3599 += ((InterfaceC1827) list.get(i2)).mo3599(i);
        }
        return iMo3599;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        Integer numValueOf;
        int iMo743 = interfaceC0151.mo743(this.f13142);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC1827) list.get(0)).mo3598(i));
            int iM4181 = AbstractC2164.m4181(list);
            int i2 = 1;
            if (1 <= iM4181) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1827) list.get(i2)).mo3598(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM4181) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iMo743, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        Integer numValueOf;
        int iMo743 = interfaceC0151.mo743(this.f13142);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((InterfaceC1827) list.get(0)).mo3596(i));
            int iM4181 = AbstractC2164.m4181(list);
            int i2 = 1;
            if (1 <= iM4181) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1827) list.get(i2)).mo3596(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iM4181) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iMo743, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        int size = list.size();
        int iMo3600 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo3600 += ((InterfaceC1827) list.get(i2)).mo3600(i);
        }
        return iMo3600;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(final InterfaceC2427 interfaceC2427, List list, final long j) {
        int iM6556;
        int size = list.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i2);
            if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC1827), "navigationIcon")) {
                final AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    InterfaceC1827 interfaceC1828 = (InterfaceC1827) list.get(i3);
                    if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC1828), "actionIcons")) {
                        final AbstractC0275 abstractC0275Mo3598 = interfaceC1828.mo3597(C3693.m6550(j, 0, 0, 0, 0, 14));
                        if (C3693.m6556(j) == Integer.MAX_VALUE) {
                            iM6556 = C3693.m6556(j);
                        } else {
                            iM6556 = (C3693.m6556(j) - abstractC0275Mo3597.f985) - abstractC0275Mo3598.f985;
                            if (iM6556 < 0) {
                                iM6556 = 0;
                            }
                        }
                        int i4 = iM6556;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            InterfaceC1827 interfaceC1829 = (InterfaceC1827) list.get(i5);
                            if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC1829), "title")) {
                                final AbstractC0275 abstractC0275Mo3599 = interfaceC1829.mo3597(C3693.m6550(j, 0, i4, 0, 0, 12));
                                C2779 c2779 = AbstractC2811.f9383;
                                int iMo567 = abstractC0275Mo3599.mo567(c2779) != Integer.MIN_VALUE ? abstractC0275Mo3599.mo567(c2779) : 0;
                                float fMo1657 = this.f13143.mo1657();
                                int iM5235 = Float.isNaN(fMo1657) ? 0 : AbstractC2776.m5235(fMo1657);
                                final int iMax = Math.max(interfaceC2427.mo743(this.f13142), abstractC0275Mo3599.f984);
                                if (C3693.m6551(j) == Integer.MAX_VALUE) {
                                    i = iMax;
                                } else {
                                    int i6 = iM5235 + iMax;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = iMo567;
                                return interfaceC2427.mo755(C3693.m6556(j), i, C0204.f751, new InterfaceC4745(i, abstractC0275Mo3599, abstractC0275Mo3598, j, interfaceC2427, this, i7, iMax) { // from class: ۦؗؖۥۣ

                                    /* JADX INFO: renamed from: ۥَ */
                                    public final /* synthetic */ long f11419;

                                    /* JADX INFO: renamed from: ۥْ */
                                    public final /* synthetic */ AbstractC0275 f11420;

                                    /* JADX INFO: renamed from: ۥٓ */
                                    public final /* synthetic */ AbstractC0275 f11421;

                                    /* JADX INFO: renamed from: ۥٖ */
                                    public final /* synthetic */ InterfaceC2427 f11422;

                                    /* JADX INFO: renamed from: ۦ۟ */
                                    public final /* synthetic */ int f11423;

                                    @Override // p000.InterfaceC4745
                                    /* JADX INFO: renamed from: ۦؚ */
                                    public final Object mo211(Object obj) {
                                        int iM6557;
                                        AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                                        AbstractC0275 abstractC0275 = this.f11424;
                                        int i8 = abstractC0275.f984;
                                        int i9 = this.f11423;
                                        AbstractC1842.m3623(abstractC1842, abstractC0275, 0, (i9 - i8) / 2);
                                        int iMax2 = Math.max(this.f11422.mo743(AbstractC2264.f7519), abstractC0275.f985);
                                        AbstractC0275 abstractC0276 = this.f11421;
                                        int i10 = abstractC0276.f985;
                                        AbstractC0275 abstractC0277 = this.f11420;
                                        int i11 = abstractC0277.f985;
                                        long j2 = this.f11419;
                                        int iRound = Math.round((1.0f - 1.0f) * ((C3693.m6556(j2) - i11) / 2.0f));
                                        if (iRound >= iMax2) {
                                            if (abstractC0277.f985 + iRound > C3693.m6556(j2) - i10) {
                                                iM6557 = (C3693.m6556(j2) - i10) - (abstractC0277.f985 + iRound);
                                            }
                                            AbstractC1842.m3623(abstractC1842, abstractC0277, iRound, (i9 - abstractC0277.f984) / 2);
                                            AbstractC1842.m3623(abstractC1842, abstractC0276, C3693.m6556(j2) - abstractC0276.f985, (i9 - abstractC0276.f984) / 2);
                                            return C2358.f7817;
                                        }
                                        iM6557 = iMax2 - iRound;
                                        iRound += iM6557;
                                        AbstractC1842.m3623(abstractC1842, abstractC0277, iRound, (i9 - abstractC0277.f984) / 2);
                                        AbstractC1842.m3623(abstractC1842, abstractC0276, C3693.m6556(j2) - abstractC0276.f985, (i9 - abstractC0276.f984) / 2);
                                        return C2358.f7817;
                                    }
                                });
                            }
                            i5++;
                            this = this;
                        }
                        AbstractC0844.m1756("Collection contains no element matching the predicate.");
                        C1078.m2274();
                        return null;
                    }
                    i3++;
                    this = this;
                }
                AbstractC0844.m1756("Collection contains no element matching the predicate.");
                C1078.m2274();
                return null;
            }
        }
        AbstractC0844.m1756("Collection contains no element matching the predicate.");
        C1078.m2274();
        return null;
    }
}
