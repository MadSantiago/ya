package p000;

/* JADX INFO: renamed from: ۥِٟۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2406 {

    /* JADX INFO: renamed from: ۥؗ */
    public InterfaceC3212 f8014;

    /* JADX INFO: renamed from: ۥۗ */
    public EnumC2459 f8015;

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC2880 f8016;

    /* JADX INFO: renamed from: ۦؑ */
    public long f8017;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2406)) {
            return false;
        }
        C2406 c2406 = (C2406) obj;
        return AbstractC3831.m6874(this.f8016, c2406.f8016) && this.f8015 == c2406.f8015 && AbstractC3831.m6874(this.f8014, c2406.f8014) && C3291.m6053(this.f8017, c2406.f8017);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8017) + ((this.f8014.hashCode() + ((this.f8015.hashCode() + (this.f8016.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f8016 + ", layoutDirection=" + this.f8015 + ", canvas=" + this.f8014 + ", size=" + ((Object) C3291.m6054(this.f8017)) + ')';
    }
}
