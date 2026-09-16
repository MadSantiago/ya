package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥۨؑۦۣ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2902 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f9663;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9664;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2902(int i, Object obj) {
        this.f9664 = i;
        this.f9663 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f9664;
        Object obj = this.f9663;
        switch (i) {
            case 0:
                C3689 c3689 = (C3689) obj;
                if (!c3689.getInternalPopup().mo2223()) {
                    c3689.f12313.mo2229(c3689.getTextDirection(), c3689.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c3689.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C3337 c3337 = (C3337) obj;
                C3689 c36810 = c3337.f11165;
                if (c36810.isAttachedToWindow() && c36810.getGlobalVisibleRect(c3337.f11167)) {
                    c3337.m6100();
                    c3337.mo1020();
                } else {
                    c3337.dismiss();
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ViewOnKeyListenerC5614 viewOnKeyListenerC5614 = (ViewOnKeyListenerC5614) obj;
                ArrayList arrayList = viewOnKeyListenerC5614.f18496;
                if (viewOnKeyListenerC5614.mo1018() && arrayList.size() > 0 && !((C5298) arrayList.get(0)).f17450.f3493) {
                    View view = viewOnKeyListenerC5614.f18477;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C5298) it.next()).f17450.mo1020();
                        }
                    } else {
                        viewOnKeyListenerC5614.dismiss();
                    }
                    break;
                }
                break;
            default:
                ViewOnKeyListenerC2416 viewOnKeyListenerC2416 = (ViewOnKeyListenerC2416) obj;
                C4144 c4144 = viewOnKeyListenerC2416.f8069;
                if (viewOnKeyListenerC2416.mo1018() && !c4144.f3493) {
                    View view2 = viewOnKeyListenerC2416.f8052;
                    if (view2 != null && view2.isShown()) {
                        c4144.mo1020();
                    } else {
                        viewOnKeyListenerC2416.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
