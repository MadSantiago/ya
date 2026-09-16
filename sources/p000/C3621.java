package p000;

/* JADX INFO: renamed from: ۦٌؚٟؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3621 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1911 f12066;

    public C3621(C1911 c1911) {
        this.f12066 = c1911;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3621 c3621 = obj instanceof C3621 ? (C3621) obj : null;
        if (c3621 == null) {
            return false;
        }
        return this.f12066.equals(c3621.f12066);
    }

    public final int hashCode() {
        return Float.hashCode(this.f12066.f6303);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3719) abstractC5381).f12394 = this.f12066;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3719 c3719 = new C3719();
        c3719.f12394 = this.f12066;
        return c3719;
    }
}
