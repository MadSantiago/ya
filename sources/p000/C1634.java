package p000;

/* JADX INFO: renamed from: ۥؘٙؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1634 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final float f5475;

    /* JADX INFO: renamed from: ۦۨ */
    public final float f5476;

    public C1634(float f, float f2) {
        this.f5476 = f;
        this.f5475 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634)) {
            return false;
        }
        C1634 c1634 = (C1634) obj;
        return Float.compare(this.f5476, c1634.f5476) == 0 && Float.compare(this.f5475, c1634.f5475) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5475) + (Float.hashCode(this.f5476) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f5476);
        sb.append(", fontScale=");
        return AbstractC3761.m6639(sb, this.f5475, ')');
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return this.f5476;
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return this.f5475;
    }
}
