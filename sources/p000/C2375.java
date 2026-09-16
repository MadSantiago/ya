package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥۜؓؖ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2375 implements InterfaceC4464 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0846 f7865;

    public C2375(C0846 c0846) {
        this.f7865 = c0846;
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo2585() {
        return !this.f7865.m1759().f4373.isEmpty();
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥُ */
    public final int mo2586() {
        return Math.max(0, this.f7865.m1761());
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo2587() {
        return Math.min(mo2588() - 1, ((C5851) AbstractC0973.m2040(this.f7865.m1759().f4373)).f19289);
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo2588() {
        return this.f7865.m1759().f4375;
    }

    @Override // p000.InterfaceC4464
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2589() {
        int i;
        C0846 c0846 = this.f7865;
        int size = 0;
        if (c0846.m1759().f4373.isEmpty()) {
            return 0;
        }
        C1282 c1282M1759 = c0846.m1759();
        int iM2712 = (int) (c1282M1759.f4377 == EnumC1616.f5425 ? c1282M1759.m2712() & 4294967295L : c1282M1759.m2712() >> 32);
        C1282 c1282M17510 = c0846.m1759();
        List list = c1282M17510.f4373;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i2 = 0;
            while (size < size2) {
                i2 += ((C5851) list.get(size)).f19295;
                size++;
            }
            size = (i2 / list.size()) + c1282M17510.f4364;
        }
        if (size != 0 && (i = iM2712 / size) >= 1) {
            return i;
        }
        return 1;
    }
}
