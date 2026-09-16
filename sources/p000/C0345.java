package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥؓؗۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0345 implements InterfaceC3228 {

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f1273;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3039 f1274;

    public C0345(C3039 c3039, boolean z) {
        this.f1274 = c3039;
        this.f1273 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0345)) {
            return false;
        }
        C0345 c0345 = (C0345) obj;
        return this.f1274.equals(c0345.f1274) && this.f1273 == c0345.f1273;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1273) + (this.f1274.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f1274 + ", propagateMinConstraints=" + this.f1273 + ')';
    }

    @Override // p000.InterfaceC3228
    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC5370 mo771(final InterfaceC2427 interfaceC2427, final List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        C0204 c0204 = C0204.f751;
        if (zIsEmpty) {
            return interfaceC2427.mo755(C3693.m6557(j), C3693.m6555(j), c0204, new C0086(11));
        }
        long j2 = this.f1273 ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final InterfaceC1827 interfaceC1827 = (InterfaceC1827) list.get(0);
            interfaceC1827.mo570();
            final AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(j2);
            final int iMax = Math.max(C3693.m6557(j), abstractC0275Mo3597.f985);
            final int iMax2 = Math.max(C3693.m6555(j), abstractC0275Mo3597.f984);
            return interfaceC2427.mo755(iMax, iMax2, c0204, new InterfaceC4745() { // from class: ۥۘؓٗٙ
                @Override // p000.InterfaceC4745
                /* JADX INFO: renamed from: ۦؚ */
                public final Object mo211(Object obj) {
                    AbstractC1089.m2300((AbstractC1842) obj, abstractC0275Mo3597, interfaceC1827, interfaceC2427.getLayoutDirection(), iMax, iMax2, this.f1274);
                    return C2358.f7817;
                }
            });
        }
        final AbstractC0275[] abstractC0275Arr = new AbstractC0275[list.size()];
        final C4763 c4763 = new C4763();
        c4763.f15714 = C3693.m6557(j);
        final C4763 c4764 = new C4763();
        c4764.f15714 = C3693.m6555(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1827 interfaceC1828 = (InterfaceC1827) list.get(i);
            interfaceC1828.mo570();
            AbstractC0275 abstractC0275Mo3598 = interfaceC1828.mo3597(j2);
            abstractC0275Arr[i] = abstractC0275Mo3598;
            c4763.f15714 = Math.max(c4763.f15714, abstractC0275Mo3598.f985);
            c4764.f15714 = Math.max(c4764.f15714, abstractC0275Mo3598.f984);
        }
        return interfaceC2427.mo755(c4763.f15714, c4764.f15714, c0204, new InterfaceC4745() { // from class: ۥٖؐۚ
            @Override // p000.InterfaceC4745
            /* JADX INFO: renamed from: ۦؚ */
            public final Object mo211(Object obj) {
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                AbstractC0275[] abstractC0275Arr2 = abstractC0275Arr;
                int length = abstractC0275Arr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    AbstractC1089.m2300(abstractC1842, abstractC0275Arr2[i3], (InterfaceC1827) list.get(i4), interfaceC2427.getLayoutDirection(), c4763.f15714, c4764.f15714, this.f1274);
                    i3++;
                    i2 = i4 + 1;
                }
                return C2358.f7817;
            }
        });
    }
}
