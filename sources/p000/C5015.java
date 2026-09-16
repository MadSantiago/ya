package p000;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: ۦۘؓۜؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5015 implements InterfaceC3832 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f16593;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ C0498 f16594;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1270 f16595 = new C1270();

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f16596;

    public C5015(C0498 c0498, boolean z) {
        this.f16594 = c0498;
        this.f16596 = z;
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        boolean z;
        C0498 c0498 = this.f16594;
        byte[] bArr = AbstractC4031.f13451;
        synchronized (c0498) {
            if (this.f16593) {
                return;
            }
            synchronized (c0498) {
                z = c0498.f1802 == 0;
            }
            C0498 c0499 = this.f16594;
            if (!c0499.f1803.f16596) {
                if (this.f16595.f4340 > 0) {
                    while (this.f16595.f4340 > 0) {
                        m8429(true);
                    }
                } else if (z) {
                    c0499.f1797.m275(c0499.f1799, true, null, 0L);
                }
            }
            synchronized (this.f16594) {
                this.f16593 = true;
            }
            this.f16594.f1797.flush();
            this.f16594.m1113();
        }
    }

    @Override // p000.InterfaceC3832, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        C0498 c0498 = this.f16594;
        byte[] bArr = AbstractC4031.f13451;
        synchronized (c0498) {
            c0498.m1111();
        }
        while (this.f16595.f4340 > 0) {
            m8429(false);
            this.f16594.f1797.flush();
        }
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f16594.f1801;
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) throws SocketTimeoutException {
        byte[] bArr = AbstractC4031.f13451;
        C1270 c1271 = this.f16595;
        c1271.mo962(c1270, j);
        while (c1271.f4340 >= 16384) {
            m8429(false);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8429(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        C0498 c0498 = this.f16594;
        synchronized (c0498) {
            c0498.f1801.m9679();
            while (c0498.f1795 >= c0498.f1796 && !this.f16596 && !this.f16593) {
                try {
                    synchronized (c0498) {
                        int i = c0498.f1802;
                        if (i != 0) {
                            break;
                        }
                        try {
                            c0498.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    c0498.f1801.m5258();
                    throw th;
                }
            }
            c0498.f1801.m5258();
            c0498.m1111();
            jMin = Math.min(c0498.f1796 - c0498.f1795, this.f16595.f4340);
            c0498.f1795 += jMin;
            z2 = z && jMin == this.f16595.f4340;
        }
        this.f16594.f1801.m9679();
        try {
            C0498 c0499 = this.f16594;
            c0499.f1797.m275(c0499.f1799, z2, this.f16595, jMin);
        } finally {
            this.f16594.f1801.m5258();
        }
    }
}
