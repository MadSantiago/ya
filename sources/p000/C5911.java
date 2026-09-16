package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦٜۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5911 {

    /* JADX INFO: renamed from: ۥۗ */
    public final int f19497;

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f19498 = new HashMap();

    public C5911(int i) {
        this.f19497 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static String m9735(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final synchronized void m9736(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strM9735 = m9735(this.f19497, str);
                if (this.f19498.size() < 64 || this.f19498.containsKey(strM9735)) {
                    String str2 = (String) entry.getValue();
                    this.f19498.put(strM9735, str2 == null ? "" : m9735(this.f19497, str2));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized boolean m9737(String str) {
        boolean zEquals;
        String strM9735 = m9735(this.f19497, "com.crashlytics.version-control-info");
        if (this.f19498.size() >= 64 && !this.f19498.containsKey(strM9735)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String strM9736 = m9735(this.f19497, str);
        String str2 = (String) this.f19498.get(strM9735);
        if (str2 == null) {
            zEquals = strM9736 == null;
        } else {
            zEquals = str2.equals(strM9736);
        }
        if (zEquals) {
            return false;
        }
        this.f19498.put(strM9735, strM9736);
        return true;
    }
}
