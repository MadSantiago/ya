package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٟؓۧٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4851 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4851 f15967;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC4851[] f15968;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4851 f15969;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4851 f15970;

    static {
        EnumC4851 enumC4851 = new EnumC4851("Focused", 0);
        f15970 = enumC4851;
        EnumC4851 enumC4852 = new EnumC4851("UnfocusedEmpty", 1);
        f15969 = enumC4852;
        EnumC4851 enumC4853 = new EnumC4851("UnfocusedNotEmpty", 2);
        f15967 = enumC4853;
        f15968 = new EnumC4851[]{enumC4851, enumC4852, enumC4853};
    }

    public static EnumC4851 valueOf(String str) {
        return (EnumC4851) Enum.valueOf(EnumC4851.class, str);
    }

    public static EnumC4851[] values() {
        return (EnumC4851[]) f15968.clone();
    }
}
