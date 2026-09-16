package p000;

/* JADX INFO: renamed from: ۥٍٖؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0332 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f1240;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f1241;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1166 f1242;

    public C0332(C1166 c1166, int i, int i2) {
        AbstractC1631.m3435(c1166, "Null dependency anInterface.");
        this.f1242 = c1166;
        this.f1241 = i;
        this.f1240 = i2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C0332 m763(Class cls) {
        return new C0332(1, 0, cls);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0332 m764(C1166 c1166) {
        return new C0332(c1166, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0332)) {
            return false;
        }
        C0332 c0332 = (C0332) obj;
        return this.f1242.equals(c0332.f1242) && this.f1241 == c0332.f1241 && this.f1240 == c0332.f1240;
    }

    public final int hashCode() {
        return this.f1240 ^ ((((this.f1242.hashCode() ^ 1000003) * 1000003) ^ this.f1241) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f1242);
        sb.append(", type=");
        int i = this.f1241;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f1240;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC5078.m8670(i2, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return AbstractC3761.m6621(sb, str2, "}");
    }

    public C0332(int i, int i2, Class cls) {
        this(C1166.m2484(cls), i, i2);
    }
}
