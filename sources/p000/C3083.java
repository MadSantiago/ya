package p000;

/* JADX INFO: renamed from: ۦؘؒؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3083 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C1705 f10342;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10343;

    public /* synthetic */ C3083(C1705 c1705, int i) {
        this.f10343 = i;
        this.f10342 = c1705;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f10343;
        C2358 c2358 = C2358.f7817;
        C1705 c1705 = this.f10342;
        C1117 c1117 = (C1117) obj;
        switch (i) {
            case 0:
                C4536 c4536 = c1705.f5675;
                float fM1711 = c4536.f14997.m1711();
                float fM6154 = c4536.m7862().m6154();
                float f = fM1711 < fM6154 ? fM6154 - fM1711 : 0.0f;
                c1117.m2345(f > 0.0f ? (Float.intBitsToFloat((int) (c1117.f3916 & 4294967295L)) + f) / Float.intBitsToFloat((int) (c1117.f3916 & 4294967295L)) : 1.0f);
                c1117.m2343(AbstractC3801.m6753(0.5f, 0.0f));
                break;
            default:
                C4536 c4537 = c1705.f5675;
                float fM1712 = c4537.f14997.m1711();
                float fM6155 = c4537.m7862().m6154();
                float f2 = fM1712 < fM6155 ? fM6155 - fM1712 : 0.0f;
                c1117.m2345(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (c1117.f3916 & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & c1117.f3916))) : 1.0f);
                c1117.m2343(AbstractC3801.m6753(0.5f, 0.0f));
                break;
        }
        return c2358;
    }
}
