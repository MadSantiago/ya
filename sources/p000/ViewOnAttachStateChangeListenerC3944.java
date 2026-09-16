package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؘِؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3944 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f13168;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13169;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3944(int i, Object obj) {
        this.f13169 = i;
        this.f13168 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f13169) {
            case 0:
                C4517 c4517 = (C4517) this.f13168;
                Context context = view.getContext();
                if (!c4517.f14929) {
                    context.getApplicationContext().registerComponentCallbacks(c4517.f14926);
                    c4517.f14929 = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f13169;
        Object obj = this.f13168;
        switch (i) {
            case 0:
                C4517 c4517 = (C4517) obj;
                Context context = view.getContext();
                if (c4517.f14929) {
                    context.getApplicationContext().unregisterComponentCallbacks(c4517.f14926);
                    c4517.f14929 = false;
                }
                break;
            case 1:
                ViewOnKeyListenerC5614 viewOnKeyListenerC5614 = (ViewOnKeyListenerC5614) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC5614.f18493;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC5614.f18493 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC5614.f18493.removeGlobalOnLayoutListener(viewOnKeyListenerC5614.f18484);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ViewOnKeyListenerC2416 viewOnKeyListenerC2416 = (ViewOnKeyListenerC2416) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC2416.f8054;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC2416.f8054 = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC2416.f8054.removeGlobalOnLayoutListener(viewOnKeyListenerC2416.f8061);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0054 abstractC0054 = (AbstractC0054) obj;
                ViewParent parent = abstractC0054.getParent();
                for (Object obj2 : parent == null ? C4703.f15512 : new C3306(new C0463(2, parent), C2896.f9652, 1)) {
                    if (obj2 instanceof View) {
                        Object tag = ((View) obj2).getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                abstractC0054.m5668();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C2127) obj).mo871(null);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    private final void m7106(View view) {
    }

    /* JADX INFO: renamed from: ۥۗ */
    private final void m7107(View view) {
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m7108(View view) {
    }

    /* JADX INFO: renamed from: ۦؑ */
    private final void m7109(View view) {
    }
}
