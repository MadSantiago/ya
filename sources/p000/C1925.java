package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۥْٞؑ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1925 implements InterfaceC4598 {

    /* JADX INFO: renamed from: ۥَ */
    public int f6347;

    /* JADX INFO: renamed from: ۥْ */
    public int f6348;

    /* JADX INFO: renamed from: ۥٓ */
    public int f6349;

    /* JADX INFO: renamed from: ۥٖ */
    public int f6350;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f6351;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4473 f6352;

    public C1925(InterfaceC4473 interfaceC4473) {
        this.f6352 = interfaceC4473;
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f6347;
            InterfaceC4473 interfaceC4473 = this.f6352;
            if (i3 == 0) {
                interfaceC4473.skip(this.f6350);
                this.f6350 = 0;
                if ((this.f6348 & 4) == 0) {
                    i = this.f6349;
                    int iM7231 = AbstractC4031.m7231(interfaceC4473);
                    this.f6347 = iM7231;
                    this.f6351 = iM7231;
                    int i4 = interfaceC4473.readByte() & 255;
                    this.f6348 = interfaceC4473.readByte() & 255;
                    Logger logger = C3170.f10660;
                    if (logger.isLoggable(Level.FINE)) {
                        C1007 c1007 = AbstractC2678.f8883;
                        logger.fine(AbstractC2678.m4984(true, this.f6349, this.f6351, i4, this.f6348));
                    }
                    i2 = interfaceC4473.readInt() & Integer.MAX_VALUE;
                    this.f6349 = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jMo406 = interfaceC4473.mo406(c1270, Math.min(j, i3));
                if (jMo406 != -1) {
                    this.f6347 -= (int) jMo406;
                    return jMo406;
                }
            }
            return -1L;
        } while (i2 == i);
        C5028.m8448("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // p000.InterfaceC4598, p000.InterfaceC3832
    /* JADX INFO: renamed from: ۥّ */
    public final C2014 mo961() {
        return this.f6352.mo961();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
