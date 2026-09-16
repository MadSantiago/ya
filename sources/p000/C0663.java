package p000;

/* JADX INFO: renamed from: ۥؘؓؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0663 extends AbstractC5769 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Integer f2447;

    public C0663(Integer num) {
        this.f2447 = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5769)) {
            return false;
        }
        Integer num = this.f2447;
        C0663 c0663 = (C0663) ((AbstractC5769) obj);
        if (num == null) {
            return c0663.f2447 == null;
        }
        return num.equals(c0663.f2447);
    }

    public final int hashCode() {
        Integer num = this.f2447;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f2447 + "}";
    }
}
