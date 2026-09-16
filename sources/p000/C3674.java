package p000;

/* JADX INFO: renamed from: ۦًّؖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3674 extends C2818 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C4306 f12279;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3674(C4306 c4306) {
        super(1, AbstractC3831.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f12279 = c4306;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        float[] fArr = ((C0132) obj).f538;
        InterfaceC2015 interfaceC2015 = (InterfaceC2015) this.f12279.f14244.getValue();
        if (interfaceC2015 != null) {
            if (!interfaceC2015.mo2807()) {
                interfaceC2015 = null;
            }
            if (interfaceC2015 != null) {
                interfaceC2015.mo2791(fArr);
            }
        }
        return C2358.f7817;
    }
}
