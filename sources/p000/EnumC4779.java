package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٕٞؑؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4779 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC4779[] f15763;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4779 f15764;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4779 f15765;

    static {
        EnumC4779 enumC4779 = new EnumC4779("GENERAL", 0);
        f15765 = enumC4779;
        EnumC4779 enumC47710 = new EnumC4779("FALLBACK", 1);
        f15764 = enumC47710;
        f15763 = new EnumC4779[]{enumC4779, enumC47710};
    }

    public static EnumC4779 valueOf(String str) {
        return (EnumC4779) Enum.valueOf(EnumC4779.class, str);
    }

    public static EnumC4779[] values() {
        return (EnumC4779[]) f15763.clone();
    }
}
