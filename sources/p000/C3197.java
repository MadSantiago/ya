package p000;

/* JADX INFO: renamed from: ۦٕؓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3197 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C2154 f10733;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC2864 f10734;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C2243 f10735;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ boolean f10736;

    public C3197(boolean z, C2243 c2243, C2154 c2154, InterfaceC2864 interfaceC2864) {
        this.f10736 = z;
        this.f10735 = c2243;
        this.f10733 = c2154;
        this.f10734 = interfaceC2864;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            C0373.f1382.m802(this.f10736, this.f10735, null, this.f10733, this.f10734, 0.0f, 0.0f, c5362, 100663296, 200);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
