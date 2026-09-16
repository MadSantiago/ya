package p000;

/* JADX INFO: renamed from: ۦِٝؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4730 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C4730 f15609 = new C4730(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f15610;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f15611;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f15612;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f15613;

    public C4730(int i, int i2, int i3, int i4) {
        this.f15612 = i;
        this.f15611 = i2;
        this.f15610 = i3;
        this.f15613 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4730)) {
            return false;
        }
        C4730 c4730 = (C4730) obj;
        return this.f15612 == c4730.f15612 && this.f15611 == c4730.f15611 && this.f15610 == c4730.f15610 && this.f15613 == c4730.f15613;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15613) + AbstractC2049.m3999(this.f15610, AbstractC2049.m3999(this.f15611, Integer.hashCode(this.f15612) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f15612);
        sb.append(", ");
        sb.append(this.f15611);
        sb.append(", ");
        sb.append(this.f15610);
        sb.append(", ");
        return AbstractC3761.m6638(sb, this.f15613, ')');
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m8055() {
        return (((long) this.f15612) << 32) | (((long) this.f15611) & 4294967295L);
    }
}
