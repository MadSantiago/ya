package p000;

/* JADX INFO: renamed from: ۥٍؑؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0192 extends AbstractC2426 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f710;

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ C3821 f711;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0192(C3821 c3821, InterfaceC0443 interfaceC0443, int i) {
        super(2, interfaceC0443);
        this.f710 = i;
        this.f711 = c3821;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٓ */
    public final InterfaceC0443 mo217(InterfaceC0443 interfaceC0443, Object obj) {
        int i = this.f710;
        C3821 c3821 = this.f711;
        switch (i) {
            case 0:
                return new C0192(c3821, interfaceC0443, 0);
            case 1:
                return new C0192(c3821, interfaceC0443, 1);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0192(c3821, interfaceC0443, 2);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0192(c3821, interfaceC0443, 3);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C0192(c3821, interfaceC0443, 4);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C0192(c3821, interfaceC0443, 5);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0192(c3821, interfaceC0443, 6);
            default:
                return new C0192(c3821, interfaceC0443, 7);
        }
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f710;
        C2358 c2358 = C2358.f7817;
        C3821 c3821 = this.f711;
        switch (i) {
            case 0:
                AbstractC0186.m409(obj);
                c3821.m6818();
                break;
            case 1:
                AbstractC0186.m409(obj);
                c3821.m6815();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AbstractC0186.m409(obj);
                c3821.m6815();
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0186.m409(obj);
                c3821.m6818();
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0186.m409(obj);
                c3821.m6815();
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0186.m409(obj);
                c3821.m6815();
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0186.m409(obj);
                c3821.m6818();
                break;
            default:
                AbstractC0186.m409(obj);
                c3821.m6815();
                break;
        }
        return c2358;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f710;
        C2358 c2358 = C2358.f7817;
        InterfaceC4643 interfaceC4643 = (InterfaceC4643) obj;
        InterfaceC0443 interfaceC0443 = (InterfaceC0443) obj2;
        switch (i) {
            case 0:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case 1:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
            default:
                ((C0192) mo217(interfaceC0443, interfaceC4643)).mo218(c2358);
                break;
        }
        return c2358;
    }
}
