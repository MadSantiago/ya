package p000;

/* JADX INFO: renamed from: ۦؘؓۗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C3478 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0489 f11554;

    public C3478(C0489 c0489) {
        this.f11554 = c0489;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3478) {
            return AbstractC3831.m6874(this.f11554, ((C3478) obj).f11554);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11554.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1258 c1258 = (C1258) abstractC5381;
        C0489 c0489 = c1258.f4325;
        if (c0489 != null) {
            c0489.f1781.m1848(c1258);
        }
        C0489 c04810 = this.f11554;
        if (c04810 != null) {
            c04810.f1781.m1843(c1258);
        }
        c1258.f4325 = c04810;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C1258 c1258 = new C1258();
        c1258.f4325 = this.f11554;
        return c1258;
    }
}
