package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦؓؓۡٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3170 implements Closeable {

    /* JADX INFO: renamed from: ۥٓ */
    public static final Logger f10660 = Logger.getLogger(AbstractC2678.class.getName());

    /* JADX INFO: renamed from: ۥْ */
    public final C2025 f10661;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1925 f10662;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4473 f10663;

    public C3170(InterfaceC4473 interfaceC4473) {
        this.f10663 = interfaceC4473;
        C1925 c1925 = new C1925(interfaceC4473);
        this.f10662 = c1925;
        this.f10661 = new C2025(c1925);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f10663.close();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m5847(C0715 c0715, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5028.m8448("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i5 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.f10663.readByte();
            byte[] bArr = AbstractC4031.f13451;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            InterfaceC4473 interfaceC4473 = this.f10663;
            interfaceC4473.readInt();
            interfaceC4473.readByte();
            byte[] bArr2 = AbstractC4031.f13451;
            i -= 5;
        }
        List listM5851 = m5851(AbstractC5378.m9063(i, i2, i4), i4, i2, i3);
        C0127 c0127 = c0715.f2619;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            c0127.f517.m4367(new C1265(c0127.f512 + '[' + i3 + "] onHeaders", c0127, i3, listM5851, z2), 0L);
            return;
        }
        synchronized (c0127) {
            C0498 c0498M276 = c0127.m276(i3);
            if (c0498M276 != null) {
                c0498M276.m1115(AbstractC4031.m7216(listM5851), z2);
                return;
            }
            if (c0127.f515) {
                return;
            }
            if (i3 <= c0127.f513) {
                return;
            }
            if (i3 % 2 == c0127.f511 % 2) {
                return;
            }
            C0498 c0498 = new C0498(i3, c0127, false, z2, AbstractC4031.m7216(listM5851));
            c0127.f513 = i3;
            c0127.f530.put(Integer.valueOf(i3), c0498);
            c0127.f527.m4989().m4367(new C5402(c0127.f512 + '[' + i3 + "] onStream", c0127, c0498, i5), 0L);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m5848(C0715 c0715, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            C5028.m8448("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f10663.readByte();
            byte[] bArr = AbstractC4031.f13451;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.f10663.readInt() & Integer.MAX_VALUE;
        List listM5851 = m5851(AbstractC5378.m9063(i - 4, i2, i4), i4, i2, i3);
        C0127 c0127 = c0715.f2619;
        synchronized (c0127) {
            if (c0127.f508.contains(Integer.valueOf(i5))) {
                c0127.m278(i5, 2);
                return;
            }
            c0127.f508.add(Integer.valueOf(i5));
            c0127.f517.m4367(new C1265(c0127.f512 + '[' + i5 + "] onRequest", c0127, i5, listM5851), 0L);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5849(C0715 c0715, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            C5028.m8448("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            C5028.m8448("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.f10663.readByte();
            byte[] bArr = AbstractC4031.f13451;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iM9063 = AbstractC5378.m9063(i, i2, i4);
        InterfaceC4473 interfaceC4473 = this.f10663;
        C0127 c0127 = c0715.f2619;
        if (i3 != 0 && (i3 & 1) == 0) {
            C1270 c1270 = new C1270();
            long j = iM9063;
            interfaceC4473.mo2691(j);
            interfaceC4473.mo406(c1270, j);
            c0127.f517.m4367(new C3520(c0127.f512 + '[' + i3 + "] onData", c0127, i3, c1270, iM9063, z3), 0L);
        } else {
            C0498 c0498M276 = c0127.m276(i3);
            if (c0498M276 == null) {
                c0715.f2619.m278(i3, 2);
                long j2 = iM9063;
                c0715.f2619.m273(j2);
                interfaceC4473.skip(j2);
            } else {
                byte[] bArr2 = AbstractC4031.f13451;
                C1886 c1886 = c0498M276.f1804;
                long j3 = iM9063;
                c1886.getClass();
                long j4 = j3;
                while (true) {
                    C0498 c0498 = c1886.f6264;
                    if (j4 <= 0) {
                        byte[] bArr3 = AbstractC4031.f13451;
                        c0498.f1797.m273(j3);
                        break;
                    }
                    synchronized (c0498) {
                        z = c1886.f6265;
                        z2 = c1886.f6263.f4340 + j4 > c1886.f6266;
                    }
                    if (z2) {
                        interfaceC4473.skip(j4);
                        c1886.f6264.m1109(4);
                        break;
                    }
                    if (z) {
                        interfaceC4473.skip(j4);
                        break;
                    }
                    long jMo406 = interfaceC4473.mo406(c1886.f6262, j4);
                    if (jMo406 == -1) {
                        throw new EOFException();
                    }
                    j4 -= jMo406;
                    C0498 c0499 = c1886.f6264;
                    synchronized (c0499) {
                        try {
                            if (c1886.f6261) {
                                c1886.f6262.m2678();
                            } else {
                                C1270 c1271 = c1886.f6263;
                                boolean z4 = c1271.f4340 == 0;
                                c1271.m2701(c1886.f6262);
                                if (z4) {
                                    c0499.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    c0498M276.m1115(AbstractC4031.f13450, true);
                }
            }
        }
        this.f10663.skip(i4);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m5850(boolean z, C0715 c0715) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.f10663.mo2691(9L);
            int iM7231 = AbstractC4031.m7231(this.f10663);
            if (iM7231 > 16384) {
                C5028.m8448(AbstractC5078.m8670(iM7231, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i3 = this.f10663.readByte() & 255;
            byte b = this.f10663.readByte();
            int i4 = b & 255;
            int i5 = this.f10663.readInt();
            int i6 = Integer.MAX_VALUE & i5;
            Logger logger = f10660;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC2678.m4984(true, i6, iM7231, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = AbstractC2678.f8882;
                sb.append(i3 < strArr.length ? strArr[i3] : AbstractC4031.m7228("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            int i7 = 2;
            switch (i3) {
                case 0:
                    m5849(c0715, iM7231, i4, i6);
                    return true;
                case 1:
                    m5847(c0715, iM7231, i4, i6);
                    return true;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    if (iM7231 != 5) {
                        C5028.m8448(AbstractC5078.m8681(iM7231, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i6 == 0) {
                        C5028.m8448("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    InterfaceC4473 interfaceC4473 = this.f10663;
                    interfaceC4473.readInt();
                    interfaceC4473.readByte();
                    return true;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    if (iM7231 != 4) {
                        C5028.m8448(AbstractC5078.m8681(iM7231, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i6 == 0) {
                        C5028.m8448("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i8 = this.f10663.readInt();
                    int[] iArrM6631 = AbstractC3761.m6631(14);
                    int length = iArrM6631.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            i = iArrM6631[i9];
                            if (AbstractC3761.m6632(i) != i8) {
                                i9++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        C5028.m8448(AbstractC5078.m8670(i8, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    C0127 c0127 = c0715.f2619;
                    if (i6 != 0 && (i5 & 1) == 0) {
                        c0127.f517.m4367(new C1265(c0127.f512 + '[' + i6 + "] onReset", c0127, i6, i), 0L);
                        return true;
                    }
                    C0498 c0498M279 = c0127.m279(i6);
                    if (c0498M279 != null) {
                        synchronized (c0498M279) {
                            if (c0498M279.f1802 == 0) {
                                c0498M279.f1802 = i;
                                c0498M279.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    InterfaceC4473 interfaceC4474 = this.f10663;
                    if (i6 != 0) {
                        C5028.m8448("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iM7231 != 0) {
                            C5028.m8448("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iM7231 % 6 != 0) {
                        C5028.m8448(AbstractC5078.m8670(iM7231, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    C1928 c1928 = new C1928();
                    C1803 c1803M7940 = AbstractC4554.m7940(AbstractC4554.m7917(0, iM7231), 6);
                    int i10 = c1803M7940.f6006;
                    int i11 = c1803M7940.f6005;
                    int i12 = c1803M7940.f6004;
                    if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                        while (true) {
                            short s = interfaceC4474.readShort();
                            byte[] bArr = AbstractC4031.f13451;
                            int i13 = s & 65535;
                            int i14 = interfaceC4474.readInt();
                            if (i13 == 2) {
                                z2 = z3;
                                if (i14 != 0 && i14 != 1) {
                                    C5028.m8448("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    return z2;
                                }
                            } else if (i13 == 3) {
                                z2 = z3;
                                i13 = 4;
                            } else if (i13 == 4) {
                                z2 = z3;
                                if (i14 < 0) {
                                    C5028.m8448("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return z2;
                                }
                                i13 = 7;
                            } else if (i13 != 5) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                if (i14 < 16384 || i14 > 16777215) {
                                    C5028.m8448(AbstractC5078.m8670(i14, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    return z2;
                                }
                            }
                            c1928.m3788(i13, i14);
                            if (i10 != i11) {
                                i10 += i12;
                                z3 = z2;
                            }
                        }
                    }
                    C0127 c0128 = c0715.f2619;
                    c0128.f529.m4367(new C5402(AbstractC3761.m6621(new StringBuilder(), c0128.f512, " applyAndAckSettings"), c0715, c1928, i7), 0L);
                    return true;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    m5848(c0715, iM7231, i4, i6);
                    return true;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (iM7231 != 8) {
                        C5028.m8448(AbstractC5078.m8670(iM7231, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        C5028.m8448("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i15 = this.f10663.readInt();
                    int i16 = this.f10663.readInt();
                    byte b2 = (b & 1) != 0 ? (byte) 1 : (byte) 0;
                    C0127 c0129 = c0715.f2619;
                    if (b2 == 0) {
                        c0129.f529.m4367(new C5637(AbstractC3761.m6621(new StringBuilder(), c0715.f2619.f512, " ping"), c0715.f2619, i15, i16, 0), 0L);
                        return true;
                    }
                    synchronized (c0129) {
                        try {
                            if (i15 == 1) {
                                c0129.f509++;
                            } else if (i15 == 2) {
                                c0129.f520++;
                            } else if (i15 == 3) {
                                c0129.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (iM7231 < 8) {
                        C5028.m8448(AbstractC5078.m8670(iM7231, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        C5028.m8448("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i17 = this.f10663.readInt();
                    int i18 = this.f10663.readInt();
                    int i19 = iM7231 - 8;
                    int[] iArrM6632 = AbstractC3761.m6631(14);
                    int length2 = iArrM6632.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length2) {
                            i2 = iArrM6632[i20];
                            if (AbstractC3761.m6632(i2) != i18) {
                                i20++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        C5028.m8448(AbstractC5078.m8670(i18, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    C1007 c1007Mo2690 = C1007.f3595;
                    if (i19 > 0) {
                        c1007Mo2690 = this.f10663.mo2690(i19);
                    }
                    c1007Mo2690.mo2205();
                    C0127 c01210 = c0715.f2619;
                    synchronized (c01210) {
                        array = c01210.f530.values().toArray(new C0498[0]);
                        c01210.f515 = true;
                    }
                    for (C0498 c0498 : (C0498[]) array) {
                        if (c0498.f1799 > i17 && c0498.m1116()) {
                            synchronized (c0498) {
                                if (c0498.f1802 == 0) {
                                    c0498.f1802 = 8;
                                    c0498.notifyAll();
                                }
                                break;
                            }
                            c0715.f2619.m279(c0498.f1799);
                        }
                    }
                    return true;
                case 8:
                    if (iM7231 != 4) {
                        C5028.m8448(AbstractC5078.m8670(iM7231, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long j = 2147483647L & ((long) this.f10663.readInt());
                    if (j == 0) {
                        C5028.m8448("windowSizeIncrement was 0");
                        return false;
                    }
                    C0127 c01211 = c0715.f2619;
                    if (i6 == 0) {
                        synchronized (c01211) {
                            c01211.f519 += j;
                            c01211.notifyAll();
                        }
                        return true;
                    }
                    C0498 c0498M276 = c01211.m276(i6);
                    if (c0498M276 != null) {
                        synchronized (c0498M276) {
                            c0498M276.f1796 += j;
                            if (j > 0) {
                                c0498M276.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f10663.skip(iM7231);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final List m5851(int i, int i2, int i3, int i4) throws IOException {
        C1925 c1925 = this.f10662;
        c1925.f6347 = i;
        c1925.f6351 = i;
        c1925.f6350 = i2;
        c1925.f6348 = i3;
        c1925.f6349 = i4;
        C2025 c2025 = this.f10661;
        C4162 c4162 = c2025.f6675;
        ArrayList arrayList = c2025.f6678;
        while (!c4162.m7362()) {
            byte b = c4162.readByte();
            byte[] bArr = AbstractC4031.f13451;
            int i5 = b & 255;
            if (i5 == 128) {
                C5028.m8448("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iM3963 = c2025.m3963(i5, 127);
                int i6 = iM3963 - 1;
                if (i6 >= 0) {
                    C4123[] c4123Arr = AbstractC2953.f9909;
                    if (i6 <= c4123Arr.length - 1) {
                        arrayList.add(c4123Arr[i6]);
                    }
                }
                int length = c2025.f6676 + 1 + (i6 - AbstractC2953.f9909.length);
                if (length >= 0) {
                    C4123[] c4123Arr2 = c2025.f6680;
                    if (length < c4123Arr2.length) {
                        arrayList.add(c4123Arr2[length]);
                    }
                }
                C5028.m8448(AbstractC5078.m8670(iM3963, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                C4123[] c4123Arr3 = AbstractC2953.f9909;
                C1007 c1007M3966 = c2025.m3966();
                AbstractC2953.m5519(c1007M3966);
                c2025.m3962(new C4123(c1007M3966, c2025.m3966()));
            } else if ((b & 64) == 64) {
                c2025.m3962(new C4123(c2025.m3964(c2025.m3963(i5, 63) - 1), c2025.m3966()));
            } else if ((b & 32) == 32) {
                int iM3964 = c2025.m3963(i5, 31);
                c2025.f6679 = iM3964;
                if (iM3964 < 0 || iM3964 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c2025.f6679);
                }
                int i7 = c2025.f6681;
                if (iM3964 < i7) {
                    if (iM3964 == 0) {
                        C4123[] c4123Arr4 = c2025.f6680;
                        Arrays.fill(c4123Arr4, 0, c4123Arr4.length, (Object) null);
                        c2025.f6676 = c2025.f6680.length - 1;
                        c2025.f6677 = 0;
                        c2025.f6681 = 0;
                    } else {
                        c2025.m3965(i7 - iM3964);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                C4123[] c4123Arr5 = AbstractC2953.f9909;
                C1007 c1007M3967 = c2025.m3966();
                AbstractC2953.m5519(c1007M3967);
                arrayList.add(new C4123(c1007M3967, c2025.m3966()));
            } else {
                arrayList.add(new C4123(c2025.m3964(c2025.m3963(i5, 15) - 1), c2025.m3966()));
            }
        }
        List listM2039 = AbstractC0973.m2039(arrayList);
        arrayList.clear();
        return listM2039;
    }
}
