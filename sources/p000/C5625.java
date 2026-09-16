package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: ۦَۣٕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5625 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4855 f18542;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C0605 f18543;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f18544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5625(C4855 c4855, C0605 c0605, int i) {
        super(1);
        this.f18544 = i;
        this.f18542 = c4855;
        this.f18543 = c0605;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        WindowInsets windowInsetsM4955;
        int i = this.f18544;
        C2358 c2358 = C2358.f7817;
        C0605 c0605 = this.f18543;
        C4855 c4855 = this.f18542;
        switch (i) {
            case 0:
                InterfaceC2043 interfaceC2043 = (InterfaceC2043) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = interfaceC2043 instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(c4855, c0605);
                    viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().addView(c4855);
                    viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(c0605, c4855);
                    c4855.setImportantForAccessibility(1);
                    AbstractC3608.m6434(c4855, new C2232(viewTreeObserverOnGlobalLayoutListenerC0850, c0605, viewTreeObserverOnGlobalLayoutListenerC0850));
                }
                if (c4855.getView().getParent() != c4855) {
                    c4855.addView(c4855.getView());
                }
                break;
            case 1:
                AbstractC5537.m9230(c4855, c0605);
                break;
            default:
                AbstractC5537.m9230(c4855, c0605);
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) c4855.f8397).f3064 = true;
                int[] iArr = c4855.f8405;
                int i2 = iArr[0];
                int i3 = iArr[1];
                c4855.getView().getLocationOnScreen(iArr);
                long j = c4855.f8395;
                long jMo2799 = ((InterfaceC2015) obj).mo2799();
                c4855.f8395 = jMo2799;
                C2639 c2639 = c4855.f8413;
                if (c2639 != null && ((i2 != iArr[0] || i3 != iArr[1] || !C4207.m7431(j, jMo2799)) && (windowInsetsM4955 = c4855.m4766(c2639).m4955()) != null)) {
                    c4855.getView().dispatchApplyWindowInsets(windowInsetsM4955);
                }
                break;
        }
        return c2358;
    }
}
