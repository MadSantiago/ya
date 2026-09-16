package p000;

/* JADX INFO: renamed from: ۦؗؓٝ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3411 implements InterfaceC5372 {

    /* JADX INFO: renamed from: ۥَ */
    public long f11355;

    /* JADX INFO: renamed from: ۥْ */
    public AbstractC1814 f11356;

    /* JADX INFO: renamed from: ۥٓ */
    public long f11357;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f11358;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C4852 f11359;

    /* JADX INFO: renamed from: ۦۨ */
    public final C1280 f11360;

    public C3411(C1280 c1280, Object obj, AbstractC1814 abstractC1814, long j, long j2, boolean z) {
        AbstractC1814 abstractC1814M7072;
        this.f11360 = c1280;
        this.f11359 = AbstractC2774.m5183(obj);
        if (abstractC1814 != null) {
            abstractC1814M7072 = AbstractC3933.m7072(abstractC1814);
        } else {
            abstractC1814M7072 = (AbstractC1814) c1280.f4359.mo211(obj);
            abstractC1814M7072.mo2175();
        }
        this.f11356 = abstractC1814M7072;
        this.f11357 = j;
        this.f11355 = j2;
        this.f11358 = z;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return this.f11359.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f11359.getValue() + ", velocity=" + m6174() + ", isRunning=" + this.f11358 + ", lastFrameTimeNanos=" + this.f11357 + ", finishedTimeNanos=" + this.f11355 + ')';
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m6174() {
        return this.f11360.f4358.mo211(this.f11356);
    }

    public /* synthetic */ C3411(C1280 c1280, Object obj, AbstractC1814 abstractC1814, int i) {
        this(c1280, obj, (i & 4) != 0 ? null : abstractC1814, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
