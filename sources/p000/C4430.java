package p000;

/* JADX INFO: renamed from: ۦَؘ٘ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4430 extends AbstractC2426 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f14600;

    /* JADX INFO: renamed from: ۥٖ */
    public int f14601;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ Object f14602;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f14603;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ Object f14604;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4430(Object obj, Object obj2, Object obj3, InterfaceC0443 interfaceC0443, int i) {
        super(1, interfaceC0443);
        this.f14600 = i;
        this.f14603 = obj;
        this.f14604 = obj2;
        this.f14602 = obj3;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f14600;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        Object obj2 = this.f14603;
        Object obj3 = this.f14604;
        Object obj4 = this.f14602;
        InterfaceC0443 interfaceC0443 = null;
        switch (i) {
            case 0:
                C4536 c4536 = (C4536) obj2;
                int i2 = this.f14601;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                c4536.m7860(obj3);
                C1907 c1907 = new C1907(c4536, 3);
                C0061 c0061 = new C0061((InterfaceC3275) obj4, c4536, interfaceC0443, 4);
                this.f14601 = 1;
                return C3133.m5777(c1907, c0061, this) == enumC2282 ? enumC2282 : c2358;
            default:
                EnumC4386 enumC4386 = (EnumC4386) obj4;
                C4846 c4846 = (C4846) obj3;
                C4153 c4153 = (C4153) obj2;
                int i3 = this.f14601;
                EnumC4386 enumC4387 = EnumC4386.f14452;
                try {
                    if (i3 == 0) {
                        AbstractC0186.m409(obj);
                        C2718 c2718 = new C2718(c4846, interfaceC0443, 20);
                        this.f14601 = 2;
                        if (AbstractC2776.m5213(new RunnableC1491(1500L, this), c2718) == enumC2282) {
                            return enumC2282;
                        }
                    } else {
                        if (i3 != 1 && i3 != 2) {
                            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC0186.m409(obj);
                    }
                    if (enumC4386 == enumC4387) {
                        return c2358;
                    }
                    c4153.m7348();
                    return c2358;
                } catch (Throwable th) {
                    if (enumC4386 != enumC4387) {
                        c4153.m7348();
                    }
                    throw th;
                }
        }
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f14600;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f14602;
        Object obj3 = this.f14603;
        switch (i) {
            case 0:
                InterfaceC3275 interfaceC3275 = (InterfaceC3275) obj2;
                return new C4430((C4536) obj3, this.f14604, interfaceC3275, (InterfaceC0443) obj, 0).mo218(c2358);
            default:
                return new C4430((C4153) obj3, (C4846) this.f14604, (EnumC4386) obj2, (InterfaceC0443) obj, 1).mo218(c2358);
        }
    }
}
