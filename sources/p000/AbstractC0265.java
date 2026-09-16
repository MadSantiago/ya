package p000;

/* JADX INFO: renamed from: ۥؒؕۥۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0265 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C4216 f964 = new C4216(1, new C2971(7));

    /* JADX INFO: renamed from: ۥۗ */
    public static C1633 m545(C1633 c1633) {
        C4107 c4107 = AbstractC2325.f7698;
        return C1633.m3439(c1633, null, null, c4107, c4107, 3);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final InterfaceC2864 m546(int i, C5362 c5362) {
        C1831 c1831 = (C1831) c5362.m8997(f964);
        switch (AbstractC3761.m6632(i)) {
            case 0:
                return c1831.f6085;
            case 1:
                return c1831.f6082;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return c1831.f6088;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return m545(c1831.f6082);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return c1831.f6086;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return m545(c1831.f6086);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0520.f1849;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return c1831.f6087;
            case 8:
                C1633 c1633 = c1831.f6087;
                C4107 c4107 = AbstractC2325.f7698;
                return C1633.m3439(c1633, c4107, null, null, c4107, 6);
            case 9:
                return c1831.f6083;
            case 10:
                C1633 c1634 = c1831.f6087;
                C4107 c4108 = AbstractC2325.f7698;
                return C1633.m3439(c1634, null, c4108, c4108, null, 9);
            case 11:
                return m545(c1831.f6087);
            case 12:
                return c1831.f6081;
            case 13:
                return AbstractC2552.f8518;
            case 14:
                return c1831.f6084;
            default:
                C1078.m2275();
                return null;
        }
    }
}
