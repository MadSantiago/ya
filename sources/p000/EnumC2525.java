package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥْ۠ؗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2525 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC2525[] f8361;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2525 f8362;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2525 f8363;

    static {
        EnumC2525 enumC2525 = new EnumC2525("OnErrorDiscard", 0);
        f8363 = enumC2525;
        EnumC2525 enumC2526 = new EnumC2525("OnErrorRecover", 1);
        f8362 = enumC2526;
        f8361 = new EnumC2525[]{enumC2525, enumC2526};
    }

    public static EnumC2525 valueOf(String str) {
        return (EnumC2525) Enum.valueOf(EnumC2525.class, str);
    }

    public static EnumC2525[] values() {
        return (EnumC2525[]) f8361.clone();
    }
}
