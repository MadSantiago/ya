package p000;

/* JADX INFO: renamed from: ۦٜؖؗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3378 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۗ */
    public C3529 f11265;

    /* JADX INFO: renamed from: ۥۣ */
    public C3896 f11266;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C3896(this);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final Object m6145(AbstractC0772 abstractC0772) throws Throwable {
        C3529 c3529M7162 = this.f11265;
        if (c3529M7162 == null) {
            c3529M7162 = AbstractC4009.m7162();
            this.f11265 = c3529M7162;
            C3896 c3896 = this.f11266;
            if (c3896 != null && c3896.f17786) {
                c3896.m6974();
            }
        }
        Object objM6320 = c3529M7162.m6320(abstractC0772);
        return objM6320 == EnumC2282.f7590 ? objM6320 : C2358.f7817;
    }
}
