package p000;

/* JADX INFO: renamed from: ۦُؕٛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3908 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC4745 f13037;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0165 f13038;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13039;

    public /* synthetic */ C3908(C0165 c0165, InterfaceC4745 interfaceC4745, int i) {
        this.f13039 = i;
        this.f13038 = c0165;
        this.f13037 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f13039;
        InterfaceC4745 interfaceC4745 = this.f13037;
        C0165 c0165 = this.f13038;
        switch (i) {
            case 0:
                C3828 c3828 = (C3828) obj;
                if (c0165 != null) {
                    c0165.f622.setValue(c3828);
                }
                if (interfaceC4745 != null) {
                    interfaceC4745.mo211(c3828);
                }
                return C2358.f7817;
            default:
                c0165.f620.add(interfaceC4745);
                return new C0235(2, c0165, interfaceC4745);
        }
    }
}
