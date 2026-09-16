package p000;

/* JADX INFO: renamed from: ۦۦَٖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5745 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3346 f18942;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f18943;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1249 f18944;

    public C5745(C1249 c1249, long j, C3346 c3346) {
        this.f18944 = c1249;
        this.f18943 = AbstractC2765.m5151(j, c1249.f4307.length());
        this.f18942 = c3346 != null ? new C3346(AbstractC2765.m5151(c3346.f11197, c1249.f4307.length())) : null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5745 m9570(C5745 c5745, C1249 c1249, long j, int i) {
        if ((i & 1) != 0) {
            c1249 = c5745.f18944;
        }
        if ((i & 2) != 0) {
            j = c5745.f18943;
        }
        C3346 c3346 = (i & 4) != 0 ? c5745.f18942 : null;
        c5745.getClass();
        return new C5745(c1249, j, c3346);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5745)) {
            return false;
        }
        C5745 c5745 = (C5745) obj;
        return C3346.m6110(this.f18943, c5745.f18943) && AbstractC3831.m6874(this.f18942, c5745.f18942) && AbstractC3831.m6874(this.f18944, c5745.f18944);
    }

    public final int hashCode() {
        int iHashCode = this.f18944.hashCode() * 31;
        int i = C3346.f11195;
        int iM6626 = AbstractC3761.m6626(iHashCode, 31, this.f18943);
        C3346 c3346 = this.f18942;
        return iM6626 + (c3346 != null ? Long.hashCode(c3346.f11197) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f18944) + "', selection=" + ((Object) C3346.m6111(this.f18943)) + ", composition=" + this.f18942 + ')';
    }

    public C5745(long j, String str, int i) {
        this(new C1249((i & 1) != 0 ? "" : str), (i & 2) != 0 ? C3346.f11196 : j, (C3346) null);
    }
}
