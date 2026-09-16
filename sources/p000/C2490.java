package p000;

/* JADX INFO: renamed from: ۥ۠ؒؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2490 extends AbstractC3925 {

    /* JADX INFO: renamed from: ۦۛ */
    public final C2793 f8283;

    public C2490(C2793 c2793) {
        this.f8283 = c2793;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2490) {
            return this.f8283.equals(((C2490) obj).f8283);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8283.hashCode();
    }

    @Override // p000.AbstractC3925
    /* JADX INFO: renamed from: ۥَ */
    public final C2793 mo1881() {
        return this.f8283;
    }
}
