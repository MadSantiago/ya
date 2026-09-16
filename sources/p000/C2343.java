package p000;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: ۥؘۛؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2343 extends AbstractC0442 {

    /* JADX INFO: renamed from: ۥَ */
    public boolean f7779;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f7780;

    /* JADX INFO: renamed from: ۥٓ */
    public long f7781;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C4752 f7782;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f7783;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2343(C4752 c4752, InterfaceC3832 interfaceC3832, long j) {
        super(interfaceC3832);
        this.f7782 = c4752;
        this.f7783 = j;
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7779) {
            return;
        }
        this.f7779 = true;
        long j = this.f7783;
        if (j != -1 && this.f7781 != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m4392(null);
        } catch (IOException e) {
            throw m4392(e);
        }
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw m4392(e);
        }
    }

    @Override // p000.AbstractC0442, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) throws IOException {
        if (this.f7779) {
            C1078.m2276("closed");
            return;
        }
        long j2 = this.f7783;
        if (j2 == -1 || this.f7781 + j <= j2) {
            try {
                super.mo962(c1270, j);
                this.f7781 += j;
                return;
            } catch (IOException e) {
                throw m4392(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f7781 + j));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final IOException m4392(IOException iOException) {
        if (this.f7780) {
            return iOException;
        }
        this.f7780 = true;
        return this.f7782.m8075(false, true, iOException);
    }
}
