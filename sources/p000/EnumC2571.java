package p000;

/* JADX INFO: renamed from: ۥٍۡؖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2571 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);


    /* JADX INFO: renamed from: ۥٖ */
    public static final EnumC2571[] f8583 = new EnumC2571[26];

    /* JADX INFO: renamed from: ۥْ */
    public final int f8585;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f8586;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f8587;

    /* JADX INFO: renamed from: ۦۨ */
    public final char f8588;

    static {
        for (EnumC2571 enumC2571 : values()) {
            f8583[(enumC2571.f8588 | ' ') - 97] = enumC2571;
        }
    }

    EnumC2571(char c, int i, String str, boolean z) {
        this.f8588 = c;
        this.f8587 = i;
        C0562 c0562 = C0562.f2005;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iCharAt = ((int) ((C0562.f2006 >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                C1078.m2272("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << iCharAt;
        }
        this.f8585 = i2;
        this.f8586 = AbstractC5078.m8678(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}
