package p000;

/* JADX INFO: renamed from: ۦّؔۜؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4033 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4319 f13455;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13456;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4033(C4319 c4319, int i) {
        super(2);
        this.f13456 = i;
        this.f13455 = c4319;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13456;
        C2358 c2358 = C2358.f7817;
        C4319 c4319 = this.f13455;
        switch (i) {
            case 0:
                c4319.m7619().f3154 = (AbstractC2109) obj2;
                break;
            case 1:
                C0851 c0851M7619 = c4319.m7619();
                ((C0605) obj).m1322(new C3502(c0851M7619, (InterfaceC5731) obj2, c0851M7619.f3152));
                break;
            default:
                C0605 c0605 = (C0605) obj;
                InterfaceC3237 interfaceC3237 = c4319.f14283;
                C0851 c0851 = c0605.f2250;
                if (c0851 == null) {
                    c0851 = new C0851(c0605, interfaceC3237);
                    c0605.f2250 = c0851;
                }
                c4319.f14282 = c0851;
                c4319.m7619().m1811();
                C0851 c0851M76110 = c4319.m7619();
                if (c0851M76110.f3144 != interfaceC3237) {
                    c0851M76110.f3144 = interfaceC3237;
                    c0851M76110.m1809(false);
                    C0605.m1312(c0851M76110.f3155, false, 7);
                }
                break;
        }
        return c2358;
    }
}
