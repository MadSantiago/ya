package p000;

/* JADX INFO: renamed from: ۥؘُؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0562 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C0562 f2005;

    /* JADX INFO: renamed from: ۦؑ */
    public static final long f2006;

    /* JADX INFO: renamed from: ۥؗ */
    public final int f2007;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f2008;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f2009;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f2006 = jCharAt;
        f2005 = new C0562(0, -1, -1);
    }

    public C0562(int i, int i2, int i3) {
        this.f2009 = i;
        this.f2008 = i2;
        this.f2007 = i3;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m1260(int i, int i2, String str) {
        if (i == i2) {
            throw C1228.m2594(i - 1, "missing precision", str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw C1228.m2594(i4, "invalid precision character", str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw C1228.m2595("precision too large", i, i2, str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw C1228.m2595("invalid precision", i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0562) {
            C0562 c0562 = (C0562) obj;
            if (c0562.f2009 == this.f2009 && c0562.f2008 == this.f2008 && c0562.f2007 == this.f2007) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2009 * 31) + this.f2008) * 31) + this.f2007;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m1261() {
        return (this.f2009 & 128) != 0;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m1262(int i, boolean z) {
        int i2;
        if (m1263()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.f2009;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.f2007 != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.f2008 != -1;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m1263() {
        return this == f2005;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1264(StringBuilder sb) {
        if (m1263()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.f2009 & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.f2008;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.f2007;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }
}
