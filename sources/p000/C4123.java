package p000;

/* JADX INFO: renamed from: ۦْٓؔٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4123 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f13736;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1007 f13737;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1007 f13738;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1007 f13733 = AbstractC2776.m5247(":");

    /* JADX INFO: renamed from: ۥُ */
    public static final C1007 f13730 = AbstractC2776.m5247(":status");

    /* JADX INFO: renamed from: ۥّ */
    public static final C1007 f13731 = AbstractC2776.m5247(":method");

    /* JADX INFO: renamed from: ۦۙ */
    public static final C1007 f13735 = AbstractC2776.m5247(":path");

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1007 f13732 = AbstractC2776.m5247(":scheme");

    /* JADX INFO: renamed from: ۦٛ */
    public static final C1007 f13734 = AbstractC2776.m5247(":authority");

    public C4123(String str, String str2) {
        C1007 c1007 = new C1007(str.getBytes(AbstractC4637.f15306));
        c1007.f3596 = str;
        C1007 c1008 = new C1007(str2.getBytes(AbstractC4637.f15306));
        c1008.f3596 = str2;
        this(c1007, c1008);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4123)) {
            return false;
        }
        C4123 c4123 = (C4123) obj;
        return AbstractC3831.m6874(this.f13738, c4123.f13738) && AbstractC3831.m6874(this.f13737, c4123.f13737);
    }

    public final int hashCode() {
        return this.f13737.hashCode() + (this.f13738.hashCode() * 31);
    }

    public final String toString() {
        return this.f13738.m2214() + ": " + this.f13737.m2214();
    }

    public C4123(C1007 c1007, String str) {
        C1007 c1008 = new C1007(str.getBytes(AbstractC4637.f15306));
        c1008.f3596 = str;
        this(c1007, c1008);
    }

    public C4123(C1007 c1007, C1007 c1008) {
        this.f13738 = c1007;
        this.f13737 = c1008;
        this.f13736 = c1008.mo2205() + c1007.mo2205() + 32;
    }
}
