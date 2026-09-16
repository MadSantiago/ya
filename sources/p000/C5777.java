package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦۦؖۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5777 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC3831 f19033;

    /* JADX INFO: renamed from: ۥۗ */
    public C2067 f19034;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4992 f19036 = new C4992(12);

    /* JADX INFO: renamed from: ۥۣ */
    public final C0390 f19035 = new C0390();

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥّ */
    public final void mo3264(C3571 c3571) {
        C3781 c3781 = new C3781(new C3223(new C4036(4)));
        C0390 c0390 = this.f19035;
        c0390.m906(c3781);
        int i = 3;
        c0390.m906(new C3781(i));
        int i2 = 0;
        c0390.m906(new C3333(i2));
        c0390.m906(new C3781(5));
        c0390.m906(new C3781(6));
        c0390.m906(new C3781(4));
        c0390.m906(new C3333(2));
        c0390.m906(new C3333(i));
        int i3 = 1;
        c0390.m906(new C3333(i3));
        c0390.m906(new C3781(i2));
        c0390.m906(new C3781(i3));
        this.f19034 = new C2067(this.f19036, new C4452(2));
        HashMap map = (HashMap) c0390.f1447;
        if (c0390.f1448) {
            C1078.m2276("Builder has been already built");
        } else {
            c0390.f1448 = true;
            this.f19033 = map.size() > 0 ? new C4118(Collections.unmodifiableMap(map)) : new C2554();
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo9475(C1489 c1489) {
        AbstractC3831 abstractC3831 = this.f19033;
        if (abstractC3831 != null) {
            abstractC3831.mo4832(c1489, this.f19034);
        } else {
            C1078.m2276("Unexpected state, html-renderer is not defined");
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3529(C5008 c5008) {
        c5008.m8424(C3523.class, new C2958(this, 1));
        c5008.m8424(C2149.class, new C2958(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x029f  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:185:0x02cf  */
    /* JADX INFO: renamed from: ۦۗ */
    public final void m9582(C1489 c1489, String str) {
        AbstractC4294 abstractC4294;
        C0446 c0446;
        C0446 c0447;
        boolean z;
        ArrayList arrayList;
        String strM8378;
        String strM8379;
        C3304 c3304;
        String strM83710;
        int length;
        if (str == null) {
            return;
        }
        C2067 c2067 = this.f19034;
        C2658 c2658 = (C2658) c1489.f5058;
        StringBuilder sb = c2658.f8818;
        C4992 c4992 = c2067.f6814;
        Set set = C2067.f6810;
        Set set2 = C2067.f6809;
        ArrayList arrayList2 = c2067.f6813;
        Set set3 = C2067.f6808;
        boolean z2 = false;
        C4271 c4271 = new C4271(new C3884(str), new C5783(0));
        while (true) {
            if (c4271.f14138) {
                StringBuilder sb2 = c4271.f14150;
                int length2 = sb2.length();
                C4638 c4638 = c4271.f14145;
                if (length2 > 0) {
                    String string = sb2.toString();
                    sb2.delete(z2 ? 1 : 0, sb2.length());
                    c4271.f14139 = null;
                    c4638.f15307 = string;
                    abstractC4294 = c4638;
                } else {
                    String str2 = c4271.f14139;
                    if (str2 != null) {
                        c4638.f15307 = str2;
                        c4271.f14139 = null;
                        abstractC4294 = c4638;
                    } else {
                        c4271.f14138 = z2;
                        abstractC4294 = c4271.f14144;
                    }
                }
                int i = abstractC4294.f14205;
                if (6 == i) {
                    return;
                }
                int iM6632 = AbstractC3761.m6632(i);
                if (iM6632 == 1) {
                    C5891 c5891 = (C5891) abstractC4294;
                    boolean zContains = set3.contains(c5891.f14615);
                    String str3 = c5891.f14615;
                    if (zContains) {
                        C3304 c3305 = new C3304(str3, sb.length(), C2067.m4012(c5891));
                        if (c2067.f6812) {
                            int length3 = c2658.length();
                            if (length3 > 0 && '\n' != c2658.charAt(length3 - 1)) {
                                AbstractC4593.m7981(c2658, '\n');
                            }
                            c2067.f6812 = false;
                        }
                        if (set.contains(str3) || c5891.f14622) {
                            String strM83711 = C4992.m8378(c3305);
                            if (strM83711 != null && strM83711.length() > 0) {
                                try {
                                    c2658.append(strM83711);
                                } catch (IOException e) {
                                    C5028.m8450(e);
                                    return;
                                }
                            }
                            int length4 = sb.length();
                            if (!c3305.m7287()) {
                                c3305.f13682 = length4;
                            }
                        }
                        arrayList2.add(c3305);
                    } else {
                        if ("p".equals((String) c2067.f6811.f13680)) {
                            c2067.f6811.m969(sb.length());
                            AbstractC4593.m7981(c2658, '\n');
                            c2067.f6811 = c2067.f6811.f1633;
                        } else if ("li".equals(str3) && "li".equals((String) c2067.f6811.f13680)) {
                            c2067.f6811.m969(sb.length());
                            c2067.f6811 = c2067.f6811.f1633;
                        }
                        if (set2.contains(str3)) {
                            c2067.f6815 = "pre".equals(str3);
                            int length5 = c2658.length();
                            if (length5 > 0 && '\n' != c2658.charAt(length5 - 1)) {
                                AbstractC4593.m7981(c2658, '\n');
                            }
                        } else {
                            if (c2067.f6812) {
                                int length6 = c2658.length();
                                if (length6 > 0 && '\n' != c2658.charAt(length6 - 1)) {
                                    AbstractC4593.m7981(c2658, '\n');
                                }
                                c2067.f6812 = false;
                            }
                            int length7 = sb.length();
                            Map mapM4012 = C2067.m4012(c5891);
                            c0446 = c2067.f6811;
                            c0447 = new C0446(str3, length7, mapM4012, c0446);
                            if (!set.contains(str3) || c5891.f14622) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                strM8378 = C4992.m8378(c0447);
                                if (strM8378 != null && strM8378.length() > 0) {
                                    try {
                                        c2658.append(strM8378);
                                    } catch (IOException e2) {
                                        C5028.m8450(e2);
                                        return;
                                    }
                                }
                                c0447.m969(sb.length());
                            }
                            arrayList = c0446.f1634;
                            if (arrayList == null) {
                                arrayList = new ArrayList(2);
                                c0446.f1634 = arrayList;
                            }
                            arrayList.add(c0447);
                            if (!z) {
                                c2067.f6811 = c0447;
                            }
                        }
                        int length8 = sb.length();
                        Map mapM4013 = C2067.m4012(c5891);
                        c0446 = c2067.f6811;
                        c0447 = new C0446(str3, length8, mapM4013, c0446);
                        if (set.contains(str3)) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            strM8378 = C4992.m8378(c0447);
                            if (strM8378 != null) {
                                c2658.append(strM8378);
                            }
                            c0447.m969(sb.length());
                        }
                        arrayList = c0446.f1634;
                        if (arrayList == null) {
                            arrayList = new ArrayList(2);
                            c0446.f1634 = arrayList;
                        }
                        arrayList.add(c0447);
                        if (!z) {
                            c2067.f6811 = c0447;
                        }
                    }
                } else if (iM6632 == 2) {
                    C5177 c5177 = (C5177) abstractC4294;
                    boolean zContains2 = set3.contains(c5177.f14615);
                    String str4 = c5177.f14615;
                    if (zContains2) {
                        int size = arrayList2.size();
                        while (true) {
                            size--;
                            if (size <= -1) {
                                c3304 = null;
                                break;
                            }
                            C3304 c3306 = (C3304) arrayList2.get(size);
                            if (str4.equals((String) c3306.f13680) && c3306.f13682 < 0) {
                                c3304 = c3306;
                                break;
                            }
                        }
                        if (c3304 != null) {
                            if (c3304.f13683 == c2658.length() && (strM83710 = C4992.m8378(c3304)) != null) {
                                try {
                                    c2658.append(strM83710);
                                } catch (IOException e3) {
                                    C5028.m8450(e3);
                                    return;
                                }
                            }
                            int length9 = sb.length();
                            if (!c3304.m7287()) {
                                c3304.f13682 = length9;
                            }
                        }
                    } else {
                        C0446 c0448 = c2067.f6811;
                        while (c0448 != null && !str4.equals((String) c0448.f13680) && !c0448.m7287()) {
                            c0448 = c0448.f1633;
                        }
                        if (c0448 != null) {
                            int i2 = c0448.f13683;
                            if ("pre".equals(str4)) {
                                c2067.f6815 = false;
                            }
                            if (i2 == c2658.length() && (strM8379 = C4992.m8378(c0448)) != null) {
                                try {
                                    c2658.append(strM8379);
                                } catch (IOException e4) {
                                    C5028.m8450(e4);
                                    return;
                                }
                            }
                            c0448.m969(sb.length());
                            if (i2 != c0448.f13682) {
                                c2067.f6812 = set2.contains((String) c0448.f13680);
                            }
                            if ("p".equals(str4)) {
                                AbstractC4593.m7981(c2658, '\n');
                            }
                            c2067.f6811 = c0448.f1633;
                        }
                    }
                } else if (iM6632 == 4) {
                    C4638 c4639 = (C4638) abstractC4294;
                    if (c2067.f6815) {
                        try {
                            c2658.append(c4639.f15307);
                        } catch (IOException e5) {
                            C5028.m8450(e5);
                            return;
                        }
                    } else {
                        if (c2067.f6812) {
                            int length10 = c2658.length();
                            if (length10 > 0 && '\n' != c2658.charAt(length10 - 1)) {
                                AbstractC4593.m7981(c2658, '\n');
                            }
                            c2067.f6812 = z2;
                        }
                        String str5 = c4639.f15307;
                        int length11 = sb.length();
                        int length12 = str5.length();
                        int i3 = z2 ? 1 : 0;
                        int i4 = i3;
                        while (i3 < length12) {
                            char cCharAt = str5.charAt(i3);
                            if (Character.isWhitespace(cCharAt)) {
                                i4 = 1;
                            } else {
                                if (i4 != 0 && (length = sb.length()) > 0 && !Character.isWhitespace(sb.charAt(length - 1))) {
                                    AbstractC4593.m7981(c2658, ' ');
                                }
                                AbstractC4593.m7981(c2658, cCharAt);
                                i4 = 0;
                            }
                            i3++;
                        }
                        if (i4 != 0 && length11 < sb.length()) {
                            AbstractC4593.m7981(c2658, ' ');
                        }
                    }
                }
                abstractC4294.mo975();
                z2 = false;
            } else {
                c4271.f14137.mo542(c4271, c4271.f14143);
            }
        }
    }
}
