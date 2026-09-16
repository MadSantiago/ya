package p000;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦِّؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4031 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3433 f13447;

    /* JADX INFO: renamed from: ۥُ */
    public static final TimeZone f13448;

    /* JADX INFO: renamed from: ۥّ */
    public static final C5009 f13449;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C4714 f13450 = AbstractC4225.m7469(new String[0]);

    /* JADX INFO: renamed from: ۥۣ */
    public static final byte[] f13451;

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2800 f13452;

    /* JADX INFO: renamed from: ۦۙ */
    public static final String f13453;

    static {
        byte[] bArr = new byte[0];
        f13451 = bArr;
        C1270 c1270 = new C1270();
        c1270.m2661(0, bArr);
        f13447 = new C3433(null, 0L, c1270, 1);
        m7219(0L, 0L, 0L);
        C1007[] c1007Arr = {AbstractC2776.m5242("efbbbf"), AbstractC2776.m5242("feff"), AbstractC2776.m5242("fffe"), AbstractC2776.m5242("0000ffff"), AbstractC2776.m5242("ffff0000")};
        ArrayList arrayList = new ArrayList(new C4604(c1007Arr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(AbstractC2164.m4186(arrayList, c1007Arr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((C1007) arrayList.get(0)).mo2205() <= 0) {
            C1078.m2272("the empty byte string is not a supported option");
            return;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            C1007 c1007 = (C1007) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                C1007 c1008 = (C1007) arrayList.get(i6);
                c1008.getClass();
                if (!c1008.mo2211(0, c1007, c1007.mo2205())) {
                    break;
                }
                if (c1008.mo2205() == c1007.mo2205()) {
                    throw new IllegalArgumentException(("duplicate option: " + c1008).toString());
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    arrayList2.remove(i6);
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        C1270 c1271 = new C1270();
        AbstractC0186.m440(0L, c1271, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (c1271.f4340 / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = c1271.readInt();
        }
        f13452 = new C2800((C1007[]) Arrays.copyOf(c1007Arr, 5), iArr);
        f13448 = TimeZone.getTimeZone("GMT");
        f13449 = new C5009("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String strM1518 = AbstractC0684.m1518(C2561.class.getName(), "okhttp3.");
        if (AbstractC0684.m1517(strM1518, "Client")) {
            strM1518 = strM1518.substring(0, strM1518.length() - "Client".length());
        }
        f13453 = strM1518;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m7212(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final List m7213(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final int m7214(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final int m7215(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (AbstractC0684.m1528(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final C4714 m7216(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4123 c4123 = (C4123) it.next();
            C1007 c1007 = c4123.f13738;
            C1007 c1008 = c4123.f13737;
            String strM2214 = c1007.m2214();
            String strM2215 = c1008.m2214();
            arrayList.add(strM2214);
            arrayList.add(AbstractC0684.m9760(strM2215).toString());
        }
        return new C4714((String[]) arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final String m7217(C0774 c0774, boolean z) {
        int i;
        int i2 = c0774.f2796;
        String strM8669 = c0774.f2801;
        if (AbstractC0684.m1527(strM8669, ":", false)) {
            strM8669 = AbstractC5078.m8669(']', "[", strM8669);
        }
        if (!z) {
            String str = c0774.f2800;
            if (str.equals("http")) {
                i = 80;
            } else {
                i = str.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return strM8669;
            }
        }
        return strM8669 + ':' + i2;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final int m7218(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7219(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final boolean m7220(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            C0178.m384(e.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean m7221(C0774 c0774, C0774 c0775) {
        return AbstractC3831.m6874(c0774.f2801, c0775.f2801) && c0774.f2796 == c0775.f2796 && AbstractC3831.m6874(c0774.f2800, c0775.f2800);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m7222(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC3831.m6874(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final boolean m7223(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final int m7224(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final List m7225(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(AbstractC2164.m4188(Arrays.copyOf(objArr2, objArr2.length)));
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final long m7226(C2147 c2147) {
        String strM8048 = c2147.f7034.m8048("Content-Length");
        if (strM8048 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strM8048);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final String[] m7227(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final String m7228(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final Charset m7229(InterfaceC4473 interfaceC4473, Charset charset) {
        int iMo2698 = interfaceC4473.mo2698(f13452);
        if (iMo2698 == -1) {
            return charset;
        }
        if (iMo2698 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (iMo2698 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (iMo2698 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (iMo2698 == 3) {
            Charset charset2 = AbstractC4637.f15306;
            Charset charset3 = AbstractC4637.f15304;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            AbstractC4637.f15304 = charsetForName;
            return charsetForName;
        }
        if (iMo2698 != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC4637.f15306;
        Charset charset5 = AbstractC4637.f15305;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        AbstractC4637.f15305 = charsetForName2;
        return charsetForName2;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final boolean m7230(InterfaceC4598 interfaceC4598, int i) {
        long jNanoTime = System.nanoTime();
        long jMo3917 = interfaceC4598.mo961().mo3918() ? interfaceC4598.mo961().mo3917() - jNanoTime : Long.MAX_VALUE;
        interfaceC4598.mo961().mo3922(Math.min(jMo3917, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            C1270 c1270 = new C1270();
            while (interfaceC4598.mo406(c1270, 8192L) != -1) {
                c1270.m2678();
            }
            if (jMo3917 == Long.MAX_VALUE) {
                interfaceC4598.mo961().mo3921();
                return true;
            }
            interfaceC4598.mo961().mo3922(jNanoTime + jMo3917);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo3917 == Long.MAX_VALUE) {
                interfaceC4598.mo961().mo3921();
                return false;
            }
            interfaceC4598.mo961().mo3922(jNanoTime + jMo3917);
            return false;
        } catch (Throwable th) {
            if (jMo3917 == Long.MAX_VALUE) {
                interfaceC4598.mo961().mo3921();
            } else {
                interfaceC4598.mo961().mo3922(jNanoTime + jMo3917);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m7231(InterfaceC4473 interfaceC4473) {
        return (interfaceC4473.readByte() & 255) | ((interfaceC4473.readByte() & 255) << 16) | ((interfaceC4473.readByte() & 255) << 8);
    }
}
