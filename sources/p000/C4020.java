package p000;

/* JADX INFO: renamed from: ۦّؓۜؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4020 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f13405;

    /* JADX INFO: renamed from: ۥٖ */
    public int f13406;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C2677 f13407;

    /* JADX INFO: renamed from: ۦۛ */
    public /* synthetic */ long f13408;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4020(C2677 c2677, long j, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f13405 = i;
        this.f13407 = c2677;
        this.f13408 = j;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        switch (this.f13405) {
            case 0:
                return new C4020(this.f13407, this.f13408, interfaceC0443, 0);
            case 1:
                return new C4020(this.f13407, this.f13408, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4020(this.f13407, this.f13408, interfaceC0443, 2);
            default:
                C4020 c4020 = new C4020(this.f13407, interfaceC0443);
                c4020.f13408 = ((C1553) obj).f5241;
                return c4020;
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f13405;
        C2358 c2358 = C2358.f7817;
        C2677 c2677 = this.f13407;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f13406;
                if (i2 != 0) {
                    if (i2 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4545 c4545 = c2677.f8879;
                C1404 c1404 = new C1404(this.f13408, null);
                this.f13406 = 1;
                return c4545.m7868(EnumC4386.f14454, c1404, this) == enumC2282 ? enumC2282 : c2358;
            case 1:
                int i3 = this.f13406;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4545 c4546 = c2677.f8879;
                long j = this.f13408;
                this.f13406 = 1;
                return c4546.m7869(j, false, this) == enumC2282 ? enumC2282 : c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.f13406;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC0186.m409(obj);
                        return c2358;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                C4545 c4547 = c2677.f8879;
                long j2 = this.f13408;
                this.f13406 = 1;
                return c4547.m7869(j2, true, this) == enumC2282 ? enumC2282 : c2358;
            default:
                int i5 = this.f13406;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC0186.m409(obj);
                        return obj;
                    }
                    C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC0186.m409(obj);
                long j3 = this.f13408;
                C4545 c4548 = c2677.f8879;
                this.f13406 = 1;
                Object objM5514 = AbstractC2927.m5514(c4548, j3, this);
                return objM5514 == enumC2282 ? enumC2282 : objM5514;
        }
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f13405;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C4020) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C4020) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C4020) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            default:
                long j = ((C1553) obj).f5241;
                C4020 c4020 = new C4020(this.f13407, (InterfaceC0443) obj2);
                c4020.f13408 = j;
                return c4020.mo218(c2358);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4020(C2677 c2677, InterfaceC0443 interfaceC0443) {
        super(2, interfaceC0443);
        this.f13405 = 3;
        this.f13407 = c2677;
    }
}
