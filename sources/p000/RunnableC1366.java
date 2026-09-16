package p000;

/* JADX INFO: renamed from: ۥٔؗ٘ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1366 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public boolean f4685;

    /* JADX INFO: renamed from: ۦ۟ */
    public final EnumC1924 f4686;

    /* JADX INFO: renamed from: ۦۨ */
    public final C4170 f4687;

    public RunnableC1366(C4170 c4170, EnumC1924 enumC1924) {
        this.f4687 = c4170;
        this.f4686 = enumC1924;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4685) {
            return;
        }
        this.f4687.m7369(this.f4686);
        this.f4685 = true;
    }
}
