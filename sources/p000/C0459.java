package p000;

/* JADX INFO: renamed from: ۥؕؓۢۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0459 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3464 f1658;

    public C0459(C3464 c3464) {
        this.f1658 = c3464;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0459) {
            return this.f1658 == ((C0459) obj).f1658;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1658.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C3190 c3190 = (C3190) abstractC5381;
        c3190.f10715 = this.f1658;
        AbstractC0186.m412(c3190);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3190 c3190 = new C3190();
        c3190.f10715 = this.f1658;
        return c3190;
    }
}
