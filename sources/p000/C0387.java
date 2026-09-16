package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۥَؔؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0387 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f1444;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f1445 = new ArrayList();

    public C0387(int i) {
        this.f1444 = i;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C2929 m893(C1489 c1489, ArrayList arrayList) {
        EnumC3130 enumC3130 = EnumC3130.f10534;
        AbstractC1605.m3371(2, "FN", arrayList);
        InterfaceC2150 interfaceC2150M4397 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
        InterfaceC2150 interfaceC2150M4398 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
        if (!(interfaceC2150M4398 instanceof C1173)) {
            C1078.m2272(AbstractC3761.m6628("FN requires an ArrayValue of parameter names found ", interfaceC2150M4398.getClass().getCanonicalName()));
            return null;
        }
        List listM2501 = ((C1173) interfaceC2150M4398).m2501();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C2929(interfaceC2150M4397.mo1607(), (ArrayList) listM2501, arrayList2, c1489);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static InterfaceC2150 m894(C0273 c0273, InterfaceC2150 interfaceC2150, InterfaceC2150 interfaceC2151) {
        if (interfaceC2150 instanceof Iterable) {
            return m898(c0273, ((Iterable) interfaceC2150).iterator(), interfaceC2151);
        }
        C1078.m2272("Non-iterable type in for...of loop.");
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static boolean m895(InterfaceC2150 interfaceC2150, InterfaceC2150 interfaceC2151) {
        if (interfaceC2150.getClass().equals(interfaceC2151.getClass())) {
            if ((interfaceC2150 instanceof C4607) || (interfaceC2150 instanceof C4493)) {
                return true;
            }
            if (interfaceC2150 instanceof C5563) {
                return (Double.isNaN(interfaceC2150.mo1610().doubleValue()) || Double.isNaN(interfaceC2151.mo1610().doubleValue()) || interfaceC2150.mo1610().doubleValue() != interfaceC2151.mo1610().doubleValue()) ? false : true;
            }
            if (interfaceC2150 instanceof C2485) {
                return interfaceC2150.mo1607().equals(interfaceC2151.mo1607());
            }
            if (interfaceC2150 instanceof C0726) {
                return interfaceC2150.mo1609().equals(interfaceC2151.mo1609());
            }
            return interfaceC2150 == interfaceC2151;
        }
        if (((interfaceC2150 instanceof C4607) || (interfaceC2150 instanceof C4493)) && ((interfaceC2151 instanceof C4607) || (interfaceC2151 instanceof C4493))) {
            return true;
        }
        boolean z = interfaceC2150 instanceof C5563;
        if (z && (interfaceC2151 instanceof C2485)) {
            return m895(interfaceC2150, new C5563(interfaceC2151.mo1610()));
        }
        boolean z2 = interfaceC2150 instanceof C2485;
        if (z2 && (interfaceC2151 instanceof C5563)) {
            return m895(new C5563(interfaceC2150.mo1610()), interfaceC2151);
        }
        if (interfaceC2150 instanceof C0726) {
            return m895(new C5563(interfaceC2150.mo1610()), interfaceC2151);
        }
        if (interfaceC2151 instanceof C0726) {
            return m895(interfaceC2150, new C5563(interfaceC2151.mo1610()));
        }
        if ((z2 || z) && (interfaceC2151 instanceof InterfaceC4687)) {
            return m895(interfaceC2150, new C2485(interfaceC2151.mo1607()));
        }
        if ((interfaceC2150 instanceof InterfaceC4687) && ((interfaceC2151 instanceof C2485) || (interfaceC2151 instanceof C5563))) {
            return m895(new C2485(interfaceC2150.mo1607()), interfaceC2151);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static boolean m896(InterfaceC2150 interfaceC2150, InterfaceC2150 interfaceC2151) {
        if (interfaceC2150 instanceof InterfaceC4687) {
            interfaceC2150 = new C2485(interfaceC2150.mo1607());
        }
        if (interfaceC2151 instanceof InterfaceC4687) {
            interfaceC2151 = new C2485(interfaceC2151.mo1607());
        }
        return (((interfaceC2150 instanceof C2485) && (interfaceC2151 instanceof C2485)) || !(Double.isNaN(interfaceC2150.mo1610().doubleValue()) || Double.isNaN(interfaceC2151.mo1610().doubleValue()))) && !m897(interfaceC2151, interfaceC2150);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static boolean m897(InterfaceC2150 interfaceC2150, InterfaceC2150 interfaceC2151) {
        if (interfaceC2150 instanceof InterfaceC4687) {
            interfaceC2150 = new C2485(interfaceC2150.mo1607());
        }
        if (interfaceC2151 instanceof InterfaceC4687) {
            interfaceC2151 = new C2485(interfaceC2151.mo1607());
        }
        if ((interfaceC2150 instanceof C2485) && (interfaceC2151 instanceof C2485)) {
            return ((C2485) interfaceC2150).f8277.compareTo(((C2485) interfaceC2151).f8277) < 0;
        }
        double dDoubleValue = interfaceC2150.mo1610().doubleValue();
        double dDoubleValue2 = interfaceC2151.mo1610().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static InterfaceC2150 m898(C0273 c0273, Iterator it, InterfaceC2150 interfaceC2150) {
        C1489 c1489M3148;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2150 interfaceC2151 = (InterfaceC2150) it.next();
                switch (c0273.f976) {
                    case 0:
                        c1489M3148 = c0273.f975.m3148();
                        String str = c0273.f974;
                        c1489M3148.m3154(str, interfaceC2151);
                        ((HashMap) c1489M3148.f5056).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c1489M3148 = c0273.f975.m3148();
                        c1489M3148.m3154(c0273.f974, interfaceC2151);
                        break;
                    default:
                        c1489M3148 = c0273.f975;
                        c1489M3148.m3154(c0273.f974, interfaceC2151);
                        break;
                }
                InterfaceC2150 interfaceC2150M3127 = c1489M3148.m3127((C1173) interfaceC2150);
                if (interfaceC2150M3127 instanceof C1710) {
                    C1710 c1710 = (C1710) interfaceC2150M3127;
                    String str2 = c1710.f5682;
                    if ("break".equals(str2)) {
                        return InterfaceC2150.f7060;
                    }
                    if ("return".equals(str2)) {
                        return c1710;
                    }
                }
            }
        }
        return InterfaceC2150.f7060;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m899(String str) {
        if (!this.f1445.contains(AbstractC1605.m3343(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code duplicated, block: B:401:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [ۥٌّۣؖ] */
    /* JADX WARN: Type inference failed for: r10v347, types: [ۦٜۚؓٛ] */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r10v384 */
    /* JADX WARN: Type inference failed for: r12v0, types: [ۥؚٖٗ] */
    /* JADX WARN: Type inference failed for: r7v54, types: [ۥُۘؓۜ] */
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2150 m900(String str, C1489 c1489, ArrayList arrayList) {
        boolean zM895;
        boolean zM896;
        InterfaceC2150 interfaceC2150;
        InterfaceC2150 interfaceC2150M3127;
        C4607 c4607;
        C1710 c1710;
        InterfaceC2150 c2485;
        ?? c1173;
        String str2;
        int i = 1;
        int i2 = 2;
        int i3 = 0;
        switch (this.f1444) {
            case 0:
                EnumC3130 enumC3130 = EnumC3130.f10534;
                switch (AbstractC1605.m3343(str).ordinal()) {
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        AbstractC1605.m3330(2, "BITWISE_AND", arrayList);
                        return new C5563(Double.valueOf(AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) & AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())));
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        AbstractC1605.m3330(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new C5563(Double.valueOf(AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) << ((int) (((long) AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())) & 31))));
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        AbstractC1605.m3330(1, "BITWISE_NOT", arrayList);
                        return new C5563(Double.valueOf(~AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue())));
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        AbstractC1605.m3330(2, "BITWISE_OR", arrayList);
                        return new C5563(Double.valueOf(AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) | AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())));
                    case 8:
                        AbstractC1605.m3330(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new C5563(Double.valueOf(AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) >> ((int) (((long) AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())) & 31))));
                    case 9:
                        AbstractC1605.m3330(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new C5563(Double.valueOf((((long) AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue())) & 4294967295L) >>> ((int) (((long) AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())) & 31))));
                    case 10:
                        AbstractC1605.m3330(2, "BITWISE_XOR", arrayList);
                        return new C5563(Double.valueOf(AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()) ^ AbstractC1605.m3354(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())));
                    default:
                        m899(str);
                        throw null;
                }
            case 1:
                AbstractC1605.m3330(2, AbstractC1605.m3343(str).name(), arrayList);
                InterfaceC2150 interfaceC2150M4397 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                InterfaceC2150 interfaceC2150M4398 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                int iOrdinal = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zM896 = m895(interfaceC2150M4397, interfaceC2150M4398);
                    } else if (iOrdinal == 42) {
                        zM895 = m897(interfaceC2150M4397, interfaceC2150M4398);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zM895 = m897(interfaceC2150M4398, interfaceC2150M4397);
                                break;
                            case 38:
                                zM895 = m896(interfaceC2150M4398, interfaceC2150M4397);
                                break;
                            case 39:
                                zM895 = AbstractC1605.m3350(interfaceC2150M4397, interfaceC2150M4398);
                                break;
                            case 40:
                                zM896 = AbstractC1605.m3350(interfaceC2150M4397, interfaceC2150M4398);
                                break;
                            default:
                                m899(str);
                                throw null;
                        }
                    } else {
                        zM895 = m896(interfaceC2150M4397, interfaceC2150M4398);
                    }
                    zM895 = !zM896;
                } else {
                    zM895 = m895(interfaceC2150M4397, interfaceC2150M4398);
                }
                return zM895 ? InterfaceC2150.f7055 : InterfaceC2150.f7056;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                EnumC3130 enumC3131 = EnumC3130.f10534;
                int iOrdinal2 = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal2 == 2) {
                    AbstractC1605.m3330(3, "APPLY", arrayList);
                    InterfaceC2150 interfaceC2151 = (InterfaceC2150) arrayList.get(0);
                    C2346 c2346 = (C2346) c1489.f5057;
                    C2346 c2347 = (C2346) c1489.f5057;
                    InterfaceC2150 interfaceC2150M4399 = c2346.m4397(c1489, interfaceC2151);
                    String strMo1607 = c2347.m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1607();
                    InterfaceC2150 interfaceC2150M43910 = c2347.m4397(c1489, (InterfaceC2150) arrayList.get(2));
                    if (!(interfaceC2150M43910 instanceof C1173)) {
                        C1078.m2272(AbstractC3761.m6628("Function arguments for Apply are not a list found ", interfaceC2150M43910.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strMo1607.isEmpty()) {
                        return interfaceC2150M4399.mo1608(strMo1607, c1489, (ArrayList) ((C1173) interfaceC2150M43910).m2501());
                    }
                    C1078.m2272("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    AbstractC1605.m3330(0, "BREAK", arrayList);
                    return InterfaceC2150.f7058;
                }
                if (iOrdinal2 == 25) {
                    return m893(c1489, arrayList);
                }
                if (iOrdinal2 == 41) {
                    AbstractC1605.m3371(2, "IF", arrayList);
                    InterfaceC2150 interfaceC2152 = (InterfaceC2150) arrayList.get(0);
                    C2346 c2348 = (C2346) c1489.f5057;
                    C2346 c2349 = (C2346) c1489.f5057;
                    InterfaceC2150 interfaceC2150M43911 = c2348.m4397(c1489, interfaceC2152);
                    InterfaceC2150 interfaceC2150M43912 = c2349.m4397(c1489, (InterfaceC2150) arrayList.get(1));
                    InterfaceC2150 interfaceC2150M43913 = arrayList.size() > 2 ? c2349.m4397(c1489, (InterfaceC2150) arrayList.get(2)) : null;
                    C4607 c4608 = InterfaceC2150.f7060;
                    if (!interfaceC2150M43911.mo1609().booleanValue()) {
                        if (interfaceC2150M43913 != null) {
                            interfaceC2150M3127 = c1489.m3127((C1173) interfaceC2150M43913);
                        } else {
                            interfaceC2150 = c4608;
                        }
                        if (true != (interfaceC2150 instanceof C1710)) {
                            return c4608;
                        }
                        return interfaceC2150;
                    }
                    interfaceC2150M3127 = c1489.m3127((C1173) interfaceC2150M43912);
                    interfaceC2150 = interfaceC2150M3127;
                    if (true != (interfaceC2150 instanceof C1710)) {
                        return c4608;
                    }
                    return interfaceC2150;
                }
                if (iOrdinal2 == 54) {
                    return new C1173(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return InterfaceC2150.f7059;
                    }
                    AbstractC1605.m3330(1, "RETURN", arrayList);
                    return new C1710("return", ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        AbstractC1605.m3371(2, "DEFINE_FUNCTION", arrayList);
                        C2929 c2929M893 = m893(c1489, arrayList);
                        String str3 = c2929M893.f3772;
                        if (str3 == null) {
                            c1489.m3100("", c2929M893);
                            return c2929M893;
                        }
                        c1489.m3100(str3, c2929M893);
                        return c2929M893;
                    }
                    if (iOrdinal2 == 60) {
                        AbstractC1605.m3330(3, "SWITCH", arrayList);
                        InterfaceC2150 interfaceC2153 = (InterfaceC2150) arrayList.get(0);
                        C2346 c23410 = (C2346) c1489.f5057;
                        C2346 c23411 = (C2346) c1489.f5057;
                        InterfaceC2150 interfaceC2150M43914 = c23410.m4397(c1489, interfaceC2153);
                        InterfaceC2150 interfaceC2150M43915 = c23411.m4397(c1489, (InterfaceC2150) arrayList.get(1));
                        InterfaceC2150 interfaceC2150M43916 = c23411.m4397(c1489, (InterfaceC2150) arrayList.get(2));
                        if (!(interfaceC2150M43915 instanceof C1173)) {
                            C1078.m2272("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(interfaceC2150M43916 instanceof C1173)) {
                            C1078.m2272("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        C1173 c1174 = (C1173) interfaceC2150M43915;
                        C1173 c1175 = (C1173) interfaceC2150M43916;
                        boolean z = false;
                        for (int i4 = 0; i4 < c1174.m2495(); i4++) {
                            if (z || interfaceC2150M43914.equals(c23411.m4397(c1489, c1174.m2496(i4)))) {
                                InterfaceC2150 interfaceC2150M43917 = c23411.m4397(c1489, c1175.m2496(i4));
                                if (interfaceC2150M43917 instanceof C1710) {
                                    return ((C1710) interfaceC2150M43917).f5682.equals("break") ? InterfaceC2150.f7060 : interfaceC2150M43917;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (c1174.m2495() + 1 == c1175.m2495()) {
                            InterfaceC2150 interfaceC2150M43918 = c23411.m4397(c1489, c1175.m2496(c1174.m2495()));
                            if (interfaceC2150M43918 instanceof C1710) {
                                String str4 = ((C1710) interfaceC2150M43918).f5682;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return interfaceC2150M43918;
                                }
                            }
                        }
                        return InterfaceC2150.f7060;
                    }
                    if (iOrdinal2 == 61) {
                        AbstractC1605.m3330(3, "TERNARY", arrayList);
                        InterfaceC2150 interfaceC2154 = (InterfaceC2150) arrayList.get(0);
                        C2346 c23412 = (C2346) c1489.f5057;
                        C2346 c23413 = (C2346) c1489.f5057;
                        return c23412.m4397(c1489, interfaceC2154).mo1609().booleanValue() ? c23413.m4397(c1489, (InterfaceC2150) arrayList.get(1)) : c23413.m4397(c1489, (InterfaceC2150) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return c1489.m3148().m3127(new C1173(arrayList));
                        case 12:
                            AbstractC1605.m3330(0, "BREAK", arrayList);
                            return InterfaceC2150.f7057;
                        case 13:
                            break;
                        default:
                            m899(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return InterfaceC2150.f7060;
                }
                InterfaceC2150 interfaceC2150M43919 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                return interfaceC2150M43919 instanceof C1173 ? c1489.m3127((C1173) interfaceC2150M43919) : InterfaceC2150.f7060;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                EnumC3130 enumC3132 = EnumC3130.f10534;
                int iOrdinal3 = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal3 == 1) {
                    AbstractC1605.m3330(2, "AND", arrayList);
                    InterfaceC2150 interfaceC2150M43920 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    if (interfaceC2150M43920.mo1609().booleanValue()) {
                        return ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                    }
                    return interfaceC2150M43920;
                }
                if (iOrdinal3 == 47) {
                    AbstractC1605.m3330(1, "NOT", arrayList);
                    return new C0726(Boolean.valueOf(!((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1609().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    m899(str);
                    throw null;
                }
                AbstractC1605.m3330(2, "OR", arrayList);
                InterfaceC2150 interfaceC2150M43921 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                if (interfaceC2150M43921.mo1609().booleanValue()) {
                    return interfaceC2150M43921;
                }
                return ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                EnumC3130 enumC3133 = EnumC3130.f10534;
                int iOrdinal4 = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal4 == 65) {
                    AbstractC1605.m3330(4, "WHILE", arrayList);
                    InterfaceC2150 interfaceC2155 = (InterfaceC2150) arrayList.get(0);
                    InterfaceC2150 interfaceC2156 = (InterfaceC2150) arrayList.get(1);
                    InterfaceC2150 interfaceC2157 = (InterfaceC2150) arrayList.get(2);
                    InterfaceC2150 interfaceC2158 = (InterfaceC2150) arrayList.get(3);
                    C2346 c23414 = (C2346) c1489.f5057;
                    C2346 c23415 = (C2346) c1489.f5057;
                    InterfaceC2150 interfaceC2150M43922 = c23414.m4397(c1489, interfaceC2158);
                    if (c23415.m4397(c1489, interfaceC2157).mo1609().booleanValue()) {
                        InterfaceC2150 interfaceC2150M3128 = c1489.m3127((C1173) interfaceC2150M43922);
                        if (interfaceC2150M3128 instanceof C1710) {
                            C1710 c1711 = (C1710) interfaceC2150M3128;
                            String str5 = c1711.f5682;
                            if ("break".equals(str5)) {
                                return InterfaceC2150.f7060;
                            }
                            if ("return".equals(str5)) {
                                return c1711;
                            }
                        }
                    }
                    while (c23415.m4397(c1489, interfaceC2155).mo1609().booleanValue()) {
                        InterfaceC2150 interfaceC2150M3129 = c1489.m3127((C1173) interfaceC2150M43922);
                        if (interfaceC2150M3129 instanceof C1710) {
                            C1710 c1712 = (C1710) interfaceC2150M3129;
                            String str6 = c1712.f5682;
                            if ("break".equals(str6)) {
                                return InterfaceC2150.f7060;
                            }
                            if ("return".equals(str6)) {
                                return c1712;
                            }
                        }
                        c1489.m3152(interfaceC2156);
                    }
                    return InterfaceC2150.f7060;
                }
                switch (iOrdinal4) {
                    case 26:
                        AbstractC1605.m3330(3, "FOR_IN", arrayList);
                        if (!(arrayList.get(0) instanceof C2485)) {
                            C1078.m2272("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strMo1608 = ((InterfaceC2150) arrayList.get(0)).mo1607();
                        InterfaceC2150 interfaceC2150M43923 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                        InterfaceC2150 interfaceC2150M43924 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2));
                        Iterator itMo1606 = interfaceC2150M43923.mo1606();
                        if (itMo1606 != null) {
                            while (itMo1606.hasNext()) {
                                c1489.m3154(strMo1608, (InterfaceC2150) itMo1606.next());
                                InterfaceC2150 interfaceC2150M31210 = c1489.m3127((C1173) interfaceC2150M43924);
                                if (interfaceC2150M31210 instanceof C1710) {
                                    c1710 = (C1710) interfaceC2150M31210;
                                    String str7 = c1710.f5682;
                                    if ("break".equals(str7)) {
                                        c4607 = InterfaceC2150.f7060;
                                    } else if ("return".equals(str7)) {
                                        return c1710;
                                    }
                                }
                            }
                            c4607 = InterfaceC2150.f7060;
                        } else {
                            c4607 = InterfaceC2150.f7060;
                        }
                        return c4607;
                    case 27:
                        AbstractC1605.m3330(3, "FOR_IN_CONST", arrayList);
                        if (arrayList.get(0) instanceof C2485) {
                            return m898(new C0273(c1489, ((InterfaceC2150) arrayList.get(0)).mo1607(), i3), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1606(), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2)));
                        }
                        C1078.m2272("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case 28:
                        AbstractC1605.m3330(3, "FOR_IN_LET", arrayList);
                        if (!(arrayList.get(0) instanceof C2485)) {
                            C1078.m2272("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strMo1609 = ((InterfaceC2150) arrayList.get(0)).mo1607();
                        InterfaceC2150 interfaceC2150M43925 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                        InterfaceC2150 interfaceC2150M43926 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2));
                        Iterator itMo1607 = interfaceC2150M43925.mo1606();
                        if (itMo1607 != null) {
                            while (itMo1607.hasNext()) {
                                InterfaceC2150 interfaceC2159 = (InterfaceC2150) itMo1607.next();
                                C1489 c1489M3148 = c1489.m3148();
                                c1489M3148.m3154(strMo1609, interfaceC2159);
                                InterfaceC2150 interfaceC2150M31211 = c1489M3148.m3127((C1173) interfaceC2150M43926);
                                if (interfaceC2150M31211 instanceof C1710) {
                                    c1710 = (C1710) interfaceC2150M31211;
                                    String str8 = c1710.f5682;
                                    if ("break".equals(str8)) {
                                        c4607 = InterfaceC2150.f7060;
                                    } else if ("return".equals(str8)) {
                                        return c1710;
                                    }
                                }
                            }
                            c4607 = InterfaceC2150.f7060;
                        } else {
                            c4607 = InterfaceC2150.f7060;
                        }
                        return c4607;
                    case 29:
                        AbstractC1605.m3330(4, "FOR_LET", arrayList);
                        InterfaceC2150 interfaceC21510 = (InterfaceC2150) arrayList.get(0);
                        C2346 c23416 = (C2346) c1489.f5057;
                        C2346 c23417 = (C2346) c1489.f5057;
                        InterfaceC2150 interfaceC2150M43927 = c23416.m4397(c1489, interfaceC21510);
                        if (!(interfaceC2150M43927 instanceof C1173)) {
                            C1078.m2272("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        C1173 c1176 = (C1173) interfaceC2150M43927;
                        InterfaceC2150 interfaceC21511 = (InterfaceC2150) arrayList.get(1);
                        InterfaceC2150 interfaceC21512 = (InterfaceC2150) arrayList.get(2);
                        InterfaceC2150 interfaceC2150M43928 = c23417.m4397(c1489, (InterfaceC2150) arrayList.get(3));
                        C1489 c1489M3149 = c1489.m3148();
                        for (int i5 = 0; i5 < c1176.m2495(); i5++) {
                            String strMo16010 = c1176.m2496(i5).mo1607();
                            c1489M3149.m3100(strMo16010, c1489.m3146(strMo16010));
                        }
                        while (c23417.m4397(c1489, interfaceC21511).mo1609().booleanValue()) {
                            InterfaceC2150 interfaceC2150M31212 = c1489.m3127((C1173) interfaceC2150M43928);
                            if (interfaceC2150M31212 instanceof C1710) {
                                C1710 c1713 = (C1710) interfaceC2150M31212;
                                String str9 = c1713.f5682;
                                if ("break".equals(str9)) {
                                    return InterfaceC2150.f7060;
                                }
                                if ("return".equals(str9)) {
                                    return c1713;
                                }
                            }
                            C1489 c1489M31410 = c1489.m3148();
                            for (int i6 = 0; i6 < c1176.m2495(); i6++) {
                                String strMo16011 = c1176.m2496(i6).mo1607();
                                c1489M31410.m3100(strMo16011, c1489M3149.m3146(strMo16011));
                            }
                            c1489M31410.m3152(interfaceC21512);
                            c1489M3149 = c1489M31410;
                        }
                        return InterfaceC2150.f7060;
                    case 30:
                        AbstractC1605.m3330(3, "FOR_OF", arrayList);
                        if (arrayList.get(0) instanceof C2485) {
                            return m894(new C0273(c1489, ((InterfaceC2150) arrayList.get(0)).mo1607(), i2), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2)));
                        }
                        C1078.m2272("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        AbstractC1605.m3330(3, "FOR_OF_CONST", arrayList);
                        if (arrayList.get(0) instanceof C2485) {
                            return m894(new C0273(c1489, ((InterfaceC2150) arrayList.get(0)).mo1607(), i3), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2)));
                        }
                        C1078.m2272("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        AbstractC1605.m3330(3, "FOR_OF_LET", arrayList);
                        if (arrayList.get(0) instanceof C2485) {
                            return m894(new C0273(c1489, ((InterfaceC2150) arrayList.get(0)).mo1607(), i), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)), ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(2)));
                        }
                        C1078.m2272("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        m899(str);
                        throw null;
                }
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                EnumC3130 enumC3134 = EnumC3130.f10534;
                int iOrdinal5 = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal5 == 0) {
                    AbstractC1605.m3330(2, "ADD", arrayList);
                    InterfaceC2150 interfaceC2150M43929 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    InterfaceC2150 interfaceC2150M43930 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                    c2485 = ((interfaceC2150M43929 instanceof InterfaceC4687) || (interfaceC2150M43929 instanceof C2485) || (interfaceC2150M43930 instanceof InterfaceC4687) || (interfaceC2150M43930 instanceof C2485)) ? new C2485(String.valueOf(interfaceC2150M43929.mo1607()).concat(String.valueOf(interfaceC2150M43930.mo1607()))) : new C5563(Double.valueOf(interfaceC2150M43930.mo1610().doubleValue() + interfaceC2150M43929.mo1610().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    AbstractC1605.m3330(2, "DIVIDE", arrayList);
                    c2485 = new C5563(Double.valueOf(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue() / ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        AbstractC1605.m3330(2, "SUBTRACT", arrayList);
                        return new C5563(Double.valueOf(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue() + (-((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        AbstractC1605.m3330(2, str, arrayList);
                        InterfaceC2150 interfaceC2150M43931 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                        c1489.m3152((InterfaceC2150) arrayList.get(1));
                        return interfaceC2150M43931;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        AbstractC1605.m3330(1, str, arrayList);
                        return ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case 44:
                            AbstractC1605.m3330(2, "MODULUS", arrayList);
                            c2485 = new C5563(Double.valueOf(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue() % ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue()));
                            break;
                        case 45:
                            AbstractC1605.m3330(2, "MULTIPLY", arrayList);
                            return new C5563(Double.valueOf(((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1)).mo1610().doubleValue() * ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()));
                        case 46:
                            AbstractC1605.m3330(1, "NEGATE", arrayList);
                            return new C5563(Double.valueOf(-((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0)).mo1610().doubleValue()));
                        default:
                            m899(str);
                            throw null;
                    }
                }
                return c2485;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str == null || str.isEmpty() || !c1489.m3153(str)) {
                    C1078.m2272(AbstractC3761.m6628("Command not found: ", str));
                    return null;
                }
                InterfaceC2150 interfaceC2150M3146 = c1489.m3146(str);
                if (interfaceC2150M3146 instanceof AbstractC1079) {
                    return ((AbstractC1079) interfaceC2150M3146).mo779(c1489, arrayList);
                }
                C1078.m2272(AbstractC3761.m6629("Function ", str, " is not defined"));
                return null;
            default:
                EnumC3130 enumC3135 = EnumC3130.f10534;
                int iOrdinal6 = AbstractC1605.m3343(str).ordinal();
                if (iOrdinal6 == 3) {
                    AbstractC1605.m3330(2, "ASSIGN", arrayList);
                    InterfaceC2150 interfaceC2150M43932 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                    if (!(interfaceC2150M43932 instanceof C2485)) {
                        C1078.m2272(AbstractC3761.m6628("Expected string for assign var. got ", interfaceC2150M43932.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((C2485) interfaceC2150M43932).f8277;
                    if (!c1489.m3153(str10)) {
                        C1078.m2272(AbstractC3761.m6628("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    InterfaceC2150 interfaceC2150M43933 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                    c1489.m3100(str10, interfaceC2150M43933);
                    return interfaceC2150M43933;
                }
                if (iOrdinal6 == 14) {
                    AbstractC1605.m3371(2, "CONST", arrayList);
                    if (arrayList.size() % 2 != 0) {
                        C1078.m2272(AbstractC5078.m8670(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i3 < arrayList.size() - 1) {
                        InterfaceC2150 interfaceC2150M43934 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i3));
                        if (!(interfaceC2150M43934 instanceof C2485)) {
                            C1078.m2272(AbstractC3761.m6628("Expected string for const name. got ", interfaceC2150M43934.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((C2485) interfaceC2150M43934).f8277;
                        c1489.m3154(str11, ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i3 + 1)));
                        ((HashMap) c1489.f5056).put(str11, Boolean.TRUE);
                        i3 += 2;
                    }
                    return InterfaceC2150.f7060;
                }
                if (iOrdinal6 == 24) {
                    AbstractC1605.m3371(1, "EXPRESSION_LIST", arrayList);
                    c1173 = InterfaceC2150.f7060;
                    while (i3 < arrayList.size()) {
                        InterfaceC2150 interfaceC2150M43935 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i3));
                        if (interfaceC2150M43935 instanceof C1710) {
                            C1078.m2276("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i3++;
                        c1173 = interfaceC2150M43935;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        AbstractC1605.m3330(1, "GET", arrayList);
                        InterfaceC2150 interfaceC2150M43936 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                        if (interfaceC2150M43936 instanceof C2485) {
                            return c1489.m3146(((C2485) interfaceC2150M43936).f8277);
                        }
                        C1078.m2272(AbstractC3761.m6628("Expected string for get var. got ", interfaceC2150M43936.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        AbstractC1605.m3330(0, "NULL", arrayList);
                        return InterfaceC2150.f7054;
                    }
                    if (iOrdinal6 == 58) {
                        AbstractC1605.m3330(3, "SET_PROPERTY", arrayList);
                        InterfaceC2150 interfaceC21513 = (InterfaceC2150) arrayList.get(0);
                        C2346 c23418 = (C2346) c1489.f5057;
                        C2346 c23419 = (C2346) c1489.f5057;
                        InterfaceC2150 interfaceC2150M43937 = c23418.m4397(c1489, interfaceC21513);
                        InterfaceC2150 interfaceC2150M43938 = c23419.m4397(c1489, (InterfaceC2150) arrayList.get(1));
                        InterfaceC2150 interfaceC2150M43939 = c23419.m4397(c1489, (InterfaceC2150) arrayList.get(2));
                        if (interfaceC2150M43937 == InterfaceC2150.f7060 || interfaceC2150M43937 == InterfaceC2150.f7054) {
                            throw new IllegalStateException("Can't set property " + interfaceC2150M43938.mo1607() + " of " + interfaceC2150M43937.mo1607());
                        }
                        if ((interfaceC2150M43937 instanceof C1173) && (interfaceC2150M43938 instanceof C5563)) {
                            ((C1173) interfaceC2150M43937).m2494(((C5563) interfaceC2150M43938).f18369.intValue(), interfaceC2150M43939);
                            return interfaceC2150M43939;
                        }
                        if (!(interfaceC2150M43937 instanceof InterfaceC4687)) {
                            return interfaceC2150M43939;
                        }
                        ((InterfaceC4687) interfaceC2150M43937).mo2283(interfaceC2150M43938.mo1607(), interfaceC2150M43939);
                        return interfaceC2150M43939;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                AbstractC1605.m3330(2, "GET_PROPERTY", arrayList);
                                InterfaceC2150 interfaceC2150M43940 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                                InterfaceC2150 interfaceC2150M43941 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(1));
                                if ((interfaceC2150M43940 instanceof C1173) && AbstractC1605.m3341(interfaceC2150M43941)) {
                                    return ((C1173) interfaceC2150M43940).m2496(interfaceC2150M43941.mo1610().intValue());
                                }
                                if (interfaceC2150M43940 instanceof InterfaceC4687) {
                                    return ((InterfaceC4687) interfaceC2150M43940).mo2281(interfaceC2150M43941.mo1607());
                                }
                                if (interfaceC2150M43940 instanceof C2485) {
                                    if ("length".equals(interfaceC2150M43941.mo1607())) {
                                        return new C5563(Double.valueOf(((C2485) interfaceC2150M43940).f8277.length()));
                                    }
                                    if (AbstractC1605.m3341(interfaceC2150M43941)) {
                                        double dDoubleValue = interfaceC2150M43941.mo1610().doubleValue();
                                        String str12 = ((C2485) interfaceC2150M43940).f8277;
                                        if (dDoubleValue < str12.length()) {
                                            return new C2485(String.valueOf(str12.charAt(interfaceC2150M43941.mo1610().intValue())));
                                        }
                                    }
                                }
                                return InterfaceC2150.f7060;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    AbstractC1605.m3330(1, "TYPEOF", arrayList);
                                    InterfaceC2150 interfaceC2150M43942 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(0));
                                    if (interfaceC2150M43942 instanceof C4607) {
                                        str2 = "undefined";
                                    } else if (interfaceC2150M43942 instanceof C0726) {
                                        str2 = "boolean";
                                    } else if (interfaceC2150M43942 instanceof C5563) {
                                        str2 = "number";
                                    } else if (interfaceC2150M43942 instanceof C2485) {
                                        str2 = "string";
                                    } else if (interfaceC2150M43942 instanceof C2929) {
                                        str2 = "function";
                                    } else {
                                        if ((interfaceC2150M43942 instanceof C4837) || (interfaceC2150M43942 instanceof C1710)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC2150M43942));
                                        }
                                        str2 = "object";
                                    }
                                    return new C2485(str2);
                                case 63:
                                    AbstractC1605.m3330(0, "UNDEFINED", arrayList);
                                    return InterfaceC2150.f7060;
                                case 64:
                                    AbstractC1605.m3371(1, "VAR", arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        InterfaceC2150 interfaceC2150M43943 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) it.next());
                                        if (!(interfaceC2150M43943 instanceof C2485)) {
                                            C1078.m2272(AbstractC3761.m6628("Expected string for var name. got ", interfaceC2150M43943.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        c1489.m3154(((C2485) interfaceC2150M43943).f8277, InterfaceC2150.f7060);
                                    }
                                    return InterfaceC2150.f7060;
                                default:
                                    m899(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new C5162();
                        }
                        if (arrayList.size() % 2 != 0) {
                            C1078.m2272(AbstractC5078.m8670(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        c1173 = new C5162();
                        while (i3 < arrayList.size() - 1) {
                            InterfaceC2150 interfaceC2150M43944 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i3));
                            InterfaceC2150 interfaceC2150M43945 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) arrayList.get(i3 + 1));
                            if ((interfaceC2150M43944 instanceof C1710) || (interfaceC2150M43945 instanceof C1710)) {
                                C1078.m2276("Failed to evaluate map entry");
                                return null;
                            }
                            c1173.mo2283(interfaceC2150M43944.mo1607(), interfaceC2150M43945);
                            i3 += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new C1173();
                        }
                        c1173 = new C1173();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            InterfaceC2150 interfaceC2150M43946 = ((C2346) c1489.f5057).m4397(c1489, (InterfaceC2150) it2.next());
                            if (interfaceC2150M43946 instanceof C1710) {
                                C1078.m2276("Failed to evaluate array element");
                                return null;
                            }
                            c1173.m2494(i3, interfaceC2150M43946);
                            i3++;
                        }
                    }
                }
                return c1173;
        }
    }
}
