package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۨؒؖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5860 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ long f19353;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f19354;

    public /* synthetic */ C5860(long j, int i) {
        this.f19354 = i;
        this.f19353 = j;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        C2600 c2600;
        Object c4535;
        InterfaceC0252 interfaceC0252;
        int i = this.f19354;
        C2358 c2358 = C2358.f7817;
        long j = this.f19353;
        switch (i) {
            case 0:
                C5665 c5665 = (C5665) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c5665.f18635.mo2766() >> 32)) / 2.0f;
                return c5665.m9489(new C3670(fIntBitsToFloat, C4773.m8122(c5665, fIntBitsToFloat), new C1516(j, 5)));
            case 1:
                C5367 c5367 = (C5367) obj;
                InterfaceC4745 interfaceC4745 = c5367.f17699;
                if (interfaceC4745 != null && (c2600 = c5367.f17700) != null) {
                    try {
                        c4535 = interfaceC4745.mo211(Long.valueOf(j));
                    } catch (Throwable th) {
                        c4535 = new C4535(th);
                    }
                    c2600.mo335(c4535);
                    break;
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((InterfaceC1066) obj).mo2266(AbstractC1154.f4008, new C3982(EnumC2925.f9840, this.f19353, 2, true));
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C1337) obj).m2852(C3134.f10551, Long.valueOf(j));
                return null;
            default:
                InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    interfaceC0252Mo971.mo532(j, 1);
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
                        int i2 = iM8613;
                        ArrayList arrayList2 = arrayList;
                        EnumC4972 enumC4972M4802 = AbstractC2552.m4802((int) interfaceC0252Mo971.getLong(iM8614));
                        String strMo535 = interfaceC0252Mo971.mo534(iM8615);
                        String strMo536 = interfaceC0252Mo971.mo534(iM8616);
                        byte[] blob = interfaceC0252Mo971.getBlob(iM8617);
                        C2775 c2775 = C2775.f9249;
                        C2775 c2775M2144 = AbstractC0993.m2144(blob);
                        C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo971.getBlob(iM8618));
                        long j2 = interfaceC0252Mo971.getLong(iM8619);
                        long j3 = interfaceC0252Mo971.getLong(iM86110);
                        long j4 = interfaceC0252Mo971.getLong(iM86111);
                        int i3 = (int) interfaceC0252Mo971.getLong(iM86112);
                        int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo971.getLong(iM86113));
                        long j5 = interfaceC0252Mo971.getLong(iM86114);
                        long j6 = interfaceC0252Mo971.getLong(iM86115);
                        long j7 = interfaceC0252Mo971.getLong(iM86116);
                        int i4 = iM86117;
                        long j8 = interfaceC0252Mo971.getLong(i4);
                        int i5 = iM8614;
                        int i6 = iM86118;
                        int i7 = iM8615;
                        boolean z = ((int) interfaceC0252Mo971.getLong(i6)) != 0;
                        int i8 = iM86119;
                        int i9 = iM8616;
                        int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo971.getLong(i8));
                        int i10 = iM86120;
                        int i11 = (int) interfaceC0252Mo971.getLong(i10);
                        int i12 = iM86121;
                        int i13 = (int) interfaceC0252Mo971.getLong(i12);
                        int i14 = iM86122;
                        long j9 = interfaceC0252Mo971.getLong(i14);
                        int i15 = iM86116;
                        int i16 = iM86123;
                        int i17 = (int) interfaceC0252Mo971.getLong(i16);
                        int i18 = iM86124;
                        int i19 = (int) interfaceC0252Mo971.getLong(i18);
                        int i20 = iM86125;
                        String strMo537 = interfaceC0252Mo971.isNull(i20) ? null : interfaceC0252Mo971.mo534(i20);
                        int i21 = iM86126;
                        Integer numValueOf = interfaceC0252Mo971.isNull(i21) ? null : Integer.valueOf((int) interfaceC0252Mo971.getLong(i21));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i22 = iM86127;
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
                        interfaceC0252 = interfaceC0252Mo971;
                        try {
                            arrayList2.add(new C4142(strMo534, enumC4972M4802, strMo535, strMo536, c2775M2144, c2775M2145, j2, j3, j4, new C4628(c3783M4809, iM4800, z2, z3, z4, ((int) interfaceC0252Mo971.getLong(i27)) != 0, interfaceC0252Mo971.getLong(i28), interfaceC0252Mo971.getLong(i29), AbstractC2552.m4797(interfaceC0252Mo971.getBlob(i30))), i3, iM4799, j5, j6, j7, j8, z, iM4796, i11, i13, j9, i17, i19, strMo537, boolValueOf));
                            iM86134 = i29;
                            iM86116 = i15;
                            iM86122 = i14;
                            iM86124 = i18;
                            iM86126 = i21;
                            arrayList = arrayList2;
                            iM86132 = i27;
                            interfaceC0252Mo971 = interfaceC0252;
                            iM8614 = i5;
                            iM86133 = i28;
                            iM86117 = i4;
                            iM8616 = i9;
                            iM86119 = i8;
                            iM86121 = i12;
                            iM86123 = i16;
                            iM86125 = i20;
                            iM8613 = i2;
                            iM86130 = i25;
                            iM8615 = i7;
                            iM86118 = i6;
                            iM86120 = i10;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC0252.close();
                            throw th;
                        }
                        break;
                    }
                    InterfaceC0252 interfaceC0253 = interfaceC0252Mo971;
                    ArrayList arrayList3 = arrayList;
                    interfaceC0253.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC0252 = interfaceC0252Mo971;
                }
                break;
        }
    }
}
