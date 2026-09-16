package p000;

/* JADX INFO: renamed from: ۦۜؕٓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5290 implements InterfaceC5372 {

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC4745 f17424;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C5627 f17425;

    /* JADX INFO: renamed from: ۦ۟ */
    public InterfaceC4745 f17426;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3051 f17427;

    public C5290(C5627 c5627, C3051 c3051, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746) {
        this.f17425 = c5627;
        this.f17427 = c3051;
        this.f17426 = interfaceC4745;
        this.f17424 = interfaceC4746;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        m8922(this.f17425.f18552.m1673());
        return this.f17427.f10275.getValue();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8922(C2451 c2451) {
        Object objMo211 = this.f17424.mo211(c2451.f8164);
        boolean zM1681 = this.f17425.f18552.m1681();
        C3051 c3051 = this.f17427;
        if (zM1681) {
            c3051.m5657(this.f17424.mo211(c2451.f8165), objMo211, (InterfaceC0215) this.f17426.mo211(c2451));
        } else {
            c3051.m5659(objMo211, (InterfaceC0215) this.f17426.mo211(c2451));
        }
    }
}
