package p000;

/* JADX INFO: renamed from: ۥٖؗؓٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0593 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1393 f2199;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f2200;

    public C0593() {
        long jM7443 = AbstractC4225.m7443(4284900966L);
        C1393 c1393 = new C1393(0.0f, 0.0f, 0.0f, 0.0f);
        this.f2200 = jM7443;
        this.f2199 = c1393;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0593.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C0593 c0593 = (C0593) obj;
        long j = c0593.f2200;
        int i = C1327.f4593;
        return C4462.m7744(this.f2200, j) && this.f2199.equals(c0593.f2199);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return this.f2199.hashCode() + (Long.hashCode(this.f2200) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC5078.m8677(this.f2200, sb, ", drawPadding=");
        sb.append(this.f2199);
        sb.append(')');
        return sb.toString();
    }
}
