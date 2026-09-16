package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦٚؕؖٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4558 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f15057;

    /* JADX INFO: renamed from: ۥۣ */
    public char[] f15058;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        char[] cArr = this.f15058;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f15058 = Arrays.copyOf(cArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f15058, this.f15057);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f15057;
    }
}
