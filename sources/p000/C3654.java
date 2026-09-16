package p000;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: ۦًؒۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3654 {

    /* JADX INFO: renamed from: ۦؚ */
    public static final String f12226 = C1984.m3875("Processor");

    /* JADX INFO: renamed from: ۥؗ */
    public final C2813 f12227;

    /* JADX INFO: renamed from: ۥُ */
    public final WorkDatabase f12228;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f12230;

    /* JADX INFO: renamed from: ۦؑ */
    public final C1489 f12233;

    /* JADX INFO: renamed from: ۦۙ */
    public final HashMap f12237 = new HashMap();

    /* JADX INFO: renamed from: ۥّ */
    public final HashMap f12229 = new HashMap();

    /* JADX INFO: renamed from: ۦٛ */
    public final HashSet f12235 = new HashSet();

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f12234 = new ArrayList();

    /* JADX INFO: renamed from: ۥۣ */
    public PowerManager.WakeLock f12232 = null;

    /* JADX INFO: renamed from: ۦۗ */
    public final Object f12236 = new Object();

    /* JADX INFO: renamed from: ۥۜ */
    public final HashMap f12231 = new HashMap();

    public C3654(Context context, C2813 c2813, C1489 c1489, WorkDatabase workDatabase) {
        this.f12230 = context;
        this.f12227 = c2813;
        this.f12233 = c1489;
        this.f12228 = workDatabase;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m6530(String str, C5789 c5789, int i) {
        String str2 = f12226;
        if (c5789 == null) {
            C1984.m3874().m3878(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c5789.f19077.m858(new C5771(i));
        C1984.m3874().m3878(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C5789 m6531(String str) {
        C5789 c5789 = (C5789) this.f12229.get(str);
        return c5789 == null ? (C5789) this.f12237.get(str) : c5789;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C5789 m6532(String str) {
        C5789 c5789 = (C5789) this.f12229.remove(str);
        boolean z = c5789 != null;
        if (!z) {
            c5789 = (C5789) this.f12237.remove(str);
        }
        this.f12231.remove(str);
        if (z) {
            synchronized (this.f12236) {
                try {
                    if (this.f12229.isEmpty()) {
                        Context context = this.f12230;
                        String str2 = C5021.f16609;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f12230.startService(intent);
                        } catch (Throwable th) {
                            C1984.m3874().m3879(f12226, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f12232;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f12232 = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c5789;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m6533(InterfaceC0978 interfaceC0978) {
        synchronized (this.f12236) {
            this.f12234.add(interfaceC0978);
        }
    }
}
