package p000;

/* JADX INFO: renamed from: ۥٟ٘ؗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1612 extends AbstractC5381 implements InterfaceC2766 {

    /* JADX INFO: renamed from: ۥً */
    public C2243 f5412;

    /* JADX INFO: renamed from: ۦٚ */
    public C0266 f5413;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥؑ */
    public final Object m3379(AbstractC0772 abstractC0772) throws Throwable {
        C5297 c5297;
        C0266 c0266;
        if (abstractC0772 instanceof C5297) {
            c5297 = (C5297) abstractC0772;
            int i = c5297.f17447;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5297.f17447 = i - Integer.MIN_VALUE;
            } else {
                c5297 = new C5297(this, abstractC0772);
            }
        } else {
            c5297 = new C5297(this, abstractC0772);
        }
        Object obj = c5297.f17444;
        int i2 = c5297.f17447;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            if (this.f5413 == null) {
                C0266 c0267 = new C0266();
                C2243 c2243 = this.f5412;
                c5297.f17445 = c0267;
                c5297.f17447 = 1;
                Object objM4292 = c2243.m4292(c0267, c5297);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM4292 == enumC2282) {
                    return enumC2282;
                }
                c0266 = c0267;
            }
            return C2358.f7817;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c0266 = c5297.f17445;
        AbstractC0186.m409(obj);
        this.f5413 = c0266;
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final void m3380() {
        C0266 c0266 = this.f5413;
        if (c0266 != null) {
            this.f5412.m4291(new C5116(c0266));
            this.f5413 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥٜ */
    public final Object m3381(AbstractC0772 abstractC0772) throws Throwable {
        C5584 c5584;
        if (abstractC0772 instanceof C5584) {
            c5584 = (C5584) abstractC0772;
            int i = c5584.f18416;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5584.f18416 = i - Integer.MIN_VALUE;
            } else {
                c5584 = new C5584(this, abstractC0772);
            }
        } else {
            c5584 = new C5584(this, abstractC0772);
        }
        Object obj = c5584.f18415;
        int i2 = c5584.f18416;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            C0266 c0266 = this.f5413;
            if (c0266 != null) {
                C5116 c5116 = new C5116(c0266);
                C2243 c2243 = this.f5412;
                c5584.f18416 = 1;
                Object objM4292 = c2243.m4292(c5116, c5584);
                EnumC2282 enumC2282 = EnumC2282.f7590;
                if (objM4292 == enumC2282) {
                    return enumC2282;
                }
            }
            return C2358.f7817;
        }
        if (i2 != 1) {
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        this.f5413 = null;
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        m3380();
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        if (enumC3834 == EnumC3834.f12724) {
            int i = c5639.f18581;
            int i2 = 0;
            InterfaceC0443 interfaceC0443 = null;
            if (i == 4) {
                AbstractC2765.m5135(m9076(), null, 0, new C2501(this, interfaceC0443, i2), 3);
            } else if (i == 5) {
                AbstractC2765.m5135(m9076(), null, 0, new C2501(this, interfaceC0443, 1), 3);
            }
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        m3380();
    }
}
