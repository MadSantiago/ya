package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: ۦٍٍؖٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3798 extends DialogInterfaceOnCancelListenerC2120 {

    /* JADX INFO: renamed from: ۦؐ */
    public AlertDialog f12611;

    /* JADX INFO: renamed from: ۦٔ */
    public Dialog f12612;

    /* JADX INFO: renamed from: ۦۦ */
    public DialogInterface.OnCancelListener f12613;

    @Override // p000.DialogInterfaceOnCancelListenerC2120, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f12613;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // p000.DialogInterfaceOnCancelListenerC2120
    /* JADX INFO: renamed from: ۥؓ */
    public final Dialog mo4102() {
        Dialog dialog = this.f12612;
        if (dialog != null) {
            return dialog;
        }
        this.f6967 = false;
        AlertDialog alertDialog = this.f12611;
        if (alertDialog != null) {
            return alertDialog;
        }
        C0827 c0827 = this.f1136;
        AbstractActivityC2747 abstractActivityC2747 = c0827 == null ? null : c0827.f2924;
        AbstractC0487.m1047(abstractActivityC2747);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(abstractActivityC2747).create();
        this.f12611 = alertDialogCreate;
        return alertDialogCreate;
    }
}
