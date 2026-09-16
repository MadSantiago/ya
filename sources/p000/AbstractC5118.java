package p000;

/* JADX INFO: renamed from: ۦۣۙؕٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5118 {

    /* JADX INFO: renamed from: ۦؑ */
    public static final InterfaceC5561 f16970;

    /* JADX INFO: renamed from: ۥۣ */
    public static final long f16969 = AbstractC4489.m7788(14);

    /* JADX INFO: renamed from: ۥۗ */
    public static final long f16968 = AbstractC4489.m7788(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final long f16967 = C1327.f4592;

    static {
        long j = C1327.f4588;
        f16970 = j != 16 ? new C4268(j) : C1752.f5825;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final long m8741(long j, long j2, float f) {
        C3970[] c3970Arr = C5023.f16621;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    AbstractC1236.m2609("Cannot perform operation for Unspecified type.");
                }
                if (!C3970.m7128(C5023.m8439(j), C5023.m8439(j2))) {
                    AbstractC1236.m2609("Cannot perform operation for " + ((Object) C3970.m7127(C5023.m8439(j))) + " and " + ((Object) C3970.m7127(C5023.m8439(j2))));
                }
                return AbstractC4489.m7799(AbstractC4593.m7993(C5023.m8438(j), C5023.m8438(j2), f), j3);
            }
        }
        return ((C5023) m8742(new C5023(j), new C5023(j2), f)).f16622;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final Object m8742(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[PHI: r15
  0x0047: PHI (r15v8 ۦُؚؖ۠) = (r15v1 ۦُؚؖ۠), (r15v1 ۦُؚؖ۠), (r15v1 ۦُؚؖ۠), (r15v2 ۦُؚؖ۠), (r15v9 ۦُؚؖ۠) binds: [B:63:0x00ea, B:57:0x00d6, B:52:0x00c7, B:47:0x00b8, B:13:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x012f  */
    /* JADX INFO: renamed from: ۥۣ */
    public static final C0553 m8743(C0553 c0553, long j, AbstractC0548 abstractC0548, float f, long j2, C1626 c1626, C5827 c5827, C2848 c2848, AbstractC0903 abstractC0903, String str, long j3, C3917 c3917, C5647 c5647, C5668 c5668, long j4, C1690 c1690, C5906 c5906, C2393 c2393, AbstractC0213 abstractC0213) {
        C3917 c3918;
        C5906 c5907;
        C2393 c2394;
        AbstractC0213 abstractC0214;
        long j5;
        InterfaceC5561 c4268;
        C2848 c2849 = c2848;
        AbstractC0903 abstractC0904 = abstractC0903;
        String str2 = str;
        long j6 = j3;
        C3970[] c3970Arr = C5023.f16621;
        long j7 = j2 & 1095216660480L;
        if (j7 != 0 && !C5023.m8440(j2, c0553.f1987)) {
            c3918 = c3917;
            c5907 = c5906;
            c2394 = c2393;
            abstractC0214 = abstractC0213;
        } else if (abstractC0548 != null || j == 16) {
            if ((c5827 != null || c5827.equals(c0553.f1990)) && ((c1626 == null || c1626.equals(c0553.f1984)) && ((abstractC0904 == null || abstractC0904 == c0553.f1986) && (((j6 & 1095216660480L) == 0 || C5023.m8440(j6, c0553.f1988)) && ((c1690 == null || c1690.equals(c0553.f1992)) && AbstractC3831.m6874(abstractC0548, c0553.f1989.mo3547()) && ((abstractC0548 == null || f == c0553.f1989.mo3549()) && ((c2849 == null || c2849.equals(c0553.f1985)) && (str2 == null || str2.equals(c0553.f1996))))))))) {
                if (c3917 != null) {
                    c3918 = c3917;
                    if (c3918.equals(c0553.f1994)) {
                    }
                } else {
                    c3918 = c3917;
                }
                if (c5647 != null || c5647.equals(c0553.f1993)) {
                    if (c5668 != null || c5668.equals(c0553.f1995)) {
                        if (j4 != 16) {
                            j5 = c0553.f1991;
                            int i = C1327.f4593;
                            if (C4462.m7744(j4, j5)) {
                            }
                            c2394 = c2393;
                            abstractC0214 = abstractC0213;
                        }
                        c5907 = c5906;
                        if (c5907 != null || c5907.equals(c0553.f1997)) {
                            c2394 = c2393;
                            if (c2394 != null || c2394.equals(c0553.f1999)) {
                                abstractC0214 = abstractC0213;
                                if (abstractC0214 != null || abstractC0214.equals(c0553.f1998)) {
                                    return c0553;
                                }
                            }
                        } else {
                            c2394 = c2393;
                        }
                        abstractC0214 = abstractC0213;
                    }
                }
            } else {
                c3918 = c3917;
            }
            c5907 = c5906;
            c2394 = c2393;
            abstractC0214 = abstractC0213;
        } else {
            long jMo3548 = c0553.f1989.mo3548();
            int i2 = C1327.f4593;
            if (C4462.m7744(j, jMo3548)) {
                if (c5827 != null) {
                    if (c3917 != null) {
                        c3918 = c3917;
                        if (c3918.equals(c0553.f1994)) {
                            c5907 = c5906;
                            c2394 = c2393;
                            abstractC0214 = abstractC0213;
                        }
                    } else {
                        c3918 = c3917;
                    }
                    if (c5647 != null) {
                    }
                    if (c5668 != null) {
                    }
                    if (j4 != 16) {
                        j5 = c0553.f1991;
                        int i3 = C1327.f4593;
                        if (C4462.m7744(j4, j5)) {
                            c5907 = c5906;
                        }
                        c2394 = c2393;
                        abstractC0214 = abstractC0213;
                    }
                    c5907 = c5906;
                    if (c5907 != null) {
                    }
                    c2394 = c2393;
                    if (c2394 != null) {
                    }
                    abstractC0214 = abstractC0213;
                    if (abstractC0214 != null) {
                    }
                    return c0553;
                }
                if (c3917 != null) {
                    c3918 = c3917;
                    if (c3918.equals(c0553.f1994)) {
                        c5907 = c5906;
                        c2394 = c2393;
                        abstractC0214 = abstractC0213;
                    }
                } else {
                    c3918 = c3917;
                }
                if (c5647 != null) {
                }
                if (c5668 != null) {
                }
                if (j4 != 16) {
                    j5 = c0553.f1991;
                    int i4 = C1327.f4593;
                    if (C4462.m7744(j4, j5)) {
                        c5907 = c5906;
                    }
                    c2394 = c2393;
                    abstractC0214 = abstractC0213;
                }
                c5907 = c5906;
                if (c5907 != null) {
                }
                c2394 = c2393;
                if (c2394 != null) {
                }
                abstractC0214 = abstractC0213;
                if (abstractC0214 != null) {
                }
                return c0553;
            }
            c3918 = c3917;
            c5907 = c5906;
            c2394 = c2393;
            abstractC0214 = abstractC0213;
        }
        C1752 c1752 = C1752.f5825;
        if (abstractC0548 != null) {
            if (abstractC0548 instanceof C0547) {
                long jM7025 = AbstractC3925.m7025(f, ((C0547) abstractC0548).f1966);
                if (jM7025 != 16) {
                    c4268 = new C4268(jM7025);
                } else {
                    c4268 = c1752;
                }
            } else {
                if (!(abstractC0548 instanceof C0714)) {
                    C1078.m2275();
                    return null;
                }
                c4268 = new C2553((C0714) abstractC0548, f);
            }
        } else if (j != 16) {
            c4268 = new C4268(j);
        } else {
            c4268 = c1752;
        }
        InterfaceC5561 interfaceC5561 = c0553.f1989;
        interfaceC5561.getClass();
        boolean z = c4268 instanceof C2553;
        if (z && (interfaceC5561 instanceof C2553)) {
            C2553 c2553 = (C2553) c4268;
            C0714 c0714 = c2553.f8521;
            float f2 = c2553.f8520;
            if (Float.isNaN(f2)) {
                f2 = ((C2553) interfaceC5561).f8520;
            }
            c4268 = new C2553(c0714, f2);
        } else if ((!z || (interfaceC5561 instanceof C2553)) && ((!z && (interfaceC5561 instanceof C2553)) || c4268.equals(c1752))) {
            c4268 = interfaceC5561;
        }
        if (abstractC0904 == null) {
            abstractC0904 = c0553.f1986;
        }
        long j8 = j7 == 0 ? c0553.f1987 : j2;
        C1626 c1627 = c1626 == null ? c0553.f1984 : c1626;
        C5827 c5828 = c5827 == null ? c0553.f1990 : c5827;
        if (c2849 == null) {
            c2849 = c0553.f1985;
        }
        if (str2 == null) {
            str2 = c0553.f1996;
        }
        if ((j6 & 1095216660480L) == 0) {
            j6 = c0553.f1988;
        }
        if (c3918 == null) {
            c3918 = c0553.f1994;
        }
        C5647 c5648 = c5647 == null ? c0553.f1993 : c5647;
        long j9 = j8;
        C5668 c5669 = c5668 == null ? c0553.f1995 : c5668;
        long j10 = j4 != 16 ? j4 : c0553.f1991;
        C1690 c1691 = c1690 == null ? c0553.f1992 : c1690;
        C5906 c5908 = c5907 == null ? c0553.f1997 : c5907;
        C2393 c2395 = c0553.f1999;
        if (c2395 == null) {
            c2395 = c2394;
        }
        if (abstractC0214 == null) {
            abstractC0214 = c0553.f1998;
        }
        return new C0553(c4268, j9, c1627, c5828, c2849, abstractC0904, str2, j6, c3918, c5648, c5669, j10, c1691, c5908, c2395, abstractC0214);
    }
}
