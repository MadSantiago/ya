package p000;

/* JADX INFO: renamed from: ۥٍ۟ؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2461 implements Comparable {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2461 f8217 = new C2461();

    /* JADX INFO: renamed from: ۦۨ */
    public final int f8218 = 132106;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8218 - ((C2461) obj).f8218;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2461 c2461 = obj instanceof C2461 ? (C2461) obj : null;
        return c2461 != null && this.f8218 == c2461.f8218;
    }

    public final int hashCode() {
        return this.f8218;
    }

    public final String toString() {
        return "2.4.10";
    }
}
