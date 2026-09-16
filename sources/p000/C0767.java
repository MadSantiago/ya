package p000;

/* JADX INFO: renamed from: ۥؚؑ٘ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0767 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C1347 f2783 = new C1347();

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1658(C0767 c0767, InterfaceC5731 interfaceC5731, C0857 c0857, InterfaceC4448 interfaceC4448, int i) {
        if ((i & 8) != 0) {
            c0857 = null;
        }
        c0767.f2783.add(new C0857(-1789283891, new C5532(interfaceC5731, c0767, c0857, interfaceC4448), true));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1659(C2450 c2450, C5362 c5362, int i) {
        c5362.m8979(-798501095);
        int i2 = (c5362.m8963(c2450) ? 4 : 2) | i | (c5362.m8963(this) ? 32 : 16);
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            C1347 c1347 = this.f2783;
            int size = c1347.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC2609) c1347.get(i3)).mo1173(c2450, c5362, Integer.valueOf(i2 & 14));
            }
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 3, this, c2450);
        }
    }
}
