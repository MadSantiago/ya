package p000;

/* JADX INFO: renamed from: ۦّۙؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5113 implements InterfaceC1437 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C3594 f16958;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C4545 f16959;

    public C5113(C4545 c4545, C3594 c3594) {
        this.f16959 = c4545;
        this.f16958 = c3594;
    }

    @Override // p000.InterfaceC1437
    /* JADX INFO: renamed from: ۥۣ */
    public final float mo927(float f) {
        float fAbs = Math.abs(f);
        C4545 c4545 = this.f16959;
        if (fAbs != 0.0f && !((Boolean) c4545.f15014.mo449()).booleanValue()) {
            throw new C5834(0, "The fling animation was cancelled");
        }
        return c4545.m7872(c4545.m7874(this.f16958.m6402(c4545.m7867(c4545.m7870(f)), 2)));
    }
}
