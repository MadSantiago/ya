package p000;

import android.view.MotionEvent;

/* JADX INFO: renamed from: ۦۚؒٞۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5157 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C4855 f17087;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17088;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5157(C4855 c4855, int i) {
        super(1);
        this.f17088 = i;
        this.f17087 = c4855;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.f17088;
        C2358 c2358 = C2358.f7817;
        C4855 c4855 = this.f17087;
        switch (i) {
            case 0:
                InterfaceC2043 interfaceC2043 = (InterfaceC2043) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = interfaceC2043 instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043 : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().removeViewInLayout(c4855);
                    AbstractC3801.m6785(viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(c4855));
                    c4855.setImportantForAccessibility(0);
                }
                c4855.removeAllViewsInLayout();
                return c2358;
            case 1:
                c4855.f8399 = (InterfaceC4745) obj;
                return c2358;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        zDispatchTouchEvent = c4855.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c4855.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
