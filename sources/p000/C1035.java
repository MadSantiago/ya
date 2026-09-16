package p000;

/* JADX INFO: renamed from: ۥُؑ۟٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1035 {

    /* JADX INFO: renamed from: ۦۚ */
    public static final C1035 f3654 = new C1035(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: ۦۨ */
    public static final C1035 f3655 = new C1035(false, false, -1, -1, false, false, false, Integer.MAX_VALUE, -1, true, false, false, null);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f3656;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f3657;

    /* JADX INFO: renamed from: ۥّ */
    public final boolean f3658;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f3659;

    /* JADX INFO: renamed from: ۥۜ */
    public final int f3660;

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean f3661;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f3662;

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean f3663;

    /* JADX INFO: renamed from: ۦٌ */
    public String f3664;

    /* JADX INFO: renamed from: ۦِ */
    public final boolean f3665;

    /* JADX INFO: renamed from: ۦٛ */
    public final int f3666;

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean f3667;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f3668;

    public C1035(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f3661 = z;
        this.f3659 = z2;
        this.f3656 = i;
        this.f3662 = i2;
        this.f3657 = z3;
        this.f3658 = z4;
        this.f3668 = z5;
        this.f3660 = i3;
        this.f3666 = i4;
        this.f3665 = z6;
        this.f3667 = z7;
        this.f3663 = z8;
        this.f3664 = str;
    }

    public final String toString() {
        String str = this.f3664;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3661) {
            sb.append("no-cache, ");
        }
        if (this.f3659) {
            sb.append("no-store, ");
        }
        int i = this.f3656;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f3662;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f3657) {
            sb.append("private, ");
        }
        if (this.f3658) {
            sb.append("public, ");
        }
        if (this.f3668) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f3660;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f3666;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f3665) {
            sb.append("only-if-cached, ");
        }
        if (this.f3667) {
            sb.append("no-transform, ");
        }
        if (this.f3663) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.f3664 = string;
        return string;
    }
}
