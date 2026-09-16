package p000;

/* JADX INFO: renamed from: ۦؘۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3521 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C5460 f11660;

    public C3521(EnumC4646 enumC4646, EnumC4646 enumC4647, Object obj) {
        this.f11660 = new C5460(enumC4646, enumC4647, obj, 10);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x015e  */
    /* JADX WARN: Code duplicated, block: B:54:0x016b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x0184  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:60:0x0196  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x020b  */
    /* JADX INFO: renamed from: ۥۗ */
    public static int m6311(C5460 c5460, Object obj, Object obj2) {
        int iM934;
        int iM8426;
        int iM935;
        int i;
        int iM936;
        int iM8427;
        int iM937;
        EnumC4646 enumC4646 = (EnumC4646) c5460.f18001;
        EnumC4646 enumC4647 = (EnumC4646) c5460.f17999;
        int i2 = C1838.f6108;
        int iM938 = 8;
        int iM939 = AbstractC0438.m935(8);
        EnumC4646 enumC4648 = EnumC4646.f15325;
        if (enumC4646 == enumC4648) {
            iM939 += iM939;
        }
        EnumC3135 enumC3135 = EnumC3135.f10563;
        switch (enumC4646.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iM934 = 8;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue >> 31) ^ (iIntValue + iIntValue));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue >> 63) ^ (jLongValue + jLongValue));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iM934 = 4;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                iM934 = AbstractC0438.m934(((Long) obj).longValue());
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                iM934 = AbstractC0438.m934(((Long) obj).longValue());
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                iM934 = AbstractC0438.m934(((Integer) obj).intValue());
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                iM934 = 8;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                iM934 = 4;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                iM934 = 1;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 8:
                if (obj instanceof AbstractC4314) {
                    iM8426 = ((AbstractC4314) obj).mo7605();
                    iM935 = AbstractC0438.m935(iM8426);
                } else {
                    iM8426 = AbstractC5011.m8426((String) obj);
                    iM935 = AbstractC0438.m935(iM8426);
                }
                iM934 = iM8426 + iM935;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iM934 = ((AbstractC5212) ((AbstractC3127) obj)).m8830();
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iM8426 = ((AbstractC5212) ((AbstractC3127) obj)).m8830();
                iM935 = AbstractC0438.m935(iM8426);
                iM934 = iM8426 + iM935;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof AbstractC4314) {
                    iM8426 = ((AbstractC4314) obj).mo7605();
                    iM935 = AbstractC0438.m935(iM8426);
                } else {
                    iM8426 = ((byte[]) obj).length;
                    iM935 = AbstractC0438.m935(iM8426);
                }
                iM934 = iM8426 + iM935;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iM934 = AbstractC0438.m935(((Integer) obj).intValue());
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iM934 = obj instanceof InterfaceC3120 ? AbstractC0438.m934(((InterfaceC3120) obj).mo1880()) : AbstractC0438.m934(((Integer) obj).intValue());
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iM934 = 4;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iM934 = 8;
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iM934 = AbstractC0438.m935((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iM934 = AbstractC0438.m934((jLongValue18 >> 63) ^ (jLongValue18 + jLongValue18));
                i = iM934 + iM939;
                iM936 = AbstractC0438.m935(16);
                if (enumC4647 == enumC4648) {
                    iM936 += iM936;
                }
                switch (enumC4647.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 1:
                        ((Float) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iM938 = AbstractC0438.m934(((Long) obj2).longValue());
                        return iM938 + iM936 + i;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        iM938 = 1;
                        return iM938 + iM936 + i;
                    case 8:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = AbstractC5011.m8426((String) obj2);
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 9:
                        iM938 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        return iM938 + iM936 + i;
                    case 10:
                        iM8427 = ((AbstractC5212) ((AbstractC3127) obj2)).m8830();
                        iM937 = AbstractC0438.m935(iM8427);
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 11:
                        if (obj2 instanceof AbstractC4314) {
                            iM8427 = ((AbstractC4314) obj2).mo7605();
                            iM937 = AbstractC0438.m935(iM8427);
                        } else {
                            iM8427 = ((byte[]) obj2).length;
                            iM937 = AbstractC0438.m935(iM8427);
                        }
                        iM938 = iM937 + iM8427;
                        return iM938 + iM936 + i;
                    case 12:
                        iM938 = AbstractC0438.m935(((Integer) obj2).intValue());
                        return iM938 + iM936 + i;
                    case 13:
                        if (obj2 instanceof InterfaceC3120) {
                            iM938 = AbstractC0438.m934(((InterfaceC3120) obj2).mo1880());
                        } else {
                            iM938 = AbstractC0438.m934(((Integer) obj2).intValue());
                        }
                        return iM938 + iM936 + i;
                    case 14:
                        ((Integer) obj2).getClass();
                        iM938 = 4;
                        return iM938 + iM936 + i;
                    case 15:
                        ((Long) obj2).getClass();
                        return iM938 + iM936 + i;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iM938 = AbstractC0438.m935((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                        return iM938 + iM936 + i;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iM938 = AbstractC0438.m934((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                        return iM938 + iM936 + i;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6312(AbstractC0438 abstractC0438, C5460 c5460, Object obj, Object obj2) {
        C1838.m3612(abstractC0438, (EnumC4646) c5460.f18001, 1, obj);
        C1838.m3612(abstractC0438, (EnumC4646) c5460.f17999, 2, obj2);
    }
}
