package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٌِ۠ؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2522 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2522 f8356;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC2522[] f8357;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2522 f8358;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2522 f8359;

    static {
        EnumC2522 enumC2522 = new EnumC2522("NO_OP", 0);
        f8359 = enumC2522;
        EnumC2522 enumC2523 = new EnumC2522("ADD", 1);
        f8358 = enumC2523;
        EnumC2522 enumC2524 = new EnumC2522("REMOVE", 2);
        f8356 = enumC2524;
        f8357 = new EnumC2522[]{enumC2522, enumC2523, enumC2524};
    }

    public static EnumC2522 valueOf(String str) {
        return (EnumC2522) Enum.valueOf(EnumC2522.class, str);
    }

    public static EnumC2522[] values() {
        return (EnumC2522[]) f8357.clone();
    }
}
