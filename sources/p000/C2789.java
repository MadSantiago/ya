package p000;

import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: ۥۦٜؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2789 extends C5858 {

    /* JADX INFO: renamed from: ۦٌ */
    public final /* synthetic */ C0498 f9294;

    public C2789(C0498 c0498) {
        this.f9294 = c0498;
    }

    @Override // p000.C5858
    /* JADX INFO: renamed from: ۦِ */
    public final void mo2853() {
        this.f9294.m1109(9);
        C0127 c0127 = this.f9294.f1797;
        synchronized (c0127) {
            long j = c0127.f520;
            long j2 = c0127.f507;
            if (j < j2) {
                return;
            }
            c0127.f507 = j2 + 1;
            c0127.f510 = System.nanoTime() + 1000000000;
            c0127.f529.m4367(new C1841(AbstractC3761.m6621(new StringBuilder(), c0127.f512, " ping"), c0127, 0), 0L);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m5258() throws SocketTimeoutException {
        if (m9680()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
