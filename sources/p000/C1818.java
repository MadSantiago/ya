package p000;

/* JADX INFO: renamed from: ۥؘٜؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1818 extends C0269 {

    /* JADX INFO: renamed from: ۥُ */
    public final C4017 f6042;

    /* JADX INFO: renamed from: ۥّ */
    public final C4017 f6043;

    /* JADX INFO: renamed from: ۦۙ */
    public final float[] f6044;

    public C1818(C4017 c4017, C4017 c4018) {
        float[] fArrM6758;
        super(c4018, c4017, c4018, null);
        this.f6042 = c4017;
        this.f6043 = c4018;
        float[] fArr = (float[]) C4228.f14024.f14025;
        C5780 c5780 = c4017.f13390;
        float[] fArr2 = c4017.f13394;
        C5780 c5781 = c4018.f13390;
        float[] fArr3 = c4018.f13393;
        if (AbstractC3801.m6757(c5780, c5781)) {
            fArrM6758 = AbstractC3801.m6758(fArr3, fArr2);
        } else {
            float[] fArrM9595 = c5780.m9595();
            float[] fArrM9596 = c5781.m9595();
            C5780 c5782 = AbstractC5568.f18381;
            fArrM6758 = AbstractC3801.m6758(AbstractC3801.m6757(c5781, c5782) ? fArr3 : AbstractC3801.m6781(AbstractC3801.m6758(AbstractC3801.m6755(fArr, fArrM9596, new float[]{0.964212f, 1.0f, 0.825188f}), c4018.f13394)), AbstractC3801.m6757(c5780, c5782) ? fArr2 : AbstractC3801.m6758(AbstractC3801.m6755(fArr, fArrM9595, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f6044 = fArrM6758;
    }

    @Override // p000.C0269
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo562(long j) {
        float fM2830 = C1327.m2830(j);
        float fM2825 = C1327.m2825(j);
        float fM2829 = C1327.m2829(j);
        float fM2823 = C1327.m2823(j);
        C0641 c0641 = this.f6042.f13398;
        float fMo399 = (float) c0641.mo399(fM2830);
        float fMo3910 = (float) c0641.mo399(fM2825);
        float fMo3911 = (float) c0641.mo399(fM2829);
        float[] fArr = this.f6044;
        float f = (fArr[6] * fMo3911) + (fArr[3] * fMo3910) + (fArr[0] * fMo399);
        float f2 = (fArr[7] * fMo3911) + (fArr[4] * fMo3910) + (fArr[1] * fMo399);
        float f3 = (fArr[8] * fMo3911) + (fArr[5] * fMo3910) + (fArr[2] * fMo399);
        C4017 c4017 = this.f6043;
        C0641 c0642 = c4017.f13392;
        return AbstractC4225.m7438((float) c0642.mo399(f), (float) c0642.mo399(f2), (float) c0642.mo399(f3), fM2823, c4017);
    }
}
