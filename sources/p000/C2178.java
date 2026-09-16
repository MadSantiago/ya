package p000;

/* JADX INFO: renamed from: ۥِۘؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2178 implements InterfaceC1648, AutoCloseable {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f7202;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1106 f7203;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f7204;

    public C2178(String str, C1106 c1106) {
        this.f7204 = str;
        this.f7203 = c1106;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m4235(C2346 c2346, AbstractC1434 abstractC1434) {
        if (this.f7202) {
            C1078.m2276("Already attached to lifecycleOwner");
            return;
        }
        this.f7202 = true;
        abstractC1434.mo2388(this);
        c2346.m4413(this.f7204, (C5444) this.f7203.f3892.f4870);
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        if (enumC1924 == EnumC1924.ON_DESTROY) {
            this.f7202 = false;
            interfaceC4507.mo110().mo2389(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
