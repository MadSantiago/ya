package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۥؕؖؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2744 {

    /* JADX INFO: renamed from: ۥۗ */
    public static Locale f9077;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C0796 f9078 = new C0796(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static String m5093(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return resources.getString(R.string.common_google_play_services_update_title);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m5094(context, "common_google_play_services_invalid_account_title");
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m5094(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m5094(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m5094(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public static String m5094(Context context, String str) {
        Resources resourcesForApplication;
        C0796 c0796 = f9078;
        synchronized (c0796) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(f9077)) {
                    c0796.clear();
                    f9077 = locale;
                }
                String str2 = (String) c0796.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = AbstractC2292.f7616;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f9078.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m5095(Context context, int i) {
        Resources resources = context.getResources();
        String strM5096 = m5096(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strM5096);
        }
        if (i == 2) {
            return AbstractC3933.m7068(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strM5096);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strM5096);
        }
        if (i == 5) {
            return m5097(context, "common_google_play_services_invalid_account_text", strM5096);
        }
        if (i == 7) {
            return m5097(context, "common_google_play_services_network_error_text", strM5096);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strM5096);
        }
        if (i == 20) {
            return m5097(context, "common_google_play_services_restricted_profile_text", strM5096);
        }
        switch (i) {
            case 16:
                return m5097(context, "common_google_play_services_api_unavailable_text", strM5096);
            case 17:
                return m5097(context, "common_google_play_services_sign_in_failed_text", strM5096);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strM5096);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strM5096);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m5096(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C3866.m6899(context).f972;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static String m5097(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM5094 = m5094(context, str);
        if (strM5094 == null) {
            strM5094 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM5094, str2);
    }
}
