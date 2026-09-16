package p000;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: ۦۡٞٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5505 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC5746 f18176;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4805 f18177;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0605 f18178;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2730 f18179 = new C2730(2);

    public C5505(C0605 c0605, C4805 c4805, C4912 c4912) {
        this.f18178 = c0605;
        this.f18177 = c4805;
        this.f18176 = c4912;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX INFO: renamed from: ۥۗ */
    public final void m9198(C0605 c0605, C2542 c2542) {
        String str;
        String strM9761;
        EnumC2887 enumC2887;
        EnumC2887 enumC2888;
        C1272 c1272;
        C1272 c1273;
        C2730 c2730 = this.f18179;
        Object[] objArr = c2730.f9041;
        int i = c2730.f9040;
        for (int i2 = 0; i2 < i; i2++) {
            C0193 c0193 = (C0193) objArr[i2];
            C3121 c3121 = c0193.f720;
            AutofillManager autofillManager = (AutofillManager) c3121.f10451;
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = c0193.f713;
            C2542 c2542M1331 = c0605.m1331();
            int i3 = c0605.f2273;
            if (c2542 != null) {
                Object objM6027 = c2542.f8490.m6027(AbstractC2771.f9211);
                if (objM6027 == null) {
                    objM6027 = null;
                }
                C1249 c1249 = (C1249) objM6027;
                if (c1249 != null) {
                    str = c1249.f4307;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (c2542M1331 != null) {
                Object objM6028 = c2542M1331.f8490.m6027(AbstractC2771.f9211);
                if (objM6028 == null) {
                    objM6028 = null;
                }
                C1249 c12410 = (C1249) objM6028;
                if (c12410 != null) {
                    strM9761 = c12410.f4307;
                } else {
                    strM9761 = null;
                }
            } else {
                strM9761 = null;
            }
            if (str != strM9761) {
                if (str == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, true);
                } else if (strM9761 == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, false);
                } else if (AbstractC3831.m6874((C5763) AbstractC4009.m7178(c2542M1331, AbstractC2771.f9199), C1397.f4786)) {
                    if (strM9761.length() >= 5000) {
                        strM9761 = (Character.isHighSurrogate(strM9761.charAt(4999)) && Character.isLowSurrogate(strM9761.charAt(5000))) ? AbstractC0684.m9761(4999, strM9761) : AbstractC0684.m9761(5000, strM9761);
                    }
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0850, i3, AutofillValue.forText(strM9761));
                }
            }
            if (c2542 != null) {
                Object objM6029 = c2542.f8490.m6027(AbstractC2771.f9222);
                if (objM6029 == null) {
                    objM6029 = null;
                }
                enumC2887 = (EnumC2887) objM6029;
            } else {
                enumC2887 = null;
            }
            if (c2542M1331 != null) {
                Object objM60210 = c2542M1331.f8490.m6027(AbstractC2771.f9222);
                if (objM60210 == null) {
                    objM60210 = null;
                }
                enumC2888 = (EnumC2887) objM60210;
            } else {
                enumC2888 = null;
            }
            if (enumC2887 != enumC2888) {
                if (enumC2887 == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, true);
                } else if (enumC2888 == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, false);
                } else if (AbstractC3831.m6874((C5763) AbstractC4009.m7178(c2542M1331, AbstractC2771.f9199), C1397.f4798)) {
                    int iOrdinal = enumC2888.ordinal();
                    Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0850, i3, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            if (c2542 != null) {
                Object objM60211 = c2542.f8490.m6027(AbstractC2771.f9205);
                if (objM60211 == null) {
                    objM60211 = null;
                }
                c1272 = (C1272) objM60211;
            } else {
                c1272 = null;
            }
            if (c2542M1331 != null) {
                Object objM60212 = c2542M1331.f8490.m6027(AbstractC2771.f9205);
                if (objM60212 == null) {
                    objM60212 = null;
                }
                c1273 = (C1272) objM60212;
            } else {
                c1273 = null;
            }
            if (!AbstractC3831.m6874(c1272, c1273)) {
                if (c1272 == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, true);
                } else if (c1273 == null) {
                    c3121.m5743(viewTreeObserverOnGlobalLayoutListenerC0850, i3, false);
                } else {
                    autofillManager.notifyValueChanged(viewTreeObserverOnGlobalLayoutListenerC0850, i3, c1273.f4344);
                }
            }
            boolean z = c2542 != null && c2542.f8490.m6018(AbstractC2771.f9203);
            boolean z2 = c2542M1331 != null && c2542M1331.f8490.m6018(AbstractC2771.f9203);
            if (z != z2) {
                C0482 c0482 = c0193.f718;
                if (z2) {
                    c0482.m1032(i3);
                } else {
                    c0482.m1030(i3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C3129 m9199() {
        return new C3129(this.f18177, false, this.f18178, new C2542());
    }
}
