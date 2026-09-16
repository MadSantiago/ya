package p000;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurementReceiver;
import java.util.List;

/* JADX INFO: renamed from: ۦٜۢؒٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5518 implements InterfaceC1539, InterfaceC4409, InterfaceC1170, InterfaceC2429 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f18223;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ C5518 f18222 = new C5518(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ C5518 f18208 = new C5518(1);

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ C5518 f18209 = new C5518(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ C5518 f18207 = new C5518(3);

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ C5518 f18211 = new C5518(4);

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ C5518 f18219 = new C5518(5);

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ C5518 f18221 = new C5518(6);

    /* JADX INFO: renamed from: ۥۖ */
    public static final /* synthetic */ C5518 f18213 = new C5518(7);

    /* JADX INFO: renamed from: ۦٕ */
    public static final /* synthetic */ C5518 f18218 = new C5518(8);

    /* JADX INFO: renamed from: ۥٙ */
    public static final /* synthetic */ C5518 f18212 = new C5518(9);

    /* JADX INFO: renamed from: ۥؖ */
    public static final /* synthetic */ C5518 f18205 = new C5518(10);

    /* JADX INFO: renamed from: ۥؓ */
    public static final /* synthetic */ C5518 f18204 = new C5518(12);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C5518 f18215 = new C5518(13);

    /* JADX INFO: renamed from: ۥً */
    public static final /* synthetic */ C5518 f18206 = new C5518(14);

    /* JADX INFO: renamed from: ۦٚ */
    public static final /* synthetic */ C5518 f18220 = new C5518(15);

    /* JADX INFO: renamed from: ۥٕ */
    public static final /* synthetic */ C5518 f18210 = new C5518(16);

    /* JADX INFO: renamed from: ۥۙ */
    public static final /* synthetic */ C5518 f18214 = new C5518(17);

    /* JADX INFO: renamed from: ۦؙ */
    public static final /* synthetic */ C5518 f18217 = new C5518(18);

    /* JADX INFO: renamed from: ۦؖ */
    public static final /* synthetic */ C5518 f18216 = new C5518(20);

    public C5518(AppMeasurementReceiver appMeasurementReceiver) {
        this.f18223 = 19;
    }

    @Override // p000.InterfaceC1170
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = C1543.f5220;
    }

    @Override // p000.InterfaceC4409
    /* JADX INFO: renamed from: ۥؗ */
    public int mo3876(Context context, String str, boolean z) {
        return C2401.m4523(context, str, z);
    }

    @Override // p000.InterfaceC2429
    /* JADX INFO: renamed from: ۥّ */
    public Object mo396(C3580 c3580) {
        AbstractC5212 abstractC5212M1977;
        C4629 c4629 = (C4629) c3580.m6388();
        C4327 c4327M3774 = C1927.m3774();
        String str = c4629.f15291;
        c4327M3774.m1979();
        ((C1927) c4327M3774.f3388).m3782(str);
        String str2 = c4629.f15286;
        c4327M3774.m1979();
        ((C1927) c4327M3774.f3388).m3775(str2);
        boolean z = c4629.f15288;
        c4327M3774.m1979();
        ((C1927) c4327M3774.f3388).m3786(z);
        long j = c4629.f15289;
        c4327M3774.m1979();
        ((C1927) c4327M3774.f3388).m3780(j);
        byte[] bArr = c4629.f15290;
        if (bArr != null) {
            C4585 c4585M7597 = AbstractC4314.m7597(bArr, 0, bArr.length);
            c4327M3774.m1979();
            ((C1927) c4327M3774.f3388).m3776(c4585M7597);
        }
        for (C2884 c2884 : c4629.f15287) {
            for (C5692 c5692 : c2884.f9621) {
                int i = c5692.f18726;
                String str3 = c5692.f18729;
                if (i == 1) {
                    C2959 c2959M3968 = C2027.m3968();
                    c2959M3968.m5521(str3);
                    if (i != 1) {
                        C1078.m2272("Not a long type");
                        return null;
                    }
                    long j2 = c5692.f18728;
                    c2959M3968.m1979();
                    ((C2027) c2959M3968.f3388).m3969(j2);
                    abstractC5212M1977 = c2959M3968.m1977();
                } else if (i == 2) {
                    C2959 c2959M3969 = C2027.m3968();
                    c2959M3969.m5521(str3);
                    if (i != 2) {
                        C1078.m2272("Not a boolean type");
                        return null;
                    }
                    boolean z2 = c5692.f18722;
                    c2959M3969.m1979();
                    ((C2027) c2959M3969.f3388).m3978(z2);
                    abstractC5212M1977 = c2959M3969.m1977();
                } else if (i == 3) {
                    C2959 c2959M39610 = C2027.m3968();
                    c2959M39610.m5521(str3);
                    if (i != 3) {
                        C1078.m2272("Not a double type");
                        return null;
                    }
                    double d = c5692.f18723;
                    c2959M39610.m1979();
                    ((C2027) c2959M39610.f3388).m3971(d);
                    abstractC5212M1977 = c2959M39610.m1977();
                } else if (i == 4) {
                    C2959 c2959M39611 = C2027.m3968();
                    c2959M39611.m5521(str3);
                    if (i != 4) {
                        C1078.m2272("Not a String type");
                        return null;
                    }
                    String str4 = c5692.f18721;
                    AbstractC0487.m1047(str4);
                    c2959M39611.m1979();
                    ((C2027) c2959M39611.f3388).m3980(str4);
                    abstractC5212M1977 = c2959M39611.m1977();
                } else {
                    if (i != 5) {
                        C1078.m2272(AbstractC5078.m8673(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                        return null;
                    }
                    C2959 c2959M39612 = C2027.m3968();
                    c2959M39612.m5521(str3);
                    if (i != 5) {
                        C1078.m2272("Not a bytes type");
                        return null;
                    }
                    byte[] bArr2 = c5692.f18724;
                    AbstractC0487.m1047(bArr2);
                    C4585 c4585M7598 = AbstractC4314.m7597(bArr2, 0, bArr2.length);
                    c2959M39612.m1979();
                    ((C2027) c2959M39612.f3388).m3974(c4585M7598);
                    abstractC5212M1977 = c2959M39612.m1977();
                }
                c4327M3774.m1979();
                ((C1927) c4327M3774.f3388).m3784((C2027) abstractC5212M1977);
            }
            String[] strArr = c2884.f9619;
            if (strArr != null) {
                for (String str5 : strArr) {
                    c4327M3774.m1979();
                    ((C1927) c4327M3774.f3388).m3777(str5);
                }
            }
        }
        return (C1927) c4327M3774.m1977();
    }

    @Override // p000.InterfaceC1539
    /* JADX INFO: renamed from: ۥۣ */
    public Object mo3292() {
        switch (this.f18223) {
            case 0:
                List list = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(500L, "measurement.upload.max_event_parameter_value_length", 19).get()).longValue());
            case 1:
                List list2 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Long) C4999.f16541.m8235(7200000L, "measurement.redaction.app_instance_id.ttl", 62).get();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list3 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(1L, "measurement.dma_consent.max_daily_dcu_realtime_events", 18).get()).longValue());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                List list4 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                List list5 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (String) C4999.f16541.m8236(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list6 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(65536L, "measurement.upload.max_batch_size", 75).get()).longValue());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = AbstractC4936.f16299;
                C4502.f14885.get();
                return Integer.valueOf((int) ((Long) C4999.f16541.m8235(90L, "measurement.rb.attribution.client.min_time_after_boot_seconds", 55).get()).longValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Boolean) C4999.f16541.m8237(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            case 8:
                List list9 = AbstractC4936.f16299;
                C4502.f14885.get();
                return (Boolean) C4999.f16541.m8237(10, "measurement.config.default_flag_values", true).get();
            case 9:
                List list10 = AbstractC4936.f16299;
                return (Boolean) C2876.f9598.get();
            case 10:
                List list11 = AbstractC4936.f16299;
                return (Boolean) C1682.f5600.get();
            case 11:
            default:
                return new Boolean(((Boolean) C5871.f19390.get()).booleanValue());
            case 12:
                List list12 = AbstractC4936.f16299;
                return (Boolean) C0919.f3294.get();
            case 13:
                List list13 = AbstractC4936.f16299;
                return (Boolean) C4926.f16238.get();
            case 14:
                List list14 = AbstractC4936.f16299;
                C0237.f888.get();
                return (Boolean) C4726.f15603.m8237(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 15:
                List list15 = AbstractC4936.f16299;
                return (Boolean) C1730.f5759.get();
            case 16:
                List list16 = AbstractC4936.f16299;
                return (Boolean) C1002.f3581.get();
            case 17:
                return new Boolean(((Boolean) C3091.f10373.get()).booleanValue());
        }
    }

    @Override // p000.InterfaceC4409
    /* JADX INFO: renamed from: ۦؑ */
    public int mo3880(Context context, String str) {
        return C2401.m4522(context, str);
    }

    public /* synthetic */ C5518(int i) {
        this.f18223 = i;
    }
}
