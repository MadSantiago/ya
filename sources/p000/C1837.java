package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥٜؖ۟ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1837 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f6106;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean[] f6107;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        boolean[] zArr = this.f6107;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f6107 = Arrays.copyOf(zArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f6107, this.f6106);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f6106;
    }
}
