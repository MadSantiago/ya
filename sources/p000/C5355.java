package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦ۟ؖٝٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5355 extends AbstractC3445 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f17622;

    /* JADX INFO: renamed from: ۥۣ */
    public byte[] f17623;

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2857(int i) {
        byte[] bArr = this.f17623;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.f17623 = Arrays.copyOf(bArr, i);
        }
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo2858() {
        return Arrays.copyOf(this.f17623, this.f17622);
    }

    @Override // p000.AbstractC3445
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo2859() {
        return this.f17622;
    }
}
