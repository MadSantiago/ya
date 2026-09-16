package p000;

/* JADX INFO: renamed from: ۦٕؐؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2972 extends AbstractC0527 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2775 f9959 = C2775.f9249;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2972.class != obj.getClass()) {
            return false;
        }
        return this.f9959.equals(((C2972) obj).f9959);
    }

    public final int hashCode() {
        return this.f9959.hashCode() + (C2972.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f9959 + '}';
    }
}
