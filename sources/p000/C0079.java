package p000;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦٚ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0079 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f14950;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f14951;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14952;

    public /* synthetic */ C0079(int i, Object obj, Object obj2) {
        this.f14952 = i;
        this.f14951 = obj;
        this.f14950 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9 A[LOOP:0: B:29:0x00b3->B:39:0x00e9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [ۥَؕؒٝ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f14952;
        int i2 = 7;
        final int i3 = 2;
        final int i4 = 3;
        ?? r9 = 0;
        final int i5 = 1;
        boolean z = false;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f14950;
        Object obj3 = this.f14951;
        switch (i) {
            case 0:
                ((C2243) obj3).m4291((C0199) obj2);
                return c2358;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                C0086 c0086 = (C0086) obj2;
                Object obj4 = ((C0514) ((C0954) obj).f3387.f4868).f1837.thisObject;
                Application application = (Application) (obj4 instanceof Application ? obj4 : 0);
                if (application != null && atomicBoolean.compareAndSet(false, true)) {
                    c0086.mo211(application);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3896 c3896 = (C3896) obj3;
                C3378 c3378 = (C3378) obj2;
                C2321 c2321 = c3896.f13016;
                if (c2321 != null) {
                    c2321.m4364();
                }
                c3896.f13016 = null;
                C3529 c3529 = c3378.f11265;
                if (c3529 != null) {
                    c3529.m854(c2358);
                }
                c3378.f11265 = null;
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) obj2;
                C5745 c5745 = (C5745) obj;
                if (!AbstractC3831.m6874((C5745) obj3, c5745)) {
                    interfaceC4745.mo211(c5745);
                }
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC2765.m5135((InterfaceC4643) obj3, null, 0, new C0023((EnumC4125) obj, (C4153) obj2, r9, 6), 3);
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0548 abstractC0548 = (AbstractC0548) obj2;
                C2497 c2497 = (C2497) obj;
                c2497.m4644();
                InterfaceC2442.m4565(c2497, (C0935) obj3, abstractC0548, 0.0f, null, 60);
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C2497 c2498 = (C2497) obj;
                c2498.m4644();
                InterfaceC2442.m4565(c2498, ((C0889) obj3).f3231, (AbstractC0548) obj2, 0.0f, null, 60);
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                InterfaceC4745 interfaceC4746 = (InterfaceC4745) obj2;
                if (!((C1705) obj3).m3525()) {
                    interfaceC4746.mo211(Boolean.FALSE);
                }
                return c2358;
            case 8:
                C1347 c1347 = (C1347) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = ((C3973) obj2).f13283;
                if (zBooleanValue) {
                    c1347.add(str);
                } else {
                    c1347.remove(str);
                }
                return c2358;
            case 9:
                ((C0863) ((C4228) obj3).f14025).m1848((C2769) obj2);
                return c2358;
            case 10:
                C5662 c5662 = (C5662) obj2;
                z = c5662.f18631 || ((InterfaceC0124) obj).mo225((C3410) obj3);
                c5662.f18631 = z;
                break;
            case 11:
                C5662 c5663 = (C5662) obj2;
                z = c5663.f18631 || ((InterfaceC0124) obj).mo224((C3536) obj3);
                c5663.f18631 = z;
                break;
            case 12:
                C5837 c5837 = (C5837) obj3;
                AbstractC0548 abstractC0549 = (AbstractC0548) obj2;
                C2497 c2499 = (C2497) obj;
                c2499.m4644();
                if (((Boolean) c5837.f19222.getValue()).booleanValue() || ((Boolean) c5837.f19227.getValue()).booleanValue()) {
                    InterfaceC2442.m4566(c2499, abstractC0549, 0L, 0L, 0.0f, null, 126);
                }
                return c2358;
            case 13:
                ((C1894) obj3).f6277.m5813((InterfaceC3879) obj, (C0451) obj2);
                return c2358;
            case 14:
                C0570 c0570 = (C0570) obj3;
                long jM3305 = C1553.m3305(1.0f, ((C4640) obj).f15313);
                EnumC1616 enumC1616 = ((C3923) obj2).f13079;
                C5499 c5499 = AbstractC2481.f8273;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC1616 == EnumC1616.f5425 ? jM3305 & 4294967295L : jM3305 >> 32));
                switch (c0570.f2045) {
                    case 0:
                        C4536 c4536 = (C4536) c0570.f2044;
                        C2099.m4045(c4536.f14995, c4536.m7857(fIntBitsToFloat));
                        return c2358;
                    default:
                        ((C2483) c0570.f2044).f8276.mo211(Float.valueOf(fIntBitsToFloat));
                        return c2358;
                }
            case 15:
                ((C2243) obj3).m4291((InterfaceC2714) obj2);
                return c2358;
            case 16:
                ((C5136) obj3).f17021.removeCallbacks((RunnableC5689) obj2);
                return c2358;
            case 17:
                C2069 c2069 = (C2069) obj3;
                c2069.f6832.m6500(obj2);
                return new C0235(z ? 1 : 0, c2069, obj2);
            case 18:
                return new C2069((InterfaceC0814) obj3, (Map) obj, (C5108) obj2);
            case 19:
                AbstractC1842 abstractC1842 = (AbstractC1842) obj;
                ArrayList arrayListM3415 = AbstractC1631.m3415((List) obj3, (InterfaceC4448) ((C3227) obj2).f10842);
                if (arrayListM3415 != null) {
                    int size = arrayListM3415.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        C3869 c3869 = (C3869) arrayListM3415.get(i6);
                        AbstractC0275 abstractC0275 = (AbstractC0275) c3869.f12915;
                        InterfaceC4448 interfaceC4448 = (InterfaceC4448) c3869.f12914;
                        AbstractC1842.m3624(abstractC1842, abstractC0275, interfaceC4448 != null ? ((C0873) interfaceC4448.mo449()).f3199 : 0L);
                    }
                }
                return c2358;
            case 20:
                final InterfaceC4367 interfaceC4367 = (InterfaceC4367) obj3;
                final C2247 c2247 = (C2247) obj2;
                C4801 c4801 = (C4801) obj;
                C4801.m8179(c4801, new C0857(188521788, new C3032(i2, interfaceC4367), true));
                C4801.m8179(c4801, new C0857(1915094451, new InterfaceC2609() { // from class: ۦؘٙؕٗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj5, Object obj6, Object obj7) {
                        int i7 = i3;
                        C2358 c2359 = C2358.f7817;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        C2247 c2248 = c2247;
                        C5362 c5362 = (C5362) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i7) {
                            case 0:
                                new C4441(new long[]{412221162311159980L, 228499163621790969L, -3799110959483983849L, -3674518501501713062L, 2930381338743772571L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8639((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{4010528765985914406L, -1042330927320161195L, -4484403570937921513L, 1140643879753277649L, 3186435683081474441L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8646((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{6756978068829981577L, -6514127886186012592L, -7555330350122815579L, -6645635617141232538L, 3026962142321239314L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8648((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            default:
                                new C4441(new long[]{172244591782811206L, 76009766757664326L, -539408356123907357L, 2415573300413730014L, 3958145354637627651L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8634((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                C4801.m8179(c4801, new C0857(219071092, new InterfaceC2609() { // from class: ۦؘٙؕٗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj5, Object obj6, Object obj7) {
                        int i7 = i4;
                        C2358 c2359 = C2358.f7817;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        C2247 c2248 = c2247;
                        C5362 c5362 = (C5362) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i7) {
                            case 0:
                                new C4441(new long[]{412221162311159980L, 228499163621790969L, -3799110959483983849L, -3674518501501713062L, 2930381338743772571L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8639((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{4010528765985914406L, -1042330927320161195L, -4484403570937921513L, 1140643879753277649L, 3186435683081474441L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8646((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{6756978068829981577L, -6514127886186012592L, -7555330350122815579L, -6645635617141232538L, 3026962142321239314L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8648((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            default:
                                new C4441(new long[]{172244591782811206L, 76009766757664326L, -539408356123907357L, 2415573300413730014L, 3958145354637627651L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8634((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                C4801.m8179(c4801, AbstractC2765.f9158);
                final int i7 = z ? 1 : 0;
                C4801.m8179(c4801, new C0857(1121991670, new InterfaceC2609() { // from class: ۦؘٙؕٗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj5, Object obj6, Object obj7) {
                        int i8 = i7;
                        C2358 c2359 = C2358.f7817;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        C2247 c2248 = c2247;
                        C5362 c5362 = (C5362) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i8) {
                            case 0:
                                new C4441(new long[]{412221162311159980L, 228499163621790969L, -3799110959483983849L, -3674518501501713062L, 2930381338743772571L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8639((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{4010528765985914406L, -1042330927320161195L, -4484403570937921513L, 1140643879753277649L, 3186435683081474441L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8646((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{6756978068829981577L, -6514127886186012592L, -7555330350122815579L, -6645635617141232538L, 3026962142321239314L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8648((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            default:
                                new C4441(new long[]{172244591782811206L, 76009766757664326L, -539408356123907357L, 2415573300413730014L, 3958145354637627651L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8634((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                C4681 c4681 = EnumC5073.f16826;
                c4801.f15839.m6301(c4681.mo624(), new C2963(null, new C4469(c4681, 0), new C0857(802480018, new C1672(c4681, z ? 1 : 0), true)));
                C4801.m8179(c4801, new C0857(-574031689, new C3032(5, c2247), true));
                C4801.m8179(c4801, new C0857(2024912248, new InterfaceC2609() { // from class: ۦؘٙؕٗ
                    @Override // p000.InterfaceC2609
                    /* JADX INFO: renamed from: ۦۙ */
                    public final Object mo1173(Object obj5, Object obj6, Object obj7) {
                        int i8 = i5;
                        C2358 c2359 = C2358.f7817;
                        InterfaceC4367 interfaceC4368 = interfaceC4367;
                        C2247 c2248 = c2247;
                        C5362 c5362 = (C5362) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        switch (i8) {
                            case 0:
                                new C4441(new long[]{412221162311159980L, 228499163621790969L, -3799110959483983849L, -3674518501501713062L, 2930381338743772571L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8639((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case 1:
                                new C4441(new long[]{4010528765985914406L, -1042330927320161195L, -4484403570937921513L, 1140643879753277649L, 3186435683081474441L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8646((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                new C4441(new long[]{6756978068829981577L, -6514127886186012592L, -7555330350122815579L, -6645635617141232538L, 3026962142321239314L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8648((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                            default:
                                new C4441(new long[]{172244591782811206L, 76009766757664326L, -539408356123907357L, 2415573300413730014L, 3958145354637627651L}).toString();
                                if (!c5362.m9011(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c5362.m8982();
                                } else {
                                    C5063.m8634((C1966) interfaceC4368.getValue(), c2248, c5362, 64);
                                }
                                break;
                        }
                        return c2359;
                    }
                }, true));
                C4801.m8179(c4801, AbstractC2765.f9162);
                return c2358;
            case 21:
                InterfaceC1066 interfaceC1066 = (InterfaceC1066) obj;
                InterfaceC0504[] interfaceC0504Arr = AbstractC3992.f13322;
                C3059 c3059 = AbstractC2771.f9226;
                InterfaceC0504 interfaceC0504 = AbstractC3992.f13322[11];
                interfaceC1066.mo2266(c3059, Float.valueOf(1.0f));
                AbstractC3992.m7130(interfaceC1066, (String) obj3);
                interfaceC1066.mo2266(AbstractC0208.f772, new C0078(null, new C4719(1, (InterfaceC4448) obj2)));
                return c2358;
            case 22:
                C5825 c5825 = (C5825) obj2;
                C1117 c1117 = (C1117) obj;
                float fM1711 = ((C1705) obj3).f5675.f14997.m1711();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1117.f3916 & 4294967295L));
                if (!Float.isNaN(fM1711) && !Float.isNaN(fIntBitsToFloat2) && fIntBitsToFloat2 != 0.0f) {
                    float fFloatValue = ((Number) c5825.m9638()).floatValue();
                    c1117.m2347(AbstractC1418.m3019(c1117, fFloatValue));
                    c1117.m2345(AbstractC1418.m3015(c1117, fFloatValue));
                    c1117.m2343(AbstractC3801.m6753(0.5f, (fM1711 + fIntBitsToFloat2) / fIntBitsToFloat2));
                }
                return c2358;
            case 23:
                ((C4363) obj3).f14368.add(new C5896(obj, (InterfaceC4783) obj2));
                return c2358;
            case 24:
                C4363 c4363 = (C4363) obj2;
                if (((Set) obj3).contains(obj)) {
                    C3262 c3262 = c4363.f14371;
                    C3639 c3639 = c4363.f14369;
                    Object objM6027 = c3262.m6027(obj);
                    if (objM6027 != null) {
                        if (objM6027 instanceof C3639) {
                            C3639 c36310 = (C3639) objM6027;
                            Object[] objArr = c36310.f12174;
                            long[] jArr = c36310.f12175;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j = jArr[i8];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((255 & j) < 128) {
                                                c3639.m6495((InterfaceC4783) objArr[(i8 << 3) + i10]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i9 == 8) {
                                            if (i8 != length) {
                                                i8++;
                                            }
                                        }
                                    } else if (i8 != length) {
                                        i8++;
                                    }
                                }
                            }
                        } else {
                            c3639.m6495((InterfaceC4783) objM6027);
                        }
                    }
                }
                return c2358;
            case 25:
                ((C2127) obj3).mo871(null);
                ((C3002) obj2).mo5597((AbstractC3750) obj);
                return c2358;
            case 26:
                C4196 c4196 = (C4196) obj3;
                AbstractC0275 abstractC0276 = (AbstractC0275) obj2;
                AbstractC1842 abstractC1843 = (AbstractC1842) obj;
                boolean z2 = c4196.f13949;
                float f = c4196.f13946;
                if (z2) {
                    AbstractC1842.m3623(abstractC1843, abstractC0276, abstractC1843.mo743(f), abstractC1843.mo743(c4196.f13950));
                } else {
                    AbstractC1842.m3626(abstractC1843, abstractC0276, abstractC1843.mo743(f), abstractC1843.mo743(c4196.f13950));
                }
                return c2358;
            case 27:
                InterfaceC5731 interfaceC5731 = (InterfaceC5731) obj3;
                Integer numValueOf = Integer.valueOf(((C2830) obj).f9455);
                C2257 c2257 = (C2257) ((C2808) obj2).f9376;
                interfaceC5731.mo219(numValueOf, Integer.valueOf((c2257 != null ? c2257 : null).f7490));
                return c2358;
            case 28:
                AbstractC1842 abstractC1844 = (AbstractC1842) obj;
                C2810 c2810 = new C2810(i5, (ArrayList) obj2);
                abstractC1844.f6113 = true;
                c2810.mo211(abstractC1844);
                abstractC1844.f6113 = false;
                ((InterfaceC4367) obj3).getValue();
                return c2358;
            default:
                ((C3680) obj3).f12292.m5813((InterfaceC3879) obj, (C5435) obj2);
                return c2358;
        }
        return Boolean.valueOf(!z);
    }
}
