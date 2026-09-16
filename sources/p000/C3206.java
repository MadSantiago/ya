package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: ۦؓۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3206 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥَ */
    public final CRC32 f10750;

    /* JADX INFO: renamed from: ۥْ */
    public final Inflater f10751;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3636 f10752;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4162 f10753;

    /* JADX INFO: renamed from: ۦۨ */
    public byte f10754;

    public C3206(InterfaceC4598 interfaceC4598) {
        C4162 c4162 = new C4162(interfaceC4598);
        this.f10753 = c4162;
        Inflater inflater = new Inflater(true);
        this.f10751 = inflater;
        this.f10752 = new C3636(c4162, inflater);
        this.f10750 = new CRC32();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m5895(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10752.close();
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        byte b;
        C3206 c3206 = this;
        C4162 c4162 = c3206.f10753;
        C1270 c1271 = c4162.f13856;
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = c3206.f10754;
        CRC32 crc32 = c3206.f10750;
        if (b2 == 0) {
            c4162.mo2691(10L);
            byte bM2670 = c1271.m2670(3L);
            boolean z = ((bM2670 >> 1) & 1) == 1;
            if (z) {
                c3206.m5896(c1271, 0L, 10L);
            }
            m5895(8075, c4162.readShort(), "ID1ID2");
            c4162.skip(8L);
            if (((bM2670 >> 2) & 1) == 1) {
                c4162.mo2691(2L);
                if (z) {
                    m5896(c1271, 0L, 2L);
                }
                long jM2689 = c1271.m2689() & 65535;
                c4162.mo2691(jM2689);
                if (z) {
                    m5896(c1271, 0L, jM2689);
                }
                c4162.skip(jM2689);
            }
            if (((bM2670 >> 3) & 1) == 1) {
                long jM7361 = c4162.m7361((byte) 0, 0L, Long.MAX_VALUE);
                if (jM7361 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m5896(c1271, 0L, jM7361 + 1);
                }
                c4162.skip(jM7361 + 1);
            }
            if (((bM2670 >> 4) & 1) == 1) {
                long jM7362 = c4162.m7361((byte) 0, 0L, Long.MAX_VALUE);
                if (jM7362 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c3206 = this;
                    c3206.m5896(c1271, 0L, jM7362 + 1);
                } else {
                    c3206 = this;
                }
                c4162.skip(jM7362 + 1);
            } else {
                c3206 = this;
            }
            if (z) {
                m5895(c4162.m7359(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c3206.f10754 = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = c1270.f4340;
            long jMo406 = c3206.f10752.mo406(c1270, j);
            if (jMo406 != -1) {
                c3206.m5896(c1270, j2, jMo406);
                return jMo406;
            }
            b = 2;
            c3206.f10754 = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            m5895(c4162.m7363(), (int) crc32.getValue(), "CRC");
            m5895(c4162.m7363(), (int) c3206.f10751.getBytesWritten(), "ISIZE");
            c3206.f10754 = (byte) 3;
            if (!c4162.m7362()) {
                C5028.m8448("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f10753.f13857.mo961();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5896(C1270 c1270, long j, long j2) {
        C3341 c3341 = c1270.f4341;
        while (true) {
            long j3 = c3341.f11174 - c3341.f11177;
            if (j < j3) {
                break;
            }
            j -= j3;
            c3341 = c3341.f11176;
        }
        while (j2 > 0) {
            int i = (int) (((long) c3341.f11177) + j);
            int iMin = (int) Math.min(c3341.f11174 - i, j2);
            this.f10750.update(c3341.f11178, i, iMin);
            j2 -= (long) iMin;
            c3341 = c3341.f11176;
            j = 0;
        }
    }
}
