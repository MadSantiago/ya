package p000;

/* JADX INFO: renamed from: ۥؗۛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0641 implements InterfaceC3558 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C4017 f2403;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2404;

    public /* synthetic */ C0641(C4017 c4017, int i) {
        this.f2404 = i;
        this.f2403 = c4017;
    }

    @Override // p000.InterfaceC3558
    /* JADX INFO: renamed from: ۦؑ */
    public final double mo399(double d) {
        int i = this.f2404;
        C4017 c4017 = this.f2403;
        switch (i) {
            case 0:
                return AbstractC4554.m7921(c4017.f13395.mo399(d), c4017.f13386, c4017.f13387);
            default:
                return c4017.f13397.mo399(AbstractC4554.m7921(d, c4017.f13386, c4017.f13387));
        }
    }
}
