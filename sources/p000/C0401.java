package p000;

/* JADX INFO: renamed from: ۥٍؔؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0401 extends AbstractC5682 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0401 f1473 = new C0401(0, 2, 1);

    @Override // p000.AbstractC5682
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo182(C4902 c4902, InterfaceC4790 interfaceC4790, C0126 c0126, C0175 c0175, InterfaceC4617 interfaceC4617) {
        C4356 c4356 = (C4356) c4902.m8252(0);
        Object objM8252 = c4902.m8252(1);
        if (objM8252 instanceof C1670) {
            C1670 c1670 = (C1670) objM8252;
            ((C0863) c0175.f656).m1843(c1670);
            ((C3639) c0175.f660).m6495(c1670);
        }
        if (c0126.f502 != 0) {
            AbstractC5508.m9201("Can only append a slot if not current inserting");
        }
        int i = c0126.f499;
        int i2 = c0126.f496;
        int iM231 = c0126.m231(c4356);
        int iM235 = c0126.m235(c0126.f490, c0126.m236(iM231 + 1));
        c0126.f499 = iM235;
        c0126.f496 = iM235;
        c0126.m243(1, iM231);
        if (i >= iM235) {
            i++;
            i2++;
        }
        c0126.f482[iM235] = objM8252;
        c0126.f499 = i;
        c0126.f496 = i2;
    }
}
