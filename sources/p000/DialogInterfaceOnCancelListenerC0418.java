package p000;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: ۥؔؗٓۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0418 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2120 f1509;

    public DialogInterfaceOnCancelListenerC0418(DialogInterfaceOnCancelListenerC2120 dialogInterfaceOnCancelListenerC2120) {
        this.f1509 = dialogInterfaceOnCancelListenerC2120;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC2120 dialogInterfaceOnCancelListenerC2120 = this.f1509;
        Dialog dialog = dialogInterfaceOnCancelListenerC2120.f6968;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC2120.onCancel(dialog);
        }
    }
}
