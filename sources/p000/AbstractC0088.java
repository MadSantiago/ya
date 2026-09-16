package p000;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۙ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C1007 f16840;

    /* JADX INFO: renamed from: ۥُ */
    public static final C1007 f16841;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1007 f16842;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C1007 f16843;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C1007 f16844;

    static {
        C1007 c1007 = new C1007("/".getBytes(AbstractC4637.f15306));
        c1007.f3596 = "/";
        f16843 = c1007;
        C1007 c1008 = new C1007("\\".getBytes(AbstractC4637.f15306));
        c1008.f3596 = "\\";
        f16842 = c1008;
        C1007 c1009 = new C1007("/\\".getBytes(AbstractC4637.f15306));
        c1009.f3596 = "/\\";
        f16840 = c1009;
        C1007 c10010 = new C1007(".".getBytes(AbstractC4637.f15306));
        c10010.f3596 = ".";
        f16844 = c10010;
        C1007 c10011 = new C1007("..".getBytes(AbstractC4637.f15306));
        c10011.f3596 = "..";
        f16841 = c10011;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final int m8662(C5051 c5051) {
        C1007 c1007 = c5051.f16767;
        if (c1007.mo2205() != 0) {
            if (c1007.mo2213(0) != 47) {
                if (c1007.mo2213(0) == 92) {
                    if (c1007.mo2205() > 2 && c1007.mo2213(1) == 92) {
                        int iMo2208 = c1007.mo2208(2, f16842.mo2204());
                        return iMo2208 == -1 ? c1007.mo2205() : iMo2208;
                    }
                } else if (c1007.mo2205() > 2 && c1007.mo2213(1) == 58 && c1007.mo2213(2) == 92) {
                    char cMo2213 = (char) c1007.mo2213(0);
                    if ('a' <= cMo2213 && cMo2213 < '{') {
                        return 3;
                    }
                    if ('A' <= cMo2213 && cMo2213 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final C1007 m8663(byte b) {
        if (b == 47) {
            return f16843;
        }
        if (b == 92) {
            return f16842;
        }
        C1078.m2272(AbstractC5078.m8670(b, "not a directory separator: "));
        return null;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final C1007 m8664(String str) {
        if (AbstractC3831.m6874(str, "/")) {
            return f16843;
        }
        if (AbstractC3831.m6874(str, "\\")) {
            return f16842;
        }
        C1078.m2272(AbstractC3761.m6628("not a directory separator: ", str));
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final C1007 m8665(C5051 c5051) {
        C1007 c1007 = c5051.f16767;
        C1007 c1008 = f16843;
        if (C1007.m2201(c1007, c1008) != -1) {
            return c1008;
        }
        C1007 c1009 = c5051.f16767;
        C1007 c10010 = f16842;
        if (C1007.m2201(c1009, c10010) != -1) {
            return c10010;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5051 m8666(C5051 c5051, C5051 c5052, boolean z) {
        if (m8662(c5052) != -1 || c5052.m8570() != null) {
            return c5052;
        }
        C1007 c1007M8665 = m8665(c5051);
        if (c1007M8665 == null && (c1007M8665 = m8665(c5052)) == null) {
            c1007M8665 = m8664(C5051.f16766);
        }
        C1270 c1270 = new C1270();
        c1270.m2676(c5051.f16767);
        if (c1270.f4340 > 0) {
            c1270.m2676(c1007M8665);
        }
        c1270.m2676(c5052.f16767);
        return m8667(c1270, z);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115 A[EDGE_INSN: B:101:0x0115->B:84:0x0115 BREAK  A[LOOP:1: B:53:0x00a5->B:116:0x00a5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX INFO: renamed from: ۦؑ */
    public static final C5051 m8667(C1270 c1270, boolean z) throws EOFException {
        C1007 c1007;
        long j;
        char cM2670;
        boolean z2;
        ArrayList arrayList;
        boolean zM2693;
        C1007 c1008;
        int size;
        int i;
        long jM2695;
        C1007 c1007Mo2690;
        C1007 c1009;
        C1270 c1271 = new C1270();
        C1007 c1007M8663 = null;
        int i2 = 0;
        while (true) {
            if (!c1270.mo2694(0L, f16843)) {
                c1007 = f16842;
                if (!c1270.mo2694(0L, c1007)) {
                    break;
                }
            }
            byte b = c1270.readByte();
            if (c1007M8663 == null) {
                c1007M8663 = m8663(b);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && AbstractC3831.m6874(c1007M8663, c1007);
        C1007 c10010 = f16840;
        if (z3) {
            c1271.m2676(c1007M8663);
            c1271.m2676(c1007M8663);
        } else {
            if (i2 <= 0) {
                long jM2696 = c1270.m2695(c10010);
                if (c1007M8663 == null) {
                    c1007M8663 = jM2696 == -1 ? m8664(C5051.f16766) : m8663(c1270.m2670(jM2696));
                }
                if (AbstractC3831.m6874(c1007M8663, c1007) && c1270.f4340 >= 2) {
                    j = -1;
                    if (c1270.m2670(1L) == 58 && (('a' <= (cM2670 = (char) c1270.m2670(0L)) && cM2670 < '{') || ('A' <= cM2670 && cM2670 < '['))) {
                        if (jM2696 == 2) {
                            c1271.mo962(c1270, 3L);
                        } else {
                            c1271.mo962(c1270, 2L);
                        }
                    }
                }
                if (c1271.f4340 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zM2693 = c1270.m2693();
                    c1008 = f16844;
                    if (!zM2693) {
                        break;
                    }
                    jM2695 = c1270.m2695(c10010);
                    if (jM2695 == j) {
                        c1007Mo2690 = c1270.mo2690(c1270.f4340);
                    } else {
                        c1007Mo2690 = c1270.mo2690(jM2695);
                        c1270.readByte();
                    }
                    c1009 = f16841;
                    if (c1007Mo2690.equals(c1009)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || AbstractC3831.m6874(AbstractC0973.m2040(arrayList), c1009)))) {
                                arrayList.add(c1007Mo2690);
                            } else if (!z3 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(AbstractC2164.m4181(arrayList));
                                }
                            }
                        }
                    } else if (c1007Mo2690.equals(c1008) && !c1007Mo2690.equals(C1007.f3595)) {
                        arrayList.add(c1007Mo2690);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        c1271.m2676(c1007M8663);
                    }
                    c1271.m2676((C1007) arrayList.get(i));
                }
                if (c1271.f4340 == 0) {
                    c1271.m2676(c1008);
                }
                return new C5051(c1271.mo2690(c1271.f4340));
            }
            c1271.m2676(c1007M8663);
        }
        j = -1;
        if (c1271.f4340 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zM2693 = c1270.m2693();
            c1008 = f16844;
            if (!zM2693) {
                break;
                break;
            }
            jM2695 = c1270.m2695(c10010);
            if (jM2695 == j) {
                c1007Mo2690 = c1270.mo2690(c1270.f4340);
            } else {
                c1007Mo2690 = c1270.mo2690(jM2695);
                c1270.readByte();
            }
            c1009 = f16841;
            if (c1007Mo2690.equals(c1009)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(c1007Mo2690);
            } else if (c1007Mo2690.equals(c1008)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                c1271.m2676(c1007M8663);
            }
            c1271.m2676((C1007) arrayList.get(i));
        }
        if (c1271.f4340 == 0) {
            c1271.m2676(c1008);
        }
        return new C5051(c1271.mo2690(c1271.f4340));
    }
}
