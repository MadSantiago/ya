package p000;

/* JADX INFO: renamed from: ۥٖؕ٘ٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1468 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C2243 f4993;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ boolean f4994;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C2316 f4995;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC5731 f4996;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2154 f4997;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC2864 f4998;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f4999;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5745 f5000;

    public C1468(C5745 c5745, boolean z, boolean z2, C2316 c2316, C2243 c2243, InterfaceC5731 interfaceC5731, C2154 c2154, InterfaceC2864 interfaceC2864) {
        this.f5000 = c5745;
        this.f4999 = z;
        this.f4994 = z2;
        this.f4995 = c2316;
        this.f4993 = c2243;
        this.f4996 = interfaceC5731;
        this.f4997 = c2154;
        this.f4998 = interfaceC2864;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        InterfaceC5731 interfaceC5731 = (InterfaceC5731) obj;
        C5362 c5362 = (C5362) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c5362.m8977(interfaceC5731) ? 4 : 2;
        }
        if (c5362.m9011(iIntValue & 1, (iIntValue & 19) != 18)) {
            C0373 c0373 = C0373.f1382;
            String str = this.f5000.f18944.f4307;
            InterfaceC2864 interfaceC2864 = this.f4998;
            boolean z = this.f4999;
            C2243 c2243 = this.f4993;
            C2154 c2154 = this.f4997;
            c0373.m801(str, interfaceC5731, z, this.f4994, this.f4995, c2243, this.f4996, c2154, null, AbstractC3925.m7034(1409265477, new C3197(z, c2243, c2154, interfaceC2864), c5362), c5362, (iIntValue << 3) & 112);
        } else {
            c5362.m8982();
        }
        return C2358.f7817;
    }
}
