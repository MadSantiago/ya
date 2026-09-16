package p000;

/* JADX INFO: renamed from: ۥۖؔۦۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2068 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f6831;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2068 f6819 = new C2068(0);

    /* JADX INFO: renamed from: ۥؗ */
    public static final C2068 f6816 = new C2068(1);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C2068 f6821 = new C2068(2);

    /* JADX INFO: renamed from: ۥُ */
    public static final C2068 f6817 = new C2068(3);

    /* JADX INFO: renamed from: ۥّ */
    public static final C2068 f6818 = new C2068(4);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C2068 f6827 = new C2068(5);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2068 f6820 = new C2068(6);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C2068 f6825 = new C2068(7);

    /* JADX INFO: renamed from: ۦِ */
    public static final C2068 f6824 = new C2068(8);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C2068 f6826 = new C2068(9);

    /* JADX INFO: renamed from: ۦؚ */
    public static final C2068 f6822 = new C2068(10);

    /* JADX INFO: renamed from: ۦٌ */
    public static final C2068 f6823 = new C2068(11);

    /* JADX INFO: renamed from: ۦۚ */
    public static final C2068 f6828 = new C2068(12);

    /* JADX INFO: renamed from: ۦۨ */
    public static final C2068 f6830 = new C2068(13);

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C2068 f6829 = new C2068(14);

    public /* synthetic */ C2068(int i) {
        this.f6831 = i;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m4013(int i) {
        switch (this.f6831) {
            case 0:
                return EnumC0885.m1879(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                switch (i) {
                    case 0:
                    case 1:
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        return true;
                    default:
                        return false;
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return i == 0 || i == 1 || i == 2;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return AbstractC5378.m9046(i) != 0;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return i == 0 || i == 1 || i == 2;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 8:
                return i == 0 || i == 1 || i == 2;
            case 9:
                return i == 0 || i == 1;
            case 10:
                return i == 1 || i == 2;
            case 11:
                return AbstractC2049.m3996(i) != 0;
            case 12:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 13:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
