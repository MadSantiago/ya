package p000;

/* JADX INFO: renamed from: ۥٍ٘ؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1594 extends AbstractC0941 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C4912 f5352;

    public C1594() {
        C4912 c4912 = AbstractC0137.f547;
        this.f5352 = new C4912();
    }

    @Override // p000.AbstractC0941
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo768() {
        C4912 c4912 = this.f5352;
        int[] iArr = c4912.f18947;
        Object[] objArr = c4912.f18945;
        long[] jArr = c4912.f18948;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        C2730 c2730 = (C2730) objArr[i4];
                        Object[] objArr2 = c2730.f9041;
                        int i6 = c2730.f9040;
                        for (int i7 = 0; i7 < i6; i7++) {
                            C4782 c4782 = (C4782) objArr2[i7];
                            InterfaceC1663 interfaceC1663 = c4782.f15780;
                            if (interfaceC1663 != null) {
                                interfaceC1663.cancel();
                            }
                            c4782.f15780 = null;
                            C3860 c3860 = (C3860) c4782.f15779.f10451;
                            c3860.f12891 = true;
                            c3860.f12892 = false;
                            c3860.m6893();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
