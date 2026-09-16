package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.UUID;
import p000.AbstractC1434;
import p000.AbstractC2774;
import p000.C1225;
import p000.C1984;
import p000.C3600;
import p000.C4170;
import p000.C4992;
import p000.C5021;
import p000.C5460;
import p000.EnumC1924;
import p000.ExecutorC2205;
import p000.InterfaceC4507;
import p000.RunnableC4985;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements InterfaceC4507 {

    /* JADX INFO: renamed from: ۥَ */
    public static final String f273 = C1984.m3875("SystemFgService");

    /* JADX INFO: renamed from: ۥْ */
    public C5021 f274;

    /* JADX INFO: renamed from: ۥٓ */
    public NotificationManager f275;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f276;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5460 f277 = new C5460(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f277.m9127(EnumC1924.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        m109();
        m111();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m112();
        this.f274.m8435();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f277.m9127(EnumC1924.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f276;
        boolean z2 = false;
        String str = f273;
        if (z) {
            C1984.m3874().m3883(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f274.m8435();
            m111();
            this.f276 = false;
        }
        if (intent == null) {
            return 3;
        }
        C5021 c5021 = this.f274;
        c5021.getClass();
        String str2 = C5021.f16609;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C1984.m3874().m3883(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((ExecutorC2205) c5021.f16617.f5059).execute(new RunnableC4985(14, c5021, stringExtra, z2));
            c5021.m8434(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c5021.m8434(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            C1984.m3874().m3883(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = c5021.f16614;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f276 = true;
            C1984.m3874().m3878(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        C1984.m3874().m3883(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        C3600 c3600 = c5021.f16618;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        c3600.getClass();
        AbstractC2774.m5184((C4992) c3600.f11989.f9392, "CancelWorkById", (ExecutorC2205) c3600.f11992.f5059, new C1225(6, c3600, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f274.m8436(i, 2048);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m109() {
        this.f277.m9127(EnumC1924.ON_CREATE);
        super.onCreate();
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        return (C4170) this.f277.f18001;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m111() {
        this.f275 = (NotificationManager) getApplicationContext().getSystemService("notification");
        C5021 c5021 = new C5021(getApplicationContext());
        this.f274 = c5021;
        if (c5021.f16614 != null) {
            C1984.m3874().m3884(C5021.f16609, "A callback already exists.");
        } else {
            c5021.f16614 = this;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m112() {
        EnumC1924 enumC1924 = EnumC1924.ON_STOP;
        C5460 c5460 = this.f277;
        c5460.m9127(enumC1924);
        c5460.m9127(EnumC1924.ON_DESTROY);
        super.onDestroy();
    }

    public final void onTimeout(int i, int i2) {
        this.f274.m8436(i, i2);
    }
}
