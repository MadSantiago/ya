package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦۙؒۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5095 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f16890;

    /* JADX INFO: renamed from: ۥۣ */
    public short[] f16891;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        short[] sArr = this.f16891;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f16891 = Arrays.copyOf(sArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f16891, this.f16890);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f16890;
    }
}
