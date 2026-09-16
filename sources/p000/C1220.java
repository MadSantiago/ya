package p000;

/* JADX INFO: renamed from: ۥْٖؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1220 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1220 f4210 = new C1220(C5830.f19205, 17, 0);

    /* JADX INFO: renamed from: ۥؗ */
    public final int f4211;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f4212;

    /* JADX INFO: renamed from: ۥۣ */
    public final float f4213;

    public C1220(float f, int i, int i2) {
        this.f4213 = f;
        this.f4212 = i;
        this.f4211 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220)) {
            return false;
        }
        C1220 c1220 = (C1220) obj;
        float f = c1220.f4213;
        float f2 = C5830.f19206;
        return Float.compare(this.f4213, f) == 0 && this.f4212 == c1220.f4212 && this.f4211 == c1220.f4211;
    }

    public final int hashCode() {
        float f = C5830.f19206;
        return Integer.hashCode(this.f4211) + AbstractC2049.m3999(this.f4212, Float.hashCode(this.f4213) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) C5830.m9639(this.f4213));
        sb.append(", trim=");
        String str2 = "Invalid";
        int i = this.f4212;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(",mode=");
        int i2 = this.f4211;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
