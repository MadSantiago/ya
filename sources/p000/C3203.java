package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؓۡ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3203 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f10748;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10749;

    public /* synthetic */ C3203(int i, String str) {
        this.f10749 = i;
        this.f10748 = str;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0189  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        boolean z;
        boolean z2;
        Long lValueOf;
        C4142 c4142;
        EnumC4972 enumC4972M4802;
        int i = this.f10749;
        C2358 c2358 = C2358.f7817;
        String str = this.f10748;
        switch (i) {
            case 0:
                InterfaceC1066 interfaceC1066 = (InterfaceC1066) obj;
                InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
                C3059 c3059 = AbstractC2771.f9229;
                InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
                InterfaceC0504 interfaceC0504 = interfaceC0504Arr2[3];
                interfaceC1066.mo2266(c3059, new C5178());
                C3059 c30510 = AbstractC2771.f9216;
                InterfaceC0504 interfaceC0505 = interfaceC0504Arr2[2];
                interfaceC1066.mo2266(c30510, str);
                return c2358;
            case 1:
                InterfaceC0504[] interfaceC0504Arr3 = AbstractC3992.f13322;
                C3059 c30511 = AbstractC2771.f9216;
                InterfaceC0504 interfaceC0506 = AbstractC3992.f13322[2];
                ((InterfaceC1066) obj).mo2266(c30511, str);
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC0252Mo971.mo530(1, str);
                    if (interfaceC0252Mo971.mo533()) {
                        z = false;
                        if (((int) interfaceC0252Mo971.getLong(0)) != 0) {
                            z2 = true;
                        }
                        interfaceC0252Mo971.close();
                        return Boolean.valueOf(z2);
                    }
                    z = false;
                    z2 = z;
                    interfaceC0252Mo971.close();
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    interfaceC0252Mo971.close();
                    throw th;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0252 interfaceC0252Mo972 = ((InterfaceC3879) obj).mo971("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC0252Mo972.mo530(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC0252Mo972.mo533()) {
                        arrayList.add(interfaceC0252Mo972.mo534(0));
                    }
                    interfaceC0252Mo972.close();
                    return arrayList;
                } catch (Throwable th2) {
                    interfaceC0252Mo972.close();
                    throw th2;
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                InterfaceC0252 interfaceC0252Mo973 = ((InterfaceC3879) obj).mo971("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    interfaceC0252Mo973.mo530(1, str);
                    return Boolean.valueOf(interfaceC0252Mo973.mo533() && ((int) interfaceC0252Mo973.getLong(0)) != 0);
                } finally {
                    interfaceC0252Mo973.close();
                }
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC1066 interfaceC1067 = (InterfaceC1066) obj;
                InterfaceC0504[] interfaceC0504Arr4 = AbstractC3992.f13322;
                C3059 c30512 = AbstractC2771.f9216;
                InterfaceC0504[] interfaceC0504Arr5 = AbstractC3992.f13322;
                InterfaceC0504 interfaceC0507 = interfaceC0504Arr5[2];
                interfaceC1067.mo2266(c30512, str);
                C3059 c30513 = AbstractC2771.f9226;
                InterfaceC0504 interfaceC0508 = interfaceC0504Arr5[11];
                interfaceC1067.mo2266(c30513, Float.valueOf(0.0f));
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0252 interfaceC0252Mo974 = ((InterfaceC3879) obj).mo971("SELECT long_value FROM Preference where `key`=?");
                try {
                    interfaceC0252Mo974.mo530(1, str);
                    if (interfaceC0252Mo974.mo533() && !interfaceC0252Mo974.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC0252Mo974.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    interfaceC0252Mo974.close();
                }
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                String str2 = (String) obj;
                if (AbstractC0684.m1534(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return str.concat(str2);
            case 8:
                InterfaceC0252 interfaceC0252Mo975 = ((InterfaceC3879) obj).mo971("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    interfaceC0252Mo975.mo530(1, str);
                    interfaceC0252Mo975.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo975.close();
                }
            case 9:
                InterfaceC0252 interfaceC0252Mo976 = ((InterfaceC3879) obj).mo971("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    interfaceC0252Mo976.mo530(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC0252Mo976.mo533()) {
                        arrayList2.add(interfaceC0252Mo976.mo534(0));
                    }
                    interfaceC0252Mo976.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    interfaceC0252Mo976.close();
                    throw th3;
                }
            case 10:
                InterfaceC0252 interfaceC0252Mo977 = ((InterfaceC3879) obj).mo971("DELETE from WorkProgress where work_spec_id=?");
                try {
                    interfaceC0252Mo977.mo530(1, str);
                    interfaceC0252Mo977.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo977.close();
                }
            case 11:
                InterfaceC0252 interfaceC0252Mo978 = ((InterfaceC3879) obj).mo971("SELECT * FROM workspec WHERE id=?");
                try {
                    interfaceC0252Mo978.mo530(1, str);
                    int iM8613 = C5063.m8613(interfaceC0252Mo978, "id");
                    int iM8614 = C5063.m8613(interfaceC0252Mo978, "state");
                    int iM8615 = C5063.m8613(interfaceC0252Mo978, "worker_class_name");
                    int iM8616 = C5063.m8613(interfaceC0252Mo978, "input_merger_class_name");
                    int iM8617 = C5063.m8613(interfaceC0252Mo978, "input");
                    int iM8618 = C5063.m8613(interfaceC0252Mo978, "output");
                    int iM8619 = C5063.m8613(interfaceC0252Mo978, "initial_delay");
                    int iM86110 = C5063.m8613(interfaceC0252Mo978, "interval_duration");
                    int iM86111 = C5063.m8613(interfaceC0252Mo978, "flex_duration");
                    int iM86112 = C5063.m8613(interfaceC0252Mo978, "run_attempt_count");
                    int iM86113 = C5063.m8613(interfaceC0252Mo978, "backoff_policy");
                    int iM86114 = C5063.m8613(interfaceC0252Mo978, "backoff_delay_duration");
                    int iM86115 = C5063.m8613(interfaceC0252Mo978, "last_enqueue_time");
                    int iM86116 = C5063.m8613(interfaceC0252Mo978, "minimum_retention_duration");
                    int iM86117 = C5063.m8613(interfaceC0252Mo978, "schedule_requested_at");
                    int iM86118 = C5063.m8613(interfaceC0252Mo978, "run_in_foreground");
                    int iM86119 = C5063.m8613(interfaceC0252Mo978, "out_of_quota_policy");
                    int iM86120 = C5063.m8613(interfaceC0252Mo978, "period_count");
                    int iM86121 = C5063.m8613(interfaceC0252Mo978, "generation");
                    int iM86122 = C5063.m8613(interfaceC0252Mo978, "next_schedule_time_override");
                    int iM86123 = C5063.m8613(interfaceC0252Mo978, "next_schedule_time_override_generation");
                    int iM86124 = C5063.m8613(interfaceC0252Mo978, "stop_reason");
                    int iM86125 = C5063.m8613(interfaceC0252Mo978, "trace_tag");
                    int iM86126 = C5063.m8613(interfaceC0252Mo978, "backoff_on_system_interruptions");
                    int iM86127 = C5063.m8613(interfaceC0252Mo978, "required_network_type");
                    int iM86128 = C5063.m8613(interfaceC0252Mo978, "required_network_request");
                    int iM86129 = C5063.m8613(interfaceC0252Mo978, "requires_charging");
                    int iM86130 = C5063.m8613(interfaceC0252Mo978, "requires_device_idle");
                    int iM86131 = C5063.m8613(interfaceC0252Mo978, "requires_battery_not_low");
                    int iM86132 = C5063.m8613(interfaceC0252Mo978, "requires_storage_not_low");
                    int iM86133 = C5063.m8613(interfaceC0252Mo978, "trigger_content_update_delay");
                    int iM86134 = C5063.m8613(interfaceC0252Mo978, "trigger_max_content_delay");
                    int iM86135 = C5063.m8613(interfaceC0252Mo978, "content_uri_triggers");
                    if (interfaceC0252Mo978.mo533()) {
                        String strMo534 = interfaceC0252Mo978.mo534(iM8613);
                        EnumC4972 enumC4972M4803 = AbstractC2552.m4802((int) interfaceC0252Mo978.getLong(iM8614));
                        String strMo535 = interfaceC0252Mo978.mo534(iM8615);
                        String strMo536 = interfaceC0252Mo978.mo534(iM8616);
                        byte[] blob = interfaceC0252Mo978.getBlob(iM8617);
                        C2775 c2775 = C2775.f9249;
                        C2775 c2775M2144 = AbstractC0993.m2144(blob);
                        C2775 c2775M2145 = AbstractC0993.m2144(interfaceC0252Mo978.getBlob(iM8618));
                        long j = interfaceC0252Mo978.getLong(iM8619);
                        long j2 = interfaceC0252Mo978.getLong(iM86110);
                        long j3 = interfaceC0252Mo978.getLong(iM86111);
                        int i2 = (int) interfaceC0252Mo978.getLong(iM86112);
                        int iM4799 = AbstractC2552.m4799((int) interfaceC0252Mo978.getLong(iM86113));
                        long j4 = interfaceC0252Mo978.getLong(iM86114);
                        long j5 = interfaceC0252Mo978.getLong(iM86115);
                        long j6 = interfaceC0252Mo978.getLong(iM86116);
                        long j7 = interfaceC0252Mo978.getLong(iM86117);
                        boolean z3 = ((int) interfaceC0252Mo978.getLong(iM86118)) != 0;
                        int iM4796 = AbstractC2552.m4796((int) interfaceC0252Mo978.getLong(iM86119));
                        int i3 = (int) interfaceC0252Mo978.getLong(iM86120);
                        int i4 = (int) interfaceC0252Mo978.getLong(iM86121);
                        long j8 = interfaceC0252Mo978.getLong(iM86122);
                        int i5 = (int) interfaceC0252Mo978.getLong(iM86123);
                        int i6 = (int) interfaceC0252Mo978.getLong(iM86124);
                        String strMo537 = interfaceC0252Mo978.isNull(iM86125) ? null : interfaceC0252Mo978.mo534(iM86125);
                        Integer numValueOf = interfaceC0252Mo978.isNull(iM86126) ? null : Integer.valueOf((int) interfaceC0252Mo978.getLong(iM86126));
                        c4142 = new C4142(strMo534, enumC4972M4803, strMo535, strMo536, c2775M2144, c2775M2145, j, j2, j3, new C4628(AbstractC2552.m4809(interfaceC0252Mo978.getBlob(iM86128)), AbstractC2552.m4800((int) interfaceC0252Mo978.getLong(iM86127)), ((int) interfaceC0252Mo978.getLong(iM86129)) != 0, ((int) interfaceC0252Mo978.getLong(iM86130)) != 0, ((int) interfaceC0252Mo978.getLong(iM86131)) != 0, ((int) interfaceC0252Mo978.getLong(iM86132)) != 0, interfaceC0252Mo978.getLong(iM86133), interfaceC0252Mo978.getLong(iM86134), AbstractC2552.m4797(interfaceC0252Mo978.getBlob(iM86135))), i2, iM4799, j4, j5, j6, j7, z3, iM4796, i3, i4, j8, i5, i6, strMo537, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        c4142 = null;
                    }
                    return c4142;
                } finally {
                    interfaceC0252Mo978.close();
                }
            case 12:
                InterfaceC0252 interfaceC0252Mo979 = ((InterfaceC3879) obj).mo971("SELECT state FROM workspec WHERE id=?");
                try {
                    interfaceC0252Mo979.mo530(1, str);
                    if (interfaceC0252Mo979.mo533()) {
                        Integer numValueOf2 = interfaceC0252Mo979.isNull(0) ? null : Integer.valueOf((int) interfaceC0252Mo979.getLong(0));
                        if (numValueOf2 != null) {
                            enumC4972M4802 = AbstractC2552.m4802(numValueOf2.intValue());
                        } else {
                            enumC4972M4802 = null;
                        }
                        break;
                    } else {
                        enumC4972M4802 = null;
                    }
                    return enumC4972M4802;
                } finally {
                    interfaceC0252Mo979.close();
                }
            case 13:
                InterfaceC0252 interfaceC0252Mo9710 = ((InterfaceC3879) obj).mo971("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC0252Mo9710.mo530(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC0252Mo9710.mo533()) {
                        arrayList3.add(interfaceC0252Mo9710.mo534(0));
                    }
                    interfaceC0252Mo9710.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    interfaceC0252Mo9710.close();
                    throw th4;
                }
            case 14:
                InterfaceC3879 interfaceC3879 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo9711 = interfaceC3879.mo971("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    interfaceC0252Mo9711.mo530(1, str);
                    interfaceC0252Mo9711.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC3879));
                } finally {
                    interfaceC0252Mo9711.close();
                }
            case 15:
                InterfaceC3879 interfaceC38710 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo9712 = interfaceC38710.mo971("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    interfaceC0252Mo9712.mo530(1, str);
                    interfaceC0252Mo9712.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC38710));
                } finally {
                    interfaceC0252Mo9712.close();
                }
            case 16:
                InterfaceC0252 interfaceC0252Mo9713 = ((InterfaceC3879) obj).mo971("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    interfaceC0252Mo9713.mo530(1, str);
                    interfaceC0252Mo9713.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo9713.close();
                }
            case 17:
                InterfaceC0252 interfaceC0252Mo9714 = ((InterfaceC3879) obj).mo971("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    interfaceC0252Mo9714.mo530(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (interfaceC0252Mo9714.mo533()) {
                        byte[] blob2 = interfaceC0252Mo9714.getBlob(0);
                        C2775 c2776 = C2775.f9249;
                        arrayList4.add(AbstractC0993.m2144(blob2));
                    }
                    interfaceC0252Mo9714.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    interfaceC0252Mo9714.close();
                    throw th5;
                }
            case 18:
                InterfaceC3879 interfaceC38711 = (InterfaceC3879) obj;
                InterfaceC0252 interfaceC0252Mo9715 = interfaceC38711.mo971("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    interfaceC0252Mo9715.mo530(1, str);
                    interfaceC0252Mo9715.mo533();
                    return Integer.valueOf(C3133.m5787(interfaceC38711));
                } finally {
                    interfaceC0252Mo9715.close();
                }
            case 19:
                InterfaceC0252 interfaceC0252Mo9716 = ((InterfaceC3879) obj).mo971("DELETE FROM workspec WHERE id=?");
                try {
                    interfaceC0252Mo9716.mo530(1, str);
                    interfaceC0252Mo9716.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo9716.close();
                }
            case 20:
                InterfaceC0252 interfaceC0252Mo9717 = ((InterfaceC3879) obj).mo971("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC0252Mo9717.mo530(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (interfaceC0252Mo9717.mo533()) {
                        String strMo538 = interfaceC0252Mo9717.mo534(0);
                        EnumC4972 enumC4972M4804 = AbstractC2552.m4802((int) interfaceC0252Mo9717.getLong(1));
                        C1883 c1883 = new C1883();
                        c1883.f6253 = strMo538;
                        c1883.f6252 = enumC4972M4804;
                        arrayList5.add(c1883);
                    }
                    interfaceC0252Mo9717.close();
                    return arrayList5;
                } catch (Throwable th6) {
                    interfaceC0252Mo9717.close();
                    throw th6;
                }
            default:
                InterfaceC0252 interfaceC0252Mo9718 = ((InterfaceC3879) obj).mo971("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    interfaceC0252Mo9718.mo530(1, str);
                    ArrayList arrayList6 = new ArrayList();
                    while (interfaceC0252Mo9718.mo533()) {
                        arrayList6.add(interfaceC0252Mo9718.mo534(0));
                    }
                    interfaceC0252Mo9718.close();
                    return arrayList6;
                } catch (Throwable th7) {
                    interfaceC0252Mo9718.close();
                    throw th7;
                }
        }
    }
}
