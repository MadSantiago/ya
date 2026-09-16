package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: ۥۣۙؖ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2232 extends C0004 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C0605 f7396;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f7397;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0850 f7398;

    public C2232(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C0605 c0605, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851) {
        this.f7397 = viewTreeObserverOnGlobalLayoutListenerC0850;
        this.f7396 = c0605;
        this.f7398 = viewTreeObserverOnGlobalLayoutListenerC0851;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // p000.C0004
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo488(View view, C5817 c5817) {
        AccessibilityNodeInfo accessibilityNodeInfo = c5817.f19154;
        this.f870.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = this.f7397;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = viewTreeObserverOnGlobalLayoutListenerC0850.f3129;
        if (viewOnAttachStateChangeListenerC2392.m4492()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C0605 c0605 = this.f7396;
        C0605 c0605M1356 = c0605.m1356();
        while (true) {
            if (c0605M1356 == null) {
                c0605M1356 = null;
                break;
            } else if (c0605M1356.f2256.m4585(8)) {
                break;
            } else {
                c0605M1356 = c0605M1356.m1356();
            }
        }
        Integer numValueOf = c0605M1356 != null ? Integer.valueOf(c0605M1356.f2273) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9199().f10473) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        c5817.f19153 = iIntValue;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = this.f7398;
        accessibilityNodeInfo.setParent(viewTreeObserverOnGlobalLayoutListenerC0851, iIntValue);
        int i = c0605.f2273;
        int iM8891 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i);
        if (iM8891 != -1) {
            AbstractC2535 abstractC2535M7039 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui(), iM8891);
            if (abstractC2535M7039 != null) {
                accessibilityNodeInfo.setTraversalBefore(abstractC2535M7039);
            } else {
                accessibilityNodeInfo.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0851, iM8891);
            }
            viewTreeObserverOnGlobalLayoutListenerC0850.m1776(i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC2392.f7945);
        }
        int iM8892 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i);
        if (iM8892 != -1) {
            AbstractC2535 abstractC2535M70310 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui(), iM8892);
            if (abstractC2535M70310 != null) {
                accessibilityNodeInfo.setTraversalAfter(abstractC2535M70310);
            } else {
                accessibilityNodeInfo.setTraversalAfter(viewTreeObserverOnGlobalLayoutListenerC0851, iM8892);
            }
            viewTreeObserverOnGlobalLayoutListenerC0850.m1776(i, accessibilityNodeInfo, viewOnAttachStateChangeListenerC2392.f7950);
        }
    }
}
