package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٌٞؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1924 {
    private static final /* synthetic */ InterfaceC3387 $ENTRIES;
    private static final /* synthetic */ EnumC1924[] $VALUES;
    public static final C1926 Companion;
    public static final EnumC1924 ON_ANY;
    public static final EnumC1924 ON_CREATE;
    public static final EnumC1924 ON_DESTROY;
    public static final EnumC1924 ON_PAUSE;
    public static final EnumC1924 ON_RESUME;
    public static final EnumC1924 ON_START;
    public static final EnumC1924 ON_STOP;

    static {
        EnumC1924 enumC1924 = new EnumC1924("ON_CREATE", 0);
        ON_CREATE = enumC1924;
        EnumC1924 enumC1925 = new EnumC1924("ON_START", 1);
        ON_START = enumC1925;
        EnumC1924 enumC1926 = new EnumC1924("ON_RESUME", 2);
        ON_RESUME = enumC1926;
        EnumC1924 enumC1927 = new EnumC1924("ON_PAUSE", 3);
        ON_PAUSE = enumC1927;
        EnumC1924 enumC1928 = new EnumC1924("ON_STOP", 4);
        ON_STOP = enumC1928;
        EnumC1924 enumC1929 = new EnumC1924("ON_DESTROY", 5);
        ON_DESTROY = enumC1929;
        EnumC1924 enumC19210 = new EnumC1924("ON_ANY", 6);
        ON_ANY = enumC19210;
        EnumC1924[] enumC1924Arr = {enumC1924, enumC1925, enumC1926, enumC1927, enumC1928, enumC1929, enumC19210};
        $VALUES = enumC1924Arr;
        $ENTRIES = new C4681(enumC1924Arr);
        Companion = new C1926();
    }

    public static EnumC1924 valueOf(String str) {
        return (EnumC1924) Enum.valueOf(EnumC1924.class, str);
    }

    public static EnumC1924[] values() {
        return (EnumC1924[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final EnumC0458 m3773() {
        switch (AbstractC5546.f18317[ordinal()]) {
            case 1:
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return EnumC0458.f1653;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return EnumC0458.f1654;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return EnumC0458.f1652;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0458.f1657;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                C1078.m2275();
                return null;
        }
    }
}
