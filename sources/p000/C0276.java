package p000;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: renamed from: ۥْؒؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0276 implements InterfaceC5288 {

    /* JADX INFO: renamed from: ۥُ */
    public static final C1035 f986 = new C1035(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: ۥّ */
    public static final C1035 f987 = new C1035(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: ۥؗ */
    public final C2432 f988;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1765 f989;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f990;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2432 f991;

    public C0276(String str, C1765 c1765, C2432 c2432, C2432 c2433) {
        this.f990 = str;
        this.f989 = c1765;
        this.f988 = c2432;
        this.f991 = c2433;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static String m574(String str, C0822 c0822) {
        String strM7959;
        String str2 = c0822 != null ? c0822.f2917 : null;
        if ((str2 == null || str2.startsWith("text/plain")) && (strM7959 = AbstractC0080.m7959(MimeTypeMap.getSingleton(), str)) != null) {
            return strM7959;
        }
        if (str2 == null) {
            return null;
        }
        int iM1521 = AbstractC0684.m1521(';', 0, 6, str2);
        return iM1521 == -1 ? str2 : str2.substring(0, iM1521);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC1567 m575() {
        return ((C3269) this.f991.getValue()).f10985;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final C2813 m576() {
        C1414 c1414 = new C1414(7);
        String strConcat = this.f990;
        if (strConcat.regionMatches(true, 0, "ws:", 0, 3)) {
            strConcat = "http:".concat(strConcat.substring(3));
        } else if (strConcat.regionMatches(true, 0, "wss:", 0, 4)) {
            strConcat = "https:".concat(strConcat.substring(4));
        }
        C3303 c3303 = new C3303();
        c3303.m6062(null, strConcat);
        c1414.f4871 = c3303.m6064();
        C1765 c1765 = this.f989;
        c1414.f4869 = c1765.f5885.m8046();
        for (Map.Entry entry : c1765.f5887.f13752.entrySet()) {
            c1414.m2988((Class) entry.getKey(), entry.getValue());
        }
        int i = c1765.f5889;
        boolean zM6619 = AbstractC3761.m6619(i);
        boolean zM66110 = AbstractC3761.m6619(c1765.f5890);
        if (!zM66110 && zM6619) {
            c1414.m3007(C1035.f3655);
        } else if (!zM66110 || zM6619) {
            if (!zM66110 && !zM6619) {
                c1414.m3007(f987);
            }
        } else if (AbstractC3761.m6620(i)) {
            c1414.m3007(C1035.f3654);
        } else {
            c1414.m3007(f986);
        }
        return c1414.m2998();
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C2248 m577(C0348 c0348) throws Throwable {
        Throwable th;
        C2248 c2248;
        try {
            AbstractC1567 abstractC1567M575 = m575();
            C1702 c1702 = (C1702) c0348.f1280;
            if (c1702.f5668) {
                throw new IllegalStateException("snapshot is closed");
            }
            C4162 c4162 = new C4162(abstractC1567M575.mo1570((C5051) c1702.f5669.f6455.get(0)));
            try {
                c2248 = new C2248(c4162);
                try {
                    c4162.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c4162.close();
                } catch (Throwable th4) {
                    AbstractC5537.m9223(th3, th4);
                }
                th = th3;
                c2248 = null;
            }
            if (th == null) {
                return c2248;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m578(C2813 c2813, AbstractC0772 abstractC0772) {
        C0807 c0807;
        C2147 c2147M460;
        if (abstractC0772 instanceof C0807) {
            c0807 = (C0807) abstractC0772;
            int i = c0807.f2877;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0807.f2877 = i - Integer.MIN_VALUE;
            } else {
                c0807 = new C0807(this, abstractC0772);
            }
        } else {
            c0807 = new C0807(this, abstractC0772);
        }
        Object objM4909 = c0807.f2876;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        int i2 = c0807.f2877;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC0186.m409(objM4909);
            Bitmap.Config config = AbstractC0080.f15150;
            if (!AbstractC3831.m6874(Looper.myLooper(), Looper.getMainLooper())) {
                C2561 c2561 = (C2561) this.f988.getValue();
                c2561.getClass();
                C0201 c0201 = new C0201(c2561, c2813);
                c0807.f2877 = 1;
                C2600 c2600 = new C2600(1, AbstractC2776.m5232(c0807));
                c2600.m4913();
                C0519 c0519 = new C0519(i3, c0201, c2600);
                c0201.m463(c0519);
                c2600.m4908(c0519);
                objM4909 = c2600.m4909();
                if (objM4909 == enumC2282) {
                    return enumC2282;
                }
            } else {
                if (AbstractC3761.m6619(this.f989.f5890)) {
                    throw new NetworkOnMainThreadException();
                }
                C2561 c2562 = (C2561) this.f988.getValue();
                c2562.getClass();
                C0201 c0202 = new C0201(c2562, c2813);
                if (!c0202.f735.compareAndSet(false, true)) {
                    C1078.m2276("Already Executed");
                    return null;
                }
                c0202.f737.m9679();
                C3216 c3216 = C3216.f10772;
                c0202.f738 = C3216.f10772.mo5908();
                try {
                    C1489 c1489 = c2562.f8550;
                    synchronized (c1489) {
                        ((ArrayDeque) c1489.f5056).add(c0202);
                    }
                    c2147M460 = c0202.m460();
                    C1489 c14810 = c2562.f8550;
                    c14810.m3120((ArrayDeque) c14810.f5056, c0202);
                } catch (Throwable th) {
                    C1489 c14811 = c0202.f746.f8550;
                    c14811.m3120((ArrayDeque) c14811.f5056, c0202);
                    throw th;
                }
            }
            if (!c2147M460.m4177() || c2147M460.f7033 == 304) {
                return c2147M460;
            }
            AbstractC2978 abstractC2978 = c2147M460.f7039;
            if (abstractC2978 != null) {
                AbstractC0080.m7960(abstractC2978);
            }
            throw new C1228(4, "HTTP " + c2147M460.f7033 + ": " + c2147M460.f7032);
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(objM4909);
        c2147M460 = (C2147) objM4909;
        if (c2147M460.m4177()) {
        }
        return c2147M460;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0184  */
    /* JADX INFO: renamed from: ۥۜ */
    public final C0348 m579(C0348 c0348, C2813 c2813, C2147 c2147, C2248 c2248) throws NoSuchAlgorithmException {
        C1039 c1039;
        C1405 c1405M2116;
        Throwable th = null;
        if (AbstractC3761.m6620(this.f989.f5889) && !c2813.m5374().f3659) {
            C1035 c1035M4195 = c2147.f7037;
            if (c1035M4195 == null) {
                c1035M4195 = AbstractC2164.m4195(c2147.f7034);
                c2147.f7037 = c1035M4195;
            }
            if (!c1035M4195.f3659 && !AbstractC3831.m6874(c2147.f7034.m8048("Vary"), "*")) {
                int i = 4;
                if (c0348 != null) {
                    C1702 c1702 = (C1702) c0348.f1280;
                    C0992 c0992 = c1702.f5667;
                    synchronized (c0992) {
                        c1702.close();
                        c1405M2116 = c0992.m2116(c1702.f5669.f6460);
                    }
                    if (c1405M2116 != null) {
                        c1039 = new C1039(i, c1405M2116);
                    } else {
                        c1039 = null;
                    }
                } else {
                    C3269 c3269 = (C3269) this.f991.getValue();
                    if (c3269 == null) {
                        c1039 = null;
                    } else {
                        String str = this.f989.f5886;
                        if (str == null) {
                            str = this.f990;
                        }
                        C0992 c0993 = c3269.f10984;
                        byte[] bytes = str.getBytes(AbstractC4637.f15306);
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(bytes, 0, bytes.length);
                        byte[] bArrDigest = messageDigest.digest();
                        char[] cArr = new char[bArrDigest.length * 2];
                        int i2 = 0;
                        for (byte b : bArrDigest) {
                            int i3 = i2 + 1;
                            char[] cArr2 = AbstractC2133.f6997;
                            cArr[i2] = cArr2[(b >> 4) & 15];
                            i2 += 2;
                            cArr[i3] = cArr2[b & 15];
                        }
                        C1405 c1405M2117 = c0993.m2116(new String(cArr));
                        if (c1405M2117 != null) {
                            c1039 = new C1039(i, c1405M2117);
                        } else {
                            c1039 = null;
                        }
                    }
                }
                try {
                    if (c1039 != null) {
                        try {
                            if (c2147.f7033 != 304 || c2248 == null) {
                                C5025 c5025 = new C5025(m575().mo1568(((C1405) c1039.f3672).m2972(0)));
                                try {
                                    new C2248(c2147).m4296(c5025);
                                    try {
                                        c5025.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        c5025.close();
                                    } catch (Throwable th4) {
                                        AbstractC5537.m9223(th, th4);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                                C5025 c5026 = new C5025(m575().mo1568(((C1405) c1039.f3672).m2972(1)));
                                try {
                                    c2147.f7039.mo3797().mo2674(c5026);
                                    try {
                                        c5026.close();
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    try {
                                        c5026.close();
                                    } catch (Throwable th7) {
                                        AbstractC5537.m9223(th, th7);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                            } else {
                                C1033 c1033M4176 = c2147.m4176();
                                c1033M4176.f3642 = AbstractC5568.m9391(c2248.f7461, c2147.f7034).m8046();
                                C2147 c2147M2239 = c1033M4176.m2239();
                                C5025 c5027 = new C5025(m575().mo1568(((C1405) c1039.f3672).m2972(0)));
                                try {
                                    new C2248(c2147M2239).m4296(c5027);
                                    try {
                                        c5027.close();
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    try {
                                        c5027.close();
                                    } catch (Throwable th10) {
                                        AbstractC5537.m9223(th, th10);
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                            }
                            C0348 c0348M2244 = c1039.m2244();
                            AbstractC0080.m7960(c2147);
                            return c0348M2244;
                        } catch (Exception e) {
                            Bitmap.Config config = AbstractC0080.f15150;
                            try {
                                ((C1405) c1039.f3672).m2973(false);
                            } catch (Exception unused) {
                            }
                            throw e;
                        }
                    }
                } catch (Throwable th11) {
                    AbstractC0080.m7960(c2147);
                    throw th11;
                }
            } else if (c0348 != null) {
                AbstractC0080.m7960(c0348);
            }
        } else if (c0348 != null) {
            AbstractC0080.m7960(c0348);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[Catch: Exception -> 0x005b, TRY_ENTER, TryCatch #2 {Exception -> 0x005b, blocks: (B:20:0x0051, B:60:0x015c, B:104:0x0224, B:105:0x0229, B:40:0x00cf, B:42:0x00db, B:49:0x0106, B:52:0x011f, B:57:0x014a, B:45:0x00f0, B:47:0x00f8, B:54:0x0135, B:55:0x013c, B:56:0x013d), top: B:112:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00db A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:20:0x0051, B:60:0x015c, B:104:0x0224, B:105:0x0229, B:40:0x00cf, B:42:0x00db, B:49:0x0106, B:52:0x011f, B:57:0x014a, B:45:0x00f0, B:47:0x00f8, B:54:0x0135, B:55:0x013c, B:56:0x013d), top: B:112:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:20:0x0051, B:60:0x015c, B:104:0x0224, B:105:0x0229, B:40:0x00cf, B:42:0x00db, B:49:0x0106, B:52:0x011f, B:57:0x014a, B:45:0x00f0, B:47:0x00f8, B:54:0x0135, B:55:0x013c, B:56:0x013d), top: B:112:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x013d A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:20:0x0051, B:60:0x015c, B:104:0x0224, B:105:0x0229, B:40:0x00cf, B:42:0x00db, B:49:0x0106, B:52:0x011f, B:57:0x014a, B:45:0x00f0, B:47:0x00f8, B:54:0x0135, B:55:0x013c, B:56:0x013d), top: B:112:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e3 A[Catch: Exception -> 0x020e, TryCatch #1 {Exception -> 0x020e, blocks: (B:86:0x01dd, B:88:0x01e3, B:92:0x020a, B:96:0x0211, B:97:0x0216), top: B:111:0x01dd }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    /* JADX WARN: Code duplicated, block: B:91:0x0209  */
    /* JADX WARN: Code duplicated, block: B:96:0x0211 A[Catch: Exception -> 0x020e, TryCatch #1 {Exception -> 0x020e, blocks: (B:86:0x01dd, B:88:0x01e3, B:92:0x020a, B:96:0x0211, B:97:0x0216), top: B:111:0x01dd }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // p000.InterfaceC5288
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo580(InterfaceC0443 interfaceC0443) throws Exception {
        C1845 c1845;
        long j;
        C0348 c0348;
        C4219 c4219M5911;
        Object objM578;
        AbstractC1567 abstractC1567M575;
        C1702 c1702;
        Long l;
        C2248 c2248;
        C3269 c3269;
        C0348 c0349;
        C2147 c2147;
        C2147 c2148;
        AbstractC2978 abstractC2978;
        C0276 c0276 = this;
        if (interfaceC0443 instanceof C1845) {
            c1845 = (C1845) interfaceC0443;
            int i = c1845.f6127;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1845.f6127 = i - Integer.MIN_VALUE;
            } else {
                c1845 = new C1845(c0276, (AbstractC0772) interfaceC0443);
            }
        } else {
            c1845 = new C1845(c0276, (AbstractC0772) interfaceC0443);
        }
        Object obj = c1845.f6128;
        ?? r3 = c1845.f6127;
        int i2 = 4;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        try {
            if (r3 == 0) {
                AbstractC0186.m409(obj);
                C1765 c1765 = c0276.f989;
                boolean zM6619 = AbstractC3761.m6619(c1765.f5889);
                String str = c0276.f990;
                if (zM6619 && (c3269 = (C3269) c0276.f991.getValue()) != null) {
                    String str2 = c1765.f5886;
                    if (str2 == null) {
                        str2 = str;
                    }
                    C0992 c0992 = c3269.f10984;
                    byte[] bytes = str2.getBytes(AbstractC4637.f15306);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    j = 0;
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] bArrDigest = messageDigest.digest();
                    char[] cArr = new char[bArrDigest.length * 2];
                    int i3 = 0;
                    for (byte b : bArrDigest) {
                        int i4 = i3 + 1;
                        char[] cArr2 = AbstractC2133.f6997;
                        cArr[i3] = cArr2[(b >> 4) & 15];
                        i3 += 2;
                        cArr[i4] = cArr2[b & 15];
                    }
                    C1702 c1702M2122 = c0992.m2122(new String(cArr));
                    c0348 = c1702M2122 != null ? new C0348(c1702M2122) : null;
                    if (c0348 != null) {
                        abstractC1567M575 = c0276.m575();
                        c1702 = (C1702) c0348.f1280;
                        if (!c1702.f5668) {
                            throw new IllegalStateException("snapshot is closed");
                        }
                        l = (Long) abstractC1567M575.m3320((C5051) c1702.f5669.f6455.get(0)).f4712;
                        if (l != null && l.longValue() == j) {
                            return new C2089(c0276.m581(c0348), m574(str, null), 3);
                        }
                        c4219M5911 = new C3220(c0276.m576(), c0276.m577(c0348)).m5911();
                        c2248 = c4219M5911.f13998;
                        if (c4219M5911.f13999 == null && c2248 != null) {
                            return new C2089(c0276.m581(c0348), m574(str, (C0822) c2248.f7462.getValue()), 3);
                        }
                    } else {
                        c4219M5911 = new C3220(c0276.m576(), null).m5911();
                    }
                    C2813 c2813 = c4219M5911.f13999;
                    c1845.f6125 = c0276;
                    c1845.f6124 = c0348;
                    c1845.f6126 = c4219M5911;
                    c1845.f6127 = 1;
                    objM578 = c0276.m578(c2813, c1845);
                    if (objM578 == enumC2282) {
                    }
                    return enumC2282;
                }
                j = 0;
                if (c0348 != null) {
                    abstractC1567M575 = c0276.m575();
                    c1702 = (C1702) c0348.f1280;
                    if (!c1702.f5668) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    l = (Long) abstractC1567M575.m3320((C5051) c1702.f5669.f6455.get(0)).f4712;
                    if (l != null) {
                        return new C2089(c0276.m581(c0348), m574(str, null), 3);
                    }
                    c4219M5911 = new C3220(c0276.m576(), c0276.m577(c0348)).m5911();
                    c2248 = c4219M5911.f13998;
                    if (c4219M5911.f13999 == null) {
                        return new C2089(c0276.m581(c0348), m574(str, (C0822) c2248.f7462.getValue()), 3);
                    }
                } else {
                    c4219M5911 = new C3220(c0276.m576(), null).m5911();
                }
                C2813 c2814 = c4219M5911.f13999;
                c1845.f6125 = c0276;
                c1845.f6124 = c0348;
                c1845.f6126 = c4219M5911;
                c1845.f6127 = 1;
                objM578 = c0276.m578(c2814, c1845);
                if (objM578 == enumC2282) {
                }
                return enumC2282;
            }
            if (r3 != 1) {
                if (r3 != 2) {
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2147 = (C2147) c1845.f6126;
                c0349 = c1845.f6124;
                c0276 = c1845.f6125;
                try {
                    AbstractC0186.m409(obj);
                    c2148 = (C2147) obj;
                    try {
                        Bitmap.Config config = AbstractC0080.f15150;
                        abstractC2978 = c2148.f7039;
                        if (abstractC2978 != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        c0276.getClass();
                        C2400 c2400 = new C2400(abstractC2978.mo3797(), new C1148(c0276.f989.f5881, 0), null);
                        String strM574 = m574(c0276.f990, abstractC2978.mo3795());
                        if (c2148.f7040 != null) {
                            i2 = 3;
                        }
                        return new C2089(c2400, strM574, i2);
                    } catch (Exception e) {
                        e = e;
                        c2147 = c2148;
                        try {
                            AbstractC0080.m7960(c2147);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            r3 = c0349;
                            if (r3 != 0) {
                                AbstractC0080.m7960(r3);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    AbstractC0080.m7960(c2147);
                    throw e;
                }
            }
            C4219 c4219 = (C4219) c1845.f6126;
            c0348 = c1845.f6124;
            C0276 c0277 = c1845.f6125;
            AbstractC0186.m409(obj);
            objM578 = obj;
            j = 0;
            c4219M5911 = c4219;
            c0276 = c0277;
            C2147 c2149 = (C2147) objM578;
            Bitmap.Config config2 = AbstractC0080.f15150;
            AbstractC2978 abstractC2979 = c2149.f7039;
            if (abstractC2979 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                C0348 c0348M579 = c0276.m579(c0348, c4219M5911.f13999, c2149, c4219M5911.f13998);
                String str3 = c0276.f990;
                try {
                    if (c0348M579 != null) {
                        C4798 c4798M581 = c0276.m581(c0348M579);
                        C2248 c2248M577 = c0276.m577(c0348M579);
                        return new C2089(c4798M581, m574(str3, c2248M577 != null ? (C0822) c2248M577.f7462.getValue() : null), 4);
                    }
                    if (abstractC2979.mo3796() > j) {
                        C2400 c2401 = new C2400(abstractC2979.mo3797(), new C1148(c0276.f989.f5881, 0), null);
                        String strM575 = m574(str3, abstractC2979.mo3795());
                        if (c2149.f7040 == null) {
                            i2 = 3;
                        }
                        return new C2089(c2401, strM575, i2);
                    }
                    AbstractC0080.m7960(c2149);
                    C2813 c2813M576 = c0276.m576();
                    c1845.f6125 = c0276;
                    c1845.f6124 = c0348M579;
                    c1845.f6126 = c2149;
                    c1845.f6127 = 2;
                    Object objM579 = c0276.m578(c2813M576, c1845);
                    if (objM579 != enumC2282) {
                        c2147 = c2149;
                        c0349 = c0348M579;
                        obj = objM579;
                        c2148 = (C2147) obj;
                        Bitmap.Config config3 = AbstractC0080.f15150;
                        abstractC2978 = c2148.f7039;
                        if (abstractC2978 != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        c0276.getClass();
                        C2400 c2402 = new C2400(abstractC2978.mo3797(), new C1148(c0276.f989.f5881, 0), null);
                        String strM576 = m574(c0276.f990, abstractC2978.mo3795());
                        if (c2148.f7040 != null) {
                            i2 = 3;
                        }
                        return new C2089(c2402, strM576, i2);
                    }
                    return enumC2282;
                } catch (Exception e4) {
                    e = e4;
                    c2147 = c2149;
                    c0349 = c0348M579;
                    AbstractC0080.m7960(c2147);
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
                c0349 = c0348;
                c2147 = c2149;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C4798 m581(C0348 c0348) {
        C1702 c1702 = (C1702) c0348.f1280;
        if (c1702.f5668) {
            C1078.m2276("snapshot is closed");
            return null;
        }
        C5051 c5051 = (C5051) c1702.f5669.f6455.get(1);
        AbstractC1567 abstractC1567M575 = m575();
        String str = this.f989.f5886;
        if (str == null) {
            str = this.f990;
        }
        return new C4798(c5051, abstractC1567M575, str, c0348);
    }
}
