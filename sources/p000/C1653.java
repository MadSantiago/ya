package p000;

/* JADX INFO: renamed from: ۥِٕٙؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1653 implements InterfaceC1648 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractActivityC1500 f5505;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C4023 f5506;

    public /* synthetic */ C1653(C4023 c4023, AbstractActivityC1500 abstractActivityC1500) {
        this.f5506 = c4023;
        this.f5505 = abstractActivityC1500;
    }

    @Override // p000.InterfaceC1648
    /* JADX INFO: renamed from: ۦ۟ */
    public final void mo1683(InterfaceC4507 interfaceC4507, EnumC1924 enumC1924) {
        if (enumC1924 == EnumC1924.ON_CREATE) {
            this.f5506.m7195(this.f5505.getOnBackInvokedDispatcher());
        }
    }
}
