package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦؚّؔؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4021 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4021 f13409;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC4021[] f13410;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4021 f13411;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4021 f13412;

    static {
        EnumC4021 enumC4021 = new EnumC4021("DEFAULT", 0);
        f13412 = enumC4021;
        EnumC4021 enumC4022 = new EnumC4021("VERY_LOW", 1);
        f13411 = enumC4022;
        EnumC4021 enumC4023 = new EnumC4021("HIGHEST", 2);
        f13409 = enumC4023;
        f13410 = new EnumC4021[]{enumC4021, enumC4022, enumC4023};
    }

    public static EnumC4021 valueOf(String str) {
        return (EnumC4021) Enum.valueOf(EnumC4021.class, str);
    }

    public static EnumC4021[] values() {
        return (EnumC4021[]) f13410.clone();
    }
}
