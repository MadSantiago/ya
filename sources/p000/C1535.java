package p000;

/* JADX INFO: renamed from: ۥُۣٗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1535 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC1133 f5192;

    /* JADX INFO: renamed from: ۥُ */
    public final C1516 f5193;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5807 f5194;

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC0643 f5195;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f5196;

    public C1535(AbstractC0643 abstractC0643, InterfaceC5807 interfaceC5807, InterfaceC1133 interfaceC1133, float f, C1516 c1516) {
        this.f5195 = abstractC0643;
        this.f5194 = interfaceC5807;
        this.f5192 = interfaceC1133;
        this.f5196 = f;
        this.f5193 = c1516;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535)) {
            return false;
        }
        C1535 c1535 = (C1535) obj;
        return AbstractC3831.m6874(this.f5195, c1535.f5195) && AbstractC3831.m6874(this.f5194, c1535.f5194) && AbstractC3831.m6874(this.f5192, c1535.f5192) && Float.compare(this.f5196, c1535.f5196) == 0 && AbstractC3831.m6874(this.f5193, c1535.f5193);
    }

    public final int hashCode() {
        int iM6635 = AbstractC3761.m6635(this.f5196, (this.f5192.hashCode() + ((this.f5194.hashCode() + AbstractC5078.m8672(this.f5195.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C1516 c1516 = this.f5193;
        return iM6635 + (c1516 == null ? 0 : c1516.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f5195 + ", sizeToIntrinsics=true, alignment=" + this.f5194 + ", contentScale=" + this.f5192 + ", alpha=" + this.f5196 + ", colorFilter=" + this.f5193 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2216 c2216 = (C2216) abstractC5381;
        boolean z = c2216.f7352;
        AbstractC0643 abstractC0643 = this.f5195;
        boolean z2 = (z && C3291.m6053(c2216.f7347.mo1464(), abstractC0643.mo1464())) ? false : true;
        c2216.f7347 = abstractC0643;
        c2216.f7352 = true;
        c2216.f7348 = this.f5194;
        c2216.f7349 = this.f5192;
        c2216.f7351 = this.f5196;
        c2216.f7350 = this.f5193;
        if (z2) {
            C5063.m8642(c2216);
        }
        AbstractC5378.m9047(c2216);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2216 c2216 = new C2216();
        c2216.f7347 = this.f5195;
        c2216.f7352 = true;
        c2216.f7348 = this.f5194;
        c2216.f7349 = this.f5192;
        c2216.f7351 = this.f5196;
        c2216.f7350 = this.f5193;
        return c2216;
    }
}
