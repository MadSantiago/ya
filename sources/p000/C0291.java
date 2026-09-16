package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: renamed from: ۥؘؒ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0291 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ۥؗ */
    public static final /* synthetic */ int f1070 = 0;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f1071;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f1072;

    public C0291(C0079 c0079) {
        this.f1072 = 0;
        this.f1071 = c0079;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f1072) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C2808) this.f1071).m5343(network, true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.f1072) {
            case 1:
                if (network.equals(((C3239) this.f1071).f10881.getActiveNetwork())) {
                    C1984.m3874().m3878(AbstractC5798.f19107, "Network blocked status changed: " + z);
                    C3239 c3239 = (C3239) this.f1071;
                    Object objMo757 = c3239.f13233;
                    if (objMo757 == null) {
                        objMo757 = c3239.mo757();
                    }
                    C5862 c5862 = (C5862) objMo757;
                    C3239 c32310 = (C3239) this.f1071;
                    synchronized (c32310.f10878) {
                        if (c32310.f10880 == z) {
                            return;
                        }
                        c32310.f10880 = z;
                        ((C3239) this.f1071).m7117(new C5862(c5862.f19358, c5862.f19357, c5862.f19355, c5862.f19359, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f1072) {
            case 0:
                C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((C0079) this.f1071).mo211(C1385.f4736);
                break;
            case 1:
                C1984.m3874().m3878(AbstractC5798.f19107, "Network capabilities changed: " + networkCapabilities);
                C3239 c3239 = (C3239) this.f1071;
                c3239.m7117(Build.VERSION.SDK_INT >= 28 ? AbstractC5798.m9607(networkCapabilities, c3239.f10880) : AbstractC5798.m9608(c3239.f10881, c3239.f10880));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.f1072;
        Object obj = this.f1071;
        switch (i) {
            case 0:
                C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController onLost callback");
                ((C0079) obj).mo211(new C4495(7));
                break;
            case 1:
                C1984.m3874().m3878(AbstractC5798.f19107, "Network connection lost");
                ((C3239) obj).m7117(new C5862(false, false, false, false, false));
                break;
            default:
                ((C2808) obj).m5343(network, false);
                break;
        }
    }

    public /* synthetic */ C0291(int i, Object obj) {
        this.f1072 = i;
        this.f1071 = obj;
    }
}
