package p000;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: ۥؗؔؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0598 extends AbstractC0993 {

    /* JADX INFO: renamed from: ۥً */
    public final /* synthetic */ AbstractComponentCallbacksC0308 f2220;

    /* JADX INFO: renamed from: ۥۧ */
    public final /* synthetic */ int f2221 = 1;

    public C0598(DialogInterfaceOnCancelListenerC2120 dialogInterfaceOnCancelListenerC2120, C0598 c0598) {
        this.f2220 = dialogInterfaceOnCancelListenerC2120;
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥٛ */
    public final View mo1305(int i) {
        int i2 = this.f2221;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f2220;
        switch (i2) {
            case 0:
                Dialog dialog = ((DialogInterfaceOnCancelListenerC2120) abstractComponentCallbacksC0308).f6968;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0308 + " does not have a view");
        }
    }

    @Override // p000.AbstractC0993
    /* JADX INFO: renamed from: ۥۤ */
    public final boolean mo1306() {
        switch (this.f2221) {
            case 0:
                return ((DialogInterfaceOnCancelListenerC2120) this.f2220).f6963;
            default:
                return false;
        }
    }

    public C0598(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        this.f2220 = abstractComponentCallbacksC0308;
    }
}
