package p000;

/* JADX INFO: renamed from: ۥٕؔۗۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1403 extends AbstractC1742 {

    /* JADX INFO: renamed from: ۥۗ */
    public final String f4831;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f4832;

    public C1403(String str, String str2) {
        this.f4832 = str;
        this.f4831 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1742) {
            C1403 c1403 = (C1403) ((AbstractC1742) obj);
            if (this.f4832.equals(c1403.f4832) && this.f4831.equals(c1403.f4831)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4831.hashCode() ^ ((this.f4832.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f4832);
        sb.append(", variantId=");
        return AbstractC3761.m6621(sb, this.f4831, "}");
    }
}
