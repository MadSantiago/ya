package p000;

/* JADX INFO: renamed from: ۥٕؗۡٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
final class C1426 extends AbstractC5334 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C1426);
    }

    public final int hashCode() {
        return AbstractC4593.f15160.hashCode();
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۥّ */
    public final void mo915(AbstractC5381 abstractC5381) {
        C1905 c1905 = (C1905) abstractC5381;
        C3875 c3875 = AbstractC4593.f15160;
        if (c1905.f6288 != c3875) {
            c1905.f6288 = c3875;
            C2816 c2816 = c1905.f6289;
            if (c2816 != null) {
                C0879 c0879 = c2816.f9399;
                if (AbstractC3831.m6874(c0879, c1905.f17485)) {
                    return;
                }
                c1905.f17485 = c0879;
                c1905.mo8045();
            }
        }
    }

    @Override // p000.AbstractC5334
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC5381 mo916() {
        C3875 c3875 = AbstractC4593.f15160;
        C1905 c1905 = new C1905(AbstractC4225.f14016);
        c1905.f6288 = c3875;
        return c1905;
    }
}
