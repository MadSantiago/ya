package p000;

/* JADX INFO: renamed from: ۥؘٙؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1688 extends AbstractC4258 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3760 f5617;

    public C1688(C3760 c3760) {
        EnumC1600 enumC1600 = EnumC1600.f5372;
        this.f5617 = c3760;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4258)) {
            return false;
        }
        if (!this.f5617.equals(((C1688) ((AbstractC4258) obj)).f5617)) {
            return false;
        }
        Object obj2 = EnumC1600.f5372;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f5617.hashCode() ^ 1000003) * 1000003) ^ EnumC1600.f5372.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f5617 + ", productIdOrigin=" + EnumC1600.f5372 + "}";
    }
}
