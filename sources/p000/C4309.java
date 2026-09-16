package p000;

/* JADX INFO: renamed from: ۦٖؕۤ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C4309 extends AbstractC5334 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2243 f14251;

    public C4309(C2243 c2243) {
        this.f14251 = c2243;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4309) {
            return AbstractC3831.m6874(this.f14251, ((C4309) obj).f14251);
        }
        return false;
    }

    public final int hashCode() {
        C2243 c2243 = this.f14251;
        if (c2243 != null) {
            return c2243.hashCode();
        }
        return 0;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        ((C3165) abstractC5381).m5842(this.f14251);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        return new C3165(this.f14251, 1, null);
    }
}
