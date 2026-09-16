package p000;

import android.webkit.WebView;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦََّ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3875 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12925;

    public /* synthetic */ C3875(int i) {
        this.f12925 = i;
    }

    /* JADX INFO: renamed from: ۥُ */
    private final Object m6925(Object obj) throws Exception {
        InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        try {
            int iM8613 = C5063.m8613(interfaceC0252Mo971, "id");
            int iM8614 = C5063.m8613(interfaceC0252Mo971, "state");
            int iM8615 = C5063.m8613(interfaceC0252Mo971, "worker_class_name");
            int iM8616 = C5063.m8613(interfaceC0252Mo971, "input_merger_class_name");
            int iM8617 = C5063.m8613(interfaceC0252Mo971, "input");
            int iM8618 = C5063.m8613(interfaceC0252Mo971, "output");
            int iM8619 = C5063.m8613(interfaceC0252Mo971, "initial_delay");
            int iM86110 = C5063.m8613(interfaceC0252Mo971, "interval_duration");
            int iM86111 = C5063.m8613(interfaceC0252Mo971, "flex_duration");
            int iM86112 = C5063.m8613(interfaceC0252Mo971, "run_attempt_count");
            int iM86113 = C5063.m8613(interfaceC0252Mo971, "backoff_policy");
            int iM86114 = C5063.m8613(interfaceC0252Mo971, "backoff_delay_duration");
            int iM86115 = C5063.m8613(interfaceC0252Mo971, "last_enqueue_time");
            int iM86116 = C5063.m8613(interfaceC0252Mo971, "minimum_retention_duration");
            int iM86117 = C5063.m8613(interfaceC0252Mo971, "schedule_requested_at");
            int iM86118 = C5063.m8613(interfaceC0252Mo971, "run_in_foreground");
            int iM86119 = C5063.m8613(interfaceC0252Mo971, "out_of_quota_policy");
            int iM86120 = C5063.m8613(interfaceC0252Mo971, "period_count");
            int iM86121 = C5063.m8613(interfaceC0252Mo971, "generation");
            int iM86122 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override");
            int iM86123 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override_generation");
            int iM86124 = C5063.m8613(interfaceC0252Mo971, "stop_reason");
            int iM86125 = C5063.m8613(interfaceC0252Mo971, "trace_tag");
            int iM86126 = C5063.m8613(interfaceC0252Mo971, "backoff_on_system_interruptions");
            int iM86127 = C5063.m8613(interfaceC0252Mo971, "required_network_type");
            int iM86128 = C5063.m8613(interfaceC0252Mo971, "required_network_request");
            int iM86129 = C5063.m8613(interfaceC0252Mo971, "requires_charging");
            int iM86130 = C5063.m8613(interfaceC0252Mo971, "requires_device_idle");
            int iM86131 = C5063.m8613(interfaceC0252Mo971, "requires_battery_not_low");
            int iM86132 = C5063.m8613(interfaceC0252Mo971, "requires_storage_not_low");
            int iM86133 = C5063.m8613(interfaceC0252Mo971, "trigger_content_update_delay");
            int iM86134 = C5063.m8613(interfaceC0252Mo971, "trigger_max_content_delay");
            int iM86135 = C5063.m8613(interfaceC0252Mo971, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC0252Mo971.mo533()) {
                String strMo534 = interfaceC0252Mo971.mo534(iM8613);
                int i = iM86116;
                ArrayList arrayList2 = arrayList;
                EnumC4972 enumC4972M4802 = AbstractC2552.m4802((int) interfaceC0252Mo971.getLong(iM8614));
                String strMo535 = interfaceC0252Mo971.mo534(iM8615);
                String strMo536 = interfaceC0252Mo971.mo534(iM8616);
                byte[] blob = interfaceC0252Mo971.getBlob(iM8617);
                C2775 c2775 = C2775.f9249;
                C2775 c2775M2144 = AbstractC0993.m2144(blob);
                C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo971.getBlob(iM8618));
                long j = interfaceC0252Mo971.getLong(iM8619);
                long j2 = interfaceC0252Mo971.getLong(iM86110);
                long j3 = interfaceC0252Mo971.getLong(iM86111);
                int i2 = (int) interfaceC0252Mo971.getLong(iM86112);
                int i3 = iM8614;
                int i4 = iM8615;
                int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo971.getLong(iM86113));
                long j4 = interfaceC0252Mo971.getLong(iM86114);
                long j5 = interfaceC0252Mo971.getLong(iM86115);
                long j6 = interfaceC0252Mo971.getLong(i);
                int i5 = iM86117;
                long j7 = interfaceC0252Mo971.getLong(i5);
                int i6 = iM8613;
                int i7 = iM86118;
                boolean z = ((int) interfaceC0252Mo971.getLong(i7)) != 0;
                int i8 = iM86119;
                int i9 = iM8616;
                int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo971.getLong(i8));
                int i10 = iM86120;
                int i11 = iM8617;
                int i12 = (int) interfaceC0252Mo971.getLong(i10);
                int i13 = iM86121;
                int i14 = (int) interfaceC0252Mo971.getLong(i13);
                int i15 = iM86122;
                long j8 = interfaceC0252Mo971.getLong(i15);
                int i16 = iM86123;
                int i17 = (int) interfaceC0252Mo971.getLong(i16);
                int i18 = iM86124;
                int i19 = (int) interfaceC0252Mo971.getLong(i18);
                int i20 = iM86125;
                Boolean boolValueOf = null;
                String strMo537 = interfaceC0252Mo971.isNull(i20) ? null : interfaceC0252Mo971.mo534(i20);
                int i21 = iM86126;
                Integer numValueOf = interfaceC0252Mo971.isNull(i21) ? null : Integer.valueOf((int) interfaceC0252Mo971.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iM86127;
                Boolean bool = boolValueOf;
                int iM4800 = AbstractC2552.m4800((int) interfaceC0252Mo971.getLong(i22));
                int i23 = iM86128;
                C3783 c3783M4809 = AbstractC2552.m4809(interfaceC0252Mo971.getBlob(i23));
                iM86127 = i22;
                iM86128 = i23;
                int i24 = iM86129;
                boolean z2 = ((int) interfaceC0252Mo971.getLong(i24)) != 0;
                iM86129 = i24;
                int i25 = iM86130;
                boolean z3 = ((int) interfaceC0252Mo971.getLong(i25)) != 0;
                int i26 = iM86131;
                boolean z4 = ((int) interfaceC0252Mo971.getLong(i26)) != 0;
                iM86131 = i26;
                int i27 = iM86132;
                int i28 = iM86133;
                int i29 = iM86134;
                int i30 = iM86135;
                iM86135 = i30;
                arrayList2.add(new C4142(strMo534, enumC4972M4802, strMo535, strMo536, c2775M2144, c2775M2145, j, j2, j3, new C4628(c3783M4809, iM4800, z2, z3, z4, ((int) interfaceC0252Mo971.getLong(i27)) != 0, interfaceC0252Mo971.getLong(i28), interfaceC0252Mo971.getLong(i29), AbstractC2552.m4797(interfaceC0252Mo971.getBlob(i30))), i2, iM4799, j4, j5, j6, j7, z, iM4796, i12, i14, j8, i17, i19, strMo537, bool));
                iM86132 = i27;
                iM8616 = i9;
                iM86119 = i8;
                iM86121 = i13;
                iM86124 = i18;
                iM86126 = i21;
                iM86133 = i28;
                iM86134 = i29;
                iM8614 = i3;
                iM86116 = i;
                iM8615 = i4;
                arrayList = arrayList2;
                iM8613 = i6;
                iM86117 = i5;
                iM86118 = i7;
                iM86122 = i15;
                iM86123 = i16;
                iM86125 = i20;
                iM86130 = i25;
                iM8617 = i11;
                iM86120 = i10;
            }
            return arrayList;
        } finally {
            interfaceC0252Mo971.close();
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    private final Object m6926(Object obj) throws Exception {
        InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            interfaceC0252Mo971.mo532(200L, 1);
            int iM8613 = C5063.m8613(interfaceC0252Mo971, "id");
            int iM8614 = C5063.m8613(interfaceC0252Mo971, "state");
            int iM8615 = C5063.m8613(interfaceC0252Mo971, "worker_class_name");
            int iM8616 = C5063.m8613(interfaceC0252Mo971, "input_merger_class_name");
            int iM8617 = C5063.m8613(interfaceC0252Mo971, "input");
            int iM8618 = C5063.m8613(interfaceC0252Mo971, "output");
            int iM8619 = C5063.m8613(interfaceC0252Mo971, "initial_delay");
            int iM86110 = C5063.m8613(interfaceC0252Mo971, "interval_duration");
            int iM86111 = C5063.m8613(interfaceC0252Mo971, "flex_duration");
            int iM86112 = C5063.m8613(interfaceC0252Mo971, "run_attempt_count");
            int iM86113 = C5063.m8613(interfaceC0252Mo971, "backoff_policy");
            int iM86114 = C5063.m8613(interfaceC0252Mo971, "backoff_delay_duration");
            int iM86115 = C5063.m8613(interfaceC0252Mo971, "last_enqueue_time");
            int iM86116 = C5063.m8613(interfaceC0252Mo971, "minimum_retention_duration");
            int iM86117 = C5063.m8613(interfaceC0252Mo971, "schedule_requested_at");
            int iM86118 = C5063.m8613(interfaceC0252Mo971, "run_in_foreground");
            int iM86119 = C5063.m8613(interfaceC0252Mo971, "out_of_quota_policy");
            int iM86120 = C5063.m8613(interfaceC0252Mo971, "period_count");
            int iM86121 = C5063.m8613(interfaceC0252Mo971, "generation");
            int iM86122 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override");
            int iM86123 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override_generation");
            int iM86124 = C5063.m8613(interfaceC0252Mo971, "stop_reason");
            int iM86125 = C5063.m8613(interfaceC0252Mo971, "trace_tag");
            int iM86126 = C5063.m8613(interfaceC0252Mo971, "backoff_on_system_interruptions");
            int iM86127 = C5063.m8613(interfaceC0252Mo971, "required_network_type");
            int iM86128 = C5063.m8613(interfaceC0252Mo971, "required_network_request");
            int iM86129 = C5063.m8613(interfaceC0252Mo971, "requires_charging");
            int iM86130 = C5063.m8613(interfaceC0252Mo971, "requires_device_idle");
            int iM86131 = C5063.m8613(interfaceC0252Mo971, "requires_battery_not_low");
            int iM86132 = C5063.m8613(interfaceC0252Mo971, "requires_storage_not_low");
            int iM86133 = C5063.m8613(interfaceC0252Mo971, "trigger_content_update_delay");
            int iM86134 = C5063.m8613(interfaceC0252Mo971, "trigger_max_content_delay");
            int iM86135 = C5063.m8613(interfaceC0252Mo971, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC0252Mo971.mo533()) {
                String strMo534 = interfaceC0252Mo971.mo534(iM8613);
                int i = iM86115;
                int i2 = iM86116;
                EnumC4972 enumC4972M4802 = AbstractC2552.m4802((int) interfaceC0252Mo971.getLong(iM8614));
                String strMo535 = interfaceC0252Mo971.mo534(iM8615);
                String strMo536 = interfaceC0252Mo971.mo534(iM8616);
                byte[] blob = interfaceC0252Mo971.getBlob(iM8617);
                C2775 c2775 = C2775.f9249;
                C2775 c2775M2144 = AbstractC0993.m2144(blob);
                C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo971.getBlob(iM8618));
                long j = interfaceC0252Mo971.getLong(iM8619);
                long j2 = interfaceC0252Mo971.getLong(iM86110);
                long j3 = interfaceC0252Mo971.getLong(iM86111);
                int i3 = (int) interfaceC0252Mo971.getLong(iM86112);
                int i4 = iM8613;
                int i5 = iM8614;
                int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo971.getLong(iM86113));
                long j4 = interfaceC0252Mo971.getLong(iM86114);
                long j5 = interfaceC0252Mo971.getLong(i);
                long j6 = interfaceC0252Mo971.getLong(i2);
                int i6 = iM86117;
                long j7 = interfaceC0252Mo971.getLong(i6);
                iM86117 = i6;
                int i7 = iM86118;
                int i8 = iM8615;
                boolean z = ((int) interfaceC0252Mo971.getLong(i7)) != 0;
                int i9 = iM86119;
                int i10 = iM8616;
                int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo971.getLong(i9));
                int i11 = iM86120;
                int i12 = (int) interfaceC0252Mo971.getLong(i11);
                int i13 = iM86121;
                int i14 = (int) interfaceC0252Mo971.getLong(i13);
                int i15 = iM86122;
                long j8 = interfaceC0252Mo971.getLong(i15);
                int i16 = iM86123;
                int i17 = (int) interfaceC0252Mo971.getLong(i16);
                iM86123 = i16;
                iM86124 = iM86124;
                int i18 = (int) interfaceC0252Mo971.getLong(iM86124);
                int i19 = iM86125;
                Boolean boolValueOf = null;
                String strMo537 = interfaceC0252Mo971.isNull(i19) ? null : interfaceC0252Mo971.mo534(i19);
                int i20 = iM86126;
                Integer numValueOf = interfaceC0252Mo971.isNull(i20) ? null : Integer.valueOf((int) interfaceC0252Mo971.getLong(i20));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i21 = iM86127;
                int iM4800 = AbstractC2552.m4800((int) interfaceC0252Mo971.getLong(i21));
                int i22 = iM86128;
                C3783 c3783M4809 = AbstractC2552.m4809(interfaceC0252Mo971.getBlob(i22));
                int i23 = iM86129;
                boolean z2 = ((int) interfaceC0252Mo971.getLong(i23)) != 0;
                int i24 = iM86130;
                boolean z3 = ((int) interfaceC0252Mo971.getLong(i24)) != 0;
                int i25 = iM86131;
                boolean z4 = ((int) interfaceC0252Mo971.getLong(i25)) != 0;
                iM86131 = i25;
                int i26 = iM86132;
                int i27 = iM86133;
                int i28 = iM86134;
                iM86133 = i27;
                int i29 = iM86135;
                arrayList.add(new C4142(strMo534, enumC4972M4802, strMo535, strMo536, c2775M2144, c2775M2145, j, j2, j3, new C4628(c3783M4809, iM4800, z2, z3, z4, ((int) interfaceC0252Mo971.getLong(i26)) != 0, interfaceC0252Mo971.getLong(i27), interfaceC0252Mo971.getLong(i28), AbstractC2552.m4797(interfaceC0252Mo971.getBlob(i29))), i3, iM4799, j4, j5, j6, j7, z, iM4796, i12, i14, j8, i17, i18, strMo537, bool));
                iM86130 = i24;
                iM8616 = i10;
                iM86119 = i9;
                iM86120 = i11;
                iM86121 = i13;
                iM86122 = i15;
                iM86125 = i19;
                iM86126 = i20;
                iM86127 = i21;
                iM86128 = i22;
                iM86129 = i23;
                iM86135 = i29;
                iM86134 = i28;
                iM86132 = i26;
                iM8613 = i4;
                iM8615 = i8;
                iM86115 = i;
                iM86116 = i2;
                iM8614 = i5;
                iM86118 = i7;
            }
            return arrayList;
        } finally {
            interfaceC0252Mo971.close();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    private final Object m6927(Object obj) throws Exception {
        InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE state=1");
        try {
            int iM8613 = C5063.m8613(interfaceC0252Mo971, "id");
            int iM8614 = C5063.m8613(interfaceC0252Mo971, "state");
            int iM8615 = C5063.m8613(interfaceC0252Mo971, "worker_class_name");
            int iM8616 = C5063.m8613(interfaceC0252Mo971, "input_merger_class_name");
            int iM8617 = C5063.m8613(interfaceC0252Mo971, "input");
            int iM8618 = C5063.m8613(interfaceC0252Mo971, "output");
            int iM8619 = C5063.m8613(interfaceC0252Mo971, "initial_delay");
            int iM86110 = C5063.m8613(interfaceC0252Mo971, "interval_duration");
            int iM86111 = C5063.m8613(interfaceC0252Mo971, "flex_duration");
            int iM86112 = C5063.m8613(interfaceC0252Mo971, "run_attempt_count");
            int iM86113 = C5063.m8613(interfaceC0252Mo971, "backoff_policy");
            int iM86114 = C5063.m8613(interfaceC0252Mo971, "backoff_delay_duration");
            int iM86115 = C5063.m8613(interfaceC0252Mo971, "last_enqueue_time");
            int iM86116 = C5063.m8613(interfaceC0252Mo971, "minimum_retention_duration");
            int iM86117 = C5063.m8613(interfaceC0252Mo971, "schedule_requested_at");
            int iM86118 = C5063.m8613(interfaceC0252Mo971, "run_in_foreground");
            int iM86119 = C5063.m8613(interfaceC0252Mo971, "out_of_quota_policy");
            int iM86120 = C5063.m8613(interfaceC0252Mo971, "period_count");
            int iM86121 = C5063.m8613(interfaceC0252Mo971, "generation");
            int iM86122 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override");
            int iM86123 = C5063.m8613(interfaceC0252Mo971, "next_schedule_time_override_generation");
            int iM86124 = C5063.m8613(interfaceC0252Mo971, "stop_reason");
            int iM86125 = C5063.m8613(interfaceC0252Mo971, "trace_tag");
            int iM86126 = C5063.m8613(interfaceC0252Mo971, "backoff_on_system_interruptions");
            int iM86127 = C5063.m8613(interfaceC0252Mo971, "required_network_type");
            int iM86128 = C5063.m8613(interfaceC0252Mo971, "required_network_request");
            int iM86129 = C5063.m8613(interfaceC0252Mo971, "requires_charging");
            int iM86130 = C5063.m8613(interfaceC0252Mo971, "requires_device_idle");
            int iM86131 = C5063.m8613(interfaceC0252Mo971, "requires_battery_not_low");
            int iM86132 = C5063.m8613(interfaceC0252Mo971, "requires_storage_not_low");
            int iM86133 = C5063.m8613(interfaceC0252Mo971, "trigger_content_update_delay");
            int iM86134 = C5063.m8613(interfaceC0252Mo971, "trigger_max_content_delay");
            int iM86135 = C5063.m8613(interfaceC0252Mo971, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (interfaceC0252Mo971.mo533()) {
                String strMo534 = interfaceC0252Mo971.mo534(iM8613);
                int i = iM86116;
                ArrayList arrayList2 = arrayList;
                EnumC4972 enumC4972M4802 = AbstractC2552.m4802((int) interfaceC0252Mo971.getLong(iM8614));
                String strMo535 = interfaceC0252Mo971.mo534(iM8615);
                String strMo536 = interfaceC0252Mo971.mo534(iM8616);
                byte[] blob = interfaceC0252Mo971.getBlob(iM8617);
                C2775 c2775 = C2775.f9249;
                C2775 c2775M2144 = AbstractC0993.m2144(blob);
                C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo971.getBlob(iM8618));
                long j = interfaceC0252Mo971.getLong(iM8619);
                long j2 = interfaceC0252Mo971.getLong(iM86110);
                long j3 = interfaceC0252Mo971.getLong(iM86111);
                int i2 = (int) interfaceC0252Mo971.getLong(iM86112);
                int i3 = iM8614;
                int i4 = iM8615;
                int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo971.getLong(iM86113));
                long j4 = interfaceC0252Mo971.getLong(iM86114);
                long j5 = interfaceC0252Mo971.getLong(iM86115);
                long j6 = interfaceC0252Mo971.getLong(i);
                int i5 = iM86117;
                long j7 = interfaceC0252Mo971.getLong(i5);
                int i6 = iM8613;
                int i7 = iM86118;
                boolean z = ((int) interfaceC0252Mo971.getLong(i7)) != 0;
                int i8 = iM86119;
                int i9 = iM8616;
                int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo971.getLong(i8));
                int i10 = iM86120;
                int i11 = iM8617;
                int i12 = (int) interfaceC0252Mo971.getLong(i10);
                int i13 = iM86121;
                int i14 = (int) interfaceC0252Mo971.getLong(i13);
                int i15 = iM86122;
                long j8 = interfaceC0252Mo971.getLong(i15);
                int i16 = iM86123;
                int i17 = (int) interfaceC0252Mo971.getLong(i16);
                int i18 = iM86124;
                int i19 = (int) interfaceC0252Mo971.getLong(i18);
                int i20 = iM86125;
                Boolean boolValueOf = null;
                String strMo537 = interfaceC0252Mo971.isNull(i20) ? null : interfaceC0252Mo971.mo534(i20);
                int i21 = iM86126;
                Integer numValueOf = interfaceC0252Mo971.isNull(i21) ? null : Integer.valueOf((int) interfaceC0252Mo971.getLong(i21));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                int i22 = iM86127;
                Boolean bool = boolValueOf;
                int iM4800 = AbstractC2552.m4800((int) interfaceC0252Mo971.getLong(i22));
                int i23 = iM86128;
                C3783 c3783M4809 = AbstractC2552.m4809(interfaceC0252Mo971.getBlob(i23));
                iM86127 = i22;
                iM86128 = i23;
                int i24 = iM86129;
                boolean z2 = ((int) interfaceC0252Mo971.getLong(i24)) != 0;
                iM86129 = i24;
                int i25 = iM86130;
                boolean z3 = ((int) interfaceC0252Mo971.getLong(i25)) != 0;
                int i26 = iM86131;
                boolean z4 = ((int) interfaceC0252Mo971.getLong(i26)) != 0;
                iM86131 = i26;
                int i27 = iM86132;
                int i28 = iM86133;
                int i29 = iM86134;
                int i30 = iM86135;
                iM86135 = i30;
                arrayList2.add(new C4142(strMo534, enumC4972M4802, strMo535, strMo536, c2775M2144, c2775M2145, j, j2, j3, new C4628(c3783M4809, iM4800, z2, z3, z4, ((int) interfaceC0252Mo971.getLong(i27)) != 0, interfaceC0252Mo971.getLong(i28), interfaceC0252Mo971.getLong(i29), AbstractC2552.m4797(interfaceC0252Mo971.getBlob(i30))), i2, iM4799, j4, j5, j6, j7, z, iM4796, i12, i14, j8, i17, i19, strMo537, bool));
                iM86132 = i27;
                iM8616 = i9;
                iM86119 = i8;
                iM86121 = i13;
                iM86124 = i18;
                iM86126 = i21;
                iM86133 = i28;
                iM86134 = i29;
                iM8614 = i3;
                iM86116 = i;
                iM8615 = i4;
                arrayList = arrayList2;
                iM8613 = i6;
                iM86117 = i5;
                iM86118 = i7;
                iM86122 = i15;
                iM86123 = i16;
                iM86125 = i20;
                iM86130 = i25;
                iM8617 = i11;
                iM86120 = i10;
            }
            return arrayList;
        } finally {
            interfaceC0252Mo971.close();
        }
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        Object c4535;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        z = false;
        boolean z = false;
        switch (this.f12925) {
            case 0:
                return new C3893(((Float) obj).floatValue());
            case 1:
                return new C3893(((Integer) obj).intValue());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf((int) ((C3893) obj).f13013);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C3893(((C4497) obj).f14871);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C4497(((C3893) obj).f13013);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C4980 c4980 = (C4980) obj;
                return new C0994(Float.intBitsToFloat((int) (c4980.f16476 >> 32)), Float.intBitsToFloat((int) (c4980.f16476 & 4294967295L)));
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0994 c0994 = (C0994) obj;
                return new C4980((((long) Float.floatToRawIntBits(c0994.f3550)) << 32) | (((long) Float.floatToRawIntBits(c0994.f3549)) & 4294967295L));
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C3291 c3291 = (C3291) obj;
                return new C0994(Float.intBitsToFloat((int) (c3291.f11025 >> 32)), Float.intBitsToFloat((int) (c3291.f11025 & 4294967295L)));
            case 8:
                C0994 c0995 = (C0994) obj;
                return new C3291((((long) Float.floatToRawIntBits(c0995.f3550)) << 32) | (((long) Float.floatToRawIntBits(c0995.f3549)) & 4294967295L));
            case 9:
                C1553 c1553 = (C1553) obj;
                return new C0994(Float.intBitsToFloat((int) (c1553.f5241 >> 32)), Float.intBitsToFloat((int) (c1553.f5241 & 4294967295L)));
            case 10:
                C0994 c0996 = (C0994) obj;
                return new C1553((((long) Float.floatToRawIntBits(c0996.f3550)) << 32) | (((long) Float.floatToRawIntBits(c0996.f3549)) & 4294967295L));
            case 11:
                long j = ((C0873) obj).f3199;
                return new C0994((int) (j >> 32), (int) (j & 4294967295L));
            case 12:
                C0994 c0997 = (C0994) obj;
                return new C0873((((long) Math.round(c0997.f3550)) << 32) | (((long) Math.round(c0997.f3549)) & 4294967295L));
            case 13:
                long j2 = ((C4207) obj).f13969;
                return new C0994((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 14:
                C0994 c0998 = (C0994) obj;
                int iRound = Math.round(c0998.f3550);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c0998.f3549);
                return new C4207((((long) iRound) << 32) | (((long) (iRound2 < 0 ? 0 : iRound2)) & 4294967295L));
            case 15:
                C2793 c2793 = (C2793) obj;
                return new C1453(c2793.f9343, c2793.f9342, c2793.f9341, c2793.f9344);
            case 16:
                C1453 c1453 = (C1453) obj;
                return new C2793(c1453.f4961, c1453.f4960, c1453.f4959, c1453.f4962);
            case 17:
                return Float.valueOf(((C3893) obj).f13013);
            case 18:
                C0954 c0954 = (C0954) obj;
                c0954.getClass();
                try {
                    c4535 = c0954.m1971()[0];
                    if (c4535 == null) {
                        c4535 = null;
                    }
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                if (c4535 instanceof C4535) {
                    c4535 = null;
                }
                String string = new C4441(new long[]{5499977411345115510L, 810356719646282495L, 2377462350566887396L, -2216340553523411290L, 9205747118099526268L, -6435120971622972133L, -1699185116186949963L, 2112354597876525316L, 6945297504454692742L, -3881415873942808577L, -6972342049688364554L, -3053168382922575219L, 2788855619591340832L, 1491321891765019200L, 977219099890948179L, 4832592128008622954L, -3542467324733978418L, 6134435442615474315L, 5417063803854962618L, 8072747840394059441L, -8820831799453197752L, -8170966284995588942L, -3154304363095692572L, 1031127046528178814L, 3695272939998567549L}).toString();
                C0649 c0649 = AbstractC0912.f3276;
                AbstractC2765.m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C5030((WebView) c4535, string, null, 23), 3);
                return C2358.f7817;
            case 19:
                return ((C2816) obj).f9399;
            case 20:
                return (InterfaceC4840) obj;
            case 21:
                InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("DELETE FROM WorkProgress");
                try {
                    interfaceC0252Mo971.mo533();
                    return C2358.f7817;
                } finally {
                    interfaceC0252Mo971.close();
                }
            case 22:
                InterfaceC0252 interfaceC0252Mo972 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iM8613 = C5063.m8613(interfaceC0252Mo972, "id");
                    int iM8614 = C5063.m8613(interfaceC0252Mo972, "state");
                    int iM8615 = C5063.m8613(interfaceC0252Mo972, "worker_class_name");
                    int iM8616 = C5063.m8613(interfaceC0252Mo972, "input_merger_class_name");
                    int iM8617 = C5063.m8613(interfaceC0252Mo972, "input");
                    int iM8618 = C5063.m8613(interfaceC0252Mo972, "output");
                    int iM8619 = C5063.m8613(interfaceC0252Mo972, "initial_delay");
                    int iM86110 = C5063.m8613(interfaceC0252Mo972, "interval_duration");
                    int iM86111 = C5063.m8613(interfaceC0252Mo972, "flex_duration");
                    int iM86112 = C5063.m8613(interfaceC0252Mo972, "run_attempt_count");
                    int iM86113 = C5063.m8613(interfaceC0252Mo972, "backoff_policy");
                    int iM86114 = C5063.m8613(interfaceC0252Mo972, "backoff_delay_duration");
                    int iM86115 = C5063.m8613(interfaceC0252Mo972, "last_enqueue_time");
                    int iM86116 = C5063.m8613(interfaceC0252Mo972, "minimum_retention_duration");
                    int iM86117 = C5063.m8613(interfaceC0252Mo972, "schedule_requested_at");
                    int iM86118 = C5063.m8613(interfaceC0252Mo972, "run_in_foreground");
                    int iM86119 = C5063.m8613(interfaceC0252Mo972, "out_of_quota_policy");
                    int iM86120 = C5063.m8613(interfaceC0252Mo972, "period_count");
                    int iM86121 = C5063.m8613(interfaceC0252Mo972, "generation");
                    int iM86122 = C5063.m8613(interfaceC0252Mo972, "next_schedule_time_override");
                    int iM86123 = C5063.m8613(interfaceC0252Mo972, "next_schedule_time_override_generation");
                    int iM86124 = C5063.m8613(interfaceC0252Mo972, "stop_reason");
                    int iM86125 = C5063.m8613(interfaceC0252Mo972, "trace_tag");
                    int iM86126 = C5063.m8613(interfaceC0252Mo972, "backoff_on_system_interruptions");
                    int iM86127 = C5063.m8613(interfaceC0252Mo972, "required_network_type");
                    int iM86128 = C5063.m8613(interfaceC0252Mo972, "required_network_request");
                    int iM86129 = C5063.m8613(interfaceC0252Mo972, "requires_charging");
                    int iM86130 = C5063.m8613(interfaceC0252Mo972, "requires_device_idle");
                    int iM86131 = C5063.m8613(interfaceC0252Mo972, "requires_battery_not_low");
                    int iM86132 = C5063.m8613(interfaceC0252Mo972, "requires_storage_not_low");
                    int iM86133 = C5063.m8613(interfaceC0252Mo972, "trigger_content_update_delay");
                    int iM86134 = C5063.m8613(interfaceC0252Mo972, "trigger_max_content_delay");
                    int iM86135 = C5063.m8613(interfaceC0252Mo972, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC0252Mo972.mo533()) {
                        String strMo534 = interfaceC0252Mo972.mo534(iM8613);
                        int i = iM86116;
                        int i2 = iM86115;
                        EnumC4972 enumC4972M4802 = AbstractC2552.m4802((int) interfaceC0252Mo972.getLong(iM8614));
                        String strMo535 = interfaceC0252Mo972.mo534(iM8615);
                        String strMo536 = interfaceC0252Mo972.mo534(iM8616);
                        byte[] blob = interfaceC0252Mo972.getBlob(iM8617);
                        C2775 c2775 = C2775.f9249;
                        C2775 c2775M2144 = AbstractC0993.m2144(blob);
                        C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo972.getBlob(iM8618));
                        long j3 = interfaceC0252Mo972.getLong(iM8619);
                        long j4 = interfaceC0252Mo972.getLong(iM86110);
                        long j5 = interfaceC0252Mo972.getLong(iM86111);
                        int i3 = (int) interfaceC0252Mo972.getLong(iM86112);
                        int i4 = iM8615;
                        int i5 = iM8614;
                        int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo972.getLong(iM86113));
                        long j6 = interfaceC0252Mo972.getLong(iM86114);
                        long j7 = interfaceC0252Mo972.getLong(i2);
                        long j8 = interfaceC0252Mo972.getLong(i);
                        int i6 = iM86117;
                        long j9 = interfaceC0252Mo972.getLong(i6);
                        iM86117 = i6;
                        int i7 = iM86118;
                        int i8 = iM8613;
                        boolean z2 = ((int) interfaceC0252Mo972.getLong(i7)) != 0;
                        int i9 = iM8616;
                        int i10 = iM86119;
                        int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo972.getLong(i10));
                        iM86119 = i10;
                        int i11 = iM86120;
                        int i12 = (int) interfaceC0252Mo972.getLong(i11);
                        iM86120 = i11;
                        int i13 = iM86121;
                        int i14 = (int) interfaceC0252Mo972.getLong(i13);
                        int i15 = iM86122;
                        long j10 = interfaceC0252Mo972.getLong(i15);
                        int i16 = iM86123;
                        int i17 = (int) interfaceC0252Mo972.getLong(i16);
                        int i18 = iM86124;
                        int i19 = (int) interfaceC0252Mo972.getLong(i18);
                        int i20 = iM86125;
                        String strMo537 = interfaceC0252Mo972.isNull(i20) ? null : interfaceC0252Mo972.mo534(i20);
                        int i21 = iM86126;
                        Integer numValueOf = interfaceC0252Mo972.isNull(i21) ? null : Integer.valueOf((int) interfaceC0252Mo972.getLong(i21));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i22 = iM86127;
                        int iM4800 = AbstractC2552.m4800((int) interfaceC0252Mo972.getLong(i22));
                        int i23 = iM86128;
                        C3783 c3783M4809 = AbstractC2552.m4809(interfaceC0252Mo972.getBlob(i23));
                        int i24 = iM86129;
                        boolean z3 = ((int) interfaceC0252Mo972.getLong(i24)) != 0;
                        int i25 = iM86130;
                        boolean z4 = ((int) interfaceC0252Mo972.getLong(i25)) != 0;
                        int i26 = iM86131;
                        boolean z5 = ((int) interfaceC0252Mo972.getLong(i26)) != 0;
                        iM86131 = i26;
                        int i27 = iM86132;
                        int i28 = iM86133;
                        int i29 = iM86134;
                        iM86133 = i28;
                        int i30 = iM86135;
                        iM86135 = i30;
                        arrayList.add(new C4142(strMo534, enumC4972M4802, strMo535, strMo536, c2775M2144, c2775M2145, j3, j4, j5, new C4628(c3783M4809, iM4800, z3, z4, z5, ((int) interfaceC0252Mo972.getLong(i27)) != 0, interfaceC0252Mo972.getLong(i28), interfaceC0252Mo972.getLong(i29), AbstractC2552.m4797(interfaceC0252Mo972.getBlob(i30))), i3, iM4799, j6, j7, j8, j9, z2, iM4796, i12, i14, j10, i17, i19, strMo537, boolValueOf));
                        iM8613 = i8;
                        iM86118 = i7;
                        iM86121 = i13;
                        iM86123 = i16;
                        iM86124 = i18;
                        iM86125 = i20;
                        iM86126 = i21;
                        iM86127 = i22;
                        iM86128 = i23;
                        iM86134 = i29;
                        iM86132 = i27;
                        iM8614 = i5;
                        iM8616 = i9;
                        iM86122 = i15;
                        iM86129 = i24;
                        iM86115 = i2;
                        iM8615 = i4;
                        iM86130 = i25;
                        iM86116 = i;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC0252Mo972.close();
                }
            case 23:
                InterfaceC0252 interfaceC0252Mo973 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    interfaceC0252Mo973.mo532(20L, 1);
                    int iM86136 = C5063.m8613(interfaceC0252Mo973, "id");
                    int iM86137 = C5063.m8613(interfaceC0252Mo973, "state");
                    int iM86138 = C5063.m8613(interfaceC0252Mo973, "worker_class_name");
                    int iM86139 = C5063.m8613(interfaceC0252Mo973, "input_merger_class_name");
                    int iM86140 = C5063.m8613(interfaceC0252Mo973, "input");
                    int iM86141 = C5063.m8613(interfaceC0252Mo973, "output");
                    int iM86142 = C5063.m8613(interfaceC0252Mo973, "initial_delay");
                    int iM86143 = C5063.m8613(interfaceC0252Mo973, "interval_duration");
                    int iM86144 = C5063.m8613(interfaceC0252Mo973, "flex_duration");
                    int iM86145 = C5063.m8613(interfaceC0252Mo973, "run_attempt_count");
                    int iM86146 = C5063.m8613(interfaceC0252Mo973, "backoff_policy");
                    int iM86147 = C5063.m8613(interfaceC0252Mo973, "backoff_delay_duration");
                    int iM86148 = C5063.m8613(interfaceC0252Mo973, "last_enqueue_time");
                    int iM86149 = C5063.m8613(interfaceC0252Mo973, "minimum_retention_duration");
                    int iM86150 = C5063.m8613(interfaceC0252Mo973, "schedule_requested_at");
                    int iM86151 = C5063.m8613(interfaceC0252Mo973, "run_in_foreground");
                    int iM86152 = C5063.m8613(interfaceC0252Mo973, "out_of_quota_policy");
                    int iM86153 = C5063.m8613(interfaceC0252Mo973, "period_count");
                    int iM86154 = C5063.m8613(interfaceC0252Mo973, "generation");
                    int iM86155 = C5063.m8613(interfaceC0252Mo973, "next_schedule_time_override");
                    int iM86156 = C5063.m8613(interfaceC0252Mo973, "next_schedule_time_override_generation");
                    int iM86157 = C5063.m8613(interfaceC0252Mo973, "stop_reason");
                    int iM86158 = C5063.m8613(interfaceC0252Mo973, "trace_tag");
                    int iM86159 = C5063.m8613(interfaceC0252Mo973, "backoff_on_system_interruptions");
                    int iM86160 = C5063.m8613(interfaceC0252Mo973, "required_network_type");
                    int iM86161 = C5063.m8613(interfaceC0252Mo973, "required_network_request");
                    int iM86162 = C5063.m8613(interfaceC0252Mo973, "requires_charging");
                    int iM86163 = C5063.m8613(interfaceC0252Mo973, "requires_device_idle");
                    int iM86164 = C5063.m8613(interfaceC0252Mo973, "requires_battery_not_low");
                    int iM86165 = C5063.m8613(interfaceC0252Mo973, "requires_storage_not_low");
                    int iM86166 = C5063.m8613(interfaceC0252Mo973, "trigger_content_update_delay");
                    int iM86167 = C5063.m8613(interfaceC0252Mo973, "trigger_max_content_delay");
                    int iM86168 = C5063.m8613(interfaceC0252Mo973, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC0252Mo973.mo533()) {
                        String strMo538 = interfaceC0252Mo973.mo534(iM86136);
                        int i31 = iM86148;
                        int i32 = iM86149;
                        EnumC4972 enumC4972M4803 = AbstractC2552.m4802((int) interfaceC0252Mo973.getLong(iM86137));
                        String strMo539 = interfaceC0252Mo973.mo534(iM86138);
                        String strMo5310 = interfaceC0252Mo973.mo534(iM86139);
                        byte[] blob2 = interfaceC0252Mo973.getBlob(iM86140);
                        C2775 c2776 = C2775.f9249;
                        C2775 c2775M2146 = AbstractC0993.m2144(blob2);
                        C2775 c2775M2147 = AbstractC0993.m2144(interfaceC0252Mo973.getBlob(iM86141));
                        long j11 = interfaceC0252Mo973.getLong(iM86142);
                        long j12 = interfaceC0252Mo973.getLong(iM86143);
                        long j13 = interfaceC0252Mo973.getLong(iM86144);
                        int i33 = (int) interfaceC0252Mo973.getLong(iM86145);
                        int i34 = iM86138;
                        int i35 = iM86137;
                        int iM47910 = AbstractC2552.m4799((int) interfaceC0252Mo973.getLong(iM86146));
                        long j14 = interfaceC0252Mo973.getLong(iM86147);
                        long j15 = interfaceC0252Mo973.getLong(i31);
                        long j16 = interfaceC0252Mo973.getLong(i32);
                        int i36 = iM86150;
                        long j17 = interfaceC0252Mo973.getLong(i36);
                        int i37 = iM86136;
                        int i38 = iM86151;
                        boolean z6 = ((int) interfaceC0252Mo973.getLong(i38)) != 0;
                        int i39 = iM86139;
                        int i40 = iM86140;
                        int i41 = iM86152;
                        int iM4797 = AbstractC2552.m4796((int) interfaceC0252Mo973.getLong(i41));
                        iM86152 = i41;
                        int i42 = iM86153;
                        int i43 = (int) interfaceC0252Mo973.getLong(i42);
                        iM86153 = i42;
                        int i44 = iM86154;
                        int i45 = (int) interfaceC0252Mo973.getLong(i44);
                        int i46 = iM86155;
                        long j18 = interfaceC0252Mo973.getLong(i46);
                        int i47 = iM86156;
                        int i48 = (int) interfaceC0252Mo973.getLong(i47);
                        int i49 = iM86157;
                        int i50 = (int) interfaceC0252Mo973.getLong(i49);
                        int i51 = iM86158;
                        String strMo5311 = interfaceC0252Mo973.isNull(i51) ? null : interfaceC0252Mo973.mo534(i51);
                        int i52 = iM86159;
                        Integer numValueOf2 = interfaceC0252Mo973.isNull(i52) ? null : Integer.valueOf((int) interfaceC0252Mo973.getLong(i52));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i53 = iM86160;
                        int iM4801 = AbstractC2552.m4800((int) interfaceC0252Mo973.getLong(i53));
                        int i54 = iM86161;
                        C3783 c3783M48010 = AbstractC2552.m4809(interfaceC0252Mo973.getBlob(i54));
                        int i55 = iM86162;
                        boolean z7 = ((int) interfaceC0252Mo973.getLong(i55)) != 0;
                        int i56 = iM86163;
                        boolean z8 = ((int) interfaceC0252Mo973.getLong(i56)) != 0;
                        int i57 = iM86164;
                        boolean z9 = ((int) interfaceC0252Mo973.getLong(i57)) != 0;
                        iM86164 = i57;
                        int i58 = iM86165;
                        int i59 = iM86166;
                        int i60 = iM86167;
                        iM86166 = i59;
                        int i61 = iM86168;
                        arrayList2.add(new C4142(strMo538, enumC4972M4803, strMo539, strMo5310, c2775M2146, c2775M2147, j11, j12, j13, new C4628(c3783M48010, iM4801, z7, z8, z9, ((int) interfaceC0252Mo973.getLong(i58)) != 0, interfaceC0252Mo973.getLong(i59), interfaceC0252Mo973.getLong(i60), AbstractC2552.m4797(interfaceC0252Mo973.getBlob(i61))), i33, iM47910, j14, j15, j16, j17, z6, iM4797, i43, i45, j18, i48, i50, strMo5311, boolValueOf2));
                        iM86163 = i56;
                        iM86140 = i40;
                        iM86155 = i46;
                        iM86162 = i55;
                        iM86168 = i61;
                        iM86167 = i60;
                        iM86165 = i58;
                        iM86148 = i31;
                        iM86137 = i35;
                        iM86138 = i34;
                        iM86139 = i39;
                        iM86151 = i38;
                        iM86154 = i44;
                        iM86156 = i47;
                        iM86157 = i49;
                        iM86158 = i51;
                        iM86159 = i52;
                        iM86160 = i53;
                        iM86161 = i54;
                        iM86136 = i37;
                        iM86150 = i36;
                        iM86149 = i32;
                        break;
                    }
                    return arrayList2;
                } finally {
                    interfaceC0252Mo973.close();
                }
            case 24:
                return m6927(obj);
            case 25:
                return m6925(obj);
            case 26:
                InterfaceC0252 interfaceC0252Mo974 = ((InterfaceC3879) obj).mo971("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(interfaceC0252Mo974.mo533() ? (int) interfaceC0252Mo974.getLong(0) : 0);
                } finally {
                    interfaceC0252Mo974.close();
                }
            case 27:
                InterfaceC0252 interfaceC0252Mo975 = ((InterfaceC3879) obj).mo971("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (interfaceC0252Mo975.mo533() && ((int) interfaceC0252Mo975.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    interfaceC0252Mo975.close();
                }
            case 28:
                return m6926(obj);
            default:
                InterfaceC3879 interfaceC3879 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo976 = interfaceC3879.mo971("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    interfaceC0252Mo976.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC3879));
                } finally {
                    interfaceC0252Mo976.close();
                }
        }
    }
}
