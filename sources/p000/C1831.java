package p000;

/* JADX INFO: renamed from: ۥَٜؕٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1831 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1633 f6081;

    /* JADX INFO: renamed from: ۥُ */
    public final C1633 f6082;

    /* JADX INFO: renamed from: ۥّ */
    public final C1633 f6083;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1633 f6084;

    /* JADX INFO: renamed from: ۥۜ */
    public final C1633 f6085;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1633 f6086;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1633 f6087;

    /* JADX INFO: renamed from: ۦۙ */
    public final C1633 f6088;

    public C1831() {
        C1633 c1633 = AbstractC2325.f7696;
        C1633 c1634 = AbstractC2325.f7694;
        C1633 c1635 = AbstractC2325.f7691;
        C1633 c1636 = AbstractC2325.f7697;
        C1633 c1637 = AbstractC2325.f7693;
        C1633 c1638 = AbstractC2325.f7692;
        C1633 c1639 = AbstractC2325.f7699;
        C1633 c16310 = AbstractC2325.f7695;
        this.f6086 = c1633;
        this.f6084 = c1634;
        this.f6081 = c1635;
        this.f6087 = c1636;
        this.f6082 = c1637;
        this.f6083 = c1638;
        this.f6088 = c1639;
        this.f6085 = c16310;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1831)) {
            return false;
        }
        C1831 c1831 = (C1831) obj;
        return AbstractC3831.m6874(this.f6086, c1831.f6086) && AbstractC3831.m6874(this.f6084, c1831.f6084) && AbstractC3831.m6874(this.f6081, c1831.f6081) && AbstractC3831.m6874(this.f6087, c1831.f6087) && AbstractC3831.m6874(this.f6082, c1831.f6082) && AbstractC3831.m6874(this.f6083, c1831.f6083) && AbstractC3831.m6874(this.f6088, c1831.f6088) && AbstractC3831.m6874(this.f6085, c1831.f6085);
    }

    public final int hashCode() {
        return this.f6085.hashCode() + ((this.f6088.hashCode() + ((this.f6083.hashCode() + ((this.f6082.hashCode() + ((this.f6087.hashCode() + ((this.f6081.hashCode() + ((this.f6084.hashCode() + (this.f6086.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f6086 + ", small=" + this.f6084 + ", medium=" + this.f6081 + ", large=" + this.f6087 + ", largeIncreased=" + this.f6083 + ", extraLarge=" + this.f6082 + ", extralargeIncreased=" + this.f6088 + ", extraExtraLarge=" + this.f6085 + ')';
    }
}
