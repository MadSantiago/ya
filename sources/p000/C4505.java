package p000;

/* JADX INFO: renamed from: ۦَٙؖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4505 implements InterfaceC3396, InterfaceC3609 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C2589 f14898;

    public C4505(C2589 c2589) {
        this.f14898 = c2589;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3396) || !(obj instanceof InterfaceC3609)) {
            return false;
        }
        return this.f14898.equals(((InterfaceC3609) obj).mo6143());
    }

    public final int hashCode() {
        return this.f14898.hashCode();
    }

    @Override // p000.InterfaceC3609
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0400 mo6143() {
        return this.f14898;
    }
}
