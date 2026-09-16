package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: ۥؑؓٞؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0185 extends AbstractC4054 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f673;

    /* JADX INFO: renamed from: ۥْ */
    public long f674;

    /* JADX INFO: renamed from: ۥٓ */
    public boolean f675;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f676;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C4752 f677;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f678;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185(C4752 c4752, InterfaceC4598 interfaceC4598, long j) {
        super(interfaceC4598);
        this.f677 = c4752;
        this.f678 = j;
        this.f675 = true;
        if (j == 0) {
            m407(null);
        }
    }

    @Override // p000.AbstractC4054, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f676) {
            return;
        }
        this.f676 = true;
        try {
            super.close();
            m407(null);
        } catch (IOException e) {
            throw m407(e);
        }
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        if (this.f676) {
            C1078.m2276("closed");
            return 0L;
        }
        try {
            long jMo406 = this.f13513.mo406(c1270, j);
            if (this.f675) {
                this.f675 = false;
            }
            if (jMo406 == -1) {
                m407(null);
                return -1L;
            }
            long j2 = this.f674 + jMo406;
            long j3 = this.f678;
            if (j3 == -1 || j2 <= j3) {
                this.f674 = j2;
                if (j2 == j3) {
                    m407(null);
                }
                return jMo406;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw m407(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final IOException m407(IOException iOException) {
        if (this.f673) {
            return iOException;
        }
        this.f673 = true;
        if (iOException == null && this.f675) {
            this.f675 = false;
        }
        return this.f677.m8075(true, false, iOException);
    }
}
