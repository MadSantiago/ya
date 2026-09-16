package p000;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: ۦۣؕؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3261 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C1802 f10942;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0377 f10943;

    public C3261(C0377 c0377, C1802 c1802, InterfaceC3534 interfaceC3534, C1111 c1111) {
        this.f10943 = c0377;
        this.f10942 = c1802;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.7.");
        c0377.m825();
        Context applicationContext = c0377.f1410.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(c1111);
            AbstractC2765.m5135(AbstractC4009.m7151(interfaceC3534), null, 0, new C0023(this, c1111, null, 23), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
