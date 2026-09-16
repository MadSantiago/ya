package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٗؑؔۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1499 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC1499[] f5083;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC1499 f5084;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC1499 f5085;

    static {
        EnumC1499 enumC1499 = new EnumC1499("CRASHLYTICS", 0);
        f5085 = enumC1499;
        EnumC1499 enumC14910 = new EnumC1499("PERFORMANCE", 1);
        f5084 = enumC14910;
        f5083 = new EnumC1499[]{enumC1499, enumC14910, new EnumC1499("MATT_SAYS_HI", 2)};
    }

    public static EnumC1499 valueOf(String str) {
        return (EnumC1499) Enum.valueOf(EnumC1499.class, str);
    }

    public static EnumC1499[] values() {
        return (EnumC1499[]) f5083.clone();
    }
}
