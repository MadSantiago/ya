package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘؖ۟ٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3501 extends AbstractC2765 implements InterfaceC2125, InterfaceC5308 {

    /* JADX INFO: renamed from: ۥٝ */
    public final C3915 f11605;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f11606 = -1;

    /* JADX INFO: renamed from: ۥۤ */
    public final C0971 f11607;

    /* JADX INFO: renamed from: ۦؒ */
    public final EnumC5504 f11608;

    public C3501(C0971 c0971, EnumC5504 enumC5504, C3915 c3915, InterfaceC0103 interfaceC0103) {
        this.f11607 = c0971;
        this.f11608 = enumC5504;
        this.f11605 = c3915;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥؓ */
    public final String mo4103() {
        return this.f11605.m7011();
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥؖ */
    public final short mo4104() {
        C3915 c3915 = this.f11605;
        long jM7006 = c3915.m7006();
        short s = (short) jM7006;
        if (jM7006 == s) {
            return s;
        }
        C3915.m6997(c3915, "Failed to parse short for input '" + jM7006 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥَ */
    public final void mo5156(InterfaceC0103 interfaceC0103) {
        if (interfaceC0103.mo189() == 0 && AbstractC1605.m3340(this.f11607, interfaceC0103)) {
            while (mo6291(interfaceC0103) != -1) {
            }
        }
        C3915 c3915 = this.f11605;
        if (c3915.m6999()) {
            AbstractC3801.m6756(c3915, "");
            throw null;
        }
        c3915.m7013(this.f11608.f18174);
        C3510 c3510 = c3915.f13053;
        int i = c3510.f11622;
        int[] iArr = (int[]) c3510.f11624;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            c3510.f11622 = i;
        }
        if (i != -1) {
            c3510.f11622 = i - 1;
        }
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo4105() {
        boolean z;
        C3915 c3915 = this.f11605;
        int iM7002 = c3915.m7002(c3915.m7003());
        String str = c3915.f13052;
        int length = str.length() - iM7002;
        if (length >= 4 && iM7002 != -1) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    if (length <= 4 || AbstractC4554.m7929(str.charAt(iM7002 + 4)) != 0) {
                        c3915.f13054 = iM7002 + 4;
                        z = true;
                        break;
                    }
                } else if ("null".charAt(i) == str.charAt(iM7002 + i)) {
                    i++;
                }
                z = false;
                break;
            }
        } else {
            z = false;
            break;
        }
        return !z;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥّ */
    public final char mo4106() {
        C3915 c3915 = this.f11605;
        String strM7010 = c3915.m7010();
        if (strM7010.length() == 1) {
            return strM7010.charAt(0);
        }
        C3915.m6997(c3915, AbstractC5078.m8669('\'', "Expected single char, but got '", strM7010), 0, null, 6);
        throw null;
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥٖ */
    public final C4036 mo6288() {
        return AbstractC2164.f7138;
    }

    /* JADX INFO: renamed from: ۥٗ */
    public final C0971 m6289() {
        return this.f11607;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۖ */
    public final InterfaceC2125 mo4107(InterfaceC0103 interfaceC0103) {
        return AbstractC3143.m5818(interfaceC0103) ? new C5847(this.f11605, this.f11607) : this;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۗ */
    public final long mo4108() {
        return this.f11605.m7006();
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۙ */
    public final int mo4109(InterfaceC0103 interfaceC0103) {
        C3915 c3915 = this.f11605;
        String strM7011 = c3915.m7011();
        String strConcat = " at path ".concat(c3915.f13053.m6306());
        int iM3374 = AbstractC1605.m3374(interfaceC0103, this.f11607, strM7011);
        if (iM3374 != -3) {
            return iM3374;
        }
        throw new C0480(interfaceC0103.mo186() + " does not contain element with name '" + strM7011 + '\'' + strConcat);
    }

    /* JADX INFO: renamed from: ۥۚ */
    public final AbstractC0695 m6290() {
        return new C0322(this.f11607.f3430, this.f11605).m707();
    }

    @Override // p000.InterfaceC5308
    /* JADX INFO: renamed from: ۥۜ */
    public final int mo6291(InterfaceC0103 interfaceC0103) {
        C3915 c3915 = this.f11605;
        C3510 c3510 = c3915.f13053;
        EnumC5504 enumC5504 = this.f11608;
        int iOrdinal = enumC5504.ordinal();
        boolean zM6999 = false;
        int i = -1;
        if (iOrdinal == 0) {
            boolean zM69910 = c3915.m6999();
            while (true) {
                if (!c3915.m7005()) {
                    if (!zM69910) {
                        break;
                    }
                    AbstractC3801.m6765(c3915);
                    throw null;
                }
                String strM7008 = c3915.m7008();
                c3915.m7013(':');
                C0971 c0971 = this.f11607;
                int iM3374 = AbstractC1605.m3374(interfaceC0103, c0971, strM7008);
                if (iM3374 != -3) {
                    i = iM3374;
                    break;
                }
                if (!AbstractC1605.m3340(c0971, interfaceC0103)) {
                    int i2 = c3510.f11622;
                    int[] iArr = (int[]) c3510.f11624;
                    if (iArr[i2] == -2) {
                        iArr[i2] = -1;
                        i2--;
                        c3510.f11622 = i2;
                    }
                    if (i2 != -1) {
                        c3510.f11622 = i2 - 1;
                    }
                    c3915.m7012(AbstractC0684.m1519(6, c3915.f13052.subSequence(0, c3915.f13054).toString(), strM7008), AbstractC5078.m8669('\'', "Encountered an unknown key '", strM7008), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                byte bM7016 = c3915.m7016();
                if (bM7016 == 8 || bM7016 == 6) {
                    while (true) {
                        byte bM7017 = c3915.m7016();
                        if (bM7017 == 1) {
                            c3915.m7008();
                        } else {
                            if (bM7017 == 8 || bM7017 == 6) {
                                arrayList.add(Byte.valueOf(bM7017));
                            } else if (bM7017 == 9) {
                                if (((Number) AbstractC0973.m2040(arrayList)).byteValue() != 8) {
                                    C3915.m6997(c3915, "found ] instead of }", 0, null, 6);
                                    throw null;
                                }
                                AbstractC3649.m6528(arrayList);
                            } else if (bM7017 == 7) {
                                if (((Number) AbstractC0973.m2040(arrayList)).byteValue() != 6) {
                                    C3915.m6997(c3915, "found } instead of ]", 0, null, 6);
                                    throw null;
                                }
                                AbstractC3649.m6528(arrayList);
                            } else if (bM7017 == 10) {
                                C3915.m6997(c3915, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                throw null;
                            }
                            c3915.m7000();
                            if (arrayList.size() == 0) {
                                break;
                            }
                        }
                    }
                } else {
                    c3915.m7010();
                }
                zM69910 = c3915.m6999();
            }
        } else if (iOrdinal != 2) {
            boolean zM69911 = c3915.m6999();
            if (c3915.m7005()) {
                int i3 = this.f11606;
                if (i3 != -1 && !zM69911) {
                    C3915.m6997(c3915, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i = i3 + 1;
                this.f11606 = i;
            } else if (zM69911) {
                AbstractC3801.m6756(c3915, "array");
                throw null;
            }
        } else {
            int i4 = this.f11606;
            boolean z = i4 % 2 != 0;
            if (!z) {
                c3915.m7013(':');
            } else if (i4 != -1) {
                zM6999 = c3915.m6999();
            }
            if (c3915.m7005()) {
                if (z) {
                    int i5 = this.f11606;
                    int i6 = c3915.f13054;
                    if (i5 == -1) {
                        if (zM6999) {
                            C3915.m6997(c3915, "Unexpected leading comma", i6, null, 4);
                            throw null;
                        }
                    } else if (!zM6999) {
                        C3915.m6997(c3915, "Expected comma after the key-value pair", i6, null, 4);
                        throw null;
                    }
                }
                i = this.f11606 + 1;
                this.f11606 = i;
            } else if (zM6999) {
                AbstractC3801.m6765(c3915);
                throw null;
            }
        }
        if (enumC5504 != EnumC5504.MAP) {
            ((int[]) c3510.f11624)[c3510.f11622] = i;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0123  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0123, please report this as an issue */
    @Override // p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo4110(InterfaceC4734 interfaceC4734) {
        String strMo362;
        C0971 c0971 = this.f11607;
        C3915 c3915 = this.f11605;
        C3510 c3510 = c3915.f13053;
        try {
            if (!(interfaceC4734 instanceof C1527)) {
                return interfaceC4734.mo196(this);
            }
            String strM7014 = c3915.m7014(AbstractC4009.m7175(c0971, ((C1527) interfaceC4734).mo193()));
            if (strM7014 != null) {
                try {
                    AbstractC0186.m436((C1527) interfaceC4734, this, strM7014);
                    throw null;
                } catch (C0480 e) {
                    String message = e.getMessage();
                    int iM1521 = AbstractC0684.m1521('\n', 0, 6, message);
                    if (iM1521 != -1) {
                        message = message.substring(0, iM1521);
                    }
                    if (AbstractC0684.m1517(message, ".")) {
                        message = message.substring(0, message.length() - ".".length());
                    }
                    String message2 = e.getMessage();
                    String strSubstring = "";
                    int iM1522 = AbstractC0684.m1521('\n', 0, 6, message2);
                    if (iM1522 != -1) {
                        strSubstring = message2.substring(iM1522 + 1, message2.length());
                    }
                    C3915.m6997(c3915, message, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strM7175 = AbstractC4009.m7175(c0971, ((C1527) interfaceC4734).mo193());
            AbstractC0695 abstractC0695M6290 = m6290();
            String strMo186 = ((C1527) interfaceC4734).mo193().mo186();
            if (!(abstractC0695M6290 instanceof C2945)) {
                throw new C2770(AbstractC3801.m6762(-1, "Expected " + AbstractC5041.m8557(C2945.class).m5775() + ", but had " + AbstractC5041.m8557(abstractC0695M6290.getClass()).m5775() + " as the serialized body of " + strMo186, c3510.m6306(), null, AbstractC3801.m6795(-1, abstractC0695M6290.toString()).toString()));
            }
            C2945 c2945 = (C2945) abstractC0695M6290;
            AbstractC0695 abstractC0695 = (AbstractC0695) c2945.get(strM7175);
            if (abstractC0695 != null) {
                AbstractC1020 abstractC1020M1270 = AbstractC0569.m1270(abstractC0695);
                strMo362 = abstractC1020M1270 instanceof C0437 ? null : abstractC1020M1270.mo362();
            }
            try {
                AbstractC0186.m436((C1527) interfaceC4734, this, strMo362);
                throw null;
            } catch (C0480 e2) {
                throw new C2770(AbstractC3801.m6762(-1, e2.getMessage(), null, null, AbstractC3801.m6795(-1, c2945.toString()).toString()));
            }
            if (AbstractC0684.m1527(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new C1267(e.getMessage() + " at path: " + c3510.m6306(), e, e.f4339, e.f4338);
        } catch (C1267 e3) {
            if (AbstractC0684.m1527(e3.getMessage(), "at path", false)) {
                throw e3;
            }
            throw new C1267(e3.getMessage() + " at path: " + c3510.m6306(), e3, e3.f4339, e3.f4338);
        }
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۥۧ */
    public final float mo4111() {
        C3915 c3915 = this.f11605;
        String strM7010 = c3915.m7010();
        try {
            float f = Float.parseFloat(strM7010);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            C3915.m6997(c3915, AbstractC3801.m6777(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'float' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo4112() {
        boolean z;
        boolean z2;
        C3915 c3915 = this.f11605;
        int iM7003 = c3915.m7003();
        String str = c3915.f13052;
        if (iM7003 == str.length()) {
            C3915.m6997(c3915, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iM7003) == '\"') {
            iM7003++;
            z = true;
        } else {
            z = false;
        }
        int iM7002 = c3915.m7002(iM7003);
        if (iM7002 >= str.length() || iM7002 == -1) {
            C3915.m6997(c3915, "EOF", 0, null, 6);
            throw null;
        }
        int i = iM7002 + 1;
        int iCharAt = str.charAt(iM7002) | ' ';
        if (iCharAt == 102) {
            c3915.m6998(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C3915.m6997(c3915, "Expected valid boolean literal prefix, but had '" + c3915.m7010() + '\'', 0, null, 6);
                throw null;
            }
            c3915.m6998(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c3915.f13054 == str.length()) {
            C3915.m6997(c3915, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(c3915.f13054) == '\"') {
            c3915.f13054++;
            return z2;
        }
        C3915.m6997(c3915, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦؙ */
    public final double mo4113() {
        C3915 c3915 = this.f11605;
        String strM7010 = c3915.m7010();
        try {
            double d = Double.parseDouble(strM7010);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            C3915.m6997(c3915, AbstractC3801.m6777(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C3915.m6997(c3915, AbstractC5078.m8669('\'', "Failed to parse type 'double' for input '", strM7010), 0, null, 6);
            throw null;
        }
    }

    @Override // p000.AbstractC2765, p000.InterfaceC5308
    /* JADX INFO: renamed from: ۦٕ */
    public final Object mo5162(InterfaceC0103 interfaceC0103, int i, InterfaceC4734 interfaceC4734, Object obj) {
        C3510 c3510 = this.f11605.f13053;
        boolean z = this.f11608 == EnumC5504.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c3510.f11624;
            int i2 = c3510.f11622;
            if (iArr[i2] == -2) {
                ((Object[]) c3510.f11621)[i2] = C1298.f4432;
            }
        }
        Object objMo4110 = mo4110(interfaceC4734);
        if (z) {
            int[] iArr2 = (int[]) c3510.f11624;
            int i3 = c3510.f11622;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c3510.f11622 = i4;
                if (i4 == ((Object[]) c3510.f11621).length) {
                    c3510.m6307();
                }
            }
            Object[] objArr = (Object[]) c3510.f11621;
            int i5 = c3510.f11622;
            objArr[i5] = objMo4110;
            ((int[]) c3510.f11624)[i5] = -2;
        }
        return objMo4110;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦٚ */
    public final InterfaceC5308 mo4114(InterfaceC0103 interfaceC0103) {
        C0971 c0971 = this.f11607;
        EnumC5504 enumC5504M8146 = C4773.m8146(c0971, interfaceC0103);
        C3915 c3915 = this.f11605;
        C3510 c3510 = c3915.f13053;
        int i = c3510.f11622 + 1;
        c3510.f11622 = i;
        if (i == ((Object[]) c3510.f11621).length) {
            c3510.m6307();
        }
        ((Object[]) c3510.f11621)[i] = interfaceC0103;
        c3915.m7013(enumC5504M8146.f18175);
        if (c3915.m7016() == 4) {
            C3915.m6997(c3915, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC5504M8146.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C3501(c0971, enumC5504M8146, c3915, interfaceC0103);
        }
        return this.f11608 == enumC5504M8146 ? this : new C3501(c0971, enumC5504M8146, c3915, interfaceC0103);
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦۛ */
    public final byte mo4115() {
        C3915 c3915 = this.f11605;
        long jM7006 = c3915.m7006();
        byte b = (byte) jM7006;
        if (jM7006 == b) {
            return b;
        }
        C3915.m6997(c3915, "Failed to parse byte for input '" + jM7006 + '\'', 0, null, 6);
        throw null;
    }

    @Override // p000.AbstractC2765, p000.InterfaceC2125
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo4116() {
        C3915 c3915 = this.f11605;
        long jM7006 = c3915.m7006();
        int i = (int) jM7006;
        if (jM7006 == i) {
            return i;
        }
        C3915.m6997(c3915, "Failed to parse int for input '" + jM7006 + '\'', 0, null, 6);
        throw null;
    }
}
