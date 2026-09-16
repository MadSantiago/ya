package p000;

/* JADX INFO: renamed from: ۦۥؒۖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5697 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f18751;

    /* JADX INFO: renamed from: ۥٖ */
    public int f18752;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ C1705 f18753;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5697(C1705 c1705, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f18751 = i;
        this.f18753 = c1705;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f18751;
        C1705 c1705 = this.f18753;
        switch (i) {
            case 0:
                return new C5697(c1705, interfaceC0443, 0);
            case 1:
                return new C5697(c1705, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C5697(c1705, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C5697(c1705, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C5697(c1705, interfaceC0443, 4);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C5697(c1705, interfaceC0443, 5);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C5697(c1705, interfaceC0443, 6);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C5697(c1705, interfaceC0443, 7);
            case 8:
                return new C5697(c1705, interfaceC0443, 8);
            case 9:
                return new C5697(c1705, interfaceC0443, 9);
            default:
                return new C5697(c1705, interfaceC0443, 10);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f18751;
        C2358 c2358 = C2358.f7817;
        C1705 c1705 = this.f18753;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        switch (i) {
            case 0:
                int i2 = this.f18752;
                if (i2 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i2 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C0178.m389(new C4441(new long[]{5004227363463228008L, -2426276298412468367L, -2961428731317772719L, 2866956150621111439L, -1952698614929190340L, 3566051362179839430L, -3488576825122585230L}));
                return null;
            case 1:
                int i3 = this.f18752;
                if (i3 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i3 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C0178.m389(new C4441(new long[]{1334935891664345452L, -250525089500711419L, -5792946925983768481L, -2835697227331195980L, 8557861075854110920L, 6332713423209113342L, -1991039026292200205L}));
                return null;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.f18752;
                if (i4 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i4 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C0178.m389(new C4441(new long[]{6898321453002930945L, 7662378622110682975L, -998809094292941589L, 6280279630917095370L, -5820970256412864560L, -6256981372644423353L, -7084209237158536480L}));
                return null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = this.f18752;
                if (i5 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3522(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i5 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                int i6 = this.f18752;
                if (i6 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i6 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                int i7 = this.f18752;
                if (i7 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3523(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i7 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                int i8 = this.f18752;
                if (i8 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3521(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i8 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                int i9 = this.f18752;
                if (i9 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3524(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i9 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                int i10 = this.f18752;
                if (i10 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3523(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i10 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                int i11 = this.f18752;
                if (i11 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3524(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i11 == 1) {
                    AbstractC0186.m409(obj);
                    return c2358;
                }
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i12 = this.f18752;
                if (i12 == 0) {
                    AbstractC0186.m409(obj);
                    this.f18752 = 1;
                    return c1705.m3522(this) == enumC2282 ? enumC2282 : c2358;
                }
                if (i12 == 1) {
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
        int i = this.f18751;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return ((C5697) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
    }
}
