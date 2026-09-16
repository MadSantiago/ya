package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦؚؒؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3113 implements InterfaceC3228, InterfaceC1674 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1911 f10438;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3195 f10439;

    public C3113(InterfaceC3195 interfaceC3195, C1911 c1911) {
        this.f10439 = interfaceC3195;
        this.f10438 = c1911;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3113)) {
            return false;
        }
        C3113 c3113 = (C3113) obj;
        return this.f10439.equals(c3113.f10439) && this.f10438.equals(c3113.f10438);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10438.f6303) + (this.f10439.hashCode() * 31);
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f10439 + ", horizontalAlignment=" + this.f10438 + ')';
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo3091(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMo743 = interfaceC0151.mo743(this.f10439.mo2868());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo743, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i2);
            float fM1042 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1827));
            if (fM1042 == 0.0f) {
                int iMin2 = Math.min(interfaceC1827.mo3598(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1827.mo3599(iMin2));
            } else if (fM1042 > 0.0f) {
                f += fM1042;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1827 interfaceC1828 = (InterfaceC1827) list.get(i3);
            float fM1043 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1828));
            if (fM1043 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1828.mo3599(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM1043) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.InterfaceC1674
    /* JADX INFO: renamed from: ۥُ */
    public final long mo3502(int i, int i2, int i3, boolean z) {
        return !z ? AbstractC0671.m1496(0, i3, i, i2) : C5063.m8622(0, i3, i, i2);
    }

    @Override // p000.InterfaceC1674
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3503(AbstractC0275 abstractC0275) {
        return abstractC0275.f985;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo4446(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMo743 = interfaceC0151.mo743(this.f10439.mo2868());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i3);
            float fM1042 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1827));
            int iMo3598 = interfaceC1827.mo3598(i);
            if (fM1042 == 0.0f) {
                i2 += iMo3598;
            } else if (fM1042 > 0.0f) {
                f += fM1042;
                iMax = Math.max(iMax, Math.round(iMo3598 / fM1042));
            }
        }
        return ((list.size() - 1) * iMo743) + Math.round(iMax * f) + i2;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo4447(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMo743 = interfaceC0151.mo743(this.f10439.mo2868());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i3);
            float fM1042 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1827));
            int iMo3596 = interfaceC1827.mo3596(i);
            if (fM1042 == 0.0f) {
                i2 += iMo3596;
            } else if (fM1042 > 0.0f) {
                f += fM1042;
                iMax = Math.max(iMax, Math.round(iMo3596 / fM1042));
            }
        }
        return ((list.size() - 1) * iMo743) + Math.round(iMax * f) + i2;
    }

    @Override // p000.InterfaceC1674
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC5370 mo3504(AbstractC0275[] abstractC0275Arr, InterfaceC2427 interfaceC2427, int[] iArr, int i, int i2) {
        return interfaceC2427.mo755(i2, i, C0204.f751, new C5299(abstractC0275Arr, this, i2, interfaceC2427, iArr));
    }

    @Override // p000.InterfaceC1674
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3505(int i, int[] iArr, int[] iArr2, InterfaceC2427 interfaceC2427) {
        this.f10439.mo2265(interfaceC2427, i, iArr, iArr2);
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦِ */
    public final int mo4448(InterfaceC0151 interfaceC0151, List list, int i) {
        int iMo743 = interfaceC0151.mo743(this.f10439.mo2868());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iMo743, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(i2);
            float fM1042 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1827));
            if (fM1042 == 0.0f) {
                int iMin2 = Math.min(interfaceC1827.mo3598(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC1827.mo3600(iMin2));
            } else if (fM1042 > 0.0f) {
                f += fM1042;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            InterfaceC1827 interfaceC1828 = (InterfaceC1827) list.get(i3);
            float fM1043 = AbstractC0487.m1042(AbstractC0487.m1068(interfaceC1828));
            if (fM1043 > 0.0f) {
                iMax = Math.max(iMax, interfaceC1828.mo3600(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM1043) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // p000.InterfaceC1674
    /* JADX INFO: renamed from: ۦٛ */
    public final int mo3506(AbstractC0275 abstractC0275) {
        return abstractC0275.f984;
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(InterfaceC2427 interfaceC2427, List list, long j) {
        return AbstractC2133.m4124(this, C3693.m6555(j), C3693.m6557(j), C3693.m6551(j), C3693.m6556(j), interfaceC2427.mo743(this.f10439.mo2868()), interfaceC2427, list, new AbstractC0275[list.size()], list.size());
    }
}
