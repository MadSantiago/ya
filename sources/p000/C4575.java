package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦًٚؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4575 implements InterfaceC0891, InterfaceC5241, InterfaceC5375, InterfaceC4329, InterfaceC1539 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15105;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ C4575 f15104 = new C4575(9);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ C4575 f15088 = new C4575(10);

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C4575 f15089 = new C4575(11);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4575 f15087 = new C4575(12);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C4575 f15091 = new C4575(13);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C4575 f15101 = new C4575(14);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4575 f15103 = new C4575(15);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C4575 f15093 = new C4575(16);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C4575 f15100 = new C4575(17);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C4575 f15092 = new C4575(18);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C4575 f15085 = new C4575(19);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C4575 f15084 = new C4575(20);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C4575 f15096 = new C4575(21);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C4575 f15086 = new C4575(22);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C4575 f15102 = new C4575(23);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C4575 f15090 = new C4575(24);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C4575 f15094 = new C4575(25);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C4575 f15099 = new C4575(26);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C4575 f15097 = new C4575(27);

    /* JADX INFO: renamed from: ۥۦ */
    public static final /* synthetic */ C4575 f15095 = new C4575(28);

    /* JADX INFO: renamed from: ۦؗ */
    public static final /* synthetic */ C4575 f15098 = new C4575(29);

    public C4575(C5285 c5285) {
        this.f15105 = 1;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final InterfaceC5083 m7948(long j, Object obj) {
        InterfaceC5083 interfaceC5083 = (InterfaceC5083) AbstractC0667.m1478(j, obj);
        if (((AbstractC1864) interfaceC5083).f6207) {
            return interfaceC5083;
        }
        int size = interfaceC5083.size();
        InterfaceC5083 interfaceC5083Mo4971 = interfaceC5083.mo4971(size == 0 ? 10 : size + size);
        AbstractC0667.m1484(j, obj, interfaceC5083Mo4971);
        return interfaceC5083Mo4971;
    }

    @Override // p000.InterfaceC4329
    /* JADX INFO: renamed from: ۥؗ */
    public void mo7233(String str) {
        ArrayList arrayList = C2503.f8322;
        C2503.m4653(4, new C4006(AbstractC3801.f12618, "D", str, null, 51), false);
    }

    @Override // p000.InterfaceC4329
    /* JADX INFO: renamed from: ۥۗ */
    public void mo7234(String str, Throwable th) {
        ArrayList arrayList = C2503.f8322;
        C2503.m4658(12, String.valueOf(str), th);
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f15105) {
            case 9:
                return new Boolean(((Boolean) C0765.f2779.get()).booleanValue());
            case 10:
                return new Boolean(((Boolean) C2573.f8590.get()).booleanValue());
            case 11:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 12:
                List list2 = AbstractC4936.f16299;
                return (String) C3179.f10679.get();
            case 13:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(50000L, "measurement.upload.max_public_events_per_day", 72).get()).longValue());
            case 14:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(100000L, "measurement.store.max_stored_events_per_app", 20).get()).longValue());
            case 15:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(44, "measurement.sgtm.service_upload_apps_list", "").get();
            case 16:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(86400000L, "measurement.monitoring.sample_period_millis", 29).get();
            case 17:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(21600000L, "measurement.sgtm.batch.retry_max_wait", 43).get();
            case 18:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(5L, "measurement.sgtm.upload.batches_retrieval_limit", 46).get()).longValue());
            case 19:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(600000L, "measurement.sgtm.upload.min_delay_after_background", 48).get();
            case 20:
                List list10 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(43200000L, "measurement.upload.backoff_period", 63).get();
            case 21:
                List list11 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(10000L, "measurement.upload.realtime_upload_interval", 33).get();
            case 22:
                List list12 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(60000L, "measurement.alarm_manager.minimum_interval", 27).get();
            case 23:
                List list13 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(15000L, "measurement.upload.initial_upload_delay_time", 64).get();
            case 24:
                List list14 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(6L, "measurement.upload.retry_count", 76).get()).longValue());
            case 25:
                List list15 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(4L, "measurement.lifetimevalue.max_currency_tracked", 17).get()).longValue());
            case 26:
                List list16 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(1000L, "measurement.service_client.reconnect_millis", 38).get();
            case 27:
                List list17 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(7, "measurement.config.url_authority", "app-measurement.com").get();
            case 28:
                List list18 = AbstractC4936.f16299;
                C1549.f5236.get();
                return Integer.valueOf((int) ((Long) C1819.f6045.m8235(-2L, "measurement.test.int_flag", 3).get()).longValue());
            default:
                List list19 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(27L, "measurement.upload.max_item_scoped_custom_parameters", 23).get()).longValue());
        }
    }

    @Override // p000.InterfaceC5375
    /* JADX INFO: renamed from: ۦؑ */
    public long mo7674() {
        return System.currentTimeMillis();
    }

    @Override // p000.InterfaceC0891
    /* JADX INFO: renamed from: ۦۗ */
    public void mo1882(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public /* synthetic */ C4575(int i) {
        this.f15105 = i;
    }
}
