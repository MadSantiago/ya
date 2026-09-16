package p000;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ۦٚؓٝ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC4543 extends Handler {

    /* JADX INFO: renamed from: ۥۣ */
    public WeakReference f15009;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f15009.get(), message.what);
        } else {
            if (i != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
