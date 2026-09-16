package p000;

/* JADX INFO: renamed from: ۥؒٛ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0286 implements InterfaceC5807 {

    /* JADX INFO: renamed from: ۥۣ */
    public final float f1064;

    public C0286(float f) {
        this.f1064 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0286) && Float.compare(this.f1064, ((C0286) obj).f1064) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f1064) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f1064 + ", verticalBias=-1.0)";
    }

    @Override // p000.InterfaceC5807
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo608(long j, long j2, EnumC2459 enumC2459) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) Math.round((1.0f + this.f1064) * (((int) (j3 >> 32)) / 2.0f))) << 32) | (((long) Math.round(0.0f * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L);
    }
}
