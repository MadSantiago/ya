package p000;

/* JADX INFO: renamed from: ۦٌٌ۠ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5420 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f17895 = new C4216(1, new C0871(21));

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m9092(C2917 c2917, C1831 c1831, C4413 c4413, C0857 c0857, C5362 c5362, int i) {
        int i2;
        C1831 c1832;
        C4413 c4414;
        int i3;
        c5362.m8979(-449719819);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c2917) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                c1832 = (C1831) c5362.m8997(AbstractC0265.f964);
                c4414 = (C4413) c5362.m8997(AbstractC4957.f16399);
                i3 = i2 & (-1009);
            } else {
                c5362.m8982();
                i3 = i2 & (-1009);
                c1832 = c1831;
                c4414 = c4413;
            }
            c5362.m8964();
            m9093(c2917, (C0842) c5362.m8997(f17895), c1832, c4414, c0857, c5362, ((i3 << 3) & 57344) | (i3 & 14));
        } else {
            c5362.m8982();
            c1832 = c1831;
            c4414 = c4413;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0089(c2917, c1832, c4414, c0857, i, 5);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m9093(C2917 c2917, C0842 c0842, C1831 c1831, C4413 c4413, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(904511636);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c2917) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(c0842) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(c1831) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8963(c4413) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8977(c0857) ? 16384 : 8192;
        }
        if (c5362.m9011(i2 & 1, (i2 & 9363) != 9362)) {
            c5362.m8971();
            if ((i & 1) != 0 && !c5362.m8969()) {
                c5362.m8982();
            }
            c5362.m8964();
            C0599 c0599M8032 = AbstractC4670.m8032(0.0f, 7, 0L, false);
            long j = c2917.f9752;
            boolean zM8961 = c5362.m8961(j);
            Object objM8999 = c5362.m8999();
            if (zM8961 || objM8999 == C2850.f9517) {
                objM8999 = new C5480(j, C1327.m2826(j, 0.4f, 14));
                c5362.m8987(objM8999);
            }
            C4773.m8123(new C3467[]{AbstractC0118.f470.mo4313(c2917), f17895.mo4313(c0842), AbstractC5022.f16619.mo4313(c0599M8032), AbstractC0265.f964.mo4313(c1831), AbstractC4457.f14701.mo4313((C5480) objM8999), AbstractC4957.f16399.mo4313(c4413)}, AbstractC3925.m7034(-1750539308, new C0491(i3, c4413, c0857), c5362), c5362, 56);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C2455(c2917, c0842, c1831, c4413, c0857, i, 0);
        }
    }
}
