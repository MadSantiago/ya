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
/* JADX INFO: renamed from: ۦٛؗۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4646 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC4646 f15323;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4646 f15324;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC4646 f15325;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ EnumC4646[] f15326;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f15327;

    /* JADX INFO: renamed from: ۦۨ */
    public final EnumC3135 f15328;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4646 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4646 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4646 EF0;

    static {
        EnumC4646 enumC4646 = new EnumC4646("DOUBLE", 0, EnumC3135.f10556, 1);
        EnumC4646 enumC4647 = new EnumC4646("FLOAT", 1, EnumC3135.f10555, 5);
        EnumC3135 enumC3135 = EnumC3135.f10562;
        EnumC4646 enumC4648 = new EnumC4646("INT64", 2, enumC3135, 0);
        EnumC4646 enumC4649 = new EnumC4646("UINT64", 3, enumC3135, 0);
        EnumC3135 enumC3136 = EnumC3135.f10563;
        EnumC4646 enumC46410 = new EnumC4646("INT32", 4, enumC3136, 0);
        EnumC4646 enumC46411 = new EnumC4646("FIXED64", 5, enumC3135, 1);
        EnumC4646 enumC46412 = new EnumC4646("FIXED32", 6, enumC3136, 5);
        EnumC4646 enumC46413 = new EnumC4646("BOOL", 7, EnumC3135.f10554, 0);
        EnumC4646 enumC46414 = new EnumC4646("STRING", 8, EnumC3135.f10557, 2);
        f15324 = enumC46414;
        EnumC3135 enumC3137 = EnumC3135.f10558;
        EnumC4646 enumC46415 = new EnumC4646("GROUP", 9, enumC3137, 3);
        f15325 = enumC46415;
        EnumC4646 enumC46416 = new EnumC4646("MESSAGE", 10, enumC3137, 2);
        f15323 = enumC46416;
        f15326 = new EnumC4646[]{enumC4646, enumC4647, enumC4648, enumC4649, enumC46410, enumC46411, enumC46412, enumC46413, enumC46414, enumC46415, enumC46416, new EnumC4646("BYTES", 11, EnumC3135.f10560, 2), new EnumC4646("UINT32", 12, enumC3136, 0), new EnumC4646("ENUM", 13, EnumC3135.f10561, 0), new EnumC4646("SFIXED32", 14, enumC3136, 5), new EnumC4646("SFIXED64", 15, enumC3135, 1), new EnumC4646("SINT32", 16, enumC3136, 0), new EnumC4646("SINT64", 17, enumC3135, 0)};
    }

    public EnumC4646(String str, int i, EnumC3135 enumC3135, int i2) {
        super(str, i);
        this.f15328 = enumC3135;
        this.f15327 = i2;
    }

    public static EnumC4646[] values() {
        return (EnumC4646[]) f15326.clone();
    }
}
