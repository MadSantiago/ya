package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥ٘ؗٗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1608 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f5404;

    /* JADX INFO: renamed from: ۥۣ */
    public long[] f5405;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        long[] jArr = this.f5405;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f5405 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f5405, this.f5404);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f5404;
    }
}
