package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: renamed from: ۦٌؘؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3239 extends AbstractC3959 {

    /* JADX INFO: renamed from: ۥۜ */
    public final Object f10878;

    /* JADX INFO: renamed from: ۦِ */
    public final C0291 f10879;

    /* JADX INFO: renamed from: ۦٛ */
    public volatile boolean f10880;

    /* JADX INFO: renamed from: ۦۙ */
    public final ConnectivityManager f10881;

    public C3239(Context context, C1489 c1489) {
        super(context, c1489);
        this.f10881 = (ConnectivityManager) ((Context) this.f13232).getSystemService("connectivity");
        this.f10878 = new Object();
        this.f10879 = new C0291(1, this);
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo757() {
        if (Build.VERSION.SDK_INT >= 28) {
            ConnectivityManager connectivityManager = this.f10881;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return AbstractC5798.m9607(networkCapabilities, this.f10880);
            }
        }
        return AbstractC5798.m9608(this.f10881, this.f10880);
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo758() {
        try {
            C1984.m3874().m3878(AbstractC5798.f19107, "Registering network callback");
            this.f10881.registerDefaultNetworkCallback(this.f10879);
        } catch (IllegalArgumentException e) {
            C1984.m3874().m3879(AbstractC5798.f19107, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            C1984.m3874().m3879(AbstractC5798.f19107, "Received exception while registering network callback", e2);
        }
    }

    @Override // p000.AbstractC3959
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo760() {
        try {
            C1984.m3874().m3878(AbstractC5798.f19107, "Unregistering network callback");
            this.f10881.unregisterNetworkCallback(this.f10879);
        } catch (IllegalArgumentException e) {
            C1984.m3874().m3879(AbstractC5798.f19107, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            C1984.m3874().m3879(AbstractC5798.f19107, "Received exception while unregistering network callback", e2);
        }
    }
}
