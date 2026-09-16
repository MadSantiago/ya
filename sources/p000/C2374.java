package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥٟۜؓؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2374 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public C4852 f7857;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f7858;

    /* JADX INFO: renamed from: ۥۙ */
    public InterfaceC0215 f7859;

    /* JADX INFO: renamed from: ۥۦ */
    public C4497 f7860;

    /* JADX INFO: renamed from: ۦؖ */
    public C5825 f7861;

    /* JADX INFO: renamed from: ۦؗ */
    public C4497 f7862;

    /* JADX INFO: renamed from: ۦؙ */
    public C5825 f7863;

    /* JADX INFO: renamed from: ۦٚ */
    public int f7864;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        float f;
        C1280 c1280 = AbstractC3831.f12711;
        boolean zIsEmpty = ((List) this.f7857.getValue()).isEmpty();
        C0204 c0204 = C0204.f751;
        if (zIsEmpty) {
            return interfaceC2427.mo755(0, 0, c0204, new C4215(29));
        }
        boolean z = this.f7858;
        C4852 c4852 = this.f7857;
        float f2 = z ? ((C2733) ((List) c4852.getValue()).get(this.f7864)).f9045 : ((C2733) ((List) c4852.getValue()).get(this.f7864)).f9046;
        C4497 c4497 = this.f7862;
        if (c4497 != null) {
            C5825 c5825 = this.f7861;
            if (c5825 == null) {
                c5825 = new C5825(c4497, c1280, null, 12);
                this.f7861 = c5825;
            }
            if (C4497.m7826(f2, ((C4497) c5825.f19170.getValue()).f14871)) {
                f = f2;
            } else {
                f = f2;
                AbstractC2765.m5135(m9076(), null, 0, new C1576(c5825, f2, this, null, 0), 3);
            }
        } else {
            f = f2;
            this.f7862 = new C4497(f);
        }
        float f3 = ((C2733) ((List) this.f7857.getValue()).get(this.f7864)).f9047;
        C4497 c4498 = this.f7860;
        if (c4498 != null) {
            C5825 c5826 = this.f7863;
            if (c5826 == null) {
                c5826 = new C5825(c4498, c1280, null, 12);
                this.f7863 = c5826;
            }
            if (!C4497.m7826(f3, ((C4497) c5826.f19170.getValue()).f14871)) {
                AbstractC2765.m5135(m9076(), null, 0, new C1576(c5826, f3, this, null, 1), 3);
            }
        } else {
            this.f7860 = new C4497(f3);
        }
        EnumC2459 layoutDirection = interfaceC2427.getLayoutDirection();
        C5825 c5827 = this.f7863;
        if (layoutDirection != EnumC2459.f8215) {
            if (c5827 != null) {
                f3 = ((C4497) c5827.m9638()).f14871;
            }
            f3 = -f3;
        } else if (c5827 != null) {
            f3 = ((C4497) c5827.m9638()).f14871;
        }
        C5825 c5828 = this.f7861;
        if (c5828 != null) {
            f = ((C4497) c5828.m9638()).f14871;
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, interfaceC2427.mo743(f), interfaceC2427.mo743(f), 0, 0, 12));
        return interfaceC2427.mo755(abstractC0275Mo3597.f985, abstractC0275Mo3597.f984, c0204, new C3670(abstractC0275Mo3597, interfaceC2427, f3, 1));
    }
}
