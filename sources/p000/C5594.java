package p000;

/* JADX INFO: renamed from: ۦۣؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5594 extends AbstractC4937 {

    /* JADX INFO: renamed from: ۥؗ */
    public AbstractC0073 f18435;

    /* JADX INFO: renamed from: ۥُ */
    public int f18436;

    /* JADX INFO: renamed from: ۦؑ */
    public int f18437;

    public C5594(long j, AbstractC0073 abstractC0073) {
        super(j);
        this.f18435 = abstractC0073;
    }

    @Override // p000.AbstractC4937
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo2261(long j) {
        return new C5594(j, this.f18435);
    }

    @Override // p000.AbstractC4937
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2262(AbstractC4937 abstractC4937) {
        synchronized (AbstractC3801.f12622) {
            this.f18435 = ((C5594) abstractC4937).f18435;
            this.f18437 = ((C5594) abstractC4937).f18437;
            this.f18436 = ((C5594) abstractC4937).f18436;
        }
    }
}
