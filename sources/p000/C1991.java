package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: ۥٟۣؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1991 extends C0600 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f6569 = new Object();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1991 f6570 = new C1991();

    /* JADX INFO: renamed from: ۥُ */
    public static void m3894(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC2747) {
                C2790 c2790 = ((C0827) ((AbstractActivityC2747) activity).f9089.f14025).f2925;
                C3798 c3798 = new C3798();
                AbstractC0487.m1048(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c3798.f12612 = alertDialog;
                if (onCancelListener != null) {
                    c3798.f12613 = onCancelListener;
                }
                c3798.f6961 = false;
                c3798.f6966 = true;
                C2177 c2177 = new C2177(c2790);
                c2177.f7201 = true;
                c2177.m4231(0, c3798, str);
                c2177.m4230(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC2366 dialogFragmentC2366 = new DialogFragmentC2366();
        AbstractC0487.m1048(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC2366.f7835 = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC2366.f7834 = onCancelListener;
        }
        dialogFragmentC2366.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static AlertDialog m3895(Activity activity, int i, AbstractDialogInterfaceOnClickListenerC0521 abstractDialogInterfaceOnClickListenerC0521, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC2744.m5095(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC0521);
        }
        String strM5093 = AbstractC2744.m5093(activity, i);
        if (strM5093 != null) {
            builder.setTitle(strM5093);
        }
        Log.w("GoogleApiAvailability", AbstractC5078.m8670(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3896(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM3895 = m3895(googleApiActivity, i, new C2675(super.m1309(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogM3895 == null) {
            return;
        }
        m3894(googleApiActivity, alertDialogM3895, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3897(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", AbstractC5078.m8681(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        int i3 = 18;
        if (i == 18) {
            new HandlerC1910(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM5094 = i == 6 ? AbstractC2744.m5094(context, "common_google_play_services_resolution_required_title") : AbstractC2744.m5093(context, i);
        if (strM5094 == null) {
            strM5094 = context.getResources().getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_notification_ticker);
        }
        String strM5097 = (i == 6 || i == 19) ? AbstractC2744.m5097(context, "common_google_play_services_resolution_required_text", AbstractC2744.m5096(context)) : AbstractC2744.m5095(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC0487.m1047(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C3088 c3088 = new C3088(context, null);
        c3088.f10365 = true;
        c3088.f10369.flags |= 16;
        c3088.f10355 = C3088.m5676(strM5094);
        C3369 c3369 = new C3369(i3, false);
        c3369.f11254 = C3088.m5676(strM5097);
        c3088.m5677(c3369);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = AbstractC3933.f13132;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            AbstractC3933.f13132 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            c3088.f10369.icon = context.getApplicationInfo().icon;
            c3088.f10358 = 2;
            if (AbstractC3933.m7068(context)) {
                c3088.f10357.add(new C2668(resources.getString(ru.bluecat.yandexmapspatcher.R.string.common_open_on_phone), pendingIntent));
            } else {
                c3088.f10366 = pendingIntent;
            }
        } else {
            c3088.f10369.icon = R.drawable.stat_sys_warning;
            c3088.f10369.tickerText = C3088.m5676(resources.getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_notification_ticker));
            c3088.f10369.when = System.currentTimeMillis();
            c3088.f10366 = pendingIntent;
            c3088.f10356 = C3088.m5676(strM5097);
        }
        synchronized (f6569) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(ru.bluecat.yandexmapspatcher.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c3088.f10362 = "com.google.android.gms.availability";
        Notification notificationM5678 = c3088.m5678();
        if (i == 1 || i == 2 || i == 3) {
            AbstractC2292.f7618.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationM5678);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m3898(Activity activity, InterfaceC0568 interfaceC0568, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM3895 = m3895(activity, i, new C5511(super.m1309(i, activity, "d"), interfaceC0568), onCancelListener);
        if (alertDialogM3895 == null) {
            return;
        }
        m3894(activity, alertDialogM3895, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
