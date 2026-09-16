package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: ۥٓؓؔٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f4332;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f4333;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1264(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, int i) {
        super(1);
        this.f4333 = i;
        this.f4332 = viewTreeObserverOnGlobalLayoutListenerC0850;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f4333;
        C2358 c2358 = C2358.f7817;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f4332;
        switch (i) {
            case 0:
                ((C2016) viewTreeObserverOnGlobalLayoutListenerC0850.getFocusOwner()).m3933(((C1057) obj).f3729, false);
                return c2358;
            case 1:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                viewTreeObserverOnGlobalLayoutListenerC0850.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0850.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC4448.mo449();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0850.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC1056(1, interfaceC4448));
                    }
                }
                return c2358;
            default:
                return new C0717(viewTreeObserverOnGlobalLayoutListenerC0850, viewTreeObserverOnGlobalLayoutListenerC0850.getTextInputService(), (InterfaceC4643) obj);
        }
    }
}
