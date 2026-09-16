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
/* JADX INFO: renamed from: ۦؐؒٚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2970 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ EnumC2970[] f9953;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2970 f9954;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC2970[] f9955;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2970 f9956;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f9957;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2970 EF0;

    static {
        EnumC5082 enumC5082 = EnumC5082.DOUBLE;
        EnumC2970 enumC2970 = new EnumC2970("DOUBLE", 0, 0, 1, enumC5082);
        EnumC5082 enumC5083 = EnumC5082.FLOAT;
        EnumC2970 enumC2971 = new EnumC2970("FLOAT", 1, 1, 1, enumC5083);
        EnumC5082 enumC5084 = EnumC5082.LONG;
        EnumC2970 enumC2972 = new EnumC2970("INT64", 2, 2, 1, enumC5084);
        EnumC2970 enumC2973 = new EnumC2970("UINT64", 3, 3, 1, enumC5084);
        EnumC5082 enumC5085 = EnumC5082.INT;
        EnumC2970 enumC2974 = new EnumC2970("INT32", 4, 4, 1, enumC5085);
        EnumC2970 enumC2975 = new EnumC2970("FIXED64", 5, 5, 1, enumC5084);
        EnumC2970 enumC2976 = new EnumC2970("FIXED32", 6, 6, 1, enumC5085);
        EnumC5082 enumC5086 = EnumC5082.BOOLEAN;
        EnumC2970 enumC2977 = new EnumC2970("BOOL", 7, 7, 1, enumC5086);
        EnumC5082 enumC5087 = EnumC5082.STRING;
        EnumC2970 enumC2978 = new EnumC2970("STRING", 8, 8, 1, enumC5087);
        EnumC5082 enumC5088 = EnumC5082.MESSAGE;
        EnumC2970 enumC2979 = new EnumC2970("MESSAGE", 9, 9, 1, enumC5088);
        EnumC5082 enumC5089 = EnumC5082.BYTE_STRING;
        EnumC2970 enumC29710 = new EnumC2970("BYTES", 10, 10, 1, enumC5089);
        EnumC2970 enumC29711 = new EnumC2970("UINT32", 11, 11, 1, enumC5085);
        EnumC5082 enumC50810 = EnumC5082.ENUM;
        EnumC2970 enumC29712 = new EnumC2970("ENUM", 12, 12, 1, enumC50810);
        EnumC2970 enumC29713 = new EnumC2970("SFIXED32", 13, 13, 1, enumC5085);
        EnumC2970 enumC29714 = new EnumC2970("SFIXED64", 14, 14, 1, enumC5084);
        EnumC2970 enumC29715 = new EnumC2970("SINT32", 15, 15, 1, enumC5085);
        EnumC2970 enumC29716 = new EnumC2970("SINT64", 16, 16, 1, enumC5084);
        EnumC2970 enumC29717 = new EnumC2970("GROUP", 17, 17, 1, enumC5088);
        EnumC2970 enumC29718 = new EnumC2970("DOUBLE_LIST", 18, 18, 2, enumC5082);
        EnumC2970 enumC29719 = new EnumC2970("FLOAT_LIST", 19, 19, 2, enumC5083);
        EnumC2970 enumC29720 = new EnumC2970("INT64_LIST", 20, 20, 2, enumC5084);
        EnumC2970 enumC29721 = new EnumC2970("UINT64_LIST", 21, 21, 2, enumC5084);
        EnumC2970 enumC29722 = new EnumC2970("INT32_LIST", 22, 22, 2, enumC5085);
        EnumC2970 enumC29723 = new EnumC2970("FIXED64_LIST", 23, 23, 2, enumC5084);
        EnumC2970 enumC29724 = new EnumC2970("FIXED32_LIST", 24, 24, 2, enumC5085);
        EnumC2970 enumC29725 = new EnumC2970("BOOL_LIST", 25, 25, 2, enumC5086);
        EnumC2970 enumC29726 = new EnumC2970("STRING_LIST", 26, 26, 2, enumC5087);
        EnumC2970 enumC29727 = new EnumC2970("MESSAGE_LIST", 27, 27, 2, enumC5088);
        EnumC2970 enumC29728 = new EnumC2970("BYTES_LIST", 28, 28, 2, enumC5089);
        EnumC2970 enumC29729 = new EnumC2970("UINT32_LIST", 29, 29, 2, enumC5085);
        EnumC2970 enumC29730 = new EnumC2970("ENUM_LIST", 30, 30, 2, enumC50810);
        EnumC2970 enumC29731 = new EnumC2970("SFIXED32_LIST", 31, 31, 2, enumC5085);
        EnumC2970 enumC29732 = new EnumC2970("SFIXED64_LIST", 32, 32, 2, enumC5084);
        EnumC2970 enumC29733 = new EnumC2970("SINT32_LIST", 33, 33, 2, enumC5085);
        EnumC2970 enumC29734 = new EnumC2970("SINT64_LIST", 34, 34, 2, enumC5084);
        EnumC2970 enumC29735 = new EnumC2970("DOUBLE_LIST_PACKED", 35, 35, 3, enumC5082);
        f9956 = enumC29735;
        EnumC2970 enumC29736 = new EnumC2970("FLOAT_LIST_PACKED", 36, 36, 3, enumC5083);
        EnumC2970 enumC29737 = new EnumC2970("INT64_LIST_PACKED", 37, 37, 3, enumC5084);
        EnumC2970 enumC29738 = new EnumC2970("UINT64_LIST_PACKED", 38, 38, 3, enumC5084);
        EnumC2970 enumC29739 = new EnumC2970("INT32_LIST_PACKED", 39, 39, 3, enumC5085);
        EnumC2970 enumC29740 = new EnumC2970("FIXED64_LIST_PACKED", 40, 40, 3, enumC5084);
        EnumC2970 enumC29741 = new EnumC2970("FIXED32_LIST_PACKED", 41, 41, 3, enumC5085);
        EnumC2970 enumC29742 = new EnumC2970("BOOL_LIST_PACKED", 42, 42, 3, enumC5086);
        EnumC2970 enumC29743 = new EnumC2970("UINT32_LIST_PACKED", 43, 43, 3, enumC5085);
        EnumC2970 enumC29744 = new EnumC2970("ENUM_LIST_PACKED", 44, 44, 3, enumC50810);
        EnumC2970 enumC29745 = new EnumC2970("SFIXED32_LIST_PACKED", 45, 45, 3, enumC5085);
        EnumC2970 enumC29746 = new EnumC2970("SFIXED64_LIST_PACKED", 46, 46, 3, enumC5084);
        EnumC2970 enumC29747 = new EnumC2970("SINT32_LIST_PACKED", 47, 47, 3, enumC5085);
        EnumC2970 enumC29748 = new EnumC2970("SINT64_LIST_PACKED", 48, 48, 3, enumC5084);
        f9954 = enumC29748;
        f9953 = new EnumC2970[]{enumC2970, enumC2971, enumC2972, enumC2973, enumC2974, enumC2975, enumC2976, enumC2977, enumC2978, enumC2979, enumC29710, enumC29711, enumC29712, enumC29713, enumC29714, enumC29715, enumC29716, enumC29717, enumC29718, enumC29719, enumC29720, enumC29721, enumC29722, enumC29723, enumC29724, enumC29725, enumC29726, enumC29727, enumC29728, enumC29729, enumC29730, enumC29731, enumC29732, enumC29733, enumC29734, enumC29735, enumC29736, enumC29737, enumC29738, enumC29739, enumC29740, enumC29741, enumC29742, enumC29743, enumC29744, enumC29745, enumC29746, enumC29747, enumC29748, new EnumC2970("GROUP_LIST", 49, 49, 2, enumC5088), new EnumC2970("MAP", 50, 50, 4, EnumC5082.VOID)};
        EnumC2970[] enumC2970ArrValues = values();
        f9955 = new EnumC2970[enumC2970ArrValues.length];
        for (EnumC2970 enumC29749 : enumC2970ArrValues) {
            f9955[enumC29749.f9957] = enumC29749;
        }
    }

    public EnumC2970(String str, int i, int i2, int i3, EnumC5082 enumC5082) {
        super(str, i);
        this.f9957 = i2;
        int iM6632 = AbstractC3761.m6632(i3);
        if (iM6632 == 1 || iM6632 == 3) {
            Class cls = enumC5082.f16865;
        }
        if (i3 == 1) {
            enumC5082.ordinal();
        }
    }

    public static EnumC2970 valueOf(String str) {
        return (EnumC2970) Enum.valueOf(EnumC2970.class, str);
    }

    public static EnumC2970[] values() {
        return (EnumC2970[]) f9953.clone();
    }
}
