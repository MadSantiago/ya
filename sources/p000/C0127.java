package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ۥّؐؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0127 implements Closeable {

    /* JADX INFO: renamed from: ۦۜ */
    public static final C1928 f506;

    /* JADX INFO: renamed from: ۥؓ */
    public long f507;

    /* JADX INFO: renamed from: ۥؔ */
    public final LinkedHashSet f508;

    /* JADX INFO: renamed from: ۥؖ */
    public long f509;

    /* JADX INFO: renamed from: ۥً */
    public long f510;

    /* JADX INFO: renamed from: ۥَ */
    public int f511;

    /* JADX INFO: renamed from: ۥْ */
    public final String f512;

    /* JADX INFO: renamed from: ۥٓ */
    public int f513;

    /* JADX INFO: renamed from: ۥٕ */
    public C1928 f514;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f515;

    /* JADX INFO: renamed from: ۥٙ */
    public final C0373 f516;

    /* JADX INFO: renamed from: ۥۖ */
    public final C2324 f517;

    /* JADX INFO: renamed from: ۥۙ */
    public long f518;

    /* JADX INFO: renamed from: ۥۦ */
    public long f519;

    /* JADX INFO: renamed from: ۥۧ */
    public long f520;

    /* JADX INFO: renamed from: ۦؖ */
    public long f521;

    /* JADX INFO: renamed from: ۦؗ */
    public final Socket f522;

    /* JADX INFO: renamed from: ۦؙ */
    public long f523;

    /* JADX INFO: renamed from: ۦُ */
    public final C3149 f524;

    /* JADX INFO: renamed from: ۦٕ */
    public final C2324 f525;

    /* JADX INFO: renamed from: ۦٖ */
    public final C0715 f526;

    /* JADX INFO: renamed from: ۦٗ */
    public final C2680 f527;

    /* JADX INFO: renamed from: ۦٚ */
    public final C1928 f528;

    /* JADX INFO: renamed from: ۦۛ */
    public final C2324 f529;

    /* JADX INFO: renamed from: ۦ۟ */
    public final LinkedHashMap f530 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC1918 f531;

    static {
        C1928 c1928 = new C1928();
        c1928.m3788(7, 65535);
        c1928.m3788(5, 16384);
        f506 = c1928;
    }

    public C0127(C2813 c2813) {
        this.f531 = (AbstractC1918) c2813.f9392;
        String str = (String) c2813.f9390;
        this.f512 = str == null ? null : str;
        this.f511 = 3;
        C2680 c2680 = (C2680) c2813.f9393;
        this.f527 = c2680;
        this.f529 = c2680.m4989();
        this.f517 = c2680.m4989();
        this.f525 = c2680.m4989();
        this.f516 = C0373.f1372;
        C1928 c1928 = new C1928();
        c1928.m3788(7, 16777216);
        this.f528 = c1928;
        C1928 c1929 = f506;
        this.f514 = c1929;
        this.f519 = c1929.m3789();
        Socket socket = (Socket) c2813.f9389;
        this.f522 = socket == null ? null : socket;
        C5025 c5025 = (C5025) c2813.f9391;
        this.f524 = new C3149(c5025 == null ? null : c5025);
        C4162 c4162 = (C4162) c2813.f9388;
        this.f526 = new C0715(this, new C3170(c4162 != null ? c4162 : null));
        this.f508 = new LinkedHashSet();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m277(1, 9, null);
    }

    public final void flush() {
        this.f524.flush();
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m272(int i) {
        synchronized (this.f524) {
            synchronized (this) {
                if (this.f515) {
                    return;
                }
                this.f515 = true;
                this.f524.m5829(AbstractC4031.f13451, this.f513, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final synchronized void m273(long j) {
        long j2 = this.f518 + j;
        this.f518 = j2;
        long j3 = j2 - this.f523;
        if (j3 >= this.f528.m3789() / 2) {
            m274(j3, 0);
            this.f523 += j3;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m274(long j, int i) {
        this.f529.m4367(new C0279(this.f512 + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m275(int i, boolean z, C1270 c1270, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f524.m5833(z, i, c1270, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f521;
                            j3 = this.f519;
                            if (j2 >= j3) {
                                if (!this.f530.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f524.f10626);
                j4 = iMin;
                this.f521 += j4;
            }
            j -= j4;
            this.f524.m5833(z && j == 0, i, c1270, iMin);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final synchronized C0498 m276(int i) {
        return (C0498) this.f530.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m277(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        byte[] bArr = AbstractC4031.f13451;
        try {
            m272(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f530.isEmpty()) {
                array = null;
            } else {
                array = this.f530.values().toArray(new C0498[0]);
                this.f530.clear();
            }
        }
        C0498[] c0498Arr = (C0498[]) array;
        if (c0498Arr != null) {
            for (C0498 c0498 : c0498Arr) {
                try {
                    c0498.m1108(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f524.close();
        } catch (IOException unused3) {
        }
        try {
            this.f522.close();
        } catch (IOException unused4) {
        }
        this.f529.m4368();
        this.f517.m4368();
        this.f525.m4368();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m278(int i, int i2) {
        this.f529.m4367(new C5637(this.f512 + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final synchronized C0498 m279(int i) {
        C0498 c0498;
        c0498 = (C0498) this.f530.remove(Integer.valueOf(i));
        notifyAll();
        return c0498;
    }
}
