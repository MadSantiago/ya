package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: ۦُٖؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3911 extends AbstractC2408 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ C2186 f13041;

    /* JADX INFO: renamed from: ۥٓ */
    public long f13042;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3911(C2186 c2186, long j) {
        super(c2186);
        this.f13041 = c2186;
        this.f13042 = j;
        if (j == 0) {
            m4532();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM7230;
        if (this.f8019) {
            return;
        }
        if (this.f13042 != 0) {
            try {
                zM7230 = AbstractC4031.m7230(this, 100);
            } catch (IOException unused) {
                zM7230 = false;
            }
            if (!zM7230) {
                ((C3641) this.f13041.f7246).m6511();
                m4532();
            }
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
        long j2 = this.f13042;
        if (j2 == 0) {
            return -1L;
        }
        long jMo406 = super.mo406(c1270, Math.min(j2, j));
        if (jMo406 == -1) {
            ((C3641) this.f13041.f7246).m6511();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m4532();
            throw protocolException;
        }
        long j3 = this.f13042 - jMo406;
        this.f13042 = j3;
        if (j3 == 0) {
            m4532();
        }
        return jMo406;
    }
}
