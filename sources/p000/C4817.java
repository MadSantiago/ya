package p000;

/* JADX INFO: renamed from: ۦُٞؗٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4817 implements InterfaceC0884 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0857 f15879;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3375 f15878 = new C3375();

    /* JADX INFO: renamed from: ۥؗ */
    public final C4852 f15877 = AbstractC2774.m5183(null);

    public C4817(C0857 c0857) {
        this.f15879 = c0857;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8193(final InterfaceC4448 interfaceC4448, C5362 c5362, final int i) {
        final InterfaceC4448 interfaceC4449;
        C5362 c5363;
        c5362.m8979(723898654);
        int i2 = (c5362.m8963(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            C0843 c0843 = (C0843) this.f15877.getValue();
            if (c0843 == null) {
                C5863 c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731(this, interfaceC4448, i, i3) { // from class: ۦٌ۠ؒۖ

                        /* JADX INFO: renamed from: ۥْ */
                        public final /* synthetic */ InterfaceC4448 f17797;

                        /* JADX INFO: renamed from: ۦ۟ */
                        public final /* synthetic */ C4817 f17798;

                        /* JADX INFO: renamed from: ۦۨ */
                        public final /* synthetic */ int f17799;

                        {
                            this.f17799 = i3;
                            this.f17798 = this;
                        }

                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj, Object obj2) {
                            int i5 = this.f17799;
                            C2358 c2358 = C2358.f7817;
                            InterfaceC4448 interfaceC44410 = this.f17797;
                            C4817 c4817 = this.f17798;
                            C5362 c5364 = (C5362) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c4817.m8193(interfaceC44410, c5364, AbstractC3831.m6835(7));
                                    break;
                                default:
                                    c4817.m8193(interfaceC44410, c5364, AbstractC3831.m6835(7));
                                    break;
                            }
                            return c2358;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC4449 = interfaceC4448;
            c5363 = c5362;
            this.f15879.mo1670(c0843, c0843.f3012, interfaceC4449, c5363, 384);
        } else {
            interfaceC4449 = interfaceC4448;
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8966 = c5363.m8965();
        if (c5863M8966 != null) {
            c5863M8966.f19365 = new InterfaceC5731(this, interfaceC4449, i, i4) { // from class: ۦٌ۠ؒۖ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC4448 f17797;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ C4817 f17798;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ int f17799;

                {
                    this.f17799 = i4;
                    this.f17798 = this;
                }

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    int i5 = this.f17799;
                    C2358 c2358 = C2358.f7817;
                    InterfaceC4448 interfaceC44410 = this.f17797;
                    C4817 c4817 = this.f17798;
                    C5362 c5364 = (C5362) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c4817.m8193(interfaceC44410, c5364, AbstractC3831.m6835(7));
                            break;
                        default:
                            c4817.m8193(interfaceC44410, c5364, AbstractC3831.m6835(7));
                            break;
                    }
                    return c2358;
                }
            };
        }
    }

    @Override // p000.InterfaceC0884
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo1878(InterfaceC3320 interfaceC3320, AbstractC2426 abstractC2426) {
        InterfaceC0443 interfaceC0443 = null;
        Object objM7173 = AbstractC4009.m7173(new C4522(EnumC4386.f14455, this.f15878, new C4117(this, new C0843(interfaceC3320), interfaceC0443, 2), interfaceC0443, 3), abstractC2426);
        return objM7173 == EnumC2282.f7590 ? objM7173 : C2358.f7817;
    }
}
