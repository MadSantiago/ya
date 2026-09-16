package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؙۗؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4970 {

    /* JADX INFO: renamed from: ۥۣ */
    public final HashMap f16445;

    public C4970(Map map) {
        HashMap map2 = new HashMap();
        this.f16445 = map2;
        map2.putAll(map);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4970) {
            return m8353().equalsIgnoreCase(((C4970) obj).m8353());
        }
        return false;
    }

    public final int hashCode() {
        return m8353().hashCode();
    }

    public final String toString() {
        return m8353();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m8351() {
        try {
            String str = (String) this.f16445.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Bundle m8352() {
        HashMap map = this.f16445;
        if ("1".equals(map.get("gdprApplies")) && "1".equals(map.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (map.get("Version") == null) {
                if (!"1".equals(map.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int iM8351 = m8351();
                if (iM8351 < 0) {
                    return Bundle.EMPTY;
                }
                String str2 = (String) map.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle = new Bundle();
                if (str2.length() > 0) {
                    bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str2.length() > 3) {
                    bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str2.length() > 6 && iM8351 >= 4) {
                    if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                        str = "granted";
                    }
                    bundle.putString("ad_user_data", str);
                }
                return bundle;
            }
            if (m8351() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("ad_storage", true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString("ad_personalization", (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (m8351() >= 4) {
                    if (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString("ad_user_data", str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m8353() {
        StringBuilder sb = new StringBuilder();
        C4645 c4645 = AbstractC4405.f14503;
        int i = c4645.f15322;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) c4645.get(i2);
            HashMap map = this.f16445;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }
}
