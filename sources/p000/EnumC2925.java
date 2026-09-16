package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥۨؕ۠ؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2925 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2925 f9837;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC2925[] f9838;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2925 f9839;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2925 f9840;

    static {
        EnumC2925 enumC2925 = new EnumC2925("Cursor", 0);
        f9840 = enumC2925;
        EnumC2925 enumC2926 = new EnumC2925("SelectionStart", 1);
        f9839 = enumC2926;
        EnumC2925 enumC2927 = new EnumC2925("SelectionEnd", 2);
        f9837 = enumC2927;
        f9838 = new EnumC2925[]{enumC2925, enumC2926, enumC2927};
    }

    public static EnumC2925 valueOf(String str) {
        return (EnumC2925) Enum.valueOf(EnumC2925.class, str);
    }

    public static EnumC2925[] values() {
        return (EnumC2925[]) f9838.clone();
    }
}
