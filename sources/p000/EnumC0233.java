package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ۥًٖؒؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0233 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ EnumC0233[] f875;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0233 f876;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC0233[] f877;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0233 f878;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f879;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0233 EF0;

    static {
        EnumC2065 enumC2065 = EnumC2065.DOUBLE;
        EnumC0233 enumC0233 = new EnumC0233("DOUBLE", 0, 0, 1, enumC2065);
        EnumC2065 enumC2066 = EnumC2065.FLOAT;
        EnumC0233 enumC0234 = new EnumC0233("FLOAT", 1, 1, 1, enumC2066);
        EnumC2065 enumC2067 = EnumC2065.LONG;
        EnumC0233 enumC0235 = new EnumC0233("INT64", 2, 2, 1, enumC2067);
        EnumC0233 enumC0236 = new EnumC0233("UINT64", 3, 3, 1, enumC2067);
        EnumC2065 enumC2068 = EnumC2065.INT;
        EnumC0233 enumC0237 = new EnumC0233("INT32", 4, 4, 1, enumC2068);
        EnumC0233 enumC0238 = new EnumC0233("FIXED64", 5, 5, 1, enumC2067);
        EnumC0233 enumC0239 = new EnumC0233("FIXED32", 6, 6, 1, enumC2068);
        EnumC2065 enumC2069 = EnumC2065.BOOLEAN;
        EnumC0233 enumC02310 = new EnumC0233("BOOL", 7, 7, 1, enumC2069);
        EnumC2065 enumC20610 = EnumC2065.STRING;
        EnumC0233 enumC02311 = new EnumC0233("STRING", 8, 8, 1, enumC20610);
        EnumC2065 enumC20611 = EnumC2065.MESSAGE;
        EnumC0233 enumC02312 = new EnumC0233("MESSAGE", 9, 9, 1, enumC20611);
        EnumC2065 enumC20612 = EnumC2065.BYTE_STRING;
        EnumC0233 enumC02313 = new EnumC0233("BYTES", 10, 10, 1, enumC20612);
        EnumC0233 enumC02314 = new EnumC0233("UINT32", 11, 11, 1, enumC2068);
        EnumC2065 enumC20613 = EnumC2065.ENUM;
        EnumC0233 enumC02315 = new EnumC0233("ENUM", 12, 12, 1, enumC20613);
        EnumC0233 enumC02316 = new EnumC0233("SFIXED32", 13, 13, 1, enumC2068);
        EnumC0233 enumC02317 = new EnumC0233("SFIXED64", 14, 14, 1, enumC2067);
        EnumC0233 enumC02318 = new EnumC0233("SINT32", 15, 15, 1, enumC2068);
        EnumC0233 enumC02319 = new EnumC0233("SINT64", 16, 16, 1, enumC2067);
        EnumC0233 enumC02320 = new EnumC0233("GROUP", 17, 17, 1, enumC20611);
        EnumC0233 enumC02321 = new EnumC0233("DOUBLE_LIST", 18, 18, 2, enumC2065);
        EnumC0233 enumC02322 = new EnumC0233("FLOAT_LIST", 19, 19, 2, enumC2066);
        EnumC0233 enumC02323 = new EnumC0233("INT64_LIST", 20, 20, 2, enumC2067);
        EnumC0233 enumC02324 = new EnumC0233("UINT64_LIST", 21, 21, 2, enumC2067);
        EnumC0233 enumC02325 = new EnumC0233("INT32_LIST", 22, 22, 2, enumC2068);
        EnumC0233 enumC02326 = new EnumC0233("FIXED64_LIST", 23, 23, 2, enumC2067);
        EnumC0233 enumC02327 = new EnumC0233("FIXED32_LIST", 24, 24, 2, enumC2068);
        EnumC0233 enumC02328 = new EnumC0233("BOOL_LIST", 25, 25, 2, enumC2069);
        EnumC0233 enumC02329 = new EnumC0233("STRING_LIST", 26, 26, 2, enumC20610);
        EnumC0233 enumC02330 = new EnumC0233("MESSAGE_LIST", 27, 27, 2, enumC20611);
        EnumC0233 enumC02331 = new EnumC0233("BYTES_LIST", 28, 28, 2, enumC20612);
        EnumC0233 enumC02332 = new EnumC0233("UINT32_LIST", 29, 29, 2, enumC2068);
        EnumC0233 enumC02333 = new EnumC0233("ENUM_LIST", 30, 30, 2, enumC20613);
        EnumC0233 enumC02334 = new EnumC0233("SFIXED32_LIST", 31, 31, 2, enumC2068);
        EnumC0233 enumC02335 = new EnumC0233("SFIXED64_LIST", 32, 32, 2, enumC2067);
        EnumC0233 enumC02336 = new EnumC0233("SINT32_LIST", 33, 33, 2, enumC2068);
        EnumC0233 enumC02337 = new EnumC0233("SINT64_LIST", 34, 34, 2, enumC2067);
        EnumC0233 enumC02338 = new EnumC0233("DOUBLE_LIST_PACKED", 35, 35, 3, enumC2065);
        f878 = enumC02338;
        EnumC0233 enumC02339 = new EnumC0233("FLOAT_LIST_PACKED", 36, 36, 3, enumC2066);
        EnumC0233 enumC02340 = new EnumC0233("INT64_LIST_PACKED", 37, 37, 3, enumC2067);
        EnumC0233 enumC02341 = new EnumC0233("UINT64_LIST_PACKED", 38, 38, 3, enumC2067);
        EnumC0233 enumC02342 = new EnumC0233("INT32_LIST_PACKED", 39, 39, 3, enumC2068);
        EnumC0233 enumC02343 = new EnumC0233("FIXED64_LIST_PACKED", 40, 40, 3, enumC2067);
        EnumC0233 enumC02344 = new EnumC0233("FIXED32_LIST_PACKED", 41, 41, 3, enumC2068);
        EnumC0233 enumC02345 = new EnumC0233("BOOL_LIST_PACKED", 42, 42, 3, enumC2069);
        EnumC0233 enumC02346 = new EnumC0233("UINT32_LIST_PACKED", 43, 43, 3, enumC2068);
        EnumC0233 enumC02347 = new EnumC0233("ENUM_LIST_PACKED", 44, 44, 3, enumC20613);
        EnumC0233 enumC02348 = new EnumC0233("SFIXED32_LIST_PACKED", 45, 45, 3, enumC2068);
        EnumC0233 enumC02349 = new EnumC0233("SFIXED64_LIST_PACKED", 46, 46, 3, enumC2067);
        EnumC0233 enumC02350 = new EnumC0233("SINT32_LIST_PACKED", 47, 47, 3, enumC2068);
        EnumC0233 enumC02351 = new EnumC0233("SINT64_LIST_PACKED", 48, 48, 3, enumC2067);
        f876 = enumC02351;
        f875 = new EnumC0233[]{enumC0233, enumC0234, enumC0235, enumC0236, enumC0237, enumC0238, enumC0239, enumC02310, enumC02311, enumC02312, enumC02313, enumC02314, enumC02315, enumC02316, enumC02317, enumC02318, enumC02319, enumC02320, enumC02321, enumC02322, enumC02323, enumC02324, enumC02325, enumC02326, enumC02327, enumC02328, enumC02329, enumC02330, enumC02331, enumC02332, enumC02333, enumC02334, enumC02335, enumC02336, enumC02337, enumC02338, enumC02339, enumC02340, enumC02341, enumC02342, enumC02343, enumC02344, enumC02345, enumC02346, enumC02347, enumC02348, enumC02349, enumC02350, enumC02351, new EnumC0233("GROUP_LIST", 49, 49, 2, enumC20611), new EnumC0233("MAP", 50, 50, 4, EnumC2065.VOID)};
        EnumC0233[] enumC0233ArrValues = values();
        f877 = new EnumC0233[enumC0233ArrValues.length];
        for (EnumC0233 enumC02352 : enumC0233ArrValues) {
            f877[enumC02352.f879] = enumC02352;
        }
    }

    public EnumC0233(String str, int i, int i2, int i3, EnumC2065 enumC2065) {
        super(str, i);
        this.f879 = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            Class cls = enumC2065.f6804;
        }
        if (i3 == 1) {
            EnumC2065 enumC2066 = EnumC2065.VOID;
            enumC2065.ordinal();
        }
    }

    public static EnumC0233[] values() {
        return (EnumC0233[]) f875.clone();
    }
}
