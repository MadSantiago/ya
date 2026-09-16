package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؘَؔٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0424 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC0424[] f1534;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0424 f1535;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0424 f1536;

    static {
        EnumC0424 enumC0424 = new EnumC0424("BULLET", 0);
        f1536 = enumC0424;
        EnumC0424 enumC0425 = new EnumC0424("ORDERED", 1);
        f1535 = enumC0425;
        f1534 = new EnumC0424[]{enumC0424, enumC0425};
    }

    public static EnumC0424 valueOf(String str) {
        return (EnumC0424) Enum.valueOf(EnumC0424.class, str);
    }

    public static EnumC0424[] values() {
        return (EnumC0424[]) f1534.clone();
    }
}
