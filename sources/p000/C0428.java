package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۥؔٗٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0428 implements InterfaceC5641 {

    /* JADX INFO: renamed from: ۥْ */
    public final InterfaceC5641 f1543;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3121 f1544;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1545;

    public C0428(InterfaceC5641 interfaceC5641, C3121 c3121) {
        this.f1545 = 2;
        this.f1543 = interfaceC5641;
        this.f1544 = c3121;
    }

    @Override // p000.InterfaceC4895
    public final Object get() {
        int i = this.f1545;
        C3121 c3121 = this.f1544;
        InterfaceC5641 interfaceC5641 = this.f1543;
        switch (i) {
            case 0:
                Context context = (Context) c3121.f10451;
                return C1397.m2961(C1298.f4425, new C4122(new C2582(3)), AbstractC4009.m7151((InterfaceC3534) interfaceC5641.get()), new C3154(context, 0));
            case 1:
                return new C4590((Context) c3121.f10451, (C3142) interfaceC5641.get());
            default:
                return new C1769((C5899) interfaceC5641.get(), (InterfaceC3534) c3121.f10451);
        }
    }

    public /* synthetic */ C0428(C3121 c3121, InterfaceC5641 interfaceC5641, int i) {
        this.f1545 = i;
        this.f1544 = c3121;
        this.f1543 = interfaceC5641;
    }
}
