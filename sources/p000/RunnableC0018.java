package p000;

/* JADX INFO: renamed from: ۥِ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0018 implements Runnable {

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceFutureC4378 f3769;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC0032 f3770;

    public RunnableC0018(AbstractC0032 abstractC0032, InterfaceFutureC4378 interfaceFutureC4378) {
        this.f3770 = abstractC0032;
        this.f3769 = interfaceFutureC4378;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3770.f6339 != this) {
            return;
        }
        if (AbstractC0032.f6335.mo4167(this.f3770, this, AbstractC0032.m3757(this.f3769))) {
            AbstractC0032.m3755(this.f3770);
        }
    }
}
