package p000;

/* JADX INFO: renamed from: ۥًَؘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1019 implements InterfaceC5296 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f3606;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f3607;

    public /* synthetic */ C1019(int i, Object obj) {
        this.f3607 = i;
        this.f3606 = obj;
    }

    @Override // p000.InterfaceC5296
    public final InterfaceFutureC4378 apply(Object obj) {
        int i = this.f3607;
        Object obj2 = this.f3606;
        switch (i) {
            case 0:
                C3001 c3001 = (C3001) obj2;
                int i2 = ((C3849) obj).f12867;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !c3001.f10100.m9131()) {
                    c3001.m5591();
                }
                return C4286.f14174;
            case 1:
                C5460 c5460 = (C5460) obj2;
                CallableC4308 callableC4308 = new CallableC4308(c5460, (C0268) obj);
                ScheduledExecutorServiceC3499 scheduledExecutorServiceC3499M2177 = ((C0996) c5460.f18001).m2177();
                RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595(callableC4308);
                scheduledExecutorServiceC3499M2177.execute(runnableFutureC1595);
                return runnableFutureC1595;
            default:
                return AbstractC2552.m4791((InterfaceFutureC4378) ((C3882) obj2).f12975.get());
        }
    }
}
