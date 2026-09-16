package p000;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: ۦٗؖۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4379 {

    /* JADX INFO: renamed from: ۥؗ */
    public Boolean f14427;

    /* JADX INFO: renamed from: ۥُ */
    public Long f14428;

    /* JADX INFO: renamed from: ۥّ */
    public Long f14429;

    /* JADX INFO: renamed from: ۥۗ */
    public final int f14430;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ C1419 f14431;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f14432;

    /* JADX INFO: renamed from: ۦؑ */
    public Boolean f14433;

    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC5212 f14434;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ int f14435;

    public C4379(C1419 c1419, String str, int i, AbstractC5212 abstractC5212, int i2) {
        this.f14435 = i2;
        this.f14431 = c1419;
        this.f14432 = str;
        this.f14430 = i;
        this.f14434 = abstractC5212;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Boolean m7676(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    /* JADX INFO: renamed from: ۥُ */
    public static Boolean m7677(BigDecimal bigDecimal, C2854 c2854, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        AbstractC0487.m1047(c2854);
        if (c2854.m5422()) {
            if (c2854.m5426() != 1 && (c2854.m5426() != 5 ? c2854.m5428() : c2854.m5425() && c2854.m5424())) {
                int iM5426 = c2854.m5426();
                try {
                    if (c2854.m5426() == 5) {
                        if (C3117.m5707(c2854.m5427()) && C3117.m5707(c2854.m5420())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c2854.m5427());
                            bigDecimal4 = new BigDecimal(c2854.m5420());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iM5426 == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iM5426 - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (C3117.m5707(c2854.m5429())) {
                        bigDecimal2 = new BigDecimal(c2854.m5429());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iM5426 == 5) {
                            i = iM5426 - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iM5426 - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ۦؑ */
    public static Boolean m7678(String str, C1288 c1288, C3610 c3610) {
        List listM2722;
        AbstractC0487.m1047(c1288);
        if (str != null && c1288.m2720() && c1288.m2718() != 1 && (c1288.m2718() != 7 ? c1288.m2719() : c1288.m2723() != 0)) {
            int iM2718 = c1288.m2718();
            boolean zM2725 = c1288.m2725();
            String strM2721 = (zM2725 || iM2718 == 2 || iM2718 == 7) ? c1288.m2721() : c1288.m2721().toUpperCase(Locale.ENGLISH);
            if (c1288.m2723() == 0) {
                listM2722 = null;
            } else {
                listM2722 = c1288.m2722();
                if (!zM2725) {
                    ArrayList arrayList = new ArrayList(listM2722.size());
                    Iterator it = listM2722.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM2722 = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iM2718 == 2 ? strM2721 : null;
            if (iM2718 != 7 ? strM2721 != null : listM2722 != null && !listM2722.isEmpty()) {
                if (!zM2725 && iM2718 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM2718 - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zM2725 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (c3610 != null) {
                                    c3610.f12022.m9430(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        return Boolean.valueOf(str.startsWith(strM2721));
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        return Boolean.valueOf(str.endsWith(strM2721));
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        return Boolean.valueOf(str.contains(strM2721));
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(strM2721));
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (listM2722 != null) {
                            return Boolean.valueOf(listM2722.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public boolean m7679(Long l, Long l2, C3426 c3426, boolean z) {
        boolean z2;
        Boolean boolM7676;
        Boolean boolM7677;
        Boolean boolM7678;
        Boolean boolM7679;
        C3642.m6513();
        C5371 c5371 = (C5371) this.f14431.f18660;
        C0515 c0515 = c5371.f17715;
        C4004 c4004 = c5371.f17731;
        C3610 c3610 = c5371.f17717;
        boolean zM1162 = c0515.m1162(this.f14432, AbstractC4936.f16319);
        C4630 c4630 = (C4630) this.f14434;
        boolean zM8022 = c4630.m8022();
        boolean zM8019 = c4630.m8019();
        boolean zM8018 = c4630.m8018();
        boolean z3 = zM8022 || zM8019 || zM8018;
        if (z && !z3) {
            C5371.m9020(c3610);
            c3610.f12023.m9434(Integer.valueOf(this.f14430), c4630.m8016() ? Integer.valueOf(c4630.m8015()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C0529 c0529M8021 = c4630.m8021();
        boolean zM1180 = c0529M8021.m1180();
        if (!c3426.m6208()) {
            z2 = zM8018;
            if (!c3426.m6201()) {
                if (!c3426.m6217()) {
                    C5371.m9020(c3610);
                    c3610.f12022.m9430(c4004.m7142(c3426.m6206()), "User property has no value, property");
                } else if (c0529M8021.m1177()) {
                    String strM6219 = c3426.m6219();
                    C1288 c1288M1176 = c0529M8021.m1176();
                    C5371.m9020(c3610);
                    boolM7676 = m7676(m7678(strM6219, c1288M1176, c3610), zM1180);
                } else if (!c0529M8021.m1178()) {
                    C5371.m9020(c3610);
                    c3610.f12022.m9430(c4004.m7142(c3426.m6206()), "No string or number filter defined. property");
                } else if (C3117.m5707(c3426.m6219())) {
                    String strM62110 = c3426.m6219();
                    C2854 c2854M1182 = c0529M8021.m1182();
                    if (C3117.m5707(strM62110)) {
                        try {
                            boolM7677 = m7677(new BigDecimal(strM62110), c2854M1182, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolM7677 = null;
                        }
                    } else {
                        boolM7677 = null;
                    }
                    boolM7676 = m7676(boolM7677, zM1180);
                } else {
                    C5371.m9020(c3610);
                    c3610.f12022.m9434(c4004.m7142(c3426.m6206()), c3426.m6219(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolM7676 = null;
            } else if (c0529M8021.m1178()) {
                double dM6211 = c3426.m6211();
                try {
                    boolM7678 = m7677(new BigDecimal(dM6211), c0529M8021.m1182(), Math.ulp(dM6211));
                } catch (NumberFormatException unused2) {
                    boolM7678 = null;
                }
                boolM7676 = m7676(boolM7678, zM1180);
            } else {
                C5371.m9020(c3610);
                c3610.f12022.m9430(c4004.m7142(c3426.m6206()), "No number filter for double property. property");
                boolM7676 = null;
            }
        } else if (c0529M8021.m1178()) {
            z2 = zM8018;
            try {
                boolM7679 = m7677(new BigDecimal(c3426.m6216()), c0529M8021.m1182(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolM7679 = null;
            }
            boolM7676 = m7676(boolM7679, zM1180);
        } else {
            C5371.m9020(c3610);
            c3610.f12022.m9430(c4004.m7142(c3426.m6206()), "No number filter for long property. property");
            z2 = zM8018;
            boolM7676 = null;
        }
        C5371.m9020(c3610);
        c3610.f12023.m9430(boolM7676 == null ? "null" : boolM7676, "Property filter result");
        if (boolM7676 == null) {
            return false;
        }
        this.f14427 = Boolean.TRUE;
        if (!z2 || boolM7676.booleanValue()) {
            if (!z || c4630.m8022()) {
                this.f14433 = boolM7676;
            }
            if (boolM7676.booleanValue() && z3 && c3426.m6204()) {
                long jM6203 = c3426.m6203();
                if (l != null) {
                    jM6203 = l.longValue();
                }
                if (zM1162 && c4630.m8022() && !c4630.m8019() && l2 != null) {
                    jM6203 = l2.longValue();
                }
                if (c4630.m8019()) {
                    this.f14429 = Long.valueOf(jM6203);
                } else {
                    this.f14428 = Long.valueOf(jM6203);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۥۣ */
    public boolean m7680(Long l, Long l2, C5580 c5580, long j, C3047 c3047, boolean z) {
        HashSet hashSet;
        Iterator it;
        C4461 c4461;
        Iterator it2;
        Iterator it3;
        C0529 c0529;
        boolean z2;
        String strM1179;
        Object obj;
        Boolean boolM7677;
        Boolean boolM7678;
        String str;
        C2854 c2854M1182;
        long j2;
        Boolean boolM7679;
        C5057 c5057;
        Long lValueOf;
        Double dValueOf;
        C0529 c05210;
        Boolean boolM76710;
        int i;
        C3642.m6513();
        C1419 c1419 = this.f14431;
        C5371 c5371 = (C5371) c1419.f18660;
        C0515 c0515 = c5371.f17715;
        C3610 c3610 = c5371.f17717;
        C4004 c4004 = c5371.f17731;
        C2462 c2462 = AbstractC4936.f16255;
        String str2 = this.f14432;
        boolean zM1162 = c0515.m1162(str2, c2462);
        C3542 c3542 = (C3542) this.f14434;
        long j3 = c3542.m6331() ? c3047.f10242 : j;
        C5371.m9020(c3610);
        C5590 c5590 = c3610.f12023;
        C5590 c5591 = c3610.f12022;
        boolean zIsLoggable = Log.isLoggable(c3610.m6441(), 2);
        int i2 = this.f14430;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            C5371.m9020(c3610);
            c5590.m9431("Evaluating filter. audience, filter, event", Integer.valueOf(i2), c3542.m6333() ? Integer.valueOf(c3542.m6332()) : null, c4004.m7146(c3542.m6335()));
            C5371.m9020(c3610);
            C3117 c3117 = c1419.f19371.f16692;
            C5034.m8484(c3117);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (c3542.m6333()) {
                i = 0;
                C3117.m5715(sb, 0, "filter_id", Integer.valueOf(c3542.m6332()));
            } else {
                i = 0;
            }
            C3117.m5715(sb, i, "event_name", ((C5371) c3117.f18660).f17731.m7146(c3542.m6335()));
            String strM5711 = C3117.m5711(c3542.m6330(), c3542.m6329(), c3542.m6331());
            if (!strM5711.isEmpty()) {
                C3117.m5715(sb, 0, "filter_type", strM5711);
            }
            if (c3542.m6340()) {
                C3117.m5698(sb, 1, "event_count_filter", c3542.m6336());
            }
            if (c3542.m6342() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = c3542.m6341().iterator();
                while (it4.hasNext()) {
                    c3117.m5719(sb, 2, (C0529) it4.next());
                }
            }
            C3117.m5706(1, sb);
            sb.append("}\n}\n");
            c5590.m9430(sb.toString(), "Filter definition");
        }
        if (!c3542.m6333() || c3542.m6332() > 256) {
            C5371.m9020(c3610);
            c5591.m9434(C3610.m6440(str2), String.valueOf(c3542.m6333() ? Integer.valueOf(c3542.m6332()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = c3542.m6330() || c3542.m6329() || c3542.m6331();
        if (z && !z3) {
            C5371.m9020(c3610);
            c5590.m9434(Integer.valueOf(i2), c3542.m6333() ? Integer.valueOf(c3542.m6332()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strM9415 = c5580.m9415();
        if (!c3542.m6340()) {
            hashSet = new HashSet();
            it = c3542.m6341().iterator();
            while (true) {
                if (it.hasNext()) {
                    c4461 = new C4461(0);
                    it2 = c5580.m9411().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c3542.m6341().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zM1162 = zM1162;
                                    c3610 = c3610;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c0529 = (C0529) it3.next();
                                if (c0529.m1183()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strM1179 = c0529.m1179();
                                if (strM1179.isEmpty()) {
                                    obj = c4461.get(strM1179);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zM1162 = zM1162;
                                                c3610 = c3610;
                                                if (obj == null) {
                                                    C5371.m9020(c3610);
                                                    c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Unknown param type. event, param");
                                                    break;
                                                }
                                                C5371.m9020(c3610);
                                                c5590.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (c0529.m1177()) {
                                                if (c0529.m1178()) {
                                                    zM1162 = zM1162;
                                                    c3610 = c3610;
                                                    C5371.m9020(c3610);
                                                    c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (C3117.m5707(str)) {
                                                    zM1162 = zM1162;
                                                    c3610 = c3610;
                                                    C5371.m9020(c3610);
                                                    c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                c2854M1182 = c0529.m1182();
                                                if (C3117.m5707(str)) {
                                                    zM1162 = zM1162;
                                                    c3610 = c3610;
                                                    j2 = 0;
                                                    boolM7679 = m7677(new BigDecimal(str), c2854M1182, 0.0d);
                                                } else {
                                                    boolM7679 = null;
                                                }
                                                if (boolM7679 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM7679.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c3610 = c3610;
                                                zM1162 = zM1162;
                                            } else {
                                                C1288 c1288M1176 = c0529.m1176();
                                                C5371.m9020(c3610);
                                                boolM7679 = m7678((String) obj, c1288M1176, c3610);
                                            }
                                            j2 = 0;
                                            if (boolM7679 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolM7679.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            c3610 = c3610;
                                            zM1162 = zM1162;
                                        } else if (c0529.m1178()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolM7678 = m7677(new BigDecimal(dDoubleValue), c0529.m1182(), Math.ulp(dDoubleValue));
                                            if (boolM7678 != null) {
                                                if (boolM7678.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            C5371.m9020(c3610);
                                            c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No number filter for double param. event, param");
                                        }
                                    } else if (c0529.m1178()) {
                                        boolM7677 = m7677(new BigDecimal(((Long) obj).longValue()), c0529.m1182(), 0.0d);
                                        if (boolM7677 != null) {
                                            if (boolM7677.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        C5371.m9020(c3610);
                                        c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No number filter for long param. event, param");
                                    }
                                } else {
                                    C5371.m9020(c3610);
                                    c5591.m9430(c4004.m7146(strM9415), "Event has empty param name. event");
                                }
                            }
                        } else {
                            c5057 = (C5057) it2.next();
                            if (!hashSet.contains(c5057.m8588())) {
                                if (c5057.m8604()) {
                                    String strM8588 = c5057.m8588();
                                    if (c5057.m8604()) {
                                        lValueOf = Long.valueOf(c5057.m8593());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c4461.put(strM8588, lValueOf);
                                } else if (c5057.m8586()) {
                                    String strM8589 = c5057.m8588();
                                    if (c5057.m8586()) {
                                        dValueOf = Double.valueOf(c5057.m8584());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c4461.put(strM8589, dValueOf);
                                } else if (c5057.m8591()) {
                                    c4461.put(c5057.m8588(), c5057.m8603());
                                } else {
                                    C5371.m9020(c3610);
                                    c5591.m9434(c4004.m7146(strM9415), c4004.m7145(c5057.m8588()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c05210 = (C0529) it.next();
                    if (c05210.m1179().isEmpty()) {
                        C5371.m9020(c3610);
                        c5591.m9430(c4004.m7146(strM9415), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c05210.m1179());
                    }
                }
                zM1162 = zM1162;
                c3610 = c3610;
                break;
            }
        }
        try {
            boolM76710 = m7677(new BigDecimal(j3), c3542.m6336(), 0.0d);
        } catch (NumberFormatException unused) {
            boolM76710 = null;
        }
        if (boolM76710 != null) {
            if (boolM76710.booleanValue()) {
                hashSet = new HashSet();
                it = c3542.m6341().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c4461 = new C4461(0);
                        it2 = c5580.m9411().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = c3542.m6341().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zM1162 = zM1162;
                                        c3610 = c3610;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    c0529 = (C0529) it3.next();
                                    if (c0529.m1183() || !c0529.m1180()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strM1179 = c0529.m1179();
                                    if (strM1179.isEmpty()) {
                                        obj = c4461.get(strM1179);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zM1162 = zM1162;
                                                    c3610 = c3610;
                                                    if (obj == null) {
                                                        C5371.m9020(c3610);
                                                        c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    C5371.m9020(c3610);
                                                    c5590.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (c0529.m1177()) {
                                                    if (c0529.m1178()) {
                                                        zM1162 = zM1162;
                                                        c3610 = c3610;
                                                        C5371.m9020(c3610);
                                                        c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (C3117.m5707(str)) {
                                                        zM1162 = zM1162;
                                                        c3610 = c3610;
                                                        C5371.m9020(c3610);
                                                        c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    c2854M1182 = c0529.m1182();
                                                    if (C3117.m5707(str)) {
                                                        boolM7679 = null;
                                                    } else {
                                                        try {
                                                            zM1162 = zM1162;
                                                            c3610 = c3610;
                                                            j2 = 0;
                                                            try {
                                                                boolM7679 = m7677(new BigDecimal(str), c2854M1182, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolM7679 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zM1162 = zM1162;
                                                            c3610 = c3610;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolM7679 != null) {
                                                        break;
                                                    }
                                                    if (boolM7679.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    c3610 = c3610;
                                                    zM1162 = zM1162;
                                                } else {
                                                    C1288 c1288M1177 = c0529.m1176();
                                                    C5371.m9020(c3610);
                                                    boolM7679 = m7678((String) obj, c1288M1177, c3610);
                                                }
                                                j2 = 0;
                                                if (boolM7679 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolM7679.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c3610 = c3610;
                                                zM1162 = zM1162;
                                            } else if (c0529.m1178()) {
                                                C5371.m9020(c3610);
                                                c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolM7678 = m7677(new BigDecimal(dDoubleValue2), c0529.m1182(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolM7678 = null;
                                                }
                                                if (boolM7678 != null) {
                                                    if (boolM7678.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (c0529.m1178()) {
                                            C5371.m9020(c3610);
                                            c5591.m9434(c4004.m7146(strM9415), c4004.m7145(strM1179), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolM7677 = m7677(new BigDecimal(((Long) obj).longValue()), c0529.m1182(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolM7677 = null;
                                            }
                                            if (boolM7677 != null) {
                                                if (boolM7677.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        C5371.m9020(c3610);
                                        c5591.m9430(c4004.m7146(strM9415), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                c5057 = (C5057) it2.next();
                                if (!hashSet.contains(c5057.m8588())) {
                                    if (c5057.m8604()) {
                                        String strM85810 = c5057.m8588();
                                        if (c5057.m8604()) {
                                            lValueOf = Long.valueOf(c5057.m8593());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c4461.put(strM85810, lValueOf);
                                    } else if (c5057.m8586()) {
                                        String strM85811 = c5057.m8588();
                                        if (c5057.m8586()) {
                                            dValueOf = Double.valueOf(c5057.m8584());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c4461.put(strM85811, dValueOf);
                                    } else if (c5057.m8591()) {
                                        c4461.put(c5057.m8588(), c5057.m8603());
                                    } else {
                                        C5371.m9020(c3610);
                                        c5591.m9434(c4004.m7146(strM9415), c4004.m7145(c5057.m8588()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        c05210 = (C0529) it.next();
                        if (c05210.m1179().isEmpty()) {
                            C5371.m9020(c3610);
                            c5591.m9430(c4004.m7146(strM9415), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(c05210.m1179());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zM1162 = zM1162;
        c3610 = c3610;
        break;
        C5371.m9020(c3610);
        c5590.m9430(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f14427 = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f14433 = bool2;
        if (!z3 || !c5580.m9423()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(c5580.m9413());
        if (c3542.m6329()) {
            if (zM1162 && c3542.m6340()) {
                lValueOf2 = l;
            }
            this.f14429 = lValueOf2;
            return true;
        }
        if (zM1162 && c3542.m6340()) {
            lValueOf2 = l2;
        }
        this.f14428 = lValueOf2;
        return true;
    }
}
