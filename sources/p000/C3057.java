package p000;

/* JADX INFO: renamed from: ۦٟؑؗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3057 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f10292;

    public C3057(InterfaceC4745 interfaceC4745) {
        this.f10292 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3057) && ((C3057) obj).f10292 == this.f10292;
    }

    public final int hashCode() {
        return this.f10292.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1071 c1071 = (C1071) abstractC5381;
        InterfaceC4745 interfaceC4745 = c1071.f3758;
        InterfaceC4745 interfaceC4746 = this.f10292;
        if (interfaceC4746 != interfaceC4745) {
            c1071.f3758 = interfaceC4746;
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1071 c1071 = new C1071();
        c1071.f3758 = this.f10292;
        return c1071;
    }
}
