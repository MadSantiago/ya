package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؚؔؔۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3227 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0400 f10842;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f10843;

    public /* synthetic */ C3227(InterfaceC0400 interfaceC0400, int i) {
        this.f10843 = i;
        this.f10842 = interfaceC0400;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(final InterfaceC2427 interfaceC2427, List list, long j) {
        final AbstractC0275 abstractC0275Mo3597;
        int i = this.f10843;
        C0204 c0204 = C0204.f751;
        switch (i) {
            case 0:
                return interfaceC2427.mo755(C3693.m6556(j), C3693.m6551(j), c0204, new C0079(19, list, this));
            default:
                final AbstractC0275 abstractC0275 = null;
                if (((InterfaceC5731) this.f10842) != null) {
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            AbstractC0844.m1756("Collection contains no element matching the predicate.");
                            C1078.m2274();
                            return null;
                        }
                        InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i2);
                        if (AbstractC3831.m6874(AbstractC0949.m1956(interfaceC1827), "text")) {
                            abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, 0, 0, 0, 0, 11));
                        } else {
                            i2++;
                        }
                    }
                } else {
                    abstractC0275Mo3597 = null;
                }
                final int iMax = Math.max(abstractC0275Mo3597 != null ? abstractC0275Mo3597.f985 : 0, 0);
                final int iMax2 = Math.max(interfaceC2427.mo743(AbstractC5844.f19256), interfaceC2427.mo749(AbstractC5844.f19254) + 0 + (abstractC0275Mo3597 != null ? abstractC0275Mo3597.f984 : 0));
                final Integer numValueOf = abstractC0275Mo3597 != null ? Integer.valueOf(abstractC0275Mo3597.mo567(AbstractC2811.f9384)) : null;
                final Integer numValueOf2 = abstractC0275Mo3597 != null ? Integer.valueOf(abstractC0275Mo3597.mo567(AbstractC2811.f9383)) : null;
                return interfaceC2427.mo755(iMax, iMax2, c0204, new InterfaceC4745() { // from class: ۥٕٟؖٚ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj) {
                        AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                        AbstractC0275 abstractC0276 = abstractC0275Mo3597;
                        AbstractC0275 abstractC0277 = abstractC0275;
                        int i3 = iMax2;
                        if (abstractC0276 != null && abstractC0277 != null) {
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            float f = iIntValue == iIntValue2 ? AbstractC5844.f19253 : AbstractC5844.f19257;
                            InterfaceC2427 interfaceC2428 = interfaceC2427;
                            int iMo743 = interfaceC2428.mo743(f);
                            int i4 = AbstractC1431.f4910;
                            int iMo744 = interfaceC2428.mo743(3.0f) + iMo743;
                            int iMo749 = (interfaceC2428.mo749(AbstractC5844.f19254) + abstractC0277.f984) - iIntValue;
                            int i5 = abstractC0276.f985;
                            int i6 = iMax;
                            int i7 = (i3 - iIntValue2) - iMo744;
                            AbstractC1842.m3623(abstractC1842, abstractC0276, (i6 - i5) / 2, i7);
                            AbstractC1842.m3623(abstractC1842, abstractC0277, (i6 - abstractC0277.f985) / 2, i7 - iMo749);
                        } else if (abstractC0276 != null) {
                            float f2 = AbstractC5844.f19256;
                            AbstractC1842.m3623(abstractC1842, abstractC0276, 0, (i3 - abstractC0276.f984) / 2);
                        } else if (abstractC0277 != null) {
                            float f3 = AbstractC5844.f19256;
                            AbstractC1842.m3623(abstractC1842, abstractC0277, 0, (i3 - abstractC0277.f984) / 2);
                        }
                        return C2358.f7817;
                    }
                });
        }
    }
}
