package p000;

import android.app.AndroidAppHelper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: ۥۡؗۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2582 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8626;

    public /* synthetic */ C2582(C3134 c3134) {
        this.f8626 = 15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:251:0x05c8 A[PHI: r0
  0x05c8: PHI (r0v54 java.lang.Object) = (r0v12 java.lang.Object), (r0v52 java.lang.Object), (r0v61 java.lang.Object) binds: [B:320:0x07ef, B:261:0x0619, B:249:0x05c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:319:0x07eb  */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Object c4535;
        String str;
        Object objM1970;
        Object c4536;
        String str2;
        String strM3847;
        Object c4537;
        String str3;
        int i = 2;
        Object objValueOf = null;
        int i2 = 3;
        boolean z = true;
        switch (this.f8626) {
            case 0:
                C0954 c0954 = (C0954) obj;
                C2358 c2358 = C2358.f7817;
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
                C3121 c3121M7163 = AbstractC4009.m7163(c4535);
                c3121M7163.m5746();
                C2244 c2244M5751 = c3121M7163.m5751();
                c2244M5751.f7439 = AbstractC5041.m8557(String.class);
                C4229 c4229 = c2244M5751.f9028;
                if (c4229 != null) {
                    c4229.f14031 = true;
                }
                C3657 c3657 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
                if (c3657 == null || (str = (String) c3657.m6535(new Object[0])) == null) {
                    C3382.f11273.m3886();
                } else {
                    switch (str.hashCode()) {
                        case -1456672099:
                            if (!str.equals(new C4441(new long[]{-7564382406445503682L, -2325694450854199884L, 6445735113137950879L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1455368039:
                            if (str.equals(new C4441(new long[]{-8488263715931655224L, 842782770359677883L, 1463048488912393179L, -6114397258158663406L, -4918033337396449025L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M7845 = C4524.m7845();
                                C1542 c1542 = AbstractC2539.f8440;
                                Object obj2 = c1542.f5218;
                                String str4 = c1542.f5219;
                                boolean z2 = C1443.f4940;
                                objValueOf = Boolean.valueOf(!((Boolean) c1443M7845.m3068(obj2, str4)).booleanValue());
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1431549812:
                            if (str.equals(new C4441(new long[]{3042752488042007223L, 4061298735770126149L, -335375725128289686L, 3746350183238608351L, -2927234432315880664L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M7846 = C4524.m7845();
                                C1542 c1543 = AbstractC2539.f8437;
                                Object obj3 = c1543.f5218;
                                String str5 = c1543.f5219;
                                boolean z3 = C1443.f4940;
                                objValueOf = Boolean.valueOf(!((Boolean) c1443M7846.m3068(obj3, str5)).booleanValue());
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1422640654:
                            if (str.equals(new C4441(new long[]{8537836072881028539L, 2787995494252809208L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1422636499:
                            if (str.equals(new C4441(new long[]{-523586743383184727L, -8718735485676899390L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1368028128:
                            if (str.equals(new C4441(new long[]{4100341723897793823L, 7294900955555803753L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1152775833:
                            if (str.equals(new C4441(new long[]{8714986989008724679L, 2721604589461651316L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -1089078382:
                            if (str.equals(new C4441(new long[]{-5408328837078116194L, 3237437028379067661L, 5481583012000131633L, -7134341130412506989L, 6282124196014350208L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -853599769:
                            if (!str.equals(new C4441(new long[]{-625458754744881072L, -2702483186625612363L, -2613461503175751857L, 459896546488742187L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -655100589:
                            if (str.equals(new C4441(new long[]{-7271438655692840808L, -1232862998845893975L, 5226557758718192389L, 8311020545742109568L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case -63578231:
                            if (!str.equals(new C4441(new long[]{-705409397486126957L, 49497102501922920L, 8049150264838497567L, 2244065424332663115L, 8836978671753346635L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 233073314:
                            if (str.equals(new C4441(new long[]{7096120448646797480L, 4381823075523918245L, 6483592999586101895L, 5833823584797191288L, 2699744848772400919L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M7847 = C4524.m7845();
                                C1542 c1544 = AbstractC2539.f8444;
                                Object obj4 = c1544.f5218;
                                String str6 = c1544.f5219;
                                boolean z4 = C1443.f4940;
                                objValueOf = Boolean.valueOf(!((Boolean) c1443M7847.m3068(obj4, str6)).booleanValue());
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 435330133:
                            if (str.equals(new C4441(new long[]{9114441823063393604L, -3330767151791627915L, -4493264008042120572L, -8982060965902613228L, 5417036830983993048L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 830280113:
                            if (str.equals(new C4441(new long[]{8247007858976897876L, -6552586799169246931L, 7073061682073284613L, -103493077899014942L, -8199255626955083655L}).toString())) {
                                objValueOf = Boolean.FALSE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1460659068:
                            if (str.equals(new C4441(new long[]{2192824560919259790L, -3466529042256211450L, -5592008702632323917L, -892444640026793022L}).toString())) {
                                objValueOf = Boolean.TRUE;
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1507643984:
                            if (str.equals(new C4441(new long[]{6380111576699242439L, 4454961039696893108L, -1700626113194687789L, 2876434777054797178L, -5273870107900615233L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M7848 = C4524.m7845();
                                C1542 c1545 = AbstractC2539.f8445;
                                Object obj5 = c1545.f5218;
                                String str7 = c1545.f5219;
                                boolean z5 = C1443.f4940;
                                if (!((Boolean) c1443M7848.m3068(obj5, str7)).booleanValue() && (objM1970 = c0954.m1970()) != null) {
                                    objValueOf = objM1970;
                                }
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1582141970:
                            if (!str.equals(new C4441(new long[]{6870441898398402686L, -3408291182595740340L, -3695611061578346337L, -4961216311592122662L, -7075894093377526932L, -1066236033256059570L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1596939731:
                            if (str.equals(new C4441(new long[]{-2559435038146681007L, 8662869815647157429L, -1613077492684919663L, 1501012295752713855L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M7849 = C4524.m7845();
                                C1542 c1546 = AbstractC2539.f8455;
                                Object obj6 = c1546.f5218;
                                String str8 = c1546.f5219;
                                boolean z6 = C1443.f4940;
                                if (!((Boolean) c1443M7849.m3068(obj6, str8)).booleanValue() && (objM1970 = c0954.m1970()) != null) {
                                    objValueOf = objM1970;
                                }
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1616428170:
                            if (str.equals(new C4441(new long[]{639183020104502105L, 5131327769064750634L, 1328055207142648309L, -8143781099899634808L}).toString())) {
                                C4524.f14953.getClass();
                                C1443 c1443M78410 = C4524.m7845();
                                C1542 c1547 = AbstractC2539.f8437;
                                Object obj7 = c1547.f5218;
                                String str9 = c1547.f5219;
                                boolean z7 = C1443.f4940;
                                objValueOf = Boolean.valueOf(!((Boolean) c1443M78410.m3068(obj7, str9)).booleanValue());
                            } else {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1632179337:
                            if (!str.equals(new C4441(new long[]{5068045192311030405L, 2106868547786455384L, 4297922916484238073L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        case 1808529707:
                            if (!str.equals(new C4441(new long[]{-4332242564185142164L, -1471841291844586291L, -4612602211010627152L}).toString())) {
                                objM1970 = c0954.m1970();
                                if (objM1970 != null) {
                                    objValueOf = objM1970;
                                }
                            }
                            break;
                        default:
                            objM1970 = c0954.m1970();
                            if (objM1970 != null) {
                                objValueOf = objM1970;
                            }
                            break;
                    }
                    c0954.m1973(objValueOf);
                }
                return c2358;
            case 1:
                C0954 c0955 = (C0954) obj;
                C2358 c2359 = C2358.f7817;
                c0955.getClass();
                try {
                    c4536 = c0955.m1971()[0];
                    if (c4536 == null) {
                        c4536 = null;
                    }
                } catch (Throwable th2) {
                    c4536 = new C4535(th2);
                }
                C3121 c3121M7164 = AbstractC4009.m7163(c4536 instanceof C4535 ? null : c4536);
                c3121M7164.m5746();
                C2244 c2244M5752 = c3121M7164.m5751();
                c2244M5752.f7439 = AbstractC5041.m8557(String.class);
                C4229 c42210 = c2244M5752.f9028;
                if (c42210 != null) {
                    c42210.f14031 = true;
                }
                C3657 c3658 = (C3657) AbstractC0973.m2058(c2244M5752.m4293());
                if (c3658 == null || (str2 = (String) c3658.m6535(new Object[0])) == null) {
                    C3913.f13043.m3886();
                } else if (str2.equals(new C4441(new long[]{-8048058857911330521L, 5441511238360507387L, 274287143294141170L}).toString())) {
                    c0955.m1973(Boolean.FALSE);
                }
                return c2359;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C2672 c2672 = (C2672) obj;
                C2672.m4973(c2672, new C4441(new long[]{-5376454656676290885L, 7198026538215850398L, 7051837132367078428L}).toString());
                C0637 c0637 = new C0637();
                c0637.f2381 = new C0094(8, 1);
                c2672.m4981(c0637);
                return C2358.f7817;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", (C1042) obj);
                return C1298.f4424;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC3992.m7135((InterfaceC1066) obj, 0);
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C3751) obj).m6595();
                return C2358.f7817;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C0637 c0638 = (C0637) obj;
                C2582 c2582 = new C2582(7);
                c0638.getClass();
                C0637 c0639 = new C0637();
                c2582.mo211(c0639);
                C0672 c0672 = c0638.f2379;
                if (c0672 == null) {
                    c0672 = new C0672();
                }
                c0638.f2379 = c0672;
                c0672.m1503(c0639);
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C5310 c5310 = new C5310();
                C5310.m8924(c5310, new C4441(new long[]{3166534544589423108L, -5680656948051587111L, 5783529982752075218L}).toString());
                ((C0637) obj).m1443(c5310);
                return C2358.f7817;
            case 8:
                synchronized (AbstractC1538.f5203) {
                    List list = AbstractC1538.f5211;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((InterfaceC4745) list.get(i3)).mo211(obj);
                    }
                }
                return C2358.f7817;
            case 9:
                C0637 c06310 = (C0637) obj;
                c06310.m1445(Boolean.class);
                List<String> listSingletonList = Collections.singletonList(new C4441(new long[]{1389135900616755741L, -1625518416134307735L}).toString());
                ArrayList arrayList = new ArrayList(AbstractC5573.m9402(listSingletonList, 10));
                for (String str10 : listSingletonList) {
                    Integer num = (Integer) ((Map) AbstractC5069.f16819.getValue()).get(str10);
                    if (num == null) {
                        C1078.m2272(AbstractC3761.m6629("opFormat: ", str10, " is not found"));
                        return null;
                    }
                    arrayList.add(num);
                }
                C4665 c4665 = new C4665();
                c4665.f15369 = arrayList;
                c4665.f15368 = 1;
                c06310.f2376 = c4665;
                return C2358.f7817;
            case 10:
                C5310 c5311 = new C5310();
                C5310.m8924(c5311, new C4441(new long[]{6425256579936355815L, -2139887312810519886L, -6585677723844923180L}).toString());
                ((C0637) obj).m1443(c5311);
                return C2358.f7817;
            case 11:
                C3751 c3751 = (C3751) obj;
                c3751.f12477 = true;
                c3751.f12475 = new C1202(0);
                c3751.m6590(false);
                return C2358.f7817;
            case 12:
                ((C3751) obj).m6591(new C2582(13));
                return C2358.f7817;
            case 13:
                C0954 c0956 = (C0954) obj;
                c0956.getClass();
                new C0322(i, i2, c0956).m694();
                return C2358.f7817;
            case 14:
                C0954 c0957 = (C0954) obj;
                Object objM1971 = c0957.m1970();
                List list2 = (List) (objM1971 instanceof List ? objM1971 : null);
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : list2) {
                        if (!AbstractC0684.m1527(obj8.toString(), new C4441(new long[]{-1473762156196281832L, 4549959741455023697L, -2258747677806174014L}).toString(), false)) {
                            arrayList2.add(obj8);
                        }
                    }
                    c0957.m1973(arrayList2);
                }
                return C2358.f7817;
            case 15:
                C1337 c1337 = (C1337) obj;
                C3637 c3637 = C3134.f10550;
                Map mapM2851 = c1337.m2851();
                LinkedHashMap linkedHashMap = c1337.f4620;
                long j = 0;
                for (Map.Entry entry : mapM2851.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        C3637 c3638 = (C3637) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strM5815 = C3134.m5815(System.currentTimeMillis());
                        if (set.contains(strM5815)) {
                            Object[] objArr = {strM5815};
                            HashSet hashSet = new HashSet(1);
                            Object obj9 = objArr[0];
                            Objects.requireNonNull(obj9);
                            if (!hashSet.add(obj9)) {
                                C0178.m385(obj9, "duplicate element: ");
                                return null;
                            }
                            c1337.m2852(c3638, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            c1337.m2850();
                            linkedHashMap.remove(c3638);
                        }
                    }
                }
                if (j == 0) {
                    c1337.m2850();
                    linkedHashMap.remove(c3637);
                } else {
                    c1337.m2852(c3637, Long.valueOf(j));
                }
                return null;
            case 16:
                C0637 c06311 = (C0637) obj;
                C2358 c23510 = C2358.f7817;
                Class<Boolean> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Boolean.class));
                c06311.m1445(clsM9037 != null ? clsM9037 : Boolean.class);
                C0672 c0673 = new C0672();
                c0673.f2470 = new C0094(4);
                C0637 c06312 = new C0637();
                c06312.m1448(new C4441(new long[]{47699114056570793L, -2176519659549652187L}).toString());
                c0673.m1503(c06312);
                c06311.f2379 = c0673;
                return c23510;
            case 17:
                ((C3751) obj).m6594();
                return C2358.f7817;
            case 18:
                ((C3751) obj).m6592(null);
                return C2358.f7817;
            case 19:
                C5310 c5312 = new C5310();
                C5310.m8924(c5312, new C4441(new long[]{-6897649497231664865L, 1590742568971245423L, -6739303268639147427L, 1843550958696844994L}).toString());
                ((C0637) obj).m1443(c5312);
                return C2358.f7817;
            case 20:
                C0637 c06313 = (C0637) obj;
                String string = new C4441(new long[]{-3445249769602248294L, 7043914532665064383L}).toString();
                c06313.getClass();
                C0637.m1442(c06313, string);
                return C2358.f7817;
            case 21:
                C0954 c0958 = (C0954) obj;
                C4524.f14953.getClass();
                C1443 c1443M78411 = C4524.m7845();
                C1542 c1548 = AbstractC2539.f8462;
                Object obj10 = c1548.f5218;
                String str11 = c1548.f5219;
                boolean z8 = C1443.f4940;
                String str12 = (String) c1443M78411.m3068(obj10, str11);
                C4979 c4979 = C4979.f16472;
                C4229 c42211 = new C4229(AbstractC2405.m4530(c4979.m7250(), new C4441(new long[]{6802051499642617279L, 5986401462295722182L, -2654868117896170542L, 8555037258732074650L, 4194498392541786802L, -6403298418767633054L, 6402057277732312094L, 4146217257074604018L, 8516704802935877642L, 3509738055187531527L, 4644322578270280884L}).toString()), null, 1);
                c42211.f14028 = 3;
                C2749 c2749 = new C2749();
                c2749.f9028 = c42211;
                c2749.f9027 = str12;
                C1865 c1865 = (C1865) AbstractC0973.m2058(c2749.m5108());
                objValueOf = c1865 != null ? (Enum) c1865.m3715() : null;
                if (objValueOf != null) {
                    c0958.m1973(objValueOf);
                } else {
                    c4979.m3886();
                }
                return C2358.f7817;
            case 22:
                C4047 c4047 = (C4047) obj;
                String string2 = new C4441(new long[]{-8854339703834194732L, 8523790069045547940L, -5747555545616122915L, -5071703732539470183L}).toString();
                C2319 c2319 = c4047.f13492;
                if ((c2319 != null ? c2319.f7671 : 0) != 1) {
                    if (c2319 != null) {
                        strM3847 = c2319.f7670;
                    } else {
                        C1967.f6501.getClass();
                        strM3847 = C1967.m3847();
                    }
                    if (strM3847.equals(string2) || AbstractC0684.m1534(string2)) {
                        String[] strArr = {new C4441(new long[]{4539136119614777534L, -5398757492393230796L, 6354750595564117194L, -3717106128319814622L}).toString(), new C4441(new long[]{3549075385932925059L, 157438631447143569L, -6447880852498186917L, -8919693205988906853L, 2110749085730286887L}).toString()};
                        for (int i4 = 0; i4 < 2; i4++) {
                            String str13 = strArr[i4];
                            C2319 c23110 = c4047.f13492;
                            if (c23110 != null) {
                                str3 = c23110.f7668;
                            } else {
                                C1967.f6501.getClass();
                                try {
                                    c4537 = AndroidAppHelper.currentProcessName();
                                } catch (Throwable th3) {
                                    c4537 = new C4535(th3);
                                }
                                if (c4537 instanceof C4535) {
                                    c4537 = null;
                                }
                                str3 = (String) c4537;
                                if (str3 == null) {
                                    C3369 c3369 = C1967.f6499;
                                    InterfaceC0504 interfaceC0504 = C1967.f6500[0];
                                    C4229 c42212 = new C4229(c3369.m6138(), null, 1);
                                    C2432 c2432 = C1940.f6401;
                                    c42212.f14027 = AbstractC3925.m7053();
                                    c42212.f14028 = 3;
                                    C2244 c2244 = new C2244();
                                    c2244.f9028 = c42212;
                                    c2244.f9027 = "currentPackageName";
                                    C3657 c3659 = (C3657) AbstractC0973.m2058(c2244.m4293());
                                    if (c3659 == null || (str3 = (String) c3659.m6535(new Object[0])) == null || AbstractC0684.m1534(str3)) {
                                        str3 = null;
                                    }
                                    if (str3 == null) {
                                        str3 = "android";
                                    }
                                }
                            }
                            if (AbstractC3831.m6874(str13, str3)) {
                                C2885 c2885 = C0113.f451;
                                if (c2885 == null) {
                                    C1078.m2276("Current Hook Framework not support moduleAppResources");
                                    return null;
                                }
                                AbstractC4009.f13369 = c2885;
                                c4047.m7249(C5787.f19066);
                                if (C5787.f19064 != 0) {
                                    c4047.m7249(C4524.f14953);
                                }
                            }
                        }
                    }
                    break;
                }
                return C2358.f7817;
            case 23:
                return C2358.f7817;
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 25:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
        }
    }

    public /* synthetic */ C2582(int i) {
        this.f8626 = i;
    }
}
