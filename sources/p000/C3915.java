package p000;

/* JADX INFO: renamed from: ۦُٜؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3915 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f13051;

    /* JADX INFO: renamed from: ۥُ */
    public final String f13052;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3510 f13053;

    /* JADX INFO: renamed from: ۥۣ */
    public int f13054;

    /* JADX INFO: renamed from: ۦؑ */
    public final StringBuilder f13055 = new StringBuilder();

    public C3915(String str, C3510 c3510) {
        this.f13053 = new C3510(c3510);
        this.f13052 = str;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* synthetic */ void m6997(C3915 c3915, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = c3915.f13054;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        c3915.m7012(i, str, str2);
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.f13052);
        sb.append("', currentPosition=");
        return AbstractC3761.m6638(sb, this.f13054, ')');
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m6998(int i, String str) {
        String str2 = this.f13052;
        if (str2.length() - i < str.length()) {
            m6997(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                m6997(this, "Expected valid boolean literal prefix, but had '" + m7010() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f13054 = str.length() + i;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final boolean m6999() {
        int iM7003 = m7003();
        String str = this.f13052;
        if (iM7003 >= str.length() || iM7003 == -1 || str.charAt(iM7003) != ',') {
            return false;
        }
        this.f13054++;
        return true;
    }

    /* JADX INFO: renamed from: ۥُ */
    public byte m7000() {
        String str;
        int i = this.f13054;
        while (true) {
            str = this.f13052;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f13054 = i2;
                return AbstractC4554.m7929(cCharAt);
            }
            i = i2;
        }
        this.f13054 = str.length();
        return (byte) 10;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final byte m7001(byte b) {
        byte bM7000 = m7000();
        if (bM7000 == b) {
            return bM7000;
        }
        String strM7890 = AbstractC4554.m7890(b);
        int i = this.f13054;
        int i2 = i > 0 ? i - 1 : i;
        String str = this.f13052;
        m6997(this, "Expected " + strM7890 + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m7002(int i) {
        if (i < this.f13052.length()) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public int m7003() {
        char cCharAt;
        int i = this.f13054;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f13052;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f13054 = i;
        return i;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m7004(char c) {
        int i = this.f13054;
        if (i > 0 && c == '\"') {
            try {
                this.f13054 = i - 1;
                String strM7010 = m7010();
                this.f13054 = i;
                if (AbstractC3831.m6874(strM7010, "null")) {
                    m7012(this.f13054 - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f13054 = i;
                throw th;
            }
        }
        String strM7890 = AbstractC4554.m7890(AbstractC4554.m7929(c));
        int i2 = this.f13054;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        String str = this.f13052;
        m6997(this, "Expected " + strM7890 + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public boolean m7005() {
        int i = this.f13054;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f13052;
            if (i >= str.length()) {
                this.f13054 = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f13054 = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final long m7006() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iM7002 = m7002(m7003());
        String str = this.f13052;
        if (iM7002 >= str.length() || iM7002 == -1) {
            m6997(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM7002) == '\"') {
            iM7002++;
            if (iM7002 == str.length()) {
                m6997(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iM7002;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iM7002) {
                        m6997(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (AbstractC4554.m7929(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m6997(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                m6997(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iM7002) {
                            m6997(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iM7002) {
                        m6997(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iM7002) {
                    m6997(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iM7002;
        if (iM7002 == i || (z6 && iM7002 == i - 1)) {
            m6997(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                m6997(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                m6997(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.f13054 = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    C1078.m2275();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m6997(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m6997(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m6997(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m7007(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f13055.append((char) (m7009(i + 3, charSequence) + (m7009(i, charSequence) << 12) + (m7009(i + 1, charSequence) << 8) + (m7009(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f13054 = i;
        if (i2 < charSequence.length()) {
            return m7007(this.f13054, charSequence);
        }
        m6997(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final String m7008() {
        String string;
        m7013('\"');
        int i = this.f13054;
        String str = this.f13052;
        int iM1521 = AbstractC0684.m1521('\"', i, 4, str);
        if (iM1521 == -1) {
            m7010();
            int i2 = this.f13054;
            m6997(this, AbstractC3761.m6629("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iM1521) {
            if (str.charAt(i3) == '\\') {
                int iM7002 = this.f13054;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.f13055;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) str, iM7002, i3);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = str.subSequence(iM7002, i3).toString();
                        }
                        this.f13054 = i3 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iM7002, i3);
                        int iM7003 = m7002(i3 + 1);
                        if (iM7003 == -1) {
                            m6997(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iM7007 = iM7003 + 1;
                        char cCharAt2 = str.charAt(iM7003);
                        if (cCharAt2 == 'u') {
                            iM7007 = m7007(iM7007, str);
                        } else {
                            char c = cCharAt2 < 'u' ? C3199.f10739[cCharAt2] : (char) 0;
                            if (c == 0) {
                                m6997(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iM7002 = m7002(iM7007);
                        if (iM7002 == -1) {
                            m6997(this, "Unexpected EOF", iM7002, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iM7002, i3);
                            iM7002 = m7002(i3);
                            if (iM7002 == -1) {
                                m6997(this, "Unexpected EOF", iM7002, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iM7002;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
            } else {
                i3++;
            }
        }
        this.f13054 = iM1521 + 1;
        return str.substring(i, iM1521);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final int m7009(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m6997(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final String m7010() {
        String string;
        String str = this.f13051;
        if (str != null) {
            this.f13051 = null;
            return str;
        }
        int iM7003 = m7003();
        String str2 = this.f13052;
        if (iM7003 >= str2.length() || iM7003 == -1) {
            m6997(this, "EOF", iM7003, null, 4);
            throw null;
        }
        byte bM7929 = AbstractC4554.m7929(str2.charAt(iM7003));
        if (bM7929 == 1) {
            return m7011();
        }
        if (bM7929 != 0) {
            m6997(this, "Expected beginning of the string, but got " + str2.charAt(iM7003), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bM79210 = AbstractC4554.m7929(str2.charAt(iM7003));
            StringBuilder sb = this.f13055;
            if (bM79210 != 0) {
                int i = this.f13054;
                if (z) {
                    sb.append((CharSequence) str2, i, iM7003);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = str2.subSequence(i, iM7003).toString();
                }
                this.f13054 = iM7003;
                return string;
            }
            iM7003++;
            if (iM7003 >= str2.length()) {
                sb.append((CharSequence) str2, this.f13054, iM7003);
                int iM7002 = m7002(iM7003);
                if (iM7002 == -1) {
                    this.f13054 = iM7003;
                    sb.append((CharSequence) str2, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iM7003 = iM7002;
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final String m7011() {
        String str = this.f13051;
        if (str == null) {
            return m7008();
        }
        this.f13051 = null;
        return str;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m7012(int i, String str, String str2) {
        throw new C2770(AbstractC3801.m6762(i, str, this.f13053.m6306(), str2, AbstractC3801.m6795(i, this.f13052).toString()));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public void m7013(char c) {
        int i = this.f13054;
        if (i == -1) {
            m7004(c);
            throw null;
        }
        while (true) {
            String str = this.f13052;
            if (i >= str.length()) {
                this.f13054 = -1;
                m7004(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f13054 = i2;
                if (cCharAt == c) {
                    return;
                }
                m7004(c);
                throw null;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final String m7014(String str) {
        int i = this.f13054;
        try {
            if (m7000() == 6 && AbstractC3831.m6874(m7015(), str)) {
                this.f13051 = null;
                if (m7000() == 5) {
                    return m7015();
                }
            }
            return null;
        } finally {
            this.f13054 = i;
            this.f13051 = null;
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final String m7015() {
        if (m7016() != 1) {
            return null;
        }
        String strM7011 = m7011();
        this.f13051 = strM7011;
        return strM7011;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public byte m7016() {
        int i = this.f13054;
        while (true) {
            int iM7002 = m7002(i);
            if (iM7002 == -1) {
                this.f13054 = iM7002;
                return (byte) 10;
            }
            char cCharAt = this.f13052.charAt(iM7002);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f13054 = iM7002;
                return AbstractC4554.m7929(cCharAt);
            }
            i = iM7002 + 1;
        }
    }
}
