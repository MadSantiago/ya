package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦؒۧ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3146 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5086 f10617;

    static {
        C0639 c0639 = new C0639();
        C5774 c5774 = C5774.f19029;
        c0639.m1457(AbstractC3146.class, c5774);
        c0639.m1457(C0905.class, c5774);
        f10617 = new C5086(26, c0639);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0905 m5828(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, 256);
        }
        return new C0905(string, string2, string3, string4, j);
    }
}
