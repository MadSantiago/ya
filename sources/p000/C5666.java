package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: ۦٜۤؖٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5666 extends AbstractC3019 implements InterfaceC5671 {

    /* JADX INFO: renamed from: ۥٕ */
    public C3263 f18636;

    /* JADX INFO: renamed from: ۥۙ */
    public C5745 f18637;

    /* JADX INFO: renamed from: ۥۦ */
    public InterfaceC4120 f18638;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f18639;

    /* JADX INFO: renamed from: ۦؗ */
    public C3635 f18640;

    /* JADX INFO: renamed from: ۦؙ */
    public C5837 f18641;

    /* JADX INFO: renamed from: ۦُ */
    public C2350 f18642;

    /* JADX INFO: renamed from: ۦٖ */
    public C3985 f18643;

    /* JADX INFO: renamed from: ۥؐ */
    public static void m9490(C5837 c5837, String str, boolean z) {
        if (z) {
            C2829 c2829 = c5837.f19223;
            C5149 c5149 = c5837.f19244;
            if (c2829 == null) {
                int length = str.length();
                c5149.mo211(new C5745(AbstractC2765.m5145(length, length), str, 4));
            } else {
                C5745 c5745M8417 = c5837.f19234.m8417(AbstractC2164.m4188(new C4077(), new C1472(1, str)));
                c2829.m5393(null, c5745M8417);
                c5149.mo211(c5745M8417);
            }
        }
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦَ */
    public final boolean mo787() {
        return true;
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        C1249 c1249 = this.f18637.f18944;
        InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
        C3059 c3059 = AbstractC2771.f9211;
        InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
        InterfaceC0504 interfaceC0504 = interfaceC0504Arr2[18];
        interfaceC1066.mo2266(c3059, c1249);
        C1249 c12410 = this.f18636.f10951;
        C3059 c30510 = AbstractC2771.f9219;
        InterfaceC0504 interfaceC0505 = interfaceC0504Arr2[19];
        interfaceC1066.mo2266(c30510, c12410);
        long j = this.f18637.f18943;
        C3059 c30511 = AbstractC2771.f9217;
        InterfaceC0504 interfaceC0506 = interfaceC0504Arr2[20];
        interfaceC1066.mo2266(c30511, new C3346(j));
        C5763 c5763 = C1397.f4786;
        C3059 c30512 = AbstractC2771.f9199;
        InterfaceC0504 interfaceC0507 = interfaceC0504Arr2[9];
        interfaceC1066.mo2266(c30512, c5763);
        C1272 c1272 = new C1272(AutofillValue.forText(this.f18637.f18944));
        C3059 c30513 = AbstractC2771.f9205;
        InterfaceC0504 interfaceC0508 = interfaceC0504Arr2[10];
        interfaceC1066.mo2266(c30513, c1272);
        AbstractC3992.m7133(interfaceC1066, new C1960(this, 0));
        int i = this.f18642.f7796;
        if (i == 6) {
            InterfaceC0730.f2664.getClass();
            C4291 c4291 = C2168.f7157;
            C3059 c30514 = AbstractC2771.f9203;
            InterfaceC0504 interfaceC0509 = interfaceC0504Arr2[8];
            interfaceC1066.mo2266(c30514, c4291);
        } else if (i == 7 || i == 8) {
            InterfaceC0730.f2664.getClass();
            C4291 c4292 = C2168.f7158;
            C3059 c30515 = AbstractC2771.f9203;
            InterfaceC0504 interfaceC05010 = interfaceC0504Arr2[8];
            interfaceC1066.mo2266(c30515, c4292);
        } else if (i == 4) {
            InterfaceC0730.f2664.getClass();
            C4291 c4293 = C2168.f7160;
            C3059 c30516 = AbstractC2771.f9203;
            InterfaceC0504 interfaceC05011 = interfaceC0504Arr2[8];
            interfaceC1066.mo2266(c30516, c4293);
        }
        if (!this.f18639) {
            interfaceC1066.mo2266(AbstractC2771.f9223, C2358.f7817);
        }
        boolean z = this.f18639;
        C3059 c30517 = AbstractC2771.f9235;
        InterfaceC0504 interfaceC05012 = interfaceC0504Arr2[28];
        interfaceC1066.mo2266(c30517, Boolean.valueOf(z));
        AbstractC3992.m7134(interfaceC1066, new C1960(this, 1));
        int i2 = 2;
        if (z) {
            interfaceC1066.mo2266(AbstractC0208.f783, new C0078(null, new C1960(this, i2)));
            interfaceC1066.mo2266(AbstractC0208.f788, new C0078(null, new C1960(this, interfaceC1066)));
        }
        interfaceC1066.mo2266(AbstractC0208.f779, new C0078(null, new C3032(1, this)));
        int i3 = this.f18642.f7792;
        C4582 c4582 = new C4582(this, 6);
        interfaceC1066.mo2266(AbstractC2771.f9214, new C0221(i3));
        interfaceC1066.mo2266(AbstractC0208.f787, new C0078(null, c4582));
        interfaceC1066.mo2266(AbstractC0208.f772, new C0078(null, new C4582(this, 7)));
        interfaceC1066.mo2266(AbstractC0208.f762, new C0078(null, new C4582(this, 1)));
        if (!C3346.m6107(this.f18637.f18943)) {
            interfaceC1066.mo2266(AbstractC0208.f767, new C0078(null, new C4582(this, 2)));
            if (this.f18639) {
                interfaceC1066.mo2266(AbstractC0208.f768, new C0078(null, new C4582(this, 3)));
            }
        }
        if (this.f18639) {
            interfaceC1066.mo2266(AbstractC0208.f764, new C0078(null, new C4582(this, 5)));
        }
    }
}
