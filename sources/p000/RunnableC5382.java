package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٜ۠ؒۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5382 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f17792;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f17793;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f17794;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f17795;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17796;

    public /* synthetic */ RunnableC5382(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f17796 = i2;
        this.f17793 = obj;
        this.f17794 = obj2;
        this.f17795 = i;
        this.f17792 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17796;
        Object obj = this.f17792;
        int i2 = this.f17795;
        Object obj2 = this.f17794;
        Object obj3 = this.f17793;
        switch (i) {
            case 0:
                try {
                    ((IBinder[]) obj2)[0] = ((BinderC4778) obj3).m8163((Intent) obj, i2);
                    return;
                } catch (Exception e) {
                    AbstractC2774.m5205("IPC", e);
                    return;
                }
            default:
                C0474 c0474 = (C0474) obj3;
                C1360 c1360 = (C1360) obj2;
                Runnable runnable = (Runnable) obj;
                C1835 c1835 = (C1835) c0474.f1724;
                int i3 = 1;
                try {
                    try {
                        C1835 c1836 = (C1835) c0474.f1722;
                        Objects.requireNonNull(c1836);
                        c1835.m3609(new C5385(c1836, i3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) c0474.f1727).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            c1835.m3609(new C5240(c0474, c1360, i2));
                        } else {
                            c0474.m1023(c1360, i2);
                        }
                    } finally {
                        runnable.run();
                    }
                    break;
                } catch (C2833 unused) {
                    ((C2808) c0474.f1728).m5349(c1360, i2 + 1, false);
                    break;
                }
                return;
        }
    }
}
