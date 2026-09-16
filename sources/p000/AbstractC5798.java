package p000;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: ۦۦؘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5798 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final String f19107 = C1984.m3875("NetworkStateTracker");

    /* JADX INFO: renamed from: ۥۗ */
    public static final C5862 m9607(NetworkCapabilities networkCapabilities, boolean z) {
        return new C5862(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18), z);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[Catch: SecurityException -> 0x0029, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x0029, blocks: (B:12:0x0018, B:14:0x0022), top: B:40:0x0018, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final C5862 m9608(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        SecurityException securityException;
        boolean zHasCapability;
        boolean z3;
        NetworkCapabilities networkCapabilities;
        String str = f19107;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z4 = true;
            if (activeNetworkInfo == null) {
                z4 = false;
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    zHasCapability = networkCapabilities.hasCapability(16);
                } else {
                    zHasCapability = false;
                }
                boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                z2 = z;
                return new C5862(z4, zHasCapability, zIsActiveNetworkMetered, z3, z2);
            }
            try {
                if (!activeNetworkInfo.isConnected()) {
                    z4 = false;
                }
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    if (networkCapabilities != null) {
                        zHasCapability = networkCapabilities.hasCapability(16);
                    } else {
                        zHasCapability = false;
                    }
                } catch (SecurityException e) {
                    C1984.m3874().m3879(str, "Unable to validate active network", e);
                }
                boolean zIsActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                z2 = z;
                try {
                    return new C5862(z4, zHasCapability, zIsActiveNetworkMetered2, z3, z2);
                } catch (SecurityException e2) {
                    e = e2;
                    securityException = e;
                    C1984.m3874().m3879(str, "Unable to get active network state", securityException);
                    return new C5862(false, false, false, true, z2);
                }
            } catch (SecurityException e3) {
                securityException = e3;
                z2 = z;
            }
        } catch (SecurityException e4) {
            e = e4;
            z2 = z;
        }
        C1984.m3874().m3879(str, "Unable to get active network state", securityException);
        return new C5862(false, false, false, true, z2);
    }
}
