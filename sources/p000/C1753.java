package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥٌٚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1753 {

    /* JADX INFO: renamed from: ۥْ */
    public static final Map f5826;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final LinkedHashSet f5827 = new LinkedHashSet(Arrays.asList(C2623.class, C1350.class, C4456.class, C3523.class, C3273.class, AbstractC0123.class, C3811.class));

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f5832;

    /* JADX INFO: renamed from: ۥۣ */
    public CharSequence f5833;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f5834;

    /* JADX INFO: renamed from: ۦؚ */
    public final C3916 f5835;

    /* JADX INFO: renamed from: ۦِ */
    public final C3223 f5837;

    /* JADX INFO: renamed from: ۦٛ */
    public final ArrayList f5838;

    /* JADX INFO: renamed from: ۦۗ */
    public final ArrayList f5839;

    /* JADX INFO: renamed from: ۦۚ */
    public final ArrayList f5841;

    /* JADX INFO: renamed from: ۦۨ */
    public final LinkedHashSet f5842;

    /* JADX INFO: renamed from: ۥۗ */
    public int f5831 = 0;

    /* JADX INFO: renamed from: ۥؗ */
    public int f5828 = 0;

    /* JADX INFO: renamed from: ۥُ */
    public int f5829 = 0;

    /* JADX INFO: renamed from: ۥّ */
    public int f5830 = 0;

    /* JADX INFO: renamed from: ۦۙ */
    public int f5840 = 0;

    /* JADX INFO: renamed from: ۦٌ */
    public final LinkedHashMap f5836 = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(C2623.class, new C4165(0));
        map.put(C1350.class, new C4165(2));
        map.put(C4456.class, new C4165(1));
        map.put(C3523.class, new C4165(3));
        map.put(C3273.class, new C4165(7));
        map.put(AbstractC0123.class, new C4165(5));
        map.put(C3811.class, new C4165(4));
        f5826 = Collections.unmodifiableMap(map);
    }

    public C1753(ArrayList arrayList, C3223 c3223, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f5841 = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f5842 = linkedHashSet;
        this.f5838 = arrayList;
        this.f5837 = c3223;
        this.f5839 = arrayList2;
        C3916 c3916 = new C3916(0);
        this.f5835 = c3916;
        arrayList3.add(c3916);
        linkedHashSet.add(c3916);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m3550() {
        CharSequence charSequenceSubSequence;
        if (this.f5834) {
            int i = this.f5831 + 1;
            CharSequence charSequence = this.f5833;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.f5828 % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f5833;
            charSequenceSubSequence = charSequence2.subSequence(this.f5831, charSequence2.length());
        }
        m3554().mo2294(charSequenceSubSequence);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m3551(AbstractC0027 abstractC0027) {
        if (m3554() == abstractC0027) {
            ArrayList arrayList = this.f5841;
            arrayList.remove(arrayList.size() - 1);
        }
        if (abstractC0027 instanceof C3296) {
            m3553((C3296) abstractC0027);
        }
        abstractC0027.mo2295();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m3552(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            m3551((AbstractC0027) list.get(size));
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m3553(C3296 c3296) {
        C4531 c4531 = c3296.f11035;
        c4531.m7853();
        for (C0829 c0829 : c4531.f14973) {
            C3343 c3343 = c3296.f11036;
            c0829.m7116();
            AbstractC3959 abstractC3959 = (AbstractC3959) c3343.f13233;
            c0829.f13233 = abstractC3959;
            if (abstractC3959 != null) {
                abstractC3959.f13234 = c0829;
            }
            c0829.f13234 = c3343;
            c3343.f13233 = c0829;
            AbstractC3959 abstractC39510 = (AbstractC3959) c3343.f13235;
            c0829.f13235 = abstractC39510;
            if (((AbstractC3959) c0829.f13233) == null) {
                abstractC39510.f13232 = c0829;
            }
            String str = c0829.f2932;
            LinkedHashMap linkedHashMap = this.f5836;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, c0829);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC0027 m3554() {
        ArrayList arrayList = this.f5841;
        return (AbstractC0027) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3555(AbstractC0027 abstractC0027) {
        while (!m3554().mo3384(abstractC0027.mo2292())) {
            m3551(m3554());
        }
        m3554().mo2292().m7114(abstractC0027.mo2292());
        this.f5841.add(abstractC0027);
        this.f5842.add(abstractC0027);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m3556() {
        char cCharAt = this.f5833.charAt(this.f5831);
        int i = this.f5831;
        if (cCharAt != '\t') {
            this.f5831 = i + 1;
            this.f5828++;
        } else {
            this.f5831 = i + 1;
            int i2 = this.f5828;
            this.f5828 = (4 - (i2 % 4)) + i2;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m3557(int i) {
        int i2;
        int i3 = this.f5830;
        if (i >= i3) {
            this.f5831 = this.f5829;
            this.f5828 = i3;
        }
        int length = this.f5833.length();
        while (true) {
            i2 = this.f5828;
            if (i2 >= i || this.f5831 == length) {
                break;
            } else {
                m3556();
            }
        }
        if (i2 <= i) {
            this.f5834 = false;
            return;
        }
        this.f5831--;
        this.f5828 = i;
        this.f5834 = true;
    }

    /* JADX WARN: Code duplicated, block: B:194:0x030e  */
    /* JADX WARN: Code duplicated, block: B:235:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:277:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:316:0x0546  */
    /* JADX WARN: Code duplicated, block: B:318:0x0560  */
    /* JADX WARN: Code duplicated, block: B:319:0x0562  */
    /* JADX WARN: Code duplicated, block: B:347:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:167:0x029d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [ۥٌٚۧ] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX INFO: renamed from: ۦٛ */
    public final void m3558(String str) {
        AbstractC0027 abstractC0027;
        int i;
        C0564 c0564;
        boolean z;
        int i2;
        char cCharAt;
        int i3;
        C1601 c1601;
        C0564 c0565;
        C5469 c5469;
        int i4;
        StringBuilder sbM7496;
        int i5;
        C0627 c0627;
        char cCharAt2;
        int i6;
        C0627 c0628;
        ?? r3;
        boolean zEquals;
        boolean zEquals2;
        int i7;
        char cCharAt3;
        StringBuilder sb;
        int i8;
        int i9;
        EnumC3611 enumC3611;
        String string = str;
        int length = string.length();
        int i10 = 0;
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt4 = string.charAt(i11);
            if (cCharAt4 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) string, 0, i11);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt4);
            }
        }
        if (sb2 != null) {
            string = sb2.toString();
        }
        this.f5833 = string;
        this.f5831 = 0;
        this.f5828 = 0;
        this.f5834 = false;
        ArrayList arrayList = this.f5841;
        int i12 = 1;
        for (AbstractC0027 abstractC0028 : arrayList.subList(1, arrayList.size())) {
            m3560();
            C3714 c3714Mo2293 = abstractC0028.mo2293(this);
            if (c3714Mo2293 == null) {
                break;
            }
            if (c3714Mo2293.f12383) {
                m3551(abstractC0028);
                return;
            }
            int i13 = c3714Mo2293.f12385;
            if (i13 != -1) {
                m3559(i13);
            } else {
                int i14 = c3714Mo2293.f12384;
                if (i14 != -1) {
                    m3557(i14);
                }
            }
            i12++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i12, arrayList.size()));
        AbstractC0027 abstractC0029 = (AbstractC0027) arrayList.get(i12 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zMo3383 = (abstractC0029.mo2292() instanceof C3343) || abstractC0029.mo3383();
        while (true) {
            if (zMo3383) {
                m3560();
                if (!this.f5832) {
                    int i15 = 4;
                    if (this.f5840 >= 4 || !Character.isLetter(Character.codePointAt(this.f5833, this.f5829))) {
                        C4228 c4228 = new C4228(21, abstractC0029);
                        Iterator it = this.f5838.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                char c = '*';
                                i = i10;
                                char c2 = '\t';
                                switch (((C4165) it.next()).f13860) {
                                    case 0:
                                        abstractC0027 = abstractC0029;
                                        int i16 = this.f5829;
                                        CharSequence charSequence = this.f5833;
                                        i2 = 4;
                                        if (this.f5840 >= 4 || i16 >= charSequence.length() || charSequence.charAt(i16) != '>') {
                                            c0564 = null;
                                        } else {
                                            int i17 = this.f5828 + this.f5840;
                                            int i18 = i17 + 1;
                                            CharSequence charSequence2 = this.f5833;
                                            int i19 = i16 + 1;
                                            if (i19 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i19)) == '\t' || cCharAt == ' ')) {
                                                i18 = i17 + 2;
                                            }
                                            AbstractC0027[] abstractC0027Arr = new AbstractC0027[1];
                                            abstractC0027Arr[i] = new C2249();
                                            c0564 = new C0564(abstractC0027Arr);
                                            c0564.f2026 = i18;
                                        }
                                        break;
                                    case 1:
                                        abstractC0027 = abstractC0029;
                                        int i20 = this.f5840;
                                        if (i20 < 4) {
                                            int i21 = this.f5829;
                                            CharSequence charSequence3 = this.f5833;
                                            int length2 = charSequence3.length();
                                            int i22 = i21;
                                            int i23 = i;
                                            int i24 = i23;
                                            while (true) {
                                                i3 = i21;
                                                if (i22 < length2) {
                                                    char cCharAt5 = charSequence3.charAt(i22);
                                                    if (cCharAt5 == '`') {
                                                        i23++;
                                                    } else if (cCharAt5 == '~') {
                                                        i24++;
                                                    }
                                                    i22++;
                                                    i21 = i3;
                                                }
                                            }
                                            int i25 = 3;
                                            if (i23 < 3) {
                                                if (i24 >= i25 || i23 != 0) {
                                                    c1601 = null;
                                                } else {
                                                    c1601 = new C1601('~', i24, i20);
                                                }
                                            } else if (i24 == 0) {
                                                int i26 = i3 + i23;
                                                int length3 = charSequence3.length();
                                                while (true) {
                                                    if (i26 >= length3) {
                                                        i26 = -1;
                                                    } else if (charSequence3.charAt(i26) != '`') {
                                                        i26++;
                                                    }
                                                }
                                                if (i26 != -1) {
                                                    c1601 = null;
                                                } else {
                                                    c1601 = new C1601('`', i23, i20);
                                                }
                                            } else {
                                                i25 = 3;
                                                if (i24 >= i25) {
                                                    c1601 = null;
                                                } else {
                                                    c1601 = null;
                                                }
                                            }
                                            if (c1601 != null) {
                                                AbstractC0027[] abstractC0027Arr2 = new AbstractC0027[1];
                                                abstractC0027Arr2[i] = c1601;
                                                c0565 = new C0564(abstractC0027Arr2);
                                                c0565.f2027 = i3 + c1601.f5375.f14696;
                                                c0564 = c0565;
                                            }
                                            i2 = 4;
                                        }
                                        c0564 = null;
                                        i2 = 4;
                                        break;
                                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                        abstractC0027 = abstractC0029;
                                        if (this.f5840 < 4) {
                                            CharSequence charSequence4 = this.f5833;
                                            int i27 = this.f5829;
                                            int iM7886 = AbstractC4554.m7886('#', i27, charSequence4.length(), charSequence4) - i27;
                                            if (iM7886 == 0 || iM7886 > 6) {
                                                c5469 = null;
                                            } else {
                                                int i28 = i27 + iM7886;
                                                if (i28 >= charSequence4.length()) {
                                                    c5469 = new C5469(iM7886, "");
                                                } else {
                                                    char cCharAt6 = charSequence4.charAt(i28);
                                                    char c3 = ' ';
                                                    char c4 = '\t';
                                                    if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i28) {
                                                                length4 = i28 - 1;
                                                            } else {
                                                                char cCharAt7 = charSequence4.charAt(length4);
                                                                if (cCharAt7 == c4 || cCharAt7 == c3) {
                                                                    length4--;
                                                                    c4 = '\t';
                                                                    c3 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i29 = length4;
                                                        while (true) {
                                                            if (i29 < i28) {
                                                                i29 = i28 - 1;
                                                            } else if (charSequence4.charAt(i29) == '#') {
                                                                i29--;
                                                            }
                                                        }
                                                        int i30 = i29;
                                                        while (true) {
                                                            if (i30 < i28) {
                                                                i30 = i28 - 1;
                                                            } else {
                                                                char cCharAt8 = charSequence4.charAt(i30);
                                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                                    i30--;
                                                                }
                                                            }
                                                        }
                                                        c5469 = i30 != i29 ? new C5469(iM7886, charSequence4.subSequence(i28, i30 + 1).toString()) : new C5469(iM7886, charSequence4.subSequence(i28, length4 + 1).toString());
                                                    } else {
                                                        c5469 = null;
                                                    }
                                                }
                                            }
                                            if (c5469 == null) {
                                                char cCharAt9 = charSequence4.charAt(i27);
                                                if (cCharAt9 == '-') {
                                                    if (AbstractC4554.m7885(charSequence4, AbstractC4554.m7886('-', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = i;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i4 = i;
                                                } else if (AbstractC4554.m7885(charSequence4, AbstractC4554.m7886('=', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                    i4 = 1;
                                                } else if (AbstractC4554.m7885(charSequence4, AbstractC4554.m7886('-', i27 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = i;
                                                }
                                                if (i4 > 0 && (sbM7496 = c4228.m7496()) != null) {
                                                    C5469 c54610 = new C5469(i4, sbM7496.toString());
                                                    AbstractC0027[] abstractC0027Arr3 = new AbstractC0027[1];
                                                    abstractC0027Arr3[i] = c54610;
                                                    c0565 = new C0564(abstractC0027Arr3);
                                                    c0565.f2027 = charSequence4.length();
                                                    c0565.f2029 = true;
                                                }
                                                i2 = 4;
                                            } else {
                                                AbstractC0027[] abstractC0027Arr4 = new AbstractC0027[1];
                                                abstractC0027Arr4[i] = c5469;
                                                c0565 = new C0564(abstractC0027Arr4);
                                                c0565.f2027 = charSequence4.length();
                                            }
                                            c0564 = c0565;
                                            i2 = 4;
                                        }
                                        c0564 = null;
                                        i2 = 4;
                                        break;
                                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                        abstractC0027 = abstractC0029;
                                        int i31 = i15;
                                        int i32 = this.f5829;
                                        CharSequence charSequence5 = this.f5833;
                                        if (this.f5840 >= i31 || charSequence5.charAt(i32) != '<') {
                                            c0564 = null;
                                        } else {
                                            int i33 = 1;
                                            while (true) {
                                                if (i33 <= 7) {
                                                    if (i33 != 7 || !(((AbstractC0027) c4228.f14025).mo2292() instanceof C3343)) {
                                                        Pattern[] patternArr = C1085.f3789[i33];
                                                        Pattern pattern = patternArr[i];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i32, charSequence5.length())).find()) {
                                                            AbstractC0027[] abstractC0027Arr5 = new AbstractC0027[1];
                                                            abstractC0027Arr5[i] = new C1085(pattern2);
                                                            c0564 = new C0564(abstractC0027Arr5);
                                                            c0564.f2027 = this.f5831;
                                                        }
                                                    }
                                                    i33++;
                                                } else {
                                                    c0564 = null;
                                                }
                                            }
                                        }
                                        i2 = 4;
                                        break;
                                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                                        abstractC0027 = abstractC0029;
                                        int i34 = 4;
                                        if (this.f5840 < 4) {
                                            c0564 = null;
                                        } else if (this.f5832 || (m3554().mo2292() instanceof C3343)) {
                                            i34 = 4;
                                            c0564 = null;
                                        } else {
                                            AbstractC0027[] abstractC0027Arr6 = new AbstractC0027[1];
                                            abstractC0027Arr6[i] = new C5469();
                                            c0564 = new C0564(abstractC0027Arr6);
                                            i34 = 4;
                                            c0564.f2026 = this.f5828 + 4;
                                        }
                                        i2 = i34;
                                        break;
                                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                                        AbstractC0027 abstractC00210 = (AbstractC0027) c4228.f14025;
                                        int i35 = this.f5840;
                                        if (i35 < 4) {
                                            int i36 = this.f5829;
                                            int i37 = this.f5828 + i35;
                                            int i38 = c4228.m7496() != null ? 1 : i;
                                            CharSequence charSequence6 = this.f5833;
                                            char cCharAt10 = charSequence6.charAt(i36);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                i5 = i38;
                                                abstractC0027 = abstractC0029;
                                                int i39 = i36 + 1;
                                                if (i39 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i39)) == '\t' || cCharAt2 == ' ') {
                                                    C3813 c3813 = new C3813();
                                                    c3813.f12640 = cCharAt10;
                                                    c0627 = new C0627(c3813, i39);
                                                } else {
                                                    c0627 = null;
                                                }
                                            } else {
                                                int length5 = charSequence6.length();
                                                int i40 = i36;
                                                int i41 = i;
                                                while (true) {
                                                    i5 = i38;
                                                    if (i40 < length5) {
                                                        char cCharAt11 = charSequence6.charAt(i40);
                                                        abstractC0027 = abstractC0029;
                                                        if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                            switch (cCharAt11) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i41++;
                                                                    if (i41 <= 9) {
                                                                        i40++;
                                                                        i38 = i5;
                                                                        abstractC0029 = abstractC0027;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i41 >= 1 && ((i7 = i40 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i7)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence6.subSequence(i36, i40).toString();
                                                            C0674 c0674 = new C0674();
                                                            c0674.f2473 = Integer.parseInt(string2);
                                                            c0674.f2474 = cCharAt11;
                                                            c0627 = new C0627(c0674, i7);
                                                        }
                                                    } else {
                                                        abstractC0027 = abstractC0029;
                                                    }
                                                    c0627 = null;
                                                }
                                            }
                                            if (c0627 == null) {
                                                c0628 = null;
                                            } else {
                                                AbstractC0123 abstractC0123 = c0627.f2325;
                                                int i42 = c0627.f2324;
                                                int i43 = (i42 - i36) + i37;
                                                int length6 = charSequence6.length();
                                                int i44 = i43;
                                                while (true) {
                                                    if (i42 >= length6) {
                                                        i6 = i;
                                                    } else {
                                                        char cCharAt12 = charSequence6.charAt(i42);
                                                        if (cCharAt12 == '\t') {
                                                            i44 = (4 - (i44 % 4)) + i44;
                                                        } else if (cCharAt12 == ' ') {
                                                            i44++;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        i42++;
                                                    }
                                                }
                                                if (i5 == 0 || ((!(abstractC0123 instanceof C0674) || ((C0674) abstractC0123).f2473 == 1) && i6 != 0)) {
                                                    if (i6 == 0 || i44 - i43 > 4) {
                                                        i44 = i43 + 1;
                                                    }
                                                    c0628 = new C0627(abstractC0123, i44);
                                                } else {
                                                    c0628 = null;
                                                }
                                            }
                                            if (c0628 != null) {
                                                AbstractC0123 abstractC0124 = c0628.f2325;
                                                int i45 = c0628.f2324;
                                                C5079 c5079 = new C5079(i45 - this.f5828);
                                                if (abstractC00210 instanceof C4395) {
                                                    AbstractC0123 abstractC0125 = ((C4395) abstractC00210).f14484;
                                                    if ((abstractC0125 instanceof C3813) && (abstractC0124 instanceof C3813)) {
                                                        zEquals2 = Character.valueOf(((C3813) abstractC0125).f12640).equals(Character.valueOf(((C3813) abstractC0124).f12640));
                                                    } else if ((abstractC0125 instanceof C0674) && (abstractC0124 instanceof C0674)) {
                                                        zEquals = Character.valueOf(((C0674) abstractC0125).f2474).equals(Character.valueOf(((C0674) abstractC0124).f2474));
                                                    } else {
                                                        r3 = i;
                                                    }
                                                    if (r3 == 0) {
                                                        r3 = zEquals;
                                                        r3 = zEquals2;
                                                        C4395 c4395 = new C4395(abstractC0124);
                                                        abstractC0124.f481 = true;
                                                        AbstractC0027[] abstractC0027Arr7 = new AbstractC0027[2];
                                                        abstractC0027Arr7[i] = c4395;
                                                        abstractC0027Arr7[1] = c5079;
                                                        c0564 = new C0564(abstractC0027Arr7);
                                                        c0564.f2026 = i45;
                                                    } else {
                                                        r3 = zEquals;
                                                        r3 = zEquals2;
                                                        AbstractC0027[] abstractC0027Arr8 = new AbstractC0027[1];
                                                        abstractC0027Arr8[i] = c5079;
                                                        C0564 c0566 = new C0564(abstractC0027Arr8);
                                                        c0566.f2026 = i45;
                                                        c0564 = c0566;
                                                    }
                                                } else {
                                                    r3 = zEquals;
                                                    r3 = zEquals2;
                                                    C4395 c4396 = new C4395(abstractC0124);
                                                    abstractC0124.f481 = true;
                                                    AbstractC0027[] abstractC0027Arr9 = new AbstractC0027[2];
                                                    abstractC0027Arr9[i] = c4396;
                                                    abstractC0027Arr9[1] = c5079;
                                                    c0564 = new C0564(abstractC0027Arr9);
                                                    c0564.f2026 = i45;
                                                }
                                            }
                                            i2 = 4;
                                        } else {
                                            abstractC0027 = abstractC0029;
                                        }
                                        c0564 = null;
                                        i2 = 4;
                                        break;
                                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                        CharSequence charSequence7 = this.f5833;
                                        StringBuilder sbM7497 = c4228.m7496();
                                        if (sbM7497 == null || !sbM7497.toString().contains("|") || sbM7497.toString().contains("\n")) {
                                            c0564 = null;
                                        } else {
                                            CharSequence charSequenceSubSequence = charSequence7.subSequence(this.f5831, charSequence7.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i46 = i;
                                            int i47 = i46;
                                            int i48 = i47;
                                            while (true) {
                                                if (i47 < charSequenceSubSequence.length()) {
                                                    char cCharAt13 = charSequenceSubSequence.charAt(i47);
                                                    if (cCharAt13 == c2 || cCharAt13 == ' ') {
                                                        sb = sbM7497;
                                                        i47++;
                                                    } else {
                                                        sb = sbM7497;
                                                        if (cCharAt13 == '-' || cCharAt13 == ':') {
                                                            if (i48 != 0 || arrayList3.isEmpty()) {
                                                                if (cCharAt13 == ':') {
                                                                    i47++;
                                                                    i8 = 1;
                                                                } else {
                                                                    i8 = i;
                                                                }
                                                                int i49 = i;
                                                                while (i47 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i47) == '-') {
                                                                    i47++;
                                                                    i49 = 1;
                                                                }
                                                                if (i49 != 0) {
                                                                    if (i47 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i47) != ':') {
                                                                        i9 = i;
                                                                    } else {
                                                                        i47++;
                                                                        i9 = 1;
                                                                    }
                                                                    if (i8 != 0 && i9 != 0) {
                                                                        enumC3611 = EnumC3611.f12029;
                                                                    } else if (i8 != 0) {
                                                                        enumC3611 = EnumC3611.f12030;
                                                                    } else {
                                                                        enumC3611 = i9 != 0 ? EnumC3611.f12027 : null;
                                                                    }
                                                                    arrayList3.add(enumC3611);
                                                                    i48 = i;
                                                                }
                                                            }
                                                        } else if (cCharAt13 == '|') {
                                                            i47++;
                                                            i48++;
                                                            if (i48 <= 1) {
                                                                i46 = 1;
                                                            }
                                                        }
                                                    }
                                                    sbM7497 = sb;
                                                    c2 = '\t';
                                                } else {
                                                    sb = sbM7497;
                                                    if (i46 == 0) {
                                                    }
                                                }
                                                arrayList3 = null;
                                            }
                                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                                c0564 = null;
                                            } else {
                                                ArrayList arrayListM6891 = C3856.m6891(sb);
                                                if (arrayList3.size() >= arrayListM6891.size()) {
                                                    AbstractC0027[] abstractC0027Arr10 = new AbstractC0027[1];
                                                    abstractC0027Arr10[i] = new C3856(arrayList3, arrayListM6891);
                                                    C0564 c0567 = new C0564(abstractC0027Arr10);
                                                    c0567.f2027 = this.f5831;
                                                    c0567.f2029 = true;
                                                    c0564 = c0567;
                                                } else {
                                                    c0564 = null;
                                                }
                                            }
                                        }
                                        abstractC0027 = abstractC0029;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.f5840 >= i15) {
                                            c0564 = null;
                                        } else {
                                            int i50 = this.f5829;
                                            CharSequence charSequence8 = this.f5833;
                                            int length7 = charSequence8.length();
                                            int i51 = i;
                                            int i52 = i51;
                                            int i53 = i52;
                                            while (true) {
                                                if (i50 >= length7) {
                                                    int i54 = i52;
                                                    int i55 = i53;
                                                    if ((i51 >= 3 && i54 == 0 && i55 == 0) || ((i54 >= 3 && i51 == 0 && i55 == 0) || (i55 >= 3 && i51 == 0 && i54 == 0))) {
                                                        AbstractC0027[] abstractC0027Arr11 = new AbstractC0027[1];
                                                        abstractC0027Arr11[i] = new C3916(1);
                                                        c0564 = new C0564(abstractC0027Arr11);
                                                        c0564.f2027 = charSequence8.length();
                                                    }
                                                } else {
                                                    char cCharAt14 = charSequence8.charAt(i50);
                                                    if (cCharAt14 == '\t' || cCharAt14 == ' ') {
                                                        i52 = i52;
                                                        i53 = i53;
                                                    } else if (cCharAt14 == c) {
                                                        i53++;
                                                    } else if (cCharAt14 == '-') {
                                                        i51++;
                                                    } else if (cCharAt14 == '_') {
                                                        i52++;
                                                    }
                                                    i50++;
                                                    c = '*';
                                                }
                                                c0564 = null;
                                            }
                                        }
                                        abstractC0027 = abstractC0029;
                                        i2 = 4;
                                        break;
                                }
                                if (c0564 == null) {
                                    i15 = i2;
                                    i10 = i;
                                    abstractC0029 = abstractC0027;
                                }
                            } else {
                                i = i10;
                                abstractC0027 = abstractC0029;
                                c0564 = null;
                            }
                        }
                        if (c0564 == null) {
                            m3559(this.f5829);
                        } else {
                            if (!zIsEmpty) {
                                m3552(arrayList2);
                                zIsEmpty = true;
                            }
                            int i56 = c0564.f2027;
                            if (i56 != -1) {
                                m3559(i56);
                            } else {
                                int i57 = c0564.f2026;
                                if (i57 != -1) {
                                    m3557(i57);
                                }
                            }
                            if (c0564.f2029) {
                                AbstractC0027 abstractC0027M3554 = m3554();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.f5842.remove(abstractC0027M3554);
                                if (abstractC0027M3554 instanceof C3296) {
                                    m3553((C3296) abstractC0027M3554);
                                }
                                abstractC0027M3554.mo2292().m7116();
                            } else {
                                z = true;
                            }
                            AbstractC0027[] abstractC0027Arr12 = c0564.f2028;
                            int length8 = abstractC0027Arr12.length;
                            abstractC0029 = abstractC0027;
                            for (int i58 = i; i58 < length8; i58++) {
                                abstractC0029 = abstractC0027Arr12[i58];
                                m3555(abstractC0029);
                                zMo3383 = abstractC0029.mo3383();
                            }
                            i10 = i;
                        }
                    }
                }
                abstractC0027 = abstractC0029;
                m3559(this.f5829);
            } else {
                abstractC0027 = abstractC0029;
            }
            if (!zIsEmpty && !this.f5832 && m3554().mo3382()) {
                m3550();
                return;
            }
            if (!zIsEmpty) {
                m3552(arrayList2);
            }
            if (!abstractC0027.mo3383()) {
                m3550();
                return;
            } else {
                if (this.f5832) {
                    return;
                }
                m3555(new C3296());
                m3550();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m3559(int i) {
        int i2 = this.f5829;
        if (i >= i2) {
            this.f5831 = i2;
            this.f5828 = this.f5830;
        }
        int length = this.f5833.length();
        while (true) {
            int i3 = this.f5831;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                m3556();
            }
        }
        this.f5834 = false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m3560() {
        int i = this.f5831;
        int i2 = this.f5828;
        this.f5832 = true;
        int length = this.f5833.length();
        while (i < length) {
            char cCharAt = this.f5833.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.f5832 = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f5829 = i;
        this.f5830 = i2;
        this.f5840 = i2 - this.f5828;
    }
}
