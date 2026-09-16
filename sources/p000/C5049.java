package p000;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۦِۘؖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5049 {

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap f16757;

    /* JADX INFO: renamed from: ۥُ */
    public String f16758;

    /* JADX INFO: renamed from: ۥّ */
    public int f16759;

    /* JADX INFO: renamed from: ۥۗ */
    public final BitSet f16760;

    /* JADX INFO: renamed from: ۥۜ */
    public C1485 f16761;

    /* JADX INFO: renamed from: ۥۣ */
    public final BitSet f16762;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3369 f16763;

    /* JADX INFO: renamed from: ۦۙ */
    public C3673 f16764;

    /* JADX INFO: renamed from: ۦٛ */
    public static final Pattern f16752 = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: ۦِ */
    public static final Pattern f16751 = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: ۦۗ */
    public static final Pattern f16753 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: ۦؚ */
    public static final Pattern f16749 = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: ۦٌ */
    public static final Pattern f16750 = Pattern.compile("`+");

    /* JADX INFO: renamed from: ۦۚ */
    public static final Pattern f16754 = Pattern.compile("^`+");

    /* JADX INFO: renamed from: ۦۨ */
    public static final Pattern f16756 = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Pattern f16755 = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: ۥْ */
    public static final Pattern f16746 = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: ۥٓ */
    public static final Pattern f16747 = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: ۥَ */
    public static final Pattern f16745 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۥٖ */
    public static final Pattern f16748 = Pattern.compile(" *$");

    public C5049(C3369 c3369) {
        List list = (List) c3369.f11255;
        HashMap map = new HashMap();
        m8561(Arrays.asList(new C2725('*'), new C2725('_')), map);
        m8561(list, map);
        this.f16757 = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f16760 = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f16762 = bitSet2;
        this.f16763 = c3369;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m8560(AbstractC3959 abstractC3959, AbstractC3959 abstractC39510) {
        C1507 c1507 = null;
        C1507 c1508 = null;
        int length = 0;
        while (abstractC3959 != null) {
            if (abstractC3959 instanceof C1507) {
                c1508 = (C1507) abstractC3959;
                if (c1507 == null) {
                    c1507 = c1508;
                }
                length = c1508.f5120.length() + length;
            } else {
                m8563(c1507, c1508, length);
                c1507 = null;
                c1508 = null;
                length = 0;
            }
            if (abstractC3959 == abstractC39510) {
                break;
            } else {
                abstractC3959 = (AbstractC3959) abstractC3959.f13234;
            }
        }
        m8563(c1507, c1508, length);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m8561(Iterable iterable, HashMap map) {
        C2586 c2586;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC0690 interfaceC0690 = (InterfaceC0690) it.next();
            char cMo1542 = interfaceC0690.mo1542();
            char cMo1544 = interfaceC0690.mo1544();
            if (cMo1542 == cMo1544) {
                InterfaceC0690 interfaceC0691 = (InterfaceC0690) map.get(Character.valueOf(cMo1542));
                if (interfaceC0691 == null || interfaceC0691.mo1542() != interfaceC0691.mo1544()) {
                    m8562(cMo1542, interfaceC0690, map);
                } else {
                    if (interfaceC0691 instanceof C2586) {
                        c2586 = (C2586) interfaceC0691;
                    } else {
                        C2586 c2587 = new C2586(cMo1542);
                        c2587.m4880(interfaceC0691);
                        c2586 = c2587;
                    }
                    c2586.m4880(interfaceC0690);
                    map.put(Character.valueOf(cMo1542), c2586);
                }
            } else {
                m8562(cMo1542, interfaceC0690, map);
                m8562(cMo1544, interfaceC0690, map);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m8562(char c, InterfaceC0690 interfaceC0690, HashMap map) {
        if (((InterfaceC0690) map.put(Character.valueOf(c), interfaceC0690)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static void m8563(C1507 c1507, C1507 c1508, int i) {
        if (c1507 == null || c1508 == null || c1507 == c1508) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c1507.f5120);
        AbstractC3959 abstractC3959 = (AbstractC3959) c1507.f13234;
        AbstractC3959 abstractC39510 = (AbstractC3959) c1508.f13234;
        while (abstractC3959 != abstractC39510) {
            sb.append(((C1507) abstractC3959).f5120);
            AbstractC3959 abstractC39511 = (AbstractC3959) abstractC3959.f13234;
            abstractC3959.m7116();
            abstractC3959 = abstractC39511;
        }
        c1507.f5120 = sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final String m8564(Pattern pattern) {
        if (this.f16759 >= this.f16758.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f16758);
        matcher.region(this.f16759, this.f16758.length());
        if (!matcher.find()) {
            return null;
        }
        this.f16759 = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ec A[PHI: r6
  0x01ec: PHI (r6v35 char) = (r6v34 char), (r6v36 char), (r6v37 char) binds: [B:113:0x01e1, B:115:0x01e5, B:118:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:141:0x023f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0249  */
    /* JADX WARN: Code duplicated, block: B:148:0x0265  */
    /* JADX WARN: Code duplicated, block: B:159:0x0287  */
    /* JADX WARN: Code duplicated, block: B:160:0x028f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0293  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:165:0x029f  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ed A[LOOP:3: B:173:0x02eb->B:174:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0306  */
    /* JADX WARN: Code duplicated, block: B:181:0x0314 A[ADDED_TO_REGION, LOOP:4: B:181:0x0314->B:185:0x031d, LOOP_START, PHI: r2
  0x0314: PHI (r2v73 ۥؘؚٖؓ) = (r2v72 ۥؘؚٖؓ), (r2v74 ۥؘؚٖؓ) binds: [B:180:0x0312, B:185:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:184:0x031a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0320  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:231:0x0475  */
    /* JADX WARN: Code duplicated, block: B:233:0x047d  */
    /* JADX WARN: Code duplicated, block: B:260:0x0529  */
    /* JADX WARN: Code duplicated, block: B:265:0x0549 A[LOOP:0: B:3:0x0013->B:265:0x0549, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x055e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:269:0x055f  */
    /* JADX WARN: Code duplicated, block: B:271:0x0550 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [ۦِؓٞۙ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [ۦِؓٞۙ, ۦٗؖؗۖ] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [ۦِؓٞۙ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v44, types: [ۥؚۣٗؑ] */
    /* JADX WARN: Type inference failed for: r4v45, types: [ۥؚۣٗؑ] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60, types: [ۦِؓٞۙ] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v41, types: [ۦۣۢؒؐ] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX INFO: renamed from: ۥّ */
    public final void m8565(String str, AbstractC3959 abstractC3959) {
        int i;
        AbstractC3959 c1256;
        ?? r10;
        ?? r4;
        AbstractC3959 c1507;
        ?? r11;
        Object c1508;
        C4839 c4839;
        String strM8564;
        ?? c4374;
        int i2;
        String strM1877;
        String strM1878;
        boolean z;
        AbstractC3959 abstractC39510;
        AbstractC3959 abstractC39511;
        AbstractC3959 abstractC39512;
        C1485 c1485;
        int i3;
        int i4;
        String strSubstring;
        C0829 c0829;
        int iM1940;
        int iM1951;
        int i5;
        int i6;
        C1507 c1509;
        ?? r5;
        ?? r8;
        ?? c5514;
        AbstractC3959 abstractC39513;
        AbstractC3959 abstractC39514;
        this.f16758 = str.trim();
        int i7 = 0;
        this.f16759 = 0;
        C1507 c15010 = null;
        this.f16764 = null;
        this.f16761 = null;
        ?? r6 = 0;
        while (true) {
            char cM8568 = m8568();
            if (cM8568 == 0) {
                i = i7;
            } else {
                if (cM8568 == '\n') {
                    this.f16759++;
                    if (r6 instanceof C1507) {
                        C1507 c15011 = (C1507) r6;
                        if (c15011.f5120.endsWith(" ")) {
                            String str2 = c15011.f5120;
                            Matcher matcher = f16748.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (iEnd > 0) {
                                i = 0;
                                c15011.f5120 = str2.substring(0, str2.length() - iEnd);
                            } else {
                                i = 0;
                            }
                            c1256 = iEnd >= 2 ? new C1799() : new C1256();
                        } else {
                            i = 0;
                            c1256 = new C1256();
                        }
                    } else {
                        i = 0;
                        c1256 = new C1256();
                    }
                    r10 = c1256;
                } else if (cM8568 == '!') {
                    int i8 = this.f16759 + 1;
                    this.f16759 = i8;
                    if (m8568() == '[') {
                        this.f16759++;
                        C1507 c15012 = new C1507("![");
                        C1485 c1486 = this.f16761;
                        C1485 c1487 = new C1485(c15012, i8, c1486, this.f16764, true);
                        if (c1486 != null) {
                            c1486.f5050 = true;
                        }
                        this.f16761 = c1487;
                        r11 = c15012;
                    } else {
                        c1507 = new C1507("!");
                        r11 = c1507;
                    }
                    i = 0;
                    r10 = r11;
                } else if (cM8568 == '&') {
                    String strM8565 = m8564(f16749);
                    if (strM8565 != null) {
                        c1508 = new C1507(AbstractC3362.m6122(strM8565));
                        r11 = c1508;
                    } else {
                        r11 = 0;
                    }
                    i = 0;
                    r10 = r11;
                } else if (cM8568 != '<') {
                    if (cM8568 != '`') {
                        switch (cM8568) {
                            case '[':
                                int i9 = this.f16759;
                                this.f16759 = i9 + 1;
                                C1507 c15013 = new C1507("[");
                                C1485 c1488 = this.f16761;
                                C1485 c1489 = new C1485(c15013, i9, c1488, this.f16764, false);
                                if (c1488 != null) {
                                    c1488.f5050 = true;
                                }
                                this.f16761 = c1489;
                                r11 = c15013;
                                i = 0;
                                r10 = r11;
                                break;
                            case '\\':
                                this.f16759++;
                                if (m8568() == '\n') {
                                    c1507 = new C1799();
                                    this.f16759++;
                                } else {
                                    if (this.f16759 < this.f16758.length()) {
                                        String str3 = this.f16758;
                                        int i10 = this.f16759;
                                        if (f16753.matcher(str3.substring(i10, i10 + 1)).matches()) {
                                            String str4 = this.f16758;
                                            int i11 = this.f16759;
                                            C1507 c15014 = new C1507(str4.substring(i11, i11 + 1));
                                            this.f16759++;
                                            r11 = c15014;
                                        }
                                        i = 0;
                                        r10 = r11;
                                    }
                                    c1507 = new C1507("\\");
                                }
                                r11 = c1507;
                                i = 0;
                                r10 = r11;
                                break;
                            case ']':
                                int i12 = this.f16759 + 1;
                                this.f16759 = i12;
                                C1485 c14810 = this.f16761;
                                if (c14810 != null) {
                                    C1507 c15015 = c14810.f5048;
                                    boolean z2 = c14810.f5044;
                                    if (!c14810.f5046) {
                                        this.f16761 = c14810.f5049;
                                        c4374 = new C1507("]");
                                    } else {
                                        if (m8568() == '(') {
                                            this.f16759++;
                                            Pattern pattern = f16746;
                                            m8564(pattern);
                                            i2 = 1;
                                            int iM1932 = AbstractC0949.m1932(this.f16759, this.f16758);
                                            if (iM1932 == -1) {
                                                strM1877 = null;
                                            } else {
                                                char cM8569 = m8568();
                                                String str5 = this.f16758;
                                                int i13 = this.f16759;
                                                String strSubstring2 = cM8569 == '<' ? str5.substring(i13 + 1, iM1932 - 1) : str5.substring(i13, iM1932);
                                                this.f16759 = iM1932;
                                                strM1877 = AbstractC0883.m1877(strSubstring2);
                                            }
                                            if (strM1877 != null) {
                                                m8564(pattern);
                                                String str6 = this.f16758;
                                                int i14 = this.f16759;
                                                if (f16745.matcher(str6.substring(i14 - 1, i14)).matches()) {
                                                    String str7 = this.f16758;
                                                    int i15 = this.f16759;
                                                    if (i15 >= str7.length()) {
                                                        i6 = -1;
                                                        i5 = -1;
                                                    } else {
                                                        char cCharAt = str7.charAt(i15);
                                                        char c = '\"';
                                                        if (cCharAt != '\"') {
                                                            c = '\'';
                                                            if (cCharAt == '\'') {
                                                                iM1951 = AbstractC0949.m1951(str7, i15 + 1, c);
                                                                if (iM1951 == -1 && iM1951 < str7.length() && str7.charAt(iM1951) == c) {
                                                                    i5 = iM1951 + 1;
                                                                    i6 = -1;
                                                                } else {
                                                                    i6 = -1;
                                                                    i5 = -1;
                                                                }
                                                            } else if (cCharAt != '(') {
                                                                i6 = -1;
                                                                i5 = -1;
                                                            } else {
                                                                c = ')';
                                                                iM1951 = AbstractC0949.m1951(str7, i15 + 1, c);
                                                                if (iM1951 == -1) {
                                                                    i6 = -1;
                                                                    i5 = -1;
                                                                } else {
                                                                    i5 = iM1951 + 1;
                                                                    i6 = -1;
                                                                }
                                                            }
                                                        } else {
                                                            iM1951 = AbstractC0949.m1951(str7, i15 + 1, c);
                                                            if (iM1951 == -1) {
                                                                i6 = -1;
                                                                i5 = -1;
                                                            } else {
                                                                i5 = iM1951 + 1;
                                                                i6 = -1;
                                                            }
                                                        }
                                                    }
                                                    if (i5 == i6) {
                                                        strM1878 = null;
                                                    } else {
                                                        String strSubstring3 = this.f16758.substring(this.f16759 + 1, i5 - 1);
                                                        this.f16759 = i5;
                                                        strM1878 = AbstractC0883.m1877(strSubstring3);
                                                    }
                                                    m8564(pattern);
                                                } else {
                                                    strM1878 = null;
                                                }
                                                if (m8568() == ')') {
                                                    this.f16759++;
                                                    z = true;
                                                } else {
                                                    this.f16759 = i12;
                                                }
                                                if (!z) {
                                                    i3 = this.f16759;
                                                    if (i3 < this.f16758.length() && this.f16758.charAt(this.f16759) == '[') {
                                                        int i16 = this.f16759 + 1;
                                                        iM1940 = AbstractC0949.m1940(i16, this.f16758);
                                                        int i17 = iM1940 - i16;
                                                        if (iM1940 != -1 && i17 <= 999 && iM1940 < this.f16758.length() && this.f16758.charAt(iM1940) == ']') {
                                                            this.f16759 = iM1940 + 1;
                                                        }
                                                    }
                                                    i4 = this.f16759 - i3;
                                                    if (i4 > 2) {
                                                        strSubstring = this.f16758.substring(i3, i4 + i3);
                                                    } else if (c14810.f5050) {
                                                        strSubstring = null;
                                                    } else {
                                                        strSubstring = this.f16758.substring(c14810.f5047, i12);
                                                    }
                                                    if (strSubstring != null) {
                                                        Pattern pattern2 = AbstractC0883.f3219;
                                                        c0829 = (C0829) ((Map) this.f16763.f11254).get(AbstractC0883.f3217.matcher(strSubstring.substring(i2, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                        if (c0829 != null) {
                                                            strM1877 = c0829.f2930;
                                                            strM1878 = c0829.f2931;
                                                            z = true;
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    this.f16759 = i12;
                                                    this.f16761 = this.f16761.f5049;
                                                    c1507 = new C1507("]");
                                                    r11 = c1507;
                                                    i = 0;
                                                    r10 = r11;
                                                } else {
                                                    if (z2) {
                                                        C5141 c5141 = new C5141();
                                                        c5141.f17031 = strM1877;
                                                        c5141.f17030 = strM1878;
                                                        c4374 = c5141;
                                                    } else {
                                                        c4374 = new C4839(strM1877, strM1878);
                                                    }
                                                    abstractC39510 = (AbstractC3959) c15015.f13234;
                                                    while (abstractC39510 != null) {
                                                        AbstractC3959 abstractC39515 = (AbstractC3959) abstractC39510.f13234;
                                                        c4374.m7114(abstractC39510);
                                                        abstractC39510 = abstractC39515;
                                                    }
                                                    m8566(c14810.f5045);
                                                    abstractC39511 = (AbstractC3959) c4374.f13232;
                                                    abstractC39512 = (AbstractC3959) c4374.f13237;
                                                    if (abstractC39511 != abstractC39512) {
                                                        m8560(abstractC39511, abstractC39512);
                                                    }
                                                    c15015.m7116();
                                                    c1485 = this.f16761.f5049;
                                                    this.f16761 = c1485;
                                                    if (!z2) {
                                                        while (c1485 != null) {
                                                            if (!c1485.f5044) {
                                                                c1485.f5046 = false;
                                                            }
                                                            c1485 = c1485.f5049;
                                                        }
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (!z) {
                                                i3 = this.f16759;
                                                if (i3 < this.f16758.length()) {
                                                    int i18 = this.f16759 + 1;
                                                    iM1940 = AbstractC0949.m1940(i18, this.f16758);
                                                    int i19 = iM1940 - i18;
                                                    if (iM1940 != -1) {
                                                        this.f16759 = iM1940 + 1;
                                                    }
                                                }
                                                i4 = this.f16759 - i3;
                                                if (i4 > 2) {
                                                    strSubstring = this.f16758.substring(i3, i4 + i3);
                                                } else if (c14810.f5050) {
                                                    strSubstring = this.f16758.substring(c14810.f5047, i12);
                                                } else {
                                                    strSubstring = null;
                                                }
                                                if (strSubstring != null) {
                                                    Pattern pattern3 = AbstractC0883.f3219;
                                                    c0829 = (C0829) ((Map) this.f16763.f11254).get(AbstractC0883.f3217.matcher(strSubstring.substring(i2, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                    if (c0829 != null) {
                                                        strM1877 = c0829.f2930;
                                                        strM1878 = c0829.f2931;
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                                this.f16759 = i12;
                                                this.f16761 = this.f16761.f5049;
                                                c1507 = new C1507("]");
                                                r11 = c1507;
                                                i = 0;
                                                r10 = r11;
                                            } else {
                                                if (z2) {
                                                    C5141 c5142 = new C5141();
                                                    c5142.f17031 = strM1877;
                                                    c5142.f17030 = strM1878;
                                                    c4374 = c5142;
                                                } else {
                                                    c4374 = new C4839(strM1877, strM1878);
                                                }
                                                abstractC39510 = (AbstractC3959) c15015.f13234;
                                                while (abstractC39510 != null) {
                                                    AbstractC3959 abstractC39516 = (AbstractC3959) abstractC39510.f13234;
                                                    c4374.m7114(abstractC39510);
                                                    abstractC39510 = abstractC39516;
                                                }
                                                m8566(c14810.f5045);
                                                abstractC39511 = (AbstractC3959) c4374.f13232;
                                                abstractC39512 = (AbstractC3959) c4374.f13237;
                                                if (abstractC39511 != abstractC39512) {
                                                    m8560(abstractC39511, abstractC39512);
                                                }
                                                c15015.m7116();
                                                c1485 = this.f16761.f5049;
                                                this.f16761 = c1485;
                                                if (!z2) {
                                                    while (c1485 != null) {
                                                        if (!c1485.f5044) {
                                                            c1485.f5046 = false;
                                                        }
                                                        c1485 = c1485.f5049;
                                                    }
                                                }
                                            }
                                        } else {
                                            i2 = 1;
                                            strM1877 = null;
                                        }
                                        strM1878 = null;
                                        z = false;
                                        if (!z) {
                                            i3 = this.f16759;
                                            if (i3 < this.f16758.length()) {
                                                int i110 = this.f16759 + 1;
                                                iM1940 = AbstractC0949.m1940(i110, this.f16758);
                                                int i111 = iM1940 - i110;
                                                if (iM1940 != -1) {
                                                    this.f16759 = iM1940 + 1;
                                                }
                                            }
                                            i4 = this.f16759 - i3;
                                            if (i4 > 2) {
                                                strSubstring = this.f16758.substring(i3, i4 + i3);
                                            } else if (c14810.f5050) {
                                                strSubstring = this.f16758.substring(c14810.f5047, i12);
                                            } else {
                                                strSubstring = null;
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern4 = AbstractC0883.f3219;
                                                c0829 = (C0829) ((Map) this.f16763.f11254).get(AbstractC0883.f3217.matcher(strSubstring.substring(i2, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (c0829 != null) {
                                                    strM1877 = c0829.f2930;
                                                    strM1878 = c0829.f2931;
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (!z) {
                                            this.f16759 = i12;
                                            this.f16761 = this.f16761.f5049;
                                            c1507 = new C1507("]");
                                            r11 = c1507;
                                            i = 0;
                                            r10 = r11;
                                        } else {
                                            if (z2) {
                                                C5141 c5143 = new C5141();
                                                c5143.f17031 = strM1877;
                                                c5143.f17030 = strM1878;
                                                c4374 = c5143;
                                            } else {
                                                c4374 = new C4839(strM1877, strM1878);
                                            }
                                            abstractC39510 = (AbstractC3959) c15015.f13234;
                                            while (abstractC39510 != null) {
                                                AbstractC3959 abstractC39517 = (AbstractC3959) abstractC39510.f13234;
                                                c4374.m7114(abstractC39510);
                                                abstractC39510 = abstractC39517;
                                            }
                                            m8566(c14810.f5045);
                                            abstractC39511 = (AbstractC3959) c4374.f13232;
                                            abstractC39512 = (AbstractC3959) c4374.f13237;
                                            if (abstractC39511 != abstractC39512) {
                                                m8560(abstractC39511, abstractC39512);
                                            }
                                            c15015.m7116();
                                            c1485 = this.f16761.f5049;
                                            this.f16761 = c1485;
                                            if (!z2) {
                                                while (c1485 != null) {
                                                    if (!c1485.f5044) {
                                                        c1485.f5046 = false;
                                                    }
                                                    c1485 = c1485.f5049;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c4374 = new C1507("]");
                                }
                                break;
                            default:
                                if (this.f16760.get(cM8568)) {
                                    InterfaceC0690 interfaceC0690 = (InterfaceC0690) this.f16757.get(Character.valueOf(cM8568));
                                    int i20 = this.f16759;
                                    int i21 = i7;
                                    while (m8568() == cM8568) {
                                        i21++;
                                        this.f16759++;
                                    }
                                    if (i21 < interfaceC0690.mo1543()) {
                                        this.f16759 = i20;
                                        c5514 = c15010;
                                    } else {
                                        String strSubstring4 = i20 == 0 ? "\n" : this.f16758.substring(i20 - 1, i20);
                                        char cM85610 = m8568();
                                        String strValueOf = cM85610 != 0 ? String.valueOf(cM85610) : "\n";
                                        Pattern pattern5 = f16752;
                                        boolean zMatches = pattern5.matcher(strSubstring4).matches();
                                        Pattern pattern6 = f16747;
                                        boolean zMatches2 = pattern6.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern5.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern6.matcher(strValueOf).matches();
                                        int i22 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i7 : 1;
                                        int i23 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i7 : 1;
                                        if (cM8568 == '_') {
                                            int i24 = (i22 == 0 || !(i23 == 0 || zMatches)) ? i7 : 1;
                                            if (i23 == 0 || !(i22 == 0 || zMatches3)) {
                                                r8 = i7;
                                                r5 = i24;
                                            } else {
                                                r8 = 1;
                                                r5 = i24;
                                            }
                                        } else {
                                            int i25 = (i22 == 0 || cM8568 != interfaceC0690.mo1542()) ? i7 : 1;
                                            int i26 = (i23 == 0 || cM8568 != interfaceC0690.mo1544()) ? i7 : 1;
                                            r5 = i25;
                                            r8 = i26;
                                        }
                                        this.f16759 = i20;
                                        c5514 = new C5514(i21, r5, r8);
                                    }
                                    if (c5514 == 0) {
                                        c1509 = c15010;
                                    } else {
                                        int i27 = c5514.f18199;
                                        int i28 = i20 + i27;
                                        this.f16759 = i28;
                                        C1507 c15016 = new C1507(this.f16758.substring(i20, i28));
                                        boolean z3 = c5514.f18197;
                                        boolean z4 = c5514.f18198;
                                        C3673 c3673 = this.f16764;
                                        C3673 c3674 = new C3673(c15016, cM8568, z3, z4, c3673);
                                        this.f16764 = c3674;
                                        c3674.f12278 = i27;
                                        c3674.f12275 = i27;
                                        if (c3673 != null) {
                                            c3673.f12273 = c3674;
                                        }
                                        c1509 = c15016;
                                    }
                                } else {
                                    int i29 = this.f16759;
                                    int length = this.f16758.length();
                                    while (true) {
                                        int i30 = this.f16759;
                                        if (i30 != length) {
                                            if (!this.f16762.get(this.f16758.charAt(i30))) {
                                                this.f16759++;
                                            }
                                        }
                                    }
                                    int i31 = this.f16759;
                                    if (i29 != i31) {
                                        c1509 = new C1507(this.f16758.substring(i29, i31));
                                    } else {
                                        c1509 = c15010;
                                    }
                                }
                                i = i7;
                                r10 = c1509;
                                break;
                        }
                    } else {
                        String strM8566 = m8564(f16754);
                        if (strM8566 == null) {
                            r11 = 0;
                        } else {
                            int i32 = this.f16759;
                            while (true) {
                                String strM8567 = m8564(f16750);
                                if (strM8567 == null) {
                                    this.f16759 = i32;
                                    c1508 = new C1507(strM8566);
                                    r11 = c1508;
                                } else if (strM8567.equals(strM8566)) {
                                    c4374 = new C4374();
                                    String strReplace = this.f16758.substring(i32, this.f16759 - strM8566.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (AbstractC4554.m7886(' ', 0, length2, strReplace) != length2) {
                                            strReplace = strReplace.substring(1, strReplace.length() - 1);
                                        }
                                    }
                                    c4374.f14414 = strReplace;
                                }
                            }
                        }
                        i = 0;
                        r10 = r11;
                    }
                    r11 = c4374;
                    i = 0;
                    r10 = r11;
                } else {
                    String strM8568 = m8564(f16756);
                    if (strM8568 != null) {
                        String strSubstring5 = strM8568.substring(1, strM8568.length() - 1);
                        c4839 = new C4839("mailto:".concat(strSubstring5), null);
                        c4839.m7114(new C1507(strSubstring5));
                    } else {
                        String strM8569 = m8564(f16755);
                        if (strM8569 != null) {
                            String strSubstring6 = strM8569.substring(1, strM8569.length() - 1);
                            c4839 = new C4839(strSubstring6, null);
                            c4839.m7114(new C1507(strSubstring6));
                        } else {
                            r11 = 0;
                        }
                        if (r11 == 0) {
                            strM8564 = m8564(f16751);
                            if (strM8564 != null) {
                                C2149 c2149 = new C2149();
                                c2149.f7053 = strM8564;
                                c1508 = c2149;
                                r11 = c1508;
                            } else {
                                r11 = 0;
                            }
                        }
                        i = 0;
                        r10 = r11;
                    }
                    r11 = c4839;
                    if (r11 == 0) {
                        strM8564 = m8564(f16751);
                        if (strM8564 != null) {
                            C2149 c21410 = new C2149();
                            c21410.f7053 = strM8564;
                            c1508 = c21410;
                            r11 = c1508;
                        } else {
                            r11 = 0;
                        }
                    }
                    i = 0;
                    r10 = r11;
                }
                if (r10 != 0) {
                    r4 = r10;
                } else {
                    this.f16759++;
                    c15010 = new C1507(String.valueOf(cM8568));
                }
                if (r4 != 0) {
                    m8566(null);
                    abstractC39513 = (AbstractC3959) abstractC3959.f13232;
                    abstractC39514 = (AbstractC3959) abstractC3959.f13237;
                    if (abstractC39513 == abstractC39514) {
                        return;
                    }
                    m8560(abstractC39513, abstractC39514);
                    return;
                }
                abstractC3959.m7114(r4);
                i7 = i;
                c15010 = null;
                r6 = r4;
            }
            r4 = c15010;
            if (r4 != 0) {
                m8566(null);
                abstractC39513 = (AbstractC3959) abstractC3959.f13232;
                abstractC39514 = (AbstractC3959) abstractC3959.f13237;
                if (abstractC39513 == abstractC39514) {
                    return;
                }
                m8560(abstractC39513, abstractC39514);
                return;
            }
            abstractC3959.m7114(r4);
            i7 = i;
            c15010 = null;
            r6 = r4;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m8566(C3673 c3673) {
        boolean z;
        AbstractC3959 abstractC3959;
        HashMap map = new HashMap();
        C3673 c3674 = this.f16764;
        while (c3674 != null) {
            C3673 c3675 = c3674.f12272;
            if (c3675 == c3673) {
                break;
            } else {
                c3674 = c3675;
            }
        }
        while (c3674 != null) {
            C1507 c1507 = c3674.f12276;
            char c = c3674.f12274;
            InterfaceC0690 interfaceC0690 = (InterfaceC0690) this.f16757.get(Character.valueOf(c));
            if (!c3674.f12277 || interfaceC0690 == null) {
                c3674 = c3674.f12273;
            } else {
                char cMo1542 = interfaceC0690.mo1542();
                C3673 c3676 = c3674.f12272;
                int iMo1541 = 0;
                boolean z2 = false;
                while (true) {
                    if (c3676 == null || c3676 == c3673 || c3676 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (c3676.f12271 && c3676.f12274 == cMo1542) {
                        iMo1541 = interfaceC0690.mo1541(c3676, c3674);
                        z2 = true;
                        if (iMo1541 > 0) {
                            z = true;
                            break;
                        }
                    }
                    c3676 = c3676.f12272;
                }
                if (z2) {
                    C1507 c1508 = c3676.f12276;
                    c3676.f12278 -= iMo1541;
                    c3674.f12278 -= iMo1541;
                    String str = c1508.f5120;
                    c1508.f5120 = str.substring(0, str.length() - iMo1541);
                    String str2 = c1507.f5120;
                    c1507.f5120 = str2.substring(0, str2.length() - iMo1541);
                    C3673 c3677 = c3674.f12272;
                    while (c3677 != null && c3677 != c3676) {
                        C3673 c3678 = c3677.f12272;
                        m8567(c3677);
                        c3677 = c3678;
                    }
                    if (c1508 != c1507 && (abstractC3959 = (AbstractC3959) c1508.f13234) != c1507) {
                        m8560(abstractC3959, (AbstractC3959) c1507.f13233);
                    }
                    interfaceC0690.mo1545(c1508, c1507, iMo1541);
                    if (c3676.f12278 == 0) {
                        c3676.f12276.m7116();
                        m8567(c3676);
                    }
                    if (c3674.f12278 == 0) {
                        C3673 c3679 = c3674.f12273;
                        c1507.m7116();
                        m8567(c3674);
                        c3674 = c3679;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), c3674.f12272);
                        if (!c3674.f12271) {
                            m8567(c3674);
                        }
                    }
                    c3674 = c3674.f12273;
                }
            }
        }
        while (true) {
            C3673 c36710 = this.f16764;
            if (c36710 == null || c36710 == c3673) {
                return;
            } else {
                m8567(c36710);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m8567(C3673 c3673) {
        C3673 c3674 = c3673.f12272;
        if (c3674 != null) {
            c3674.f12273 = c3673.f12273;
        }
        C3673 c3675 = c3673.f12273;
        if (c3675 == null) {
            this.f16764 = c3674;
        } else {
            c3675.f12272 = c3674;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final char m8568() {
        if (this.f16759 < this.f16758.length()) {
            return this.f16758.charAt(this.f16759);
        }
        return (char) 0;
    }
}
