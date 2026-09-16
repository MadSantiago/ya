package p000;

/* JADX INFO: renamed from: ۥٍؙؑٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0699 extends AbstractC5381 implements InterfaceC4933, InterfaceC5671 {

    /* JADX INFO: renamed from: ۥً */
    public C3945 f2539;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f2540;

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥً */
    public final int mo1554(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!this.f2540) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1827.mo3596(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5370 mo931(InterfaceC2427 interfaceC2427, InterfaceC1827 interfaceC1827, long j) {
        AbstractC2552.m4798(j, this.f2540 ? EnumC1616.f5425 : EnumC1616.f5424);
        AbstractC0275 abstractC0275Mo3597 = interfaceC1827.mo3597(C3693.m6550(j, 0, this.f2540 ? C3693.m6556(j) : Integer.MAX_VALUE, 0, this.f2540 ? Integer.MAX_VALUE : C3693.m6551(j), 5));
        int i = abstractC0275Mo3597.f985;
        int iM6556 = C3693.m6556(j);
        if (i > iM6556) {
            i = iM6556;
        }
        int i2 = abstractC0275Mo3597.f984;
        int iM6551 = C3693.m6551(j);
        if (i2 > iM6551) {
            i2 = iM6551;
        }
        int i3 = abstractC0275Mo3597.f984 - i2;
        int i4 = abstractC0275Mo3597.f985 - i;
        if (!this.f2540) {
            i3 = i4;
        }
        C3945 c3945 = this.f2539;
        C0169 c0169 = c3945.f13172;
        C0169 c01610 = c3945.f13176;
        c0169.m359(i3);
        AbstractC3191 abstractC3191M7473 = AbstractC4225.m7473();
        InterfaceC4745 interfaceC4745Mo4945 = abstractC3191M7473 != null ? abstractC3191M7473.mo4945() : null;
        AbstractC3191 abstractC3191M7452 = AbstractC4225.m7452(abstractC3191M7473);
        try {
            if (c01610.m360() > i3) {
                c01610.m359(i3);
            }
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            this.f2539.f13174.m359(this.f2540 ? i2 : i);
            this.f2539.f13171.m359(this.f2540 ? abstractC0275Mo3597.f984 : abstractC0275Mo3597.f985);
            return interfaceC2427.mo755(i, i2, C0204.f751, new C5153(i3, 1, this, abstractC0275Mo3597));
        } catch (Throwable th) {
            AbstractC4225.m7466(abstractC3191M7473, abstractC3191M7452, interfaceC4745Mo4945);
            throw th;
        }
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۥ۟ */
    public final int mo1555(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (this.f2540) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1827.mo3600(i);
    }

    @Override // p000.InterfaceC5671
    /* JADX INFO: renamed from: ۦٟ */
    public final void mo790(InterfaceC1066 interfaceC1066) {
        AbstractC3992.m7136(interfaceC1066);
        final int i = 0;
        final int i2 = 1;
        C4323 c4323 = new C4323(new InterfaceC4448(this) { // from class: ۦٟۡؓٗ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C0699 f17973;

            {
                this.f17973 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int iM360;
                int i3 = i;
                C0699 c0699 = this.f17973;
                switch (i3) {
                    case 0:
                        iM360 = c0699.f2539.f13176.m360();
                        break;
                    default:
                        iM360 = c0699.f2539.f13172.m360();
                        break;
                }
                return Float.valueOf(iM360);
            }
        }, new InterfaceC4448(this) { // from class: ۦٟۡؓٗ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C0699 f17973;

            {
                this.f17973 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int iM360;
                int i3 = i2;
                C0699 c0699 = this.f17973;
                switch (i3) {
                    case 0:
                        iM360 = c0699.f2539.f13176.m360();
                        break;
                    default:
                        iM360 = c0699.f2539.f13172.m360();
                        break;
                }
                return Float.valueOf(iM360);
            }
        });
        if (this.f2540) {
            C3059 c3059 = AbstractC2771.f9209;
            InterfaceC0504 interfaceC0504 = AbstractC3992.f13322[13];
            interfaceC1066.mo2266(c3059, c4323);
        } else {
            C3059 c30510 = AbstractC2771.f9232;
            InterfaceC0504 interfaceC0505 = AbstractC3992.f13322[12];
            interfaceC1066.mo2266(c30510, c4323);
        }
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo1556(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (this.f2540) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1827.mo3599(i);
    }

    @Override // p000.InterfaceC4933
    /* JADX INFO: renamed from: ۦ۟ */
    public final int mo1557(AbstractC3625 abstractC3625, InterfaceC1827 interfaceC1827, int i) {
        if (!this.f2540) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC1827.mo3598(i);
    }
}
