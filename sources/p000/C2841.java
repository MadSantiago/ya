package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: ۥۦًۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2841 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f9487;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f9488;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5034 f9489;

    public C2841(C5034 c5034) {
        this.f9489 = c5034;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5034 c5034 = this.f9489;
        c5034.m8490();
        String action = intent.getAction();
        c5034.mo2404().f12023.m9430(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            c5034.mo2404().f12022.m9430(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C1518 c1518 = c5034.f16696;
        C5034.m8484(c1518);
        boolean zM3250 = c1518.m3250();
        if (this.f9487 != zM3250) {
            this.f9487 = zM3250;
            c5034.mo2406().m6515(new RunnableC3365(this, zM3250));
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5407() {
        C5034 c5034 = this.f9489;
        c5034.m8490();
        c5034.mo2406().mo6517();
        c5034.mo2406().mo6517();
        if (this.f9488) {
            c5034.mo2404().f12023.m9432("Unregistering connectivity change receiver");
            this.f9488 = false;
            this.f9487 = false;
            try {
                c5034.f16665.f17739.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                c5034.mo2404().f12020.m9430(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }
}
