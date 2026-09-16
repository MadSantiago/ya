package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: renamed from: ۥؚٝؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1910 extends HandlerC0645 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C1991 f6301;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f6302;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1910(C1991 c1991, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f6301 = c1991;
        this.f6302 = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = C0600.f2226;
        C1991 c1991 = this.f6301;
        Context context = this.f6302;
        int iM1308 = c1991.m1308(context, i2);
        int i3 = AbstractC2292.f7616;
        if (iM1308 == 1 || iM1308 == 2 || iM1308 == 3 || iM1308 == 9) {
            Intent intentM1309 = c1991.m1309(iM1308, context, "n");
            c1991.m3897(context, iM1308, intentM1309 == null ? null : PendingIntent.getActivity(context, 0, intentM1309, 201326592));
        }
    }
}
