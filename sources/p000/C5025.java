package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ۦٕۘؕؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5025 implements InterfaceC2674 {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f16634;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C1270 f16635 = new C1270();

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3832 f16636;

    public C5025(InterfaceC3832 interfaceC3832) {
        this.f16636 = interfaceC3832;
    }

    @Override // p000.InterfaceC3832, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC3832 interfaceC3832 = this.f16636;
        if (this.f16634) {
            return;
        }
        C1270 c1270 = this.f16635;
        long j = c1270.f4340;
        if (j > 0) {
            interfaceC3832.mo962(c1270, j);
        }
        th = null;
        try {
            interfaceC3832.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f16634 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC2674, p000.InterfaceC3832, java.io.Flushable
    public final void flush() {
        if (this.f16634) {
            C1078.m2276("closed");
            return;
        }
        C1270 c1270 = this.f16635;
        long j = c1270.f4340;
        InterfaceC3832 interfaceC3832 = this.f16636;
        if (j > 0) {
            interfaceC3832.mo962(c1270, j);
        }
        interfaceC3832.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f16634;
    }

    public final String toString() {
        return "buffer(" + this.f16636 + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f16634) {
            C1078.m2276("closed");
            return 0;
        }
        int iWrite = this.f16635.write(byteBuffer);
        m8443();
        return iWrite;
    }

    @Override // p000.InterfaceC2674
    public final InterfaceC2674 writeByte(int i) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2680(i);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    public final InterfaceC2674 writeInt(int i) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2664(i);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    public final InterfaceC2674 writeShort(int i) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2673(i);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۥؔ */
    public final InterfaceC2674 mo2660(String str) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2677(str);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f16636.mo961();
    }

    @Override // p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo962(C1270 c1270, long j) {
        if (this.f16634) {
            C1078.m2276("closed");
        } else {
            this.f16635.mo962(c1270, j);
            m8443();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC2674 m8443() {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        C1270 c1270 = this.f16635;
        long jM2668 = c1270.m2668();
        if (jM2668 > 0) {
            this.f16636.mo962(c1270, jM2668);
        }
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۥۦ */
    public final InterfaceC2674 mo2681(int i, byte[] bArr) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2661(i, bArr);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦؑ */
    public final C1270 mo2685() {
        return this.f16635;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC2674 mo2692(long j) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2700(j);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC2674 mo2696(C1007 c1007) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2676(c1007);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    /* JADX INFO: renamed from: ۦۜ */
    public final InterfaceC2674 mo2699(long j) {
        if (this.f16634) {
            C1078.m2276("closed");
            return null;
        }
        this.f16635.m2683(j);
        m8443();
        return this;
    }

    @Override // p000.InterfaceC2674
    public final InterfaceC2674 write(byte[] bArr) {
        if (!this.f16634) {
            this.f16635.m2661(bArr.length, bArr);
            m8443();
            return this;
        }
        C1078.m2276("closed");
        return null;
    }
}
