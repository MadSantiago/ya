package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦًؚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3692 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f12323;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4784 f12324;

    public C3692(C4784 c4784) {
        this.f12324 = c4784;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3599 = ((InterfaceC1827) list.get(0)).mo3599(i);
        int iM4181 = AbstractC2164.m4181(list);
        int i2 = 1;
        if (1 <= iM4181) {
            while (true) {
                int iMo35910 = ((InterfaceC1827) list.get(i2)).mo3599(i);
                if (iMo35910 > iMo3599) {
                    iMo3599 = iMo35910;
                }
                if (i2 == iM4181) {
                    break;
                }
                i2++;
            }
        }
        return iMo3599;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3598 = ((InterfaceC1827) list.get(0)).mo3598(i);
        int iM4181 = AbstractC2164.m4181(list);
        int i2 = 1;
        if (1 <= iM4181) {
            while (true) {
                int iMo3599 = ((InterfaceC1827) list.get(i2)).mo3598(i);
                if (iMo3599 > iMo3598) {
                    iMo3598 = iMo3599;
                }
                if (i2 == iM4181) {
                    break;
                }
                i2++;
            }
        }
        return iMo3598;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3596 = ((InterfaceC1827) list.get(0)).mo3596(i);
        int iM4181 = AbstractC2164.m4181(list);
        int i2 = 1;
        if (1 <= iM4181) {
            while (true) {
                int iMo3597 = ((InterfaceC1827) list.get(i2)).mo3596(i);
                if (iMo3597 > iMo3596) {
                    iMo3596 = iMo3597;
                }
                if (i2 == iM4181) {
                    break;
                }
                i2++;
            }
        }
        return iMo3596;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3600 = ((InterfaceC1827) list.get(0)).mo3600(i);
        int iM4181 = AbstractC2164.m4181(list);
        int i2 = 1;
        if (1 <= iM4181) {
            while (true) {
                int iMo3601 = ((InterfaceC1827) list.get(i2)).mo3600(i);
                if (iMo3601 > iMo3600) {
                    iMo3600 = iMo3601;
                }
                if (i2 == iM4181) {
                    break;
                }
                i2++;
            }
        }
        return iMo3600;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC0275 abstractC0275Mo3597 = ((InterfaceC1827) list.get(i)).mo3597(j);
            iMax = Math.max(iMax, abstractC0275Mo3597.f985);
            iMax2 = Math.max(iMax2, abstractC0275Mo3597.f984);
            arrayList.add(abstractC0275Mo3597);
        }
        boolean zMo323 = interfaceC2427.mo323();
        C4784 c4784 = this.f12324;
        if (zMo323) {
            this.f12323 = true;
            c4784.f15781.setValue(new C4207((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f12323) {
            c4784.f15781.setValue(new C4207((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return interfaceC2427.mo755(iMax, iMax2, C0204.f751, new C4738(2, arrayList));
    }
}
