package p000;

/* JADX INFO: renamed from: ۥؚؐؕ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0131 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final float f537 = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m287(InterfaceC0705 interfaceC0705, C5362 c5362, int i, int i2) {
        int i3;
        c5362.m8979(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC0705 = C4217.f13994;
            }
            AbstractC1434.m3048(c5362, AbstractC1434.m3034(AbstractC4410.m7712(interfaceC0705, f537, 25.0f), new C5860(((C5480) c5362.m8997(AbstractC4457.f14701)).f18078, i5)));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C5150(interfaceC0705, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m288(final InterfaceC3457 interfaceC3457, final InterfaceC0705 interfaceC0705, long j, C5362 c5362, final int i) {
        int i2;
        c5362.m8979(1776202187);
        int i3 = (c5362.m8963(interfaceC3457) ? 4 : 2) | i | (c5362.m8963(interfaceC0705) ? 32 : 16) | 128;
        if (c5362.m9011(i3 & 1, (i3 & 147) != 146)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                c5362.m8982();
                i2 = i3 & (-897);
            }
            c5362.m8964();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM8999 = c5362.m8999();
            if (z || objM8999 == C2850.f9517) {
                objM8999 = new C0091(3, interfaceC3457);
                c5362.m8987(objM8999);
            }
            C4773.m8124(interfaceC3457, C1298.f4428, AbstractC3925.m7034(-1653527038, new C2894(j, AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM8999)), c5362), c5362, i4 | 432);
        } else {
            c5362.m8982();
        }
        final long j2 = j;
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC0705, j2, i) { // from class: ۦٞؑؐؖ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ long f15755;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC0705 f15756;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC0131.m288(this.f15757, this.f15756, this.f15755, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }
}
