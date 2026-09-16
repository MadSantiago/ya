package p000;

/* JADX INFO: renamed from: ۥٞؗۛؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1973 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f6530;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f6531;

    public C1973(int i, int i2) {
        this.f6531 = i;
        this.f6530 = i2;
        if (!(i >= 0)) {
            AbstractC4690.m8038("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC4690.m8038("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1973)) {
            return false;
        }
        C1973 c1973 = (C1973) obj;
        return this.f6531 == c1973.f6531 && this.f6530 == c1973.f6530;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6530) + (Integer.hashCode(this.f6531) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f6531);
        sb.append(", end=");
        return AbstractC3761.m6638(sb, this.f6530, ')');
    }
}
