package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦٟۡؓٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5455 extends AbstractC5574 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f17984;

    /* JADX INFO: renamed from: ۥُ */
    public final long f17985;

    /* JADX INFO: renamed from: ۥّ */
    public final long f17986;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f17987;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f17988;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f17989;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f17990;

    /* JADX INFO: renamed from: ۦٛ */
    public final List f17991;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f17992;

    public C5455(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.f17989 = i;
        this.f17987 = str;
        this.f17984 = i2;
        this.f17990 = i3;
        this.f17985 = j;
        this.f17986 = j2;
        this.f17992 = j3;
        this.f17988 = str2;
        this.f17991 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5574) {
            C5455 c5455 = (C5455) ((AbstractC5574) obj);
            if (this.f17989 == c5455.f17989 && this.f17987.equals(c5455.f17987) && this.f17984 == c5455.f17984 && this.f17990 == c5455.f17990 && this.f17985 == c5455.f17985 && this.f17986 == c5455.f17986 && this.f17992 == c5455.f17992) {
                String str = c5455.f17988;
                String str2 = this.f17988;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c5455.f17991;
                    List list2 = this.f17991;
                    if (list2 != null ? list2.equals(list) : list == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f17989 ^ 1000003) * 1000003) ^ this.f17987.hashCode()) * 1000003) ^ this.f17984) * 1000003) ^ this.f17990) * 1000003;
        long j = this.f17985;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f17986;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f17992;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f17988;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f17991;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f17989 + ", processName=" + this.f17987 + ", reasonCode=" + this.f17984 + ", importance=" + this.f17990 + ", pss=" + this.f17985 + ", rss=" + this.f17986 + ", timestamp=" + this.f17992 + ", traceFile=" + this.f17988 + ", buildIdMappingForArch=" + this.f17991 + "}";
    }
}
