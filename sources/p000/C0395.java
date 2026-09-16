package p000;

/* JADX INFO: renamed from: ۥؔؔٙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0395 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2351 f1458;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f1459;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f1460;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2351 f1461;

    public C0395(String str, String str2, C2351 c2351, C2351 c2352) {
        this.f1460 = str;
        this.f1459 = str2;
        this.f1458 = c2351;
        this.f1461 = c2352;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0395)) {
            return false;
        }
        C0395 c0395 = (C0395) obj;
        return AbstractC3831.m6874(this.f1460, c0395.f1460) && AbstractC3831.m6874(this.f1459, c0395.f1459) && AbstractC3831.m6874(this.f1458, c0395.f1458) && AbstractC3831.m6874(this.f1461, c0395.f1461);
    }

    public final int hashCode() {
        return this.f1461.hashCode() + ((this.f1458.hashCode() + AbstractC5078.m8674(this.f1460.hashCode() * 31, 31, this.f1459)) * 31);
    }

    public final String toString() {
        return "SingleParams(prefsKey=" + this.f1460 + ", logMethod=" + this.f1459 + ", cFilters=" + this.f1458 + ", mFilters=" + this.f1461 + ")";
    }
}
