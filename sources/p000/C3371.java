package p000;

/* JADX INFO: renamed from: ۦؖؗؑۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3371 implements InterfaceC4544, InterfaceC3609 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ AbstractC2109 f11257;

    public C3371(AbstractC2109 abstractC2109) {
        this.f11257 = abstractC2109;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC4544) && (obj instanceof InterfaceC3609)) {
            return mo6143().equals(((InterfaceC3609) obj).mo6143());
        }
        return false;
    }

    public final int hashCode() {
        return mo6143().hashCode();
    }

    @Override // p000.InterfaceC3609
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0400 mo6143() {
        return new C2818(1, 0, AbstractC2109.class, this.f11257, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }
}
