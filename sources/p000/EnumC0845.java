package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥًؕۤٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0845 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0845 f3013;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC0845[] f3014;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0845 f3015;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0845 f3016;

    static {
        EnumC0845 enumC0845 = new EnumC0845("Hidden", 0);
        f3016 = enumC0845;
        EnumC0845 enumC0846 = new EnumC0845("Expanded", 1);
        f3015 = enumC0846;
        EnumC0845 enumC0847 = new EnumC0845("PartiallyExpanded", 2);
        f3013 = enumC0847;
        f3014 = new EnumC0845[]{enumC0845, enumC0846, enumC0847};
    }

    public static EnumC0845 valueOf(String str) {
        return (EnumC0845) Enum.valueOf(EnumC0845.class, str);
    }

    public static EnumC0845[] values() {
        return (EnumC0845[]) f3014.clone();
    }
}
