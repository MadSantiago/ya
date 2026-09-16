package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥۚؒٞؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2261 {

    /* JADX INFO: renamed from: ۥَ */
    public static final /* synthetic */ EnumC2261[] f7512;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2261 f7513;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC2261 f7514;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2261 f7515;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2261 f7516;

    static {
        EnumC2261 enumC2261 = new EnumC2261("StartInput", 0);
        f7516 = enumC2261;
        EnumC2261 enumC2262 = new EnumC2261("StopInput", 1);
        f7515 = enumC2262;
        EnumC2261 enumC2263 = new EnumC2261("ShowKeyboard", 2);
        f7513 = enumC2263;
        EnumC2261 enumC2264 = new EnumC2261("HideKeyboard", 3);
        f7514 = enumC2264;
        f7512 = new EnumC2261[]{enumC2261, enumC2262, enumC2263, enumC2264};
    }

    public static EnumC2261 valueOf(String str) {
        return (EnumC2261) Enum.valueOf(EnumC2261.class, str);
    }

    public static EnumC2261[] values() {
        return (EnumC2261[]) f7512.clone();
    }
}
