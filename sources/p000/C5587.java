package p000;

/* JADX INFO: renamed from: ۦۣؒٗؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5587 implements InterfaceC5743 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5587 f18421 = new C5587(0);

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18422;

    public /* synthetic */ C5587(int i) {
        this.f18422 = i;
    }

    @Override // p000.InterfaceC5743
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean mo6545(Class cls) {
        switch (this.f18422) {
            case 0:
                return AbstractC0318.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // p000.InterfaceC5743
    /* JADX INFO: renamed from: ۥۣ */
    public final C4022 mo6546(Class cls) {
        switch (this.f18422) {
            case 0:
                if (!AbstractC0318.class.isAssignableFrom(cls)) {
                    C1078.m2272("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (C4022) AbstractC0318.m672(cls.asSubclass(AbstractC0318.class)).mo674(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
