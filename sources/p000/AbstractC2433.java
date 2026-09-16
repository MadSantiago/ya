package p000;

import android.view.View;
import android.view.ViewGroup;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥ۟ؒۧؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2433 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final ViewGroup.LayoutParams f8099 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final C2074 m4546(AbstractC0054 abstractC0054, C5686 c5686, C0857 c0857) {
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        C2074 c2074;
        byte b = 0;
        if (AbstractC2091.f6885.compareAndSet(false, true)) {
            C5559 c5559M3405 = AbstractC1631.m3405(1, 0, 6);
            AbstractC2765.m5135(AbstractC4009.m7151((InterfaceC3534) C5418.f17882.getValue()), null, 0, new C0061((Object) c5559M3405, (InterfaceC0443) (b == true ? 1 : 0), 19), 3);
            C2932 c2932 = new C2932(16, c5559M3405);
            synchronized (AbstractC1538.f5203) {
                AbstractC1538.f5211 = AbstractC0973.m2046(AbstractC1538.f5211, c2932);
            }
            AbstractC1538.m3269();
        }
        if (abstractC0054.getChildCount() > 0) {
            View childAt = abstractC0054.getChildAt(0);
            viewTreeObserverOnGlobalLayoutListenerC0850 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0850 ? (ViewTreeObserverOnGlobalLayoutListenerC0850) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0850 != null) {
                viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContext(c5686);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0850 == null) {
                viewTreeObserverOnGlobalLayoutListenerC0850 = new ViewTreeObserverOnGlobalLayoutListenerC0850(abstractC0054.getContext(), c5686);
                abstractC0054.addView(viewTreeObserverOnGlobalLayoutListenerC0850.getView(), f8099);
            }
            viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContext(c5686);
            if (abstractC0054.getComposeViewContext$ui() != null) {
                c5686.m9500();
                viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0850.getTag(R.id.wrapped_composition_tag);
            c2074 = tag instanceof C2074 ? (C2074) tag : null;
            if (c2074 == null) {
                c2074 = new C2074(viewTreeObserverOnGlobalLayoutListenerC0850, new C1946(c5686.f18698, new C1326(viewTreeObserverOnGlobalLayoutListenerC0850.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC0850.setTag(R.id.wrapped_composition_tag, c2074);
            }
            c2074.m4018(c0857);
            viewTreeObserverOnGlobalLayoutListenerC0850.setFrameEndScheduler$ui(new C3371(c5686.f18698));
            return c2074;
        }
        abstractC0054.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC0850 = null;
        if (viewTreeObserverOnGlobalLayoutListenerC0850 == null) {
            viewTreeObserverOnGlobalLayoutListenerC0850 = new ViewTreeObserverOnGlobalLayoutListenerC0850(abstractC0054.getContext(), c5686);
            abstractC0054.addView(viewTreeObserverOnGlobalLayoutListenerC0850.getView(), f8099);
        }
        viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContext(c5686);
        if (abstractC0054.getComposeViewContext$ui() != null) {
            c5686.m9500();
            viewTreeObserverOnGlobalLayoutListenerC0850.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC0850.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C2074) {
        }
        if (c2074 == null) {
            c2074 = new C2074(viewTreeObserverOnGlobalLayoutListenerC0850, new C1946(c5686.f18698, new C1326(viewTreeObserverOnGlobalLayoutListenerC0850.getRoot())));
            viewTreeObserverOnGlobalLayoutListenerC0850.setTag(R.id.wrapped_composition_tag, c2074);
        }
        c2074.m4018(c0857);
        viewTreeObserverOnGlobalLayoutListenerC0850.setFrameEndScheduler$ui(new C3371(c5686.f18698));
        return c2074;
    }
}
