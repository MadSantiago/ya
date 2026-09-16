package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦٖؓؑٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3149 implements Closeable {

    /* JADX INFO: renamed from: ۥٖ */
    public static final Logger f10624 = Logger.getLogger(AbstractC2678.class.getName());

    /* JADX INFO: renamed from: ۥَ */
    public final C5850 f10625;

    /* JADX INFO: renamed from: ۥْ */
    public int f10626;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f10627;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1270 f10628;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC2674 f10629;

    public C3149(InterfaceC2674 interfaceC2674) {
        this.f10629 = interfaceC2674;
        C1270 c1270 = new C1270();
        this.f10628 = c1270;
        this.f10626 = 16384;
        this.f10625 = new C5850(c1270);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f10627 = true;
        this.f10629.close();
    }

    public final synchronized void flush() {
        if (this.f10627) {
            throw new IOException("closed");
        }
        this.f10629.flush();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final synchronized void m5829(byte[] bArr, int i, int i2) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        if (AbstractC3761.m6632(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        m5836(0, bArr.length + 8, 7, 0);
        this.f10629.writeInt(i);
        this.f10629.writeInt(AbstractC3761.m6632(i2));
        if (bArr.length != 0) {
            this.f10629.write(bArr);
        }
        this.f10629.flush();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final synchronized void m5830(boolean z, int i, ArrayList arrayList) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        this.f10625.m9674(arrayList);
        long j = this.f10628.f4340;
        long jMin = Math.min(this.f10626, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m5836(i, (int) jMin, 1, i2);
        this.f10629.mo962(this.f10628, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.f10626, j2);
                j2 -= jMin2;
                m5836(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.f10629.mo962(this.f10628, jMin2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final synchronized void m5831(long j, int i) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m5836(i, 4, 8, 0);
        this.f10629.writeInt((int) j);
        this.f10629.flush();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final synchronized void m5832(int i, int i2, boolean z) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        m5836(0, 8, 6, z ? 1 : 0);
        this.f10629.writeInt(i);
        this.f10629.writeInt(i2);
        this.f10629.flush();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized void m5833(boolean z, int i, C1270 c1270, int i2) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        m5836(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.f10629.mo962(c1270, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized void m5834(C1928 c1928) {
        try {
            if (this.f10627) {
                throw new IOException("closed");
            }
            int i = this.f10626;
            int i2 = c1928.f6354;
            if ((i2 & 32) != 0) {
                i = c1928.f6353[5];
            }
            this.f10626 = i;
            if (((i2 & 2) != 0 ? c1928.f6353[1] : -1) != -1) {
                C5850 c5850 = this.f10625;
                int iMin = Math.min((i2 & 2) != 0 ? c1928.f6353[1] : -1, 16384);
                int i3 = c5850.f19282;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        c5850.f19279 = Math.min(c5850.f19279, iMin);
                    }
                    c5850.f19276 = true;
                    c5850.f19282 = iMin;
                    int i4 = c5850.f19280;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            C4123[] c4123Arr = c5850.f19277;
                            Arrays.fill(c4123Arr, 0, c4123Arr.length, (Object) null);
                            c5850.f19278 = c5850.f19277.length - 1;
                            c5850.f19283 = 0;
                            c5850.f19280 = 0;
                        } else {
                            c5850.m9673(i4 - iMin);
                        }
                    }
                }
            }
            m5836(0, 0, 4, 1);
            this.f10629.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final synchronized void m5835(int i, int i2) {
        if (this.f10627) {
            throw new IOException("closed");
        }
        if (AbstractC3761.m6632(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        m5836(i, 4, 3, 0);
        this.f10629.writeInt(AbstractC3761.m6632(i2));
        this.f10629.flush();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m5836(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f10624;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC2678.m4984(false, i, i2, i3, i4));
        }
        if (i2 > this.f10626) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f10626 + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C1078.m2273(AbstractC5078.m8670(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = AbstractC4031.f13451;
        InterfaceC2674 interfaceC2674 = this.f10629;
        interfaceC2674.writeByte((i2 >>> 16) & 255);
        interfaceC2674.writeByte((i2 >>> 8) & 255);
        interfaceC2674.writeByte(i2 & 255);
        interfaceC2674.writeByte(i3 & 255);
        interfaceC2674.writeByte(i4 & 255);
        interfaceC2674.writeInt(i & Integer.MAX_VALUE);
    }
}
