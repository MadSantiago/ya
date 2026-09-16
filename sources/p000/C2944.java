package p000;

/* JADX INFO: renamed from: ۥؘۨؗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1172
public final class C2944 {
    public static final C5027 Companion = new C5027();

    /* JADX INFO: renamed from: ۥؗ */
    public final Integer f9880;

    /* JADX INFO: renamed from: ۥُ */
    public final Long f9881;

    /* JADX INFO: renamed from: ۥۗ */
    public final Double f9882;

    /* JADX INFO: renamed from: ۥۣ */
    public final Boolean f9883;

    /* JADX INFO: renamed from: ۦؑ */
    public final Integer f9884;

    public /* synthetic */ C2944(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            AbstractC5568.m9392(i, 31, C1533.f5191.mo193());
            throw null;
        }
        this.f9883 = bool;
        this.f9882 = d;
        this.f9880 = num;
        this.f9884 = num2;
        this.f9881 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2944)) {
            return false;
        }
        C2944 c2944 = (C2944) obj;
        return AbstractC3831.m6874(this.f9883, c2944.f9883) && AbstractC3831.m6874(this.f9882, c2944.f9882) && AbstractC3831.m6874(this.f9880, c2944.f9880) && AbstractC3831.m6874(this.f9884, c2944.f9884) && AbstractC3831.m6874(this.f9881, c2944.f9881);
    }

    public final int hashCode() {
        Boolean bool = this.f9883;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f9882;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f9880;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9884;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9881;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f9883 + ", sessionSamplingRate=" + this.f9882 + ", sessionTimeoutSeconds=" + this.f9880 + ", cacheDurationSeconds=" + this.f9884 + ", cacheUpdatedTimeSeconds=" + this.f9881 + ')';
    }

    public C2944(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f9883 = bool;
        this.f9882 = d;
        this.f9880 = num;
        this.f9884 = num2;
        this.f9881 = l;
    }
}
