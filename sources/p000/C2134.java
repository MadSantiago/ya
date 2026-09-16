package p000;

/* JADX INFO: renamed from: ۥۘؑؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2134 extends AbstractC1289 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1081 f7007;

    public C2134(C1081 c1081) {
        this.f7007 = c1081;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1289)) {
            return false;
        }
        AbstractC1289 abstractC1289 = (AbstractC1289) obj;
        Object obj2 = EnumC2206.f7314;
        if (obj2.equals(obj2)) {
            return this.f7007.equals(((C2134) abstractC1289).f7007);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7007.hashCode() ^ ((EnumC2206.f7314.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC2206.f7314 + ", androidClientInfo=" + this.f7007 + "}";
    }
}
