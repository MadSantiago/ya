package p000;

/* JADX INFO: renamed from: ۦَؚّؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3591 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3591 f11947 = new C3591();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f11946 = new C2423("kotlin.Byte", C2204.f7304);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f11946;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        return Byte.valueOf(interfaceC2125.mo4115());
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        c3782.m6682(((Number) obj).byteValue());
    }
}
