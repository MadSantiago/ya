package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؘؘۧؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2887 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2887 f9629;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC2887[] f9630;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2887 f9631;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2887 f9632;

    static {
        EnumC2887 enumC2887 = new EnumC2887("On", 0);
        f9632 = enumC2887;
        EnumC2887 enumC2888 = new EnumC2887("Off", 1);
        f9631 = enumC2888;
        EnumC2887 enumC2889 = new EnumC2887("Indeterminate", 2);
        f9629 = enumC2889;
        f9630 = new EnumC2887[]{enumC2887, enumC2888, enumC2889};
    }

    public static EnumC2887 valueOf(String str) {
        return (EnumC2887) Enum.valueOf(EnumC2887.class, str);
    }

    public static EnumC2887[] values() {
        return (EnumC2887[]) f9630.clone();
    }
}
