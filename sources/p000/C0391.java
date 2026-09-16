package p000;

/* JADX INFO: renamed from: ۥؔؓٗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C0391 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC2864 f1449;

    /* JADX INFO: renamed from: ۥۣ */
    public final long f1450;

    public C0391(long j, InterfaceC2864 interfaceC2864) {
        this.f1450 = j;
        this.f1449 = interfaceC2864;
    }

    public final boolean equals(Object obj) {
        C0391 c0391 = obj instanceof C0391 ? (C0391) obj : null;
        if (c0391 == null) {
            return false;
        }
        long j = c0391.f1450;
        int i = C1327.f4593;
        return C4462.m7744(this.f1450, j) && AbstractC3831.m6874(this.f1449, c0391.f1449);
    }

    public final int hashCode() {
        int i = C1327.f4593;
        return this.f1449.hashCode() + AbstractC3761.m6635(1.0f, Long.hashCode(this.f1450) * 961, 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4476 c4476 = (C4476) abstractC5381;
        c4476.f14776 = this.f1450;
        InterfaceC2864 interfaceC2864 = c4476.f14782;
        InterfaceC2864 interfaceC2865 = this.f1449;
        if (!AbstractC3831.m6874(interfaceC2864, interfaceC2865)) {
            c4476.f14782 = interfaceC2865;
            AbstractC0186.m412(c4476);
        }
        AbstractC5378.m9047(c4476);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4476 c4476 = new C4476();
        c4476.f14776 = this.f1450;
        c4476.f14782 = this.f1449;
        c4476.f14777 = 9205357640488583168L;
        return c4476;
    }
}
