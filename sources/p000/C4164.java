package p000;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.MainActivity;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦْٕٔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4164 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f13858;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13859;

    public /* synthetic */ C4164(int i, int i2, Object obj) {
        this.f13859 = i2;
        this.f13858 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x022e A[LOOP:6: B:102:0x01f8->B:115:0x022e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x02df  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x03a7 A[Catch: all -> 0x0399, LOOP:9: B:170:0x036b->B:187:0x03a7, LOOP_END, TryCatch #1 {all -> 0x0399, blocks: (B:163:0x0348, B:165:0x0358, B:167:0x035e, B:170:0x036b, B:172:0x0376, B:174:0x0380, B:176:0x0386, B:178:0x038f, B:183:0x039b, B:184:0x039e, B:187:0x03a7, B:197:0x03cd, B:188:0x03ab, B:189:0x03b1, B:191:0x03b7, B:193:0x03bf, B:196:0x03c9), top: B:345:0x0348 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0430 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x0432 A[Catch: all -> 0x0468, LOOP:12: B:210:0x0407->B:220:0x0432, LOOP_END, TryCatch #0 {all -> 0x0468, blocks: (B:207:0x03f2, B:210:0x0407, B:212:0x0412, B:214:0x041c, B:216:0x0422, B:217:0x042a, B:220:0x0432, B:221:0x0435, B:224:0x0440, B:226:0x044b, B:228:0x0455, B:230:0x045b, B:233:0x046a, B:236:0x0472, B:237:0x0475), top: B:343:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x0470 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0472 A[Catch: all -> 0x0468, LOOP:14: B:224:0x0440->B:236:0x0472, LOOP_END, TryCatch #0 {all -> 0x0468, blocks: (B:207:0x03f2, B:210:0x0407, B:212:0x0412, B:214:0x041c, B:216:0x0422, B:217:0x042a, B:220:0x0432, B:221:0x0435, B:224:0x0440, B:226:0x044b, B:228:0x0455, B:230:0x045b, B:233:0x046a, B:236:0x0472, B:237:0x0475), top: B:343:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:267:0x0508  */
    /* JADX WARN: Code duplicated, block: B:348:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0475 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0122 A[LOOP:0: B:37:0x00f2->B:48:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x015c A[LOOP:2: B:54:0x012d->B:65:0x015c, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02fb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object[], java.util.Set[]] */
    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        boolean zM5324;
        Object objM2049;
        Object next;
        String str;
        C3869 c3869;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i = 7;
        InterfaceC4242 interfaceC4242M996 = null;
        interfaceC4783 = null;
        interfaceC4783 = null;
        interfaceC4783 = null;
        InterfaceC4783 interfaceC4783 = null;
        InterfaceC3196 interfaceC3196 = null;
        boolean z = false;
        switch (this.f13859) {
            case 0:
                C0178 c0178 = (C0178) this.f13858;
                C2793 c2793M7467 = AbstractC4225.m7467((RectF) obj);
                C2793 c2793M7468 = AbstractC4225.m7467((RectF) obj2);
                switch (c0178.f665) {
                    case 21:
                        zM5324 = c2793M7467.m5324(c2793M7468);
                        break;
                    default:
                        zM5324 = c2793M7468.m5321(c2793M7467.m5319());
                        break;
                }
                return Boolean.valueOf(zM5324);
            case 1:
                C0175 c0175 = (C0175) this.f13858;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC1263) {
                    InterfaceC1263 interfaceC1263 = (InterfaceC1263) obj2;
                    C3639 c3639 = (C3639) c0175.f654;
                    if (c3639 == null) {
                        C3639 c36310 = AbstractC5705.f18789;
                        c3639 = new C3639();
                        c0175.f654 = c3639;
                    }
                    c3639.m6501(interfaceC1263);
                    ((C0863) c0175.f651).m1843(interfaceC1263);
                }
                if (obj2 instanceof C1670) {
                    c0175.m369((C1670) obj2);
                }
                if (obj2 instanceof C5863) {
                    ((C5863) obj2).m9681();
                }
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                AbstractC2776.m5234((C3635) this.f13858, (C5362) obj, AbstractC3831.m6835(1));
                return C2358.f7817;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C3064 c3064 = (C3064) this.f13858;
                C5362 c5362 = (C5362) obj;
                ((Integer) obj2).getClass();
                c5362.m8957(666084174);
                String str5 = c3064.f10303;
                c5362.m9009(false);
                return str5;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                String str6 = (String) this.f13858;
                C5362 c5363 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                new C4441(new long[]{-6819989115391331949L, -8375298758603588987L, 4354378249444593066L, -6997623533246126889L, -752823203692837684L, -7297954720627435488L, -6333790960412185332L}).toString();
                if (c5363.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0495.m1105(str6, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c5363, 0, 0, 262142);
                } else {
                    c5363.m8982();
                }
                return C2358.f7817;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5362 c5364 = (C5362) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c5364.m9011(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    throw null;
                }
                c5364.m8982();
                return C2358.f7817;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return (App) this.f13858;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((InterfaceC1126) this.f13858).mo2353(((C1553) obj2).f5241);
                return C2358.f7817;
            case 8:
                MainActivity mainActivity = (MainActivity) this.f13858;
                C5362 c5365 = (C5362) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                MainActivity mainActivity2 = MainActivity.f411;
                new C4441(new long[]{-6030698034217960009L, -4889539325488255997L, 2532011515366627986L, 7484932877775076493L, 1578141369572544053L, 3737926875855286559L}).toString();
                if (c5365.m9011(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC2873.m5441(mainActivity, false, false, C3133.f10547, c5365, 3072);
                } else {
                    c5365.m8982();
                }
                return C2358.f7817;
            case 9:
                AbstractC4968 abstractC4968 = (AbstractC4968) this.f13858;
                C5362 c5366 = (C5362) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                new C4441(new long[]{-6109511412910425124L, -186966625789237671L, 6939822163834826326L, -4982288713587555425L, -6247716161130399883L, 6594207910658575181L, -6625293723482296336L, 8423843616600871651L}).toString();
                if (c5366.m9011(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC0495.m1105(C3133.m5804(abstractC4968.f16444, c5366), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5366.m8997(AbstractC4957.f16399)).f14539, c5366, 0, 0, 131070);
                } else {
                    c5366.m8982();
                }
                return C2358.f7817;
            case 10:
                ((Integer) obj2).getClass();
                C5063.m8653((C5081) this.f13858, (C5362) obj, AbstractC3831.m6835(1));
                return C2358.f7817;
            case 11:
                ((Integer) obj2).getClass();
                C5063.m8627((C2247) this.f13858, (C5362) obj, AbstractC3831.m6835(9));
                return C2358.f7817;
            case 12:
                ((Integer) obj2).getClass();
                ((C4842) this.f13858).mo1384(AbstractC3831.m6835(1), (C5362) obj);
                return C2358.f7817;
            case 13:
                C1705 c1705 = (C1705) this.f13858;
                C4207 c4207 = (C4207) obj;
                EnumC0845 enumC0845 = EnumC0845.f3013;
                EnumC0845 enumC0846 = EnumC0845.f3015;
                float fM6551 = C3693.m6551(((C3693) obj2).f12325);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                EnumC0845 enumC0847 = EnumC0845.f3016;
                linkedHashMap.put(enumC0847, Float.valueOf(fM6551));
                float f = fM6551 / 2.0f;
                if (((int) (c4207.f13969 & 4294967295L)) > f && !c1705.f5674) {
                    linkedHashMap.put(enumC0845, Float.valueOf(f));
                }
                int i2 = (int) (c4207.f13969 & 4294967295L);
                if (i2 != 0) {
                    linkedHashMap.put(enumC0846, Float.valueOf(Math.max(0.0f, fM6551 - i2)));
                }
                C3402 c3402 = new C3402(linkedHashMap);
                int iOrdinal = ((EnumC0845) c1705.f5675.f14991.getValue()).ordinal();
                if (iOrdinal == 0) {
                    enumC0846 = enumC0847;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C1078.m2275();
                        return null;
                    }
                    if (!linkedHashMap.containsKey(enumC0845)) {
                        enumC0845 = linkedHashMap.containsKey(enumC0846) ? enumC0846 : enumC0847;
                    }
                    enumC0846 = enumC0845;
                } else if (!linkedHashMap.containsKey(enumC0846)) {
                    enumC0846 = enumC0847;
                }
                return new C3869(c3402, enumC0846);
            case 14:
                C4363 c4363 = (C4363) this.f13858;
                Set set = (Set) obj;
                synchronized (c4363.f18660) {
                    try {
                        C3262 c3262 = c4363.f14371;
                        C0079 c0079 = new C0079(24, set, c4363);
                        AbstractC3801.m6782(1, c0079);
                        Object[] objArr = c3262.f10947;
                        long[] jArr = c3262.f10948;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        if ((j & 255) < 128) {
                                            c0079.mo211(objArr[(i3 << 3) + i5]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i4 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        C3639 c36311 = c4363.f14369;
                        Object[] objArr2 = c36311.f12174;
                        long[] jArr2 = c36311.f12175;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j2 = jArr2[i6];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        if ((j2 & 255) < 128) {
                                            ((InterfaceC4783) objArr2[(i6 << 3) + i8]).mo5597(C2358.f7817);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i7 == 8) {
                                        if (i6 != length2) {
                                            i6++;
                                        }
                                    }
                                } else if (i6 != length2) {
                                    i6++;
                                }
                            }
                        }
                        c4363.f14369.m6493();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C2358.f7817;
            case 15:
                C0469 c0469 = (C0469) this.f13858;
                Set set2 = (Set) obj;
                synchronized (c0469.f1693) {
                    try {
                        if (((EnumC3359) c0469.f1710.getValue()).compareTo(EnumC3359.f11224) >= 0) {
                            C3639 c36312 = c0469.f1703;
                            if (set2 instanceof C0675) {
                                C3639 c36313 = ((C0675) set2).f2475;
                                Object[] objArr3 = c36313.f12174;
                                long[] jArr3 = c36313.f12175;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j3 = jArr3[i9];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length3)) >>> 31);
                                            for (?? r13 = z; r13 < i10; r13++) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj3 = objArr3[(i9 << 3) + r13];
                                                    if (!(obj3 instanceof AbstractC2975) || ((AbstractC2975) obj3).m5526(1)) {
                                                        c36312.m6495(obj3);
                                                    }
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i10 == 8) {
                                                if (i9 != length3) {
                                                    i9++;
                                                    z = false;
                                                }
                                            }
                                        } else if (i9 != length3) {
                                            i9++;
                                            z = false;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof AbstractC2975) || ((AbstractC2975) obj4).m5526(1)) {
                                        c36312.m6495(obj4);
                                    }
                                }
                            }
                            interfaceC4242M996 = c0469.m996();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (interfaceC4242M996 != null) {
                    ((C2600) interfaceC4242M996).mo335(C2358.f7817);
                }
                return C2358.f7817;
            case 16:
                C3049 c3049 = (C3049) this.f13858;
                int iIntValue5 = ((Integer) obj).intValue();
                InterfaceC4137 interfaceC4137 = (InterfaceC4137) obj2;
                InterfaceC2218 key = interfaceC4137.getKey();
                InterfaceC4137 interfaceC4137Mo865 = c3049.f10252.mo865(key);
                if (key == C1397.f4791) {
                    InterfaceC3196 interfaceC3197 = (InterfaceC3196) interfaceC4137Mo865;
                    InterfaceC3196 parent = (InterfaceC3196) interfaceC4137;
                    while (parent != null) {
                        if (parent != interfaceC3197 && (parent instanceof C5555)) {
                            InterfaceC3101 interfaceC3101 = (InterfaceC3101) AbstractC3456.f11473.getObjectVolatile((C5555) parent, AbstractC0386.f1443);
                            parent = interfaceC3101 != null ? interfaceC3101.getParent() : null;
                        } else {
                            interfaceC3196 = parent;
                            if (interfaceC3196 == interfaceC3197) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC3196 + ", expected child of " + interfaceC3197 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC3197 != null) {
                                iIntValue5++;
                            }
                        }
                    }
                    if (interfaceC3196 == interfaceC3197) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC3196 + ", expected child of " + interfaceC3197 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC3197 != null) {
                        iIntValue5++;
                    }
                } else if (interfaceC4137 != interfaceC4137Mo865) {
                    iIntValue5 = Integer.MIN_VALUE;
                } else {
                    iIntValue5++;
                }
                return Integer.valueOf(iIntValue5);
            case 17:
                C2677 c2677 = (C2677) this.f13858;
                AbstractC2765.m5135(c2677.m9076(), null, 0, new C0140(c2677, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 18:
                C1314 c1314 = (C1314) this.f13858;
                ((C3536) obj).m6327();
                c1314.f4535 = ((C1553) obj2).f5241;
                return C2358.f7817;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC0993.m2129((C2197) this.f13858, (C5362) obj, AbstractC3831.m6835(1));
                return C2358.f7817;
            case 20:
                SideActivity sideActivity = (SideActivity) this.f13858;
                C5362 c5367 = (C5362) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                SideActivity sideActivity2 = SideActivity.f416;
                new C4441(new long[]{1865193722708382254L, -2518130285515331629L, -1294263079181242725L, 472741675575088345L, -2964930226808106502L, -7504008915746635679L}).toString();
                if (c5367.m9011(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC2873.m5441(sideActivity, false, false, AbstractC4554.f15048, c5367, 3072);
                } else {
                    c5367.m8982();
                }
                return C2358.f7817;
            case 21:
                C4683 c4683 = (C4683) this.f13858;
                Set set3 = (Set) obj;
                synchronized (c4683.f18660) {
                    try {
                        C3639 c36314 = c4683.f15426;
                        if (c36314 != null) {
                            Object[] objArr4 = c36314.f12174;
                            long[] jArr4 = c36314.f12175;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j4 = jArr4[i11];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length4)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j4 & 255) >= 128 || !set3.contains(objArr4[(i11 << 3) + i13])) {
                                                    j4 >>= 8;
                                                    i13++;
                                                } else {
                                                    interfaceC4783 = c4683.f15427;
                                                }
                                            } else if (i12 == 8) {
                                                if (i11 != length4) {
                                                    i11++;
                                                }
                                            }
                                        }
                                    } else if (i11 != length4) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (AbstractC0973.m2044(set3, c4683.f15430)) {
                            interfaceC4783 = c4683.f15427;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (interfaceC4783 != null) {
                    interfaceC4783.mo5597(C2358.f7817);
                }
                return C2358.f7817;
            case 22:
                C5389 c5389 = (C5389) this.f13858;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = c5389.f17813;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        objM2049 = set4;
                    } else if (obj5 instanceof Set) {
                        objM2049 = AbstractC2164.m4188(new Set[]{obj5, set4});
                    } else {
                        if (!(obj5 instanceof List)) {
                            AbstractC5508.m9200("Unexpected notification");
                            C1078.m2274();
                            return null;
                        }
                        objM2049 = AbstractC0973.m2049((Collection) obj5, Collections.singletonList(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj5, objM2049)) {
                            if (c5389.m9078()) {
                                c5389.f17815.mo211(new C0463(i, c5389));
                            }
                            return C2358.f7817;
                        }
                    } while (atomicReference.get() == obj5);
                }
                break;
            case 23:
                List list = (List) this.f13858;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        C0178.m384("List is empty.");
                        return null;
                    }
                    if (size != 1) {
                        C1078.m2272("List has more than one element.");
                        return null;
                    }
                    String str7 = (String) list.get(0);
                    int iM1532 = AbstractC0684.m1532(charSequence, str7, iIntValue7, false, 4);
                    if (iM1532 < 0) {
                        c3869 = null;
                    } else {
                        c3869 = new C3869(Integer.valueOf(iM1532), str7);
                    }
                } else {
                    if (iIntValue7 < 0) {
                        iIntValue7 = 0;
                    }
                    C3046 c3046 = new C3046(iIntValue7, charSequence.length(), 1);
                    int i14 = c3046.f6004;
                    int i15 = c3046.f6005;
                    if (charSequence instanceof String) {
                        if ((i14 <= 0 || iIntValue7 > i15) && (i14 >= 0 || i15 > iIntValue7)) {
                            c3869 = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c3869 = new C3869(Integer.valueOf(iIntValue7), str3);
                                    } else if (iIntValue7 != i15) {
                                        iIntValue7 += i14;
                                    } else {
                                        c3869 = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue7, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c3869 = new C3869(Integer.valueOf(iIntValue7), str3);
                                } else if (iIntValue7 != i15) {
                                    iIntValue7 += i14;
                                } else {
                                    c3869 = null;
                                }
                            }
                        }
                    } else if ((i14 <= 0 || iIntValue7 > i15) && (i14 >= 0 || i15 > iIntValue7)) {
                        c3869 = null;
                    } else {
                        int i16 = iIntValue7;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c3869 = new C3869(Integer.valueOf(i16), str);
                                } else if (i16 != i15) {
                                    i16 += i14;
                                }
                            } while (!AbstractC0684.m1520(str2, 0, charSequence, i16, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                c3869 = new C3869(Integer.valueOf(i16), str);
                            } else if (i16 != i15) {
                                i16 += i14;
                            }
                        }
                        c3869 = null;
                    }
                }
                if (c3869 != null) {
                    return new C3869(c3869.f12915, Integer.valueOf(((String) c3869.f12914).length()));
                }
                return null;
            case 24:
                int iM1522 = AbstractC0684.m1522((CharSequence) obj, (char[]) this.f13858, ((Integer) obj2).intValue(), false);
                if (iM1522 < 0) {
                    return null;
                }
                return new C3869(Integer.valueOf(iM1522), 1);
            case 25:
                TextClassification textClassification = (TextClassification) this.f13858;
                C5362 c5368 = (C5362) obj;
                ((Integer) obj2).getClass();
                c5368.m8957(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                c5368.m9009(false);
                return strValueOf;
            case 26:
                RemoteAction remoteAction = (RemoteAction) this.f13858;
                C5362 c5369 = (C5362) obj;
                ((Integer) obj2).intValue();
                c5369.m8957(-1376593684);
                String string = remoteAction.getTitle().toString();
                c5369.m9009(false);
                return string;
            case 27:
                ((Integer) obj2).getClass();
                ((C0165) this.f13858).m351(AbstractC3831.m6835(1), (C5362) obj);
                return C2358.f7817;
            default:
                ((InterfaceC4745) this.f13858).mo211(obj);
                return C2358.f7817;
        }
    }

    public /* synthetic */ C4164(int i, Object obj) {
        this.f13859 = i;
        this.f13858 = obj;
    }
}
