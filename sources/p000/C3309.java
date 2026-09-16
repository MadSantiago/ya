package p000;

/* JADX INFO: renamed from: ۦؕٔؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3309 implements InterfaceC1126 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C3635 f11072;

    public C3309(C3635 c3635) {
        this.f11072 = c3635;
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2353(long j) {
        C2449 c2449M9648;
        InterfaceC1922 interfaceC1922;
        C3635 c3635 = this.f11072;
        c3635.f12161 = C1553.m3304(c3635.f12161, j);
        C5837 c5837 = c3635.f12150;
        if (c5837 == null || (c2449M9648 = c5837.m9648()) == null) {
            return;
        }
        c3635.m6488(new C1553(C1553.m3304(c3635.f12159, c3635.f12161)));
        int iMo4318 = c3635.f12147.mo4318(c2449M9648.m4572(c3635.m6485().f5241, true));
        long jM5145 = AbstractC2765.m5145(iMo4318, iMo4318);
        if (C3346.m6110(jM5145, c3635.m6479().f18943)) {
            return;
        }
        C5837 c5838 = c3635.f12150;
        if ((c5838 == null || ((Boolean) c5838.f19225.getValue()).booleanValue()) && (interfaceC1922 = c3635.f12153) != null) {
            ((C1651) interfaceC1922).m3465(9);
        }
        c3635.f12138.mo211(C3635.m6468(c3635.m6479().f18944, jM5145));
        c3635.f12160 = new C3346(jM5145);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2354() {
        C3635 c3635 = this.f11072;
        c3635.m6473(null);
        c3635.m6488(null);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2355() {
        C3635 c3635 = this.f11072;
        c3635.m6473(null);
        c3635.m6488(null);
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2356(long j, C0178 c0178) {
        C2449 c2449M9648;
        C3635 c3635 = this.f11072;
        long jM2414 = AbstractC1154.m2414(c3635.m6481(true));
        C5837 c5837 = c3635.f12150;
        if (c5837 == null || (c2449M9648 = c5837.m9648()) == null) {
            return;
        }
        long jM4571 = c2449M9648.m4571(jM2414);
        c3635.f12159 = jM4571;
        c3635.m6488(new C1553(jM4571));
        c3635.f12161 = 0L;
        c3635.m6473(EnumC2925.f9840);
        c3635.m6482(false);
    }

    @Override // p000.InterfaceC1126
    public final void onCancel() {
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2352() {
    }
}
