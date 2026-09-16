package p000;

/* JADX INFO: renamed from: ۦٖؖؐۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4310 implements InterfaceC4396 {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f14252;

    public C4310(int i) {
        this.f14252 = i;
    }

    @Override // p000.InterfaceC4396
    /* JADX INFO: renamed from: ۥؗ */
    public final long mo7596(C4730 c4730, long j, EnumC2459 enumC2459, long j2) {
        int i = c4730.f15612;
        int i2 = c4730.f15610;
        int i3 = (int) (j2 >> 32);
        int i4 = (((i2 - i) - i3) / 2) + i;
        if (i4 >= 0) {
            i = i4 + i3 > ((int) (j >> 32)) ? i2 - i3 : i4;
        }
        int i5 = c4730.f15611 - ((int) (j2 & 4294967295L));
        int i6 = this.f14252;
        int i7 = i5 - i6;
        if (i7 < 0) {
            i7 = c4730.f15613 + i6;
        }
        return (((long) i) << 32) | (((long) i7) & 4294967295L);
    }
}
