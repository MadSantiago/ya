package p000;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۥْؕۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1225 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f4218;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f4219;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4220;

    public /* synthetic */ C1225(C0165 c0165, C2331 c2331, C0555 c0555) {
        this.f4220 = 27;
        this.f4219 = c2331;
        this.f4218 = c0555;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02c6 A[LOOP:2: B:104:0x0291->B:114:0x02c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x0524  */
    /* JADX WARN: Code duplicated, block: B:223:0x0541  */
    /* JADX WARN: Code duplicated, block: B:288:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ۦًؘُۢ] */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        C5565 c5565;
        List listM2049;
        C3222 c3222M4871;
        String[] strArrNames;
        long j;
        C2449 c2449M9648;
        C5837 c5837;
        C1249 c1249;
        int i = 2;
        ?? c5566 = 0;
        ArrayList arrayList = null;
        int i2 = 1;
        int i3 = 0;
        switch (this.f4220) {
            case 0:
                ((C5450) this.f4219).f17965 = ((InterfaceC4448) this.f4218).mo449();
                return C2358.f7817;
            case 1:
                ((InterfaceC4541) this.f4219).mo5597(this.f4218);
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C4476 c4476 = (C4476) this.f4219;
                C2497 c2497 = (C2497) this.f4218;
                c4476.f14779 = c4476.f14782.mo1709(c2497.f8304.mo4567(), c2497.getLayoutDirection(), c2497);
                return C2358.f7817;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0818 abstractC0818 = (AbstractC0818) this.f4219;
                C2296 c2296 = (C2296) this.f4218;
                AbstractC3959 abstractC3959 = abstractC0818.f2909;
                synchronized (abstractC3959.f13237) {
                    if (((LinkedHashSet) abstractC3959.f13234).remove(c2296) && ((LinkedHashSet) abstractC3959.f13234).isEmpty()) {
                        abstractC3959.mo760();
                    }
                    break;
                }
                return C2358.f7817;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C0165 c0165 = (C0165) this.f4219;
                C1249 c12410 = (C1249) this.f4218;
                if (c0165 == null) {
                    return c12410;
                }
                C1347 c1347 = c0165.f620;
                boolean zIsEmpty = c1347.isEmpty();
                C1249 c12411 = c0165.f621;
                if (!zIsEmpty) {
                    C4483 c4483 = new C4483(c12411);
                    int size = c1347.size();
                    while (i3 < size) {
                        ((InterfaceC4745) c1347.get(i3)).mo211(c4483);
                        i3++;
                    }
                    c12411 = c4483.f14804;
                }
                c0165.f621 = c12411;
                return c12411 == null ? c12410 : c12411;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC2765.m5135((InterfaceC4643) this.f4219, null, 0, new C2713((C4153) this.f4218, c5566, i3), 3);
                return Boolean.TRUE;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C3600 c3600 = (C3600) this.f4219;
                c3600.f11986.m104(new RunnableC5689(i, c3600, (UUID) this.f4218));
                AbstractC5554.m9308(c3600.f11989, c3600.f11986, c3600.f11987);
                return C2358.f7817;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) this.f4219;
                C3600 c3601 = (C3600) this.f4218;
                WorkDatabase workDatabase = c3601.f11986;
                workDatabase.m104(new RunnableC3599(workDatabase, str, c3601, i2));
                AbstractC5554.m9308(c3601.f11989, workDatabase, c3601.f11987);
                return C2358.f7817;
            case 8:
                C2805 c2805 = (C2805) this.f4219;
                Object obj = this.f4218;
                C5362 c5362 = c2805.f9361;
                C2575 c2575 = c5362.f17645;
                C3222 c3222M4872 = c2575.m4871();
                int i4 = 0;
                while (true) {
                    try {
                        if (i4 < c2575.f8602) {
                            if (c3222M4872.m5923(i4)) {
                                Object objM5930 = c3222M4872.m5930(i4);
                                if (objM5930 != obj) {
                                    C1670 c1670 = objM5930 instanceof C1670 ? (C1670) objM5930 : null;
                                    if ((c1670 != null ? c1670.f5567 : null) == obj) {
                                    }
                                }
                                C5565 c5567 = new C5565(i4, null);
                                c3222M4872.m5912();
                                c5565 = c5567;
                                if (c5565 != 0) {
                                    int i5 = c5565.f18372;
                                    Integer num = c5565.f18371;
                                    c3222M4871 = c2575.m4871();
                                    try {
                                        ArrayList arrayListM3412 = AbstractC1631.m3412(c3222M4871, i5, num);
                                        c3222M4871.m5912();
                                        listM2049 = AbstractC0973.m2049(arrayListM3412, c5362.m8966());
                                    } catch (Throwable th) {
                                        c3222M4871.m5912();
                                        throw th;
                                    }
                                } else {
                                    listM2049 = C2340.f7777;
                                }
                                return new C4335(listM2049, c5362.f17646);
                            }
                            int[] iArr = c3222M4872.f10824;
                            int i6 = i4 + 1;
                            int iM6813 = (i6 < c3222M4872.f10821 ? iArr[(i6 * 5) + 4] : c3222M4872.f10822) - AbstractC3809.m6813(iArr, i4);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iM6813) {
                                    i4 = i6;
                                } else {
                                    Object objM5920 = c3222M4872.m5920(i4, i7);
                                    if (objM5920 != obj) {
                                        C1670 c1671 = objM5920 instanceof C1670 ? (C1670) objM5920 : null;
                                        if ((c1671 != null ? c1671.f5567 : null) != obj) {
                                            i7++;
                                        }
                                    }
                                    c5566 = new C5565(i4, Integer.valueOf(i7));
                                }
                            }
                        }
                        c3222M4872.m5912();
                        c5565 = c5566;
                        if (c5565 != 0) {
                            int i8 = c5565.f18372;
                            Integer num2 = c5565.f18371;
                            c3222M4871 = c2575.m4871();
                            ArrayList arrayListM3413 = AbstractC1631.m3412(c3222M4871, i8, num2);
                            c3222M4871.m5912();
                            listM2049 = AbstractC0973.m2049(arrayListM3413, c5362.m8966());
                        } else {
                            listM2049 = C2340.f7777;
                        }
                        return new C4335(listM2049, c5362.f17646);
                    } catch (Throwable th2) {
                        c3222M4872.m5912();
                        throw th2;
                    }
                }
            case 9:
                return new C0873(C5063.m8635(((InterfaceC3320) this.f4219).mo777((InterfaceC2015) ((InterfaceC4448) this.f4218).mo449())));
            case 10:
                ((C3064) this.f4219).f10304.mo211((C0843) this.f4218);
                return C2358.f7817;
            case 11:
                C4236 c4236 = (C4236) this.f4219;
                String str2 = (String) this.f4218;
                Enum[] enumArr = c4236.f14040;
                C2505 c2505 = new C2505(enumArr.length, str2);
                for (Enum r0 : enumArr) {
                    c2505.m8034(r0.name(), false);
                }
                return c2505;
            case 12:
                ((C5450) this.f4219).f17965 = AbstractC2552.m4807((C3165) this.f4218, AbstractC3186.f10707);
                return C2358.f7817;
            case 13:
                InterfaceC0103 interfaceC0103 = (InterfaceC0103) this.f4219;
                C0971 c0971 = (C0971) this.f4218;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC1605.m3352(c0971, interfaceC0103);
                int iMo189 = interfaceC0103.mo189();
                for (int i9 = 0; i9 < iMo189; i9++) {
                    List listMo191 = interfaceC0103.mo191(i9);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listMo191) {
                        if (obj2 instanceof InterfaceC1449) {
                            arrayList2.add(obj2);
                        }
                    }
                    InterfaceC1449 interfaceC1449 = (InterfaceC1449) (arrayList2.size() == 1 ? arrayList2.get(0) : null);
                    if (interfaceC1449 != null && (strArrNames = interfaceC1449.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = AbstractC3831.m6874(interfaceC0103.mo183(), C0907.f3259) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                throw new C2770(AbstractC3801.m6762(-1, "The suggested name '" + str3 + "' for " + str4 + ' ' + interfaceC0103.mo184(i9) + " is already one of the names for " + str4 + ' ' + interfaceC0103.mo184(((Number) AbstractC4554.m7912(str3, linkedHashMap)).intValue()) + " in " + interfaceC0103, null, null, null));
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i9));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C0204.f751 : linkedHashMap;
            case 14:
                C5704 c5704 = (C5704) this.f4219;
                C2384 c2384 = (C2384) this.f4218;
                C2684 c2684 = (C2684) c5704.getValue();
                return new C3144(c2384, c2684, new C3510((C3046) ((C3779) c2384.f2349.f8567).getValue(), c2684));
            case 15:
                return new C2069((InterfaceC0814) this.f4219, C0204.f751, (C5108) this.f4218);
            case 16:
                C1705 c1705 = (C1705) this.f4219;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f4218;
                if (((Boolean) c1705.f5675.f14993.mo211(EnumC0845.f3013)).booleanValue()) {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, c5566, 10), 3);
                }
                return Boolean.TRUE;
            case 17:
                C2808 c2808 = (C2808) this.f4219;
                C2527 c2527 = (C2527) this.f4218;
                if (((C5592) c2808.f9378).get() == 0) {
                    c2527.mo449();
                }
                return C2358.f7817;
            case 18:
                C3133.m5792((MainActivity) this.f4219, new C4441(new long[]{-2542121596579895537L, 1191189435657215417L, 6314618003509478873L, 1757871223187346344L}).toString()).m3140((String) ((C2314) this.f4218).f7651.getValue(), new C4441(new long[]{-6902379752378137600L, -5171582289545947532L, 467353968432201214L, -8837748465577763742L}).toString());
                return C2358.f7817;
            case 19:
                C3639 c3639 = (C3639) this.f4219;
                C1946 c1946 = (C1946) this.f4218;
                Object[] objArr = c3639.f12174;
                long[] jArr = c3639.f12175;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j2 = jArr[i10];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j2) < 128) {
                                    c1946.m3810(objArr[(i10 << 3) + i12]);
                                }
                                j2 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                }
                return C2358.f7817;
            case 20:
                C3133.m5792((SideActivity) this.f4219, new C4441(new long[]{-4133637582165541758L, 739520120333711469L, 1476671325956464150L, -5178570001474881567L}).toString()).m3140((String) this.f4218, new C4441(new long[]{7052119752858573181L, 3819375560534627520L, 3875443781568376059L, -1965528452124965326L}).toString());
                return C2358.f7817;
            case 21:
                ((InterfaceC1897) this.f4219).mo162((String) ((C3557) this.f4218).f11791.getValue());
                return C2358.f7817;
            case 22:
                AbstractC1333[] abstractC1333ArrListFiles = ((AbstractC0993) this.f4219).mo2170((String) ((C3557) this.f4218).f11791.getValue()).listFiles();
                if (abstractC1333ArrListFiles != null) {
                    arrayList = new ArrayList();
                    for (AbstractC1333 abstractC1333 : abstractC1333ArrListFiles) {
                        if (AbstractC0684.m1527(abstractC1333.getName(), new C4441(new long[]{-2679497750345748287L, 7503818308581057650L}).toString(), false)) {
                            arrayList.add(abstractC1333);
                        }
                    }
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1333) it.next()).delete();
                    }
                }
                return C2358.f7817;
            case 23:
                C0079 c0079 = (C0079) this.f4219;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f4218;
                synchronized (C0353.f1288) {
                    LinkedHashMap linkedHashMap2 = C0353.f1285;
                    linkedHashMap2.remove(c0079);
                    if (linkedHashMap2.isEmpty()) {
                        C1984.m3874().m3878(AbstractC3182.f10689, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(C0353.f1289);
                        C0353.f1287 = false;
                        C0353.f1290 = null;
                        C0353.f1286 = false;
                    }
                    break;
                }
                return C2358.f7817;
            case 24:
                Context context = (Context) this.f4219;
                TextClassification textClassification = (TextClassification) this.f4218;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                    break;
                } else {
                    activity.send();
                }
                return C2358.f7817;
            case 25:
                AbstractC2765.m5135((InterfaceC4643) this.f4219, null, 4, new C2718((InterfaceC4745) this.f4218, (InterfaceC0443) c5566, 17), 1);
                return C2358.f7817;
            case 26:
                C3635 c3635 = (C3635) this.f4219;
                long j3 = ((C4207) ((InterfaceC4367) this.f4218).getValue()).f13969;
                C1553 c1553M6485 = c3635.m6485();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (c1553M6485 != null) {
                    long j4 = c1553M6485.f5241;
                    C1249 c1249M6484 = c3635.m6484();
                    if (c1249M6484 != null && c1249M6484.f4307.length() != 0) {
                        EnumC2925 enumC2925 = (EnumC2925) c3635.f12142.getValue();
                        int i13 = enumC2925 == null ? -1 : AbstractC0790.f2845[enumC2925.ordinal()];
                        if (i13 != -1) {
                            if (i13 == 1 || i13 == 2) {
                                long j5 = c3635.m6479().f18943;
                                int i14 = C3346.f11195;
                                j = j5 >> 32;
                            } else {
                                if (i13 != 3) {
                                    C1078.m2275();
                                    return null;
                                }
                                long j6 = c3635.m6479().f18943;
                                int i15 = C3346.f11195;
                                j = j6 & 4294967295L;
                            }
                            int i16 = (int) j;
                            C5837 c5838 = c3635.f12150;
                            if (c5838 != null && (c2449M9648 = c5838.m9648()) != null && (c5837 = c3635.f12150) != null && (c1249 = c5837.f19232.f1627) != null) {
                                int iM7934 = AbstractC4554.m7934(c3635.f12147.mo4319(i16), 0, c1249.f4307.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c2449M9648.m4574(j4) >> 32));
                                C3828 c3828 = c2449M9648.f8158;
                                C2276 c2276 = c3828.f12696;
                                int iM4335 = c2276.m4335(iM7934);
                                float fM6825 = c3828.m6825(iM4335);
                                float fM6833 = c3828.m6833(iM4335);
                                float fM7922 = AbstractC4554.m7922(fIntBitsToFloat, Math.min(fM6825, fM6833), Math.max(fM6825, fM6833));
                                if (C4207.m7431(j3, 0L) || Math.abs(fIntBitsToFloat - fM7922) <= ((int) (j3 >> 32)) / 2) {
                                    float fM4331 = c2276.m4331(iM4335);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM7922)) << 32) | (((long) Float.floatToRawIntBits(((c2276.m4332(iM4335) - fM4331) / 2.0f) + fM4331)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C1553(jFloatToRawIntBits);
            default:
                C2331 c2331 = (C2331) this.f4219;
                C0555 c0555 = (C0555) this.f4218;
                AbstractC4428 abstractC4428 = (AbstractC4428) c2331.f7719;
                if (abstractC4428 instanceof C0780) {
                    try {
                        String str5 = ((C0780) abstractC4428).f2822;
                        c0555.getClass();
                        try {
                            c0555.f2001.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                        } catch (ActivityNotFoundException e2) {
                            throw new IllegalArgumentException(AbstractC5078.m8669('.', "Can't open ", str5), e2);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return C2358.f7817;
        }
    }

    public /* synthetic */ C1225(int i, Object obj, Object obj2) {
        this.f4220 = i;
        this.f4219 = obj;
        this.f4218 = obj2;
    }
}
