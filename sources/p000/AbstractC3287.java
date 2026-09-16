package p000;

/* JADX INFO: renamed from: ۦؕؖؕۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3287 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3668 f11015 = new C3668(AbstractC4225.f14014, C1298.f4433);

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3668 m6047(InterfaceC1367 interfaceC1367, C4274 c4274, C5362 c5362, int i) {
        if (interfaceC1367.equals(AbstractC4225.f14014) && AbstractC3831.m6874(c4274, C1298.f4433)) {
            c5362.m8957(-1073830487);
            c5362.m9009(false);
            return f11015;
        }
        c5362.m8957(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c5362.m8963(interfaceC1367)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c5362.m8963(c4274)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM8999 = c5362.m8999();
        if (z3 || objM8999 == C2850.f9517) {
            objM8999 = new C3668(interfaceC1367, c4274);
            c5362.m8987(objM8999);
        }
        C3668 c3668 = (C3668) objM8999;
        c5362.m9009(false);
        return c3668;
    }
}
