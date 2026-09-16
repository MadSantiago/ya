package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٜؑۖٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1806 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC1806[] f6011;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC1806 f6012;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1806 f6013;

    static {
        EnumC1806 enumC1806 = new EnumC1806("DEFERRED", 0);
        f6013 = enumC1806;
        EnumC1806 enumC1807 = new EnumC1806("IMMEDIATE", 1);
        f6012 = enumC1807;
        f6011 = new EnumC1806[]{enumC1806, enumC1807, new EnumC1806("EXCLUSIVE", 2)};
    }

    public static EnumC1806 valueOf(String str) {
        return (EnumC1806) Enum.valueOf(EnumC1806.class, str);
    }

    public static EnumC1806[] values() {
        return (EnumC1806[]) f6011.clone();
    }
}
