package p000;

/* JADX INFO: renamed from: ۥۧؓۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2860 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f9567;

    public C2860(C2243 c2243) {
        this.f9567 = c2243;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2860) && AbstractC3831.m6874(((C2860) obj).f9567, this.f9567);
    }

    public final int hashCode() {
        return this.f9567.hashCode() * 31;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1612 c1612 = (C1612) abstractC5381;
        C2243 c2243 = c1612.f5412;
        C2243 c2244 = this.f9567;
        if (AbstractC3831.m6874(c2243, c2244)) {
            return;
        }
        c1612.m3380();
        c1612.f5412 = c2244;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1612 c1612 = new C1612();
        c1612.f5412 = this.f9567;
        return c1612;
    }
}
