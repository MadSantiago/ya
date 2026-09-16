package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًؒۘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3653 extends AbstractC4622 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2134 f12220;

    /* JADX INFO: renamed from: ۥُ */
    public final String f12221;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f12222;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f12223;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f12224;

    /* JADX INFO: renamed from: ۦؑ */
    public final Integer f12225;

    public C3653(long j, long j2, C2134 c2134, Integer num, String str, ArrayList arrayList) {
        EnumC5117 enumC5117 = EnumC5117.f16966;
        this.f12224 = j;
        this.f12223 = j2;
        this.f12220 = c2134;
        this.f12225 = num;
        this.f12221 = str;
        this.f12222 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4622)) {
            return false;
        }
        C3653 c3653 = (C3653) ((AbstractC4622) obj);
        if (this.f12224 != c3653.f12224 || this.f12223 != c3653.f12223 || !this.f12220.equals(c3653.f12220)) {
            return false;
        }
        Integer num = c3653.f12225;
        Integer num2 = this.f12225;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = c3653.f12221;
        String str2 = this.f12221;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f12222.equals(c3653.f12222)) {
            return false;
        }
        Object obj2 = EnumC5117.f16966;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f12224;
        long j2 = this.f12223;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12220.hashCode()) * 1000003;
        Integer num = this.f12225;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f12221;
        return ((this.f12222.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ EnumC5117.f16966.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f12224 + ", requestUptimeMs=" + this.f12223 + ", clientInfo=" + this.f12220 + ", logSource=" + this.f12225 + ", logSourceName=" + this.f12221 + ", logEvents=" + this.f12222 + ", qosTier=" + EnumC5117.f16966 + "}";
    }
}
