package p000;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: ۥٕٟؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0498 {

    /* JADX INFO: renamed from: ۥؗ */
    public long f1794;

    /* JADX INFO: renamed from: ۥُ */
    public long f1795;

    /* JADX INFO: renamed from: ۥّ */
    public long f1796;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0127 f1797;

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f1798;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f1799;

    /* JADX INFO: renamed from: ۦؑ */
    public long f1800;

    /* JADX INFO: renamed from: ۦؚ */
    public final C2789 f1801;

    /* JADX INFO: renamed from: ۦٌ */
    public int f1802;

    /* JADX INFO: renamed from: ۦِ */
    public final C5015 f1803;

    /* JADX INFO: renamed from: ۦٛ */
    public final C1886 f1804;

    /* JADX INFO: renamed from: ۦۗ */
    public final C2789 f1805;

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayDeque f1806;

    /* JADX INFO: renamed from: ۦۚ */
    public IOException f1807;

    public C0498(int i, C0127 c0127, boolean z, boolean z2, C4714 c4714) {
        this.f1799 = i;
        this.f1797 = c0127;
        this.f1796 = c0127.f514.m3789();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1806 = arrayDeque;
        this.f1804 = new C1886(this, c0127.f528.m3789(), z2);
        this.f1803 = new C5015(this, z);
        this.f1805 = new C2789(this);
        this.f1801 = new C2789(this);
        if (c4714 == null) {
            if (m1116()) {
                return;
            }
            C1078.m2276("remotely-initiated streams should have headers");
            throw null;
        }
        if (m1116()) {
            C1078.m2276("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c4714);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1108(int i, IOException iOException) {
        if (m1114(i, iOException)) {
            this.f1797.f524.m5835(this.f1799, i);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m1109(int i) {
        if (m1114(i, null)) {
            this.f1797.m278(this.f1799, i);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final C5015 m1110() {
        synchronized (this) {
            if (!this.f1798 && !m1116()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1803;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1111() throws IOException {
        C5015 c5015 = this.f1803;
        if (c5015.f16593) {
            C5028.m8448("stream closed");
            return;
        }
        if (c5015.f16596) {
            C5028.m8448("stream finished");
            return;
        }
        int i = this.f1802;
        if (i != 0) {
            IOException iOException = this.f1807;
            if (iOException == null) {
                throw new C5629(i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final synchronized boolean m1112() {
        try {
            if (this.f1802 != 0) {
                return false;
            }
            C1886 c1886 = this.f1804;
            if (c1886.f6265 || c1886.f6261) {
                C5015 c5015 = this.f1803;
                if ((c5015.f16596 || c5015.f16593) && this.f1798) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m1113() {
        boolean z;
        boolean zM1112;
        byte[] bArr = AbstractC4031.f13451;
        synchronized (this) {
            try {
                C1886 c1886 = this.f1804;
                if (c1886.f6265 || !c1886.f6261) {
                    z = false;
                } else {
                    C5015 c5015 = this.f1803;
                    if (c5015.f16596 || c5015.f16593) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM1112 = m1112();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m1108(9, null);
        } else {
            if (zM1112) {
                return;
            }
            this.f1797.m279(this.f1799);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m1114(int i, IOException iOException) {
        byte[] bArr = AbstractC4031.f13451;
        synchronized (this) {
            if (this.f1802 != 0) {
                return false;
            }
            this.f1802 = i;
            this.f1807 = iOException;
            notifyAll();
            if (this.f1804.f6265 && this.f1803.f16596) {
                return false;
            }
            this.f1797.m279(this.f1799);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m1115(C4714 c4714, boolean z) {
        boolean zM1112;
        byte[] bArr = AbstractC4031.f13451;
        synchronized (this) {
            try {
                if (this.f1798 && z) {
                    this.f1804.getClass();
                } else {
                    this.f1798 = true;
                    this.f1806.add(c4714);
                }
                if (z) {
                    this.f1804.f6265 = true;
                }
                zM1112 = m1112();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM1112) {
            return;
        }
        this.f1797.m279(this.f1799);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean m1116() {
        boolean z = (this.f1799 & 1) == 1;
        this.f1797.getClass();
        return true == z;
    }
}
