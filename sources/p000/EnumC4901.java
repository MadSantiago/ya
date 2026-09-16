package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٖۖؓ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4901 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC4901 f16158;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4901 f16159;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC4901 f16160;

    /* JADX INFO: renamed from: ۥٖ */
    public static final EnumC4901 f16161;

    /* JADX INFO: renamed from: ۦٗ */
    public static final EnumC4901 f16162;

    /* JADX INFO: renamed from: ۦۛ */
    public static final /* synthetic */ EnumC4901[] f16163;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4901 f16164;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4901 f16165;

    static {
        EnumC4901 enumC4901 = new EnumC4901("Invalid", 0);
        f16165 = enumC4901;
        EnumC4901 enumC4902 = new EnumC4901("Cancelled", 1);
        f16164 = enumC4902;
        EnumC4901 enumC4903 = new EnumC4901("InitialPending", 2);
        f16159 = enumC4903;
        EnumC4901 enumC4904 = new EnumC4901("RecomposePending", 3);
        f16160 = enumC4904;
        EnumC4901 enumC4905 = new EnumC4901("Recomposing", 4);
        f16158 = enumC4905;
        EnumC4901 enumC4906 = new EnumC4901("ApplyPending", 5);
        f16161 = enumC4906;
        EnumC4901 enumC4907 = new EnumC4901("Applied", 6);
        f16162 = enumC4907;
        f16163 = new EnumC4901[]{enumC4901, enumC4902, enumC4903, enumC4904, enumC4905, enumC4906, enumC4907};
    }

    public static EnumC4901 valueOf(String str) {
        return (EnumC4901) Enum.valueOf(EnumC4901.class, str);
    }

    public static EnumC4901[] values() {
        return (EnumC4901[]) f16163.clone();
    }
}
