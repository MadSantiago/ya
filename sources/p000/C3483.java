package p000;

/* JADX INFO: renamed from: ۦؘؓۡۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3483 extends AbstractC1127 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ InterfaceC0705 f11562;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ InterfaceC5731 f11563;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f11564;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3483(InterfaceC0705 interfaceC0705, InterfaceC5731 interfaceC5731, int i, int i2) {
        super(2);
        this.f11564 = i2;
        this.f11562 = interfaceC0705;
        this.f11563 = interfaceC5731;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f11564;
        C2358 c2358 = C2358.f7817;
        InterfaceC5731 interfaceC5731 = this.f11563;
        InterfaceC0705 interfaceC0705 = this.f11562;
        C5362 c5362 = (C5362) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC0186.m422(interfaceC0705, interfaceC5731, c5362, AbstractC3831.m6835(1));
                break;
            default:
                AbstractC0186.m428(interfaceC0705, interfaceC5731, c5362, AbstractC3831.m6835(1));
                break;
        }
        return c2358;
    }
}
