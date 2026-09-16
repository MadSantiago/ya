package p000;

import java.util.List;

/* JADX INFO: renamed from: ۥَ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0016 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f3480;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f3481;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ int f3482;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3483;

    public /* synthetic */ C0016(int i, InterfaceC4112 interfaceC4112, Object obj) {
        this.f3483 = 5;
        this.f3480 = interfaceC4112;
        this.f3482 = i;
        this.f3481 = obj;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f3483;
        C2358 c2358 = C2358.f7817;
        int i2 = this.f3482;
        Object obj3 = this.f3481;
        Object obj4 = this.f3480;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC0993.m2130((InterfaceC1291) obj4, (C5277) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC3044.m5651((C1249) obj4, (List) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                ((C0857) obj4).m1816(obj3, (C5362) obj, AbstractC3831.m6835(i2) | 1);
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).intValue();
                C4773.m8137((C3467) obj4, (InterfaceC5731) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                C4773.m8123((C3467[]) obj4, (InterfaceC5731) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC4112 interfaceC4112 = (InterfaceC4112) obj4;
                C5362 c5362 = (C5362) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!c5362.m9011(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c5362.m8982();
                } else {
                    interfaceC4112.mo5822(i2, obj3, c5362, 0);
                }
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                ((C5440) obj4).mo5822(i2, obj3, (C5362) obj, AbstractC3831.m6835(1));
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                ((C3144) obj4).mo5822(i2, obj3, (C5362) obj, AbstractC3831.m6835(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4225.m7493((InterfaceC1291) obj4, (C3557) obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((C0777) obj4).m1676(obj3, (C5362) obj, AbstractC3831.m6835(i2 | 1));
                break;
        }
        return c2358;
    }

    public /* synthetic */ C0016(int i, int i2, Object obj, Object obj2) {
        this.f3483 = i2;
        this.f3480 = obj;
        this.f3481 = obj2;
        this.f3482 = i;
    }

    public /* synthetic */ C0016(InterfaceC4112 interfaceC4112, int i, Object obj, int i2, int i3) {
        this.f3483 = i3;
        this.f3480 = interfaceC4112;
        this.f3482 = i;
        this.f3481 = obj;
    }
}
