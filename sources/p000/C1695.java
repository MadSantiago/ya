package p000;

/* JADX INFO: renamed from: ۥِٙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1695 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f5654;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ Object f5655;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ float f5656;

    /* JADX INFO: renamed from: ۦٕ */
    public final /* synthetic */ InterfaceC3347 f5657;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ AbstractC0631 f5658;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f5659;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1695(AbstractC0631 abstractC0631, int i, float f, InterfaceC3347 interfaceC3347, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f5658 = abstractC0631;
        this.f5659 = i;
        this.f5656 = f;
        this.f5657 = interfaceC3347;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        C1695 c1695 = new C1695(this.f5658, this.f5659, this.f5656, this.f5657, interfaceC0443);
        c1695.f5655 = obj;
        return c1695;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f5654;
        C2358 c2358 = C2358.f7817;
        if (i != 0) {
            if (i == 1) {
                AbstractC0186.m409(obj);
                return c2358;
            }
            C1078.m2276("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC0186.m409(obj);
        InterfaceC1437 interfaceC1437 = (InterfaceC1437) this.f5655;
        AbstractC0631 abstractC0631 = this.f5658;
        C2889 c2889 = new C2889(interfaceC1437, abstractC0631);
        this.f5654 = 1;
        C3843 c3843 = AbstractC0630.f2331;
        int i2 = this.f5659;
        abstractC0631.f2339.m359(abstractC0631.m1403(new Integer(i2).intValue()));
        boolean z = i2 > abstractC0631.f2337;
        int i3 = (((C3000) AbstractC0973.m2040(abstractC0631.m1402().f7492)).f10086 - abstractC0631.f2337) + 1;
        if (((z && i2 > ((C3000) AbstractC0973.m2040(abstractC0631.m1402().f7492)).f10086) || (!z && i2 < abstractC0631.f2337)) && Math.abs(i2 - abstractC0631.f2337) >= 3) {
            int i4 = abstractC0631.f2337;
            if (z) {
                int i5 = i2 - i3;
                if (i5 >= i4) {
                    i4 = i5;
                }
            } else {
                int i6 = i3 + i2;
                if (i6 <= i4) {
                    i4 = i6;
                }
            }
            float fM1407 = abstractC0631.m1407();
            abstractC0631.m1396(i4, fM1407 == 0.0f ? 0.0f : 0.0f / fM1407, true);
        }
        Object objM6863 = AbstractC3831.m6863(0.0f, ((int) (AbstractC4554.m7941(C4773.m8128(abstractC0631) + ((long) AbstractC2776.m5235(((abstractC0631.m1407() * (i2 - abstractC0631.m1405())) - (abstractC0631.m1401() * abstractC0631.m1407())) + 0.0f)), abstractC0631.f2346, abstractC0631.f2358) - C4773.m8128(abstractC0631))) + this.f5656, 0.0f, this.f5657, new C4762(13, new C1916(), c2889), this);
        EnumC2282 enumC2282 = EnumC2282.f7590;
        if (objM6863 != enumC2282) {
            objM6863 = c2358;
        }
        return objM6863 == enumC2282 ? enumC2282 : c2358;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C1695) mo217((InterfaceC0443) obj2, (InterfaceC1437) obj)).mo218(C2358.f7817);
    }
}
