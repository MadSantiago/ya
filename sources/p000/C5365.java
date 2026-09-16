package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦٌ۟ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5365 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C4153 f17697;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17698;

    public /* synthetic */ C5365(C4153 c4153, int i) {
        this.f17698 = i;
        this.f17697 = c4153;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC4038 interfaceC4038, InterfaceC0443 interfaceC0443) {
        int i = this.f17698;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        C4153 c4153 = this.f17697;
        switch (i) {
            case 0:
                Object objM7173 = AbstractC4009.m7173(new C3820(interfaceC4038, c4153, null, 0), interfaceC0443);
                return objM7173 == enumC2282 ? objM7173 : c2358;
            default:
                Object objM7174 = AbstractC4009.m7173(new C3820(interfaceC4038, c4153, null, 1), interfaceC0443);
                return objM7174 == enumC2282 ? objM7174 : c2358;
        }
    }
}
