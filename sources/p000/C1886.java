package p000;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: ۥؘٝؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1886 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f6261;

    /* JADX INFO: renamed from: ۥْ */
    public final C1270 f6262 = new C1270();

    /* JADX INFO: renamed from: ۥٓ */
    public final C1270 f6263 = new C1270();

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C0498 f6264;

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f6265;

    /* JADX INFO: renamed from: ۦۨ */
    public final long f6266;

    public C1886(C0498 c0498, long j, boolean z) {
        this.f6264 = c0498;
        this.f6266 = j;
        this.f6265 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        C0498 c0498 = this.f6264;
        synchronized (c0498) {
            this.f6261 = true;
            C1270 c1270 = this.f6263;
            j = c1270.f4340;
            c1270.m2678();
            c0498.notifyAll();
        }
        if (j > 0) {
            C0498 c0499 = this.f6264;
            byte[] bArr = AbstractC4031.f13451;
            c0499.f1797.m273(j);
        }
        this.f6264.m1113();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0096 A[LOOP:0: B:4:0x000a->B:47:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x009a A[SYNTHETIC] */
    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws Throwable {
        int i;
        Throwable c5629;
        boolean z;
        long j2;
        long jMo406;
        long j3 = 0;
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            C0498 c0498 = this.f6264;
            synchronized (c0498) {
                c0498.f1805.m9679();
                try {
                    synchronized (c0498) {
                        i = c0498.f1802;
                    }
                    if (z) {
                        if (jMo406 != -1) {
                            return jMo406;
                        }
                        if (c5629 == null) {
                            return -1L;
                        }
                        throw c5629;
                    }
                    j3 = j2;
                } catch (Throwable th) {
                    c0498.f1805.m5258();
                    throw th;
                }
            }
            if (i != 0 && !this.f6265) {
                c5629 = c0498.f1807;
                if (c5629 == null) {
                    synchronized (c0498) {
                        c5629 = new C5629(c0498.f1802);
                    }
                }
                throw th;
            }
            c5629 = null;
            if (this.f6261) {
                throw new IOException("stream closed");
            }
            C1270 c1271 = this.f6263;
            long j4 = c1271.f4340;
            z = false;
            if (j4 > j3) {
                jMo406 = c1271.mo406(c1270, Math.min(j, j4));
                long j5 = c0498.f1794 + jMo406;
                c0498.f1794 = j5;
                j2 = j3;
                long j6 = j5 - c0498.f1800;
                if (c5629 == null && j6 >= c0498.f1797.f528.m3789() / 2) {
                    c0498.f1797.m274(j6, c0498.f1799);
                    c0498.f1800 = c0498.f1794;
                }
            } else {
                j2 = j3;
                if (!this.f6265 && c5629 == null) {
                    try {
                        c0498.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jMo406 = -1;
            }
            c0498.f1805.m5258();
            if (z) {
                if (jMo406 != -1) {
                    return jMo406;
                }
                if (c5629 == null) {
                    return -1L;
                }
                throw c5629;
            }
            j3 = j2;
        }
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f6264.f1805;
    }
}
