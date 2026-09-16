package p000;

/* JADX INFO: renamed from: ۥؚؑؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0189 extends AbstractC3831 {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f704;

    public C0189(int i) {
        this.f704 = i;
        if (i > 0) {
            return;
        }
        C1078.m2272("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0189) {
            return this.f704 == ((C0189) obj).f704;
        }
        return false;
    }

    public final int hashCode() {
        return this.f704;
    }

    public final String toString() {
        return String.valueOf(this.f704);
    }
}
