package p000;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ۦٗؕ۟ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4369 implements InterfaceC2218, InterfaceC5375, InterfaceC0217, InterfaceC0130, InterfaceC1681, InterfaceC1539 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static C4369 f14401;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14402;

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ C4369 f14384 = new C4369(9);

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C4369 f14385 = new C4369(10);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C4369 f14383 = new C4369(11);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C4369 f14387 = new C4369(12);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C4369 f14398 = new C4369(13);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C4369 f14400 = new C4369(14);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C4369 f14389 = new C4369(15);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C4369 f14397 = new C4369(16);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C4369 f14388 = new C4369(17);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C4369 f14381 = new C4369(18);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C4369 f14380 = new C4369(19);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C4369 f14392 = new C4369(20);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C4369 f14382 = new C4369(21);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C4369 f14399 = new C4369(22);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C4369 f14386 = new C4369(23);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C4369 f14390 = new C4369(24);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C4369 f14395 = new C4369(25);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C4369 f14393 = new C4369(26);

    /* JADX INFO: renamed from: ۥۦ */
    public static final /* synthetic */ C4369 f14391 = new C4369(27);

    /* JADX INFO: renamed from: ۦؗ */
    public static final /* synthetic */ C4369 f14394 = new C4369(28);

    /* JADX INFO: renamed from: ۦُ */
    public static final /* synthetic */ C4369 f14396 = new C4369(29);

    public /* synthetic */ C4369(int i) {
        this.f14402 = i;
    }

    @Override // p000.InterfaceC1681
    /* JADX INFO: renamed from: ۥؗ */
    public /* synthetic */ String mo3507(String str, String str2) {
        return null;
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥُ */
    public AbstractC0941 mo474(Class cls, C4397 c4397) {
        return mo475(cls);
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۗ */
    public AbstractC0941 mo475(Class cls) {
        return AbstractC1605.m3366(cls);
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۜ */
    public AbstractC0941 mo476(C3131 c3131, C4397 c4397) {
        return mo474(c3131.f10543, c4397);
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f14402) {
            case 10:
                return new Boolean(((Boolean) C0765.f2778.get()).booleanValue());
            case 11:
                return new Boolean(((Boolean) C1780.f5934.get()).booleanValue());
            case 12:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 13:
                List list2 = AbstractC4936.f16299;
                return (String) C3179.f10678.get();
            case 14:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(10000L, "measurement.upload.max_conversions_per_day", 68).get()).longValue());
            case 15:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 16:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 17:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(21600000L, "measurement.sgtm.upload.retry_max_wait", 52).get();
            case 18:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(10L, "measurement.sgtm.batch.retry_max_count", 42).get()).longValue());
            case 19:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(5000L, "measurement.sgtm.upload.min_delay_after_startup", 50).get();
            case 20:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(240000L, "measurement.sgtm.batch.long_queuing_threshold", 40).get();
            case 21:
                List list10 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(3600000L, "measurement.upload.window_interval", 79).get();
            case 22:
                List list11 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(1000L, "measurement.upload.debug_upload_interval", 9).get();
            case 23:
                List list12 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(86400000L, "measurement.upload.stale_data_deletion_interval", 53).get();
            case 24:
                List list13 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(8, "measurement.config.url_scheme", "https").get();
            case 25:
                List list14 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(518400000L, "measurement.upload.max_queue_time", 73).get();
            case 26:
                List list15 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(200L, "measurement.audience.filter_result_max_count", 22).get()).longValue());
            case 27:
                List list16 = AbstractC4936.f16299;
                C1549.f5236.get();
                return (Boolean) C1819.f6045.m8237(0, "measurement.test.boolean_flag", false).get();
            case 28:
                List list17 = AbstractC4936.f16299;
                C1549.f5236.get();
                return (Long) C1819.f6045.m8235(-1L, "measurement.test.long_flag", 4).get();
            default:
                List list18 = AbstractC4936.f16299;
                C1549.f5236.get();
                C4898 c4898 = C1819.f6045;
                AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) c4898.f16143;
                AbstractC4804 abstractC4804 = (AbstractC4804) atomicReferenceArray.get(2);
                if (abstractC4804 == null) {
                    C5589 c5589 = new C5589("measurement.test.double_flag", (C3225) ((C2391) c4898.f16142).f7924);
                    while (!atomicReferenceArray.compareAndSet(2, null, c5589)) {
                        if (atomicReferenceArray.get(2) != null) {
                            abstractC4804 = (AbstractC4804) atomicReferenceArray.get(2);
                            abstractC4804.getClass();
                        }
                    }
                    abstractC4804 = c5589;
                }
                return (Double) abstractC4804.get();
        }
    }

    @Override // p000.InterfaceC5375
    /* JADX INFO: renamed from: ۦؑ */
    public long mo7674() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦؚ */
    public boolean mo285(Class cls) {
        return false;
    }

    @Override // p000.InterfaceC0130
    /* JADX INFO: renamed from: ۦ۟ */
    public C3730 mo286(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
