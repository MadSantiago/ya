package p000;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦٕٖؒٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4215 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13992;

    public /* synthetic */ C4215(int i) {
        this.f13992 = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        Object objM1972;
        Object obj2;
        int i = this.f13992;
        C2309 c2309 = null;
        c1857 = null;
        C1857 c1857 = null;
        c5906 = null;
        C5906 c5906 = null;
        c2309 = null;
        boolean z = false;
        int i2 = 1;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                List list = (List) obj;
                Object obj3 = list.get(0);
                C1654 c1654 = AbstractC0539.f1912;
                Boolean bool = Boolean.FALSE;
                AbstractC3831.m6874(obj3, bool);
                int i3 = (obj3 != null ? (C4202) c1654.f5507.mo211(obj3) : null).f13960;
                Object obj4 = list.get(1);
                C1654 c1655 = AbstractC0539.f1913;
                AbstractC3831.m6874(obj4, bool);
                int i4 = (obj4 != null ? (C4740) c1655.f5507.mo211(obj4) : null).f15639;
                Object obj5 = list.get(2);
                C3970[] c3970Arr = C5023.f16621;
                C1654 c1656 = AbstractC0539.f1932;
                AbstractC3831.m6874(obj5, bool);
                long j = (obj5 != null ? (C5023) c1656.f5507.mo211(obj5) : null).f16622;
                Object obj6 = list.get(3);
                C4755 c4755 = C4755.f15694;
                C4755 c4756 = (AbstractC3831.m6874(obj6, bool) || obj6 == null) ? null : (C4755) ((InterfaceC4745) AbstractC0539.f1922.f7785).mo211(obj6);
                Object obj7 = list.get(4);
                C0823 c0823 = (AbstractC3831.m6874(obj7, bool) || obj7 == null) ? null : (C0823) ((InterfaceC4745) AbstractC4489.f14844.f7785).mo211(obj7);
                Object obj8 = list.get(5);
                C1220 c1220 = C1220.f4210;
                C1220 c1221 = (AbstractC3831.m6874(obj8, bool) || obj8 == null) ? null : (C1220) ((InterfaceC4745) AbstractC0539.f1905.f7785).mo211(obj8);
                Object obj9 = list.get(6);
                int i5 = ((AbstractC3831.m6874(obj9, bool) || obj9 == null) ? null : (C2591) ((InterfaceC4745) AbstractC4489.f14846.f7785).mo211(obj9)).f8654;
                Object obj10 = list.get(7);
                C1654 c1657 = AbstractC0539.f1909;
                AbstractC3831.m6874(obj10, bool);
                int i6 = (obj10 != null ? (C1723) c1657.f5507.mo211(obj10) : null).f5745;
                Object obj11 = list.get(8);
                C2346 c2346 = AbstractC4489.f14862;
                if (!AbstractC3831.m6874(obj11, bool) && obj11 != null) {
                    c2309 = (C2309) ((InterfaceC4745) c2346.f7785).mo211(obj11);
                }
                return new C0477(i3, i4, j, c4756, c0823, c1221, i5, i6, c2309);
            case 1:
                List list2 = (List) obj;
                Object obj12 = list2.get(0);
                int i7 = C1327.f4593;
                Boolean bool2 = Boolean.FALSE;
                AbstractC3831.m6874(obj12, bool2);
                long j2 = (obj12 != null ? AbstractC3831.m6874(obj12, Boolean.FALSE) ? new C1327(C1327.f4591) : new C1327(AbstractC4225.m7468(((Integer) obj12).intValue())) : null).f4595;
                Object obj13 = list2.get(1);
                C3970[] c3970Arr2 = C5023.f16621;
                InterfaceC4745 interfaceC4745 = AbstractC0539.f1932.f5507;
                AbstractC3831.m6874(obj13, bool2);
                long j3 = (obj13 != null ? (C5023) interfaceC4745.mo211(obj13) : null).f16622;
                Object obj14 = list2.get(2);
                C1626 c1626 = C1626.f5443;
                C1626 c1627 = (AbstractC3831.m6874(obj14, bool2) || obj14 == null) ? null : (C1626) ((InterfaceC4745) AbstractC0539.f1923.f7785).mo211(obj14);
                Object obj15 = list2.get(3);
                C5827 c5827 = (AbstractC3831.m6874(obj15, bool2) || obj15 == null) ? null : (C5827) ((InterfaceC4745) AbstractC0539.f1914.f7785).mo211(obj15);
                Object obj16 = list2.get(4);
                C2848 c2848 = (AbstractC3831.m6874(obj16, bool2) || obj16 == null) ? null : (C2848) ((InterfaceC4745) AbstractC0539.f1926.f7785).mo211(obj16);
                Object obj17 = list2.get(6);
                String str = obj17 != null ? (String) obj17 : null;
                Object obj18 = list2.get(7);
                AbstractC3831.m6874(obj18, bool2);
                long j4 = (obj18 != null ? (C5023) interfaceC4745.mo211(obj18) : null).f16622;
                Object obj19 = list2.get(8);
                C3917 c3917 = (AbstractC3831.m6874(obj19, bool2) || obj19 == null) ? null : (C3917) ((InterfaceC4745) AbstractC0539.f1931.f7785).mo211(obj19);
                Object obj20 = list2.get(9);
                C5647 c5647 = (AbstractC3831.m6874(obj20, bool2) || obj20 == null) ? null : (C5647) ((InterfaceC4745) AbstractC0539.f1929.f7785).mo211(obj20);
                Object obj21 = list2.get(10);
                C5668 c5668 = C5668.f18644;
                C5668 c5669 = (AbstractC3831.m6874(obj21, bool2) || obj21 == null) ? null : (C5668) ((InterfaceC4745) AbstractC0539.f1915.f7785).mo211(obj21);
                Object obj22 = list2.get(11);
                AbstractC3831.m6874(obj22, bool2);
                long j5 = (obj22 != null ? AbstractC3831.m6874(obj22, Boolean.FALSE) ? new C1327(C1327.f4591) : new C1327(AbstractC4225.m7468(((Integer) obj22).intValue())) : null).f4595;
                Object obj23 = list2.get(12);
                C1690 c1690 = (AbstractC3831.m6874(obj23, bool2) || obj23 == null) ? null : (C1690) ((InterfaceC4745) AbstractC0539.f1924.f7785).mo211(obj23);
                Object obj24 = list2.get(13);
                C5906 c5907 = C5906.f19486;
                C2346 c2347 = AbstractC0539.f1934;
                if (!AbstractC3831.m6874(obj24, bool2) && obj24 != null) {
                    c5906 = (C5906) ((InterfaceC4745) c2347.f7785).mo211(obj24);
                }
                return new C0553(j2, j3, c1627, c5827, c2848, (AbstractC0903) null, str, j4, c3917, c5647, c5669, j5, c1690, c5906, 49184);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list3 = (List) obj;
                Object obj25 = list3.get(0);
                boolean zBooleanValue = (obj25 != null ? (Boolean) obj25 : null).booleanValue();
                Object obj26 = list3.get(1);
                C2346 c2348 = AbstractC4489.f14856;
                if (!AbstractC3831.m6874(obj26, Boolean.FALSE) && obj26 != null) {
                    c1857 = (C1857) ((InterfaceC4745) c2348.f7785).mo211(obj26);
                }
                return new C0823(c1857.f6196, zBooleanValue);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1857(((Integer) obj).intValue());
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C2591(((Integer) obj).intValue());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list4 = (List) obj;
                Object obj27 = list4.get(0);
                int i8 = ((AbstractC3831.m6874(obj27, Boolean.FALSE) || obj27 == null) ? null : (C4043) ((InterfaceC4745) AbstractC4489.f14850.f7785).mo211(obj27)).f13484;
                Object obj28 = list4.get(1);
                return new C2309(i8, (obj28 != null ? (Boolean) obj28 : null).booleanValue());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C4043(((Integer) obj).intValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C3751) obj).m6592(null);
                return c2358;
            case 8:
                return new C3945(((Integer) obj).intValue());
            case 9:
                C5407 c5407 = (C5407) obj;
                if (c5407 != null && c5407.f17858 == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 10:
                ((C3751) obj).m6592(null);
                return c2358;
            case 11:
                InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
                ((InterfaceC1066) obj).mo2266(AbstractC2771.f9200, c2358);
                return c2358;
            case 12:
                C1553 c1553 = (C1553) obj;
                long j6 = c1553.f5241;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new C0994(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (c1553.f5241 & 4294967295L))) : AbstractC4382.f14447;
            case 13:
                C0994 c0994 = (C0994) obj;
                return new C1553((((long) Float.floatToRawIntBits(c0994.f3550)) << 32) | (((long) Float.floatToRawIntBits(c0994.f3549)) & 4294967295L));
            case 14:
                C4801 c4801 = (C4801) obj;
                C4801.m8179(c4801, AbstractC5537.f18284);
                C4801.m8179(c4801, AbstractC5537.f18281);
                C4681 c4681 = EnumC3207.f10755;
                c4801.f15839.m6301(c4681.mo624(), new C2963(null, new C4469(c4681, 1), new C0857(802480018, new C1672(c4681, i2), true)));
                C4801.m8179(c4801, AbstractC5537.f18286);
                return c2358;
            case 15:
                C0954 c0954 = (C0954) obj;
                Object objM1970 = c0954.m1970();
                if (!(objM1970 instanceof List)) {
                    objM1970 = null;
                }
                List list5 = (List) objM1970;
                if (list5 != null) {
                    objM1972 = new ArrayList();
                    for (Object obj29 : list5) {
                        C3121 c3121M7163 = AbstractC4009.m7163(obj29);
                        c3121M7163.m5746();
                        C2749 c2749M5747 = c3121M7163.m5747();
                        c2749M5747.f9096 = new C4215(16);
                        C1865 c1865 = (C1865) AbstractC0973.m2058(c2749M5747.m5108());
                        if (c1865 != null) {
                            c1865.m3377();
                            obj2 = c1865.f6208.get(c1865.f10320);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 == null) {
                            C5289.f17420.m3886();
                            return c2358;
                        }
                        if (!obj2.equals(new C4441(new long[]{-3233879902576701909L, -795802170674411979L}).toString())) {
                            objM1972.add(obj29);
                        }
                    }
                } else {
                    objM1972 = c0954.m1972();
                }
                c0954.m1973(objM1972);
                return c2358;
            case 16:
                Class cls = (Class) obj;
                Class<Object> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Object.class));
                if (!AbstractC3831.m6874(cls, clsM9037 != null ? clsM9037 : Object.class)) {
                    Class<String> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(String.class));
                    z = AbstractC3831.m6874(cls, clsM9038 != null ? clsM9038 : String.class);
                }
                return Boolean.valueOf(z);
            case 17:
                ((C2518) obj).m4661(new C4441(new long[]{-3740414619893319120L, -8022849906793708183L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            case 18:
                ((C2518) obj).m4661(new C4441(new long[]{-8240211861860061129L, 6954175947398560566L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            case 19:
                ((C2518) obj).m4661(new C4441(new long[]{-1937782920543754636L, -1335712599608270917L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            case 20:
                ((C2518) obj).m4661(new C4441(new long[]{4751368821047320485L, -8592879142123507475L}).toString(), AbstractC2539.f8442.f5219);
                return c2358;
            case 21:
                return c2358;
            case 22:
                return c2358;
            case 23:
                InterfaceC0504[] interfaceC0504Arr2 = AbstractC3992.f13322;
                C3059 c3059 = AbstractC2771.f9221;
                InterfaceC0504 interfaceC0504 = AbstractC3992.f13322[5];
                ((InterfaceC1066) obj).mo2266(c3059, Boolean.TRUE);
                return c2358;
            case 24:
                return c2358;
            case 25:
                return Boolean.FALSE;
            case 26:
                return Boolean.TRUE;
            case 27:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            case 28:
                InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC0252Mo971.mo533()) {
                        arrayList.add(interfaceC0252Mo971.mo534(0));
                    }
                    interfaceC0252Mo971.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC0252Mo971.close();
                    throw th;
                }
            default:
                return c2358;
        }
    }
}
