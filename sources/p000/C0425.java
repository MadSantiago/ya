package p000;

/* JADX INFO: renamed from: ۥؙؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0425 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f1537;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1538;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5541 f1539;

    public C0425(C5541 c5541, int i, int i2) {
        this.f1539 = c5541;
        this.f1538 = i;
        this.f1537 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0425) {
            C0425 c0425 = (C0425) obj;
            if (this.f1539 == c0425.f1539 && this.f1538 == c0425.f1538 && this.f1537 == c0425.f1537) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1537) + AbstractC2049.m3999(this.f1538, this.f1539.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f1539);
        sb.append(", startIndex=");
        sb.append(this.f1538);
        sb.append(", endIndex=");
        return AbstractC3761.m6638(sb, this.f1537, ')');
    }
}
