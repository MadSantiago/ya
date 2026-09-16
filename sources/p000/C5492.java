package p000;

/* JADX INFO: renamed from: ۦۡؖۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5492 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ InterfaceC5731 f18102;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C0857 f18103;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC5731 f18104;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f18105;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ InterfaceC5731 f18106;

    public C5492(C0857 c0857, C0857 c0858, C0857 c0859, C0857 c08510, C0857 c08511) {
        this.f18106 = c0857;
        this.f18105 = c0858;
        this.f18103 = c0859;
        this.f18104 = c08510;
        this.f18102 = c08511;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC0993.m2166(this.f18106, this.f18105, this.f18103, this.f18104, this.f18102, c5362, 384);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
