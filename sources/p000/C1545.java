package p000;

/* JADX INFO: renamed from: ۥّٗؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1545 {

    /* JADX INFO: renamed from: ۥؗ */
    public long f5222;

    /* JADX INFO: renamed from: ۥُ */
    public long f5223;

    /* JADX INFO: renamed from: ۥّ */
    public long f5224;

    /* JADX INFO: renamed from: ۥۗ */
    public C2321 f5225;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4912 f5226;

    /* JADX INFO: renamed from: ۦؑ */
    public long f5227;

    /* JADX INFO: renamed from: ۦۙ */
    public float[] f5228;

    public C1545() {
        C4912 c4912 = AbstractC0137.f547;
        this.f5226 = new C4912();
        this.f5222 = -1L;
        this.f5227 = 0L;
        this.f5223 = 0L;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m3294(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (C0873.m1863(j2, this.f5227)) {
            z = false;
        } else {
            this.f5227 = j2;
            z = true;
        }
        if (!C0873.m1863(j, this.f5223)) {
            this.f5223 = j;
            z = true;
        }
        if (fArr != null) {
            this.f5228 = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f5224) {
            return z;
        }
        this.f5224 = j3;
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3295(C2321 c2321, long j, long j2, float[] fArr, long j3) {
        long j4 = c2321.f7681;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            c2321.f7681 = j3;
            c2321.m4365(c2321.f7675, c2321.f7676, j, j2, fArr);
        }
    }
}
