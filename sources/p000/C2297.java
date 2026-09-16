package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ۥُۚٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2297 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f7626;

    /* JADX INFO: renamed from: ۦ۟ */
    public long f7627;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3886 f7628;

    public C2297(C3886 c3886, long j) {
        this.f7628 = c3886;
        this.f7627 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3886 c3886 = this.f7628;
        if (this.f7626) {
            return;
        }
        this.f7626 = true;
        ReentrantLock reentrantLock = c3886.f12997;
        reentrantLock.lock();
        try {
            int i = c3886.f12999 - 1;
            c3886.f12999 = i;
            if (i == 0 && c3886.f13000) {
                reentrantLock.unlock();
                synchronized (c3886) {
                    c3886.f12998.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) {
        long j2;
        long j3;
        int i;
        if (this.f7626) {
            C1078.m2276("closed");
            return 0L;
        }
        C3886 c3886 = this.f7628;
        long j4 = this.f7627;
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                C3341 c3341M2662 = c1270.m2662(1);
                byte[] bArr = c3341M2662.f11178;
                int i2 = c3341M2662.f11174;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (c3886) {
                    c3886.f12998.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = c3886.f12998.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (c3341M2662.f11177 == c3341M2662.f11174) {
                        c1270.f4341 = c3341M2662.m6103();
                        AbstractC3701.m6565(c3341M2662);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    c3341M2662.f11174 += i;
                    long j7 = i;
                    j6 += j7;
                    c1270.f4340 += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.f7627 += j3;
        }
        return j3;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return C2014.f6633;
    }
}
