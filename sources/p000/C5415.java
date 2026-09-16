package p000;

/* JADX INFO: renamed from: ۦ۠ؖۢٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5415 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f17871;

    /* JADX INFO: renamed from: ۥُ */
    public final C2243 f17872;

    /* JADX INFO: renamed from: ۥۗ */
    public final EnumC1616 f17873;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3096 f17874;

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean f17875;

    public C5415(InterfaceC3096 interfaceC3096, EnumC1616 enumC1616, boolean z, boolean z2, C2243 c2243) {
        this.f17874 = interfaceC3096;
        this.f17873 = enumC1616;
        this.f17871 = z;
        this.f17875 = z2;
        this.f17872 = c2243;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5415)) {
            return false;
        }
        C5415 c5415 = (C5415) obj;
        return AbstractC3831.m6874(this.f17874, c5415.f17874) && this.f17873 == c5415.f17873 && this.f17871 == c5415.f17871 && this.f17875 == c5415.f17875 && AbstractC3831.m6874(this.f17872, c5415.f17872);
    }

    public final int hashCode() {
        int iM8672 = AbstractC5078.m8672(AbstractC5078.m8672((this.f17873.hashCode() + (this.f17874.hashCode() * 31)) * 961, 31, this.f17871), 961, this.f17875);
        C2243 c2243 = this.f17872;
        return (iM8672 + (c2243 != null ? c2243.hashCode() : 0)) * 31;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C2677) abstractC5381).m9877(null, null, null, this.f17872, this.f17873, this.f17874, this.f17871, this.f17875);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C2677(null, null, null, this.f17872, this.f17873, this.f17874, this.f17871, this.f17875);
    }
}
