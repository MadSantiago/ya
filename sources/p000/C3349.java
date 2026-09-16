package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦِْؖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3349 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f11199;

    /* JADX INFO: renamed from: ۥۣ */
    public double[] f11200;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        double[] dArr = this.f11200;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f11200 = Arrays.copyOf(dArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f11200, this.f11199);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f11199;
    }
}
