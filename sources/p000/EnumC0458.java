package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؕؓۢٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0458 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC0458 f1652;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0458 f1653;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC0458 f1654;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ EnumC0458[] f1655;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0458 f1656;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0458 f1657;

    static {
        EnumC0458 enumC0458 = new EnumC0458("DESTROYED", 0);
        f1657 = enumC0458;
        EnumC0458 enumC0459 = new EnumC0458("INITIALIZED", 1);
        f1656 = enumC0459;
        EnumC0458 enumC04510 = new EnumC0458("CREATED", 2);
        f1653 = enumC04510;
        EnumC0458 enumC04511 = new EnumC0458("STARTED", 3);
        f1654 = enumC04511;
        EnumC0458 enumC04512 = new EnumC0458("RESUMED", 4);
        f1652 = enumC04512;
        f1655 = new EnumC0458[]{enumC0458, enumC0459, enumC04510, enumC04511, enumC04512};
    }

    public static EnumC0458 valueOf(String str) {
        return (EnumC0458) Enum.valueOf(EnumC0458.class, str);
    }

    public static EnumC0458[] values() {
        return (EnumC0458[]) f1655.clone();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m976(EnumC0458 enumC0458) {
        return compareTo(enumC0458) >= 0;
    }
}
