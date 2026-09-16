package p000;

/* JADX INFO: renamed from: ۥۧؔ٘ٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2865 implements InterfaceC2311 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Class f9576;

    public C2865(Class cls) {
        this.f9576 = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2865) {
            return this.f9576.equals(((C2865) obj).f9576);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9576.hashCode();
    }

    public final String toString() {
        return this.f9576.toString() + " (Kotlin reflection is not available)";
    }
}
