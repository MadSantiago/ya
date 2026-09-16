package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦّؒؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3088 {

    /* JADX INFO: renamed from: ۥُ */
    public CharSequence f10355;

    /* JADX INFO: renamed from: ۥّ */
    public CharSequence f10356;

    /* JADX INFO: renamed from: ۥۜ */
    public int f10358;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f10359;

    /* JADX INFO: renamed from: ۦؚ */
    public Bundle f10361;

    /* JADX INFO: renamed from: ۦٌ */
    public String f10362;

    /* JADX INFO: renamed from: ۦِ */
    public C3369 f10363;

    /* JADX INFO: renamed from: ۦۙ */
    public PendingIntent f10366;

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean f10367;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f10368;

    /* JADX INFO: renamed from: ۦۨ */
    public final Notification f10369;

    /* JADX INFO: renamed from: ۥۗ */
    public final ArrayList f10357 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList f10354 = new ArrayList();

    /* JADX INFO: renamed from: ۦؑ */
    public final ArrayList f10360 = new ArrayList();

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean f10364 = true;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f10365 = false;

    public C3088(Context context, String str) {
        Notification notification = new Notification();
        this.f10369 = notification;
        this.f10359 = context;
        this.f10362 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f10358 = 0;
        this.f10368 = new ArrayList();
        this.f10367 = true;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static CharSequence m5676(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5677(C3369 c3369) {
        if (this.f10363 != c3369) {
            this.f10363 = c3369;
            if (((C3088) c3369.f11255) != this) {
                c3369.f11255 = this;
                m5677(c3369);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Notification m5678() {
        Bundle bundle;
        C2808 c2808 = new C2808(this);
        Notification.Builder builder = (Notification.Builder) c2808.f9378;
        C3088 c3088 = (C3088) c2808.f9376;
        C3369 c3369 = c3088.f10363;
        if (c3369 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) c3369.f11254);
        }
        Notification notificationBuild = builder.build();
        if (c3369 != null) {
            c3088.f10363.getClass();
        }
        if (c3369 != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }
}
