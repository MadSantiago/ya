package p000;

/* JADX INFO: renamed from: ۦٕٜؓۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4229 {

    /* JADX INFO: renamed from: ۥُ */
    public int f14028;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f14029;

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f14030;

    /* JADX INFO: renamed from: ۥؗ */
    public C1940 f14027 = null;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f14031 = false;

    public C4229(Class cls, Object obj, int i) {
        this.f14030 = cls;
        this.f14029 = obj;
        this.f14028 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4229)) {
            return false;
        }
        C4229 c4229 = (C4229) obj;
        return AbstractC3831.m6874(this.f14030, c4229.f14030) && AbstractC3831.m6874(this.f14029, c4229.f14029) && AbstractC3831.m6874(this.f14027, c4229.f14027) && this.f14031 == c4229.f14031 && this.f14028 == c4229.f14028;
    }

    public final int hashCode() {
        int iHashCode = this.f14030.hashCode() * 31;
        Object obj = this.f14029;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C1940 c1940 = this.f14027;
        return AbstractC3761.m6632(this.f14028) + AbstractC5078.m8672((iHashCode2 + (c1940 != null ? c1940.hashCode() : 0)) * 31, 31, this.f14031);
    }

    public final String toString() {
        String str;
        C1940 c1940 = this.f14027;
        boolean z = this.f14031;
        int i = this.f14028;
        StringBuilder sb = new StringBuilder("Configuration(declaringClass=");
        sb.append(this.f14030);
        sb.append(", memberInstance=");
        sb.append(this.f14029);
        sb.append(", processorResolver=");
        sb.append(c1940);
        sb.append(", superclass=");
        sb.append(z);
        sb.append(", optional=");
        if (i == 1) {
            str = "NO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SILENT";
        } else {
            str = "NOTICE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
