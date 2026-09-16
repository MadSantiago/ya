package p000;

/* JADX INFO: renamed from: ۥٟۢؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 extends AbstractC3054 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6694;

    /* JADX INFO: renamed from: ۥُ */
    public final long f6695;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f6696;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f6697;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f6698;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6699;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f6700;

    /* JADX INFO: renamed from: ۦٛ */
    public final String f6701;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f6702;

    public C2033(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f6699 = i;
        this.f6697 = str;
        this.f6694 = i2;
        this.f6700 = j;
        this.f6695 = j2;
        this.f6696 = z;
        this.f6702 = i3;
        this.f6698 = str2;
        this.f6701 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3054) {
            C2033 c2033 = (C2033) ((AbstractC3054) obj);
            if (this.f6699 == c2033.f6699 && this.f6697.equals(c2033.f6697) && this.f6694 == c2033.f6694 && this.f6700 == c2033.f6700 && this.f6695 == c2033.f6695 && this.f6696 == c2033.f6696 && this.f6702 == c2033.f6702 && this.f6698.equals(c2033.f6698) && this.f6701.equals(c2033.f6701)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f6699 ^ 1000003) * 1000003) ^ this.f6697.hashCode()) * 1000003) ^ this.f6694) * 1000003;
        long j = this.f6700;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f6695;
        return this.f6701.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f6696 ? 1231 : 1237)) * 1000003) ^ this.f6702) * 1000003) ^ this.f6698.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f6699);
        sb.append(", model=");
        sb.append(this.f6697);
        sb.append(", cores=");
        sb.append(this.f6694);
        sb.append(", ram=");
        sb.append(this.f6700);
        sb.append(", diskSpace=");
        sb.append(this.f6695);
        sb.append(", simulator=");
        sb.append(this.f6696);
        sb.append(", state=");
        sb.append(this.f6702);
        sb.append(", manufacturer=");
        sb.append(this.f6698);
        sb.append(", modelClass=");
        return AbstractC3761.m6621(sb, this.f6701, "}");
    }
}
