package p000;

/* JADX INFO: renamed from: ۥؚۖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0808 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0808 f2878 = new C0808(0, 2, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        int i;
        C0888 c0888 = (C0888) c4902.m8252(0);
        int iM231 = c0126.m231((C4356) c4902.m8252(1));
        if (c0126.f488 >= iM231) {
            AbstractC5508.m9201("Check failed");
        }
        AbstractC5378.m9034(c0126, interfaceC4790, iM231);
        int i2 = c0126.f488;
        int iM262 = c0126.f503;
        while (iM262 >= 0 && !c0126.m259(iM262)) {
            iM262 = c0126.m262(c0126.f490, iM262);
        }
        int iM239 = iM262 + 1;
        int iM257 = 0;
        while (iM239 < i2) {
            if (c0126.m261(i2, iM239)) {
                if (c0126.m259(iM239)) {
                    iM257 = 0;
                }
                iM239++;
            } else {
                iM257 += c0126.m259(iM239) ? 1 : c0126.f490[(c0126.m236(iM239) * 5) + 1] & 67108863;
                iM239 += c0126.m239(iM239);
            }
        }
        while (true) {
            i = c0126.f488;
            if (i >= iM231) {
                break;
            }
            if (c0126.m261(iM231, i)) {
                int i3 = c0126.f488;
                if (i3 < c0126.f498 && (c0126.f490[(c0126.m236(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC4790.mo2816(c0126.m232(c0126.f488));
                    iM257 = 0;
                }
                c0126.m270();
            } else {
                iM257 += c0126.m257();
            }
        }
        if (i != iM231) {
            AbstractC5508.m9201("Check failed");
        }
        c0888.f3230 = iM257;
    }
}
