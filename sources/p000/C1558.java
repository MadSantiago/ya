package p000;

/* JADX INFO: renamed from: ۥ٘ؒۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1558 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC3016 f5251;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f5252;

    public C1558(C2243 c2243, InterfaceC3016 interfaceC3016) {
        this.f5252 = c2243;
        this.f5251 = interfaceC3016;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558)) {
            return false;
        }
        C1558 c1558 = (C1558) obj;
        return AbstractC3831.m6874(this.f5252, c1558.f5252) && AbstractC3831.m6874(this.f5251, c1558.f5251);
    }

    public final int hashCode() {
        return this.f5251.hashCode() + (this.f5252.hashCode() * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C0878 c0878 = (C0878) abstractC5381;
        InterfaceC3975 interfaceC3975Mo1307 = this.f5251.mo1307(this.f5252);
        c0878.m5607(c0878.f3209);
        c0878.f3209 = interfaceC3975Mo1307;
        c0878.m5603(interfaceC3975Mo1307);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        InterfaceC3975 interfaceC3975Mo1307 = this.f5251.mo1307(this.f5252);
        C0878 c0878 = new C0878();
        c0878.f3209 = interfaceC3975Mo1307;
        c0878.m5603(interfaceC3975Mo1307);
        return c0878;
    }
}
