package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥًؗؑ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0578 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f2066;

    /* JADX INFO: renamed from: ۥُ */
    public final C1377 f2067;

    /* JADX INFO: renamed from: ۥّ */
    public C3238 f2068;

    /* JADX INFO: renamed from: ۥۗ */
    public final Context f2069;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0445 f2070;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC2361 f2071;

    /* JADX INFO: renamed from: ۦۙ */
    public static final Pattern f2065 = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: ۥۜ */
    public static final String f2064 = Pattern.quote("/");

    public C0578(Context context, String str, InterfaceC2361 interfaceC2361, C1377 c1377) {
        if (context == null) {
            C1078.m2272("appContext must not be null");
            throw null;
        }
        if (str == null) {
            C1078.m2272("appIdentifier must not be null");
            throw null;
        }
        this.f2069 = context;
        this.f2066 = str;
        this.f2071 = interfaceC2361;
        this.f2067 = c1377;
        this.f2070 = new C0445();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final synchronized C3238 m1284() {
        String str;
        C3238 c3238 = this.f2068;
        if (c3238 != null && (c3238.f10876 != null || !this.f2067.m2929())) {
            return this.f2068;
        }
        C1397 c1397 = C1397.f4781;
        c1397.m2966("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f2069.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c1397.m2966("Cached Firebase Installation ID: " + string);
        if (this.f2067.m2929()) {
            C2721 c2721M1285 = m1285(false);
            c1397.m2966("Fetched Firebase Installation ID: " + c2721M1285.f9015);
            if (c2721M1285.f9015 == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c2721M1285 = new C2721(str, null);
            }
            if (Objects.equals(c2721M1285.f9015, string)) {
                this.f2068 = new C3238(sharedPreferences.getString("crashlytics.installation.id", null), c2721M1285.f9015, c2721M1285.f9014);
            } else {
                this.f2068 = new C3238(m1286(sharedPreferences, c2721M1285.f9015), c2721M1285.f9015, c2721M1285.f9014);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f2068 = new C3238(m1286(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f2068 = new C3238(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        c1397.m2966("Install IDs: " + this.f2068);
        return this.f2068;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C2721 m1285(boolean z) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        InterfaceC2361 interfaceC2361 = this.f2071;
        if (z) {
            try {
                str = ((C4330) AbstractC5378.m9038(((C2588) interfaceC2361).m4883(), 10000L)).f14303;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) AbstractC5378.m9038(((C2588) interfaceC2361).m4882(), 10000L);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new C2721(str2, str);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized String m1286(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f2065.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m1287() {
        String str;
        C0445 c0445 = this.f2070;
        Context context = this.f2069;
        synchronized (c0445) {
            try {
                String str2 = c0445.f1632;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    c0445.f1632 = str2;
                }
                str = "".equals(str2) ? null : c0445.f1632;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
