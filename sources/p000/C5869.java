package p000;

/* JADX INFO: renamed from: ۦًۨؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5869 implements InterfaceC3424 {

    /* JADX INFO: renamed from: ۥَ */
    public Object[] f19381;

    /* JADX INFO: renamed from: ۥْ */
    public String f19382;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f19383;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC0468 f19384;

    /* JADX INFO: renamed from: ۦٗ */
    public final C0101 f19385 = new C0101(27, this);

    /* JADX INFO: renamed from: ۦ۟ */
    public InterfaceC0814 f19386;

    /* JADX INFO: renamed from: ۦۨ */
    public InterfaceC2856 f19387;

    public C5869(InterfaceC2856 interfaceC2856, InterfaceC0814 interfaceC0814, String str, Object obj, Object[] objArr) {
        this.f19387 = interfaceC2856;
        this.f19386 = interfaceC0814;
        this.f19382 = str;
        this.f19383 = obj;
        this.f19381 = objArr;
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3769() {
        m9686();
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۥُ */
    public final void mo3770() {
        InterfaceC0468 interfaceC0468 = this.f19384;
        if (interfaceC0468 != null) {
            ((C2808) interfaceC0468).m5350();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9686() {
        String strM9073;
        InterfaceC0814 interfaceC0814 = this.f19386;
        if (this.f19384 != null) {
            C2316.m4357(this.f19384, ") is not null", "entry(");
            return;
        }
        if (interfaceC0814 != null) {
            C0101 c0101 = this.f19385;
            Object objMo449 = c0101.mo449();
            if (objMo449 == null || interfaceC0814.mo1712(objMo449)) {
                this.f19384 = interfaceC0814.mo1714(this.f19382, c0101);
                return;
            }
            if (objMo449 instanceof InterfaceC5910) {
                InterfaceC5910 interfaceC5910 = (InterfaceC5910) objMo449;
                if (interfaceC5910.mo355() == C0373.f1364 || interfaceC5910.mo355() == C1298.f4439 || interfaceC5910.mo355() == C1397.f4792) {
                    strM9073 = "MutableState containing " + interfaceC5910.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM9073 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM9073 = AbstractC5378.m9073(objMo449);
            }
            throw new IllegalArgumentException(strM9073);
        }
    }

    @Override // p000.InterfaceC3424
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo3772() {
        InterfaceC0468 interfaceC0468 = this.f19384;
        if (interfaceC0468 != null) {
            ((C2808) interfaceC0468).m5350();
        }
    }
}
