package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٗؗٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4386 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4386 f14452;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC4386[] f14453;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4386 f14454;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4386 f14455;

    static {
        EnumC4386 enumC4386 = new EnumC4386("Default", 0);
        f14455 = enumC4386;
        EnumC4386 enumC4387 = new EnumC4386("UserInput", 1);
        f14454 = enumC4387;
        EnumC4386 enumC4388 = new EnumC4386("PreventUserInput", 2);
        f14452 = enumC4388;
        f14453 = new EnumC4386[]{enumC4386, enumC4387, enumC4388};
    }

    public static EnumC4386 valueOf(String str) {
        return (EnumC4386) Enum.valueOf(EnumC4386.class, str);
    }

    public static EnumC4386[] values() {
        return (EnumC4386[]) f14453.clone();
    }
}
