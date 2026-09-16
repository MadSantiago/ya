package p000;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦًۘؔۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5021 implements InterfaceC3116, InterfaceC0978 {

    /* JADX INFO: renamed from: ۦٕ */
    public static final String f16609 = C1984.m3875("SystemFgDispatcher");

    /* JADX INFO: renamed from: ۥَ */
    public final LinkedHashMap f16610;

    /* JADX INFO: renamed from: ۥْ */
    public final Object f16611 = new Object();

    /* JADX INFO: renamed from: ۥٓ */
    public C1860 f16612;

    /* JADX INFO: renamed from: ۥٖ */
    public final HashMap f16613;

    /* JADX INFO: renamed from: ۥۖ */
    public SystemForegroundService f16614;

    /* JADX INFO: renamed from: ۦٗ */
    public final HashMap f16615;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2391 f16616;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1489 f16617;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3600 f16618;

    public C5021(Context context) {
        C3600 c3600M6413 = C3600.m6413(context);
        this.f16618 = c3600M6413;
        this.f16617 = c3600M6413.f11992;
        this.f16612 = null;
        this.f16610 = new LinkedHashMap();
        this.f16615 = new HashMap();
        this.f16613 = new HashMap();
        this.f16616 = new C2391(c3600M6413.f11993);
        c3600M6413.f11988.m6533(this);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Intent m8433(Context context, C1860 c1860, C4716 c4716) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c1860.f6202);
        intent.putExtra("KEY_GENERATION", c1860.f6201);
        intent.putExtra("KEY_NOTIFICATION_ID", c4716.f15548);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4716.f15547);
        intent.putExtra("KEY_NOTIFICATION", c4716.f15546);
        return intent;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8434(Intent intent) {
        if (this.f16614 == null) {
            C1078.m2276("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C1860 c1860 = new C1860(intent.getIntExtra("KEY_GENERATION", 0), stringExtra);
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C1984.m3874().m3878(f16609, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            C1078.m2272("Notification passed in the intent was null.");
            return;
        }
        C4716 c4716 = new C4716(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f16610;
        linkedHashMap.put(c1860, c4716);
        C4716 c4717 = (C4716) linkedHashMap.get(this.f16612);
        if (c4717 == null) {
            this.f16612 = c1860;
        } else {
            this.f16614.f275.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((C4716) ((Map.Entry) it.next()).getValue()).f15547;
                }
                c4716 = new C4716(c4717.f15548, c4717.f15546, i);
            } else {
                c4716 = c4717;
            }
        }
        SystemForegroundService systemForegroundService = this.f16614;
        int i2 = c4716.f15548;
        int i3 = c4716.f15547;
        Notification notification2 = c4716.f15546;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            AbstractC5183.m8798(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            AbstractC5183.m8797(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m8435() {
        this.f16614 = null;
        synchronized (this.f16611) {
            try {
                Iterator it = this.f16615.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC3196) it.next()).mo871(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3654 c3654 = this.f16618.f11988;
        synchronized (c3654.f12236) {
            c3654.f12234.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8436(int i, int i2) {
        C1984.m3874().m3883(f16609, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.f16610.entrySet()) {
            if (((C4716) entry.getValue()).f15547 == i2) {
                C1860 c1860 = (C1860) entry.getKey();
                C3600 c3600 = this.f16618;
                ((ExecutorC2205) c3600.f11992.f5059).execute(new RunnableC1589(c3600.f11988, new C2666(c1860), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f16614;
        if (systemForegroundService != null) {
            systemForegroundService.f276 = true;
            C1984.m3874().m3878(SystemForegroundService.f273, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }

    @Override // p000.InterfaceC3116
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo5696(C4142 c4142, AbstractC3750 abstractC3750) {
        if (abstractC3750 instanceof C4495) {
            String str = c4142.f13787;
            C1984.m3874().m3878(f16609, "Constraints unmet for WorkSpec " + str);
            C1860 c1860M2155 = AbstractC0993.m2155(c4142);
            int i = ((C4495) abstractC3750).f14869;
            C3600 c3600 = this.f16618;
            ((ExecutorC2205) c3600.f11992.f5059).execute(new RunnableC1589(c3600.f11988, new C2666(c1860M2155), true, i));
        }
    }

    @Override // p000.InterfaceC0978
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo108(C1860 c1860, boolean z) {
        Map.Entry entry;
        synchronized (this.f16611) {
            try {
                InterfaceC3196 interfaceC3196 = ((C4142) this.f16613.remove(c1860)) != null ? (InterfaceC3196) this.f16615.remove(c1860) : null;
                if (interfaceC3196 != null) {
                    interfaceC3196.mo871(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C4716 c4716 = (C4716) this.f16610.remove(c1860);
        if (c1860.equals(this.f16612)) {
            if (this.f16610.size() > 0) {
                Iterator it = this.f16610.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f16612 = (C1860) entry.getKey();
                if (this.f16614 != null) {
                    C4716 c4717 = (C4716) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f16614;
                    int i = c4717.f15548;
                    int i2 = c4717.f15547;
                    Notification notification = c4717.f15546;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        AbstractC5183.m8798(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        AbstractC5183.m8797(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.f16614.f275.cancel(c4717.f15548);
                }
            } else {
                this.f16612 = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f16614;
        if (c4716 == null || systemForegroundService2 == null) {
            return;
        }
        C1984.m3874().m3878(f16609, "Removing Notification (id: " + c4716.f15548 + ", workSpecId: " + c1860 + ", notificationType: " + c4716.f15547);
        systemForegroundService2.f275.cancel(c4716.f15548);
    }
}
