package p000;

/* JADX INFO: renamed from: ۦّۣؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4052 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5648 f13505;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13506;

    public /* synthetic */ C4052(C5648 c5648, int i) {
        this.f13506 = i;
        this.f13505 = c5648;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f13506;
        C2358 c2358 = C2358.f7817;
        C5648 c5648 = this.f13505;
        switch (i) {
            case 0:
                c5648.m9483(false);
                break;
            case 1:
                c5648.m9483(false);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5648.m9482(false);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5648.m9481(c5648, 0, 2);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                c5648.m9482(false);
                break;
            default:
                C5648.m9481(c5648, 0, 2);
                break;
        }
        return c2358;
    }
}
