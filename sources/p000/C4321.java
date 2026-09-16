package p000;

/* JADX INFO: renamed from: ۦؘٖؐؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4321 extends AbstractC1942 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C5725 f14287;

    public C4321(C5725 c5725) {
        this.f14287 = c5725;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1942)) {
            return false;
        }
        return this.f14287.equals(((C4321) ((AbstractC1942) obj)).f14287);
    }

    public final int hashCode() {
        return this.f14287.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f14287 + "}";
    }
}
