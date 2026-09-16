package p000;

/* JADX INFO: renamed from: ۥۥۢٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2769 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C2600 f9187;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5620 f9188;

    public C2769(C5620 c5620, C2600 c2600) {
        this.f9188 = c5620;
        this.f9187 = c2600;
    }

    public final String toString() {
        C2600 c2600 = this.f9187;
        String str = ((C3023) c2600.f8690.mo865(C3023.f10184)) != null ? "Room Invalidation Tracker Refresh" : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC2133.m4156(16);
        sb.append(Integer.toString(iHashCode, 16));
        sb.append(str != null ? AbstractC3761.m6629("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.f9188.mo449());
        sb.append(", continuation=");
        sb.append(c2600);
        sb.append(')');
        return sb.toString();
    }
}
