package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥِۖؔ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2063 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2063 f6789;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC2063[] f6790;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2063 f6791;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2063 f6792;

    static {
        EnumC2063 enumC2063 = new EnumC2063("NETWORK_UNMETERED", 0);
        f6792 = enumC2063;
        EnumC2063 enumC2064 = new EnumC2063("DEVICE_IDLE", 1);
        f6791 = enumC2064;
        EnumC2063 enumC2065 = new EnumC2063("DEVICE_CHARGING", 2);
        f6789 = enumC2065;
        f6790 = new EnumC2063[]{enumC2063, enumC2064, enumC2065};
    }

    public static EnumC2063 valueOf(String str) {
        return (EnumC2063) Enum.valueOf(EnumC2063.class, str);
    }

    public static EnumC2063[] values() {
        return (EnumC2063[]) f6790.clone();
    }
}
