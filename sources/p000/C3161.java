package p000;

/* JADX INFO: renamed from: ۦؚؓؒۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3161 implements InterfaceC4311, InterfaceC4707, InterfaceC4636 {
    private final InterfaceC3196 job;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC4311 f10642;

    public C3161(C4994 c4994, C2127 c2127) {
        this.f10642 = c4994;
        this.job = c2127;
    }

    @Override // p000.InterfaceC4311
    public final Object getValue() {
        return this.f10642.getValue();
    }

    @Override // p000.InterfaceC4707
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo1575(InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) {
        return this.f10642.mo1575(interfaceC4161, interfaceC0443);
    }

    @Override // p000.InterfaceC4636
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4707 mo1913(InterfaceC3534 interfaceC3534, int i, int i2) {
        return ((((i < 0 || i >= 2) && i != -2) || i2 != 2) && !((i == 0 || i == -3) && i2 == 1)) ? new C2072(this, interfaceC3534, i, i2) : this;
    }
}
