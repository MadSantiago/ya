package p000;

/* JADX INFO: renamed from: ۥٗؒؑۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1510 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5028 f5125 = new C5028(29);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4668 f5126 = new C4668(5);

    /* JADX INFO: renamed from: ۥۗ */
    public volatile InterfaceC2090 f5127;

    /* JADX INFO: renamed from: ۥۣ */
    public InterfaceC2740 f5128;

    public C1510(C5028 c5028, InterfaceC2090 interfaceC2090) {
        this.f5128 = c5028;
        this.f5127 = interfaceC2090;
    }

    @Override // p000.InterfaceC2090
    public final Object get() {
        return this.f5127.get();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3185(InterfaceC2740 interfaceC2740) {
        InterfaceC2090 interfaceC2090;
        InterfaceC2090 interfaceC2091;
        InterfaceC2090 interfaceC2092 = this.f5127;
        C4668 c4668 = f5126;
        if (interfaceC2092 != c4668) {
            interfaceC2740.mo397(interfaceC2092);
            return;
        }
        synchronized (this) {
            interfaceC2090 = this.f5127;
            if (interfaceC2090 != c4668) {
                interfaceC2091 = interfaceC2090;
            } else {
                this.f5128 = new C5017(3, this.f5128, interfaceC2740);
                interfaceC2091 = null;
            }
        }
        if (interfaceC2091 != null) {
            interfaceC2740.mo397(interfaceC2090);
        }
    }
}
