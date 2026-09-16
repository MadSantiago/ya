package p000;

/* JADX INFO: renamed from: ۥؙّؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0700 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f2541;

    /* JADX INFO: renamed from: ۥٖ */
    public int f2542;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ Object f2543;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f2544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0700(Object obj, int i, InterfaceC0443 interfaceC0443, int i2) {
        super(2, interfaceC0443);
        this.f2541 = i2;
        this.f2543 = obj;
        this.f2544 = i;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f2541;
        int i2 = this.f2544;
        Object obj2 = this.f2543;
        switch (i) {
            case 0:
                return new C0700((C2384) obj2, i2, interfaceC0443, 0);
            case 1:
                return new C0700((C2384) obj2, i2, interfaceC0443, 1);
            default:
                return new C0700((C4891) obj2, i2, interfaceC0443, 2);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f2541;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f2544;
        Object obj2 = this.f2543;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i3 = this.f2542;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f2542 = 1;
                    return ((C2384) obj2).m1393(i2, AbstractC4489.m7811(0.0f, 0.0f, null, 7), this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i3 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C0178.m389(new C4441(new long[]{-5853324049235089220L, 4263145468494009388L, 3305213173761435459L, -2756869910066059527L, 1896792491539837142L, 8447089567267240833L, 8814851031477582008L}));
                return null;
            case 1:
                C2384 c2384 = (C2384) obj2;
                int i4 = this.f2542;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    this.f2542 = 1;
                    if (c2384.m1404(this) == enumC2282) {
                        return enumC2282;
                    }
                } else {
                    if (i4 != 1) {
                        C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC0186.m409(obj);
                }
                c2384.m1396(c2384.m1403(i2), 0.0f, true);
                return c2358;
            default:
                int i5 = this.f2542;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    InterfaceC5635 interfaceC5635 = ((C4891) obj2).f16111;
                    this.f2542 = 1;
                    return interfaceC5635.mo7880(i2, this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i5 == 1) {
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
        int i = this.f2541;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                return ((C0700) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
            case 1:
                return ((C0700) mo217((InterfaceC0443) obj2, (InterfaceC1437) obj)).mo218(c2358);
            default:
                return ((C0700) mo217((InterfaceC0443) obj2, (InterfaceC4643) obj)).mo218(c2358);
        }
    }
}
