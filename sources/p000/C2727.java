package p000;

/* JADX INFO: renamed from: ۥۥؓؓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2727 extends AbstractViewOnTouchListenerC5472 {

    /* JADX INFO: renamed from: ۥٙ */
    public final /* synthetic */ C3689 f9031;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ C3337 f9032;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727(C3689 c3689, C3689 c36810, C3337 c3337) {
        super(c36810);
        this.f9031 = c3689;
        this.f9032 = c3337;
    }

    @Override // p000.AbstractViewOnTouchListenerC5472
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo5072() {
        C3689 c3689 = this.f9031;
        if (c3689.getInternalPopup().mo2223()) {
            return true;
        }
        c3689.f12313.mo2229(c3689.getTextDirection(), c3689.getTextAlignment());
        return true;
    }

    @Override // p000.AbstractViewOnTouchListenerC5472
    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC0470 mo5073() {
        return this.f9032;
    }
}
