package p000;

/* JADX INFO: renamed from: ۥْۚؒؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2256<T> extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5731 f7481;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4536 f7482;

    public C2256(C4536 c4536, InterfaceC5731 interfaceC5731) {
        this.f7482 = c4536;
        this.f7481 = interfaceC5731;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2256)) {
            return false;
        }
        C2256 c2256 = (C2256) obj;
        return AbstractC3831.m6874(this.f7482, c2256.f7482) && this.f7481 == c2256.f7481;
    }

    public final int hashCode() {
        return EnumC1616.f5425.hashCode() + ((this.f7481.hashCode() + (this.f7482.hashCode() * 31)) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4757 c4757 = (C4757) abstractC5381;
        c4757.f15697 = this.f7482;
        c4757.f15700 = this.f7481;
        c4757.f15698 = EnumC1616.f5425;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4757 c4757 = new C4757();
        c4757.f15697 = this.f7482;
        c4757.f15700 = this.f7481;
        c4757.f15698 = EnumC1616.f5425;
        return c4757;
    }
}
