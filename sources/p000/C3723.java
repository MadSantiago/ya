package p000;

/* JADX INFO: renamed from: ۦٌؘؔۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3723 extends AbstractC4845 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f12398;

    /* JADX INFO: renamed from: ۥُ */
    public final int f12399;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f12400;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f12401;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f12402;

    public C3723(long j, String str, String str2, long j2, int i) {
        this.f12401 = j;
        this.f12400 = str;
        this.f12398 = str2;
        this.f12402 = j2;
        this.f12399 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4845) {
            C3723 c3723 = (C3723) ((AbstractC4845) obj);
            if (this.f12401 == c3723.f12401 && this.f12400.equals(c3723.f12400)) {
                String str = c3723.f12398;
                String str2 = this.f12398;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f12402 == c3723.f12402 && this.f12399 == c3723.f12399) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12401;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f12400.hashCode()) * 1000003;
        String str = this.f12398;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f12402;
        return this.f12399 ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f12401);
        sb.append(", symbol=");
        sb.append(this.f12400);
        sb.append(", file=");
        sb.append(this.f12398);
        sb.append(", offset=");
        sb.append(this.f12402);
        sb.append(", importance=");
        return AbstractC3761.m6630(this.f12399, "}", sb);
    }
}
