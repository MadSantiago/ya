package p000;

/* JADX INFO: renamed from: ۦؑؔۤؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3039 implements InterfaceC5807 {

    /* JADX INFO: renamed from: ۥۗ */
    public final float f10212;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f10213;

    public C3039(float f, float f2) {
        this.f10213 = f;
        this.f10212 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3039)) {
            return false;
        }
        C3039 c3039 = (C3039) obj;
        return Float.compare(this.f10213, c3039.f10213) == 0 && Float.compare(this.f10212, c3039.f10212) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10212) + (Float.hashCode(this.f10213) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f10213);
        sb.append(", verticalBias=");
        return AbstractC3761.m6639(sb, this.f10212, ')');
    }

    @Override // p000.InterfaceC5807
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo608(long j, long j2, EnumC2459 enumC2459) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        EnumC2459 enumC24510 = EnumC2459.f8215;
        float f3 = this.f10213;
        if (enumC2459 != enumC24510) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.f10212) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }
}
