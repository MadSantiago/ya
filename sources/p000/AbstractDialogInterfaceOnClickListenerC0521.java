package p000;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: ۥؖؒٝۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0521 implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                mo1171();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract void mo1171();
}
