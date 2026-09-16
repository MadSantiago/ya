package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٜؖؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0523 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC0523 f1853;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0523 f1854;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC0523 f1855;

    /* JADX INFO: renamed from: ۥٖ */
    public static final /* synthetic */ EnumC0523[] f1856;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0523 f1857;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0523 f1858;

    static {
        EnumC0523 enumC0523 = new EnumC0523("TopBar", 0);
        f1858 = enumC0523;
        EnumC0523 enumC0524 = new EnumC0523("MainContent", 1);
        f1857 = enumC0524;
        EnumC0523 enumC0525 = new EnumC0523("Snackbar", 2);
        f1854 = enumC0525;
        EnumC0523 enumC0526 = new EnumC0523("Fab", 3);
        f1855 = enumC0526;
        EnumC0523 enumC0527 = new EnumC0523("BottomBar", 4);
        f1853 = enumC0527;
        f1856 = new EnumC0523[]{enumC0523, enumC0524, enumC0525, enumC0526, enumC0527};
    }

    public static EnumC0523 valueOf(String str) {
        return (EnumC0523) Enum.valueOf(EnumC0523.class, str);
    }

    public static EnumC0523[] values() {
        return (EnumC0523[]) f1856.clone();
    }
}
