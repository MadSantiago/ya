package p000;

/* JADX INFO: renamed from: ۥؗؒۙٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C0590 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f2195;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f2196;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3564 f2197;

    public C0590(C3564 c3564, int i, int i2) {
        this.f2197 = c3564;
        this.f2196 = i;
        this.f2195 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0590)) {
            return false;
        }
        C0590 c0590 = (C0590) obj;
        return AbstractC3831.m6874(this.f2197, c0590.f2197) && this.f2196 == c0590.f2196 && this.f2195 == c0590.f2195;
    }

    public final int hashCode() {
        return (((this.f2197.hashCode() * 31) + this.f2196) * 31) + this.f2195;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C5356 c5356 = (C5356) abstractC5381;
        C3564 c3564 = c5356.f17624;
        C3564 c3565 = this.f2197;
        boolean zM6874 = AbstractC3831.m6874(c3564, c3565);
        int i = this.f2196;
        int i2 = this.f2195;
        if (zM6874 && c5356.f17631 == i && c5356.f17625 == i2) {
            return;
        }
        c5356.f17624 = c3565;
        c5356.f17631 = i;
        c5356.f17625 = i2;
        c5356.f17627 = AbstractC5537.m9238(c3565, AbstractC5537.m9270(c5356).f2272);
        c5356.f17626 = true;
        C5063.m8642(c5356);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C5356 c5356 = new C5356();
        c5356.f17624 = this.f2197;
        c5356.f17631 = this.f2196;
        c5356.f17625 = this.f2195;
        c5356.f17630 = -1;
        c5356.f17628 = -1;
        return c5356;
    }
}
