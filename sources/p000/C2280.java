package p000;

/* JADX INFO: renamed from: ۥۚؕٛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2280 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f7573;

    /* JADX INFO: renamed from: ۥُ */
    public long f7574;

    /* JADX INFO: renamed from: ۥّ */
    public long f7575;

    /* JADX INFO: renamed from: ۥۗ */
    public int f7576;

    /* JADX INFO: renamed from: ۥۜ */
    public float f7577;

    /* JADX INFO: renamed from: ۥۣ */
    public int f7578;

    /* JADX INFO: renamed from: ۦؑ */
    public float f7579;

    /* JADX INFO: renamed from: ۦٛ */
    public int f7580;

    /* JADX INFO: renamed from: ۦۙ */
    public long f7581;

    /* JADX INFO: renamed from: ۥۣ */
    public final float m4340(long j) {
        long j2 = this.f7574;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f7581;
        if (j3 < 0 || j < j3) {
            return ViewOnTouchListenerC4081.m7265((j - j2) / this.f7578, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f7577;
        return (ViewOnTouchListenerC4081.m7265((j - j3) / this.f7580, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
