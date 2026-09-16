package p000;

/* JADX INFO: renamed from: ۥْٜؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1221 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC1291 f4214;

    public C1221(InterfaceC1291 interfaceC1291) {
        this.f4214 = interfaceC1291;
    }

    public final boolean equals(Object obj) {
        C1221 c1221 = obj instanceof C1221 ? (C1221) obj : null;
        if (c1221 == null) {
            return false;
        }
        return AbstractC3831.m6874(this.f4214, c1221.f4214);
    }

    public final int hashCode() {
        return this.f4214.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C5328) abstractC5381).f17588 = this.f4214;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C5328 c5328 = new C5328();
        c5328.f17588 = this.f4214;
        return c5328;
    }
}
