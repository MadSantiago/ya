package p000;

/* JADX INFO: renamed from: ۥٖ۟ؑٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2424 extends AbstractC5381 implements InterfaceC4933 {

    /* JADX INFO: renamed from: ۥً */
    public C2243 f8078;

    /* JADX INFO: renamed from: ۥٕ */
    public InterfaceC0215 f8079;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f8080;

    /* JADX INFO: renamed from: ۥۦ */
    public float f8081;

    /* JADX INFO: renamed from: ۦؖ */
    public C5825 f8082;

    /* JADX INFO: renamed from: ۦؗ */
    public float f8083;

    /* JADX INFO: renamed from: ۦؙ */
    public C5825 f8084;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f8085;

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        AbstractC2765.m5135(m9076(), null, 0, new C2718(this, (InterfaceC0443) null, 19), 3);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        float f;
        int i = 0;
        int i2 = 1;
        boolean z = (interfaceC1827.mo3598(C3693.m6556(j)) == 0 || interfaceC1827.mo3599(C3693.m6551(j)) == 0) ? false : true;
        if (this.f8080) {
            f = 28.0f;
        } else {
            f = (z || this.f8085) ? 24.0f : 16.0f;
        }
        float fMo741 = interfaceC2427.mo741(f);
        C5825 c5825 = this.f8082;
        int iFloatValue = (int) (c5825 != null ? ((Number) c5825.m9638()).floatValue() : fMo741);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC1236.m2609("width and height must be >= 0");
        }
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(AbstractC0671.m1495(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo742 = interfaceC2427.mo741((32.0f - interfaceC2427.mo753(fMo741)) / 2.0f);
        float fMo743 = interfaceC2427.mo741(28.0f - AbstractC3925.f13099);
        boolean z2 = this.f8080;
        if (z2 && this.f8085) {
            fMo742 = fMo743 - interfaceC2427.mo741(2.0f);
        } else if (z2 && !this.f8085) {
            fMo742 = interfaceC2427.mo741(2.0f);
        } else if (this.f8085) {
            fMo742 = fMo743;
        }
        C5825 c5826 = this.f8082;
        InterfaceC0443 interfaceC0443 = null;
        Float f2 = c5826 != null ? (Float) c5826.f19170.getValue() : null;
        if (f2 == null || f2.floatValue() != fMo741) {
            AbstractC2765.m5135(m9076(), null, 0, new C1763(this, fMo741, interfaceC0443, i), 3);
        }
        C5825 c5827 = this.f8084;
        Float f3 = c5827 != null ? (Float) c5827.f19170.getValue() : null;
        if (f3 == null || f3.floatValue() != fMo742) {
            AbstractC2765.m5135(m9076(), null, 0, new C1763(this, fMo742, interfaceC0443, i2), 3);
        }
        if (Float.isNaN(this.f8083) && Float.isNaN(this.f8081)) {
            this.f8083 = fMo741;
            this.f8081 = fMo742;
        }
        return interfaceC2427.mo755(iFloatValue, iFloatValue, C0204.f751, new C3670(abstractC0275Mo3597, this, fMo742, 2));
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦؘ */
    public final boolean mo786() {
        return false;
    }
}
