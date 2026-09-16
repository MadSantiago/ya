package p000;

/* JADX INFO: renamed from: ۥٟؔؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1997 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f6580;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f6581;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6582;

    public C1997(int i, int i2, boolean z) {
        this.f6582 = i;
        this.f6581 = i2;
        this.f6580 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1997)) {
            return false;
        }
        C1997 c1997 = (C1997) obj;
        return this.f6582 == c1997.f6582 && this.f6581 == c1997.f6581 && this.f6580 == c1997.f6580;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6580) + AbstractC2049.m3999(this.f6581, Integer.hashCode(this.f6582) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f6582 + ", end=" + this.f6581 + ", isRtl=" + this.f6580 + ')';
    }
}
