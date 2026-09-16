package p000;

/* JADX INFO: renamed from: ۦٍۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5906 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final C5906 f19486 = new C5906(AbstractC4225.m7443(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: ۥؗ */
    public final float f19487;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f19488;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f19489;

    public C5906(long j, long j2, float f) {
        this.f19489 = j;
        this.f19488 = j2;
        this.f19487 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5906)) {
            return false;
        }
        C5906 c5906 = (C5906) obj;
        long j = c5906.f19489;
        int i = C1327.f4593;
        return C4462.m7744(this.f19489, j) && C1553.m3306(this.f19488, c5906.f19488) && this.f19487 == c5906.f19487;
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Float.hashCode(this.f19487) + AbstractC3761.m6626(Long.hashCode(this.f19489) * 31, 31, this.f19488);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC5078.m8677(this.f19489, sb, ", offset=");
        sb.append((Object) C1553.m3309(this.f19488));
        sb.append(", blurRadius=");
        return AbstractC3761.m6639(sb, this.f19487, ')');
    }
}
