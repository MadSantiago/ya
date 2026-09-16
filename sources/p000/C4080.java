package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: ۦْؕٗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4080 extends AbstractC1127 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2392 f13602;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f13603;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4080(ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392, int i) {
        super(1);
        this.f13603 = i;
        this.f13602 = viewOnAttachStateChangeListenerC2392;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f13603;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f13602;
        switch (i) {
            case 0:
                View view = viewOnAttachStateChangeListenerC2392.f7934;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                C0967 c0967 = (C0967) obj;
                if (c0967.f3416.contains(c0967)) {
                    C1775 snapshotObserver = viewOnAttachStateChangeListenerC2392.f7934.getSnapshotObserver();
                    snapshotObserver.f5926.m9077(c0967, viewOnAttachStateChangeListenerC2392.f7949, new C5304(1, c0967, viewOnAttachStateChangeListenerC2392));
                }
                return C2358.f7817;
        }
    }
}
