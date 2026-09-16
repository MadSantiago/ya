package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥْؑۥؘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1195 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۗ */
    public static final AtomicReference f4123 = new AtomicReference();

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f4124;

    public C1195(Context context) {
        this.f4124 = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C0377.f1404) {
            try {
                Iterator it = ((C3300) C0377.f1403.values()).iterator();
                while (it.hasNext()) {
                    ((C0377) it.next()).m826();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4124.unregisterReceiver(this);
    }
}
