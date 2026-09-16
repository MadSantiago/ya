package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥّؓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0353 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ۥُ */
    public static boolean f1286;

    /* JADX INFO: renamed from: ۥّ */
    public static boolean f1287;

    /* JADX INFO: renamed from: ۦؑ */
    public static NetworkCapabilities f1290;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0353 f1289 = new C0353();

    /* JADX INFO: renamed from: ۥۗ */
    public static final Object f1288 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public static final LinkedHashMap f1285 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۣ */
    public static void m774() {
        ArrayList<C3869> arrayList = new ArrayList();
        synchronized (f1288) {
            try {
                for (Map.Entry entry : f1285.entrySet()) {
                    InterfaceC4745 interfaceC4745 = (InterfaceC4745) entry.getKey();
                    NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                    C0353 c0353 = f1289;
                    NetworkCapabilities networkCapabilities = f1290;
                    c0353.getClass();
                    arrayList.add(new C3869(interfaceC4745, !f1287 && networkRequest.canBeSatisfiedBy(networkCapabilities) ? C1385.f4736 : new C4495(7)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (C3869 c3869 : arrayList) {
            ((InterfaceC4745) c3869.f12915).mo211((AbstractC3750) c3869.f12914);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController onBlockedStatusChanged callback");
        synchronized (f1288) {
            if (f1287 == z) {
                return;
            }
            f1287 = z;
            m774();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f1288) {
            f1290 = networkCapabilities;
        }
        m774();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController onLost callback");
        synchronized (f1288) {
            f1290 = null;
            Iterator it = f1285.keySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC4745) it.next()).mo211(new C4495(7));
            }
        }
    }
}
