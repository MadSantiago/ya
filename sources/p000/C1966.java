package p000;

/* JADX INFO: renamed from: ۥٜٞؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1966 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f6489;

    /* JADX INFO: renamed from: ۥُ */
    public final boolean f6490;

    /* JADX INFO: renamed from: ۥّ */
    public final String f6491;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f6492;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f6493;

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC5242 f6494;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f6495;

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean f6496;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f6497;

    public C1966(EnumC5242 enumC5242, boolean z, int i, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6) {
        this.f6494 = enumC5242;
        this.f6492 = z;
        this.f6489 = i;
        this.f6495 = z2;
        this.f6490 = z3;
        this.f6491 = str;
        this.f6497 = z4;
        this.f6493 = z5;
        this.f6496 = z6;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C1966 m3846(C1966 c1966, EnumC5242 enumC5242, boolean z, int i, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, int i2) {
        if ((i2 & 1) != 0) {
            enumC5242 = c1966.f6494;
        }
        EnumC5242 enumC5243 = enumC5242;
        if ((i2 & 2) != 0) {
            z = c1966.f6492;
        }
        boolean z7 = z;
        if ((i2 & 4) != 0) {
            i = c1966.f6489;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = c1966.f6495;
        }
        boolean z8 = z2;
        if ((i2 & 16) != 0) {
            z3 = c1966.f6490;
        }
        boolean z9 = z3;
        String str2 = (i2 & 32) != 0 ? c1966.f6491 : str;
        boolean z10 = (i2 & 64) != 0 ? c1966.f6497 : z4;
        boolean z11 = (i2 & 128) != 0 ? c1966.f6493 : z5;
        boolean z12 = (i2 & 256) != 0 ? c1966.f6496 : z6;
        c1966.getClass();
        return new C1966(enumC5243, z7, i3, z8, z9, str2, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1966)) {
            return false;
        }
        C1966 c1966 = (C1966) obj;
        return this.f6494 == c1966.f6494 && this.f6492 == c1966.f6492 && this.f6489 == c1966.f6489 && this.f6495 == c1966.f6495 && this.f6490 == c1966.f6490 && AbstractC3831.m6874(this.f6491, c1966.f6491) && this.f6497 == c1966.f6497 && this.f6493 == c1966.f6493 && this.f6496 == c1966.f6496;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6496) + AbstractC5078.m8672(AbstractC5078.m8672(AbstractC5078.m8674(AbstractC5078.m8672(AbstractC5078.m8672(AbstractC2049.m3999(this.f6489, AbstractC5078.m8672(this.f6494.hashCode() * 31, 31, this.f6492), 31), 31, this.f6495), 31, this.f6490), 31, this.f6491), 31, this.f6497), 31, this.f6493);
    }

    public final String toString() {
        return "MainTabStates(framework=" + this.f6494 + ", showCopyDialog=" + this.f6492 + ", copyReason=" + this.f6489 + ", showStatusDescription=" + this.f6495 + ", showHistoryDialog=" + this.f6490 + ", historyScreenDesign=" + this.f6491 + ", isRubricsHidden=" + this.f6497 + ", showLayerDialog=" + this.f6493 + ", showMissingHooks=" + this.f6496 + ")";
    }
}
