package p000;

/* JADX INFO: renamed from: ۦؘؚْۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4093 implements InterfaceC1796 {

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13661;

    public C4093(C3131 c3131) {
        this.f13661 = AbstractC2919.m5505(c3131);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4093.class == obj.getClass() && this.f13661.equals(((C4093) obj).f13661);
    }

    @Override // p000.InterfaceC1796
    public final String getValue() {
        return this.f13661;
    }

    public final int hashCode() {
        return this.f13661.hashCode();
    }

    public final String toString() {
        return this.f13661;
    }
}
