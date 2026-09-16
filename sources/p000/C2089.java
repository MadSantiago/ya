package p000;

/* JADX INFO: renamed from: ۥۗؑؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2089 extends AbstractC4479 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6881;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f6882;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC1237 f6883;

    public C2089(AbstractC1237 abstractC1237, String str, int i) {
        this.f6883 = abstractC1237;
        this.f6882 = str;
        this.f6881 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2089)) {
            return false;
        }
        C2089 c2089 = (C2089) obj;
        return this.f6883.equals(c2089.f6883) && AbstractC3831.m6874(this.f6882, c2089.f6882) && this.f6881 == c2089.f6881;
    }

    public final int hashCode() {
        int iHashCode = this.f6883.hashCode() * 31;
        String str = this.f6882;
        return AbstractC3761.m6632(this.f6881) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
