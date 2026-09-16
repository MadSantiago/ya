package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥً۟ؕۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2459 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC2459[] f8213;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2459 f8214;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2459 f8215;

    static {
        EnumC2459 enumC2459 = new EnumC2459("Ltr", 0);
        f8215 = enumC2459;
        EnumC2459 enumC24510 = new EnumC2459("Rtl", 1);
        f8214 = enumC24510;
        f8213 = new EnumC2459[]{enumC2459, enumC24510};
    }

    public static EnumC2459 valueOf(String str) {
        return (EnumC2459) Enum.valueOf(EnumC2459.class, str);
    }

    public static EnumC2459[] values() {
        return (EnumC2459[]) f8213.clone();
    }
}
