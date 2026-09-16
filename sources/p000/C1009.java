package p000;

/* JADX INFO: renamed from: ۥََؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1009 f3600 = new C1009();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f3599 = new C2423("kotlin.time.Instant", C2204.f7302);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f3599;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x046f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0492  */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x046f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x0492, please report this as an issue */
    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        int i;
        C2936 c2936M6761;
        C2936 c2936M6762;
        C2936 c2936M6763;
        C2936 c2936M6764;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        InterfaceC4886 interfaceC4886M6767;
        char cCharAt2;
        C3416 c3416 = C3416.f11373;
        String strMo4103 = interfaceC2125.mo4103();
        if (strMo4103.length() == 0) {
            interfaceC4886M6767 = new C2936("An empty string is not a valid Instant", strMo4103);
        } else {
            char cCharAt3 = strMo4103.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strMo4103.length() && '0' <= (cCharAt2 = strMo4103.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo4103.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strMo4103.charAt(i) >= '2') {
                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strMo4103.length() < i7) {
                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "The input string is too short");
                } else {
                    C2936 c2936M6765 = AbstractC3801.m6761(strMo4103, "'-'", i5, new C2582(24));
                    if (c2936M6765 != null) {
                        interfaceC4886M6767 = c2936M6765;
                    } else {
                        c2936M6761 = AbstractC3801.m6761(strMo4103, "'-'", i5 + 3, new C2582(25));
                        if (c2936M6761 == null && (c2936M6762 = AbstractC3801.m6761(strMo4103, "'T' or 't'", i5 + 6, new C2582(26))) == null && (c2936M6763 = AbstractC3801.m6761(strMo4103, "':'", i5 + 9, new C2582(27))) == null && (c2936M6764 = AbstractC3801.m6761(strMo4103, "':'", i5 + 12, new C2582(28))) == null) {
                            interfaceC4886M6767 = c2936M6761;
                            interfaceC4886M6767 = c2936M6762;
                            interfaceC4886M6767 = c2936M6763;
                            interfaceC4886M6767 = c2936M6764;
                            int[] iArr = AbstractC3801.f12614;
                            for (int i8 = 0; i8 < 10; i8++) {
                                C2936 c2936M6766 = AbstractC3801.m6761(strMo4103, "an ASCII digit", i5 + iArr[i8], new C2582(29));
                                if (c2936M6766 != null) {
                                    interfaceC4886M6767 = c2936M6766;
                                }
                            }
                            int iM6748 = AbstractC3801.m6748(i5 + 1, strMo4103);
                            int iM6749 = AbstractC3801.m6748(i5 + 4, strMo4103);
                            int iM67410 = AbstractC3801.m6748(i5 + 7, strMo4103);
                            int iM67411 = AbstractC3801.m6748(i5 + 10, strMo4103);
                            int iM67412 = AbstractC3801.m6748(i5 + 13, strMo4103);
                            int i9 = i5 + 15;
                            if (strMo4103.charAt(i9) == '.') {
                                i9 = i7;
                                int iCharAt2 = 0;
                                while (i9 < strMo4103.length() && '0' <= (cCharAt = strMo4103.charAt(i9)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strMo4103.charAt(i9) - '0');
                                    i9++;
                                }
                                int i10 = i9 - i7;
                                if (1 > i10 || i10 >= 10) {
                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                } else {
                                    i2 = iCharAt2 * AbstractC3801.f12617[9 - i10];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i9 >= strMo4103.length()) {
                                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strMo4103.charAt(i9);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strMo4103.length() - i9;
                                    if (length > 9) {
                                        interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "The UTC offset string \"" + AbstractC3801.m6752(16, strMo4103.subSequence(i9, strMo4103.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Invalid UTC offset string \"" + strMo4103.subSequence(i9, strMo4103.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = AbstractC3801.f12620;
                                        int i11 = 0;
                                        for (int i12 = 2; i11 < i12; i12 = 2) {
                                            int i13 = i9 + iArr2[i11];
                                            if (i13 >= strMo4103.length()) {
                                                break;
                                            }
                                            if (strMo4103.charAt(i13) != ':') {
                                                StringBuilder sbM8680 = AbstractC5078.m8680(i13, "Expected ':' at index ", ", got '");
                                                sbM8680.append(strMo4103.charAt(i13));
                                                sbM8680.append('\'');
                                                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, sbM8680.toString());
                                            } else {
                                                i11++;
                                            }
                                        }
                                        int[] iArr3 = AbstractC3801.f12615;
                                        int i14 = 0;
                                        while (i14 < 6 && (i4 = iArr3[i14] + i9) < strMo4103.length()) {
                                            char cCharAt5 = strMo4103.charAt(i4);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM8681 = AbstractC5078.m8680(i4, "Expected an ASCII digit at index ", ", got '");
                                                sbM8681.append(strMo4103.charAt(i4));
                                                sbM8681.append('\'');
                                                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, sbM8681.toString());
                                            } else {
                                                i14++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iM67413 = AbstractC3801.m6748(i9 + 1, strMo4103);
                                        int iM67414 = length > 3 ? AbstractC3801.m6748(i9 + 4, strMo4103) : 0;
                                        int iM67415 = length > 6 ? AbstractC3801.m6748(i9 + 7, strMo4103) : 0;
                                        if (iM67414 > 59) {
                                            interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected offset-minute-of-hour in 0..59, got " + iM67414);
                                        } else if (iM67415 > 59) {
                                            interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected offset-second-of-minute in 0..59, got " + iM67415);
                                        } else if (iM67413 <= 17 || (iM67413 == 18 && iM67414 == 0 && iM67415 == 0)) {
                                            i3 = ((iM67414 * 60) + (iM67413 * 3600) + iM67415) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM6748 || iM6748 >= 13) {
                                                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected a month number in 1..12, got " + iM6748);
                                            } else if (1 > iM6749) {
                                                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected a valid day-of-month for month " + iM6748 + " of year " + iCharAt + ", got " + iM6749);
                                            } else {
                                                int i15 = iCharAt & 3;
                                                if (iM6749 > (iM6748 != 2 ? (iM6748 == 4 || iM6748 == 6 || iM6748 == 9 || iM6748 == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected a valid day-of-month for month " + iM6748 + " of year " + iCharAt + ", got " + iM6749);
                                                } else if (iM67410 > 23) {
                                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected hour in 0..23, got " + iM67410);
                                                } else if (iM67411 > 59) {
                                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected minute-of-hour in 0..59, got " + iM67411);
                                                } else if (iM67412 > 59) {
                                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected second-of-minute in 0..59, got " + iM67412);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iM6748 * 367) - 362) / 12)) + ((long) (iM6749 - 1));
                                                    if (iM6748 > 2) {
                                                        j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    C0154 c0154 = new C0154();
                                                    c0154.f593 = (((j3 - 719528) * 86400) + ((long) (((iM67411 * 60) + (iM67410 * 3600)) + iM67412))) - ((long) i3);
                                                    c0154.f592 = i2;
                                                    interfaceC4886M6767 = c0154;
                                                }
                                            }
                                        } else {
                                            interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected an offset in -18:00..+18:00, got " + strMo4103.subSequence(i9, strMo4103.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i16 = i9 + 1;
                                    if (strMo4103.length() == i16) {
                                        i3 = 0;
                                        if (1 <= iM6748) {
                                            interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected a month number in 1..12, got " + iM6748);
                                        } else {
                                            interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected a month number in 1..12, got " + iM6748);
                                        }
                                    } else {
                                        interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Extra text after the instant at position " + i16);
                                    }
                                } else {
                                    interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                interfaceC4886M6767 = AbstractC3801.m6767(strMo4103, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        interfaceC4886M6767 = c2936M6761;
        interfaceC4886M6767 = c2936M6762;
        interfaceC4886M6767 = c2936M6763;
        interfaceC4886M6767 = c2936M6764;
        interfaceC4886M6767 = c2936M6761;
        interfaceC4886M6767 = c2936M6762;
        interfaceC4886M6767 = c2936M6763;
        interfaceC4886M6767 = c2936M6761;
        interfaceC4886M6767 = c2936M6762;
        interfaceC4886M6767 = c2936M6761;
        return interfaceC4886M6767.toInstant();
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        c3782.m6686(((C3416) obj).toString());
    }
}
