package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦۛؑؗۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5206 implements InterfaceC3028 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C2384 f17203;

    public C5206(C2384 c2384) {
        this.f17203 = c2384;
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۥ٘ */
    public final long mo2943(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦٌ */
    public final long mo2946(long j, int i) {
        if (i != 1) {
            return 0L;
        }
        C2384 c2384 = this.f17203;
        if (Math.abs(c2384.m1401()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        C2257 c2257M1402 = c2384.m1402();
        float fM1401 = c2384.m1401() * c2384.m1408();
        float f = ((c2257M1402.f7490 + c2257M1402.f7483) * (-Math.signum(c2384.m1401()))) + fM1401;
        if (c2384.m1401() > 0.0f) {
            fM1401 = f;
            f = fM1401;
        }
        float f2 = -c2384.f2357.mo1400(-AbstractC4554.m7922(Float.intBitsToFloat(i2), fM1401, f));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    @Override // p000.InterfaceC3028
    /* JADX INFO: renamed from: ۦۜ */
    public final Object mo2947(long j, long j2, InterfaceC0443 interfaceC0443) {
        return new C0963(C0963.m1999(j2, 0.0f, 0.0f, 1));
    }
}
