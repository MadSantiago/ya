package p000;

import android.content.Context;
import android.content.Intent;
import androidx.compose.p002ui.tooling.PreviewActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦًؚؓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3659 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f12249;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f12250;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f12251;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12252;

    public /* synthetic */ C3659(InterfaceC0705 interfaceC0705, C3635 c3635, C0857 c0857, int i) {
        this.f12252 = 1;
        this.f12251 = interfaceC0705;
        this.f12250 = c3635;
        this.f12249 = c0857;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x020b, please report this as an issue */
    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) throws Exception {
        Object c4535;
        Throwable thM405;
        C5479 c5479M3107;
        int i = this.f12252;
        C4036 c4036 = C2850.f9517;
        int i2 = 0;
        C2358 c2358 = C2358.f7817;
        Object obj3 = this.f12249;
        Object obj4 = this.f12250;
        Object obj5 = this.f12251;
        switch (i) {
            case 0:
                InterfaceC0705 interfaceC0705 = (InterfaceC0705) obj5;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj4;
                C0857 c0857 = (C0857) obj3;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM8999 = c5362.m8999();
                    if (objM8999 == c4036) {
                        objM8999 = new C2136(interfaceC4367, i2);
                        c5362.m8987(objM8999);
                    }
                    InterfaceC0705 interfaceC0705M4198 = AbstractC2164.m4198(interfaceC0705, (InterfaceC4745) objM8999);
                    InterfaceC3228 interfaceC3228M2297 = AbstractC1089.m2297(C1298.f4456, true);
                    int iHashCode = Long.hashCode(c5362.f17657);
                    C2103 c2103M8994 = c5362.m8994();
                    InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705M4198);
                    InterfaceC4576.f15106.getClass();
                    C3709 c3709 = C0849.f3049;
                    c5362.m8983();
                    if (c5362.f17668) {
                        c5362.m9005(c3709);
                    } else {
                        c5362.m8972();
                    }
                    AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228M2297);
                    AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                    AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
                    AbstractC0993.m2146(c5362, C0849.f3050);
                    AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                    c0857.mo219(c5362, 0);
                    c5362.m9009(true);
                } else {
                    c5362.m8982();
                }
                return c2358;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2776.m5224((InterfaceC0705) obj5, (C3635) obj4, (C0857) obj3, (C5362) obj, AbstractC3831.m6835(385));
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj5;
                C2384 c2384 = (C2384) obj4;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj3;
                C5362 c5363 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                new C4441(new long[]{-8528295293612034191L, -4030355775364368875L, 6479111591081991237L, 7922940353917663823L, 5862557564430861735L, 5442611008729439298L, -2007199040048530204L, -5781659192769145625L, 1685988349302344591L, -292086681885508538L}).toString();
                if (c5363.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj6 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC2164.m4180();
                            throw null;
                        }
                        AbstractC4968 abstractC4968 = (AbstractC4968) obj6;
                        long j = AbstractC2133.m4122(c5363) ? AbstractC3951.f13216 : C1327.f4588;
                        long j2 = C1327.f4590;
                        boolean z = c2384.m1405() == i3;
                        new C4441(new long[]{-6279962871272442472L, 3217771183120503785L, -1684349262486294467L, 704839195335429780L, 1604598235352348603L, 908047938273239671L}).toString();
                        boolean zM8977 = c5363.m8977(interfaceC4643) | c5363.m8963(c2384) | c5363.m8988(i3);
                        Object objM89910 = c5363.m8999();
                        if (zM8977 || objM89910 == c4036) {
                            objM89910 = new C4701(i3, interfaceC4643, c2384);
                            c5363.m8987(objM89910);
                        }
                        AbstractC5844.m9651(z, (InterfaceC4448) objM89910, null, false, AbstractC3925.m7034(2064014002, new C4164(9, abstractC4968), c5363), j, j2, c5363, 12607488);
                        i3 = i4;
                    }
                } else {
                    c5363.m8982();
                }
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) obj5;
                String str2 = (String) obj4;
                Object[] objArr = (Object[]) obj3;
                C5362 c5364 = (C5362) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i5 = PreviewActivity.f164;
                if (c5364.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC1434.m3038(str, str2, c5364, Arrays.copyOf(objArr, 0));
                } else {
                    c5364.m8982();
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C1916 c1916 = (C1916) obj5;
                C4545 c4545 = (C4545) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jM7870 = c4545.m7870(c4545.m7872(fFloatValue - c1916.f6312));
                C4545 c4546 = ((C3594) obj3).f11951;
                c1916.f6312 += c4545.m7872(c4545.m7874(c4546.m7866(c4546.f15021, jM7870, 1)));
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C1489 c1489 = (C1489) obj5;
                String str3 = (String) obj4;
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj3;
                Intent intent = (Intent) obj2;
                if (AbstractC3831.m6874((String) obj, C2993.f10065 ? C2993.m5584((String) c1489.f5057) : C2993.m5583((Context) c1489.f5059))) {
                    C5479 c5479M3108 = c1489.m3107(intent, str3);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1489.f5058;
                    if (c5479M3108 != null) {
                        C1330 c1330 = c5479M3108.f18072;
                        String str4 = c1330.f4598;
                        Object obj7 = c1330.f4597;
                        int i6 = c5479M3108.f18073;
                        String str5 = c5479M3108.f18076;
                        int i7 = c5479M3108.f18074;
                        if (c5479M3108.f18075) {
                            try {
                                C0792 c0792 = (C0792) concurrentHashMap.get(str5);
                                if (c0792 == null) {
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = new ArrayList();
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    c0792 = new C0792();
                                    c0792.f2853 = arrayList;
                                    c0792.f2852 = arrayList2;
                                    c0792.f2851 = arrayList3;
                                    c0792.f2854 = arrayList4;
                                    concurrentHashMap.put(str5, c0792);
                                }
                                ArrayList arrayList5 = c0792.f2854;
                                ArrayList arrayList6 = c0792.f2851;
                                ArrayList arrayList7 = c0792.f2852;
                                ArrayList arrayList8 = c0792.f2853;
                                if (obj7 instanceof List) {
                                    c4535 = (List) obj7;
                                    if (!arrayList8.isEmpty() || i7 <= 0) {
                                        arrayList8.add(i7, c4535);
                                        if (arrayList8.size() == i6) {
                                            ArrayList arrayList9 = new ArrayList();
                                            Iterator it = arrayList8.iterator();
                                            while (it.hasNext()) {
                                                arrayList9.addAll((List) it.next());
                                            }
                                            interfaceC4745.mo211(arrayList9);
                                            arrayList8.clear();
                                            concurrentHashMap.remove(str5);
                                        }
                                        thM405 = AbstractC0183.m405(c4535);
                                        if (thM405 != null) {
                                            ArrayList arrayList10 = C2503.f8322;
                                            C2503.m4657(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str4 + "\"", thM405);
                                        }
                                    }
                                } else if (obj7 instanceof Map) {
                                    c4535 = (Map) obj7;
                                    if (!arrayList7.isEmpty() || i7 <= 0) {
                                        arrayList7.add(i7, c4535);
                                        if (arrayList7.size() == i6) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            Iterator it2 = arrayList7.iterator();
                                            while (it2.hasNext()) {
                                                for (Map.Entry entry : ((Map) it2.next()).entrySet()) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            interfaceC4745.mo211(linkedHashMap);
                                            arrayList7.clear();
                                            concurrentHashMap.remove(str5);
                                        }
                                        thM405 = AbstractC0183.m405(c4535);
                                        if (thM405 != null) {
                                            ArrayList arrayList11 = C2503.f8322;
                                            C2503.m4657(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str4 + "\"", thM405);
                                        }
                                    }
                                } else if (obj7 instanceof Set) {
                                    c4535 = (Set) obj7;
                                    if (!arrayList6.isEmpty() || i7 <= 0) {
                                        arrayList6.add(i7, c4535);
                                        if (arrayList6.size() == i6) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            Iterator it3 = arrayList6.iterator();
                                            while (it3.hasNext()) {
                                                linkedHashSet.addAll((Set) it3.next());
                                            }
                                            interfaceC4745.mo211(linkedHashSet);
                                            arrayList6.clear();
                                            concurrentHashMap.remove(str5);
                                        }
                                        thM405 = AbstractC0183.m405(c4535);
                                        if (thM405 != null) {
                                            ArrayList arrayList12 = C2503.f8322;
                                            C2503.m4657(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str4 + "\"", thM405);
                                        }
                                    }
                                } else {
                                    if (obj7 instanceof String) {
                                        c4535 = (String) obj7;
                                        if (!arrayList5.isEmpty() || i7 <= 0) {
                                            arrayList5.add(i7, c4535);
                                            if (arrayList5.size() == i6) {
                                                StringBuilder sb = new StringBuilder();
                                                Iterator it4 = arrayList5.iterator();
                                                while (it4.hasNext()) {
                                                    sb.append((String) it4.next());
                                                }
                                                interfaceC4745.mo211(sb.toString());
                                                arrayList5.clear();
                                                concurrentHashMap.remove(str5);
                                            }
                                        }
                                    } else {
                                        ArrayList arrayList13 = C2503.f8322;
                                        C2503.m4657(6, "Unsupported segments data key of \"" + str4 + "\"'s type", null);
                                        c4535 = c2358;
                                    }
                                    thM405 = AbstractC0183.m405(c4535);
                                    if (thM405 != null) {
                                        ArrayList arrayList14 = C2503.f8322;
                                        C2503.m4657(4, "YukiHookDataChannel cannot merge this segments data key of \"" + str4 + "\"", thM405);
                                    }
                                }
                            } catch (Throwable th) {
                                c4535 = new C4535(th);
                            }
                        } else if (obj7 != null) {
                            interfaceC4745.mo211(obj7);
                        }
                    }
                }
                return c2358;
            default:
                C1489 c14810 = (C1489) obj5;
                String str6 = (String) obj4;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj3;
                Intent intent2 = (Intent) obj2;
                if (AbstractC3831.m6874((String) obj, C2993.f10065 ? C2993.m5584((String) c14810.f5057) : C2993.m5583((Context) c14810.f5059)) && (c5479M3107 = c14810.m3107(intent2, str6)) != null && AbstractC3831.m6874(c5479M3107.f18072.f4597, "wait_for_listener_value")) {
                    interfaceC4448.mo449();
                }
                return c2358;
        }
    }

    public /* synthetic */ C3659(C2993 c2993, C1489 c1489, String str, InterfaceC0400 interfaceC0400, int i) {
        this.f12252 = i;
        this.f12251 = c1489;
        this.f12250 = str;
        this.f12249 = interfaceC0400;
    }

    public /* synthetic */ C3659(Object obj, Object obj2, Object obj3, int i) {
        this.f12252 = i;
        this.f12251 = obj;
        this.f12250 = obj2;
        this.f12249 = obj3;
    }
}
