package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥۙؔۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2221 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC2221[] f7356;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2221 f7357;

    static {
        EnumC2221 enumC2221 = new EnumC2221("DEFAULT", 0);
        f7357 = enumC2221;
        f7356 = new EnumC2221[]{enumC2221, new EnumC2221("SIGNED", 1), new EnumC2221("FIXED", 2)};
    }

    public static EnumC2221 valueOf(String str) {
        return (EnumC2221) Enum.valueOf(EnumC2221.class, str);
    }

    public static EnumC2221[] values() {
        return (EnumC2221[]) f7356.clone();
    }
}
