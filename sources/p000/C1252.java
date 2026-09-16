package p000;

/* JADX INFO: renamed from: ۥّٓؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1252 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1252 f4313 = new C1252();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f4312 = new C2423("kotlin.Short", C2204.f7299);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f4312;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        return Short.valueOf(interfaceC2125.mo4104());
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        c3782.m6700(((Number) obj).shortValue());
    }
}
