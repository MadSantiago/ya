package p000;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۥؕؒۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0445 implements InterfaceC1170 {

    /* JADX INFO: renamed from: ۦۨ */
    public String f1632;

    /* JADX INFO: renamed from: ۥۗ */
    public static HashMap m964(C4408 c4408) {
        HashMap map = new HashMap();
        map.put("build_version", c4408.f14512);
        map.put("display_version", c4408.f14516);
        map.put("source", Integer.toString(c4408.f14515));
        String str = c4408.f14510;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m965(C2808 c2808, C4408 c4408) {
        String str = c4408.f14513;
        if (str != null) {
            c2808.m5344("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c2808.m5344("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c2808.m5344("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.0");
        c2808.m5344("Accept", "application/json");
        c2808.m5344("X-CRASHLYTICS-DEVICE-MODEL", c4408.f14511);
        String str2 = c4408.f14508;
        if (str2 != null) {
            c2808.m5344("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = c4408.f14514;
        if (str3 != null) {
            c2808.m5344("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = c4408.f14509.m1284().f10877;
        if (str4 != null) {
            c2808.m5344("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    @Override // p000.InterfaceC1170
    public void accept(Object obj, Object obj2) {
        int i = C1543.f5220;
        BinderC0222 binderC0222 = new BinderC0222((C2332) obj2);
        C3663 c3663 = (C3663) ((C5390) obj).m7333();
        String str = this.f1632;
        Parcel parcelM7504 = c3663.m7504();
        AbstractC5564.m9344(parcelM7504, binderC0222);
        parcelM7504.writeString(str);
        c3663.m7505(parcelM7504, 5);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public JSONObject m966(C1762 c1762) {
        String str = this.f1632;
        int i = c1762.f5868;
        C1397 c1397 = C1397.f4781;
        c1397.m2966("Settings response code was: " + i);
        if (i == 200 || i == 201 || i == 202 || i == 203) {
            String str2 = c1762.f5867;
            try {
                return new JSONObject(str2);
            } catch (Exception e) {
                c1397.m2968("Failed to parse settings JSON from ".concat(str), e);
                c1397.m2968("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i + ") from " + str;
        if (c1397.m2969(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }
}
