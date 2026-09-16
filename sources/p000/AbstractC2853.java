package p000;

/* JADX INFO: renamed from: ۥۧؒۤۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2853 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f9545 = new C4216(1, C3218.f10780);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4216 f9543 = new C4216(1, C3218.f10787);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C4216 f9535 = new C4216(1, C3218.f10792);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C4216 f9546 = new C4216(1, C3218.f10794);

    /* JADX INFO: renamed from: ۥُ */
    public static final C4216 f9537 = new C4216(1, C3218.f10793);

    /* JADX INFO: renamed from: ۥّ */
    public static final C4216 f9538 = new C4216(1, C3218.f10789);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4216 f9554 = new C4216(1, C3218.f10782);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C4216 f9544 = new C4216(1, C3218.f10797);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C4216 f9552 = new C4216(1, C3218.f10774);

    /* JADX INFO: renamed from: ۦِ */
    public static final C4216 f9549 = new C4216(1, C3218.f10802);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C4216 f9553 = new C4216(1, C3218.f10801);

    /* JADX INFO: renamed from: ۦؚ */
    public static final C4216 f9547 = new C4216(1, C3218.f10784);

    /* JADX INFO: renamed from: ۦٌ */
    public static final C4216 f9548 = new C4216(1, C3218.f10788);

    /* JADX INFO: renamed from: ۦۚ */
    public static final C4216 f9555 = new C4216(1, C3218.f10791);

    /* JADX INFO: renamed from: ۦۨ */
    public static final C4216 f9558 = new C4216(1, C3709.f12360);

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C4216 f9557 = new C4216(1, C3709.f12363);

    /* JADX INFO: renamed from: ۥْ */
    public static final C4216 f9539 = new C4216(1, C3709.f12359);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C4216 f9540 = new C4216(1, C3709.f12369);

    /* JADX INFO: renamed from: ۥَ */
    public static final C4216 f9536 = new C4216(1, C3709.f12371);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C4216 f9541 = new C4216(1, C3709.f12365);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C4216 f9551 = new C4216(1, C3709.f12368);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C4216 f9556 = new C4216(1, C3218.f10785);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C4216 f9542 = new C4216(0, C3709.f12361);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C4216 f9550 = new C4216(1, C3218.f10795);

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m5417(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m5418(InterfaceC2043 interfaceC2043, C0555 c0555, C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(1925803616);
        int i2 = (c5362.m8963(interfaceC2043) ? 4 : 2) | i | (c5362.m8963(c0555) ? 32 : 16) | (c5362.m8977(c0857) ? 256 : 128);
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043;
            C3467 c3467Mo4313 = f9545.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.m9767getAccessibilityManager());
            C3467 c3467Mo4314 = f9543.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getAutofill());
            C3467 c3467Mo4315 = f9546.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getAutofillManager());
            C3467 c3467Mo4316 = f9535.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getAutofillTree());
            C3467 c3467Mo4317 = f9537.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getClipboardManager());
            C3467 c3467Mo4318 = f9538.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getClipboard());
            C3467 c3467Mo4319 = f9544.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getDensity());
            C3467 c3467Mo43110 = f9552.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getFocusOwner());
            C3467 c3467Mo43111 = f9549.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getFontLoader());
            c3467Mo43111.f11502 = false;
            C3467 c3467Mo43112 = f9553.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getFontFamilyResolver());
            c3467Mo43112.f11502 = false;
            C4773.m8123(new C3467[]{c3467Mo4313, c3467Mo4314, c3467Mo4315, c3467Mo4316, c3467Mo4317, c3467Mo4318, c3467Mo4319, c3467Mo43110, c3467Mo43111, c3467Mo43112, f9547.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getHapticFeedBack()), f9548.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getInputModeManager()), f9555.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getLayoutDirection()), f9557.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getTextInputService()), f9539.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getSoftwareKeyboardController()), f9540.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getTextToolbar()), f9536.mo4313(c0555), f9541.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getViewConfiguration()), f9551.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getWindowInfo()), f9556.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getPointerIconService()), f9554.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getGraphicsContext()), AbstractC1761.f5866.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getRetainedValuesStore()), f9558.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getLocaleList())}, c0857, c5362, ((i2 >> 3) & 112) | 8);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3560(interfaceC2043, c0555, c0857, i);
        }
    }
}
