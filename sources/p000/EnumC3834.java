package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦَِؒۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3834 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC3834 f12722;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC3834[] f12723;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC3834 f12724;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC3834 f12725;

    static {
        EnumC3834 enumC3834 = new EnumC3834("Initial", 0);
        f12725 = enumC3834;
        EnumC3834 enumC3835 = new EnumC3834("Main", 1);
        f12724 = enumC3835;
        EnumC3834 enumC3836 = new EnumC3834("Final", 2);
        f12722 = enumC3836;
        f12723 = new EnumC3834[]{enumC3834, enumC3835, enumC3836};
    }

    public static EnumC3834 valueOf(String str) {
        return (EnumC3834) Enum.valueOf(EnumC3834.class, str);
    }

    public static EnumC3834[] values() {
        return (EnumC3834[]) f12723.clone();
    }
}
