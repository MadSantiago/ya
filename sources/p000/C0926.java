package p000;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ۥٌِۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0926 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C4852 f3310 = AbstractC2774.m5183(Boolean.FALSE);

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1902(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C5505 c5505, InterfaceC3534 interfaceC3534, Consumer consumer) {
        C0863 c0863 = new C0863(new C4344[16]);
        AbstractC5568.m9375(c5505.m9199(), 0, new C1261(1, 8, C0863.class, c0863, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(c0863.f3182, 0, c0863.f3180, new C2201(0, new InterfaceC4745[]{C3948.f13193, C3948.f13198}));
        int i = c0863.f3180;
        C4344 c4344 = (C4344) (i == 0 ? null : c0863.f3182[i - 1]);
        if (c4344 == null) {
            return;
        }
        C4730 c4730 = c4344.f14332;
        ScrollCaptureCallbackC2259 scrollCaptureCallbackC2259 = new ScrollCaptureCallbackC2259(c4344.f14334, c4730, AbstractC4009.m7151(interfaceC3534), this, viewTreeObserverOnGlobalLayoutListenerC0850);
        AbstractC1311 abstractC1311 = c4344.f14335;
        C2793 c2793Mo2794 = C4773.m8145(abstractC1311).mo2794(abstractC1311, true);
        long jM8055 = c4730.m8055();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC0850, AbstractC4225.m7444(AbstractC2765.m5141(c2793Mo2794)), new Point((int) (jM8055 >> 32), (int) (jM8055 & 4294967295L)), scrollCaptureCallbackC2259);
        scrollCaptureTarget.setScrollBounds(AbstractC4225.m7444(c4730));
        consumer.accept(scrollCaptureTarget);
    }
}
