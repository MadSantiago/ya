package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: ۥۜؑۜۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC2366 extends DialogFragment {

    /* JADX INFO: renamed from: ۥْ */
    public AlertDialog f7833;

    /* JADX INFO: renamed from: ۦ۟ */
    public DialogInterface.OnCancelListener f7834;

    /* JADX INFO: renamed from: ۦۨ */
    public Dialog f7835;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7834;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7835;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        AlertDialog alertDialog = this.f7833;
        if (alertDialog != null) {
            return alertDialog;
        }
        Activity activity = getActivity();
        AbstractC0487.m1047(activity);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).create();
        this.f7833 = alertDialogCreate;
        return alertDialogCreate;
    }
}
