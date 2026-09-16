package p000;

/* JADX INFO: renamed from: ۥۣ۠ؔٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2508 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f8329;

    public C2508(Class cls) {
        this.f8329 = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2508) && this.f8329.equals(((C2508) obj).f8329);
    }

    public final int hashCode() {
        return this.f8329.hashCode();
    }

    public final String toString() {
        return "Runtime(type=" + this.f8329 + ")";
    }
}
