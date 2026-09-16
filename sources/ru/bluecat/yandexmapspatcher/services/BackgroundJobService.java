package ru.bluecat.yandexmapspatcher.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import p000.AbstractC0912;
import p000.AbstractC1631;
import p000.AbstractC2765;
import p000.AbstractC4009;
import p000.C0649;
import p000.C2079;
import p000.C3088;
import p000.C4441;
import p000.ExecutorC4540;
import p000.InterfaceC0443;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BackgroundJobService extends Service {
    static {
        new C4441(new long[]{-248096549004338454L, -6837320158299218416L, 7749811098737543557L, 1597298244516091411L, -648072731216053988L}).toString();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        Bundle extras2;
        Object systemService = getSystemService(new C4441(new long[]{3902067353389126130L, 3062770352806615047L, -1111478785870310792L}).toString());
        new C4441(new long[]{2922073135537699618L, 9182433606302277434L, 8187377919471949020L, 368197580666540018L, 3494516254678919303L, 2233834510356030778L, 1555646966983082605L, 3012268923053721304L, 4007776011477432963L, 1172329839652878271L}).toString();
        NotificationManager notificationManager = (NotificationManager) systemService;
        InterfaceC0443 interfaceC0443 = null;
        if (notificationManager.getNotificationChannel(new C4441(new long[]{-3098460527458871965L, 6874537606598627679L, -3437196661178837322L, -3228031097316455099L, 1023631781035529298L}).toString()) == null) {
            App app = App.f407;
            NotificationChannel notificationChannel = new NotificationChannel(new C4441(new long[]{8240104640828367884L, 882146812338315364L, 1098164658979663376L, -6881210800889518309L, 6353169990593320472L}).toString(), AbstractC1631.m3410().getString(R.string.background_channel_name), 2);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setShowBadge(false);
            notificationChannel.setBypassDnd(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        C3088 c3088 = new C3088(this, new C4441(new long[]{-7813192253138716065L, 3045998956223589665L, -190129036928531068L, -1866592148007196938L, 6571733132351865960L}).toString());
        App app2 = App.f407;
        c3088.f10355 = C3088.m5676(AbstractC1631.m3410().getString(R.string.background_service_title));
        c3088.f10356 = C3088.m5676(AbstractC1631.m3410().getString(R.string.background_service_message));
        c3088.f10369.icon = R.drawable.ic_background_service;
        c3088.f10358 = -1;
        Notification notificationM5678 = c3088.m5678();
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(2, notificationM5678, 2048);
        } else {
            startForeground(2, notificationM5678);
        }
        String string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString(new C4441(new long[]{7091004550914015228L, 4722015387303641600L}).toString());
        long j = (intent == null || (extras = intent.getExtras()) == null) ? 0L : extras.getLong(new C4441(new long[]{-9101644535821582952L, -6368874890275053515L}).toString());
        if (string != null && j != 0) {
            C0649 c0649 = AbstractC0912.f3276;
            AbstractC2765.m5135(AbstractC4009.m7151(ExecutorC4540.f15006), null, 0, new C2079(j, string, interfaceC0443, 1), 3);
        }
        stopSelf();
        return 2;
    }
}
