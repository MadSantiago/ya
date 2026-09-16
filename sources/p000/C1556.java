package p000;

/* JADX INFO: renamed from: ۥ٘ؒؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1556 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1757 f5244;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2616 f5245;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2443 f5246;

    public C1556(C2443 c2443, C2616 c2616, C1757 c1757) {
        this.f5246 = c2443;
        this.f5245 = c2616;
        this.f5244 = c1757;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1556)) {
            return false;
        }
        C1556 c1556 = (C1556) obj;
        return this.f5246.equals(c1556.f5246) && this.f5245.equals(c1556.f5245) && this.f5244.equals(c1556.f5244);
    }

    public final int hashCode() {
        return this.f5244.hashCode() ^ ((((this.f5246.hashCode() ^ 1000003) * 1000003) ^ this.f5245.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f5246 + ", osData=" + this.f5245 + ", deviceData=" + this.f5244 + "}";
    }
}
