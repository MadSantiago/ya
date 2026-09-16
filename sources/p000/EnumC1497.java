package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ۥٖۨۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class EnumC1497 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C2126 f5072;

    /* JADX INFO: renamed from: ۥْ */
    public static final C1645 f5073;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C5329 f5074;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ EnumC1497[] f5075;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f5076;

    /* JADX INFO: renamed from: ۦۨ */
    public final EnumC4392 f5077;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1497 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1497 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1497 EF2;

    static {
        EnumC1497 enumC1497 = new EnumC1497("DOUBLE", 0, EnumC4392.f14471, 1);
        EnumC1497 enumC1498 = new EnumC1497("FLOAT", 1, EnumC4392.f14470, 5);
        EnumC4392 enumC4392 = EnumC4392.f14477;
        EnumC1497 enumC1499 = new EnumC1497("INT64", 2, enumC4392, 0);
        EnumC1497 enumC14910 = new EnumC1497("UINT64", 3, enumC4392, 0);
        EnumC4392 enumC4393 = EnumC4392.f14478;
        EnumC1497 enumC14911 = new EnumC1497("INT32", 4, enumC4393, 0);
        EnumC1497 enumC14912 = new EnumC1497("FIXED64", 5, enumC4392, 1);
        EnumC1497 enumC14913 = new EnumC1497("FIXED32", 6, enumC4393, 5);
        EnumC1497 enumC14914 = new EnumC1497("BOOL", 7, EnumC4392.f14469, 0);
        C1645 c1645 = new C1645("STRING", 8, EnumC4392.f14472, 2);
        f5073 = c1645;
        EnumC4392 enumC4394 = EnumC4392.f14473;
        C5329 c5329 = new C5329("GROUP", 9, enumC4394, 3);
        f5074 = c5329;
        C2126 c2126 = new C2126("MESSAGE", 10, enumC4394, 2);
        f5072 = c2126;
        f5075 = new EnumC1497[]{enumC1497, enumC1498, enumC1499, enumC14910, enumC14911, enumC14912, enumC14913, enumC14914, c1645, c5329, c2126, new C0584("BYTES", 11, EnumC4392.f14475, 2), new EnumC1497("UINT32", 12, enumC4393, 0), new EnumC1497("ENUM", 13, EnumC4392.f14476, 0), new EnumC1497("SFIXED32", 14, enumC4393, 5), new EnumC1497("SFIXED64", 15, enumC4392, 1), new EnumC1497("SINT32", 16, enumC4393, 0), new EnumC1497("SINT64", 17, enumC4392, 0)};
    }

    public EnumC1497(String str, int i, EnumC4392 enumC4392, int i2) {
        super(str, i);
        this.f5077 = enumC4392;
        this.f5076 = i2;
    }

    public static EnumC1497 valueOf(String str) {
        return (EnumC1497) Enum.valueOf(EnumC1497.class, str);
    }

    public static EnumC1497[] values() {
        return (EnumC1497[]) f5075.clone();
    }
}
