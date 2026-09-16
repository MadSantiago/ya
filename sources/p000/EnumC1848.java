package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥِٜؗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1848 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC1848 f6130;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC1848[] f6131;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC1848 f6132;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1848 f6133;

    static {
        EnumC1848 enumC1848 = new EnumC1848("ContinueTraversal", 0);
        f6133 = enumC1848;
        EnumC1848 enumC1849 = new EnumC1848("SkipSubtreeAndContinueTraversal", 1);
        f6132 = enumC1849;
        EnumC1848 enumC18410 = new EnumC1848("CancelTraversal", 2);
        f6130 = enumC18410;
        f6131 = new EnumC1848[]{enumC1848, enumC1849, enumC18410};
    }

    public static EnumC1848 valueOf(String str) {
        return (EnumC1848) Enum.valueOf(EnumC1848.class, str);
    }

    public static EnumC1848[] values() {
        return (EnumC1848[]) f6131.clone();
    }
}
