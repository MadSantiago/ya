package p000;

/* JADX INFO: renamed from: ۦؘٕۣؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4245 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f14068;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC0705 f14069;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f14070;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ InterfaceC0400 f14071;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f14072;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4245(Object obj, InterfaceC0705 interfaceC0705, InterfaceC0400 interfaceC0400, int i, int i2) {
        super(2);
        this.f14072 = i2;
        this.f14068 = obj;
        this.f14069 = interfaceC0705;
        this.f14071 = interfaceC0400;
        this.f14070 = i;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f14072;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f14070;
        InterfaceC0400 interfaceC0400 = this.f14071;
        InterfaceC0705 interfaceC0705 = this.f14069;
        Object obj3 = this.f14068;
        C5362 c5362 = (C5362) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC4489.m7789((InterfaceC4745) obj3, interfaceC0705, (InterfaceC4745) interfaceC0400, c5362, AbstractC3831.m6835(i2 | 1));
                break;
            default:
                AbstractC0186.m414((C4319) obj3, interfaceC0705, (InterfaceC5731) interfaceC0400, c5362, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }
}
