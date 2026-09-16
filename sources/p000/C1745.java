package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ۥٟٚؗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1745 implements InterfaceC1539, InterfaceC2515, InterfaceC3077 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5807;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ C1745 f5806 = new C1745(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ C1745 f5792 = new C1745(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C1745 f5793 = new C1745(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C1745 f5791 = new C1745(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C1745 f5795 = new C1745(4);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C1745 f5803 = new C1745(5);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C1745 f5805 = new C1745(6);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C1745 f5797 = new C1745(7);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C1745 f5802 = new C1745(8);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C1745 f5796 = new C1745(9);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C1745 f5789 = new C1745(10);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C1745 f5788 = new C1745(11);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C1745 f5799 = new C1745(12);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C1745 f5790 = new C1745(13);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C1745 f5804 = new C1745(14);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C1745 f5794 = new C1745(15);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C1745 f5798 = new C1745(16);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C1745 f5801 = new C1745(17);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C1745 f5800 = new C1745(20);

    public /* synthetic */ C1745(int i) {
        this.f5807 = i;
    }

    @Override // p000.InterfaceC3077
    public Object get() {
        Object obj = C0996.f3556;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ThreadFactoryC5169.f17110);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof ScheduledExecutorServiceC3499 ? (ScheduledExecutorServiceC3499) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new ScheduledExecutorServiceC3499(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    @Override // p000.InterfaceC2515
    /* JADX INFO: renamed from: ۥۗ */
    public C4998 mo3546(Context context, String str, InterfaceC4409 interfaceC4409) {
        int iMo3876;
        int i = -1;
        switch (this.f5807) {
            case 18:
                C4998 c4998 = new C4998();
                int iMo3880 = interfaceC4409.mo3880(context, str);
                c4998.f16540 = iMo3880;
                if (iMo3880 != 0) {
                    c4998.f16538 = -1;
                } else {
                    int iMo3877 = interfaceC4409.mo3876(context, str, true);
                    c4998.f16539 = iMo3877;
                    if (iMo3877 != 0) {
                        c4998.f16538 = 1;
                    }
                }
                return c4998;
            default:
                C4998 c4999 = new C4998();
                int iMo3881 = interfaceC4409.mo3880(context, str);
                c4999.f16540 = iMo3881;
                int i2 = 0;
                if (iMo3881 != 0) {
                    iMo3876 = interfaceC4409.mo3876(context, str, false);
                    c4999.f16539 = iMo3876;
                } else {
                    iMo3876 = interfaceC4409.mo3876(context, str, true);
                    c4999.f16539 = iMo3876;
                }
                int i3 = c4999.f16540;
                if (i3 == 0) {
                    if (iMo3876 == 0) {
                        i = 0;
                    }
                    c4999.f16538 = i;
                    return c4999;
                }
                i2 = i3;
                if (i2 < iMo3876) {
                    i = 1;
                }
                c4999.f16538 = i;
                return c4999;
        }
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f5807) {
            case 0:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(604800000L, "measurement.sdk.attribution.cache.ttl", 61).get();
            case 1:
                List list2 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(7L, "measurement.rb.attribution.client.min_ad_services_version", 26).get()).longValue());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(32, "measurement.rb.attribution.app_allowlist", "").get();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(16L, "measurement.rb.attribution.max_retry_delay_seconds", 54).get()).longValue());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(1000L, "measurement.rb.max_trigger_registrations_per_day", 24).get()).longValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(3000L, "measurement.rb.attribution.notify_app_delay_millis", 30).get()).longValue());
            case 8:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(65536L, "measurement.upload.max_bundle_size", 66).get()).longValue());
            case 9:
                List list10 = AbstractC4936.f16299;
                return (Boolean) C2876.f9597.get();
            case 10:
                List list11 = AbstractC4936.f16299;
                return (Boolean) C3045.f10239.get();
            case 11:
                List list12 = AbstractC4936.f16299;
                return (Boolean) C0919.f3295.get();
            case 12:
                List list13 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(1000L, "measurement.upload.max_events_per_bundle", 70).get()).longValue());
            case 13:
                List list14 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(1, "measurement.rb.attribution.client2", true).get();
            case 14:
                List list15 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 15:
                List list16 = AbstractC4936.f16299;
                return (Boolean) C1002.f3580.get();
            case 16:
                List list17 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(10000L, "measurement.ad_id_cache_time", 0).get();
            default:
                return new Boolean(((Boolean) C2169.f7161.get()).booleanValue());
        }
    }
}
