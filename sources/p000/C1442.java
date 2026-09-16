package p000;

/* JADX INFO: renamed from: ۥؘٖؒۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1442 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f4936;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f4937;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4852 f4938;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC0215 f4939;

    public C1442(C4852 c4852, int i, boolean z, InterfaceC0215 interfaceC0215) {
        this.f4938 = c4852;
        this.f4937 = i;
        this.f4936 = z;
        this.f4939 = interfaceC0215;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1442) {
            C1442 c1442 = (C1442) obj;
            if (this.f4938 == c1442.f4938 && this.f4937 == c1442.f4937 && this.f4936 == c1442.f4936 && AbstractC3831.m6874(this.f4939, c1442.f4939)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4939.hashCode() + AbstractC5078.m8672(AbstractC2049.m3999(this.f4937, this.f4938.hashCode() * 31, 31), 31, this.f4936);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.f4938 + ", selectedTabIndex=" + this.f4937 + ", followContentSize=" + this.f4936 + ", animationSpec=" + this.f4939 + ')';
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2374 c2374 = (C2374) abstractC5381;
        c2374.f7857 = this.f4938;
        c2374.f7864 = this.f4937;
        c2374.f7858 = this.f4936;
        c2374.f7859 = this.f4939;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2374 c2374 = new C2374();
        c2374.f7857 = this.f4938;
        c2374.f7864 = this.f4937;
        c2374.f7858 = this.f4936;
        c2374.f7859 = this.f4939;
        return c2374;
    }
}
