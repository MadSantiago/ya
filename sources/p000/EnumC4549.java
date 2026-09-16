package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦؙٜٚؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4549 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ EnumC4549[] f15025;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4549 f15026;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC4549 f15027;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4549 f15028;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4549 f15029;

    static {
        EnumC4549 enumC4549 = new EnumC4549("Up", 0);
        f15029 = enumC4549;
        EnumC4549 enumC45410 = new EnumC4549("Drag", 1);
        f15028 = enumC45410;
        EnumC4549 enumC45411 = new EnumC4549("Timeout", 2);
        f15026 = enumC45411;
        EnumC4549 enumC45412 = new EnumC4549("Cancel", 3);
        f15027 = enumC45412;
        f15025 = new EnumC4549[]{enumC4549, enumC45410, enumC45411, enumC45412};
    }

    public static EnumC4549 valueOf(String str) {
        return (EnumC4549) Enum.valueOf(EnumC4549.class, str);
    }

    public static EnumC4549[] values() {
        return (EnumC4549[]) f15025.clone();
    }
}
