package p000;

import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: ۥًؙؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0854 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ InterfaceC1066 f3158;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3159;

    public /* synthetic */ C0854(InterfaceC1066 interfaceC1066, int i) {
        this.f3159 = i;
        this.f3158 = interfaceC1066;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Throwable {
        Boolean boolValueOf;
        int i = this.f3159;
        boolean z = false;
        EnumC2887 enumC2887 = EnumC2887.f9631;
        EnumC2887 enumC2888 = EnumC2887.f9632;
        InterfaceC1066 interfaceC1066 = this.f3158;
        switch (i) {
            case 0:
                C3190 c3190 = (C3190) ((InterfaceC0289) obj);
                c3190.f10716 = true;
                c3190.f10715.mo211(interfaceC1066);
                AbstractC0186.m412(c3190);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((C1272) obj).f4344;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        enumC2887 = enumC2888;
                    }
                    AbstractC3992.m7132(interfaceC1066, enumC2887);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((C1272) obj).f4344;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        enumC2887 = enumC2888;
                    }
                    AbstractC3992.m7132(interfaceC1066, enumC2887);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
