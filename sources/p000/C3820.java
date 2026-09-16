package p000;

/* JADX INFO: renamed from: ۦٌَؚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3820 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f12647;

    /* JADX INFO: renamed from: ۥٖ */
    public int f12648;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ C4153 f12649;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f12650;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ InterfaceC4038 f12651;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3820(InterfaceC4038 interfaceC4038, C4153 c4153, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f12647 = i;
        this.f12651 = interfaceC4038;
        this.f12649 = c4153;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f12647) {
            case 0:
                C3820 c3820 = new C3820(this.f12651, this.f12649, interfaceC0443, 0);
                c3820.f12650 = obj;
                return c3820;
            default:
                C3820 c3821 = new C3820(this.f12651, this.f12649, interfaceC0443, 1);
                c3821.f12650 = obj;
                return c3821;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f12647;
        C2358 c2358 = C2358.f7817;
        C4153 c4153 = this.f12649;
        InterfaceC4038 interfaceC4038 = this.f12651;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f12648;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    C4887 c4887 = new C4887((InterfaceC4643) this.f12650, c4153, null);
                    this.f12648 = 1;
                    return AbstractC2133.m4126(interfaceC4038, c4887, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f12648;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    C1623 c1623 = new C1623((InterfaceC4643) this.f12650, c4153, (InterfaceC0443) null);
                    this.f12648 = 1;
                    return ((C2439) interfaceC4038).m4552(c1623, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i3 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f12647;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C3820) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
