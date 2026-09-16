package p000;

/* JADX INFO: renamed from: ۥۘٙۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2191 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f7269 = 0;

    /* JADX INFO: renamed from: ۥٖ */
    public int f7270;

    /* JADX INFO: renamed from: ۥۖ */
    public final /* synthetic */ InterfaceC4161 f7271;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Object f7272;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0856 f7273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191(C0856 c0856, InterfaceC4161 interfaceC4161, Object obj, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f7273 = c0856;
        this.f7271 = interfaceC4161;
        this.f7272 = obj;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f7269;
        InterfaceC4161 interfaceC4161 = this.f7271;
        C0856 c0856 = this.f7273;
        switch (i) {
            case 0:
                return new C2191(c0856, interfaceC4161, this.f7272, interfaceC0443);
            default:
                C2191 c2191 = new C2191(c0856, interfaceC4161, interfaceC0443);
                c2191.f7272 = obj;
                return c2191;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f7269;
        C2358 c2358 = C2358.f7817;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f7270;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                InterfaceC2609 interfaceC2609 = this.f7273.f3162;
                Object obj2 = this.f7272;
                this.f7270 = 1;
                return interfaceC2609.mo1173(this.f7271, obj2, this) == enumC2282 ? enumC2282 : c2358;
            default:
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f7272;
                int i3 = this.f7270;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C5450 c5450 = new C5450();
                C0856 c0856 = this.f7273;
                InterfaceC4707 interfaceC4707 = c0856.f6687;
                C2281 c2281 = new C2281(c5450, interfaceC4643, c0856, this.f7271, 0);
                this.f7272 = null;
                this.f7270 = 1;
                return interfaceC4707.mo1575(c2281, this) == enumC2282 ? enumC2282 : c2358;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7269;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((C2191) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191(C0856 c0856, InterfaceC4161 interfaceC4161, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f7273 = c0856;
        this.f7271 = interfaceC4161;
    }
}
