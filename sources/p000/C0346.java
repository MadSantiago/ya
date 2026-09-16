package p000;

/* JADX INFO: renamed from: ۥؓؗ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0346 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f1275;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1276;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1277;

    public C0346(int i, int i2, String str) {
        this.f1277 = str;
        this.f1276 = i;
        this.f1275 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0346)) {
            return false;
        }
        C0346 c0346 = (C0346) obj;
        return this.f1277.equals(c0346.f1277) && this.f1276 == c0346.f1276 && this.f1275 == c0346.f1275;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1275) + AbstractC2049.m3999(this.f1276, this.f1277.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioBoxData(id=");
        sb.append(this.f1277);
        sb.append(", label=");
        sb.append(this.f1276);
        sb.append(", mode=");
        return AbstractC3761.m6630(this.f1275, ")", sb);
    }
}
