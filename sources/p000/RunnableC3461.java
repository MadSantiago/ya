package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًؗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3461 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ BinderC5179 f11478;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5855 f11479;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11480;

    public /* synthetic */ RunnableC3461(BinderC5179 binderC5179, C5855 c5855, int i) {
        this.f11480 = i;
        this.f11479 = c5855;
        this.f11478 = binderC5179;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f11480;
        C5855 c5855 = this.f11479;
        BinderC5179 binderC5179 = this.f11478;
        switch (i) {
            case 0:
                C5034 c5034 = binderC5179.f17131;
                c5034.m8494();
                c5034.m8544(c5855);
                break;
            case 1:
                C5034 c5035 = binderC5179.f17131;
                c5035.m8494();
                c5035.mo2406().mo6517();
                c5035.m8490();
                AbstractC0487.m1047(c5855);
                String str = c5855.f19339;
                AbstractC0487.m1090(str);
                int i2 = 0;
                if (c5035.m8519().m1162(null, AbstractC4936.f16296)) {
                    c5035.mo2403().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM1153 = c5035.m8519().m1153(null, AbstractC4936.f16335);
                    c5035.m8519();
                    long jLongValue = jCurrentTimeMillis - ((Long) AbstractC4936.f16271.m4592(null)).longValue();
                    while (i2 < iM1153 && c5035.m8514(jLongValue, null)) {
                        i2++;
                    }
                } else {
                    c5035.m8519();
                    long jIntValue = ((Integer) AbstractC4936.f16316.m4592(null)).intValue();
                    while (i2 < jIntValue && c5035.m8514(0L, str)) {
                        i2++;
                    }
                }
                if (c5035.m8519().m1162(null, AbstractC4936.f16338)) {
                    c5035.mo2406().mo6517();
                    c5035.m8520();
                }
                C5111 c5111 = c5035.f16690;
                int iM3996 = AbstractC2049.m3996(c5855.f19326);
                c5111.mo6517();
                if (iM3996 == 2 && !C5111.m8738(str)) {
                    C3040 c3040 = c5111.f19371.f16698;
                    C5034.m8484(c3040);
                    C3256 c3256M5629 = c3040.m5629(str);
                    if (c3256M5629 != null && c3256M5629.m5995() && !c3256M5629.m5998().m7326().isEmpty()) {
                        c5035.mo2404().f12023.m9430(str, "[sgtm] Going background, trigger client side upload. appId");
                        c5035.mo2403().getClass();
                        c5035.m8499(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5034 c5036 = binderC5179.f17131;
                c5036.m8494();
                c5036.mo2406().mo6517();
                c5036.m8490();
                AbstractC0487.m1090(c5855.f19339);
                c5036.m8497(c5855);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5034 c5037 = binderC5179.f17131;
                c5037.m8494();
                if (c5037.f16664 != null) {
                    ArrayList arrayList = new ArrayList();
                    c5037.f16695 = arrayList;
                    arrayList.addAll(c5037.f16664);
                }
                C1159 c1159 = c5037.f16670;
                C5034.m8484(c1159);
                C5371 c5371 = (C5371) c1159.f18660;
                String str2 = c5855.f19339;
                AbstractC0487.m1047(str2);
                AbstractC0487.m1090(str2);
                c1159.mo6517();
                c1159.m4637();
                try {
                    SQLiteDatabase sQLiteDatabaseM2463 = c1159.m2463();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM2463.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("events", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM2463.delete("upload_queue", "app_id=?", strArr);
                    if (c5371.f17715.m1162(null, AbstractC4936.f19570)) {
                        iDelete += sQLiteDatabaseM2463.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM2463.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        C3610 c3610 = c5371.f17717;
                        C5371.m9020(c3610);
                        c3610.f12023.m9434(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12020.m9434(C3610.m6440(str2), e, "Error resetting analytics data. appId, error");
                }
                if (c5855.f19335) {
                    c5037.m8544(c5855);
                }
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C5034 c5038 = binderC5179.f17131;
                c5038.m8494();
                c5038.mo2406().mo6517();
                c5038.m8490();
                AbstractC0487.m1090(c5855.f19339);
                c5038.m8518(c5855);
                c5038.m8495(c5855);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5034 c5039 = binderC5179.f17131;
                c5039.m8494();
                c5039.m8495(c5855);
                break;
            default:
                C5034 c50310 = binderC5179.f17131;
                c50310.m8494();
                c50310.m8518(c5855);
                break;
        }
    }
}
