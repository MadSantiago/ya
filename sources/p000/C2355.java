package p000;

/* JADX INFO: renamed from: ۥۛۘٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2355 extends AbstractC1311 {

    /* JADX INFO: renamed from: ۦٝ */
    public static final C0376 f7808;

    /* JADX INFO: renamed from: ۥۢ */
    public InterfaceC4933 f7809;

    /* JADX INFO: renamed from: ۦ */
    public C4015 f7810;

    static {
        C0376 c0376M2131 = AbstractC0993.m2131();
        int i = C1327.f4593;
        c0376M2131.m818(C1327.f4589);
        c0376M2131.m814(1.0f);
        c0376M2131.m819(1);
        f7808 = c0376M2131;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2355(C0605 c0605, InterfaceC4933 interfaceC4933) {
        super(c0605);
        this.f7809 = interfaceC4933;
        this.f7810 = c0605.f2271 != null ? new C4015(this) : null;
        if ((((AbstractC5381) interfaceC4933).f17791.f17781 & 512) == 0) {
            return;
        }
        C0178.m382();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥؖؗۥٟ, reason: contains not printable characters */
    public final void m9799(InterfaceC4933 interfaceC4933) {
        if (interfaceC4933.equals(this.f7809) || (((AbstractC5381) interfaceC4933).f17791.f17781 & 512) == 0) {
            this.f7809 = interfaceC4933;
        } else {
            C0178.m382();
        }
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥؙ */
    public final int mo3596(int i) {
        return this.f7809.mo1554(this, this.f4530, i);
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0275 mo3597(long j) {
        m573(j);
        m9780(this.f7809.mo931(this, this.f4530, j));
        m9782();
        return this;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3598(int i) {
        return this.f7809.mo1557(this, this.f4530, i);
    }

    @Override // p000.AbstractC3625
    /* JADX INFO: renamed from: ۥٚ */
    public final int mo4290(AbstractC4642 abstractC4642) {
        C4015 c4015 = this.f7810;
        if (c4015 == null) {
            return C3133.m5782(this, abstractC4642);
        }
        C1254 c1254 = c4015.f6747;
        int iM2654 = c1254.m2654(abstractC4642);
        if (iM2654 >= 0) {
            return c1254.f4315[iM2654];
        }
        return Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۥٜ */
    public final void mo2786() {
        if (this.f7810 == null) {
            this.f7810 = new C4015(this);
        }
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۥٟ */
    public final AbstractC5381 mo2787() {
        return ((AbstractC5381) this.f7809).f17791;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo3599(int i) {
        return this.f7809.mo1556(this, this.f4530, i);
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۦؕ */
    public final AbstractC2045 mo2793() {
        return this.f7810;
    }

    @Override // p000.AbstractC1311
    /* JADX INFO: renamed from: ۦُؑۛۖ */
    public final void mo9787(InterfaceC3212 interfaceC3212, C4893 c4893) {
        AbstractC1311 abstractC1311;
        this.f4530.m2801(interfaceC3212, c4893);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this.f4513)).getShowLayoutBounds() || (abstractC1311 = this.f4530) == null) {
            return;
        }
        if (C4207.m7431(this.f982, abstractC1311.f982) && C0873.m1863(abstractC1311.f4531, 0L)) {
            return;
        }
        long j = this.f982;
        interfaceC3212.mo2098(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f7808);
    }

    @Override // p000.AbstractC0275
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo571(long j, float f, InterfaceC4745 interfaceC4745) {
        m9791(j, f, interfaceC4745);
        if (this.f12095) {
            return;
        }
        m9785();
        AbstractC1311 abstractC1311 = this.f4530;
        abstractC1311.f12092 = this.f12092;
        mo2789().mo620();
        abstractC1311.f12092 = false;
    }

    @Override // p000.InterfaceC1827
    /* JADX INFO: renamed from: ۦۣ */
    public final int mo3600(int i) {
        return this.f7809.mo1555(this, this.f4530, i);
    }
}
