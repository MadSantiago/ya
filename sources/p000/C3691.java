package p000;

/* JADX INFO: renamed from: ۦًٖۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3691 implements InterfaceC5743 {

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC5743[] f12322;

    @Override // p000.InterfaceC5743
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo6545(Class cls) {
        for (InterfaceC5743 interfaceC5743 : this.f12322) {
            if (interfaceC5743.mo6545(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC5743
    /* JADX INFO: renamed from: ۥۣ */
    public final C4022 mo6546(Class cls) {
        for (InterfaceC5743 interfaceC5743 : this.f12322) {
            if (interfaceC5743.mo6545(cls)) {
                return interfaceC5743.mo6546(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
