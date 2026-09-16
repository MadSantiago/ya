package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦٖۣٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4147 extends AbstractC2408 {

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f13805;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8019) {
            return;
        }
        if (!this.f13805) {
            m4532();
        }
        this.f8019 = true;
    }

    @Override // p000.AbstractC2408, p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        if (j < 0) {
            C1078.m2273(AbstractC3761.m6634(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f8019) {
            C1078.m2276("closed");
            return 0L;
        }
        if (this.f13805) {
            return -1L;
        }
        long jMo406 = super.mo406(c1270, j);
        if (jMo406 != -1) {
            return jMo406;
        }
        this.f13805 = true;
        m4532();
        return -1L;
    }
}
