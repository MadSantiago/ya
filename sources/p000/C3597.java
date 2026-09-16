package p000;

/* JADX INFO: renamed from: ۦٌؚّؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3597 {

    /* JADX INFO: renamed from: ۥؗ */
    public final long f11953;

    /* JADX INFO: renamed from: ۥُ */
    public final long f11954;

    /* JADX INFO: renamed from: ۥّ */
    public final long f11955;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f11956;

    /* JADX INFO: renamed from: ۥۜ */
    public final long f11957;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f11958;

    /* JADX INFO: renamed from: ۦؑ */
    public final long f11959;

    /* JADX INFO: renamed from: ۦؚ */
    public final long f11960;

    /* JADX INFO: renamed from: ۦِ */
    public final long f11961;

    /* JADX INFO: renamed from: ۦٛ */
    public final long f11962;

    /* JADX INFO: renamed from: ۦۗ */
    public final long f11963;

    /* JADX INFO: renamed from: ۦۙ */
    public final long f11964;

    public C3597(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f11958 = j;
        this.f11956 = j2;
        this.f11953 = j3;
        this.f11959 = j4;
        this.f11954 = j5;
        this.f11955 = j6;
        this.f11964 = j7;
        this.f11957 = j8;
        this.f11962 = j9;
        this.f11961 = j10;
        this.f11963 = j11;
        this.f11960 = j12;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0969 m6403(EnumC2887 enumC2887, C5362 c5362) {
        if (enumC2887 == EnumC2887.f9631) {
            c5362.m8957(1539262271);
            C0969 c0969M4817 = AbstractC2552.m4817(5, c5362);
            c5362.m9009(false);
            return c0969M4817;
        }
        c5362.m8957(1539355581);
        C0969 c0969M4818 = AbstractC2552.m4817(4, c5362);
        c5362.m9009(false);
        return c0969M4818;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3597)) {
            return false;
        }
        C3597 c3597 = (C3597) obj;
        long j = c3597.f11958;
        int i = C1327.f4593;
        return C4462.m7744(this.f11958, j) && C4462.m7744(this.f11956, c3597.f11956) && C4462.m7744(this.f11953, c3597.f11953) && C4462.m7744(this.f11959, c3597.f11959) && C4462.m7744(this.f11954, c3597.f11954) && C4462.m7744(this.f11955, c3597.f11955) && C4462.m7744(this.f11964, c3597.f11964) && C4462.m7744(this.f11957, c3597.f11957) && C4462.m7744(this.f11962, c3597.f11962) && C4462.m7744(this.f11961, c3597.f11961) && C4462.m7744(this.f11963, c3597.f11963) && C4462.m7744(this.f11960, c3597.f11960);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return Long.hashCode(this.f11960) + AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(AbstractC3761.m6626(Long.hashCode(this.f11958) * 31, 31, this.f11956), 31, this.f11953), 31, this.f11959), 31, this.f11954), 31, this.f11955), 31, this.f11964), 31, this.f11957), 31, this.f11962), 31, this.f11961), 31, this.f11963);
    }
}
