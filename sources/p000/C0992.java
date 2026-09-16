package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: ۥَؘۣؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0992 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ۥٕ */
    public static final C5009 f3519 = new C5009("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f3520;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f3521;

    /* JADX INFO: renamed from: ۥً */
    public boolean f3522;

    /* JADX INFO: renamed from: ۥَ */
    public final C5051 f3523;

    /* JADX INFO: renamed from: ۥْ */
    public final C5051 f3524;

    /* JADX INFO: renamed from: ۥٓ */
    public final C5051 f3525;

    /* JADX INFO: renamed from: ۥٖ */
    public final LinkedHashMap f3526;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f3527;

    /* JADX INFO: renamed from: ۥۖ */
    public int f3528;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f3529;

    /* JADX INFO: renamed from: ۦٕ */
    public C5025 f3530;

    /* JADX INFO: renamed from: ۦٗ */
    public final C3950 f3531;

    /* JADX INFO: renamed from: ۦٚ */
    public final C1248 f3532;

    /* JADX INFO: renamed from: ۦۛ */
    public long f3533;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f3534;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5051 f3535;

    public C0992(long j, AbstractC1567 abstractC1567, C5051 c5051) {
        ExecutorC4540 executorC4540 = ExecutorC4540.f15006;
        this.f3535 = c5051;
        this.f3534 = j;
        if (j <= 0) {
            C1078.m2272("maxSize <= 0");
            throw null;
        }
        this.f3524 = c5051.m8573("journal");
        this.f3525 = c5051.m8573("journal.tmp");
        this.f3523 = c5051.m8573("journal.bkp");
        this.f3526 = new LinkedHashMap(0, 0.75f, true);
        this.f3531 = AbstractC4009.m7151(AbstractC4593.m7963(AbstractC4554.m7891(), executorC4540.mo4119(1)));
        this.f3532 = new C1248(abstractC1567);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static void m2111(String str) {
        if (f3519.f16581.matcher(str).matches()) {
            return;
        }
        C1078.m2273(AbstractC5078.m8669('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f3521 && !this.f3520) {
                for (C1959 c1959 : (C1959[]) this.f3526.values().toArray(new C1959[0])) {
                    C1405 c1405 = c1959.f6463;
                    if (c1405 != null) {
                        C1959 c19510 = (C1959) c1405.f4836;
                        if (AbstractC3831.m6874(c19510.f6463, c1405)) {
                            c19510.f6457 = true;
                        }
                    }
                }
                m2121();
                AbstractC4009.m7180(this.f3531, null);
                this.f3530.close();
                this.f3530 = null;
                this.f3520 = true;
                return;
            }
            this.f3520 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f3521) {
            if (this.f3520) {
                throw new IllegalStateException("cache is closed");
            }
            m2121();
            this.f3530.flush();
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final synchronized void m2112() {
        try {
            if (this.f3521) {
                return;
            }
            this.f3532.mo1567(this.f3525);
            if (this.f3532.m3319(this.f3523)) {
                boolean zM3319 = this.f3532.m3319(this.f3524);
                C1248 c1248 = this.f3532;
                C5051 c5051 = this.f3523;
                if (zM3319) {
                    c1248.mo1567(c5051);
                } else {
                    c1248.mo1564(c5051, this.f3524);
                }
            }
            if (this.f3532.m3319(this.f3524)) {
                try {
                    m2120();
                    m2115();
                    this.f3521 = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC0993.m2136(this.f3532, this.f3535);
                        this.f3520 = false;
                        m2119();
                        this.f3521 = true;
                    } catch (Throwable th) {
                        this.f3520 = false;
                        throw th;
                    }
                }
            }
            m2119();
            this.f3521 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m2113() {
        AbstractC2765.m5135(this.f3531, null, 0, new C0876(this, null, 1), 3);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m2114(String str) throws IOException {
        String strSubstring;
        List listM1530;
        int i = 0;
        int iM1521 = AbstractC0684.m1521(' ', 0, 6, str);
        if (iM1521 == -1) {
            C5028.m8448("unexpected journal line: ".concat(str));
            return;
        }
        int i2 = iM1521 + 1;
        int iM1522 = AbstractC0684.m1521(' ', i2, 4, str);
        LinkedHashMap linkedHashMap = this.f3526;
        if (iM1522 == -1) {
            strSubstring = str.substring(i2);
            if (iM1521 == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iM1522);
        }
        Object c1959 = linkedHashMap.get(strSubstring);
        if (c1959 == null) {
            c1959 = new C1959(this, strSubstring);
            linkedHashMap.put(strSubstring, c1959);
        }
        C1959 c19510 = (C1959) c1959;
        if (iM1522 == -1 || iM1521 != 5 || !str.startsWith("CLEAN")) {
            if (iM1522 == -1 && iM1521 == 5 && str.startsWith("DIRTY")) {
                c19510.f6463 = new C1405(this, c19510);
                return;
            } else {
                if (iM1522 == -1 && iM1521 == 4 && str.startsWith("READ")) {
                    return;
                }
                C5028.m8448("unexpected journal line: ".concat(str));
                return;
            }
        }
        String strSubstring2 = str.substring(iM1522 + 1);
        char[] cArr = {' '};
        int i3 = 2;
        if (cArr.length == 1) {
            listM1530 = AbstractC0684.m1530(strSubstring2, String.valueOf(cArr[0]));
        } else {
            C2222 c2222 = new C2222(i3, new C3306(strSubstring2, new C4164(24, cArr), i));
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c2222, 10));
            Iterator it = c2222.iterator();
            while (true) {
                C2960 c2960 = (C2960) it;
                if (!c2960.hasNext()) {
                    break;
                }
                C3046 c3046 = (C3046) c2960.next();
                arrayList.add(strSubstring2.subSequence(c3046.f6006, c3046.f6005 + 1).toString());
            }
            listM1530 = arrayList;
        }
        c19510.f6456 = true;
        c19510.f6463 = null;
        if (listM1530.size() != 2) {
            C2316.m4362(listM1530, "unexpected journal line: ");
            return;
        }
        try {
            int size = listM1530.size();
            while (i < size) {
                c19510.f6458[i] = Long.parseLong((String) listM1530.get(i));
                i++;
            }
        } catch (NumberFormatException unused) {
            C2316.m4362(listM1530, "unexpected journal line: ");
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m2115() {
        Iterator it = this.f3526.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C1959 c1959 = (C1959) it.next();
            int i = 0;
            if (c1959.f6463 == null) {
                while (i < 2) {
                    j += c1959.f6458[i];
                    i++;
                }
            } else {
                c1959.f6463 = null;
                while (i < 2) {
                    C5051 c5051 = (C5051) c1959.f6455.get(i);
                    C1248 c1248 = this.f3532;
                    c1248.mo1567(c5051);
                    c1248.mo1567((C5051) c1959.f6461.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f3533 = j;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized C1405 m2116(String str) {
        if (this.f3520) {
            throw new IllegalStateException("cache is closed");
        }
        m2111(str);
        m2112();
        C1959 c1959 = (C1959) this.f3526.get(str);
        if ((c1959 != null ? c1959.f6463 : null) != null) {
            return null;
        }
        if (c1959 != null && c1959.f6459 != 0) {
            return null;
        }
        if (!this.f3529 && !this.f3522) {
            C5025 c5025 = this.f3530;
            c5025.mo2660("DIRTY");
            c5025.writeByte(32);
            c5025.mo2660(str);
            c5025.writeByte(10);
            c5025.flush();
            if (this.f3527) {
                return null;
            }
            if (c1959 == null) {
                c1959 = new C1959(this, str);
                this.f3526.put(str, c1959);
            }
            C1405 c1405 = new C1405(this, c1959);
            c1959.f6463 = c1405;
            return c1405;
        }
        m2113();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0116 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x0081, B:34:0x0088, B:27:0x005c, B:29:0x006a, B:38:0x00a8, B:40:0x00af, B:43:0x00b4, B:45:0x00c2, B:48:0x00c7, B:53:0x0102, B:55:0x010d, B:59:0x0116, B:49:0x00df, B:51:0x00f4, B:52:0x00ff, B:37:0x0098, B:62:0x011b, B:63:0x0122), top: B:66:0x0001 }] */
    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void m2117(C1405 c1405, boolean z) {
        C1959 c1959 = (C1959) c1405.f4836;
        if (!AbstractC3831.m6874(c1959.f6463, c1405)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!z || c1959.f6457) {
            for (int i = 0; i < 2; i++) {
                this.f3532.mo1567((C5051) c1959.f6461.get(i));
            }
        } else {
            for (int i2 = 0; i2 < 2; i2++) {
                if (((boolean[]) c1405.f4835)[i2] && !this.f3532.m3319((C5051) c1959.f6461.get(i2))) {
                    c1405.m2973(false);
                    return;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                C5051 c5051 = (C5051) c1959.f6461.get(i3);
                C5051 c5052 = (C5051) c1959.f6455.get(i3);
                boolean zM3319 = this.f3532.m3319(c5051);
                C1248 c1248 = this.f3532;
                if (zM3319) {
                    c1248.mo1564(c5051, c5052);
                } else {
                    C5051 c5053 = (C5051) c1959.f6455.get(i3);
                    if (!c1248.m3319(c5053)) {
                        AbstractC0080.m7960(c1248.mo1568(c5053));
                    }
                }
                long j = c1959.f6458[i3];
                Long l = (Long) this.f3532.m3320(c5052).f4712;
                long jLongValue = l != null ? l.longValue() : 0L;
                c1959.f6458[i3] = jLongValue;
                this.f3533 = (this.f3533 - j) + jLongValue;
            }
        }
        c1959.f6463 = null;
        if (c1959.f6457) {
            m2118(c1959);
            return;
        }
        this.f3528++;
        C5025 c5025 = this.f3530;
        if (z || c1959.f6456) {
            c1959.f6456 = true;
            c5025.mo2660("CLEAN");
            c5025.writeByte(32);
            c5025.mo2660(c1959.f6460);
            for (long j2 : c1959.f6458) {
                c5025.writeByte(32);
                c5025.mo2699(j2);
            }
            c5025.writeByte(10);
        } else {
            this.f3526.remove(c1959.f6460);
            c5025.mo2660("REMOVE");
            c5025.writeByte(32);
            c5025.mo2660(c1959.f6460);
            c5025.writeByte(10);
        }
        c5025.flush();
        if (this.f3533 > this.f3534) {
            m2113();
        } else if (this.f3528 >= 2000) {
            m2113();
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m2118(C1959 c1959) {
        C5025 c5025;
        int i = c1959.f6459;
        String str = c1959.f6460;
        if (i > 0 && (c5025 = this.f3530) != null) {
            c5025.mo2660("DIRTY");
            c5025.writeByte(32);
            c5025.mo2660(str);
            c5025.writeByte(10);
            c5025.flush();
        }
        if (c1959.f6459 > 0 || c1959.f6463 != null) {
            c1959.f6457 = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f3532.mo1567((C5051) c1959.f6455.get(i2));
            long j = this.f3533;
            long[] jArr = c1959.f6458;
            this.f3533 = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f3528++;
        C5025 c5026 = this.f3530;
        if (c5026 != null) {
            c5026.mo2660("REMOVE");
            c5026.writeByte(32);
            c5026.mo2660(str);
            c5026.writeByte(10);
        }
        this.f3526.remove(str);
        if (this.f3528 >= 2000) {
            m2113();
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final synchronized void m2119() {
        Throwable th;
        try {
            C5025 c5025 = this.f3530;
            if (c5025 != null) {
                c5025.close();
            }
            C5025 c5026 = new C5025(this.f3532.mo1568(this.f3525));
            try {
                c5026.mo2660("libcore.io.DiskLruCache");
                c5026.writeByte(10);
                c5026.mo2660("1");
                c5026.writeByte(10);
                c5026.mo2699(1L);
                c5026.writeByte(10);
                c5026.mo2699(2L);
                c5026.writeByte(10);
                c5026.writeByte(10);
                for (C1959 c1959 : this.f3526.values()) {
                    if (c1959.f6463 != null) {
                        c5026.mo2660("DIRTY");
                        c5026.writeByte(32);
                        c5026.mo2660(c1959.f6460);
                        c5026.writeByte(10);
                    } else {
                        c5026.mo2660("CLEAN");
                        c5026.writeByte(32);
                        c5026.mo2660(c1959.f6460);
                        for (long j : c1959.f6458) {
                            c5026.writeByte(32);
                            c5026.mo2699(j);
                        }
                        c5026.writeByte(10);
                    }
                }
                try {
                    c5026.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c5026.close();
                } catch (Throwable th4) {
                    AbstractC5537.m9223(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zM3319 = this.f3532.m3319(this.f3524);
            C1248 c1248 = this.f3532;
            if (zM3319) {
                c1248.mo1564(this.f3524, this.f3523);
                this.f3532.mo1564(this.f3525, this.f3524);
                this.f3532.mo1567(this.f3523);
            } else {
                c1248.mo1564(this.f3525, this.f3524);
            }
            this.f3530 = new C5025(new C3848(this.f3532.f4304.mo1566(this.f3524), new C2932(14, this)));
            this.f3528 = 0;
            this.f3527 = false;
            this.f3522 = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m2120() throws Throwable {
        C1248 c1248 = this.f3532;
        AbstractC1567 abstractC1567 = c1248.f4304;
        C5051 c5051 = this.f3524;
        C4162 c4162 = new C4162(abstractC1567.mo1570(c5051));
        try {
            String strMo2663 = c4162.mo2663(Long.MAX_VALUE);
            String strMo2664 = c4162.mo2663(Long.MAX_VALUE);
            String strMo2665 = c4162.mo2663(Long.MAX_VALUE);
            String strMo2666 = c4162.mo2663(Long.MAX_VALUE);
            String strMo2667 = c4162.mo2663(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo2663) || !"1".equals(strMo2664) || !AbstractC3831.m6874(String.valueOf(1), strMo2665) || !AbstractC3831.m6874(String.valueOf(2), strMo2666) || strMo2667.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo2663 + ", " + strMo2664 + ", " + strMo2665 + ", " + strMo2666 + ", " + strMo2667 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m2114(c4162.mo2663(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f3528 = i - this.f3526.size();
                    if (c4162.m7362()) {
                        this.f3530 = new C5025(new C3848(c1248.f4304.mo1566(c5051), new C2932(14, this)));
                    } else {
                        m2119();
                    }
                    try {
                        c4162.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c4162.close();
            } catch (Throwable th3) {
                AbstractC5537.m9223(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m2121() {
        while (this.f3533 > this.f3534) {
            for (C1959 c1959 : this.f3526.values()) {
                if (!c1959.f6457) {
                    m2118(c1959);
                }
            }
            return;
        }
        this.f3529 = false;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final synchronized C1702 m2122(String str) {
        C1702 c1702M3842;
        if (this.f3520) {
            throw new IllegalStateException("cache is closed");
        }
        m2111(str);
        m2112();
        C1959 c1959 = (C1959) this.f3526.get(str);
        if (c1959 != null && (c1702M3842 = c1959.m3842()) != null) {
            boolean z = true;
            this.f3528++;
            C5025 c5025 = this.f3530;
            c5025.mo2660("READ");
            c5025.writeByte(32);
            c5025.mo2660(str);
            c5025.writeByte(10);
            if (this.f3528 < 2000) {
                z = false;
            }
            if (z) {
                m2113();
            }
            return c1702M3842;
        }
        return null;
    }
}
