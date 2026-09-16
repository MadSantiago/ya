package p000;

import android.os.Looper;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.util.List;

/* JADX INFO: renamed from: ۦ٘ؗۥۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4452 implements InterfaceC5241, InterfaceC5346, InterfaceC1539 {

    /* JADX INFO: renamed from: ۥْ */
    public static C4452 f14674;

    /* JADX INFO: renamed from: ۦ۟ */
    public static C4452 f14692;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14693;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C4452 f14675 = new C4452(6);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4452 f14673 = new C4452(9);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C4452 f14677 = new C4452(10);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C4452 f14689 = new C4452(11);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4452 f14691 = new C4452(12);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C4452 f14679 = new C4452(13);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C4452 f14687 = new C4452(14);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C4452 f14678 = new C4452(15);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C4452 f14671 = new C4452(16);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C4452 f14669 = new C4452(17);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C4452 f14682 = new C4452(18);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C4452 f14672 = new C4452(19);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C4452 f14690 = new C4452(20);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C4452 f14676 = new C4452(21);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C4452 f14680 = new C4452(22);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C4452 f14685 = new C4452(23);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C4452 f14683 = new C4452(24);

    /* JADX INFO: renamed from: ۥۦ */
    public static final /* synthetic */ C4452 f14681 = new C4452(25);

    /* JADX INFO: renamed from: ۦؗ */
    public static final /* synthetic */ C4452 f14684 = new C4452(26);

    /* JADX INFO: renamed from: ۦُ */
    public static final /* synthetic */ C4452 f14686 = new C4452(27);

    /* JADX INFO: renamed from: ۦٖ */
    public static final /* synthetic */ C4452 f14688 = new C4452(28);

    /* JADX INFO: renamed from: ۥؔ */
    public static final /* synthetic */ C4452 f14670 = new C4452(29);

    public C4452(float f, float f2) {
        this.f14693 = 1;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3775 m7738(Object obj, Object obj2) {
        C3775 c3775M6679 = (C3775) obj;
        C3775 c3775 = (C3775) obj2;
        if (!c3775.isEmpty()) {
            if (!c3775M6679.f12548) {
                c3775M6679 = c3775M6679.m6679();
            }
            c3775M6679.m6680();
            if (!c3775.isEmpty()) {
                c3775M6679.putAll(c3775);
            }
        }
        return c3775M6679;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final boolean m7739() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f14693) {
            case 10:
                return new Boolean(((Boolean) C5152.f17065.get()).booleanValue());
            case 11:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time", 1).get();
            case 12:
                List list2 = AbstractC4936.f16299;
                return (String) C3179.f10680.get();
            case 13:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(1000L, "measurement.upload.max_error_events_per_day", 69).get()).longValue());
            case 14:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(10L, "measurement.upload.max_realtime_events_per_day", 74).get()).longValue());
            case 15:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 16:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(600000L, "measurement.sgtm.upload.retry_interval", 51).get();
            case 17:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(1800000L, "measurement.sgtm.batch.retry_interval", 41).get();
            case 18:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(5000L, "measurement.sgtm.upload.max_queued_batches", 47).get()).longValue());
            case 19:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(1000L, "measurement.sgtm.upload.min_delay_after_broadcast", 49).get();
            case 20:
                List list10 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(86400000L, "measurement.config.cache_time", 5).get();
            case 21:
                List list11 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(3600000L, "measurement.upload.interval", 65).get();
            case 22:
                List list12 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(500L, "measurement.upload.minimum_delay", 28).get();
            case 23:
                List list13 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(604800000L, "measurement.upload.refresh_blacklisted_config_interval", 34).get();
            case 24:
                List list14 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(1800000L, "measurement.upload.retry_time", 77).get();
            case 25:
                List list15 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(605000L, "measurement.upload.google_signal_max_queue_time", 15).get();
            case 26:
                List list16 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(5000L, "measurement.service_client.idle_disconnect_millis", 36).get();
            case 27:
                List list17 = AbstractC4936.f16299;
                C1549.f5236.get();
                return (String) C1819.f6045.m8236(5, "measurement.test.string_flag", "---").get();
            case 28:
                List list18 = AbstractC4936.f16299;
                C1549.f5236.get();
                return (Long) C1819.f6045.m8235(-1L, "measurement.test.cached_long_flag", 1).get();
            default:
                List list19 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(50L, "measurement.experiment.max_ids", 21).get()).longValue());
        }
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public /* synthetic */ Object mo400(C2813 c2813) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c2813);
    }

    public /* synthetic */ C4452(int i) {
        this.f14693 = i;
    }
}
