package p000;

/* JADX INFO: renamed from: ۥٝؔۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1887 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1887 f6268 = new C1887();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2423 f6267 = new C2423("kotlin.uuid.Uuid", C2204.f7302);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f6267;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        String strMo4103 = interfaceC2125.mo4103();
        int length = strMo4103.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo4103.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC0819.f2910[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC5537.m9221(i, strMo4103, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo4103.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC0819.f2910[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC5537.m9221(i2, strMo4103, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C2665(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo4103.length() <= 64 ? strMo4103 : strMo4103.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo4103.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strMo4103.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = AbstractC0819.f2910[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                AbstractC5537.m9221(i, strMo4103, "a hexadecimal digit");
                throw null;
            }
            if (strMo4103.charAt(8) != '-') {
                AbstractC5537.m9221(8, strMo4103, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo4103.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = AbstractC0819.f2910[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC5537.m9221(i3, strMo4103, "a hexadecimal digit");
                throw null;
            }
            if (strMo4103.charAt(13) != '-') {
                AbstractC5537.m9221(13, strMo4103, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo4103.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = AbstractC0819.f2910[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC5537.m9221(i4, strMo4103, "a hexadecimal digit");
                throw null;
            }
            if (strMo4103.charAt(18) != '-') {
                AbstractC5537.m9221(18, strMo4103, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo4103.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = AbstractC0819.f2910[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC5537.m9221(i5, strMo4103, "a hexadecimal digit");
                throw null;
            }
            if (strMo4103.charAt(23) != '-') {
                AbstractC5537.m9221(23, strMo4103, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo4103.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = AbstractC0819.f2910[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC5537.m9221(i6, strMo4103, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C2665(j22, j23);
            }
        }
        return C2665.f8827;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        c3782.m6686(((C2665) obj).toString());
    }
}
