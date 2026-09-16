package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ۥُٓؕۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1282 implements InterfaceC5370 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f4361;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 f4362;

    /* JADX INFO: renamed from: ۥّ */
    public final float f4363;

    /* JADX INFO: renamed from: ۥْ */
    public final int f4364;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f4365;

    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC4643 f4366;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5851 f4367;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f4368;

    /* JADX INFO: renamed from: ۦؚ */
    public final int f4369;

    /* JADX INFO: renamed from: ۦٌ */
    public final int f4370;

    /* JADX INFO: renamed from: ۦِ */
    public final long f4371;

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC2880 f4372;

    /* JADX INFO: renamed from: ۦۗ */
    public final List f4373;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f4374;

    /* JADX INFO: renamed from: ۦۚ */
    public final int f4375;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f4376;

    /* JADX INFO: renamed from: ۦۨ */
    public final EnumC1616 f4377;

    public C1282(C5851 c5851, int i, boolean z, float f, InterfaceC5370 interfaceC5370, float f2, boolean z2, InterfaceC4643 interfaceC4643, InterfaceC2880 interfaceC2880, long j, List list, int i2, int i3, int i4, EnumC1616 enumC1616, int i5, int i6) {
        this.f4367 = c5851;
        this.f4365 = i;
        this.f4361 = z;
        this.f4368 = f;
        this.f4362 = interfaceC5370;
        this.f4363 = f2;
        this.f4374 = z2;
        this.f4366 = interfaceC4643;
        this.f4372 = interfaceC2880;
        this.f4371 = j;
        this.f4373 = list;
        this.f4369 = i2;
        this.f4370 = i3;
        this.f4375 = i4;
        this.f4377 = enumC1616;
        this.f4376 = i5;
        this.f4364 = i6;
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo618() {
        return this.f4362.mo618();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥُ */
    public final int mo619() {
        return this.f4362.mo619();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C1282 m2710(int i, boolean z) {
        C5851 c5851;
        if (this.f4374) {
            return null;
        }
        List list = this.f4373;
        if (list.isEmpty() || (c5851 = this.f4367) == null) {
            return null;
        }
        int i2 = c5851.f19291;
        int i3 = this.f4365 - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        C5851 c5852 = (C5851) AbstractC0973.m2045(list);
        C5851 c5853 = (C5851) AbstractC0973.m2040(list);
        if (c5852.f19297 || c5853.f19297) {
            return null;
        }
        int i4 = c5852.f19293;
        int i5 = this.f4370;
        int i6 = this.f4369;
        if (i < 0) {
            if (Math.min((i4 + c5852.f19291) - i6, (c5853.f19293 + c5853.f19291) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - c5853.f19293) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C5851 c5854 = (C5851) list.get(i7);
            c5854.getClass();
            int[] iArr = c5854.f19298;
            if (!c5854.f19297) {
                c5854.f19293 += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = c5854.f19287.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        AbstractC2049.m4001(((C3262) c5854.f19294.f1727).m6027(c5854.f19296));
                    }
                }
            }
        }
        return new C1282(this.f4367, i3, this.f4361 || i > 0, i, this.f4362, this.f4363, this.f4374, this.f4366, this.f4372, this.f4371, list, this.f4369, this.f4370, this.f4375, this.f4377, this.f4376, this.f4364);
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo620() {
        this.f4362.mo620();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۥۣ */
    public final Map mo621() {
        return this.f4362.mo621();
    }

    @Override // p000.InterfaceC5370
    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC4745 mo2711() {
        return this.f4362.mo2711();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final long m2712() {
        InterfaceC5370 interfaceC5370 = this.f4362;
        return (((long) interfaceC5370.mo619()) << 32) | (((long) interfaceC5370.mo618()) & 4294967295L);
    }
}
