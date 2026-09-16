package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؘ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1616 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC1616[] f5423;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC1616 f5424;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1616 f5425;

    static {
        EnumC1616 enumC1616 = new EnumC1616("Vertical", 0);
        f5425 = enumC1616;
        EnumC1616 enumC1617 = new EnumC1616("Horizontal", 1);
        f5424 = enumC1617;
        f5423 = new EnumC1616[]{enumC1616, enumC1617};
    }

    public static EnumC1616 valueOf(String str) {
        return (EnumC1616) Enum.valueOf(EnumC1616.class, str);
    }

    public static EnumC1616[] values() {
        return (EnumC1616[]) f5423.clone();
    }
}
