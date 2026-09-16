package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: ۥؘؒؓۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0253 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f940;

    public /* synthetic */ C0253(int i) {
        this.f940 = i;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        C1327 c1327;
        C2331 c2331;
        int i = 0;
        C0553 c0553 = null;
        c2458 = null;
        C2458 c2458 = null;
        c0780 = null;
        C0780 c0780 = null;
        c0894 = null;
        C0894 c0894 = null;
        c4433 = null;
        C4433 c4433 = null;
        c0553 = null;
        C0553 c0554 = null;
        c0477 = null;
        C0477 c0477 = null;
        c0917 = null;
        C0917 c0917 = null;
        c0917 = null;
        C0917 c0918 = null;
        c0553 = null;
        switch (this.f940) {
            case 0:
                return obj;
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) AbstractC0539.f1918.f7785;
                Boolean bool = Boolean.FALSE;
                C0553 c0555 = (AbstractC3831.m6874(obj2, bool) || obj2 == null) ? null : (C0553) interfaceC4745.mo211(obj2);
                Object obj3 = list.get(1);
                C0553 c0556 = (AbstractC3831.m6874(obj3, bool) || obj3 == null) ? null : (C0553) interfaceC4745.mo211(obj3);
                Object obj4 = list.get(2);
                C0553 c0557 = (AbstractC3831.m6874(obj4, bool) || obj4 == null) ? null : (C0553) interfaceC4745.mo211(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC3831.m6874(obj5, bool) && obj5 != null) {
                    c0553 = (C0553) interfaceC4745.mo211(obj5);
                }
                return new C0917(c0555, c0556, c0557, c0553);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC3831.m6874(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((InterfaceC4745) AbstractC0539.f1919.f7785).mo211(obj6);
                Object obj7 = list2.get(0);
                return new C1249(list3, obj7 != null ? (String) obj7 : null);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1690(((Integer) obj).intValue());
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                List list4 = (List) obj;
                return new C5647(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C3970[] c3970Arr = C5023.f16621;
                InterfaceC4745 interfaceC4746 = AbstractC0539.f1932.f5507;
                Boolean bool2 = Boolean.FALSE;
                AbstractC3831.m6874(obj8, bool2);
                long j = (obj8 != null ? (C5023) interfaceC4746.mo211(obj8) : null).f16622;
                Object obj9 = list5.get(1);
                AbstractC3831.m6874(obj9, bool2);
                return new C4755(j, (obj9 != null ? (C5023) interfaceC4746.mo211(obj9) : null).f16622);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1626(((Integer) obj).intValue());
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C3917(((Float) obj).floatValue());
            case 8:
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                int iIntValue = (obj10 != null ? (Integer) obj10 : null).intValue();
                Object obj11 = list6.get(1);
                return new C3346(AbstractC2765.m5145(iIntValue, (obj11 != null ? (Integer) obj11 : null).intValue()));
            case 9:
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = C1327.f4593;
                Boolean bool3 = Boolean.FALSE;
                AbstractC3831.m6874(obj12, bool3);
                if (obj12 != null) {
                    c1327 = AbstractC3831.m6874(obj12, Boolean.FALSE) ? new C1327(C1327.f4591) : new C1327(AbstractC4225.m7468(((Integer) obj12).intValue()));
                } else {
                    c1327 = null;
                }
                long j2 = c1327.f4595;
                Object obj13 = list7.get(1);
                C1654 c1654 = AbstractC0539.f1925;
                AbstractC3831.m6874(obj13, bool3);
                long j3 = (obj13 != null ? (C1553) c1654.f5507.mo211(obj13) : null).f5241;
                Object obj14 = list7.get(2);
                return new C5906(j2, j3, (obj14 != null ? (Float) obj14 : null).floatValue());
            case 10:
                return new C4202(((Integer) obj).intValue());
            case 11:
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str = obj15 != null ? (String) obj15 : null;
                Object obj16 = list8.get(1);
                C2346 c2346 = AbstractC0539.f1928;
                if (!AbstractC3831.m6874(obj16, Boolean.FALSE) && obj16 != null) {
                    c0918 = (C0917) ((InterfaceC4745) c2346.f7785).mo211(obj16);
                }
                return new C0780(str, c0918);
            case 12:
                return new C4740(((Integer) obj).intValue());
            case 13:
                return new C1723(((Integer) obj).intValue());
            case 14:
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i < size) {
                    Object obj17 = list9.get(i);
                    arrayList.add((AbstractC3831.m6874(obj17, Boolean.FALSE) || obj17 == null) ? null : (C2331) ((InterfaceC4745) AbstractC0539.f1917.f7785).mo211(obj17));
                    i++;
                }
                return arrayList;
            case 15:
                return new C5827(((Integer) obj).intValue());
            case 16:
                return new C2848(((Integer) obj).intValue());
            case 17:
                Boolean bool4 = Boolean.FALSE;
                if (AbstractC3831.m6874(obj, bool4)) {
                    return new C5023(C5023.f16620);
                }
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                float fFloatValue = (obj18 != null ? (Float) obj18 : null).floatValue();
                Object obj19 = list10.get(1);
                C1654 c1655 = AbstractC0539.f1916;
                AbstractC3831.m6874(obj19, bool4);
                return new C5023(AbstractC4489.m7799(fFloatValue, (obj19 != null ? (C3970) c1655.f5507.mo211(obj19) : null).f13273));
            case 18:
                if (AbstractC3831.m6874(obj, 0)) {
                    return new C3970(8589934592L);
                }
                return AbstractC3831.m6874(obj, 1) ? new C3970(4294967296L) : new C3970(0L);
            case 19:
                if (AbstractC3831.m6874(obj, Boolean.FALSE)) {
                    return new C1553(9205357640488583168L);
                }
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                float fFloatValue2 = (obj20 != null ? (Float) obj20 : null).floatValue();
                Object obj21 = list11.get(1);
                return new C1553((((long) Float.floatToRawIntBits((obj21 != null ? (Float) obj21 : null).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 20:
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    arrayList2.add((AbstractC3831.m6874(obj22, Boolean.FALSE) || obj22 == null) ? null : (C0620) ((InterfaceC4745) AbstractC0539.f1906.f7785).mo211(obj22));
                    i++;
                }
                return new C5668(arrayList2);
            case 21:
                String str2 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                if (AbstractC3831.m6874(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str2 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C0620(localeForLanguageTag);
            case 22:
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str3 = obj23 != null ? (String) obj23 : null;
                Object obj24 = list13.get(1);
                C2346 c2347 = AbstractC0539.f1928;
                if (!AbstractC3831.m6874(obj24, Boolean.FALSE) && obj24 != null) {
                    c0917 = (C0917) ((InterfaceC4745) c2347.f7785).mo211(obj24);
                }
                return new C2458(str3, c0917);
            case 23:
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f = C5830.f19206;
                C1654 c1656 = AbstractC0539.f1920;
                Boolean bool5 = Boolean.FALSE;
                AbstractC3831.m6874(obj25, bool5);
                float f2 = (obj25 != null ? (C5830) c1656.f5507.mo211(obj25) : null).f19208;
                Object obj26 = list14.get(1);
                C1654 c1657 = AbstractC0539.f1908;
                AbstractC3831.m6874(obj26, bool5);
                int i3 = (obj26 != null ? (C5317) c1657.f5507.mo211(obj26) : null).f17504;
                Object obj27 = list14.get(2);
                C1654 c1658 = AbstractC0539.f1927;
                AbstractC3831.m6874(obj27, bool5);
                return new C1220(f2, i3, (obj27 != null ? (C1200) c1658.f5507.mo211(obj27) : null).f4135);
            case 24:
                float fFloatValue3 = ((Float) obj).floatValue();
                C5830.m9640(fFloatValue3);
                return new C5830(fFloatValue3);
            case 25:
                return new C5317(((Integer) obj).intValue());
            case 26:
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                EnumC1048 enumC1048 = obj28 != null ? (EnumC1048) obj28 : null;
                Object obj29 = list15.get(2);
                int iIntValue2 = (obj29 != null ? (Integer) obj29 : null).intValue();
                Object obj30 = list15.get(3);
                int iIntValue3 = (obj30 != null ? (Integer) obj30 : null).intValue();
                Object obj31 = list15.get(4);
                String str4 = obj31 != null ? (String) obj31 : null;
                switch (enumC1048.ordinal()) {
                    case 0:
                        Object obj32 = list15.get(1);
                        C2346 c2348 = AbstractC0539.f1930;
                        if (!AbstractC3831.m6874(obj32, Boolean.FALSE) && obj32 != null) {
                            c0477 = (C0477) ((InterfaceC4745) c2348.f7785).mo211(obj32);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c0477, str4);
                        break;
                    case 1:
                        Object obj33 = list15.get(1);
                        C2346 c2349 = AbstractC0539.f1918;
                        if (!AbstractC3831.m6874(obj33, Boolean.FALSE) && obj33 != null) {
                            c0554 = (C0553) ((InterfaceC4745) c2349.f7785).mo211(obj33);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c0554, str4);
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj34 = list15.get(1);
                        C2346 c23410 = AbstractC0539.f1907;
                        if (!AbstractC3831.m6874(obj34, Boolean.FALSE) && obj34 != null) {
                            c4433 = (C4433) ((InterfaceC4745) c23410.f7785).mo211(obj34);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c4433, str4);
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj35 = list15.get(1);
                        C2346 c23411 = AbstractC0539.f1921;
                        if (!AbstractC3831.m6874(obj35, Boolean.FALSE) && obj35 != null) {
                            c0894 = (C0894) ((InterfaceC4745) c23411.f7785).mo211(obj35);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c0894, str4);
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        Object obj36 = list15.get(1);
                        C2346 c23412 = AbstractC0539.f1910;
                        if (!AbstractC3831.m6874(obj36, Boolean.FALSE) && obj36 != null) {
                            c0780 = (C0780) ((InterfaceC4745) c23412.f7785).mo211(obj36);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c0780, str4);
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        Object obj37 = list15.get(1);
                        C2346 c23413 = AbstractC0539.f1911;
                        if (!AbstractC3831.m6874(obj37, Boolean.FALSE) && obj37 != null) {
                            c2458 = (C2458) ((InterfaceC4745) c23413.f7785).mo211(obj37);
                        }
                        c2331 = new C2331(iIntValue2, iIntValue3, c2458, str4);
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj38 = list15.get(1);
                        c2331 = new C2331(iIntValue2, iIntValue3, new C3435(obj38 != null ? (String) obj38 : null), str4);
                        break;
                    default:
                        C1078.m2275();
                        return null;
                }
                return c2331;
            case 27:
                return new C1200(((Integer) obj).intValue());
            case 28:
                return new C4433(obj != null ? (String) obj : null);
            default:
                return new C0894(obj != null ? (String) obj : null);
        }
    }
}
