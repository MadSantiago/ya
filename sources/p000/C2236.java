package p000;

/* JADX INFO: renamed from: ۥِۙؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2236 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C3532 f7404;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f7405;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2236(C3532 c3532, int i) {
        super(1);
        this.f7405 = i;
        this.f7404 = c3532;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f7405;
        C2358 c2358 = C2358.f7817;
        C3532 c3532 = this.f7404;
        switch (i) {
            case 0:
                c3532.f11709 = true;
                c3532.f11706.mo449();
                return c2358;
            default:
                InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                C1412 c1412 = c3532.f11707;
                float f = c3532.f11714;
                float f2 = c3532.f11710;
                C2808 c2808Mo3908 = interfaceC2442.mo3908();
                long jM5355 = c2808Mo3908.m5355();
                c2808Mo3908.m5353().mo2092();
                try {
                    ((C5086) c2808Mo3908.f9378).m8702(f, f2, 0L);
                    c1412.mo2982(interfaceC2442);
                    return c2358;
                } finally {
                    c2808Mo3908.m5353().mo2095();
                    c2808Mo3908.m5351(jM5355);
                }
        }
    }
}
