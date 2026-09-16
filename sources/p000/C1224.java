package p000;

/* JADX INFO: renamed from: ۥْؕۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1224 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4686 f4217;

    public C1224(InterfaceC4686 interfaceC4686) {
        this.f4217 = interfaceC4686;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1224) {
            return AbstractC3831.m6874(((C1224) obj).f4217, this.f4217);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4217.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5309 c5309 = (C5309) abstractC5381;
        InterfaceC4686 interfaceC4686 = c5309.f17485;
        InterfaceC4686 interfaceC4687 = this.f4217;
        if (AbstractC3831.m6874(interfaceC4687, interfaceC4686)) {
            return;
        }
        c5309.f17485 = interfaceC4687;
        c5309.mo8045();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C5309(this.f4217);
    }
}
