package p000;

/* JADX INFO: renamed from: ۥَؓۖؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1000 {

    /* JADX INFO: renamed from: ۥۣ */
    public float f3578 = 0.0f;

    /* JADX INFO: renamed from: ۥۗ */
    public float f3577 = 0.0f;

    /* JADX INFO: renamed from: ۥؗ */
    public float f3576 = 0.0f;

    /* JADX INFO: renamed from: ۦؑ */
    public float f3579 = 0.0f;

    public final String toString() {
        return "MutableRect(" + C3133.m5791(this.f3578) + ", " + C3133.m5791(this.f3577) + ", " + C3133.m5791(this.f3576) + ", " + C3133.m5791(this.f3579) + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2182(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f3578 += fIntBitsToFloat;
        this.f3577 += fIntBitsToFloat2;
        this.f3576 += fIntBitsToFloat;
        this.f3579 += fIntBitsToFloat2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m2183() {
        return (this.f3578 >= this.f3576) | (this.f3577 >= this.f3579);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2184(float f, float f2, float f3, float f4) {
        this.f3578 = Math.max(f, this.f3578);
        this.f3577 = Math.max(f2, this.f3577);
        this.f3576 = Math.min(f3, this.f3576);
        this.f3579 = Math.min(f4, this.f3579);
    }
}
