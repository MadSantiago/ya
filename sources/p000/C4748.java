package p000;

/* JADX INFO: renamed from: ۦٝؕ٘ٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4748 implements InterfaceC1126 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ boolean f15678;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C3635 f15679;

    public C4748(C3635 c3635, boolean z) {
        this.f15679 = c3635;
        this.f15678 = z;
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2352() {
        C2449 c2449M9648;
        boolean z = this.f15678;
        EnumC2925 enumC2925 = z ? EnumC2925.f9839 : EnumC2925.f9837;
        C3635 c3635 = this.f15679;
        c3635.m6473(enumC2925);
        long jM2414 = AbstractC1154.m2414(c3635.m6481(z));
        C5837 c5837 = c3635.f12150;
        if (c5837 == null || (c2449M9648 = c5837.m9648()) == null) {
            return;
        }
        long jM4571 = c2449M9648.m4571(jM2414);
        c3635.f12159 = jM4571;
        c3635.m6488(new C1553(jM4571));
        c3635.f12161 = 0L;
        c3635.f12139 = -1;
        C5837 c5838 = c3635.f12150;
        if (c5838 != null) {
            c5838.f19225.setValue(Boolean.TRUE);
        }
        c3635.m6482(false);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2353(long j) {
        C3635 c3635 = this.f15679;
        long jM3304 = C1553.m3304(c3635.f12161, j);
        c3635.f12161 = jM3304;
        c3635.m6488(new C1553(C1553.m3304(c3635.f12159, jM3304)));
        c3635.m6487(c3635.m6479(), c3635.m6485().f5241, false, this.f15678, C0373.f1378, true, new C4255(9));
        c3635.m6482(false);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2354() {
        C3635 c3635 = this.f15679;
        c3635.m6473(null);
        c3635.m6488(null);
        c3635.m6482(true);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2355() {
        C3635 c3635 = this.f15679;
        c3635.m6473(null);
        c3635.m6488(null);
        c3635.m6482(true);
    }

    @Override // p000.InterfaceC1126
    public final void onCancel() {
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2356(long j, C0178 c0178) {
    }
}
