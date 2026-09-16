package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥَؖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0566 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC0566 f2034;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0566 f2035;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC0566 f2036;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ EnumC0566[] f2037;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0566 f2038;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0566 f2039;

    static {
        EnumC0566 enumC0566 = new EnumC0566("LevelDebug", 0);
        f2039 = enumC0566;
        EnumC0566 enumC0567 = new EnumC0566("LevelInfo", 1);
        f2038 = enumC0567;
        EnumC0566 enumC0568 = new EnumC0566("LevelWarning", 2);
        f2035 = enumC0568;
        EnumC0566 enumC0569 = new EnumC0566("LevelError", 3);
        f2036 = enumC0569;
        EnumC0566 enumC05610 = new EnumC0566("LevelNone", 4);
        f2034 = enumC05610;
        f2037 = new EnumC0566[]{enumC0566, enumC0567, enumC0568, enumC0569, enumC05610};
    }

    public static EnumC0566 valueOf(String str) {
        return (EnumC0566) Enum.valueOf(EnumC0566.class, str);
    }

    public static EnumC0566[] values() {
        return (EnumC0566[]) f2037.clone();
    }
}
