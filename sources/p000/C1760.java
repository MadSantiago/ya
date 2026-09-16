package p000;

/* JADX INFO: renamed from: ۥِۣٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1760 {

    /* JADX INFO: renamed from: ۥؗ */
    public final double f5863;

    /* JADX INFO: renamed from: ۥۗ */
    public final EnumC4018 f5864;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC4018 f5865;

    public C1760(EnumC4018 enumC4018, EnumC4018 enumC4019, double d) {
        this.f5865 = enumC4018;
        this.f5864 = enumC4019;
        this.f5863 = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1760)) {
            return false;
        }
        C1760 c1760 = (C1760) obj;
        return this.f5865 == c1760.f5865 && this.f5864 == c1760.f5864 && Double.compare(this.f5863, c1760.f5863) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5863) + ((this.f5864.hashCode() + (this.f5865.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f5865 + ", crashlytics=" + this.f5864 + ", sessionSamplingRate=" + this.f5863 + ')';
    }
}
