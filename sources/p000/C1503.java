package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٗؑٙۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1503 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f5110;

    /* JADX INFO: renamed from: ۥۣ */
    public int[] f5111;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        int[] iArr = this.f5111;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5111 = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f5111, this.f5110);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f5110;
    }
}
