package p000;

/* JADX INFO: renamed from: ۥِْٓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1283 {

    /* JADX INFO: renamed from: ۥؗ */
    public C0863 f4378;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f4379;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C2457 f4380;

    /* JADX INFO: renamed from: ۥۗ */
    public int f4381;

    /* JADX INFO: renamed from: ۥۣ */
    public AbstractC5381 f4382;

    /* JADX INFO: renamed from: ۦؑ */
    public C0863 f4383;

    public C1283(C2457 c2457, AbstractC5381 abstractC5381, int i, C0863 c0863, C0863 c0864, boolean z) {
        this.f4380 = c2457;
        this.f4382 = abstractC5381;
        this.f4381 = i;
        this.f4378 = c0863;
        this.f4383 = c0864;
        this.f4379 = z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m2713(int i, int i2) {
        C0863 c0863 = this.f4378;
        int i3 = this.f4381;
        InterfaceC2252 interfaceC2252 = (InterfaceC2252) c0863.f3182[i + i3];
        InterfaceC2252 interfaceC2253 = (InterfaceC2252) this.f4383.f3182[i3 + i2];
        return AbstractC3831.m6874(interfaceC2252, interfaceC2253) || interfaceC2252.getClass() == interfaceC2253.getClass();
    }
}
