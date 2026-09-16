package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥؘُۤؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2698 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f8945;

    /* JADX INFO: renamed from: ۥۣ */
    public short[] f8946;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        short[] sArr = this.f8946;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f8946 = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return new C2560(Arrays.copyOf(this.f8946, this.f8945));
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f8945;
    }
}
