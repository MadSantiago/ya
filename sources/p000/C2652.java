package p000;

/* JADX INFO: renamed from: ۥۣؒؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C2652 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 f8804;

    public C2652(InterfaceC4745 interfaceC4745) {
        this.f8804 = interfaceC4745;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2652) {
            return this.f8804 == ((C2652) obj).f8804;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8804.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3823 c3823 = (C3823) abstractC5381;
        c3823.f12671 = this.f8804;
        c3823.f12672 = -9223372034707292160L;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3823 c3823 = new C3823();
        c3823.f12671 = this.f8804;
        c3823.f12672 = -9223372034707292160L;
        return c3823;
    }
}
