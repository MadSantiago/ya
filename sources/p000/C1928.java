package p000;

/* JADX INFO: renamed from: ۥٌٞؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1928 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int[] f6353 = new int[10];

    /* JADX INFO: renamed from: ۥۣ */
    public int f6354;

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3788(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f6353;
            if (i >= iArr.length) {
                return;
            }
            this.f6354 = (1 << i) | this.f6354;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m3789() {
        if ((this.f6354 & 128) != 0) {
            return this.f6353[7];
        }
        return 65535;
    }
}
