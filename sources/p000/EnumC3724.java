package p000;

/* JADX INFO: renamed from: ۦٌؔۚٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3724 implements InterfaceC3120 {
    f12408("PURPOSE_RESTRICTION_NOT_ALLOWED"),
    f12404("PURPOSE_RESTRICTION_REQUIRE_CONSENT"),
    f12405("PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST"),
    f12403("PURPOSE_RESTRICTION_UNDEFINED"),
    f12406("UNRECOGNIZED");


    /* JADX INFO: renamed from: ۦۨ */
    public final int f12409;

    EnumC3724(String str) {
        this.f12409 = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12409);
    }

    @Override // p000.InterfaceC3120
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1880() {
        if (this != f12406) {
            return this.f12409;
        }
        C1078.m2272("Can't get the number of an unknown enum value.");
        return 0;
    }
}
