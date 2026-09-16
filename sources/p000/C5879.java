package p000;

/* JADX INFO: renamed from: ۦۨؔۖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5879 implements InterfaceC2119 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C2332 f19407;

    public C5879(C2332 c2332) {
        this.f19407 = c2332;
    }

    @Override // p000.InterfaceC2119
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo4100(C2529 c2529) {
        int i = c2529.f8375;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f19407.m4374(c2529.f8376);
        return true;
    }

    @Override // p000.InterfaceC2119
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo4101(Exception exc) {
        return false;
    }
}
