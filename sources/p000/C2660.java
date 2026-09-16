package p000;

/* JADX INFO: renamed from: ۥۤؑ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2660 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2660 f8819 = new C2660(1, 0, 2);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        int iM8250 = c4902.m8250(0);
        int i = c0126.f503;
        int iM229 = c0126.m229(c0126.f490, c0126.m236(i));
        int iM235 = c0126.m235(c0126.f490, c0126.m236(i + 1));
        for (int iMax = Math.max(iM229, iM235 - iM8250); iMax < iM235; iMax++) {
            Object obj = c0126.f482[c0126.m265(iMax)];
            if (obj instanceof C1670) {
                c0175.m369((C1670) obj);
            } else if (obj instanceof C5863) {
                ((C5863) obj).m9681();
            }
        }
        if (iM8250 <= 0) {
            AbstractC5508.m9201("Check failed");
        }
        int i2 = c0126.f503;
        int iM2210 = c0126.m229(c0126.f490, c0126.m236(i2));
        int iM236 = c0126.m235(c0126.f490, c0126.m236(i2 + 1)) - iM8250;
        if (iM236 < iM2210) {
            AbstractC5508.m9201("Check failed");
        }
        c0126.m248(iM236, iM8250, i2);
        int i3 = c0126.f499;
        if (i3 >= iM2210) {
            c0126.f499 = i3 - iM8250;
        }
    }
}
