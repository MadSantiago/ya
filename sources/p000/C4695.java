package p000;

/* JADX INFO: renamed from: ۦٜؕۡٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4695 {

    /* JADX INFO: renamed from: ۥۗ */
    public float f15483;

    /* JADX INFO: renamed from: ۥۣ */
    public float f15484;

    /* JADX INFO: renamed from: ۥۗ */
    public double m8042(float f) {
        float[] fArr = AbstractC3671.f12269;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f15484 * this.f15483)));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C2550 m8043(float f) {
        double dM8042 = m8042(f);
        double d = AbstractC0362.f1315;
        double d2 = d - 1.0d;
        return new C2550(f, (float) (Math.exp((d / d2) * dM8042) * ((double) (this.f15484 * this.f15483))), (long) (Math.exp(dM8042 / d2) * 1000.0d));
    }
}
