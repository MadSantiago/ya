package p000;

/* JADX INFO: renamed from: ۦؘُۡ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5501 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3113 f18163 = new C3113(AbstractC4225.f14009, C1298.f4443);

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3113 m9197(InterfaceC3195 interfaceC3195, C1911 c1911, C5362 c5362, int i) {
        if (interfaceC3195.equals(AbstractC4225.f14009) && c1911.equals(C1298.f4443)) {
            c5362.m8957(-1446604504);
            c5362.m9009(false);
            return f18163;
        }
        c5362.m8957(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c5362.m8963(interfaceC3195)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c5362.m8963(c1911)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM8999 = c5362.m8999();
        if (z3 || objM8999 == C2850.f9517) {
            objM8999 = new C3113(interfaceC3195, c1911);
            c5362.m8987(objM8999);
        }
        C3113 c3113 = (C3113) objM8999;
        c5362.m9009(false);
        return c3113;
    }
}
