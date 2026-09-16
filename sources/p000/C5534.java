package p000;

import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦٖۢؔ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5534 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f18260;

    /* JADX INFO: renamed from: ۥُ */
    public final Object f18261;

    /* JADX INFO: renamed from: ۥّ */
    public final Object f18262;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f18263;

    /* JADX INFO: renamed from: ۥۜ */
    public final Object f18264;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f18265;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f18266;

    /* JADX INFO: renamed from: ۦۙ */
    public final Serializable f18267;

    public C5534(Context context, C4408 c4408, C4369 c4369, C3121 c3121, C5086 c5086, C0445 c0445, C1377 c1377) {
        AtomicReference atomicReference = new AtomicReference();
        this.f18267 = atomicReference;
        this.f18264 = new AtomicReference(new C2332());
        this.f18265 = context;
        this.f18263 = c4408;
        this.f18260 = c3121;
        this.f18266 = c5086;
        this.f18261 = c0445;
        this.f18262 = c1377;
        atomicReference.set(C3223.m5944(c4369));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m9208(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C5040 m9209() {
        return (C5040) ((AtomicReference) this.f18267).get();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C5040 m9210(int i) {
        C5040 c5040 = null;
        try {
            if (!AbstractC3761.m6625(2, i)) {
                JSONObject jSONObjectM8687 = ((C5086) this.f18266).m8687();
                if (jSONObjectM8687 != null) {
                    C5040 c5040M5744 = ((C3121) this.f18260).m5744(jSONObjectM8687);
                    m9208(jSONObjectM8687, "Loaded cached settings: ");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC3761.m6625(3, i) || c5040M5744.f16720 >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return c5040M5744;
                        } catch (Exception e) {
                            c5040 = c5040M5744;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return c5040;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public C5534(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, C5002 c5002) {
        this.f18265 = str;
        this.f18263 = str2;
        this.f18267 = arrayList;
        this.f18260 = str3;
        this.f18266 = str4;
        this.f18261 = str5;
        this.f18262 = str6;
        this.f18264 = c5002;
    }
}
