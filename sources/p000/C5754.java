package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: ۦۦٌؓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5754 extends C2019 {

    /* JADX INFO: renamed from: ۥِ */
    public boolean f18970;

    /* JADX INFO: renamed from: ۥۘ */
    public InterfaceC4745 f18971;

    /* JADX INFO: renamed from: ۦؔ */
    public final C0463 f18972;

    public C5754(boolean z, C2243 c2243, boolean z2, boolean z3, C2155 c2155, InterfaceC4745 interfaceC4745) {
        super(c2243, null, z2, z3, null, c2155, new C2669(interfaceC4745, z));
        this.f18970 = z;
        this.f18971 = interfaceC4745;
        this.f18972 = new C0463(13, this);
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۥؐ */
    public final void mo781(InterfaceC1066 interfaceC1066) {
        AbstractC3992.m7132(interfaceC1066, this.f18970 ? EnumC2887.f9632 : EnumC2887.f9631);
        C5763 c5763 = C1397.f4798;
        C3059 c3059 = AbstractC2771.f9199;
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        InterfaceC0504 interfaceC0504 = interfaceC0504Arr[9];
        interfaceC1066.mo2266(c3059, c5763);
        C1272 c1272 = new C1272(AutofillValue.forToggle(this.f18970));
        C3059 c30510 = AbstractC2771.f9205;
        InterfaceC0504 interfaceC0505 = interfaceC0504Arr[10];
        interfaceC1066.mo2266(c30510, c1272);
        AbstractC3992.m7133(interfaceC1066, new C0854(interfaceC1066, 1));
    }
}
