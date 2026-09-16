package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٔؕٗٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1349 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f4638;

    /* JADX INFO: renamed from: ۥۣ */
    public long[] f4639;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        long[] jArr = this.f4639;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f4639 = Arrays.copyOf(jArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return new C4556(Arrays.copyOf(this.f4639, this.f4638));
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f4638;
    }
}
