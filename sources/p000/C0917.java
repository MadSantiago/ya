package p000;

/* JADX INFO: renamed from: ۥٌٟؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0917 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0553 f3288;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0553 f3289;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0553 f3290;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0553 f3291;

    public C0917(C0553 c0553, C0553 c0554, C0553 c0555, C0553 c0556) {
        this.f3290 = c0553;
        this.f3289 = c0554;
        this.f3288 = c0555;
        this.f3291 = c0556;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0917)) {
            return false;
        }
        C0917 c0917 = (C0917) obj;
        return AbstractC3831.m6874(this.f3290, c0917.f3290) && AbstractC3831.m6874(this.f3289, c0917.f3289) && AbstractC3831.m6874(this.f3288, c0917.f3288) && AbstractC3831.m6874(this.f3291, c0917.f3291);
    }

    public final int hashCode() {
        C0553 c0553 = this.f3290;
        int iHashCode = (c0553 != null ? c0553.hashCode() : 0) * 31;
        C0553 c0554 = this.f3289;
        int iHashCode2 = (iHashCode + (c0554 != null ? c0554.hashCode() : 0)) * 31;
        C0553 c0555 = this.f3288;
        int iHashCode3 = (iHashCode2 + (c0555 != null ? c0555.hashCode() : 0)) * 31;
        C0553 c0556 = this.f3291;
        return iHashCode3 + (c0556 != null ? c0556.hashCode() : 0);
    }

    public /* synthetic */ C0917(C0553 c0553, C0553 c0554, int i) {
        this(c0553, null, null, (i & 8) != 0 ? null : c0554);
    }
}
