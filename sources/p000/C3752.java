package p000;

/* JADX INFO: renamed from: ۦٌٜؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3752 implements InterfaceC0133 {

    /* JADX INFO: renamed from: ۥۗ */
    public static Boolean f12484;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3752 f12485 = new C3752();

    @Override // p000.InterfaceC0133
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo295() {
        Boolean bool = f12484;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC3761.m6633("canFocus is read before it is written");
    }

    @Override // p000.InterfaceC0133
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo299(boolean z) {
        f12484 = Boolean.valueOf(z);
    }
}
