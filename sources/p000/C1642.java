package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥؚٙؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1642 extends AbstractC4054 {

    /* JADX INFO: renamed from: ۥْ */
    public final boolean f5485;

    /* JADX INFO: renamed from: ۥٓ */
    public long f5486;

    /* JADX INFO: renamed from: ۦ۟ */
    public final long f5487;

    public C1642(InterfaceC4598 interfaceC4598, long j, boolean z) {
        super(interfaceC4598);
        this.f5487 = j;
        this.f5485 = z;
    }

    @Override // p000.InterfaceC4598
    /* JADX INFO: renamed from: ۥؖ */
    public final long mo406(C1270 c1270, long j) throws IOException {
        long j2 = this.f5486;
        long j3 = this.f5487;
        if (j2 > j3) {
            j = 0;
        } else if (this.f5485) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jMo406 = this.f13513.mo406(c1270, j);
        if (jMo406 != -1) {
            this.f5486 += jMo406;
        }
        long j5 = this.f5486;
        if ((j5 >= j3 || jMo406 != -1) && j5 <= j3) {
            return jMo406;
        }
        if (jMo406 > 0 && j5 > j3) {
            long j6 = c1270.f4340 - (j5 - j3);
            C1270 c1271 = new C1270();
            c1271.m2701(c1270);
            c1270.mo962(c1271, j6);
            c1271.m2678();
        }
        throw new IOException("expected " + j3 + " bytes but got " + this.f5486);
    }
}
