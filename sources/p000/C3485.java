package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: ۦؘؔٚٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3485 implements InterfaceC1539, InterfaceC2515, InterfaceC3704 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11584;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ C3485 f11583 = new C3485(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ C3485 f11569 = new C3485(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C3485 f11570 = new C3485(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C3485 f11568 = new C3485(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C3485 f11572 = new C3485(4);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C3485 f11580 = new C3485(5);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C3485 f11582 = new C3485(6);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C3485 f11574 = new C3485(7);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C3485 f11579 = new C3485(8);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C3485 f11573 = new C3485(9);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C3485 f11566 = new C3485(10);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C3485 f11565 = new C3485(11);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C3485 f11576 = new C3485(12);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C3485 f11567 = new C3485(13);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C3485 f11581 = new C3485(14);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C3485 f11571 = new C3485(15);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C3485 f11575 = new C3485(16);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C3485 f11578 = new C3485(17);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C3485 f11577 = new C3485(18);

    public /* synthetic */ C3485(int i) {
        this.f11584 = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
  0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // p000.InterfaceC2515
    /* JADX INFO: renamed from: ۥۗ */
    public C4998 mo3546(Context context, String str, InterfaceC4409 interfaceC4409) {
        C4998 c4998 = new C4998();
        c4998.f16540 = interfaceC4409.mo3880(context, str);
        int i = 1;
        int iMo3876 = interfaceC4409.mo3876(context, str, true);
        c4998.f16539 = iMo3876;
        int i2 = c4998.f16540;
        if (i2 == 0) {
            i2 = 0;
            if (iMo3876 == 0) {
                i = 0;
            } else if (i2 >= iMo3876) {
                i = -1;
            }
        } else if (i2 >= iMo3876) {
            i = -1;
        }
        c4998.f16538 = i;
        return c4998;
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f11584) {
            case 0:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(100L, "measurement.max_bundles_per_iteration", 3).get()).longValue());
            case 1:
                List list2 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(100L, "measurement.upload.max_bundles", 67).get()).longValue());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(3600000L, "measurement.session.engagement_interval", 12).get();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(864000000L, "measurement.rb.attribution.max_queue_time", 57).get();
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once", 25).get()).longValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Boolean) C4999.f16541.m8237(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get();
            case 8:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(3600000L, "45769094", 11).get();
            case 9:
                List list10 = AbstractC4936.f16299;
                return (Boolean) C2876.f9599.get();
            case 10:
                List list11 = AbstractC4936.f16299;
                return (Boolean) C4240.f14046.get();
            case 11:
                List list12 = AbstractC4936.f16299;
                return Integer.valueOf((int) ((Long) C3065.f10305.get()).longValue());
            case 12:
                List list13 = AbstractC4936.f16299;
                return (Boolean) C1823.f6057.get();
            case 13:
                List list14 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(6, "measurement.rb.attribution.service", true).get();
            case 14:
                List list15 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case 15:
                List list16 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            case 16:
                List list17 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(100000L, "measurement.upload.max_events_per_day", 71).get()).longValue());
            case 17:
                return new Boolean(((Boolean) C3091.f10372.get()).booleanValue());
            default:
                return new Boolean(((Boolean) C0820.f2912.get()).booleanValue());
        }
    }
}
