package p000;

/* JADX INFO: renamed from: ۥۦٍؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2793 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C2793 f9340 = new C2793(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: ۥؗ */
    public final float f9341;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f9342;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f9343;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f9344;

    public C2793(float f, float f2, float f3, float f4) {
        this.f9343 = f;
        this.f9342 = f2;
        this.f9341 = f3;
        this.f9344 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2793)) {
            return false;
        }
        C2793 c2793 = (C2793) obj;
        return Float.compare(this.f9343, c2793.f9343) == 0 && Float.compare(this.f9342, c2793.f9342) == 0 && Float.compare(this.f9341, c2793.f9341) == 0 && Float.compare(this.f9344, c2793.f9344) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9344) + AbstractC3761.m6635(this.f9341, AbstractC3761.m6635(this.f9342, Float.hashCode(this.f9343) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + C3133.m5791(this.f9343) + ", " + C3133.m5791(this.f9342) + ", " + C3133.m5791(this.f9341) + ", " + C3133.m5791(this.f9344) + ')';
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final long m5316() {
        float f = this.f9341 - this.f9343;
        return (((long) Float.floatToRawIntBits(this.f9344 - this.f9342)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C2793 m5317(C2793 c2793) {
        return new C2793(Math.max(this.f9343, c2793.f9343), Math.max(this.f9342, c2793.f9342), Math.min(this.f9341, c2793.f9341), Math.min(this.f9344, c2793.f9344));
    }

    /* JADX INFO: renamed from: ۥّ */
    public final boolean m5318() {
        return (this.f9343 >= this.f9341) | (this.f9342 >= this.f9344);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final long m5319() {
        float f = this.f9341;
        float f2 = this.f9343;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f9344;
        float f5 = this.f9342;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final C2793 m5320(float f, float f2) {
        return new C2793(this.f9343 + f, this.f9342 + f2, this.f9341 + f, this.f9344 + f2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5321(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f9343) & (fIntBitsToFloat < this.f9341) & (fIntBitsToFloat2 >= this.f9342) & (fIntBitsToFloat2 < this.f9344);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final long m5322() {
        return (((long) Float.floatToRawIntBits(this.f9343)) << 32) | (((long) Float.floatToRawIntBits(this.f9342)) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final C2793 m5323(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C2793(Float.intBitsToFloat(i) + this.f9343, Float.intBitsToFloat(i2) + this.f9342, Float.intBitsToFloat(i) + this.f9341, Float.intBitsToFloat(i2) + this.f9344);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m5324(C2793 c2793) {
        return (this.f9343 < c2793.f9341) & (c2793.f9343 < this.f9341) & (this.f9342 < c2793.f9344) & (c2793.f9342 < this.f9344);
    }
}
