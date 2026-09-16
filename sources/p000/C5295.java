package p000;

/* JADX INFO: renamed from: ۦِۜؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5295 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17440;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f17441;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17442;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17443;

    public C5295(int i, int i2, int i3, int i4) {
        this.f17442 = i;
        this.f17441 = i2;
        this.f17440 = i3;
        this.f17443 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5295)) {
            return false;
        }
        C5295 c5295 = (C5295) obj;
        return this.f17442 == c5295.f17442 && this.f17441 == c5295.f17441 && this.f17440 == c5295.f17440 && this.f17443 == c5295.f17443;
    }

    public final int hashCode() {
        return (((((this.f17442 * 31) + this.f17441) * 31) + this.f17440) * 31) + this.f17443;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f17442);
        sb.append(", top=");
        sb.append(this.f17441);
        sb.append(", right=");
        sb.append(this.f17440);
        sb.append(", bottom=");
        return AbstractC3761.m6638(sb, this.f17443, ')');
    }
}
