package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: ۦٟ۠ؖؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5410 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f17863;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17864;

    public /* synthetic */ C5410(int i, Object obj) {
        this.f17864 = i;
        this.f17863 = obj;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC4038 interfaceC4038, InterfaceC0443 interfaceC0443) {
        int i = this.f17864;
        int i2 = 3;
        int i3 = 2;
        InterfaceC0443 interfaceC0444 = null;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj = this.f17863;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                Object objM4126 = AbstractC2133.m4126(interfaceC4038, new C0565((C2851) obj, interfaceC0444, 0), interfaceC0443);
                return objM4126 == enumC2282 ? objM4126 : c2358;
            case 1:
                Object objM7173 = AbstractC4009.m7173(new C0023(interfaceC4038, (C2384) obj, interfaceC0444, 29), interfaceC0443);
                return objM7173 == enumC2282 ? objM7173 : c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Object objM6011 = AbstractC3257.m6011(interfaceC4038, new C2288(2, (InterfaceC4448) obj), interfaceC0443);
                return objM6011 == enumC2282 ? objM6011 : c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                Object objM4552 = ((C2439) interfaceC4038).m4552(new C0565((C5149) obj, interfaceC0444, i2), interfaceC0443);
                return objM4552 == enumC2282 ? objM4552 : c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Object objM4127 = AbstractC2133.m4126(interfaceC4038, new C1623((C1135) obj, interfaceC0444, i2), interfaceC0443);
                return objM4127 == enumC2282 ? objM4127 : c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                Object objM4128 = AbstractC2133.m4126(interfaceC4038, new C0565(new C0037(1, (C5097) obj, C5097.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 22), interfaceC0444, i3), interfaceC0443);
                if (objM4128 != enumC2282) {
                    objM4128 = c2358;
                }
                return objM4128 == enumC2282 ? objM4128 : c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C3635 c3635 = (C3635) obj;
                Object objM5204 = AbstractC2774.m5204(interfaceC4038, c3635.f12137, c3635.f12145, interfaceC0443);
                return objM5204 == enumC2282 ? objM5204 : c2358;
            default:
                Object objM7174 = AbstractC4009.m7173(new C5486(interfaceC4038, (InterfaceC1126) obj, null), interfaceC0443);
                if (objM7174 != enumC2282) {
                    objM7174 = c2358;
                }
                return objM7174 == enumC2282 ? objM7174 : c2358;
        }
    }
}
