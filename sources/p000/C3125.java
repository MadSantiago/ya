package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦؒؕ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3125 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C2243 f10467;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ InterfaceC4367 f10468;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ InterfaceC4643 f10469;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ InterfaceC4367 f10470;

    public C3125(InterfaceC4643 interfaceC4643, InterfaceC4367 interfaceC4367, C2243 c2243, InterfaceC4367 interfaceC4368) {
        this.f10469 = interfaceC4643;
        this.f10468 = interfaceC4367;
        this.f10467 = c2243;
        this.f10470 = interfaceC4368;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC4038 interfaceC4038, InterfaceC0443 interfaceC0443) {
        C2695 c2695 = new C2695(this.f10469, this.f10468, this.f10467, null);
        C2136 c2136 = new C2136(this.f10470, 8);
        C5499 c5499 = AbstractC3257.f10934;
        Object objM7173 = AbstractC4009.m7173(new C2495(interfaceC4038, c2695, c2136, new C3821(interfaceC4038), null, 6), interfaceC0443);
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objM7173 != enumC2282) {
            objM7173 = c2358;
        }
        return objM7173 == enumC2282 ? objM7173 : c2358;
    }
}
