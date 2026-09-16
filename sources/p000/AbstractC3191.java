package p000;

/* JADX INFO: renamed from: ۦْؓؗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3191 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f10717;

    /* JADX INFO: renamed from: ۥۗ */
    public long f10718;

    /* JADX INFO: renamed from: ۥۣ */
    public C5570 f10719;

    /* JADX INFO: renamed from: ۦؑ */
    public int f10720;

    public AbstractC3191(long j, C5570 c5570) {
        int iM840;
        int iNumberOfTrailingZeros;
        this.f10719 = c5570;
        this.f10718 = j;
        C4215 c4215 = AbstractC1538.f5208;
        if (j != 0) {
            C5570 c5570Mo5117 = mo5117();
            long j2 = c5570Mo5117.f18393;
            long[] jArr = c5570Mo5117.f18394;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = c5570Mo5117.f18395;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = c5570Mo5117.f18396;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (AbstractC1538.f5203) {
                iM840 = AbstractC1538.f5205.m840(j);
            }
        } else {
            iM840 = -1;
        }
        this.f10720 = iM840;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static void m5876(AbstractC3191 abstractC3191) {
        AbstractC1538.f5206.m9128(abstractC3191);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract void mo2657();

    /* JADX INFO: renamed from: ۥَ */
    public void mo5877(long j) {
        this.f10718 = j;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract InterfaceC4745 mo4945();

    /* JADX INFO: renamed from: ۥّ */
    public abstract boolean mo4946();

    /* JADX INFO: renamed from: ۥٓ */
    public void mo5878(C5570 c5570) {
        this.f10719 = c5570;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void mo5879(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void mo5880() {
        AbstractC1538.f5209 = AbstractC1538.f5209.m9400(mo5118());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public int mo5881() {
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5882() {
        synchronized (AbstractC1538.f5203) {
            mo5880();
            mo5884();
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public C5570 mo5117() {
        return this.f10719;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public abstract void mo4467();

    /* JADX INFO: renamed from: ۦٌ */
    public abstract void mo4468();

    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC3191 m5883() {
        C5460 c5460 = AbstractC1538.f5206;
        AbstractC3191 abstractC3191 = (AbstractC3191) c5460.get();
        c5460.m9128(this);
        return abstractC3191;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public abstract AbstractC3191 mo4469(InterfaceC4745 interfaceC4745);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract InterfaceC4745 mo4947();

    /* JADX INFO: renamed from: ۦۗ */
    public abstract void mo4470();

    /* JADX INFO: renamed from: ۦۙ */
    public long mo5118() {
        return this.f10718;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo4948(InterfaceC0622 interfaceC0622);

    /* JADX INFO: renamed from: ۦ۟ */
    public void mo5884() {
        m5885();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m5885() {
        int i = this.f10720;
        if (i >= 0) {
            AbstractC1538.m3275(i);
            this.f10720 = -1;
        }
    }
}
