package p000;

/* JADX INFO: renamed from: ۥٟۨؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2915 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC5731 f9714;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0857 f9715;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC5731 f9716;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C2997 f9717;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ InterfaceC5731 f9718;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f9719;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9720;

    public C2915(int i, InterfaceC5731 interfaceC5731, C0857 c0857, InterfaceC5731 interfaceC5732, InterfaceC5731 interfaceC5733, C2997 c2997, InterfaceC5731 interfaceC5734) {
        this.f9720 = i;
        this.f9719 = interfaceC5731;
        this.f9715 = c0857;
        this.f9716 = interfaceC5732;
        this.f9714 = interfaceC5733;
        this.f9717 = c2997;
        this.f9718 = interfaceC5734;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC3831.m6852(this.f9720, this.f9719, this.f9715, this.f9716, this.f9714, this.f9717, this.f9718, c5362, 0);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
