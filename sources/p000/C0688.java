package p000;

/* JADX INFO: renamed from: ۥؘٜؗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0688 extends AbstractC2124 {

    /* JADX INFO: renamed from: ۥۗ */
    public final EnumC3476 f2506;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC3808 f2507;

    public C0688(EnumC3808 enumC3808, EnumC3476 enumC3476) {
        this.f2507 = enumC3808;
        this.f2506 = enumC3476;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2124) {
            AbstractC2124 abstractC2124 = (AbstractC2124) obj;
            EnumC3808 enumC3808 = this.f2507;
            if (enumC3808 != null ? enumC3808.equals(((C0688) abstractC2124).f2507) : ((C0688) abstractC2124).f2507 == null) {
                EnumC3476 enumC3476 = this.f2506;
                if (enumC3476 != null ? enumC3476.equals(((C0688) abstractC2124).f2506) : ((C0688) abstractC2124).f2506 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC3808 enumC3808 = this.f2507;
        int iHashCode = ((enumC3808 == null ? 0 : enumC3808.hashCode()) ^ 1000003) * 1000003;
        EnumC3476 enumC3476 = this.f2506;
        return iHashCode ^ (enumC3476 != null ? enumC3476.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f2507 + ", mobileSubtype=" + this.f2506 + "}";
    }
}
