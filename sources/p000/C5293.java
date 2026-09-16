package p000;

/* JADX INFO: renamed from: ۦۜؕۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5293 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f17430;

    /* JADX INFO: renamed from: ۥُ */
    public final long f17431;

    /* JADX INFO: renamed from: ۥّ */
    public final long f17432;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f17433;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f17434;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f17435;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f17436;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f17437;

    static {
        AbstractC1631.m3418(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public C5293(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f17435 = f;
        this.f17433 = f2;
        this.f17430 = f3;
        this.f17436 = f4;
        this.f17431 = j;
        this.f17432 = j2;
        this.f17437 = j3;
        this.f17434 = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5293)) {
            return false;
        }
        C5293 c5293 = (C5293) obj;
        return Float.compare(this.f17435, c5293.f17435) == 0 && Float.compare(this.f17433, c5293.f17433) == 0 && Float.compare(this.f17430, c5293.f17430) == 0 && Float.compare(this.f17436, c5293.f17436) == 0 && AbstractC2164.m4213(this.f17431, c5293.f17431) && AbstractC2164.m4213(this.f17432, c5293.f17432) && AbstractC2164.m4213(this.f17437, c5293.f17437) && AbstractC2164.m4213(this.f17434, c5293.f17434);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17434) + AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6635(this.f17436, AbstractC3761.m6635(this.f17430, AbstractC3761.m6635(this.f17433, Float.hashCode(this.f17435) * 31, 31), 31), 31), 31, this.f17431), 31, this.f17432), 31, this.f17437);
    }

    public final String toString() {
        String str = C3133.m5791(this.f17435) + ", " + C3133.m5791(this.f17433) + ", " + C3133.m5791(this.f17430) + ", " + C3133.m5791(this.f17436);
        long j = this.f17431;
        long j2 = this.f17432;
        boolean zM4213 = AbstractC2164.m4213(j, j2);
        long j3 = this.f17437;
        long j4 = this.f17434;
        if (!zM4213 || !AbstractC2164.m4213(j2, j3) || !AbstractC2164.m4213(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC2164.m4216(j)) + ", topRight=" + ((Object) AbstractC2164.m4216(j2)) + ", bottomRight=" + ((Object) AbstractC2164.m4216(j3)) + ", bottomLeft=" + ((Object) AbstractC2164.m4216(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + C3133.m5791(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + C3133.m5791(Float.intBitsToFloat(i)) + ", y=" + C3133.m5791(Float.intBitsToFloat(i2)) + ')';
    }
}
