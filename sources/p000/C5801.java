package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: ۦًٌۧؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5801 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۣ */
    public static volatile C3743 f19117;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        C3743 c3743 = f19117;
        if (c3743 == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        C0417 c0417 = (C0417) ((C4601) c3743.f12466).f15183.get(stringExtra);
        if (c0417 != null) {
            c0417.f1508.m5591();
        }
    }
}
