package p000;

/* JADX INFO: renamed from: ۦِ٘ؑۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4407 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14507;

    public C4407(String str) {
        C4605 c4605 = C4605.f15200;
        this.f14507 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4407)) {
            return false;
        }
        C4605 c4605 = C4605.f15200;
        return this.f14507.equals(((C4407) obj).f14507);
    }

    public final int hashCode() {
        return this.f14507.hashCode() ^ C4605.f15200.hashCode();
    }
}
