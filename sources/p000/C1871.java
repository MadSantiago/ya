package p000;

/* JADX INFO: renamed from: ۥٝؓٝؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1871 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4234 f6218;

    public C1871(C4234 c4234) {
        this.f6218 = c4234;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1871) {
            return ((C1871) obj).f6218.equals(this.f6218);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6218.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C2359 c2359 = (C2359) abstractC5381;
        C4234 c4234 = c2359.f7818;
        C4234 c4235 = this.f6218;
        if (c4235.equals(c4234)) {
            return;
        }
        c2359.f7818 = c4235;
        c2359.mo8045();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C2359 c2359 = new C2359();
        c2359.f7818 = this.f6218;
        return c2359;
    }
}
