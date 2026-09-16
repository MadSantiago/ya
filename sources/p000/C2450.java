package p000;

/* JADX INFO: renamed from: ۥ۟ؔۙؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2450 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f8159;

    /* JADX INFO: renamed from: ۥُ */
    public final long f8160;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f8161;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f8162;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f8163;

    public C2450(long j, long j2, long j3, long j4, long j5) {
        this.f8162 = j;
        this.f8161 = j2;
        this.f8159 = j3;
        this.f8163 = j4;
        this.f8160 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2450)) {
            return false;
        }
        C2450 c2450 = (C2450) obj;
        long j = c2450.f8162;
        int i = C1327.f4593;
        return C4462.m7744(this.f8162, j) && C4462.m7744(this.f8161, c2450.f8161) && C4462.m7744(this.f8159, c2450.f8159) && C4462.m7744(this.f8163, c2450.f8163) && C4462.m7744(this.f8160, c2450.f8160);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f8160) + AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f8162) * 31, 31, this.f8161), 31, this.f8159), 31, this.f8163);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC5078.m8677(this.f8162, sb, ", textColor=");
        AbstractC5078.m8677(this.f8161, sb, ", iconColor=");
        AbstractC5078.m8677(this.f8159, sb, ", disabledTextColor=");
        AbstractC5078.m8677(this.f8163, sb, ", disabledIconColor=");
        sb.append((Object) C1327.m2827(this.f8160));
        sb.append(')');
        return sb.toString();
    }
}
