package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٜؒۦٍ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1816 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f6039;

    /* JADX INFO: renamed from: ۥۣ */
    public int[] f6040;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        int[] iArr = this.f6040;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f6040 = Arrays.copyOf(iArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return new C5576(Arrays.copyOf(this.f6040, this.f6039));
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f6039;
    }
}
