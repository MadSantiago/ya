package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦٛؑۛۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4601 {

    /* JADX INFO: renamed from: ۥؗ */
    public static volatile C4601 f15181;

    /* JADX INFO: renamed from: ۥۗ */
    public static final Object f15182 = new Object();

    /* JADX INFO: renamed from: ۥۣ */
    public final ConcurrentHashMap f15183;

    public C4601(int i) {
        switch (i) {
            case 1:
                this.f15183 = new ConcurrentHashMap();
                break;
            default:
                this.f15183 = new ConcurrentHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C4601 m8000() {
        if (f15181 == null) {
            synchronized (f15182) {
                try {
                    if (f15181 == null) {
                        f15181 = new C4601(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4601 c4601 = f15181;
        AbstractC0487.m1047(c4601);
        return c4601;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public boolean m8001(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C3866.m6899(context).f972.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ServiceConnectionC4760) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f15183;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m8002(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ServiceConnectionC4760)) {
            ConcurrentHashMap concurrentHashMap = this.f15183;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }
}
