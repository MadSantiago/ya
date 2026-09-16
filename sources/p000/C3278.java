package p000;

/* JADX INFO: renamed from: ۦٖؕؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3278 implements InterfaceC1126 {

    /* JADX INFO: renamed from: ۥۗ */
    public C3346 f10990;

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ C3635 f10992;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f10991 = true;

    /* JADX INFO: renamed from: ۥؗ */
    public C0178 f10989 = C0373.f1375;

    public C3278(C3635 c3635) {
        this.f10992 = c3635;
    }

    @Override // p000.InterfaceC1126
    public final void onCancel() {
        m6039();
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2353(long j) {
        C2449 c2449M9648;
        long jM6487;
        C3635 c3635 = this.f10992;
        if (!c3635.m6483() || c3635.m6479().f18944.f4307.length() == 0) {
            return;
        }
        c3635.f12161 = C1553.m3304(c3635.f12161, j);
        C5837 c5837 = c3635.f12150;
        if (c5837 != null && (c2449M9648 = c5837.m9648()) != null) {
            c3635.m6488(new C1553(C1553.m3304(c3635.f12159, c3635.f12161)));
            if (c3635.f12162 != null || c2449M9648.m4570(c3635.m6485().f5241)) {
                C3346 c3346 = c3635.f12162;
                int iM4572 = c3346 != null ? (int) (c3346.f11197 >> 32) : c2449M9648.m4572(c3635.f12159, false);
                int iM4573 = c2449M9648.m4572(c3635.m6485().f5241, false);
                if (c3635.f12162 == null && iM4572 == iM4573) {
                    return;
                } else {
                    jM6487 = c3635.m6487(c3635.m6479(), c3635.m6485().f5241, false, false, this.f10989, true, new C4255(9));
                }
            } else {
                jM6487 = c3635.m6487(c3635.m6479(), c3635.m6485().f5241, false, false, c3635.f12147.mo4318(c2449M9648.m4572(c3635.f12159, true)) == c3635.f12147.mo4318(c2449M9648.m4572(c3635.m6485().f5241, true)) ? C0373.f1375 : C0373.f1373, true, new C4255(9));
            }
            this.f10990 = new C3346(jM6487);
            if (!C3346.m6112(jM6487, c3635.f12162)) {
                this.f10991 = false;
            }
        }
        c3635.m6482(false);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m6039() {
        C3635 c3635 = this.f10992;
        c3635.m6473(null);
        c3635.m6488(null);
        this.f10989 = C0373.f1375;
        c3635.m6482(true);
        C3346 c3346 = this.f10990;
        boolean zM6107 = C3346.m6107(c3346 != null ? c3346.f11197 : c3635.m6479().f18943);
        c3635.m6474(zM6107 ? EnumC1546.f5229 : EnumC1546.f5231);
        C5837 c5837 = c3635.f12150;
        if (c5837 != null) {
            c5837.f19236.setValue(Boolean.valueOf(!zM6107 && AbstractC2552.m4821(c3635, true)));
        }
        C5837 c5838 = c3635.f12150;
        if (c5838 != null) {
            c5838.f19243.setValue(Boolean.valueOf(!zM6107 && AbstractC2552.m4821(c3635, false)));
        }
        C5837 c5839 = c3635.f12150;
        if (c5839 != null) {
            c5839.f19246.setValue(Boolean.valueOf(zM6107 && AbstractC2552.m4821(c3635, true)));
        }
        if (this.f10991) {
            c3635.m6486(c3635.f12162);
        }
        c3635.f12162 = null;
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2355() {
        m6039();
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2356(long j, C0178 c0178) {
        long j2;
        C2449 c2449M9648;
        C2449 c2449M9649;
        C3635 c3635 = this.f10992;
        if (c3635.m6483() && ((EnumC2925) c3635.f12142.getValue()) == null) {
            c3635.m6473(EnumC2925.f9837);
            c3635.f12139 = -1;
            this.f10991 = true;
            this.f10989 = c0178;
            c3635.m6480();
            C5837 c5837 = c3635.f12150;
            if (c5837 == null || (c2449M9649 = c5837.m9648()) == null || !c2449M9649.m4570(j)) {
                j2 = j;
                C5837 c5838 = c3635.f12150;
                if (c5838 != null && (c2449M9648 = c5838.m9648()) != null) {
                    int iMo4318 = c3635.f12147.mo4318(c2449M9648.m4572(j2, true));
                    C5745 c5745M6468 = C3635.m6468(c3635.m6479().f18944, AbstractC2765.m5145(iMo4318, iMo4318));
                    c3635.m6471(false);
                    InterfaceC1922 interfaceC1922 = c3635.f12153;
                    if (interfaceC1922 != null) {
                        ((C1651) interfaceC1922).m3465(0);
                    }
                    c3635.f12138.mo211(c5745M6468);
                    c3635.f12160 = new C3346(c5745M6468.f18943);
                }
                this.f10991 = false;
            } else {
                if (c3635.m6479().f18944.f4307.length() == 0) {
                    return;
                }
                c3635.m6471(false);
                long jM6487 = c3635.m6487(C5745.m9570(c3635.m6479(), null, C3346.f11196, 5), j, true, false, this.f10989, true, new C4255(0));
                j2 = j;
                c3635.f12162 = new C3346(jM6487);
                this.f10990 = new C3346(jM6487);
            }
            c3635.m6474(EnumC1546.f5232);
            c3635.f12159 = j2;
            c3635.m6488(new C1553(j2));
            c3635.f12161 = 0L;
        }
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2352() {
    }

    @Override // p000.InterfaceC1126
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo2354() {
    }
}
