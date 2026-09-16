package p000;

/* JADX INFO: renamed from: ۥَّؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1167 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f4050;

    public C1167(InterfaceC4745 interfaceC4745) {
        this.f4050 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1167) {
            return this.f4050 == ((C1167) obj).f4050;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4050.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        AbstractC1311 abstractC1311;
        C4201 c4201 = (C4201) abstractC5381;
        InterfaceC4745 interfaceC4745 = this.f4050;
        c4201.f13959 = interfaceC4745;
        if (c4201.f17791.f17786 && (abstractC1311 = AbstractC5537.m9245(c4201, 2).f4530) != null) {
            abstractC1311.m9786(interfaceC4745, true);
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C4201(this.f4050);
    }
}
