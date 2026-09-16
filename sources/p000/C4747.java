package p000;

/* JADX INFO: renamed from: ۦٝؕؖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4747 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public int f15675;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3635 f15676;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ boolean f15677;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4747(C3635 c3635, boolean z, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f15676 = c3635;
        this.f15677 = z;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        return new C4747(this.f15676, this.f15677, interfaceC0443);
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        InterfaceC1625 interfaceC1625;
        int i = this.f15675;
        C1249 c1249M8119 = null;
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
        C3635 c3635 = this.f15676;
        if (!C3346.m6107(c3635.m6479().f18943)) {
            c1249M8119 = C4773.m8119(c3635.m6479());
            if (this.f15677) {
                int iM6108 = C3346.m6108(c3635.m6479().f18943);
                c3635.f12138.mo211(C3635.m6468(c3635.m6479().f18944, AbstractC2765.m5145(iM6108, iM6108)));
                c3635.m6474(EnumC1546.f5232);
            }
        }
        if (c1249M8119 != null && (interfaceC1625 = c3635.f12158) != null) {
            C4235 c4235M7771 = AbstractC4489.m7771(c1249M8119);
            this.f15675 = 1;
            ((C2471) interfaceC1625).m4634(c4235M7771);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (c2358 == enumC2282) {
                return enumC2282;
            }
        }
        return c2358;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        return ((C4747) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(C2358.f7817);
    }
}
