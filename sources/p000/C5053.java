package p000;

/* JADX INFO: renamed from: ۦۘؗؓۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5053 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3998 f16771;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16772 = 0;

    public /* synthetic */ C5053(C3998 c3998) {
        this.f16771 = c3998;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f16772;
        C2358 c2358 = C2358.f7817;
        C3998 c3998 = this.f16771;
        switch (i) {
            case 0:
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{-2769929141017142172L, 6777533075677172192L, -254604391866671339L, 2895155739358132266L, 8566170887597058735L, 2222365847527612093L, -6223618829310411041L, 2119235928844777783L}).toString();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    new C4441(new long[]{-4661537270062566526L, -1271649060472363926L, 631099614061232633L, -2048977129249018302L, 2299879784116961760L, -7811355459857872854L, 6632855628101136380L}).toString();
                    boolean zM8977 = c5362.m8977(c3998);
                    Object objM8999 = c5362.m8999();
                    if (zM8977 || objM8999 == C2850.f9517) {
                        objM8999 = new C0207(c3998, 1);
                        c5362.m8987(objM8999);
                    }
                    AbstractC3933.m7096((InterfaceC4448) objM8999, null, false, null, null, null, C4773.f15728, c5362, 805306368, 510);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2765.m5138(c3998, (C5362) obj, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C5053(C3998 c3998, int i) {
        this.f16771 = c3998;
    }
}
