package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦۗؖؕۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4972 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC4972 f16449;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4972 f16450;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC4972 f16451;

    /* JADX INFO: renamed from: ۥٖ */
    public static final EnumC4972 f16452;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ EnumC4972[] f16453;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4972 f16454;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4972 f16455;

    static {
        EnumC4972 enumC4972 = new EnumC4972("ENQUEUED", 0);
        f16455 = enumC4972;
        EnumC4972 enumC4973 = new EnumC4972("RUNNING", 1);
        f16454 = enumC4973;
        EnumC4972 enumC4974 = new EnumC4972("SUCCEEDED", 2);
        f16450 = enumC4974;
        EnumC4972 enumC4975 = new EnumC4972("FAILED", 3);
        f16451 = enumC4975;
        EnumC4972 enumC4976 = new EnumC4972("BLOCKED", 4);
        f16449 = enumC4976;
        EnumC4972 enumC4977 = new EnumC4972("CANCELLED", 5);
        f16452 = enumC4977;
        f16453 = new EnumC4972[]{enumC4972, enumC4973, enumC4974, enumC4975, enumC4976, enumC4977};
    }

    public static EnumC4972 valueOf(String str) {
        return (EnumC4972) Enum.valueOf(EnumC4972.class, str);
    }

    public static EnumC4972[] values() {
        return (EnumC4972[]) f16453.clone();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m8357() {
        return this == f16450 || this == f16451 || this == f16452;
    }
}
