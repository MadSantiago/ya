package p000;

/* JADX INFO: renamed from: ۦ۟ؔؓٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C5341 extends AbstractC5334 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5341 ? (C5341) obj : null) != null;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC3761.m6632(2) * 31);
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C4610 c4610 = (C4610) abstractC5381;
        c4610.f15222 = 2;
        c4610.f15223 = true;
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C4610 c4610 = new C4610();
        c4610.f15222 = 2;
        c4610.f15223 = true;
        return c4610;
    }
}
