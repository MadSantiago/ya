package p000;

/* JADX INFO: renamed from: ۥٜؓٙؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1822 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3639 f6052;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f6053;

    /* JADX INFO: renamed from: ۥۗ */
    public final ViewTreeObserverOnGlobalLayoutListenerC0850 f6054;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2016 f6055;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3639 f6056;

    public C1822(C2016 c2016, ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850) {
        this.f6055 = c2016;
        this.f6054 = viewTreeObserverOnGlobalLayoutListenerC0850;
        C3639 c3639 = AbstractC5705.f18789;
        this.f6052 = new C3639();
        this.f6056 = new C3639();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3595() {
        if (this.f6053) {
            return;
        }
        C3548 c3548 = new C3548(0, this, C1822.class, "invalidateNodes", "invalidateNodes()V", 0, 4);
        C2730 c2730 = this.f6054.f3072;
        if (c2730.m5086(c3548) < 0) {
            c2730.m5079(c3548);
        }
        this.f6053 = true;
    }
}
