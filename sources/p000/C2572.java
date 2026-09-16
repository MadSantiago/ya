package p000;

/* JADX INFO: renamed from: ۥَۡؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2572 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f8589;

    public C2572(String str) {
        this.f8589 = AbstractC1650.m3460(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2572)) {
            return false;
        }
        return this.f8589.equals(((C2572) obj).f8589);
    }

    public final int hashCode() {
        return this.f8589.hashCode();
    }

    public final String toString() {
        return AbstractC1650.m3461(this.f8589);
    }
}
