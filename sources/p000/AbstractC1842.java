package p000;

/* JADX INFO: renamed from: ۥؙٜؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1842 implements InterfaceC2880 {

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f6113;

    /* JADX INFO: renamed from: ۦؚ */
    public static void m3621(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, InterfaceC4745 interfaceC4745) {
        abstractC1842.m3629(abstractC0275);
        abstractC0275.mo571(C0873.m1861(0L, abstractC0275.f981), 0.0f, interfaceC4745);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m3622(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, long j) {
        int i = AbstractC3458.f11474;
        C3948 c3948 = C3948.f13185;
        abstractC1842.m3629(abstractC0275);
        abstractC0275.mo571(C0873.m1861(j, abstractC0275.f981), 0.0f, c3948);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m3623(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1842.mo3627() == EnumC2459.f8215 || abstractC1842.mo3628() == 0) {
            abstractC1842.m3629(abstractC0275);
            abstractC0275.mo571(C0873.m1861(j, abstractC0275.f981), 0.0f, null);
        } else {
            int iMo3628 = (abstractC1842.mo3628() - abstractC0275.f985) - ((int) (j >> 32));
            abstractC1842.m3629(abstractC0275);
            abstractC0275.mo571(C0873.m1861((((long) iMo3628) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC0275.f981), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m3624(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, long j) {
        abstractC1842.m3629(abstractC0275);
        abstractC0275.mo571(C0873.m1861(j, abstractC0275.f981), 0.0f, null);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m3625(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, int i, int i2) {
        int i3 = AbstractC3458.f11474;
        C3948 c3948 = C3948.f13185;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1842.mo3627() == EnumC2459.f8215 || abstractC1842.mo3628() == 0) {
            abstractC1842.m3629(abstractC0275);
            abstractC0275.mo571(C0873.m1861(j, abstractC0275.f981), 0.0f, c3948);
        } else {
            int iMo3628 = (abstractC1842.mo3628() - abstractC0275.f985) - ((int) (j >> 32));
            abstractC1842.m3629(abstractC0275);
            abstractC0275.mo571(C0873.m1861((((long) iMo3628) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC0275.f981), 0.0f, c3948);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m3626(AbstractC1842 abstractC1842, AbstractC0275 abstractC0275, int i, int i2) {
        abstractC1842.m3629(abstractC0275);
        abstractC0275.mo571(C0873.m1861((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC0275.f981), 0.0f, null);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract EnumC2459 mo3627();

    /* JADX INFO: renamed from: ۥُ */
    public abstract int mo3628();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥّ */
    public final void m3629(AbstractC0275 abstractC0275) {
        if (abstractC0275 instanceof InterfaceC4262) {
            ((InterfaceC4262) abstractC0275).mo4387(this.f6113);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public float mo3630(C0341 c0341) {
        return Float.NaN;
    }
}
