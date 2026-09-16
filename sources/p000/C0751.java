package p000;

import java.util.Locale;

/* JADX INFO: renamed from: ۥؙؙؗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0751 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f2727;

    /* JADX INFO: renamed from: ۥُ */
    public final String f2728;

    /* JADX INFO: renamed from: ۥّ */
    public final int f2729;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f2730;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f2731;

    /* JADX INFO: renamed from: ۦؑ */
    public final int f2732;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f2733;

    public C0751(int i, int i2, String str, String str2, String str3, boolean z) {
        this.f2731 = str;
        this.f2730 = str2;
        this.f2727 = z;
        this.f2732 = i;
        this.f2728 = str3;
        this.f2729 = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.f2733 = AbstractC0684.m1527(upperCase, "INT", false) ? 3 : (AbstractC0684.m1527(upperCase, "CHAR", false) || AbstractC0684.m1527(upperCase, "CLOB", false) || AbstractC0684.m1527(upperCase, "TEXT", false)) ? 2 : AbstractC0684.m1527(upperCase, "BLOB", false) ? 5 : (AbstractC0684.m1527(upperCase, "REAL", false) || AbstractC0684.m1527(upperCase, "FLOA", false) || AbstractC0684.m1527(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0751) {
                boolean z = this.f2732 > 0;
                C0751 c0751 = (C0751) obj;
                int i = c0751.f2729;
                if (z == (c0751.f2732 > 0) && AbstractC3831.m6874(this.f2731, c0751.f2731) && this.f2727 == c0751.f2727) {
                    String str = c0751.f2728;
                    int i2 = this.f2729;
                    String str2 = this.f2728;
                    if ((i2 != 1 || i != 2 || str2 == null || AbstractC5568.m9354(str2, str)) && ((i2 != 2 || i != 1 || str == null || AbstractC5568.m9354(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC5568.m9354(str2, str))) && this.f2733 == c0751.f2733))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f2731.hashCode() * 31) + this.f2733) * 31) + (this.f2727 ? 1231 : 1237)) * 31) + this.f2732;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f2731);
        sb.append("',\n            |   type = '");
        sb.append(this.f2730);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f2733);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f2727);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f2732);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f2728;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return AbstractC1098.m2324(AbstractC1098.m2325(sb.toString()));
    }
}
