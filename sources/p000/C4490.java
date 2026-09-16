package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦٙؔۚؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4490 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C3635 f14866;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ InterfaceC1126 f14867;

    public C4490(InterfaceC1126 interfaceC1126, C3635 c3635) {
        this.f14867 = interfaceC1126;
        this.f14866 = c3635;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC4038 interfaceC4038, InterfaceC0443 interfaceC0443) {
        Object objM7173 = AbstractC4009.m7173(new C0478(interfaceC4038, this.f14867, this.f14866, null), interfaceC0443);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }
}
