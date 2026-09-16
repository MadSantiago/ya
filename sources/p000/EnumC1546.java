package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٗؗۖٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1546 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC1546 f5229;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC1546[] f5230;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC1546 f5231;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1546 f5232;

    static {
        EnumC1546 enumC1546 = new EnumC1546("None", 0);
        f5232 = enumC1546;
        EnumC1546 enumC1547 = new EnumC1546("Selection", 1);
        f5231 = enumC1547;
        EnumC1546 enumC1548 = new EnumC1546("Cursor", 2);
        f5229 = enumC1548;
        f5230 = new EnumC1546[]{enumC1546, enumC1547, enumC1548};
    }

    public static EnumC1546 valueOf(String str) {
        return (EnumC1546) Enum.valueOf(EnumC1546.class, str);
    }

    public static EnumC1546[] values() {
        return (EnumC1546[]) f5230.clone();
    }
}
