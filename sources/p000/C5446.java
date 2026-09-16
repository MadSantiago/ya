package p000;

/* JADX INFO: renamed from: ۦۡؒؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5446 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC5731 f17960;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ long f17961;

    public C5446(long j, InterfaceC5731 interfaceC5731) {
        this.f17961 = j;
        this.f17960 = interfaceC5731;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        C5362 c5362 = (C5362) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC0487.m1071(this.f17961, this.f17960, c5362, 0);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
