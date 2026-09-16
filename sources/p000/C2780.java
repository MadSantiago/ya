package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥۦؑۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2780 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f9263;

    /* JADX INFO: renamed from: ۥُ */
    public final String f9264;

    /* JADX INFO: renamed from: ۥّ */
    public final String f9265;

    /* JADX INFO: renamed from: ۥۗ */
    public final String f9266;

    /* JADX INFO: renamed from: ۥۜ */
    public final String f9267;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f9268;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f9269;

    /* JADX INFO: renamed from: ۦۙ */
    public final String f9270;

    public C2780(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        int i = AbstractC3660.f12253;
        AbstractC0487.m1082("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f9266 = str;
        this.f9268 = str2;
        this.f9263 = str3;
        this.f9269 = str4;
        this.f9264 = str5;
        this.f9265 = str6;
        this.f9270 = str7;
        this.f9267 = str8;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C2780 m5257(Context context) {
        C2346 c2346 = new C2346(context);
        String strM4418 = c2346.m4418("google_app_id");
        if (TextUtils.isEmpty(strM4418)) {
            return null;
        }
        return new C2780(strM4418, c2346.m4418("google_api_key"), c2346.m4418("firebase_database_url"), c2346.m4418("ga_trackingId"), c2346.m4418("gcm_defaultSenderId"), c2346.m4418("google_storage_bucket"), c2346.m4418("recaptcha_site_key"), c2346.m4418("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2780)) {
            return false;
        }
        C2780 c2780 = (C2780) obj;
        return AbstractC2164.m4207(this.f9266, c2780.f9266) && AbstractC2164.m4207(this.f9268, c2780.f9268) && AbstractC2164.m4207(this.f9263, c2780.f9263) && AbstractC2164.m4207(this.f9269, c2780.f9269) && AbstractC2164.m4207(this.f9264, c2780.f9264) && AbstractC2164.m4207(this.f9265, c2780.f9265) && AbstractC2164.m4207(this.f9270, c2780.f9270) && AbstractC2164.m4207(this.f9267, c2780.f9267);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9266, this.f9268, this.f9263, this.f9269, this.f9264, this.f9265, this.f9270, this.f9267});
    }

    public final String toString() {
        C3369 c3369 = new C3369(this);
        c3369.m6135(this.f9266, "applicationId");
        c3369.m6135(this.f9268, "apiKey");
        c3369.m6135(this.f9263, "databaseUrl");
        c3369.m6135(this.f9264, "gcmSenderId");
        c3369.m6135(this.f9265, "storageBucket");
        c3369.m6135(this.f9270, "recaptchaSiteKey");
        c3369.m6135(this.f9267, "projectId");
        return c3369.toString();
    }
}
