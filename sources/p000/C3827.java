package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦَؑۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3827 {

    /* JADX INFO: renamed from: ۥۜ */
    public static C3827 f12684;

    /* JADX INFO: renamed from: ۦٛ */
    public static HandlerThread f12685;

    /* JADX INFO: renamed from: ۦۙ */
    public static final Object f12686 = new Object();

    /* JADX INFO: renamed from: ۥؗ */
    public volatile HandlerC0645 f12687;

    /* JADX INFO: renamed from: ۥُ */
    public final long f12688;

    /* JADX INFO: renamed from: ۥّ */
    public final long f12689;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f12690;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f12691 = new HashMap();

    /* JADX INFO: renamed from: ۦؑ */
    public final C4601 f12692;

    public C3827(Context context, Looper looper) {
        C3958 c3958 = new C3958(this);
        this.f12690 = context.getApplicationContext();
        HandlerC0645 handlerC0645 = new HandlerC0645(looper, c3958);
        Looper.getMainLooper();
        this.f12687 = handlerC0645;
        this.f12692 = C4601.m8000();
        this.f12688 = 5000L;
        this.f12689 = 300000L;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C3827 m6820(Context context) {
        C3827 c3827;
        synchronized (f12686) {
            try {
                c3827 = f12684;
                if (c3827 == null) {
                    c3827 = new C3827(context.getApplicationContext(), context.getMainLooper());
                    f12684 = c3827;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3827;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6821(String str, ServiceConnection serviceConnection, boolean z) {
        C5148 c5148 = new C5148(str, z);
        AbstractC0487.m1048(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f12691;
        synchronized (map) {
            try {
                ServiceConnectionC4760 serviceConnectionC4760 = (ServiceConnectionC4760) map.get(c5148);
                if (serviceConnectionC4760 == null) {
                    String string = c5148.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!serviceConnectionC4760.f15709.containsKey(serviceConnection)) {
                    String string2 = c5148.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC4760.f15709.remove(serviceConnection);
                if (serviceConnectionC4760.f15709.isEmpty()) {
                    this.f12687.sendMessageDelayed(this.f12687.obtainMessage(0, c5148), this.f12688);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2612 m6822(C5148 c5148, ServiceConnectionC1699 serviceConnectionC1699, String str, Executor executor) {
        C2612 c2612M8110;
        HashMap map = this.f12691;
        synchronized (map) {
            try {
                ServiceConnectionC4760 serviceConnectionC4760 = (ServiceConnectionC4760) map.get(c5148);
                if (executor == null) {
                    executor = null;
                }
                if (serviceConnectionC4760 == null) {
                    serviceConnectionC4760 = new ServiceConnectionC4760(this, c5148);
                    serviceConnectionC4760.f15709.put(serviceConnectionC1699, serviceConnectionC1699);
                    c2612M8110 = serviceConnectionC4760.m8110(str, executor);
                    map.put(c5148, serviceConnectionC4760);
                } else {
                    this.f12687.removeMessages(0, c5148);
                    if (serviceConnectionC4760.f15709.containsKey(serviceConnectionC1699)) {
                        String string = c5148.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC4760.f15709.put(serviceConnectionC1699, serviceConnectionC1699);
                    int i = serviceConnectionC4760.f15708;
                    if (i == 1) {
                        serviceConnectionC1699.onServiceConnected(serviceConnectionC4760.f15706, serviceConnectionC4760.f15705);
                    } else if (i == 2) {
                        c2612M8110 = serviceConnectionC4760.m8110(str, executor);
                    }
                    c2612M8110 = null;
                }
                if (serviceConnectionC4760.f15704) {
                    return C2612.f8709;
                }
                if (c2612M8110 == null) {
                    c2612M8110 = new C2612(-1, null, null);
                }
                return c2612M8110;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
